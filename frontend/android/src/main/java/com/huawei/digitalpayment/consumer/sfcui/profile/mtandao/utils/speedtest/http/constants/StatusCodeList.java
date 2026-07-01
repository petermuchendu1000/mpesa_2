package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.mlkit.common.MlKitException;
import com.huawei.digitalpayment.consumer.base.http.HaProxyConstants;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.StatusCodeObject;
import com.mpesa.qrcode.constants.ErrorStore;

public class StatusCodeList {
    private static int component1 = 1;
    private static int copydefault;
    public static final StatusCodeObject CONTINUE = new StatusCodeObject(100, "Continue");
    public static final StatusCodeObject SWITCHING_PROTOCOL = new StatusCodeObject(101, "Switching Protocols");
    public static final StatusCodeObject OK = new StatusCodeObject(200, "OK");
    public static final StatusCodeObject CREATED = new StatusCodeObject(201, "Created");
    public static final StatusCodeObject ACCEPTED = new StatusCodeObject(202, "Accepted");
    public static final StatusCodeObject NON_AUTHORITATIVE_INFORMATION = new StatusCodeObject(203, "Non-Authoritative Information");
    public static final StatusCodeObject NO_CONTENT = new StatusCodeObject(204, "No Content");
    public static final StatusCodeObject RESET_CONTENT = new StatusCodeObject(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "Reset Content");
    public static final StatusCodeObject PARTIAL_CONTENT = new StatusCodeObject(206, "Partial Content");
    public static final StatusCodeObject MULTIPLE_CHOICES = new StatusCodeObject(300, "Multiple Choices");
    public static final StatusCodeObject MOVED_PERMANENTLY = new StatusCodeObject(301, "Moved Permanently");
    public static final StatusCodeObject FOUND = new StatusCodeObject(302, "Found");
    public static final StatusCodeObject SEE_OTHER = new StatusCodeObject(303, "See Other");
    public static final StatusCodeObject NOT_MODIFIED = new StatusCodeObject(304, "Not Modified");
    public static final StatusCodeObject USE_PROXY = new StatusCodeObject(305, "Use Proxy");
    public static final StatusCodeObject TEMPORARY_REDIRECT = new StatusCodeObject(307, "Temporary Redirect");
    public static final StatusCodeObject BAD_REQUEST = new StatusCodeObject(400, "Bad Request");
    public static final StatusCodeObject UNAUTHORIZED = new StatusCodeObject(401, "Unauthorized");
    public static final StatusCodeObject PAYMENT_REQUIRED = new StatusCodeObject(TypedValues.CycleType.TYPE_VISIBILITY, "Payment Required");
    public static final StatusCodeObject FORBIDDEN = new StatusCodeObject(403, "Forbidden");
    public static final StatusCodeObject NOT_FOUND = new StatusCodeObject(404, "Not Found");
    public static final StatusCodeObject METHOD_NOT_ALLOWED = new StatusCodeObject(405, "Method Not Allowed");
    public static final StatusCodeObject NOT_ACCEPTABLE = new StatusCodeObject(HaProxyConstants.VOUCHER_TOP_UP_SUCESS, "Not Acceptable");
    public static final StatusCodeObject PROXY_AUTHENTICATION_REQUIRED = new StatusCodeObject(407, "Proxy Authentication Required");
    public static final StatusCodeObject REQUEST_TIME_OUT = new StatusCodeObject(408, "Request Time-out");
    public static final StatusCodeObject CONFLICT = new StatusCodeObject(409, "Conflict");
    public static final StatusCodeObject GONE = new StatusCodeObject(410, "Gone");
    public static final StatusCodeObject LENGTH_REQUIRED = new StatusCodeObject(411, "Length Required");
    public static final StatusCodeObject PRECONDITION_FAILED = new StatusCodeObject(412, "Precondition Failed");
    public static final StatusCodeObject REQUEST_ENTITY_TOO_LARGE = new StatusCodeObject(413, "Request Entity Too Large");
    public static final StatusCodeObject REQUEST_URI_TOO_LARGE = new StatusCodeObject(414, "Request-URI Too Large");
    public static final StatusCodeObject UNSUPPORTED_MEDIA_TYPE = new StatusCodeObject(415, "Unsupported Media Type");
    public static final StatusCodeObject REQUESTED_RANGE_NOT_SATISFIABLE = new StatusCodeObject(416, "Requested range not satisfiable");
    public static final StatusCodeObject EXPECTATION_FAILED = new StatusCodeObject(417, "Expectation Failed");
    public static final StatusCodeObject INTERNAL_SERVER_ERROR = new StatusCodeObject(500, "Internal Server Error");
    public static final StatusCodeObject NOT_IMPLEMENTED = new StatusCodeObject(501, "Not Implemented");
    public static final StatusCodeObject BAD_GATEWAY = new StatusCodeObject(502, "Bad Gateway");
    public static final StatusCodeObject SERVICE_UNAVAILABLE = new StatusCodeObject(503, ErrorStore.SERVICE_UNAVAILABLE);
    public static final StatusCodeObject GATEWAY_TIME_OUT = new StatusCodeObject(TypedValues.PositionType.TYPE_PERCENT_HEIGHT, "Gateway Time-out");
    public static final StatusCodeObject HTTP_VERSION_NOT_SUPPORTED = new StatusCodeObject(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version not supported");

    static {
        int i = copydefault + 33;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
