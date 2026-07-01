package com.huawei.digitalpayment.consumer.sfcui.profile.esim.util;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataOperationTypes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "Landroid/os/Parcelable;", "<init>", "()V", "Dashboard", "Onboarding", "AboutActivation", "GetPhoneNumber", "EmailAddress", ReferenceDataOperationTypes.CONFIRMATION, "OtpValidation", "PinValidation", "Completion", "Error", "Close", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$AboutActivation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Completion;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$EmailAddress;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$GetPhoneNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Onboarding;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$OtpValidation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$PinValidation;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ESimScreen implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 61 % 128;

    private ESimScreen() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dashboard extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final Dashboard INSTANCE = new Dashboard();
        public static final Parcelable.Creator<Dashboard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Dashboard> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Dashboard dashboard = Dashboard.INSTANCE;
                if (i3 != 0) {
                    int i4 = 82 / 0;
                }
                int i5 = copydefault + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return dashboard;
            }

            @Override
            public Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Dashboard dashboardCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 39;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return dashboardCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 65;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Dashboard[] dashboardArr = new Dashboard[i];
                int i6 = i3 + 125;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return dashboardArr;
            }

            @Override
            public Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 9;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Dashboard[] dashboardArrNewArray = newArray(i);
                int i5 = copydefault + 57;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return dashboardArrNewArray;
            }
        }

        private Dashboard() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 105;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Dashboard))) {
                return true;
            }
            int i2 = component1;
            int i3 = i2 + 75;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 1217462133;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return "Dashboard";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 31;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i = 61 % 2;
    }

    public ESimScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Onboarding;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Onboarding extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final Onboarding INSTANCE = new Onboarding();
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            private static int ShareDataUIState = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Onboarding createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 125;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Onboarding onboarding = Onboarding.INSTANCE;
                if (i3 != 0) {
                    return onboarding;
                }
                throw null;
            }

            @Override
            public Onboarding createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Onboarding onboardingCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 19;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return onboardingCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Onboarding[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 39;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                Onboarding[] onboardingArr = new Onboarding[i];
                int i6 = i4 + 99;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return onboardingArr;
            }

            @Override
            public Onboarding[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Onboarding[] onboardingArrNewArray = newArray(i);
                int i5 = component3 + 41;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 37 / 0;
                }
                return onboardingArrNewArray;
            }
        }

        private Onboarding() {
            super(null);
        }

        static {
            int i = component1 + 5;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 25;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this != other) {
                if (!(other instanceof Onboarding)) {
                    return false;
                }
                return true;
            }
            int i5 = i2 + 41;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 45;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 121;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 1526644058;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 41;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 1;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return "Onboarding";
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$AboutActivation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AboutActivation extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;
        public static final AboutActivation INSTANCE = new AboutActivation();
        public static final Parcelable.Creator<AboutActivation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AboutActivation> {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AboutActivation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 115;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                AboutActivation aboutActivation = AboutActivation.INSTANCE;
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = component1 + 79;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return aboutActivation;
            }

            @Override
            public AboutActivation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AboutActivation aboutActivationCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 103;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 56 / 0;
                }
                return aboutActivationCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AboutActivation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                component1 = i3 % 128;
                AboutActivation[] aboutActivationArr = new AboutActivation[i];
                if (i3 % 2 != 0) {
                    int i4 = 5 / 0;
                }
                return aboutActivationArr;
            }

            @Override
            public AboutActivation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                AboutActivation[] aboutActivationArrNewArray = newArray(i);
                int i5 = component2 + 39;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return aboutActivationArrNewArray;
            }
        }

        private AboutActivation() {
            super(null);
        }

        static {
            int i = copydefault + 51;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 75;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 59;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 103;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof AboutActivation))) {
                return true;
            }
            int i5 = i2 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i2 + 73;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 95;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return -5677916;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 89;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return "AboutActivation";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 29;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$GetPhoneNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GetPhoneNumber extends ESimScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final GetPhoneNumber INSTANCE = new GetPhoneNumber();
        public static final Parcelable.Creator<GetPhoneNumber> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GetPhoneNumber> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final GetPhoneNumber createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                GetPhoneNumber getPhoneNumber = GetPhoneNumber.INSTANCE;
                int i4 = component2 + 17;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 45 / 0;
                }
                return getPhoneNumber;
            }

            @Override
            public GetPhoneNumber createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                GetPhoneNumber getPhoneNumberCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 23 / 0;
                }
                int i5 = component2 + 1;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return getPhoneNumberCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final GetPhoneNumber[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 113;
                int i4 = i3 % 128;
                component2 = i4;
                GetPhoneNumber[] getPhoneNumberArr = new GetPhoneNumber[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 95;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 82 / 0;
                }
                return getPhoneNumberArr;
            }

            @Override
            public GetPhoneNumber[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    newArray(i);
                    obj.hashCode();
                    throw null;
                }
                GetPhoneNumber[] getPhoneNumberArrNewArray = newArray(i);
                int i4 = copydefault + 101;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return getPhoneNumberArrNewArray;
                }
                throw null;
            }
        }

        private GetPhoneNumber() {
            super(null);
        }

        static {
            int i = copydefault + 93;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 1;
            component2 = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber)) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r6 = r1 + 11;
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component2 = r6 % 128;
            r6 = r6 % 2;
            r1 = r1 + 85;
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component2 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component3
                int r2 = r1 + 121
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component2 = r3
                int r2 = r2 % r0
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L16
                r2 = 31
                int r2 = r2 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber
                r2 = r2 ^ r4
                if (r2 == 0) goto L2d
                int r6 = r1 + 11
                int r2 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component2 = r2
                int r6 = r6 % r0
                int r1 = r1 + 85
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.component2 = r6
                int r1 = r1 % r0
                return r3
            L2d:
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen$GetPhoneNumber r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber) r6
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.GetPhoneNumber.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 542363872;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 23;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return "GetPhoneNumber";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$EmailAddress;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmailAddress extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final EmailAddress INSTANCE = new EmailAddress();
        public static final Parcelable.Creator<EmailAddress> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<EmailAddress> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final EmailAddress createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 49;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                EmailAddress emailAddress = EmailAddress.INSTANCE;
                int i4 = copydefault + 119;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 85 / 0;
                }
                return emailAddress;
            }

            @Override
            public EmailAddress createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 3;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                EmailAddress emailAddressCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 13;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return emailAddressCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final EmailAddress[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                EmailAddress[] emailAddressArr = new EmailAddress[i];
                int i6 = i4 + 103;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return emailAddressArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public EmailAddress[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                EmailAddress[] emailAddressArrNewArray = newArray(i);
                int i5 = copydefault + 111;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return emailAddressArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private EmailAddress() {
            super(null);
        }

        static {
            int i = component3 + 39;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 105;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (other instanceof EmailAddress) {
                    return true;
                }
                int i2 = component1 + 45;
                ShareDataUIState = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = ShareDataUIState + 29;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return -1662872521;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 121;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return "EmailAddress";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Confirmation extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;
        public static final Confirmation INSTANCE = new Confirmation();
        public static final Parcelable.Creator<Confirmation> CREATOR = new Creator();

        private Confirmation() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 69;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 87;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 25;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Confirmation) {
                return true;
            }
            int i4 = copydefault + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 117;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 27;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return 1507213236;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return ReferenceDataOperationTypes.CONFIRMATION;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 13;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Confirmation> {
            private static final byte[] $$c = {86, 117, -27, 75};
            private static final int $$f = 32;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {101, 74, 115, 66, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -73, 5, Ascii.DC2, -2, 10, 60, -50, -6, 6, 7, -6, -3, 73, -48, -10, 13, -11, 6, 9, 8, 57, -33, TarHeader.LF_LINK, -60, -9, 6, 0, 0, -9, 2, -6, Ascii.CAN, 2, 2, 8, -17, Ascii.FF, -5};
            private static final int $$e = 247;
            private static final byte[] $$a = {120, Ascii.VT, 65, 93, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
            private static final int $$b = 219;
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            private static char[] component2 = {3095, 50489, 40528, 22375, 10397, 57786, 47828, 29631, 17681, 7724, 55058, 43086, 24963, 15016, 62412, 50428, 40459, 22276, 10312, 57706, 47745, 29608, 28174, 42790, 64584, 13688, 19100, 33707, 55497, 4574, 9990, 31779, 46413, 51828, 910, 22699, 37312, 50049, 2731, 20959, 39145, 59201, 11810, 30028, 48226, 35460, 53740, 6386, 26617, 44564, 62770, 15424, 2921, 3103, 50483, 40529, 22395, 10374, 57786, 47812, 29672, 17718, 7742, 55119, 43125, 25017, 15028, 62428, 50428};
            private static long copydefault = 1644063240903247191L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(byte r6, byte r7, short r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r6 = r6 * 3
                    int r0 = r6 + 1
                    int r8 = r8 + 117
                    byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L28
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L26:
                    r3 = r1[r8]
                L28:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.$$g(byte, byte, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 16
                    int r7 = r7 + 83
                    int r6 = r6 + 4
                    int r8 = r8 * 6
                    int r0 = r8 + 10
                    byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = r8 + 9
                    r2 = 0
                    if (r1 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L2f
                L17:
                    r3 = r2
                L18:
                    int r6 = r6 + 1
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r1[r6]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L2f:
                    int r6 = -r6
                    int r3 = r3 + r6
                    int r6 = r3 + (-17)
                    r3 = r4
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.a(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.$$d
                    int r6 = r6 * 2
                    int r6 = 99 - r6
                    int r7 = r7 * 28
                    int r7 = r7 + 11
                    int r5 = r5 * 38
                    int r5 = r5 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    r4 = r0[r5]
                L28:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r6 = r6 + 3
                    int r5 = r5 + 1
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Confirmation.Creator.c(byte, int, short, java.lang.Object[]):void");
            }

            private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                cancelNotification cancelnotification = new cancelNotification();
                long[] jArr = new long[i];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i) {
                    int i4 = cancelnotification.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(component2[i2 + i4])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1757 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1159210934, false, $$g(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(copydefault), Integer.valueOf(c2)};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                            if (objCopydefault2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 3608, 30 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (7171 - (ViewConfiguration.getEdgeSlop() >> 16)), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {cancelnotification, cancelnotification};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                                if (objCopydefault3 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 24, (char) (TextUtils.lastIndexOf("", '0', 0) + 27762), -1529629956, false, $$g(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault3).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                char[] cArr = new char[i];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i) {
                    int i5 = $11 + 55;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    try {
                        Object[] objArr5 = {cancelnotification, cancelnotification};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", "", 0), KeyEvent.keyCodeFromString("") + 24, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27761), -1529629956, false, $$g(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                String str = new String(cArr);
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                objArr[0] = str;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirmation createFromParcel(Parcel parcel) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Confirmation confirmation = Confirmation.INSTANCE;
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                if (objCopydefault == null) {
                    int deadChar = 2026 - KeyEvent.getDeadChar(0, 0);
                    int iBlue = 23 - Color.blue(0);
                    char cResolveSize = (char) (6164 - View.resolveSize(0, 0));
                    byte b2 = (byte) ($$a[18] + 1);
                    byte b3 = (byte) (b2 + 1);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 + 1), objArr2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(deadChar, iBlue, cResolveSize, 163751008, false, (String) objArr2[0], null);
                }
                long j = ((Field) objCopydefault).getLong(null);
                Object[] objArr3 = new Object[1];
                b(TextUtils.getOffsetAfter("", 0) + 22, KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(15 - Color.blue(0), 22 - (KeyEvent.getMaxKeyCode() >> 16), (char) (25117 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                if (objCopydefault2 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2027;
                    int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                    char cLastIndexOf = (char) (6163 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b4 = (byte) ($$b & 5);
                    Object[] objArr5 = new Object[1];
                    a((byte) 14, b4, (byte) (b4 - 1), objArr5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iResolveOpacity, cLastIndexOf, 381780032, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i2 = ShareDataUIState + 27;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                    if (objCopydefault3 == null) {
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2026;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6164);
                        byte b5 = (byte) (-$$a[26]);
                        byte b6 = (byte) (b5 & 1);
                        Object[] objArr6 = new Object[1];
                        a(b5, b6, (byte) (b6 - 1), objArr6);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, pressedStateDuration, doubleTapTimeout, 385853891, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                    objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i4 = ((int[]) objArr7[1])[0];
                    int i5 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[2];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = (((((~((-1109540868) | r10)) | (~(2071395171 | iIdentityHashCode))) * 988) - 586660769) + ((((~(iIdentityHashCode | (-1130779172))) | 21238304) | (~((~iIdentityHashCode) | 2071395171))) * 988)) - 225309376;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                    int i9 = component3 + 35;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    b(16 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0) + 38, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 53148), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0', 0) + 17, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52, (char) TextUtils.getOffsetBefore("", 0), objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i11 = ShareDataUIState + 39;
                    component3 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -225309376};
                        byte[] bArr = $$d;
                        byte b7 = bArr[40];
                        byte b8 = b7;
                        Object[] objArr11 = new Object[1];
                        c(b7, b8, (byte) (b8 + 1), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b9 = (byte) ($$e & 1);
                        byte b10 = bArr[40];
                        Object[] objArr12 = new Object[1];
                        c(b9, b10, b10, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                        if (objCopydefault4 == null) {
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2026;
                            int iNormalizeMetaState = 23 - KeyEvent.normalizeMetaState(0);
                            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6164);
                            byte b11 = (byte) (-$$a[26]);
                            byte b12 = (byte) (b11 & 1);
                            Object[] objArr14 = new Object[1];
                            a(b11, b12, (byte) (b12 - 1), objArr14);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout2, iNormalizeMetaState, minimumFlingVelocity, 385853891, false, (String) objArr14[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            b(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.getDeadChar(0, 0), (char) View.resolveSize(0, 0), objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (25117 - KeyEvent.getDeadChar(0, 0)), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                            if (objCopydefault5 == null) {
                                int doubleTapTimeout3 = 2026 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                                char c2 = (char) (6165 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                byte b13 = (byte) ($$b & 5);
                                Object[] objArr17 = new Object[1];
                                a((byte) 14, b13, (byte) (b13 - 1), objArr17);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout3, edgeSlop, c2, 381780032, false, (String) objArr17[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                            if (objCopydefault6 == null) {
                                int trimmedLength = TextUtils.getTrimmedLength("") + 2026;
                                int iMyTid = (Process.myTid() >> 22) + 23;
                                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 6164);
                                byte b14 = (byte) ($$a[18] + 1);
                                byte b15 = (byte) (b14 + 1);
                                Object[] objArr18 = new Object[1];
                                a(b14, b15, (byte) (b15 + 1), objArr18);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, iMyTid, cIndexOf, 163751008, false, (String) objArr18[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                            int i13 = component3 + 125;
                            ShareDataUIState = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 3 % 2;
                            }
                            objArr = objArr13;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[1])[0];
                if (i16 == i15) {
                    int i17 = ShareDataUIState + 73;
                    component3 = i17 % 128;
                    int i18 = i17 % 2;
                    Object[] objArr19 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i19 = ((int[]) objArr[0])[0];
                    int i20 = ((int[]) objArr[1])[0];
                    int i21 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[2];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i22 = ~iElapsedRealtime;
                    int i23 = i19 + (-1022061351) + (((~((-1395049766) | i22)) | (~((-697583711) | iElapsedRealtime))) * (-370)) + (((~(iElapsedRealtime | (-1395049766))) | (~(i22 | (-697583711))) | (-2075577728)) * (-370)) + 835386624;
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr19[0])[0] = i25 ^ (i25 << 5);
                    Object[] objArr20 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
                    int i26 = ((int[]) objArr19[0])[0];
                    int i27 = ((int[]) objArr19[1])[0];
                    int i28 = ((int[]) objArr19[3])[0];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i29 = i26 + ((~(iIdentityHashCode2 | 1553685790)) * TypedValues.CycleType.TYPE_EASING) + 1060736463 + (((~((~iIdentityHashCode2) | 1553685790)) | 1773572) * TypedValues.CycleType.TYPE_EASING);
                    int i30 = (i29 << 13) ^ i29;
                    int i31 = i30 ^ (i30 >>> 17);
                    ((int[]) objArr20[0])[0] = i31 ^ (i31 << 5);
                    return confirmation;
                }
                int i32 = 2;
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[2];
                if (strArr3 != null) {
                    int i33 = component3 + 23;
                    ShareDataUIState = i33 % 128;
                    int i34 = i33 % 2;
                    int i35 = 0;
                    while (i35 < strArr3.length) {
                        int i36 = component3 + 105;
                        ShareDataUIState = i36 % 128;
                        int i37 = i36 % i32;
                        arrayList.add(strArr3[i35]);
                        i35++;
                        i32 = 2;
                    }
                }
                long j2 = -1;
                long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6618, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr21 = {-1800952314, Long.valueOf(j5), arrayList, null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, 56 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                    Object[] objArr22 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                    int i38 = ((int[]) objArr[0])[0];
                    int i39 = ((int[]) objArr[1])[0];
                    int i40 = ((int[]) objArr[3])[0];
                    String[] strArr4 = (String[]) objArr[2];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i41 = i38 + (-1732367878) + ((~((~iIdentityHashCode3) | (-840967531))) * 433) + (((~((-1230362646) | iIdentityHashCode3)) | (-862270831)) * (-433)) + (((~(iIdentityHashCode3 | (-862270831))) | (-2071330176)) * 433);
                    int i42 = (i41 << 13) ^ i41;
                    int i43 = i42 ^ (i42 >>> 17);
                    ((int[]) objArr22[0])[0] = i43 ^ (i43 << 5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }

            @Override
            public Confirmation createFromParcel(Parcel parcel) throws Throwable {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 65;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Confirmation confirmationCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 70 / 0;
                }
                int i5 = component3 + 7;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return confirmationCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirmation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 125;
                ShareDataUIState = i3 % 128;
                Confirmation[] confirmationArr = new Confirmation[i];
                if (i3 % 2 == 0) {
                    return confirmationArr;
                }
                throw null;
            }

            @Override
            public Confirmation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 33;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    newArray(i);
                    throw null;
                }
                Confirmation[] confirmationArrNewArray = newArray(i);
                int i4 = component3 + 47;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return confirmationArrNewArray;
                }
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$OtpValidation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtpValidation extends ESimScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final OtpValidation INSTANCE = new OtpValidation();
        public static final Parcelable.Creator<OtpValidation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OtpValidation> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OtpValidation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 99;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    return OtpValidation.INSTANCE;
                }
                OtpValidation otpValidation = OtpValidation.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public OtpValidation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 29;
                component1 = i2 % 128;
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
            public final OtpValidation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 5;
                component2 = i3 % 128;
                OtpValidation[] otpValidationArr = new OtpValidation[i];
                if (i3 % 2 != 0) {
                    int i4 = 13 / 0;
                }
                return otpValidationArr;
            }

            @Override
            public OtpValidation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OtpValidation[] otpValidationArrNewArray = newArray(i);
                int i5 = component1 + 91;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return otpValidationArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private OtpValidation() {
            super(null);
        }

        static {
            int i = component2 + 13;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 13;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 101;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof OtpValidation) {
                return true;
            }
            int i4 = copydefault + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 57;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return 970249829;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 51;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return "OtpValidation";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 != 0 ? 0 : 1);
            int i4 = component3 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$PinValidation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PinValidation extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final PinValidation INSTANCE = new PinValidation();
        public static final Parcelable.Creator<PinValidation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PinValidation> {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PinValidation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 31;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                PinValidation pinValidation = PinValidation.INSTANCE;
                int i4 = component3 + 121;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return pinValidation;
            }

            @Override
            public PinValidation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 125;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                PinValidation pinValidationCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 101;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 67 / 0;
                }
                return pinValidationCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PinValidation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                component3 = i3 % 128;
                PinValidation[] pinValidationArr = new PinValidation[i];
                if (i3 % 2 != 0) {
                    return pinValidationArr;
                }
                throw null;
            }

            @Override
            public PinValidation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                PinValidation[] pinValidationArrNewArray = newArray(i);
                int i5 = component1 + 27;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return pinValidationArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private PinValidation() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 33;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 109;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 55 / 0;
                }
                return true;
            }
            if (other instanceof PinValidation) {
                return true;
            }
            int i4 = component2 + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 31;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return -1444127665;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 67;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 47;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return "PinValidation";
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Completion;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Completion extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        public static final Completion INSTANCE = new Completion();
        public static final Parcelable.Creator<Completion> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Completion> {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Completion createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 11;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Completion completion = Completion.INSTANCE;
                if (i3 == 0) {
                    return completion;
                }
                throw null;
            }

            @Override
            public Completion createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 125;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Completion completionCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 103;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return completionCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Completion[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 11;
                copydefault = i3 % 128;
                Completion[] completionArr = new Completion[i];
                if (i3 % 2 == 0) {
                    int i4 = 61 / 0;
                }
                return completionArr;
            }

            @Override
            public Completion[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Completion[] completionArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 0 / 0;
                }
                return completionArrNewArray;
            }
        }

        private Completion() {
            super(null);
        }

        static {
            int i = copydefault + 15;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 85;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 69;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 15;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Completion) {
                return true;
            }
            int i4 = component3 + 73;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 103;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return 964324123;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 125;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 73 / 0;
            }
            return "Completion";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
            }
            int i4 = component3 + 51;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 78 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        public static final Error INSTANCE = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Error createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 71;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Error error = Error.INSTANCE;
                int i4 = component1 + 105;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return error;
            }

            @Override
            public Error createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Error[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 35;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                Error[] errorArr = new Error[i];
                int i6 = i3 + 45;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return errorArr;
            }

            @Override
            public Error[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 67;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    newArray(i);
                    throw null;
                }
                Error[] errorArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 9;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return errorArrNewArray;
            }
        }

        private Error() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 103;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 14 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 73;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error)) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r2 = r2 + 61;
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error.component3 = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            r6 = null;
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error.component3
                int r1 = r1 + 91
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error.component1 = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L16
                r1 = 22
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error
                r1 = r1 ^ r4
                if (r1 == 0) goto L2d
                int r2 = r2 + 61
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error.component3 = r6
                int r2 = r2 % r0
                if (r2 != 0) goto L28
                return r3
            L28:
                r6 = 0
                r6.hashCode()
                throw r6
            L2d:
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen$Error r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error) r6
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Error.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 53;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 20 / 0;
            }
            return -267223191;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "Error";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component3 + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends ESimScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Close> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    return Close.INSTANCE;
                }
                Close close = Close.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 11;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 17;
                component2 = i3 % 128;
                Close[] closeArr = new Close[i];
                if (i3 % 2 == 0) {
                    return closeArr;
                }
                throw null;
            }

            @Override
            public Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Close[] closeArrNewArray = newArray(i);
                int i5 = component1 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return closeArrNewArray;
            }
        }

        private Close() {
            super(null);
        }

        static {
            int i = copydefault + 33;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Close))) {
                return true;
            }
            int i5 = i2 + 111;
            component2 = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 17;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return -269251751;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "Close";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 63;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
