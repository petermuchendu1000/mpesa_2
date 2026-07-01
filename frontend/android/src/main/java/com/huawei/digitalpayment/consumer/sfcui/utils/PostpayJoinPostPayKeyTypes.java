package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/PostpayJoinPostPayKeyTypes;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DEPOSITAMOUNT", "CREDITLIMIT", "OKOAPRODUCT", "STKAMOUNT", "PRODUCTNAME", "PRODUCTPRICE", "REQUESTEDCREDITLIMIT", "PLAN_APPLICATION", "MIGRATIONTYPE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayJoinPostPayKeyTypes {
    private static final EnumEntries $ENTRIES;
    private static final PostpayJoinPostPayKeyTypes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final String key;
    public static final PostpayJoinPostPayKeyTypes DEPOSITAMOUNT = new PostpayJoinPostPayKeyTypes("DEPOSITAMOUNT", 0, "DEPOSITAMOUNT");
    public static final PostpayJoinPostPayKeyTypes CREDITLIMIT = new PostpayJoinPostPayKeyTypes("CREDITLIMIT", 1, "CREDITLIMIT");
    public static final PostpayJoinPostPayKeyTypes OKOAPRODUCT = new PostpayJoinPostPayKeyTypes("OKOAPRODUCT", 2, "OKOAPRODUCT");
    public static final PostpayJoinPostPayKeyTypes STKAMOUNT = new PostpayJoinPostPayKeyTypes("STKAMOUNT", 3, "STKAMOUNT");
    public static final PostpayJoinPostPayKeyTypes PRODUCTNAME = new PostpayJoinPostPayKeyTypes("PRODUCTNAME", 4, "PRODUCTNAME");
    public static final PostpayJoinPostPayKeyTypes PRODUCTPRICE = new PostpayJoinPostPayKeyTypes("PRODUCTPRICE", 5, "PRODUCTPRICE");
    public static final PostpayJoinPostPayKeyTypes REQUESTEDCREDITLIMIT = new PostpayJoinPostPayKeyTypes("REQUESTEDCREDITLIMIT", 6, "REQUESTEDCREDITLIMIT");
    public static final PostpayJoinPostPayKeyTypes PLAN_APPLICATION = new PostpayJoinPostPayKeyTypes("PLAN_APPLICATION", 7, "PLANAPPLICATION");
    public static final PostpayJoinPostPayKeyTypes MIGRATIONTYPE = new PostpayJoinPostPayKeyTypes("MIGRATIONTYPE", 8, "MIGRATIONTYPE");

    private PostpayJoinPostPayKeyTypes(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    static {
        PostpayJoinPostPayKeyTypes[] postpayJoinPostPayKeyTypesArr$values = $values();
        $VALUES = postpayJoinPostPayKeyTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(postpayJoinPostPayKeyTypesArr$values);
        int i = component2 + 97;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PostpayJoinPostPayKeyTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PostpayJoinPostPayKeyTypes postpayJoinPostPayKeyTypes = (PostpayJoinPostPayKeyTypes) Enum.valueOf(PostpayJoinPostPayKeyTypes.class, str);
        int i4 = copydefault + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return postpayJoinPostPayKeyTypes;
    }

    public static PostpayJoinPostPayKeyTypes[] values() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PostpayJoinPostPayKeyTypes[] postpayJoinPostPayKeyTypesArr = (PostpayJoinPostPayKeyTypes[]) $VALUES.clone();
        int i4 = component1 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return postpayJoinPostPayKeyTypesArr;
    }

    private static final PostpayJoinPostPayKeyTypes[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        PostpayJoinPostPayKeyTypes[] postpayJoinPostPayKeyTypesArr = {DEPOSITAMOUNT, CREDITLIMIT, OKOAPRODUCT, STKAMOUNT, PRODUCTNAME, PRODUCTPRICE, REQUESTEDCREDITLIMIT, PLAN_APPLICATION, MIGRATIONTYPE};
        int i5 = i2 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return postpayJoinPostPayKeyTypesArr;
    }

    public static EnumEntries<PostpayJoinPostPayKeyTypes> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }
}
