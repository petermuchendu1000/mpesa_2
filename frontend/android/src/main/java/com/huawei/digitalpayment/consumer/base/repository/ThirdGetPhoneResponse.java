package com.huawei.digitalpayment.consumer.base.repository;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse;", "", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ServiceResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ServiceResponse", "ResponseHeader", "ResponseBody", "Response", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdGetPhoneResponse {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    @SerializedName("ServiceResponse")
    private final ServiceResponse component3;

    public ThirdGetPhoneResponse(ServiceResponse serviceResponse) {
        this.component3 = serviceResponse;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ThirdGetPhoneResponse(ServiceResponse serviceResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            serviceResponse = null;
        }
        this(serviceResponse);
    }

    public final ServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdGetPhoneResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ServiceResponse;", "", "responseHeader", "Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseHeader;", "responseBody", "Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseHeader;Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseHeader;", "getResponseBody", "()Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseBody;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServiceResponse {
        private static int component1 = 0;
        private static int component2 = 1;

        @SerializedName("ResponseBody")
        private final ResponseBody ShareDataUIState;

        @SerializedName("ResponseHeader")
        private final ResponseHeader copydefault;

        public ServiceResponse(ResponseHeader responseHeader, ResponseBody responseBody) {
            this.copydefault = responseHeader;
            this.ShareDataUIState = responseBody;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ServiceResponse(ResponseHeader responseHeader, ResponseBody responseBody, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Object obj = null;
            if ((i & 1) != 0) {
                int i2 = component2 + 31;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                responseHeader = null;
            }
            if ((i & 2) != 0) {
                int i4 = component1 + 39;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
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
            int i3 = i2 + 63;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ResponseHeader responseHeader = this.copydefault;
            int i5 = i2 + 57;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return responseHeader;
        }

        public final ResponseBody getResponseBody() {
            ResponseBody responseBody;
            int i = 2 % 2;
            int i2 = component1 + 55;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                responseBody = this.ShareDataUIState;
                int i4 = 10 / 0;
            } else {
                responseBody = this.ShareDataUIState;
            }
            int i5 = i3 + 117;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return responseBody;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceResponse() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static ServiceResponse copy$default(ServiceResponse serviceResponse, ResponseHeader responseHeader, ResponseBody responseBody, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                responseHeader = serviceResponse.copydefault;
                int i3 = component1 + 23;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
            if ((i & 2) != 0) {
                responseBody = serviceResponse.ShareDataUIState;
            }
            ServiceResponse serviceResponseCopy = serviceResponse.copy(responseHeader, responseBody);
            int i5 = component2 + 83;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return serviceResponseCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final ResponseHeader component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 49;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            ResponseHeader responseHeader = this.copydefault;
            int i4 = i2 + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return responseHeader;
        }

        public final ResponseBody component2() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 119;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ResponseBody responseBody = this.ShareDataUIState;
            int i5 = i2 + 35;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return responseBody;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ServiceResponse copy(ResponseHeader responseHeader, ResponseBody responseBody) {
            int i = 2 % 2;
            ServiceResponse serviceResponse = new ServiceResponse(responseHeader, responseBody);
            int i2 = component2 + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return serviceResponse;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if ((r7 instanceof com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r1 = r1 + 79;
            com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component1 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r7 = (com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.copydefault, r7.copydefault) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r6.ShareDataUIState, r7.ShareDataUIState) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r3 = r3 + 49;
            com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component2 = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if ((r3 % 2) != 0) goto L11;
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
                int r1 = com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component2
                int r2 = r1 + 23
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component1 = r3
                int r2 = r2 % r0
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L16
                r2 = 28
                int r2 = r2 / r5
                if (r6 != r7) goto L23
                goto L18
            L16:
                if (r6 != r7) goto L23
            L18:
                int r3 = r3 + 49
                int r7 = r3 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component2 = r7
                int r3 = r3 % r0
                if (r3 != 0) goto L22
                return r5
            L22:
                return r4
            L23:
                boolean r2 = r7 instanceof com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse
                if (r2 != 0) goto L2f
                int r1 = r1 + 79
                int r7 = r1 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.component1 = r7
                int r1 = r1 % r0
                return r5
            L2f:
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse$ServiceResponse r7 = (com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse) r7
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse$ResponseHeader r0 = r6.copydefault
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse$ResponseHeader r1 = r7.copydefault
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 != 0) goto L3c
                return r5
            L3c:
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse$ResponseBody r0 = r6.ShareDataUIState
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse$ResponseBody r7 = r7.ShareDataUIState
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
                if (r7 != 0) goto L47
                return r5
            L47:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.ServiceResponse.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            ResponseHeader responseHeader;
            int iHashCode;
            int i = 2 % 2;
            int i2 = component2 + 123;
            component1 = i2 % 128;
            int iHashCode2 = 0;
            if (i2 % 2 != 0) {
                responseHeader = this.copydefault;
                iHashCode = 1;
                if (responseHeader != null) {
                    iHashCode2 = 1;
                    iHashCode = iHashCode2;
                    iHashCode2 = responseHeader.hashCode();
                }
            } else {
                responseHeader = this.copydefault;
                if (responseHeader == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = iHashCode2;
                    iHashCode2 = responseHeader.hashCode();
                }
            }
            ResponseBody responseBody = this.ShareDataUIState;
            if (responseBody != null) {
                iHashCode = responseBody.hashCode();
                int i3 = component1 + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ServiceResponse(responseHeader=" + this.copydefault + ", responseBody=" + this.ShareDataUIState + ")";
            int i2 = component2 + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public static ThirdGetPhoneResponse copy$default(ThirdGetPhoneResponse thirdGetPhoneResponse, ServiceResponse serviceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 95;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 55;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            serviceResponse = thirdGetPhoneResponse.component3;
        }
        return thirdGetPhoneResponse.copy(serviceResponse);
    }

    public final ServiceResponse component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ThirdGetPhoneResponse copy(ServiceResponse serviceResponse) {
        int i = 2 % 2;
        ThirdGetPhoneResponse thirdGetPhoneResponse = new ThirdGetPhoneResponse(serviceResponse);
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return thirdGetPhoneResponse;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdGetPhoneResponse)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component3, ((ThirdGetPhoneResponse) other).component3)) {
            return true;
        }
        int i3 = ShareDataUIState + 71;
        copydefault = i3 % 128;
        return i3 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ServiceResponse serviceResponse = this.component3;
        if (serviceResponse == null) {
            return 0;
        }
        int iHashCode = serviceResponse.hashCode();
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThirdGetPhoneResponse(serviceResponse=" + this.component3 + ")";
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseHeader;", "", "responseCode", "", "responseMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResponseCode", "()Ljava/lang/String;", "getResponseMsg", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseHeader {
        private static int component2 = 1;
        private static int component3;

        @SerializedName("ResponseCode")
        private final String ShareDataUIState;

        @SerializedName("ResponseMsg")
        private final String component1;

        public ResponseHeader(String str, String str2) {
            this.ShareDataUIState = str;
            this.component1 = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResponseHeader(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component2 + 63;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 5;
                } else {
                    int i4 = 2 % 2;
                }
                str = null;
            }
            if ((i & 2) != 0) {
                int i5 = component3 + 87;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            this(str, str2);
        }

        public final String getResponseCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getResponseMsg() {
            int i = 2 % 2;
            int i2 = component3 + 59;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResponseHeader() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static ResponseHeader copy$default(ResponseHeader responseHeader, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component2 + 45;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                str = responseHeader.ShareDataUIState;
            }
            if ((i & 2) != 0) {
                str2 = responseHeader.component1;
            }
            ResponseHeader responseHeaderCopy = responseHeader.copy(str, str2);
            int i5 = component3 + 69;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 1 / 0;
            }
            return responseHeaderCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 75;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2 + 15;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 7;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final ResponseHeader copy(String responseCode, String responseMsg) {
            int i = 2 % 2;
            ResponseHeader responseHeader = new ResponseHeader(responseCode, responseMsg);
            int i2 = component2 + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return responseHeader;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 61;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 117;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(!(other instanceof ResponseHeader))) {
                ResponseHeader responseHeader = (ResponseHeader) other;
                if (!(!Intrinsics.areEqual(this.ShareDataUIState, responseHeader.ShareDataUIState))) {
                    return Intrinsics.areEqual(this.component1, responseHeader.component1);
                }
                int i7 = component3 + 63;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.ShareDataUIState;
            if (str == null) {
                int i2 = component2 + 91;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = component3 + 29;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            String str2 = this.component1;
            int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            int i6 = component2 + 35;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResponseHeader(responseCode=" + this.ShareDataUIState + ", responseMsg=" + this.component1 + ")";
            int i2 = component3 + 87;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$ResponseBody;", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$Response;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$Response;)V", "getResponse", "()Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$Response;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseBody {
        private static int component1 = 1;
        private static int copydefault;

        @SerializedName("Response")
        private final Response component3;

        public ResponseBody(Response response) {
            this.component3 = response;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResponseBody(Response response, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = copydefault + 3;
                int i3 = i2 % 128;
                component1 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 93;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                response = null;
            }
            this(response);
        }

        public final Response getResponse() {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Response response = this.component3;
            int i5 = i3 + 65;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return response;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ResponseBody() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static ResponseBody copy$default(ResponseBody responseBody, Response response, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 55;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 93;
                int i7 = i6 % 128;
                component1 = i7;
                int i8 = i6 % 2;
                Response response2 = responseBody.component3;
                int i9 = i7 + 25;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                response = response2;
            }
            return responseBody.copy(response);
        }

        public final Response component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 85;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Response response = this.component3;
            int i5 = i2 + 55;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return response;
        }

        public final ResponseBody copy(Response response) {
            int i = 2 % 2;
            ResponseBody responseBody = new ResponseBody(response);
            int i2 = copydefault + 29;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return responseBody;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResponseBody)) {
                int i5 = i2 + 77;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.component3, ((ResponseBody) other).component3)) {
                return false;
            }
            int i7 = copydefault + 57;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            Response response = this.component3;
            if (response != null) {
                return response.hashCode();
            }
            int i2 = copydefault + 71;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ResponseBody(response=" + this.component3 + ")";
            int i2 = copydefault + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/ThirdGetPhoneResponse$Response;", "", "encMsisdn", "", "imei", "imsi", "ip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncMsisdn", "()Ljava/lang/String;", "getImei", "getImsi", "getIp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Response {
        private static int copydefault = 0;
        private static int getRequestBeneficiariesState = 1;

        @SerializedName("EncMsisdn")
        private final String ShareDataUIState;

        @SerializedName("Imsi")
        private final String component1;

        @SerializedName("Imei")
        private final String component2;

        @SerializedName("Ip")
        private final String component3;

        public Response(String str, String str2, String str3, String str4) {
            this.ShareDataUIState = str;
            this.component2 = str2;
            this.component1 = str3;
            this.component3 = str4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Response(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i & 1) != 0 ? null : str;
            if ((i & 2) != 0) {
                int i2 = copydefault + 29;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                str2 = null;
            }
            str3 = (i & 4) != 0 ? null : str3;
            if ((i & 8) != 0) {
                int i4 = getRequestBeneficiariesState + 105;
                int i5 = i4 % 128;
                copydefault = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 61;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        public final String getEncMsisdn() {
            String str;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 123;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.ShareDataUIState;
                int i4 = 41 / 0;
            } else {
                str = this.ShareDataUIState;
            }
            int i5 = i2 + 37;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getImei() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 113;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 117;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getImsi() {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getIp() {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 13;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public Response() {
            this(null, null, null, null, 15, null);
        }

        public static Response copy$default(Response response, String str, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = copydefault;
                int i4 = i3 + 45;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                String str5 = response.ShareDataUIState;
                int i6 = i3 + 125;
                getRequestBeneficiariesState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 5;
                }
                str = str5;
            }
            if ((i & 2) != 0) {
                int i8 = copydefault + 89;
                getRequestBeneficiariesState = i8 % 128;
                int i9 = i8 % 2;
                str2 = response.component2;
            }
            if ((i & 4) != 0) {
                str3 = response.component1;
            }
            if ((i & 8) != 0) {
                int i10 = copydefault + 97;
                getRequestBeneficiariesState = i10 % 128;
                int i11 = i10 % 2;
                str4 = response.component3;
            }
            return response.copy(str, str2, str3, str4);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.ShareDataUIState;
            if (i3 == 0) {
                int i4 = 88 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component3() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 123;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component1;
                int i4 = 78 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i2 + 121;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component4() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 85;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component3;
                int i4 = 87 / 0;
            } else {
                str = this.component3;
            }
            int i5 = i2 + 49;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Response copy(String encMsisdn, String imei, String imsi, String ip) {
            int i = 2 % 2;
            Response response = new Response(encMsisdn, imei, imsi, ip);
            int i2 = getRequestBeneficiariesState + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return response;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                int i2 = copydefault + 89;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Response response = (Response) other;
            if (!Intrinsics.areEqual(this.ShareDataUIState, response.ShareDataUIState)) {
                int i4 = copydefault + 1;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (Intrinsics.areEqual(this.component2, response.component2)) {
                return Intrinsics.areEqual(this.component1, response.component1) && Intrinsics.areEqual(this.component3, response.component3);
            }
            int i5 = copydefault + 101;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v13 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.getRequestBeneficiariesState
                int r1 = r1 + 105
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L15
                java.lang.String r1 = r7.ShareDataUIState
                r3 = 1
                if (r1 != 0) goto L1c
                goto L1a
            L15:
                java.lang.String r1 = r7.ShareDataUIState
                r3 = r2
                if (r1 != 0) goto L1c
            L1a:
                r1 = r2
                goto L20
            L1c:
                int r1 = r1.hashCode()
            L20:
                java.lang.String r4 = r7.component2
                if (r4 != 0) goto L36
                int r4 = com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.copydefault
                int r5 = r4 + 17
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.getRequestBeneficiariesState = r6
                int r5 = r5 % r0
                int r4 = r4 + 43
                int r5 = r4 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.getRequestBeneficiariesState = r5
                int r4 = r4 % r0
                r4 = r2
                goto L3a
            L36:
                int r4 = r4.hashCode()
            L3a:
                java.lang.String r5 = r7.component1
                if (r5 != 0) goto L48
                int r5 = com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.copydefault
                int r5 = r5 + 79
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.getRequestBeneficiariesState = r6
                int r5 = r5 % r0
                goto L4c
            L48:
                int r2 = r5.hashCode()
            L4c:
                java.lang.String r0 = r7.component3
                if (r0 != 0) goto L51
                goto L55
            L51:
                int r3 = r0.hashCode()
            L55:
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r2
                int r1 = r1 * 31
                int r1 = r1 + r3
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.repository.ThirdGetPhoneResponse.Response.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Response(encMsisdn=" + this.ShareDataUIState + ", imei=" + this.component2 + ", imsi=" + this.component1 + ", ip=" + this.component3 + ")";
            int i2 = copydefault + 69;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
