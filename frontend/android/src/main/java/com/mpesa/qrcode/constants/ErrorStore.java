package com.mpesa.qrcode.constants;

public class ErrorStore {
    public static final String BUT_FOUND_EMPTY = " But found empty";
    public static final String EMPTY_MARKET = "Market cannot be empty";
    public static final String EMPTY_RESPONSE = "Empty response from the server";
    public static final String INVALID_AUTH_CREDENTIALS = "Invalid Auth Credentials";
    public static final String INVALID_CONFIG_FILE = "Invalid configuration file";
    public static final String INVALID_FORMAT = "Invalid format for ";
    public static final String INVALID_RULE = "Invalid rule configuration";
    public static final String INVALID_VALIDATION_CONFIGURATION = "Invalid validation configuration";
    public static final String INVALID_VALUE = "Invalid value for ";
    public static final String NO_ADDITIONAL_PARAMETERS = "Additional parameters data not provided";
    public static final String NO_AUTH_CREDENTIALS = "Auth Credentials not found, Please set the Auth Credentials";
    public static final String NO_DEEP_LINK_ENABLE = "Deep link URI configuration is missing";
    public static final String NO_INTERNET = "No internet connection";
    public static final String NO_LANGUAGE_TEMPLATE = "Language template data not provided";
    public static final String NO_MATCHING_CONFIG = "No matching config for the JSON format";
    public static final String REQUIRES_VALUE_FOR = "Requires value for ";
    public static final String SERVICE_UNAVAILABLE = "Service Unavailable";
    public static final String SOMETHING_WENT_WRONG = "Something went wrong.Please try again!";

    public String getInvalidFormatMSG(String str) {
        return INVALID_FORMAT + str;
    }

    public String getRequiresValueMSG(String str) {
        return REQUIRES_VALUE_FOR + str + " but found empty";
    }

    public String getInvalidLengthMSG(String str) {
        return "Invalid length for " + str;
    }
}
