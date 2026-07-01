package com.safaricom.consumer.commons.session;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/safaricom/consumer/commons/session/LogoutReason;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "INACTIVITY", "SUSPEND", "LOCKED", "FROZEN", "INVALID", "SWITCH_ACCOUNT", "NOT_WHITELISTED", "OUTDATED_APP_VERSION", "APP_CLOSED", "SIM_SWAP", "INCORRECT_PIN", "ACCOUNT_IDENTITY_NOT_VALIDATED", "INVALID_MSISDN", "INVALID_MSISDN_SMS_CHANNEL", "MALICIOUS_USER_REQUEST", "ACCESS_FORBIDDEN", "SESSION_EXPIRED", "CLEAR_DATA", "UNEXPECTED_ERROR", "OPERATOR_DOES_NOT_EXIST", "OFFLINE_MODE_RESTRICTION", "ORGANIZATION_INACTIVE", "MSISDN_LIMITATION", "UPDATE_CHILD_ACCOUNT", "OPERATOR_PENDING_ACTIVE", "USER_SEGMENT_NOT_SUPPORTED", "NO_SECURITY_CREDENTIAL", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogoutReason {
    private static final EnumEntries $ENTRIES;
    private static final LogoutReason[] $VALUES;
    public static final LogoutReason MANUAL = new LogoutReason("MANUAL", 0);
    public static final LogoutReason INACTIVITY = new LogoutReason("INACTIVITY", 1);
    public static final LogoutReason SUSPEND = new LogoutReason("SUSPEND", 2);
    public static final LogoutReason LOCKED = new LogoutReason("LOCKED", 3);
    public static final LogoutReason FROZEN = new LogoutReason("FROZEN", 4);
    public static final LogoutReason INVALID = new LogoutReason("INVALID", 5);
    public static final LogoutReason SWITCH_ACCOUNT = new LogoutReason("SWITCH_ACCOUNT", 6);
    public static final LogoutReason NOT_WHITELISTED = new LogoutReason("NOT_WHITELISTED", 7);
    public static final LogoutReason OUTDATED_APP_VERSION = new LogoutReason("OUTDATED_APP_VERSION", 8);
    public static final LogoutReason APP_CLOSED = new LogoutReason("APP_CLOSED", 9);
    public static final LogoutReason SIM_SWAP = new LogoutReason("SIM_SWAP", 10);
    public static final LogoutReason INCORRECT_PIN = new LogoutReason("INCORRECT_PIN", 11);
    public static final LogoutReason ACCOUNT_IDENTITY_NOT_VALIDATED = new LogoutReason("ACCOUNT_IDENTITY_NOT_VALIDATED", 12);
    public static final LogoutReason INVALID_MSISDN = new LogoutReason("INVALID_MSISDN", 13);
    public static final LogoutReason INVALID_MSISDN_SMS_CHANNEL = new LogoutReason("INVALID_MSISDN_SMS_CHANNEL", 14);
    public static final LogoutReason MALICIOUS_USER_REQUEST = new LogoutReason("MALICIOUS_USER_REQUEST", 15);
    public static final LogoutReason ACCESS_FORBIDDEN = new LogoutReason("ACCESS_FORBIDDEN", 16);
    public static final LogoutReason SESSION_EXPIRED = new LogoutReason("SESSION_EXPIRED", 17);
    public static final LogoutReason CLEAR_DATA = new LogoutReason("CLEAR_DATA", 18);
    public static final LogoutReason UNEXPECTED_ERROR = new LogoutReason("UNEXPECTED_ERROR", 19);
    public static final LogoutReason OPERATOR_DOES_NOT_EXIST = new LogoutReason("OPERATOR_DOES_NOT_EXIST", 20);
    public static final LogoutReason OFFLINE_MODE_RESTRICTION = new LogoutReason("OFFLINE_MODE_RESTRICTION", 21);
    public static final LogoutReason ORGANIZATION_INACTIVE = new LogoutReason("ORGANIZATION_INACTIVE", 22);
    public static final LogoutReason MSISDN_LIMITATION = new LogoutReason("MSISDN_LIMITATION", 23);
    public static final LogoutReason UPDATE_CHILD_ACCOUNT = new LogoutReason("UPDATE_CHILD_ACCOUNT", 24);
    public static final LogoutReason OPERATOR_PENDING_ACTIVE = new LogoutReason("OPERATOR_PENDING_ACTIVE", 25);
    public static final LogoutReason USER_SEGMENT_NOT_SUPPORTED = new LogoutReason("USER_SEGMENT_NOT_SUPPORTED", 26);
    public static final LogoutReason NO_SECURITY_CREDENTIAL = new LogoutReason("NO_SECURITY_CREDENTIAL", 27);

    private LogoutReason(String str, int i) {
    }

    static {
        LogoutReason[] logoutReasonArr$values = $values();
        $VALUES = logoutReasonArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(logoutReasonArr$values);
    }

    public static LogoutReason valueOf(String str) {
        return (LogoutReason) Enum.valueOf(LogoutReason.class, str);
    }

    public static LogoutReason[] values() {
        return (LogoutReason[]) $VALUES.clone();
    }

    private static final LogoutReason[] $values() {
        return new LogoutReason[]{MANUAL, INACTIVITY, SUSPEND, LOCKED, FROZEN, INVALID, SWITCH_ACCOUNT, NOT_WHITELISTED, OUTDATED_APP_VERSION, APP_CLOSED, SIM_SWAP, INCORRECT_PIN, ACCOUNT_IDENTITY_NOT_VALIDATED, INVALID_MSISDN, INVALID_MSISDN_SMS_CHANNEL, MALICIOUS_USER_REQUEST, ACCESS_FORBIDDEN, SESSION_EXPIRED, CLEAR_DATA, UNEXPECTED_ERROR, OPERATOR_DOES_NOT_EXIST, OFFLINE_MODE_RESTRICTION, ORGANIZATION_INACTIVE, MSISDN_LIMITATION, UPDATE_CHILD_ACCOUNT, OPERATOR_PENDING_ACTIVE, USER_SEGMENT_NOT_SUPPORTED, NO_SECURITY_CREDENTIAL};
    }

    public static EnumEntries<LogoutReason> getEntries() {
        return $ENTRIES;
    }
}
