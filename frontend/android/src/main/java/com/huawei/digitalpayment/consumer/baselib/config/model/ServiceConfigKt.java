package com.huawei.digitalpayment.consumer.baselib.config.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"SHORT_CODE_REGULAR", "", "OPERATOR_NAME_REGULAR", "ConsumerBaseLib_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ServiceConfigKt {
    public static final String OPERATOR_NAME_REGULAR = "^([0-9A-Za-z]{4,16})$";
    public static final String SHORT_CODE_REGULAR = "^([0-9A-Za-z_]{4,13})$";
}
