package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/HeaderConstants;", "", "<init>", "()V", "AUTHORIZATION", "", "CONTENT_TYPE", "ACCEPT", "SOURCE_COUNTY_CODE", "SOURCE_OPERATOR", "SOURCE_DIVISION", "SOURCE_SYSTEM", "SOURCE_TIMESTAMP", "CONVERSATION_ID", GrsBaseInfo.CountryCodeSource.APP, "VERSION", "ACCEPT_ENCODING", "ACCEPT_LANGUAGE", "MESSAGE_ID", "SOURCE_SCREEN", "OPERATION_TYPE", "DEVICE_ID", "DEVICE_TOKEN", "X_MSISDN", "DEVICE_INFO", "API_KEY", "BEARER_AUTH", "BASIC_AUTH", "APP_SOURCE_SYSTEM", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeaderConstants {
    public static final String ACCEPT = "Accept";
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String API_KEY = "x-api-key";
    public static final String APP = "X-App";
    public static final String APP_SOURCE_SYSTEM = "oneapp";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BASIC_AUTH = "Basic";
    public static final String BEARER_AUTH = "Bearer";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONVERSATION_ID = "X-Correlation-ConversationID";
    public static final String DEVICE_ID = "X-DeviceId";
    public static final String DEVICE_INFO = "X-DeviceInfo";
    public static final String DEVICE_TOKEN = "X-DeviceToken";
    public static final HeaderConstants INSTANCE = new HeaderConstants();
    public static final String MESSAGE_ID = "X-MessageID";
    public static final String OPERATION_TYPE = "x-operation-type";
    public static final String SOURCE_COUNTY_CODE = "X-Source-CountryCode";
    public static final String SOURCE_DIVISION = "X-Source-Division";
    public static final String SOURCE_OPERATOR = "X-Source-Operator";
    public static final String SOURCE_SCREEN = "X-Source-Screen";
    public static final String SOURCE_SYSTEM = "X-Source-System";
    public static final String SOURCE_TIMESTAMP = "X-Source-Timestamp";
    public static final String VERSION = "X-Version";
    public static final String X_MSISDN = "X-MSISDN";
    private static int component2 = 1;
    private static int copydefault;

    private HeaderConstants() {
    }

    static {
        int i = component2 + 95;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
