package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataOperationTypes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0016\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0016\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "Landroid/os/Parcelable;", "<init>", "()V", "Onboarding", "OptInCountry", "OptIn", "OptInSuccess", "OptInFailure", "Close", "OptOut", "OptOutSuccess", "OptOutFailure", "Dashboard", "CountrySelection", "RecipientDetails", "AmountDetails", ReferenceDataOperationTypes.CONFIRMATION, "Validation", "ConfirmationError", "TransactionSuccess", "TransactionError", "TransactionTypeSelection", "FinishSuccess", "BankDetails", "ContactSelection", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$AmountDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$BankDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$ConfirmationError;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$ContactSelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$CountrySelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$FinishSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Onboarding;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptIn;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInCountry;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInFailure;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOut;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOutFailure;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOutSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$RecipientDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionError;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionTypeSelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Validation;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MPesaGlobalScreen implements Parcelable {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2;

    private MPesaGlobalScreen() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Onboarding;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Onboarding extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        public static final Onboarding INSTANCE = new Onboarding();
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Onboarding createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    return Onboarding.INSTANCE;
                }
                Onboarding onboarding = Onboarding.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Onboarding createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 81;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Onboarding onboardingCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 80 / 0;
                }
                int i5 = component1 + 55;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 37 / 0;
                }
                return onboardingCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Onboarding[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 105;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Onboarding[] onboardingArr = new Onboarding[i];
                int i6 = i3 + 49;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return onboardingArr;
            }

            @Override
            public Onboarding[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Onboarding[] onboardingArrNewArray = newArray(i);
                int i5 = copydefault + 99;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return onboardingArrNewArray;
            }
        }

        private Onboarding() {
            super(null);
        }

        static {
            int i = copydefault + 31;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 99;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 43;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Onboarding))) {
                return true;
            }
            int i4 = i2 + 79;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 105;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 467466731;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 119;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 123;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return "Onboarding";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 85;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 121;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public MPesaGlobalScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInCountry;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptInCountry extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final OptInCountry INSTANCE = new OptInCountry();
        public static final Parcelable.Creator<OptInCountry> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptInCountry> {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInCountry createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 61;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptInCountry optInCountry = OptInCountry.INSTANCE;
                int i4 = component1 + 13;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return optInCountry;
            }

            @Override
            public OptInCountry createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 15;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                OptInCountry optInCountryCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 101;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 66 / 0;
                }
                return optInCountryCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInCountry[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                OptInCountry[] optInCountryArr = new OptInCountry[i];
                int i6 = i3 + 23;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return optInCountryArr;
                }
                throw null;
            }

            @Override
            public OptInCountry[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OptInCountry[] optInCountryArrNewArray = newArray(i);
                int i5 = component1 + 69;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return optInCountryArrNewArray;
            }
        }

        private OptInCountry() {
            super(null);
        }

        static {
            int i = component3 + 81;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = ShareDataUIState + 83;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof OptInCountry) {
                return true;
            }
            int i4 = component1 + 13;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            boolean z = i4 % 2 != 0;
            int i6 = i5 + 13;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return -1863706354;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return "OptInCountry";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptIn;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptIn extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final OptIn INSTANCE = new OptIn();
        public static final Parcelable.Creator<OptIn> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptIn> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptIn createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptIn optIn = OptIn.INSTANCE;
                int i4 = ShareDataUIState + 111;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 55 / 0;
                }
                return optIn;
            }

            @Override
            public OptIn createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 121;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                OptIn optInCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 53;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return optInCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptIn[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                OptIn[] optInArr = new OptIn[i];
                if (i3 % 2 != 0) {
                    int i5 = 94 / 0;
                }
                int i6 = i4 + 45;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 39 / 0;
                }
                return optInArr;
            }

            @Override
            public OptIn[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 63;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OptIn[] optInArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 64 / 0;
                }
                int i6 = component1 + 61;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 87 / 0;
                }
                return optInArrNewArray;
            }
        }

        private OptIn() {
            super(null);
        }

        static {
            int i = copydefault + 65;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r7 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r3 = r3 + 103;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component2 = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            r7 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 99;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component3 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component2
                int r2 = r1 + 41
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component3 = r3
                int r2 = r2 % r0
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L16
                r2 = 56
                int r2 = r2 / r5
                if (r6 != r7) goto L20
                goto L18
            L16:
                if (r6 != r7) goto L20
            L18:
                int r1 = r1 + 99
                int r7 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component3 = r7
                int r1 = r1 % r0
                return r4
            L20:
                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn
                if (r1 != 0) goto L2c
                int r3 = r3 + 103
                int r7 = r3 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.component2 = r7
                int r3 = r3 % r0
                return r5
            L2c:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$OptIn r7 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn) r7
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptIn.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 59;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 11;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return 878637416;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 9;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                int i4 = 55 / 0;
            }
            int i5 = i3 + 9;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "OptIn";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 43;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptInSuccess extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final OptInSuccess INSTANCE = new OptInSuccess();
        public static final Parcelable.Creator<OptInSuccess> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptInSuccess> {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptInSuccess optInSuccess = OptInSuccess.INSTANCE;
                int i4 = component1 + 59;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return optInSuccess;
            }

            @Override
            public OptInSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 33;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                OptInSuccess optInSuccessCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 19 / 0;
                }
                int i5 = component1 + 25;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return optInSuccessCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 83;
                ShareDataUIState = i3 % 128;
                OptInSuccess[] optInSuccessArr = new OptInSuccess[i];
                if (i3 % 2 == 0) {
                    int i4 = 83 / 0;
                }
                return optInSuccessArr;
            }

            @Override
            public OptInSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 117;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                OptInSuccess[] optInSuccessArrNewArray = newArray(i);
                int i5 = component1 + 59;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return optInSuccessArrNewArray;
            }
        }

        private OptInSuccess() {
            super(null);
        }

        static {
            int i = component1 + 95;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 15;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            component3 = i5 % 128;
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
                int i2 = copydefault + 87;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof OptInSuccess) {
                return true;
            }
            int i4 = component3 + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 5;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return -393739909;
            }
            int i3 = 34 / 0;
            return -393739909;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 69;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 1;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return "OptInSuccess";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptInFailure;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptInFailure extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final OptInFailure INSTANCE = new OptInFailure();
        public static final Parcelable.Creator<OptInFailure> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptInFailure> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInFailure createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 73;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptInFailure optInFailure = OptInFailure.INSTANCE;
                if (i3 == 0) {
                    return optInFailure;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public OptInFailure createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 33;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                OptInFailure optInFailureCreateFromParcel = createFromParcel(parcel);
                int i3 = copydefault + 113;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return optInFailureCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptInFailure[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 75;
                ShareDataUIState = i4 % 128;
                OptInFailure[] optInFailureArr = new OptInFailure[i];
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 59;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 91 / 0;
                }
                return optInFailureArr;
            }

            @Override
            public OptInFailure[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                OptInFailure[] optInFailureArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 77;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return optInFailureArrNewArray;
            }
        }

        private OptInFailure() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 83;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 97;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 69;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OptInFailure)) {
                int i4 = component2 + 73;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = component2 + 5;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 21 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 47;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 386855682;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 63;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return "OptInFailure";
            }
            int i3 = 7 / 0;
            return "OptInFailure";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 == 0) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
            }
            int i4 = component3 + 47;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Close> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 117;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Close close = Close.INSTANCE;
                if (i3 == 0) {
                    throw null;
                }
                int i4 = ShareDataUIState + 103;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return close;
                }
                throw null;
            }

            @Override
            public Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 91;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 19;
                copydefault = i3 % 128;
                Close[] closeArr = new Close[i];
                if (i3 % 2 == 0) {
                    return closeArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 99;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private Close() {
            super(null);
        }

        static {
            int i = component1 + 39;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            component2 = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 87;
            int i4 = i3 % 128;
            copydefault = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                int i5 = i4 + 87;
                component2 = i5 % 128;
                return i5 % 2 != 0;
            }
            if (other instanceof Close) {
                int i6 = i2 + 107;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            int i8 = i2 + 79;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 45;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 867432488;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return "Close";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOut;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptOut extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 1;
        public static final OptOut INSTANCE = new OptOut();
        public static final Parcelable.Creator<OptOut> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptOut> {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOut createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 5;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptOut optOut = OptOut.INSTANCE;
                if (i3 != 0) {
                    int i4 = 33 / 0;
                }
                int i5 = copydefault + 79;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return optOut;
            }

            @Override
            public OptOut createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                OptOut optOutCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 45;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return optOutCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOut[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                OptOut[] optOutArr = new OptOut[i];
                int i6 = i4 + 15;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return optOutArr;
            }

            @Override
            public OptOut[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 41;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                OptOut[] optOutArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 47 / 0;
                }
                return optOutArrNewArray;
            }
        }

        private OptOut() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 91;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 25;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 81;
                component1 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (other instanceof OptOut) {
                return true;
            }
            int i6 = i3 + 95;
            component1 = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 101;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return 1467962219;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 43;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return "OptOut";
            }
            int i3 = 82 / 0;
            return "OptOut";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 != 0 ? 0 : 1);
            int i4 = copydefault + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOutSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptOutSuccess extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final OptOutSuccess INSTANCE = new OptOutSuccess();
        public static final Parcelable.Creator<OptOutSuccess> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptOutSuccess> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOutSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 67;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptOutSuccess optOutSuccess = OptOutSuccess.INSTANCE;
                int i4 = ShareDataUIState + 119;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                return optOutSuccess;
            }

            @Override
            public OptOutSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                OptOutSuccess optOutSuccessCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 40 / 0;
                }
                return optOutSuccessCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOutSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 75;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                OptOutSuccess[] optOutSuccessArr = new OptOutSuccess[i];
                int i6 = i3 + 1;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return optOutSuccessArr;
            }

            @Override
            public OptOutSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 49;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                OptOutSuccess[] optOutSuccessArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 55;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return optOutSuccessArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private OptOutSuccess() {
            super(null);
        }

        static {
            int i = component3 + 27;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 57;
            component2 = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 93;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof OptOutSuccess) {
                return true;
            }
            int i4 = i2 + 93;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 31;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 17;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 109;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return 1815668248;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return "OptOutSuccess";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 111;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$OptOutFailure;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OptOutFailure extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;
        public static final OptOutFailure INSTANCE = new OptOutFailure();
        public static final Parcelable.Creator<OptOutFailure> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptOutFailure> {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOutFailure createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                OptOutFailure optOutFailure = OptOutFailure.INSTANCE;
                if (i3 != 0) {
                    throw null;
                }
                int i4 = component3 + 109;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return optOutFailure;
            }

            @Override
            public OptOutFailure createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                OptOutFailure optOutFailureCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 7;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return optOutFailureCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OptOutFailure[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 111;
                component3 = i3 % 128;
                OptOutFailure[] optOutFailureArr = new OptOutFailure[i];
                if (i3 % 2 == 0) {
                    int i4 = 15 / 0;
                }
                return optOutFailureArr;
            }

            @Override
            public OptOutFailure[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 115;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                OptOutFailure[] optOutFailureArrNewArray = newArray(i);
                int i5 = component2 + 81;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return optOutFailureArrNewArray;
                }
                throw null;
            }
        }

        private OptOutFailure() {
            super(null);
        }

        static {
            int i = component2 + 27;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 55;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 37;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure.component3 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
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
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure.component3
                int r1 = r1 + 77
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure.component1 = r2
                int r1 = r1 % r0
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L16
                r1 = 89
                int r1 = r1 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure
                if (r1 != 0) goto L25
                int r2 = r2 + 37
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure.component3 = r6
                int r2 = r2 % r0
                return r4
            L25:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$OptOutFailure r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure) r6
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.OptOutFailure.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 57;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return -1698703457;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 95;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return "OptOutFailure";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 125;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component3 + 115;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dashboard extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Dashboard INSTANCE = new Dashboard();
        public static final Parcelable.Creator<Dashboard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Dashboard> {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 7;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 != 0) {
                    Dashboard dashboard = Dashboard.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Dashboard dashboard2 = Dashboard.INSTANCE;
                int i4 = component2 + 121;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 0 / 0;
                }
                return dashboard2;
            }

            @Override
            public Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 51;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 77;
                int i4 = i3 % 128;
                component3 = i4;
                Dashboard[] dashboardArr = new Dashboard[i];
                if (i3 % 2 != 0) {
                    int i5 = 85 / 0;
                }
                int i6 = i4 + 19;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return dashboardArr;
            }

            @Override
            public Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 23;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Dashboard[] dashboardArrNewArray = newArray(i);
                int i5 = component3 + 93;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return dashboardArrNewArray;
            }
        }

        private Dashboard() {
            super(null);
        }

        static {
            int i = component1 + 119;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 28 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 119;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 39 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof Dashboard) {
                return true;
            }
            int i2 = component2 + 7;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 123;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return -1449104188;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 11;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 19;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return "Dashboard";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 49;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$CountrySelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CountrySelection extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 1;
        public static final CountrySelection INSTANCE = new CountrySelection();
        public static final Parcelable.Creator<CountrySelection> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CountrySelection> {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountrySelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 123;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                CountrySelection countrySelection = CountrySelection.INSTANCE;
                int i4 = component2 + 25;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return countrySelection;
            }

            @Override
            public CountrySelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 15;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CountrySelection countrySelectionCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 29 / 0;
                }
                int i5 = component2 + 89;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return countrySelectionCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountrySelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 119;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                CountrySelection[] countrySelectionArr = new CountrySelection[i];
                int i6 = i3 + 3;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    return countrySelectionArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public CountrySelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    newArray(i);
                    obj.hashCode();
                    throw null;
                }
                CountrySelection[] countrySelectionArrNewArray = newArray(i);
                int i4 = component2 + 59;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return countrySelectionArrNewArray;
                }
                obj.hashCode();
                throw null;
            }
        }

        private CountrySelection() {
            super(null);
        }

        static {
            int i = component2 + 103;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                int i2 = 9 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            component1 = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 75;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof CountrySelection) {
                return true;
            }
            int i4 = i2 + 37;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 55;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return -742782362;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return "CountrySelection";
            }
            int i3 = 99 / 0;
            return "CountrySelection";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 75;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$RecipientDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecipientDetails extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final RecipientDetails INSTANCE = new RecipientDetails();
        public static final Parcelable.Creator<RecipientDetails> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RecipientDetails> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RecipientDetails createFromParcel(Parcel parcel) {
                RecipientDetails recipientDetails;
                int i = 2 % 2;
                int i2 = copydefault + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    recipientDetails = RecipientDetails.INSTANCE;
                    int i4 = 3 / 0;
                } else {
                    recipientDetails = RecipientDetails.INSTANCE;
                }
                int i5 = ShareDataUIState + 51;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return recipientDetails;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public RecipientDetails createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 119;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                RecipientDetails recipientDetailsCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 37;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return recipientDetailsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RecipientDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 123;
                int i4 = i3 % 128;
                copydefault = i4;
                Object obj = null;
                RecipientDetails[] recipientDetailsArr = new RecipientDetails[i];
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i5 = i4 + 45;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return recipientDetailsArr;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public RecipientDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                RecipientDetails[] recipientDetailsArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 22 / 0;
                }
                int i6 = ShareDataUIState + 53;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return recipientDetailsArrNewArray;
            }
        }

        private RecipientDetails() {
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
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 95 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 49;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 105;
                component3 = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(other instanceof RecipientDetails)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 13;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return 72737209;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 113;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 93 / 0;
            }
            int i5 = i2 + 53;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return "RecipientDetails";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 != 0 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$AmountDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AmountDetails extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final AmountDetails INSTANCE = new AmountDetails();
        public static final Parcelable.Creator<AmountDetails> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AmountDetails> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AmountDetails createFromParcel(Parcel parcel) {
                AmountDetails amountDetails;
                int i = 2 % 2;
                int i2 = component1 + 3;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    amountDetails = AmountDetails.INSTANCE;
                    int i4 = 37 / 0;
                } else {
                    amountDetails = AmountDetails.INSTANCE;
                }
                int i5 = copydefault + 81;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 90 / 0;
                }
                return amountDetails;
            }

            @Override
            public AmountDetails createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 107;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                AmountDetails amountDetailsCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 57;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return amountDetailsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AmountDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 111;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                AmountDetails[] amountDetailsArr = new AmountDetails[i];
                int i6 = i3 + 9;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return amountDetailsArr;
            }

            @Override
            public AmountDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                AmountDetails[] amountDetailsArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 98 / 0;
                }
                return amountDetailsArrNewArray;
            }
        }

        private AmountDetails() {
            super(null);
        }

        static {
            int i = copydefault + 71;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 22 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 83;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 37;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof AmountDetails) {
                return true;
            }
            int i5 = i3 + 67;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 11;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 1655542010;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 91;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return "AmountDetails";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 47;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Confirmation extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final Confirmation INSTANCE = new Confirmation();
        public static final Parcelable.Creator<Confirmation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Confirmation> {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirmation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 67;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Confirmation confirmation = Confirmation.INSTANCE;
                int i4 = component3 + 97;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return confirmation;
            }

            @Override
            public Confirmation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 11;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Confirmation confirmationCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 117;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return confirmationCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirmation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 31;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                Confirmation[] confirmationArr = new Confirmation[i];
                int i6 = i4 + 13;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return confirmationArr;
            }

            @Override
            public Confirmation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 77;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private Confirmation() {
            super(null);
        }

        static {
            int i = component1 + 61;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 76 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (this != other) {
                if (!(other instanceof Confirmation)) {
                    return false;
                }
                return true;
            }
            int i5 = i3 + 19;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return 1545051141;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return ReferenceDataOperationTypes.CONFIRMATION;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = ShareDataUIState + 37;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$Validation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Validation extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;
        public static final Validation INSTANCE = new Validation();
        public static final Parcelable.Creator<Validation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Validation> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Validation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 103;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Validation validation = Validation.INSTANCE;
                int i4 = copydefault + 111;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return validation;
                }
                throw null;
            }

            @Override
            public Validation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Validation validationCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 74 / 0;
                }
                return validationCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Validation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 57;
                int i4 = i3 % 128;
                copydefault = i4;
                Object obj = null;
                Validation[] validationArr = new Validation[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 23;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return validationArr;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public Validation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private Validation() {
            super(null);
        }

        static {
            int i = component1 + 75;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 109;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 119;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validation)) {
                int i6 = i2 + 97;
                copydefault = i6 % 128;
                return i6 % 2 != 0;
            }
            int i7 = i4 + 11;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return 402787401;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 57;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 125;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return "Validation";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 97;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 71;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$ConfirmationError;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfirmationError extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;
        public static final ConfirmationError INSTANCE = new ConfirmationError();
        public static final Parcelable.Creator<ConfirmationError> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ConfirmationError> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ConfirmationError createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 55;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                ConfirmationError confirmationError = ConfirmationError.INSTANCE;
                int i4 = component3 + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return confirmationError;
            }

            @Override
            public ConfirmationError createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ConfirmationError confirmationErrorCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 3 / 0;
                }
                int i5 = component3 + 33;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 53 / 0;
                }
                return confirmationErrorCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ConfirmationError[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 59;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                ConfirmationError[] confirmationErrorArr = new ConfirmationError[i];
                int i6 = i3 + 25;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return confirmationErrorArr;
            }

            @Override
            public ConfirmationError[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 33;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ConfirmationError[] confirmationErrorArrNewArray = newArray(i);
                int i5 = component3 + 123;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return confirmationErrorArrNewArray;
            }
        }

        private ConfirmationError() {
            super(null);
        }

        static {
            int i = component2 + 17;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 35;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
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
                int i2 = ShareDataUIState + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof ConfirmationError))) {
                return true;
            }
            int i4 = ShareDataUIState + 7;
            copydefault = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 83;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return -623640317;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 39;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 13 / 0;
            }
            return "ConfirmationError";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 != 0 ? 0 : 1);
            int i4 = ShareDataUIState + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionSuccess extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final TransactionSuccess INSTANCE = new TransactionSuccess();
        public static final Parcelable.Creator<TransactionSuccess> CREATOR = new Creator();

        private TransactionSuccess() {
            super(null);
        }

        static {
            int i = component3 + 51;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 21 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 27;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof TransactionSuccess))) {
                return true;
            }
            int i4 = component1 + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 15;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 111;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            return -450649323;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 35;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return "TransactionSuccess";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionSuccess> {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionSuccess createFromParcel(Parcel parcel) throws Throwable {
                int i = 2 % 2;
                int i2 = component3 + 53;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 67, 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (19696 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 518907119, false, "component3", null);
                }
                int i4 = ((Field) objCopydefault).getInt(null);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(0) + 30, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 55511118, false, "component2", null);
                }
                int i5 = ((Field) objCopydefault2).getInt(null);
                long j = i5;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (Process.myTid() >> 22), 30 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 58536393, false, "component3", null);
                }
                int i6 = ((Field) objCopydefault3).getInt(null);
                long j2 = -68;
                long j3 = -1;
                long j4 = j3 ^ 89735632699882373L;
                long j5 = j3 ^ 702967820944322051L;
                long jMyTid = Process.myTid();
                long j6 = jMyTid ^ j3;
                long j7 = (((long) 69) * 89735632699882373L) + (((long) (-67)) * 702967820944322051L) + (((((j4 | j5) | j6) ^ j3) | (720575490480406407L ^ j3) | ((jMyTid | 702967820944322051L) ^ j3)) * j2) + (j2 * (((j4 | j6) | 702967820944322051L) ^ j3)) + (((long) 68) * (j4 | (j3 ^ (j5 | j6))));
                int i7 = 0;
                while (true) {
                    for (int i8 = 0; i8 != 8; i8++) {
                        int i9 = component3 + 105;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i11 = component3 + 33;
                    component2 = i11 % 128;
                    int i12 = i11 % 2;
                    i7++;
                    j = j7;
                }
                if (i6 != i4) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 66, 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19696), 1457147715, false, "copydefault", null);
                    }
                    Object obj = ((Field) objCopydefault4).get(null);
                    long j8 = -1;
                    long j9 = 0;
                    long j10 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                    try {
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6618, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr = {-465546996, Long.valueOf(j10), obj, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, 56 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransactionSuccess.INSTANCE;
            }

            @Override
            public TransactionSuccess createFromParcel(Parcel parcel) throws Throwable {
                int i = 2 % 2;
                int i2 = component2 + 37;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                TransactionSuccess transactionSuccessCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 85;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return transactionSuccessCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 23;
                component3 = i4 % 128;
                Object obj = null;
                TransactionSuccess[] transactionSuccessArr = new TransactionSuccess[i];
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 123;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return transactionSuccessArr;
                }
                throw null;
            }

            @Override
            public TransactionSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                TransactionSuccess[] transactionSuccessArrNewArray = newArray(i);
                int i5 = component2 + 71;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return transactionSuccessArrNewArray;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionError;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionError extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final TransactionError INSTANCE = new TransactionError();
        public static final Parcelable.Creator<TransactionError> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionError> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionError createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 23;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                TransactionError transactionError = TransactionError.INSTANCE;
                int i4 = component3 + 75;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return transactionError;
            }

            @Override
            public TransactionError createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 41;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TransactionError transactionErrorCreateFromParcel = createFromParcel(parcel);
                int i3 = component3 + 3;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return transactionErrorCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionError[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 39;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                TransactionError[] transactionErrorArr = new TransactionError[i];
                int i6 = i3 + 45;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 22 / 0;
                }
                return transactionErrorArr;
            }

            @Override
            public TransactionError[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 99;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                TransactionError[] transactionErrorArrNewArray = newArray(i);
                int i5 = component3 + 93;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return transactionErrorArrNewArray;
            }
        }

        private TransactionError() {
            super(null);
        }

        static {
            int i = component1 + 55;
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
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i3 + 7;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (other instanceof TransactionError) {
                return true;
            }
            int i6 = i3 + 5;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 115;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 89;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return -1238052454;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return "TransactionError";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = ShareDataUIState + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$TransactionTypeSelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionTypeSelection extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final TransactionTypeSelection INSTANCE = new TransactionTypeSelection();
        public static final Parcelable.Creator<TransactionTypeSelection> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TransactionTypeSelection> {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionTypeSelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                TransactionTypeSelection transactionTypeSelection = TransactionTypeSelection.INSTANCE;
                if (i3 != 0) {
                    return transactionTypeSelection;
                }
                throw null;
            }

            @Override
            public TransactionTypeSelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 33;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                TransactionTypeSelection transactionTypeSelectionCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 89;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return transactionTypeSelectionCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionTypeSelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component2 = i3 % 128;
                TransactionTypeSelection[] transactionTypeSelectionArr = new TransactionTypeSelection[i];
                if (i3 % 2 != 0) {
                    int i4 = 65 / 0;
                }
                return transactionTypeSelectionArr;
            }

            @Override
            public TransactionTypeSelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 25;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                TransactionTypeSelection[] transactionTypeSelectionArrNewArray = newArray(i);
                int i5 = copydefault + 73;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return transactionTypeSelectionArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private TransactionTypeSelection() {
            super(null);
        }

        static {
            int i = component3 + 55;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            component2 = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r7 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r3 = r3 + 103;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.component2 = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            r7 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 83;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.copydefault = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.component2
                int r2 = r1 + 9
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.copydefault = r3
                int r2 = r2 % r0
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L16
                r2 = 63
                int r2 = r2 / r5
                if (r6 != r7) goto L20
                goto L18
            L16:
                if (r6 != r7) goto L20
            L18:
                int r1 = r1 + 83
                int r7 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.copydefault = r7
                int r1 = r1 % r0
                return r4
            L20:
                boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection
                if (r1 != 0) goto L2c
                int r3 = r3 + 103
                int r7 = r3 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.component2 = r7
                int r3 = r3 % r0
                return r5
            L2c:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$TransactionTypeSelection r7 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection) r7
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 3;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return -678375164;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 93;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return "TransactionTypeSelection";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 11;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$FinishSuccess;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FinishSuccess extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        public static final FinishSuccess INSTANCE = new FinishSuccess();
        public static final Parcelable.Creator<FinishSuccess> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FinishSuccess> {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final FinishSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 33;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                FinishSuccess finishSuccess = FinishSuccess.INSTANCE;
                int i4 = component3 + 9;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return finishSuccess;
            }

            @Override
            public FinishSuccess createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 83;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                FinishSuccess finishSuccessCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 27 / 0;
                }
                return finishSuccessCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final FinishSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 37;
                int i4 = i3 % 128;
                component1 = i4;
                FinishSuccess[] finishSuccessArr = new FinishSuccess[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 19;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return finishSuccessArr;
            }

            @Override
            public FinishSuccess[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                FinishSuccess[] finishSuccessArrNewArray = newArray(i);
                int i5 = component1 + 75;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return finishSuccessArrNewArray;
            }
        }

        private FinishSuccess() {
            super(null);
        }

        static {
            int i = component3 + 71;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 21;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof FinishSuccess) {
                return true;
            }
            int i4 = i2 + 37;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 57;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return 516192800;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 37;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return "FinishSuccess";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component1 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$BankDetails;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BankDetails extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;
        public static final BankDetails INSTANCE = new BankDetails();
        public static final Parcelable.Creator<BankDetails> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BankDetails> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BankDetails createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                BankDetails bankDetails = BankDetails.INSTANCE;
                int i4 = copydefault + 31;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 37 / 0;
                }
                return bankDetails;
            }

            @Override
            public BankDetails createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 29;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                BankDetails bankDetailsCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 21;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return bankDetailsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BankDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 1;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                BankDetails[] bankDetailsArr = new BankDetails[i];
                int i6 = i3 + 9;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return bankDetailsArr;
            }

            @Override
            public BankDetails[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 25;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BankDetails[] bankDetailsArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 23 / 0;
                }
                return bankDetailsArrNewArray;
            }
        }

        private BankDetails() {
            super(null);
        }

        static {
            int i = component2 + 111;
            component1 = i % 128;
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
            int i2 = ShareDataUIState + 121;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 27;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
            }
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (!(other instanceof BankDetails)) {
                    return false;
                }
                return true;
            }
            int i2 = component3 + 59;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return -1464533354;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 1;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return "BankDetails";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = ShareDataUIState + 39;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen$ContactSelection;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContactSelection extends MPesaGlobalScreen {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        public static final ContactSelection INSTANCE = new ContactSelection();
        public static final Parcelable.Creator<ContactSelection> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactSelection> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ContactSelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                ContactSelection contactSelection = ContactSelection.INSTANCE;
                int i4 = component3 + 5;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return contactSelection;
            }

            @Override
            public ContactSelection createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 47;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ContactSelection contactSelectionCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 1;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return contactSelectionCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ContactSelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 111;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                ContactSelection[] contactSelectionArr = new ContactSelection[i];
                int i6 = i4 + 11;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return contactSelectionArr;
                }
                throw null;
            }

            @Override
            public ContactSelection[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private ContactSelection() {
            super(null);
        }

        static {
            int i = component2 + 1;
            component1 = i % 128;
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
            int i2 = component3 + 31;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 47;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof ContactSelection)) {
                return false;
            }
            int i4 = copydefault + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return 750172444;
            }
            int i3 = 31 / 0;
            return 750172444;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 25;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 65;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return "ContactSelection";
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 57;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
        }
    }
}
