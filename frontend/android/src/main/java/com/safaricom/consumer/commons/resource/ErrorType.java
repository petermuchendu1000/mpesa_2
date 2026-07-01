package com.safaricom.consumer.commons.resource;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b&\u0018\u00002\u00020\u0001:%\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006)"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType;", "Landroid/os/Parcelable;", "<init>", "()V", "Network", "Sms", "Storage", "TurnMobileNetwork", "TurnMobileNetworkForgotPin", "TurnMobileNetworkChangePin", "TurnMobileNetworkUnlockPin", "TurnMobileNetworkOverWifi", "MissingSimCard", "MissingSimCardForgotPin", "MissingSimCardChangePin", "MissingSimCardUnlockPin", "NotLocalNetworkSimCard", "NotLocalNetworkSimCardForgotPin", "NotLocalNetworkSimCardChangePin", "NotLocalNetworkSimCardUnlockPin", "RequiresOffNetActivation", "RequiresOTPValidation", "Requires2FALogin", "InvalidOTP", "SimSwapped", "OverdrawOptIn", "OverdrawPendingConfirmation", "ActivationLoginError", "OverdrawInactiveAccount", "Vicinity", "Unregistered", "AppVersionOutdated", "AccountIdentityNotValidated", "WrongSimCard", "TillNumberError", "VicinityError", "AccountError", "NotificationError", "MiniAppsSDKError", "PochiLaBiasharaNotEligible", "MultipleAttempts", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ErrorType implements Parcelable {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Network;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "getShortDescription", "", "defaultString", "Generic", "NoConnection", "SslCertificate", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network$Generic;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network$NoConnection;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network$SslCertificate;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Network extends ErrorType {
        public abstract String getShortDescription(String defaultString);

        private Network() {
        }

        public Network(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JH\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0003J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Network$Generic;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network;", "httpCode", "", "errorCode", "", "description", "additionalFields", "Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "timeOutReached", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/resource/AdditionalFields;Z)V", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/String;", "getDescription", "getAdditionalFields", "()Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "getTimeOutReached", "()Z", "getShortDescription", "defaultString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/resource/AdditionalFields;Z)Lcom/safaricom/consumer/commons/resource/ErrorType$Network$Generic;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Generic extends Network {
            public static final Parcelable.Creator<Generic> CREATOR = new Creator();
            private final AdditionalFields additionalFields;
            private final String description;
            private final String errorCode;
            private final Integer httpCode;
            private final boolean timeOutReached;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Generic> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Generic createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Generic(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AdditionalFields.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Generic[] newArray(int i) {
                    return new Generic[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            public Generic(Integer num, String str, String str2, AdditionalFields additionalFields, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? additionalFields : null, (i & 16) != 0 ? false : z);
            }

            public final Integer getHttpCode() {
                return this.httpCode;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final String getDescription() {
                return this.description;
            }

            public final AdditionalFields getAdditionalFields() {
                return this.additionalFields;
            }

            public final boolean getTimeOutReached() {
                return this.timeOutReached;
            }

            public Generic(Integer num, String str, String str2, AdditionalFields additionalFields, boolean z) {
                super(null);
                this.httpCode = num;
                this.errorCode = str;
                this.description = str2;
                this.additionalFields = additionalFields;
                this.timeOutReached = z;
            }

            @Override
            public String getShortDescription(String defaultString) {
                Intrinsics.checkNotNullParameter(defaultString, "");
                if (this.timeOutReached) {
                    return "request_timeout";
                }
                StringBuilder sb = new StringBuilder("http_code:");
                Object obj = this.httpCode;
                if (obj == null) {
                    obj = defaultString;
                }
                sb.append(obj);
                sb.append(";error_code:");
                String str = this.errorCode;
                if (str != null) {
                    defaultString = str;
                }
                sb.append(defaultString);
                return sb.toString();
            }

            public Generic() {
                this(null, null, null, null, false, 31, null);
            }

            public static Generic copy$default(Generic generic, Integer num, String str, String str2, AdditionalFields additionalFields, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = generic.httpCode;
                }
                if ((i & 2) != 0) {
                    str = generic.errorCode;
                }
                String str3 = str;
                if ((i & 4) != 0) {
                    str2 = generic.description;
                }
                String str4 = str2;
                if ((i & 8) != 0) {
                    additionalFields = generic.additionalFields;
                }
                AdditionalFields additionalFields2 = additionalFields;
                if ((i & 16) != 0) {
                    z = generic.timeOutReached;
                }
                return generic.copy(num, str3, str4, additionalFields2, z);
            }

            public final Integer getHttpCode() {
                return this.httpCode;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final String getDescription() {
                return this.description;
            }

            public final AdditionalFields getAdditionalFields() {
                return this.additionalFields;
            }

            public final boolean getTimeOutReached() {
                return this.timeOutReached;
            }

            public final Generic copy(Integer httpCode, String errorCode, String description, AdditionalFields additionalFields, boolean timeOutReached) {
                return new Generic(httpCode, errorCode, description, additionalFields, timeOutReached);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) other;
                return Intrinsics.areEqual(this.httpCode, generic.httpCode) && Intrinsics.areEqual(this.errorCode, generic.errorCode) && Intrinsics.areEqual(this.description, generic.description) && Intrinsics.areEqual(this.additionalFields, generic.additionalFields) && this.timeOutReached == generic.timeOutReached;
            }

            public int hashCode() {
                Integer num = this.httpCode;
                int iHashCode = num == null ? 0 : num.hashCode();
                String str = this.errorCode;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                String str2 = this.description;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                AdditionalFields additionalFields = this.additionalFields;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (additionalFields != null ? additionalFields.hashCode() : 0)) * 31) + Boolean.hashCode(this.timeOutReached);
            }

            public String toString() {
                return "Generic(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ", additionalFields=" + this.additionalFields + ", timeOutReached=" + this.timeOutReached + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                Integer num = this.httpCode;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
                dest.writeString(this.errorCode);
                dest.writeString(this.description);
                AdditionalFields additionalFields = this.additionalFields;
                if (additionalFields == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    additionalFields.writeToParcel(dest, flags);
                }
                dest.writeInt(this.timeOutReached ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Network$NoConnection;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network;", "<init>", "()V", "getShortDescription", "", "defaultString", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoConnection extends Network {
            public static final NoConnection INSTANCE = new NoConnection();
            public static final Parcelable.Creator<NoConnection> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NoConnection> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NoConnection createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NoConnection.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NoConnection[] newArray(int i) {
                    return new NoConnection[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private NoConnection() {
                super(null);
            }

            @Override
            public String getShortDescription(String defaultString) {
                Intrinsics.checkNotNullParameter(defaultString, "");
                return "no_network";
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Network$SslCertificate;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Network;", "<init>", "()V", "getShortDescription", "", "defaultString", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SslCertificate extends Network {
            public static final SslCertificate INSTANCE = new SslCertificate();
            public static final Parcelable.Creator<SslCertificate> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SslCertificate> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final SslCertificate createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return SslCertificate.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final SslCertificate[] newArray(int i) {
                    return new SslCertificate[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private SslCertificate() {
                super(null);
            }

            @Override
            public String getShortDescription(String defaultString) {
                Intrinsics.checkNotNullParameter(defaultString, "");
                return "ssl_certificate";
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "MissingPermission", "OfflineModeDisabled", "Generic", "HeaderEnrichmentOfflineModeMissingPermission", "WrongMsisdn", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$Generic;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$HeaderEnrichmentOfflineModeMissingPermission;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$MissingPermission;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$OfflineModeDisabled;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$WrongMsisdn;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Sms extends ErrorType {
        private Sms() {
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$MissingPermission;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MissingPermission extends Sms {
            public static final MissingPermission INSTANCE = new MissingPermission();
            public static final Parcelable.Creator<MissingPermission> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MissingPermission> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MissingPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return MissingPermission.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MissingPermission[] newArray(int i) {
                    return new MissingPermission[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private MissingPermission() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        public Sms(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$OfflineModeDisabled;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class OfflineModeDisabled extends Sms {
            public static final OfflineModeDisabled INSTANCE = new OfflineModeDisabled();
            public static final Parcelable.Creator<OfflineModeDisabled> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OfflineModeDisabled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final OfflineModeDisabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return OfflineModeDisabled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final OfflineModeDisabled[] newArray(int i) {
                    return new OfflineModeDisabled[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private OfflineModeDisabled() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$Generic;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Generic extends Sms {
            public static final Generic INSTANCE = new Generic();
            public static final Parcelable.Creator<Generic> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Generic> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Generic createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Generic.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Generic[] newArray(int i) {
                    return new Generic[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private Generic() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$HeaderEnrichmentOfflineModeMissingPermission;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HeaderEnrichmentOfflineModeMissingPermission extends Sms {
            public static final HeaderEnrichmentOfflineModeMissingPermission INSTANCE = new HeaderEnrichmentOfflineModeMissingPermission();
            public static final Parcelable.Creator<HeaderEnrichmentOfflineModeMissingPermission> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<HeaderEnrichmentOfflineModeMissingPermission> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final HeaderEnrichmentOfflineModeMissingPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return HeaderEnrichmentOfflineModeMissingPermission.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final HeaderEnrichmentOfflineModeMissingPermission[] newArray(int i) {
                    return new HeaderEnrichmentOfflineModeMissingPermission[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private HeaderEnrichmentOfflineModeMissingPermission() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Sms$WrongMsisdn;", "Lcom/safaricom/consumer/commons/resource/ErrorType$Sms;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WrongMsisdn extends Sms {
            public static final WrongMsisdn INSTANCE = new WrongMsisdn();
            public static final Parcelable.Creator<WrongMsisdn> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<WrongMsisdn> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final WrongMsisdn createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return WrongMsisdn.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final WrongMsisdn[] newArray(int i) {
                    return new WrongMsisdn[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private WrongMsisdn() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Storage;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Storage extends ErrorType {
        public static final Storage INSTANCE = new Storage();
        public static final Parcelable.Creator<Storage> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Storage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Storage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Storage.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Storage[] newArray(int i) {
                return new Storage[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private Storage() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TurnMobileNetwork;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnMobileNetwork extends ErrorType {
        public static final TurnMobileNetwork INSTANCE = new TurnMobileNetwork();
        public static final Parcelable.Creator<TurnMobileNetwork> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TurnMobileNetwork> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetwork createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TurnMobileNetwork.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetwork[] newArray(int i) {
                return new TurnMobileNetwork[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TurnMobileNetwork() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TurnMobileNetworkForgotPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnMobileNetworkForgotPin extends ErrorType {
        public static final TurnMobileNetworkForgotPin INSTANCE = new TurnMobileNetworkForgotPin();
        public static final Parcelable.Creator<TurnMobileNetworkForgotPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TurnMobileNetworkForgotPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkForgotPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TurnMobileNetworkForgotPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkForgotPin[] newArray(int i) {
                return new TurnMobileNetworkForgotPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TurnMobileNetworkForgotPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TurnMobileNetworkChangePin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnMobileNetworkChangePin extends ErrorType {
        public static final TurnMobileNetworkChangePin INSTANCE = new TurnMobileNetworkChangePin();
        public static final Parcelable.Creator<TurnMobileNetworkChangePin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TurnMobileNetworkChangePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkChangePin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TurnMobileNetworkChangePin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkChangePin[] newArray(int i) {
                return new TurnMobileNetworkChangePin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TurnMobileNetworkChangePin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TurnMobileNetworkUnlockPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnMobileNetworkUnlockPin extends ErrorType {
        public static final TurnMobileNetworkUnlockPin INSTANCE = new TurnMobileNetworkUnlockPin();
        public static final Parcelable.Creator<TurnMobileNetworkUnlockPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TurnMobileNetworkUnlockPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkUnlockPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TurnMobileNetworkUnlockPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkUnlockPin[] newArray(int i) {
                return new TurnMobileNetworkUnlockPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TurnMobileNetworkUnlockPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TurnMobileNetworkOverWifi;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TurnMobileNetworkOverWifi extends ErrorType {
        public static final TurnMobileNetworkOverWifi INSTANCE = new TurnMobileNetworkOverWifi();
        public static final Parcelable.Creator<TurnMobileNetworkOverWifi> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TurnMobileNetworkOverWifi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkOverWifi createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TurnMobileNetworkOverWifi.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TurnMobileNetworkOverWifi[] newArray(int i) {
                return new TurnMobileNetworkOverWifi[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TurnMobileNetworkOverWifi() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MissingSimCard;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingSimCard extends ErrorType {
        public static final MissingSimCard INSTANCE = new MissingSimCard();
        public static final Parcelable.Creator<MissingSimCard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MissingSimCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MissingSimCard.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCard[] newArray(int i) {
                return new MissingSimCard[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MissingSimCard() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MissingSimCardForgotPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingSimCardForgotPin extends ErrorType {
        public static final MissingSimCardForgotPin INSTANCE = new MissingSimCardForgotPin();
        public static final Parcelable.Creator<MissingSimCardForgotPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MissingSimCardForgotPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardForgotPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MissingSimCardForgotPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardForgotPin[] newArray(int i) {
                return new MissingSimCardForgotPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MissingSimCardForgotPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MissingSimCardChangePin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingSimCardChangePin extends ErrorType {
        public static final MissingSimCardChangePin INSTANCE = new MissingSimCardChangePin();
        public static final Parcelable.Creator<MissingSimCardChangePin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MissingSimCardChangePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardChangePin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MissingSimCardChangePin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardChangePin[] newArray(int i) {
                return new MissingSimCardChangePin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MissingSimCardChangePin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MissingSimCardUnlockPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingSimCardUnlockPin extends ErrorType {
        public static final MissingSimCardUnlockPin INSTANCE = new MissingSimCardUnlockPin();
        public static final Parcelable.Creator<MissingSimCardUnlockPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MissingSimCardUnlockPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardUnlockPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MissingSimCardUnlockPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MissingSimCardUnlockPin[] newArray(int i) {
                return new MissingSimCardUnlockPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MissingSimCardUnlockPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$NotLocalNetworkSimCard;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotLocalNetworkSimCard extends ErrorType {
        public static final NotLocalNetworkSimCard INSTANCE = new NotLocalNetworkSimCard();
        public static final Parcelable.Creator<NotLocalNetworkSimCard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotLocalNetworkSimCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NotLocalNetworkSimCard.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCard[] newArray(int i) {
                return new NotLocalNetworkSimCard[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private NotLocalNetworkSimCard() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$NotLocalNetworkSimCardForgotPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotLocalNetworkSimCardForgotPin extends ErrorType {
        public static final NotLocalNetworkSimCardForgotPin INSTANCE = new NotLocalNetworkSimCardForgotPin();
        public static final Parcelable.Creator<NotLocalNetworkSimCardForgotPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotLocalNetworkSimCardForgotPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardForgotPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NotLocalNetworkSimCardForgotPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardForgotPin[] newArray(int i) {
                return new NotLocalNetworkSimCardForgotPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private NotLocalNetworkSimCardForgotPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$NotLocalNetworkSimCardChangePin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotLocalNetworkSimCardChangePin extends ErrorType {
        public static final NotLocalNetworkSimCardChangePin INSTANCE = new NotLocalNetworkSimCardChangePin();
        public static final Parcelable.Creator<NotLocalNetworkSimCardChangePin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotLocalNetworkSimCardChangePin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardChangePin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NotLocalNetworkSimCardChangePin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardChangePin[] newArray(int i) {
                return new NotLocalNetworkSimCardChangePin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private NotLocalNetworkSimCardChangePin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$NotLocalNetworkSimCardUnlockPin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotLocalNetworkSimCardUnlockPin extends ErrorType {
        public static final NotLocalNetworkSimCardUnlockPin INSTANCE = new NotLocalNetworkSimCardUnlockPin();
        public static final Parcelable.Creator<NotLocalNetworkSimCardUnlockPin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotLocalNetworkSimCardUnlockPin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardUnlockPin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return NotLocalNetworkSimCardUnlockPin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotLocalNetworkSimCardUnlockPin[] newArray(int i) {
                return new NotLocalNetworkSimCardUnlockPin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private NotLocalNetworkSimCardUnlockPin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$RequiresOffNetActivation;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequiresOffNetActivation extends ErrorType {
        public static final RequiresOffNetActivation INSTANCE = new RequiresOffNetActivation();
        public static final Parcelable.Creator<RequiresOffNetActivation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RequiresOffNetActivation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RequiresOffNetActivation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return RequiresOffNetActivation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RequiresOffNetActivation[] newArray(int i) {
                return new RequiresOffNetActivation[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private RequiresOffNetActivation() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$RequiresOTPValidation;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequiresOTPValidation extends ErrorType {
        public static final RequiresOTPValidation INSTANCE = new RequiresOTPValidation();
        public static final Parcelable.Creator<RequiresOTPValidation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RequiresOTPValidation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RequiresOTPValidation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return RequiresOTPValidation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RequiresOTPValidation[] newArray(int i) {
                return new RequiresOTPValidation[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private RequiresOTPValidation() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Requires2FALogin;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Requires2FALogin extends ErrorType {
        public static final Requires2FALogin INSTANCE = new Requires2FALogin();
        public static final Parcelable.Creator<Requires2FALogin> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Requires2FALogin> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Requires2FALogin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Requires2FALogin.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Requires2FALogin[] newArray(int i) {
                return new Requires2FALogin[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private Requires2FALogin() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$InvalidOTP;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidOTP extends ErrorType {
        public static final InvalidOTP INSTANCE = new InvalidOTP();
        public static final Parcelable.Creator<InvalidOTP> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InvalidOTP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final InvalidOTP createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return InvalidOTP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final InvalidOTP[] newArray(int i) {
                return new InvalidOTP[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private InvalidOTP() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$SimSwapped;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SimSwapped extends ErrorType {
        public static final SimSwapped INSTANCE = new SimSwapped();
        public static final Parcelable.Creator<SimSwapped> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SimSwapped> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final SimSwapped createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return SimSwapped.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final SimSwapped[] newArray(int i) {
                return new SimSwapped[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private SimSwapped() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$OverdrawOptIn;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OverdrawOptIn extends ErrorType {
        public static final OverdrawOptIn INSTANCE = new OverdrawOptIn();
        public static final Parcelable.Creator<OverdrawOptIn> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OverdrawOptIn> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawOptIn createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return OverdrawOptIn.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawOptIn[] newArray(int i) {
                return new OverdrawOptIn[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private OverdrawOptIn() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$OverdrawPendingConfirmation;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OverdrawPendingConfirmation extends ErrorType {
        public static final OverdrawPendingConfirmation INSTANCE = new OverdrawPendingConfirmation();
        public static final Parcelable.Creator<OverdrawPendingConfirmation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OverdrawPendingConfirmation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawPendingConfirmation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return OverdrawPendingConfirmation.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawPendingConfirmation[] newArray(int i) {
                return new OverdrawPendingConfirmation[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private OverdrawPendingConfirmation() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$ActivationLoginError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivationLoginError extends ErrorType {
        public static final ActivationLoginError INSTANCE = new ActivationLoginError();
        public static final Parcelable.Creator<ActivationLoginError> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActivationLoginError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ActivationLoginError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ActivationLoginError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ActivationLoginError[] newArray(int i) {
                return new ActivationLoginError[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private ActivationLoginError() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$OverdrawInactiveAccount;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OverdrawInactiveAccount extends ErrorType {
        public static final OverdrawInactiveAccount INSTANCE = new OverdrawInactiveAccount();
        public static final Parcelable.Creator<OverdrawInactiveAccount> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OverdrawInactiveAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawInactiveAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return OverdrawInactiveAccount.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdrawInactiveAccount[] newArray(int i) {
                return new OverdrawInactiveAccount[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private OverdrawInactiveAccount() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Vicinity;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Vicinity extends ErrorType {
        public static final Vicinity INSTANCE = new Vicinity();
        public static final Parcelable.Creator<Vicinity> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Vicinity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Vicinity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Vicinity.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Vicinity[] newArray(int i) {
                return new Vicinity[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private Vicinity() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$Unregistered;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unregistered extends ErrorType {
        public static final Unregistered INSTANCE = new Unregistered();
        public static final Parcelable.Creator<Unregistered> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unregistered> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Unregistered createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Unregistered.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Unregistered[] newArray(int i) {
                return new Unregistered[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private Unregistered() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AppVersionOutdated;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppVersionOutdated extends ErrorType {
        public static final AppVersionOutdated INSTANCE = new AppVersionOutdated();
        public static final Parcelable.Creator<AppVersionOutdated> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AppVersionOutdated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AppVersionOutdated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AppVersionOutdated.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AppVersionOutdated[] newArray(int i) {
                return new AppVersionOutdated[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private AppVersionOutdated() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountIdentityNotValidated;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccountIdentityNotValidated extends ErrorType {
        public static final AccountIdentityNotValidated INSTANCE = new AccountIdentityNotValidated();
        public static final Parcelable.Creator<AccountIdentityNotValidated> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AccountIdentityNotValidated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AccountIdentityNotValidated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return AccountIdentityNotValidated.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AccountIdentityNotValidated[] newArray(int i) {
                return new AccountIdentityNotValidated[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private AccountIdentityNotValidated() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$WrongSimCard;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WrongSimCard extends ErrorType {
        public static final WrongSimCard INSTANCE = new WrongSimCard();
        public static final Parcelable.Creator<WrongSimCard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WrongSimCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final WrongSimCard createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return WrongSimCard.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final WrongSimCard[] newArray(int i) {
                return new WrongSimCard[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private WrongSimCard() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$TillNumberError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TillNumberError extends ErrorType {
        public static final TillNumberError INSTANCE = new TillNumberError();
        public static final Parcelable.Creator<TillNumberError> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TillNumberError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TillNumberError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TillNumberError.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TillNumberError[] newArray(int i) {
                return new TillNumberError[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private TillNumberError() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "AgentLocation", "VicinityDeposit", "VicinityWithdraw", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$AgentLocation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$VicinityDeposit;", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$VicinityWithdraw;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class VicinityError extends ErrorType {
        private VicinityError() {
        }

        public VicinityError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$AgentLocation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AgentLocation extends VicinityError {
            public static final AgentLocation INSTANCE = new AgentLocation();
            public static final Parcelable.Creator<AgentLocation> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AgentLocation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AgentLocation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AgentLocation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AgentLocation[] newArray(int i) {
                    return new AgentLocation[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AgentLocation() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$VicinityDeposit;", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VicinityDeposit extends VicinityError {
            public static final VicinityDeposit INSTANCE = new VicinityDeposit();
            public static final Parcelable.Creator<VicinityDeposit> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VicinityDeposit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final VicinityDeposit createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return VicinityDeposit.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final VicinityDeposit[] newArray(int i) {
                    return new VicinityDeposit[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private VicinityDeposit() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError$VicinityWithdraw;", "Lcom/safaricom/consumer/commons/resource/ErrorType$VicinityError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VicinityWithdraw extends VicinityError {
            public static final VicinityWithdraw INSTANCE = new VicinityWithdraw();
            public static final Parcelable.Creator<VicinityWithdraw> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<VicinityWithdraw> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final VicinityWithdraw createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return VicinityWithdraw.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final VicinityWithdraw[] newArray(int i) {
                    return new VicinityWithdraw[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private VicinityWithdraw() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0016\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0016\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "AccountLocked", "AccountLockedIncorrectId", "AccountLockedIncorrectYearOfBirth", "AccountSuspended", "AccountNotRegistered", "AccountFrozen", "AccountInvalid", "AccountInactive", "PendingActivation", "NotWhiteListed", "AccountNotAvailable", "PreCreatedOwnerOperatorMissing", "InvalidMsisdn", "InvalidMsisdnSmsChannel", "MaliciousUserRequest", "AccessForbidden", "MsisdnLimitation", "UnexpectedError", "ActivateAccountIncorrectYearOfBirth", "ActivateAccountLocked", "AccountLockedMaxRetries", "NoSecurityCredential", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccessForbidden;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountFrozen;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountInactive;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountInvalid;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLocked;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedIncorrectId;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedIncorrectYearOfBirth;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedMaxRetries;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountNotAvailable;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountNotRegistered;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountSuspended;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$ActivateAccountIncorrectYearOfBirth;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$ActivateAccountLocked;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$InvalidMsisdn;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$InvalidMsisdnSmsChannel;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$MaliciousUserRequest;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$MsisdnLimitation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$NoSecurityCredential;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$NotWhiteListed;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$PendingActivation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$PreCreatedOwnerOperatorMissing;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$UnexpectedError;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AccountError extends ErrorType {
        private AccountError() {
        }

        public AccountError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLocked;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountLocked extends AccountError {
            public static final AccountLocked INSTANCE = new AccountLocked();
            public static final Parcelable.Creator<AccountLocked> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountLocked> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLocked createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountLocked.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLocked[] newArray(int i) {
                    return new AccountLocked[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountLocked() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedIncorrectId;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountLockedIncorrectId extends AccountError {
            public static final AccountLockedIncorrectId INSTANCE = new AccountLockedIncorrectId();
            public static final Parcelable.Creator<AccountLockedIncorrectId> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountLockedIncorrectId> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedIncorrectId createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountLockedIncorrectId.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedIncorrectId[] newArray(int i) {
                    return new AccountLockedIncorrectId[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountLockedIncorrectId() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedIncorrectYearOfBirth;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountLockedIncorrectYearOfBirth extends AccountError {
            public static final AccountLockedIncorrectYearOfBirth INSTANCE = new AccountLockedIncorrectYearOfBirth();
            public static final Parcelable.Creator<AccountLockedIncorrectYearOfBirth> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountLockedIncorrectYearOfBirth> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedIncorrectYearOfBirth createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountLockedIncorrectYearOfBirth.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedIncorrectYearOfBirth[] newArray(int i) {
                    return new AccountLockedIncorrectYearOfBirth[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountLockedIncorrectYearOfBirth() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountSuspended;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "text", "", "subText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountSuspended extends AccountError {
            public static final Parcelable.Creator<AccountSuspended> CREATOR = new Creator();
            private final String subText;
            private final String text;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountSuspended> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountSuspended createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AccountSuspended(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountSuspended[] newArray(int i) {
                    return new AccountSuspended[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            public AccountSuspended(String str, String str2) {
                super(null);
                this.text = str;
                this.subText = str2;
            }

            public AccountSuspended(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final String getSubText() {
                return this.subText;
            }

            public final String getText() {
                return this.text;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AccountSuspended() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static AccountSuspended copy$default(AccountSuspended accountSuspended, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountSuspended.text;
                }
                if ((i & 2) != 0) {
                    str2 = accountSuspended.subText;
                }
                return accountSuspended.copy(str, str2);
            }

            public final String getText() {
                return this.text;
            }

            public final String getSubText() {
                return this.subText;
            }

            public final AccountSuspended copy(String text, String subText) {
                return new AccountSuspended(text, subText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountSuspended)) {
                    return false;
                }
                AccountSuspended accountSuspended = (AccountSuspended) other;
                return Intrinsics.areEqual(this.text, accountSuspended.text) && Intrinsics.areEqual(this.subText, accountSuspended.subText);
            }

            public int hashCode() {
                String str = this.text;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.subText;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AccountSuspended(text=" + this.text + ", subText=" + this.subText + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeString(this.text);
                dest.writeString(this.subText);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountNotRegistered;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountNotRegistered extends AccountError {
            public static final Parcelable.Creator<AccountNotRegistered> CREATOR = new Creator();
            private final String msisdn;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountNotRegistered> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountNotRegistered createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AccountNotRegistered(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountNotRegistered[] newArray(int i) {
                    return new AccountNotRegistered[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountNotRegistered(String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.msisdn = str;
            }

            public final String getMsisdn() {
                return this.msisdn;
            }

            public static AccountNotRegistered copy$default(AccountNotRegistered accountNotRegistered, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountNotRegistered.msisdn;
                }
                return accountNotRegistered.copy(str);
            }

            public final String getMsisdn() {
                return this.msisdn;
            }

            public final AccountNotRegistered copy(String msisdn) {
                Intrinsics.checkNotNullParameter(msisdn, "");
                return new AccountNotRegistered(msisdn);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountNotRegistered) && Intrinsics.areEqual(this.msisdn, ((AccountNotRegistered) other).msisdn);
            }

            public int hashCode() {
                return this.msisdn.hashCode();
            }

            public String toString() {
                return "AccountNotRegistered(msisdn=" + this.msisdn + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeString(this.msisdn);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountFrozen;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "text", "", "subText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubText", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountFrozen extends AccountError {
            public static final Parcelable.Creator<AccountFrozen> CREATOR = new Creator();
            private final String subText;
            private final String text;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountFrozen> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountFrozen createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AccountFrozen(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountFrozen[] newArray(int i) {
                    return new AccountFrozen[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            public AccountFrozen(String str, String str2) {
                super(null);
                this.text = str;
                this.subText = str2;
            }

            public AccountFrozen(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final String getSubText() {
                return this.subText;
            }

            public final String getText() {
                return this.text;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AccountFrozen() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static AccountFrozen copy$default(AccountFrozen accountFrozen, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountFrozen.text;
                }
                if ((i & 2) != 0) {
                    str2 = accountFrozen.subText;
                }
                return accountFrozen.copy(str, str2);
            }

            public final String getText() {
                return this.text;
            }

            public final String getSubText() {
                return this.subText;
            }

            public final AccountFrozen copy(String text, String subText) {
                return new AccountFrozen(text, subText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountFrozen)) {
                    return false;
                }
                AccountFrozen accountFrozen = (AccountFrozen) other;
                return Intrinsics.areEqual(this.text, accountFrozen.text) && Intrinsics.areEqual(this.subText, accountFrozen.subText);
            }

            public int hashCode() {
                String str = this.text;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.subText;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AccountFrozen(text=" + this.text + ", subText=" + this.subText + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeString(this.text);
                dest.writeString(this.subText);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountInvalid;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountInvalid extends AccountError {
            public static final AccountInvalid INSTANCE = new AccountInvalid();
            public static final Parcelable.Creator<AccountInvalid> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountInvalid> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountInvalid createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountInvalid.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountInvalid[] newArray(int i) {
                    return new AccountInvalid[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountInvalid() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountInactive;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountInactive extends AccountError {
            public static final AccountInactive INSTANCE = new AccountInactive();
            public static final Parcelable.Creator<AccountInactive> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountInactive> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountInactive createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountInactive.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountInactive[] newArray(int i) {
                    return new AccountInactive[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountInactive() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$PendingActivation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PendingActivation extends AccountError {
            public static final PendingActivation INSTANCE = new PendingActivation();
            public static final Parcelable.Creator<PendingActivation> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PendingActivation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final PendingActivation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return PendingActivation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final PendingActivation[] newArray(int i) {
                    return new PendingActivation[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private PendingActivation() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$NotWhiteListed;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotWhiteListed extends AccountError {
            public static final NotWhiteListed INSTANCE = new NotWhiteListed();
            public static final Parcelable.Creator<NotWhiteListed> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NotWhiteListed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NotWhiteListed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NotWhiteListed.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NotWhiteListed[] newArray(int i) {
                    return new NotWhiteListed[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private NotWhiteListed() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountNotAvailable;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountNotAvailable extends AccountError {
            public static final AccountNotAvailable INSTANCE = new AccountNotAvailable();
            public static final Parcelable.Creator<AccountNotAvailable> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountNotAvailable> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountNotAvailable createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountNotAvailable.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountNotAvailable[] newArray(int i) {
                    return new AccountNotAvailable[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountNotAvailable() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$PreCreatedOwnerOperatorMissing;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "tillNumber", "", "<init>", "(Ljava/lang/String;)V", "getTillNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PreCreatedOwnerOperatorMissing extends AccountError {
            public static final Parcelable.Creator<PreCreatedOwnerOperatorMissing> CREATOR = new Creator();
            private final String tillNumber;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PreCreatedOwnerOperatorMissing> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final PreCreatedOwnerOperatorMissing createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new PreCreatedOwnerOperatorMissing(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final PreCreatedOwnerOperatorMissing[] newArray(int i) {
                    return new PreCreatedOwnerOperatorMissing[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PreCreatedOwnerOperatorMissing(String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.tillNumber = str;
            }

            public final String getTillNumber() {
                return this.tillNumber;
            }

            public static PreCreatedOwnerOperatorMissing copy$default(PreCreatedOwnerOperatorMissing preCreatedOwnerOperatorMissing, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = preCreatedOwnerOperatorMissing.tillNumber;
                }
                return preCreatedOwnerOperatorMissing.copy(str);
            }

            public final String getTillNumber() {
                return this.tillNumber;
            }

            public final PreCreatedOwnerOperatorMissing copy(String tillNumber) {
                Intrinsics.checkNotNullParameter(tillNumber, "");
                return new PreCreatedOwnerOperatorMissing(tillNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PreCreatedOwnerOperatorMissing) && Intrinsics.areEqual(this.tillNumber, ((PreCreatedOwnerOperatorMissing) other).tillNumber);
            }

            public int hashCode() {
                return this.tillNumber.hashCode();
            }

            public String toString() {
                return "PreCreatedOwnerOperatorMissing(tillNumber=" + this.tillNumber + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeString(this.tillNumber);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$InvalidMsisdn;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidMsisdn extends AccountError {
            public static final InvalidMsisdn INSTANCE = new InvalidMsisdn();
            public static final Parcelable.Creator<InvalidMsisdn> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InvalidMsisdn> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidMsisdn createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return InvalidMsisdn.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidMsisdn[] newArray(int i) {
                    return new InvalidMsisdn[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private InvalidMsisdn() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$InvalidMsisdnSmsChannel;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidMsisdnSmsChannel extends AccountError {
            public static final InvalidMsisdnSmsChannel INSTANCE = new InvalidMsisdnSmsChannel();
            public static final Parcelable.Creator<InvalidMsisdnSmsChannel> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InvalidMsisdnSmsChannel> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidMsisdnSmsChannel createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return InvalidMsisdnSmsChannel.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidMsisdnSmsChannel[] newArray(int i) {
                    return new InvalidMsisdnSmsChannel[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private InvalidMsisdnSmsChannel() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$MaliciousUserRequest;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MaliciousUserRequest extends AccountError {
            public static final MaliciousUserRequest INSTANCE = new MaliciousUserRequest();
            public static final Parcelable.Creator<MaliciousUserRequest> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MaliciousUserRequest> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MaliciousUserRequest createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return MaliciousUserRequest.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MaliciousUserRequest[] newArray(int i) {
                    return new MaliciousUserRequest[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private MaliciousUserRequest() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccessForbidden;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccessForbidden extends AccountError {
            public static final AccessForbidden INSTANCE = new AccessForbidden();
            public static final Parcelable.Creator<AccessForbidden> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccessForbidden> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccessForbidden createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccessForbidden.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccessForbidden[] newArray(int i) {
                    return new AccessForbidden[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccessForbidden() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$MsisdnLimitation;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MsisdnLimitation extends AccountError {
            public static final MsisdnLimitation INSTANCE = new MsisdnLimitation();
            public static final Parcelable.Creator<MsisdnLimitation> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MsisdnLimitation> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MsisdnLimitation createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return MsisdnLimitation.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final MsisdnLimitation[] newArray(int i) {
                    return new MsisdnLimitation[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private MsisdnLimitation() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$UnexpectedError;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnexpectedError extends AccountError {
            public static final UnexpectedError INSTANCE = new UnexpectedError();
            public static final Parcelable.Creator<UnexpectedError> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UnexpectedError> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final UnexpectedError createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return UnexpectedError.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final UnexpectedError[] newArray(int i) {
                    return new UnexpectedError[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private UnexpectedError() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$ActivateAccountIncorrectYearOfBirth;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ActivateAccountIncorrectYearOfBirth extends AccountError {
            public static final ActivateAccountIncorrectYearOfBirth INSTANCE = new ActivateAccountIncorrectYearOfBirth();
            public static final Parcelable.Creator<ActivateAccountIncorrectYearOfBirth> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActivateAccountIncorrectYearOfBirth> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ActivateAccountIncorrectYearOfBirth createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return ActivateAccountIncorrectYearOfBirth.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ActivateAccountIncorrectYearOfBirth[] newArray(int i) {
                    return new ActivateAccountIncorrectYearOfBirth[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private ActivateAccountIncorrectYearOfBirth() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$ActivateAccountLocked;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ActivateAccountLocked extends AccountError {
            public static final ActivateAccountLocked INSTANCE = new ActivateAccountLocked();
            public static final Parcelable.Creator<ActivateAccountLocked> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActivateAccountLocked> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ActivateAccountLocked createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return ActivateAccountLocked.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ActivateAccountLocked[] newArray(int i) {
                    return new ActivateAccountLocked[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private ActivateAccountLocked() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$AccountLockedMaxRetries;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AccountLockedMaxRetries extends AccountError {
            public static final AccountLockedMaxRetries INSTANCE = new AccountLockedMaxRetries();
            public static final Parcelable.Creator<AccountLockedMaxRetries> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AccountLockedMaxRetries> {
                public static void ShareDataUIState() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedMaxRetries createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return AccountLockedMaxRetries.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final AccountLockedMaxRetries[] newArray(int i) {
                    return new AccountLockedMaxRetries[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private AccountLockedMaxRetries() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError$NoSecurityCredential;", "Lcom/safaricom/consumer/commons/resource/ErrorType$AccountError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoSecurityCredential extends AccountError {
            public static final NoSecurityCredential INSTANCE = new NoSecurityCredential();
            public static final Parcelable.Creator<NoSecurityCredential> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NoSecurityCredential> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NoSecurityCredential createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return NoSecurityCredential.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final NoSecurityCredential[] newArray(int i) {
                    return new NoSecurityCredential[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private NoSecurityCredential() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$NotificationError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "syncMode", "", "<init>", "(Ljava/lang/String;)V", "getSyncMode", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationError extends ErrorType {
        public static final Parcelable.Creator<NotificationError> CREATOR = new Creator();
        private final String syncMode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotificationError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotificationError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new NotificationError(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final NotificationError[] newArray(int i) {
                return new NotificationError[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public NotificationError(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.syncMode = str;
        }

        public final String getSyncMode() {
            return this.syncMode;
        }

        public static NotificationError copy$default(NotificationError notificationError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notificationError.syncMode;
            }
            return notificationError.copy(str);
        }

        public final String getSyncMode() {
            return this.syncMode;
        }

        public final NotificationError copy(String syncMode) {
            Intrinsics.checkNotNullParameter(syncMode, "");
            return new NotificationError(syncMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationError) && Intrinsics.areEqual(this.syncMode, ((NotificationError) other).syncMode);
        }

        public int hashCode() {
            return this.syncMode.hashCode();
        }

        public String toString() {
            return "NotificationError(syncMode=" + this.syncMode + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.syncMode);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "FetchMiniApps", "InvalidAppSigning", "Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError$FetchMiniApps;", "Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError$InvalidAppSigning;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MiniAppsSDKError extends ErrorType {
        private MiniAppsSDKError() {
        }

        public MiniAppsSDKError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError$FetchMiniApps;", "Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError;", "errorCode", "", "error", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError$FetchMiniApps;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FetchMiniApps extends MiniAppsSDKError {
            public static final Parcelable.Creator<FetchMiniApps> CREATOR = new Creator();
            private final String error;
            private final Integer errorCode;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FetchMiniApps> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final FetchMiniApps createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new FetchMiniApps(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final FetchMiniApps[] newArray(int i) {
                    return new FetchMiniApps[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            public FetchMiniApps(Integer num, String str) {
                super(null);
                this.errorCode = num;
                this.error = str;
            }

            public FetchMiniApps(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, str);
            }

            public final String getError() {
                return this.error;
            }

            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public static FetchMiniApps copy$default(FetchMiniApps fetchMiniApps, Integer num, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = fetchMiniApps.errorCode;
                }
                if ((i & 2) != 0) {
                    str = fetchMiniApps.error;
                }
                return fetchMiniApps.copy(num, str);
            }

            public final Integer getErrorCode() {
                return this.errorCode;
            }

            public final String getError() {
                return this.error;
            }

            public final FetchMiniApps copy(Integer errorCode, String error) {
                return new FetchMiniApps(errorCode, error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchMiniApps)) {
                    return false;
                }
                FetchMiniApps fetchMiniApps = (FetchMiniApps) other;
                return Intrinsics.areEqual(this.errorCode, fetchMiniApps.errorCode) && Intrinsics.areEqual(this.error, fetchMiniApps.error);
            }

            public int hashCode() {
                Integer num = this.errorCode;
                int iHashCode = num == null ? 0 : num.hashCode();
                String str = this.error;
                return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "FetchMiniApps(errorCode=" + this.errorCode + ", error=" + this.error + ')';
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(dest, "");
                Integer num = this.errorCode;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeString(this.error);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError$InvalidAppSigning;", "Lcom/safaricom/consumer/commons/resource/ErrorType$MiniAppsSDKError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidAppSigning extends MiniAppsSDKError {
            public static final InvalidAppSigning INSTANCE = new InvalidAppSigning();
            public static final Parcelable.Creator<InvalidAppSigning> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InvalidAppSigning> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidAppSigning createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return InvalidAppSigning.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final InvalidAppSigning[] newArray(int i) {
                    return new InvalidAppSigning[i];
                }
            }

            @Override
            public final int describeContents() {
                return 0;
            }

            private InvalidAppSigning() {
                super(null);
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$PochiLaBiasharaNotEligible;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PochiLaBiasharaNotEligible extends ErrorType {
        public static final PochiLaBiasharaNotEligible INSTANCE = new PochiLaBiasharaNotEligible();
        public static final Parcelable.Creator<PochiLaBiasharaNotEligible> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PochiLaBiasharaNotEligible> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PochiLaBiasharaNotEligible createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PochiLaBiasharaNotEligible.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PochiLaBiasharaNotEligible[] newArray(int i) {
                return new PochiLaBiasharaNotEligible[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private PochiLaBiasharaNotEligible() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/resource/ErrorType$MultipleAttempts;", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MultipleAttempts extends ErrorType {
        public static final MultipleAttempts INSTANCE = new MultipleAttempts();
        public static final Parcelable.Creator<MultipleAttempts> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultipleAttempts> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MultipleAttempts createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return MultipleAttempts.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MultipleAttempts[] newArray(int i) {
                return new MultipleAttempts[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private MultipleAttempts() {
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }
}
