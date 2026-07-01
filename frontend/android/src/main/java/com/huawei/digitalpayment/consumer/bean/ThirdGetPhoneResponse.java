package com.huawei.digitalpayment.consumer.bean;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse;", "", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ServiceResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ServiceResponse", "ResponseHeader", "ResponseBody", "Response", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdGetPhoneResponse {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("ServiceResponse")
    private final ServiceResponse serviceResponse;

    public ThirdGetPhoneResponse(ServiceResponse serviceResponse) {
        this.serviceResponse = serviceResponse;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThirdGetPhoneResponse(ServiceResponse serviceResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 3;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            serviceResponse = null;
        }
        this(serviceResponse);
    }

    public final ServiceResponse getServiceResponse() {
        ServiceResponse serviceResponse;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            serviceResponse = this.serviceResponse;
            int i4 = 1 / 0;
        } else {
            serviceResponse = this.serviceResponse;
        }
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return serviceResponse;
    }

    static {
        int i = 1 + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ServiceResponse;", "", "responseHeader", "Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseHeader;", "responseBody", "Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseHeader;Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseHeader;", "getResponseBody", "()Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServiceResponse {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        @SerializedName("ResponseBody")
        private final ResponseBody responseBody;

        @SerializedName("ResponseHeader")
        private final ResponseHeader responseHeader;

        public ServiceResponse(ResponseHeader responseHeader, ResponseBody responseBody) {
            this.responseHeader = responseHeader;
            this.responseBody = responseBody;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ServiceResponse(ResponseHeader responseHeader, ResponseBody responseBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component1 + 27;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                responseHeader = null;
            }
            if ((i & 2) != 0) {
                int i4 = component1 + 73;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = 2 % 2;
                responseBody = null;
            }
            this(responseHeader, responseBody);
        }

        public final ResponseHeader getResponseHeader() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 19;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            ResponseHeader responseHeader = this.responseHeader;
            int i5 = i2 + 35;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return responseHeader;
        }

        public final ResponseBody getResponseBody() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 89;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            ResponseBody responseBody = this.responseBody;
            int i5 = i2 + 87;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 23 / 0;
            }
            return responseBody;
        }

        static {
            int i = 1 + 93;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 48 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static ServiceResponse copy$default(ServiceResponse serviceResponse, ResponseHeader responseHeader, ResponseBody responseBody, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                responseHeader = serviceResponse.responseHeader;
                int i5 = i3 + 117;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
            if ((i & 2) != 0) {
                int i7 = ShareDataUIState + 27;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    ResponseBody responseBody2 = serviceResponse.responseBody;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                responseBody = serviceResponse.responseBody;
            }
            return serviceResponse.copy(responseHeader, responseBody);
        }

        public final ResponseHeader component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            int i3 = i2 % 128;
            component1 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            ResponseHeader responseHeader = this.responseHeader;
            int i4 = i3 + 31;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return responseHeader;
            }
            throw null;
        }

        public final ResponseBody component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            ResponseBody responseBody = this.responseBody;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 65 / 0;
            }
            return responseBody;
        }

        public final ServiceResponse copy(ResponseHeader responseHeader, ResponseBody responseBody) {
            int i = 2 % 2;
            ServiceResponse serviceResponse = new ServiceResponse(responseHeader, responseBody);
            int i2 = component1 + 11;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 6 / 0;
            }
            return serviceResponse;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceResponse)) {
                int i2 = ShareDataUIState + 91;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ServiceResponse serviceResponse = (ServiceResponse) other;
            if (Intrinsics.areEqual(this.responseHeader, serviceResponse.responseHeader)) {
                return Intrinsics.areEqual(this.responseBody, serviceResponse.responseBody);
            }
            int i4 = component1 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ResponseHeader responseHeader = this.responseHeader;
            int iHashCode = 0;
            int iHashCode2 = responseHeader == null ? 0 : responseHeader.hashCode();
            ResponseBody responseBody = this.responseBody;
            if (responseBody != null) {
                iHashCode = responseBody.hashCode();
                int i4 = component1 + 83;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = (iHashCode2 * 31) + iHashCode;
            int i7 = ShareDataUIState + 39;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ServiceResponse(responseHeader=" + this.responseHeader + ", responseBody=" + this.responseBody + ")";
            int i2 = ShareDataUIState + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdGetPhoneResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static ThirdGetPhoneResponse copy$default(ThirdGetPhoneResponse thirdGetPhoneResponse, ServiceResponse serviceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 5;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                ServiceResponse serviceResponse2 = thirdGetPhoneResponse.serviceResponse;
                throw null;
            }
            serviceResponse = thirdGetPhoneResponse.serviceResponse;
        }
        ThirdGetPhoneResponse thirdGetPhoneResponseCopy = thirdGetPhoneResponse.copy(serviceResponse);
        int i4 = component1 + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return thirdGetPhoneResponseCopy;
        }
        throw null;
    }

    public final ServiceResponse component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ServiceResponse serviceResponse = this.serviceResponse;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return serviceResponse;
    }

    public final ThirdGetPhoneResponse copy(ServiceResponse serviceResponse) {
        int i = 2 % 2;
        ThirdGetPhoneResponse thirdGetPhoneResponse = new ThirdGetPhoneResponse(serviceResponse);
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return thirdGetPhoneResponse;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 15;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof ThirdGetPhoneResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.serviceResponse, ((ThirdGetPhoneResponse) other).serviceResponse)) {
            return true;
        }
        int i3 = ShareDataUIState + 109;
        component1 = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ServiceResponse serviceResponse = this.serviceResponse;
        if (serviceResponse == null) {
            int i5 = i3 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = serviceResponse.hashCode();
        }
        int i7 = component1 + 67;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThirdGetPhoneResponse(serviceResponse=" + this.serviceResponse + ")";
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseHeader;", "", "responseCode", "", "responseMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResponseCode", "()Ljava/lang/String;", "getResponseMsg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseHeader {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 97 % 128;

        @SerializedName("ResponseCode")
        private final String responseCode;

        @SerializedName("ResponseMsg")
        private final String responseMsg;

        public ResponseHeader(String str, String str2) {
            this.responseCode = str;
            this.responseMsg = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResponseHeader(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component2 + 25;
                int i3 = i2 % 128;
                component1 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 99;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i8 = component2 + 37;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        public final String getResponseCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.responseCode;
            int i5 = i2 + 77;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 80 / 0;
            }
            return str;
        }

        public final String getResponseMsg() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 39;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.responseMsg;
            int i5 = i2 + 49;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return str;
        }

        static {
            int i = 97 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResponseHeader() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static ResponseHeader copy$default(ResponseHeader responseHeader, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            Object obj2 = null;
            if ((i & 1) != 0) {
                int i3 = component1 + 105;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    String str3 = responseHeader.responseCode;
                    obj2.hashCode();
                    throw null;
                }
                str = responseHeader.responseCode;
            }
            if ((i & 2) != 0) {
                int i4 = component2 + 41;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    str2 = responseHeader.responseMsg;
                    int i5 = 3 / 0;
                } else {
                    str2 = responseHeader.responseMsg;
                }
            }
            ResponseHeader responseHeaderCopy = responseHeader.copy(str, str2);
            int i6 = component1 + 89;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return responseHeaderCopy;
            }
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1 + 57;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.responseCode;
            int i5 = i3 + 29;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component1 + 117;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.responseMsg;
            int i5 = i3 + 87;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return str;
        }

        public final ResponseHeader copy(String responseCode, String responseMsg) {
            int i = 2 % 2;
            ResponseHeader responseHeader = new ResponseHeader(responseCode, responseMsg);
            int i2 = component1 + 19;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return responseHeader;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 43;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            Object obj = null;
            if (!(other instanceof ResponseHeader)) {
                int i5 = i2 + 91;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            ResponseHeader responseHeader = (ResponseHeader) other;
            if (!Intrinsics.areEqual(this.responseCode, responseHeader.responseCode)) {
                int i6 = component2 + 5;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(this.responseMsg, responseHeader.responseMsg)) {
                return false;
            }
            int i7 = component1 + 41;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.responseCode;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = component2 + 125;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.responseMsg;
            if (str2 == null) {
                int i4 = component1 + 57;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = str2.hashCode();
            }
            int i6 = (iHashCode * 31) + iHashCode2;
            int i7 = component1 + 99;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResponseHeader(responseCode=" + this.responseCode + ", responseMsg=" + this.responseMsg + ")";
            int i2 = component2 + 125;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$ResponseBody;", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$Response;", "<init>", "(Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$Response;)V", "getResponse", "()Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$Response;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseBody {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 81 % 128;

        @SerializedName("Response")
        private final Response response;

        public ResponseBody(Response response) {
            this.response = response;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResponseBody(Response response, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component3 + 29;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                response = null;
            }
            this(response);
        }

        public final Response getResponse() {
            int i = 2 % 2;
            int i2 = component3 + 15;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Response response = this.response;
            int i5 = i3 + 29;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return response;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (81 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResponseBody() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static ResponseBody copy$default(ResponseBody responseBody, Response response, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 119;
            int i4 = i3 % 128;
            component1 = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                response = responseBody.response;
                int i5 = i4 + 35;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
            return responseBody.copy(response);
        }

        public final Response component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 37;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Response response = this.response;
            int i5 = i2 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return response;
        }

        public final ResponseBody copy(Response response) {
            int i = 2 % 2;
            ResponseBody responseBody = new ResponseBody(response);
            int i2 = component1 + 81;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return responseBody;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResponseBody)) {
                int i5 = i3 + 107;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.response, ((ResponseBody) other).response)) {
                return true;
            }
            int i7 = component1 + 101;
            component3 = i7 % 128;
            return i7 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 39;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            Response response = this.response;
            if (response != null) {
                return response.hashCode();
            }
            int i4 = i2 + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResponseBody(response=" + this.response + ")";
            int i2 = component3 + 99;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/ThirdGetPhoneResponse$Response;", "", "encMsisdn", "", "imei", "imsi", "ip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncMsisdn", "()Ljava/lang/String;", "getImei", "getImsi", "getIp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Response {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        @SerializedName("EncMsisdn")
        private final String encMsisdn;

        @SerializedName("Imei")
        private final String imei;

        @SerializedName("Imsi")
        private final String imsi;

        @SerializedName("Ip")
        private final String ip;

        public Response(String str, String str2, String str3, String str4) {
            this.encMsisdn = str;
            this.imei = str2;
            this.imsi = str3;
            this.ip = str4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Response(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component3 + 119;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str = null;
            }
            if ((i & 2) != 0) {
                int i5 = component3 + 95;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            if ((i & 4) != 0) {
                int i8 = copydefault + 25;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                str3 = null;
            }
            if ((i & 8) != 0) {
                int i10 = component3 + 59;
                copydefault = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 75 / 0;
                }
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        public final String getEncMsisdn() {
            int i = 2 % 2;
            int i2 = component3 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.encMsisdn;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return str;
        }

        public final String getImei() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.imei;
            int i5 = i2 + 35;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getImsi() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 65;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.imsi;
            int i5 = i2 + 29;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getIp() {
            int i = 2 % 2;
            int i2 = component3 + 99;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ip;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 43;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Response() {
            this(null, null, null, null, 15, null);
        }

        public static Response copy$default(Response response, String str, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 53;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 13;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                str = response.encMsisdn;
            }
            if ((i & 2) != 0) {
                str2 = response.imei;
            }
            if ((i & 4) != 0) {
                str3 = response.imsi;
            }
            if ((i & 8) != 0) {
                int i8 = component3 + 45;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                str4 = response.ip;
            }
            return response.copy(str, str2, str3, str4);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 109;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.encMsisdn;
            int i4 = i3 + 19;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.imei;
            if (i3 != 0) {
                int i4 = 1 / 0;
            }
            return str;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component3 + 111;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.imsi;
            int i5 = i3 + 41;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ip;
            int i5 = i2 + 31;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Response copy(String encMsisdn, String imei, String imsi, String ip) {
            int i = 2 % 2;
            Response response = new Response(encMsisdn, imei, imsi, ip);
            int i2 = copydefault + 57;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
            return response;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 71;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            if (!Intrinsics.areEqual(this.encMsisdn, response.encMsisdn)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.imei, response.imei)) {
                int i3 = copydefault + 45;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.imsi, response.imsi)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.ip, response.ip)) {
                int i5 = component3 + 5;
                copydefault = i5 % 128;
                return i5 % 2 == 0;
            }
            int i6 = component3 + 79;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 94 / 0;
            }
            return true;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i;
            int iHashCode2;
            int iHashCode3;
            int i2 = 2 % 2;
            int i3 = copydefault + 57;
            component3 = i3 % 128;
            int iHashCode4 = 1;
            if (i3 % 2 != 0) {
                str = this.encMsisdn;
                if (str == null) {
                    i = 1;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 1;
                    iHashCode2 = str.hashCode();
                }
            } else {
                str = this.encMsisdn;
                if (str == null) {
                    i = 0;
                    iHashCode = i;
                    iHashCode2 = 0;
                } else {
                    iHashCode = 0;
                    iHashCode2 = str.hashCode();
                }
            }
            String str2 = this.imei;
            if (str2 == null) {
                int i4 = component3 + 99;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str2.hashCode();
            }
            String str3 = this.imsi;
            if (str3 == null) {
                int i6 = component3 + 103;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    iHashCode4 = 0;
                }
            } else {
                iHashCode4 = str3.hashCode();
            }
            String str4 = this.ip;
            if (str4 != null) {
                iHashCode = str4.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Response(encMsisdn=" + this.encMsisdn + ", imei=" + this.imei + ", imsi=" + this.imsi + ", ip=" + this.ip + ")";
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
