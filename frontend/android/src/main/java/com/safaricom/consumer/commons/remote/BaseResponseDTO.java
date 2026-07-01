package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import com.safaricom.consumer.commons.resource.AdditionalFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/safaricom/consumer/commons/remote/BaseResponseDTO;", "", "requestId", "", "status", "error", "Lcom/safaricom/consumer/commons/remote/Error;", "additionalFields", "Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/remote/Error;Lcom/safaricom/consumer/commons/resource/AdditionalFields;)V", "getRequestId", "()Ljava/lang/String;", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getError", "()Lcom/safaricom/consumer/commons/remote/Error;", "getAdditionalFields", "()Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "isSucceeded", "", "()Z", "resourceName", "getResourceName", "toString", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseResponseDTO {
    private static final String component1 = "SUCCEEDED";
    private final String ShareDataUIState;

    @SerializedName("error")
    private final Error component2;

    @SerializedName("additionalFields")
    private final AdditionalFields component3;

    @SerializedName("requestId")
    private final String copydefault;

    @SerializedName("status")
    private String getAsAtTimestamp;

    public BaseResponseDTO(String str, String str2, Error error, AdditionalFields additionalFields) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.getAsAtTimestamp = str2;
        this.component2 = error;
        this.component3 = additionalFields;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public BaseResponseDTO(String str, String str2, Error error, AdditionalFields additionalFields, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "UNKNOWN" : str2, (i & 4) != 0 ? null : error, (i & 8) != 0 ? null : additionalFields);
    }

    public final String getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getAsAtTimestamp = str;
    }

    public final Error getComponent2() {
        return this.component2;
    }

    public final AdditionalFields getComponent3() {
        return this.component3;
    }

    public final boolean isSucceeded() {
        return Intrinsics.areEqual(this.getAsAtTimestamp, "SUCCEEDED");
    }

    public String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public String toString() {
        return "requestId:" + this.copydefault + ", status:" + this.getAsAtTimestamp + ", error:" + this.component2 + ", additionalFields=" + this.component3;
    }

    public BaseResponseDTO() {
        this(null, null, null, null, 15, null);
    }
}
