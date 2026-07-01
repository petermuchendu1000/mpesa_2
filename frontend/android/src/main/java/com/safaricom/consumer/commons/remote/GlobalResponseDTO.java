package com.safaricom.consumer.commons.remote;

import com.google.gson.annotations.SerializedName;
import com.safaricom.consumer.commons.resource.AdditionalFields;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\b\u0010%\u001a\u00020\u0003H\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0010\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lcom/safaricom/consumer/commons/remote/GlobalResponseDTO;", "", "requestId", "", "globalStatus", "error", "message", "additionalFields", "Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "tokenInfo", "Lcom/safaricom/consumer/commons/remote/SessionTokenDTO;", "cachingDirectivesDto", "Lcom/safaricom/consumer/commons/remote/CachingDirectivesDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/resource/AdditionalFields;Lcom/safaricom/consumer/commons/remote/SessionTokenDTO;Lcom/safaricom/consumer/commons/remote/CachingDirectivesDto;)V", "getRequestId", "()Ljava/lang/String;", "getGlobalStatus", "setGlobalStatus", "(Ljava/lang/String;)V", "getError", "getMessage", "getAdditionalFields", "()Lcom/safaricom/consumer/commons/resource/AdditionalFields;", "getTokenInfo", "()Lcom/safaricom/consumer/commons/remote/SessionTokenDTO;", "setTokenInfo", "(Lcom/safaricom/consumer/commons/remote/SessionTokenDTO;)V", "getCachingDirectivesDto", "()Lcom/safaricom/consumer/commons/remote/CachingDirectivesDto;", "setCachingDirectivesDto", "(Lcom/safaricom/consumer/commons/remote/CachingDirectivesDto;)V", "isError", "", "getBaseResponses", "", "Lcom/safaricom/consumer/commons/remote/BaseResponseDTO;", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class GlobalResponseDTO {

    @SerializedName("message")
    private final String ShareDataUIState;

    @SerializedName("errorCode")
    private final String component1;

    @SerializedName("additionalFields")
    private final AdditionalFields component2;

    @SerializedName("globalStatus")
    private String component3;

    @SerializedName("requestId")
    private final String copy;

    @SerializedName("cachingDirectives")
    private CachingDirectivesDto copydefault;

    @SerializedName("newSessionToken")
    private SessionTokenDTO getRequestBeneficiariesState;

    public GlobalResponseDTO(String str, String str2, String str3, String str4, AdditionalFields additionalFields, SessionTokenDTO sessionTokenDTO, CachingDirectivesDto cachingDirectivesDto) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copy = str;
        this.component3 = str2;
        this.component1 = str3;
        this.ShareDataUIState = str4;
        this.component2 = additionalFields;
        this.getRequestBeneficiariesState = sessionTokenDTO;
        this.copydefault = cachingDirectivesDto;
    }

    public final String getCopy() {
        return this.copy;
    }

    public GlobalResponseDTO(String str, String str2, String str3, String str4, AdditionalFields additionalFields, SessionTokenDTO sessionTokenDTO, CachingDirectivesDto cachingDirectivesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "UNKNOWN" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : additionalFields, (i & 32) != 0 ? null : sessionTokenDTO, (i & 64) == 0 ? cachingDirectivesDto : null);
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final void setGlobalStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final AdditionalFields getComponent2() {
        return this.component2;
    }

    public final SessionTokenDTO getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final void setTokenInfo(SessionTokenDTO sessionTokenDTO) {
        this.getRequestBeneficiariesState = sessionTokenDTO;
    }

    public final CachingDirectivesDto getCopydefault() {
        return this.copydefault;
    }

    public final void setCachingDirectivesDto(CachingDirectivesDto cachingDirectivesDto) {
        this.copydefault = cachingDirectivesDto;
    }

    public final boolean isError() {
        return this.component1 != null;
    }

    public List<BaseResponseDTO> getBaseResponses() {
        return CollectionsKt.emptyList();
    }

    public String toString() {
        return "GlobalResponseDTO(requestId='" + this.copy + "', globalStatus='" + this.component3 + "', error='" + this.component1 + "', message='" + this.ShareDataUIState + "', cachingDirectives='" + this.copydefault + "')";
    }

    public GlobalResponseDTO() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
