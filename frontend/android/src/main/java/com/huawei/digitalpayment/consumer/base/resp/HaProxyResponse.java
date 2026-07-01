package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "T", "", "header", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;", "body", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;Ljava/lang/Object;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;", "setHeader", "(Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;)V", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;Ljava/lang/Object;)Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "equals", "", "other", "hashCode", "", "toString", "", "Header", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HaProxyResponse<T> {
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("body")
    private T body;

    @SerializedName("header")
    private Header header;

    public HaProxyResponse(Header header, T t) {
        this.header = header;
        this.body = t;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Header header = this.header;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return header;
    }

    public final void setHeader(Header header) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.header = header;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final T getBody() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        T t = this.body;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        throw null;
    }

    public final void setBody(T t) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.body = t;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HaProxyResponse copy$default(HaProxyResponse haProxyResponse, Header header, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = component3 + 39;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 89;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                Header header2 = haProxyResponse.header;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            header = haProxyResponse.header;
        }
        if ((i & 2) != 0) {
            obj = haProxyResponse.body;
        }
        return haProxyResponse.copy(header, obj);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;", "", "requestRefId", "", "responseCode", "", "responseMessage", Keys.KEY_CUSTOMER_MESSAGE, "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestRefId", "()Ljava/lang/String;", "setRequestRefId", "(Ljava/lang/String;)V", "getResponseCode", "()Ljava/lang/Integer;", "setResponseCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getResponseMessage", "setResponseMessage", "getCustomerMessage", "setCustomerMessage", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse$Header;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Header {
        private static int component1 = 1;
        private static int copydefault;

        @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
        private String customerMessage;

        @SerializedName("requestRefId")
        private String requestRefId;

        @SerializedName("responseCode")
        private Integer responseCode;

        @SerializedName("responseMessage")
        private String responseMessage;

        @SerializedName("timestamp")
        private String timestamp;

        public Header(String str, Integer num, String str2, String str3, String str4) {
            this.requestRefId = str;
            this.responseCode = num;
            this.responseMessage = str2;
            this.customerMessage = str3;
            this.timestamp = str4;
        }

        public final String getRequestRefId() {
            int i = 2 % 2;
            int i2 = component1 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.requestRefId;
            }
            throw null;
        }

        public final void setRequestRefId(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 71;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.requestRefId = str;
            int i5 = i2 + 35;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Integer getResponseCode() {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Integer num = this.responseCode;
            int i5 = i3 + 87;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 88 / 0;
            }
            return num;
        }

        public final void setResponseCode(Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.responseCode = num;
            if (i3 == 0) {
                throw null;
            }
        }

        public final String getResponseMessage() {
            String str;
            int i = 2 % 2;
            int i2 = component1 + 71;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 != 0) {
                str = this.responseMessage;
                int i4 = 70 / 0;
            } else {
                str = this.responseMessage;
            }
            int i5 = i3 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final void setResponseMessage(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 3;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.responseMessage = str;
            int i5 = i2 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final String getCustomerMessage() {
            int i = 2 % 2;
            int i2 = component1 + 61;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.customerMessage;
            int i5 = i3 + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final void setCustomerMessage(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.customerMessage = str;
            int i5 = i2 + 95;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }

        public final String getTimestamp() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 57;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.timestamp;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final void setTimestamp(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.timestamp = str;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 27;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public static Header copy$default(Header header, String str, Integer num, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 25;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                str = header.requestRefId;
            }
            String str5 = str;
            if ((i & 2) != 0) {
                num = header.responseCode;
            }
            Integer num2 = num;
            if ((i & 4) != 0) {
                int i6 = i4 + 37;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    String str6 = header.responseMessage;
                    throw null;
                }
                str2 = header.responseMessage;
            }
            String str7 = str2;
            if ((i & 8) != 0) {
                str3 = header.customerMessage;
            }
            String str8 = str3;
            if ((i & 16) != 0) {
                int i7 = i4 + 59;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                str4 = header.timestamp;
            }
            return header.copy(str5, num2, str7, str8, str4);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.requestRefId;
            int i5 = i2 + 49;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer component2() {
            int i = 2 % 2;
            int i2 = component1 + 15;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            Integer num = this.responseCode;
            int i5 = i3 + 51;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component1 + 49;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.responseMessage;
            int i5 = i3 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component4() {
            String str;
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 87;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.customerMessage;
                int i4 = 29 / 0;
            } else {
                str = this.customerMessage;
            }
            int i5 = i2 + 115;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 71 / 0;
            }
            return str;
        }

        public final String component5() {
            int i = 2 % 2;
            int i2 = component1 + 119;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.timestamp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Header copy(String requestRefId, Integer responseCode, String responseMessage, String customerMessage, String timestamp) {
            int i = 2 % 2;
            Header header = new Header(requestRefId, responseCode, responseMessage, customerMessage, timestamp);
            int i2 = copydefault + 17;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return header;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 43;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            if (!Intrinsics.areEqual(this.requestRefId, header.requestRefId) || !Intrinsics.areEqual(this.responseCode, header.responseCode) || !Intrinsics.areEqual(this.responseMessage, header.responseMessage) || !Intrinsics.areEqual(this.customerMessage, header.customerMessage)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.timestamp, header.timestamp)) {
                int i4 = copydefault + 37;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = component1 + 51;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 50 / 0;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i = 2 % 2;
            String str = this.requestRefId;
            if (str == null) {
                int i2 = copydefault + 55;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = copydefault + 93;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
            Integer num = this.responseCode;
            int iHashCode4 = num == null ? 0 : num.hashCode();
            String str2 = this.responseMessage;
            if (str2 == null) {
                int i6 = component1 + 9;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            String str3 = this.customerMessage;
            if (str3 == null) {
                int i8 = component1 + 105;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str3.hashCode();
            }
            String str4 = this.timestamp;
            return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Header(requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", customerMessage=" + this.customerMessage + ", timestamp=" + this.timestamp + ")";
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Header header = this.header;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return header;
    }

    public final T component2() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        T t = this.body;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    public final HaProxyResponse<T> copy(Header header, T body) {
        int i = 2 % 2;
        HaProxyResponse<T> haProxyResponse = new HaProxyResponse<>(header, body);
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
        return haProxyResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 99;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 87;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof HaProxyResponse)) {
            int i6 = copydefault + 101;
            component3 = i6 % 128;
            return i6 % 2 != 0;
        }
        HaProxyResponse haProxyResponse = (HaProxyResponse) other;
        if (!Intrinsics.areEqual(this.header, haProxyResponse.header)) {
            int i7 = component3 + 35;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.body, haProxyResponse.body)) {
            return true;
        }
        int i9 = component3 + 5;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.header;
        if (header == null) {
            int i5 = i2 + 3;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = header.hashCode();
        }
        T t = this.body;
        return (iHashCode * 31) + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HaProxyResponse(header=" + this.header + ", body=" + this.body + ")";
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
