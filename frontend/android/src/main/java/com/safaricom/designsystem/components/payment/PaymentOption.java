package com.safaricom.designsystem.components.payment;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safaricom.designsystem.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B'\b\u0004\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption;", "Lcom/safaricom/designsystem/components/payment/IPaymentOption;", "Landroid/os/Parcelable;", "displayNameStringResource", "", "iconResource", "type", "", "<init>", "(IILjava/lang/String;)V", "getDisplayNameStringResource", "()I", "getIconResource", "getType", "()Ljava/lang/String;", "MPESA", "BONGA", "AIRTIME", "CREDITLIMIT", "AVAILABLEBALANCE", "UNDEFINED", "Companion", "Lcom/safaricom/designsystem/components/payment/PaymentOption$AIRTIME;", "Lcom/safaricom/designsystem/components/payment/PaymentOption$AVAILABLEBALANCE;", "Lcom/safaricom/designsystem/components/payment/PaymentOption$BONGA;", "Lcom/safaricom/designsystem/components/payment/PaymentOption$CREDITLIMIT;", "Lcom/safaricom/designsystem/components/payment/PaymentOption$MPESA;", "Lcom/safaricom/designsystem/components/payment/PaymentOption$UNDEFINED;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentOption implements IPaymentOption, Parcelable {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private final int displayNameStringResource;
    private final int iconResource;
    private final String type;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$AIRTIME;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AIRTIME extends PaymentOption {
        public static final int $stable = 0;
        public static final AIRTIME INSTANCE = new AIRTIME();
        public static final Parcelable.Creator<AIRTIME> CREATOR = new Creator();

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return 1113879051;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AIRTIME> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AIRTIME createFromParcel(Parcel parcel) throws Throwable {
                Intrinsics.checkNotNullParameter(parcel, "");
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (19696 - (Process.myTid() >> 22)), 518907119, false, "component3", null);
                }
                int i = ((Field) objCopydefault).getInt(null);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - Color.alpha(0), 30 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 55511118, false, "component2", null);
                }
                int i2 = ((Field) objCopydefault2).getInt(null);
                long j = i2;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 37, 30 - View.MeasureSpec.getMode(0), (char) (ImageFormat.getBitsPerPixel(0) + 1), 58536393, false, "component3", null);
                }
                int i3 = ((Field) objCopydefault3).getInt(null);
                long j2 = 253;
                long j3 = (j2 * 56358581157853259L) + (j2 * 736344872486351165L);
                long j4 = -252;
                long j5 = -1;
                long j6 = j5 ^ 736344872486351165L;
                long j7 = ((j5 ^ 56358581157853259L) | j6) ^ j5;
                long jIdentityHashCode = System.identityHashCode(this);
                long j8 = j6 | (jIdentityHashCode ^ j5);
                long j9 = (790449727123487103L | jIdentityHashCode) ^ j5;
                long j10 = j3 + ((j7 | (j8 ^ j5) | j9) * j4) + (j4 * 790449727123487103L) + (((long) 252) * (((j8 | 56358581157853259L) ^ j5) | j9));
                int i4 = 0;
                while (true) {
                    for (int i5 = 0; i5 != 8; i5++) {
                        i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                    }
                    if (i4 != 0) {
                        break;
                    }
                    i4++;
                    j = j10;
                }
                if (i3 != i) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 33 - (ViewConfiguration.getTouchSlop() >> 8), (char) (19696 - (ViewConfiguration.getScrollBarSize() >> 8)), 1457147715, false, "copydefault", null);
                    }
                    Object obj = ((Field) objCopydefault4).get(null);
                    long j11 = -1;
                    long j12 = ((long) (i ^ i2)) & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)));
                    long j13 = 0;
                    long j14 = j12 | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
                    try {
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr = {-661040991, Long.valueOf(j14), obj, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getTrimmedLength(""), 56 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getOffsetBefore("", 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
                parcel.readInt();
                return AIRTIME.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AIRTIME[] newArray(int i) {
                return new AIRTIME[i];
            }
        }

        private AIRTIME() {
            super(R.string.one_app_payment_method_airtime, R.drawable.ic_gsm_payment_airtime, "AIRTIME", null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AIRTIME)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "AIRTIME";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    private PaymentOption(int i, int i2, String str) {
        this.displayNameStringResource = i;
        this.iconResource = i2;
        this.type = str;
    }

    @Override
    public int getDisplayNameStringResource() {
        return this.displayNameStringResource;
    }

    @Override
    public int getIconResource() {
        return this.iconResource;
    }

    public PaymentOption(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str, null);
    }

    public final String getType() {
        return this.type;
    }

    public PaymentOption(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$MPESA;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MPESA extends PaymentOption {
        public static final int $stable = 0;
        public static final MPESA INSTANCE = new MPESA();
        public static final Parcelable.Creator<MPESA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MPESA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MPESA createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MPESA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MPESA[] newArray(int i) {
                return new MPESA[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return -1444544284;
        }

        private MPESA() {
            super(R.string.one_app_payment_method_mpesa, R.drawable.ic_mpesa_payment, "MPESA", null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MPESA)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "MPESA";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$BONGA;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BONGA extends PaymentOption {
        public static final int $stable = 0;
        public static final BONGA INSTANCE = new BONGA();
        public static final Parcelable.Creator<BONGA> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BONGA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BONGA createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return BONGA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BONGA[] newArray(int i) {
                return new BONGA[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return -1454724529;
        }

        private BONGA() {
            super(R.string.one_app_payment_method_bonga_display_text, R.drawable.ic_one_app_payment_method_bonga_selected, "BONGA", null);
        }

        public String toString() throws Throwable {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 67, 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19696), 518907119, false, "component3", null);
            }
            int i = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(36 - ImageFormat.getBitsPerPixel(0), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.argb(0, 0, 0, 0), 55511118, false, "component2", null);
            }
            int i2 = ((Field) objCopydefault2).getInt(null);
            long j = i2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 37, 30 - View.MeasureSpec.getMode(0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 58536393, false, "component3", null);
            }
            int i3 = ((Field) objCopydefault3).getInt(null);
            long j2 = -574;
            long j3 = -1;
            long j4 = j3 ^ 2386546818343371488L;
            long jIdentityHashCode = System.identityHashCode(this);
            long j5 = jIdentityHashCode ^ j3;
            long j6 = ((j3 ^ (-1593843364699167064L)) | jIdentityHashCode) ^ j3;
            long j7 = (j2 * 2386546818343371488L) + (j2 * (-1593843364699167064L)) + (((long) 1150) * (((j4 | j5) ^ j3) | j6)) + (((long) (-575)) * (j6 | ((j5 | (-1593843364699167064L)) ^ j3))) + (((long) 575) * ((j3 ^ (j5 | 2386546818343371488L)) | ((j4 | jIdentityHashCode) ^ j3)));
            int i4 = 0;
            while (true) {
                for (int i5 = 0; i5 != 8; i5++) {
                    i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                }
                if (i4 != 0) {
                    break;
                }
                i4++;
                j = j7;
            }
            if (i3 != i) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.alpha(0), 33 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 19697), 1457147715, false, "copydefault", null);
                }
                Object obj = ((Field) objCopydefault4).get(null);
                long j8 = -1;
                long j9 = 0;
                long j10 = (((long) (i ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                try {
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault5 == null) {
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                    Object[] objArr = {1556842318, Long.valueOf(j10), obj, null, false, false};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault6 == null) {
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarSize() >> 8), 56 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getOffsetAfter("", 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
            return "BONGA";
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BONGA)) {
                return false;
            }
            return true;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$CREDITLIMIT;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CREDITLIMIT extends PaymentOption {
        public static final int $stable = 0;
        public static final CREDITLIMIT INSTANCE = new CREDITLIMIT();
        public static final Parcelable.Creator<CREDITLIMIT> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CREDITLIMIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CREDITLIMIT createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return CREDITLIMIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CREDITLIMIT[] newArray(int i) {
                return new CREDITLIMIT[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return 2126466390;
        }

        private CREDITLIMIT() {
            super(R.string.one_app_payment_method_credit_limit, R.drawable.ic_gsm_payment_credit_limit_selected, "CREDITLIMIT", null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CREDITLIMIT)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "CREDITLIMIT";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$AVAILABLEBALANCE;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AVAILABLEBALANCE extends PaymentOption {
        public static final int $stable = 0;
        public static final AVAILABLEBALANCE INSTANCE = new AVAILABLEBALANCE();
        public static final Parcelable.Creator<AVAILABLEBALANCE> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AVAILABLEBALANCE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AVAILABLEBALANCE createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AVAILABLEBALANCE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AVAILABLEBALANCE[] newArray(int i) {
                return new AVAILABLEBALANCE[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return 209889119;
        }

        private AVAILABLEBALANCE() {
            super(R.string.one_app_payment_method_available_balance, R.drawable.ic_gsm_payment_available_balance, "AVAILABLEBALANCE", null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AVAILABLEBALANCE)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "AVAILABLEBALANCE";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$UNDEFINED;", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UNDEFINED extends PaymentOption {
        public static final int $stable = 0;
        public static final UNDEFINED INSTANCE = new UNDEFINED();
        public static final Parcelable.Creator<UNDEFINED> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UNDEFINED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final UNDEFINED createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return UNDEFINED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final UNDEFINED[] newArray(int i) {
                return new UNDEFINED[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public int hashCode() {
            return -646788284;
        }

        private UNDEFINED() {
            super(0, 0, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UNDEFINED)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "UNDEFINED";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/components/payment/PaymentOption$Companion;", "", "<init>", "()V", "from", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "value", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PaymentOption from(String value) {
            Intrinsics.checkNotNullParameter(value, "");
            return Intrinsics.areEqual(value, MPESA.INSTANCE.getType()) ? MPESA.INSTANCE : Intrinsics.areEqual(value, BONGA.INSTANCE.getType()) ? BONGA.INSTANCE : Intrinsics.areEqual(value, AIRTIME.INSTANCE.getType()) ? AIRTIME.INSTANCE : Intrinsics.areEqual(value, CREDITLIMIT.INSTANCE.getType()) ? CREDITLIMIT.INSTANCE : UNDEFINED.INSTANCE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
