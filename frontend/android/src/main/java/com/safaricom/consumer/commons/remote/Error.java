package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import com.safaricom.consumer.commons.resource.AdditionalFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/safaricom/consumer/commons/remote/Error;", "", "errorCode", "", "message", "errorSource", "additionalFields", "Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/resource/AdditionalFields;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getErrorSource", "getAdditionalFields", "()Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Error {

    @SerializedName("message")
    private final String ShareDataUIState;

    @SerializedName("errorCode")
    private final String component1;

    @SerializedName("additionalFields")
    private final AdditionalFields component2;

    @SerializedName("errorSource")
    private final String copydefault;

    public Error(String str, String str2, String str3, AdditionalFields additionalFields) {
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.copydefault = str3;
        this.component2 = additionalFields;
    }

    public Error(String str, String str2, String str3, AdditionalFields additionalFields, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : additionalFields);
    }

    public final String getErrorCode() {
        return this.component1;
    }

    public final String getMessage() {
        return this.ShareDataUIState;
    }

    public final String getErrorSource() {
        return this.copydefault;
    }

    public final AdditionalFields getAdditionalFields() {
        return this.component2;
    }

    public Error() {
        this(null, null, null, null, 15, null);
    }

    public static Error copy$default(Error error, String str, String str2, String str3, AdditionalFields additionalFields, int i, Object obj) {
        if ((i & 1) != 0) {
            str = error.component1;
        }
        if ((i & 2) != 0) {
            str2 = error.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            str3 = error.copydefault;
        }
        if ((i & 8) != 0) {
            additionalFields = error.component2;
        }
        return error.copy(str, str2, str3, additionalFields);
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final AdditionalFields getComponent2() {
        return this.component2;
    }

    public final Error copy(String errorCode, String message, String errorSource, AdditionalFields additionalFields) {
        return new Error(errorCode, message, errorSource, additionalFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return Intrinsics.areEqual(this.component1, error.component1) && Intrinsics.areEqual(this.ShareDataUIState, error.ShareDataUIState) && Intrinsics.areEqual(this.copydefault, error.copydefault) && Intrinsics.areEqual(this.component2, error.component2);
    }

    public int hashCode() {
        String str = this.component1;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ShareDataUIState;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.copydefault;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        AdditionalFields additionalFields = this.component2;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (additionalFields != null ? additionalFields.hashCode() : 0);
    }

    public String toString() {
        return "Error(errorCode=" + this.component1 + ", message=" + this.ShareDataUIState + ", errorSource=" + this.copydefault + ", additionalFields=" + this.component2 + ')';
    }
}
