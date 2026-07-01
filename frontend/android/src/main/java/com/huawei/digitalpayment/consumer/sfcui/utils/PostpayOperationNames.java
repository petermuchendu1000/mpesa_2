package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/PostpayOperationNames;", "", "operationName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOperationName", "()Ljava/lang/String;", "ONBOARDING", "POSTPAY_REVAMP", "ONBOARDINGLMM", "CUSTOMER_CREDIT_RATING", "POSTPAY_DEVICE", "TERMINATION", "CHANGE_PLAN", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayOperationNames {
    private static final EnumEntries $ENTRIES;
    private static final PostpayOperationNames[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String operationName;
    public static final PostpayOperationNames ONBOARDING = new PostpayOperationNames("ONBOARDING", 0, "onboarding");
    public static final PostpayOperationNames POSTPAY_REVAMP = new PostpayOperationNames("POSTPAY_REVAMP", 1, "postpayrevamp");
    public static final PostpayOperationNames ONBOARDINGLMM = new PostpayOperationNames("ONBOARDINGLMM", 2, "onboardingLmm");
    public static final PostpayOperationNames CUSTOMER_CREDIT_RATING = new PostpayOperationNames("CUSTOMER_CREDIT_RATING", 3, "CustomerCreditRating");
    public static final PostpayOperationNames POSTPAY_DEVICE = new PostpayOperationNames("POSTPAY_DEVICE", 4, "postpayDevice");
    public static final PostpayOperationNames TERMINATION = new PostpayOperationNames("TERMINATION", 5, "termination");
    public static final PostpayOperationNames CHANGE_PLAN = new PostpayOperationNames("CHANGE_PLAN", 6, "changePlan");

    private PostpayOperationNames(String str, int i, String str2) {
        this.operationName = str2;
    }

    public final String getOperationName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.operationName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PostpayOperationNames[] postpayOperationNamesArr$values = $values();
        $VALUES = postpayOperationNamesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(postpayOperationNamesArr$values);
        int i = copydefault + 85;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static PostpayOperationNames valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (PostpayOperationNames) Enum.valueOf(PostpayOperationNames.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PostpayOperationNames[] values() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return (PostpayOperationNames[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final PostpayOperationNames[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        PostpayOperationNames[] postpayOperationNamesArr = {ONBOARDING, POSTPAY_REVAMP, ONBOARDINGLMM, CUSTOMER_CREDIT_RATING, POSTPAY_DEVICE, TERMINATION, CHANGE_PLAN};
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return postpayOperationNamesArr;
    }

    public static EnumEntries<PostpayOperationNames> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<PostpayOperationNames> enumEntries = $ENTRIES;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
