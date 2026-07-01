package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/PostpayLMMOptinPayKeyTypes;", "", "<init>", "(Ljava/lang/String;I)V", "DEPOSITAMOUNT", "CREDITLIMIT", "OKOAPRODUCT", "STKAMOUNT", "PRODUCTNAME", "DEVICEPRODUCTNAME", "DOCTYPE", "DOCID", "PRODUCTPRICE", "REQUESTEDCREDITLIMIT", "CALLBACKURL", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayLMMOptinPayKeyTypes {
    private static final EnumEntries $ENTRIES;
    private static final PostpayLMMOptinPayKeyTypes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    public static final PostpayLMMOptinPayKeyTypes DEPOSITAMOUNT = new PostpayLMMOptinPayKeyTypes("DEPOSITAMOUNT", 0);
    public static final PostpayLMMOptinPayKeyTypes CREDITLIMIT = new PostpayLMMOptinPayKeyTypes("CREDITLIMIT", 1);
    public static final PostpayLMMOptinPayKeyTypes OKOAPRODUCT = new PostpayLMMOptinPayKeyTypes("OKOAPRODUCT", 2);
    public static final PostpayLMMOptinPayKeyTypes STKAMOUNT = new PostpayLMMOptinPayKeyTypes("STKAMOUNT", 3);
    public static final PostpayLMMOptinPayKeyTypes PRODUCTNAME = new PostpayLMMOptinPayKeyTypes("PRODUCTNAME", 4);
    public static final PostpayLMMOptinPayKeyTypes DEVICEPRODUCTNAME = new PostpayLMMOptinPayKeyTypes("DEVICEPRODUCTNAME", 5);
    public static final PostpayLMMOptinPayKeyTypes DOCTYPE = new PostpayLMMOptinPayKeyTypes("DOCTYPE", 6);
    public static final PostpayLMMOptinPayKeyTypes DOCID = new PostpayLMMOptinPayKeyTypes("DOCID", 7);
    public static final PostpayLMMOptinPayKeyTypes PRODUCTPRICE = new PostpayLMMOptinPayKeyTypes("PRODUCTPRICE", 8);
    public static final PostpayLMMOptinPayKeyTypes REQUESTEDCREDITLIMIT = new PostpayLMMOptinPayKeyTypes("REQUESTEDCREDITLIMIT", 9);
    public static final PostpayLMMOptinPayKeyTypes CALLBACKURL = new PostpayLMMOptinPayKeyTypes("CALLBACKURL", 10);

    private PostpayLMMOptinPayKeyTypes(String str, int i) {
    }

    static {
        PostpayLMMOptinPayKeyTypes[] postpayLMMOptinPayKeyTypesArr$values = $values();
        $VALUES = postpayLMMOptinPayKeyTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(postpayLMMOptinPayKeyTypesArr$values);
        int i = component2 + 113;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PostpayLMMOptinPayKeyTypes valueOf(String str) {
        PostpayLMMOptinPayKeyTypes postpayLMMOptinPayKeyTypes;
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            postpayLMMOptinPayKeyTypes = (PostpayLMMOptinPayKeyTypes) Enum.valueOf(PostpayLMMOptinPayKeyTypes.class, str);
            int i3 = 11 / 0;
        } else {
            postpayLMMOptinPayKeyTypes = (PostpayLMMOptinPayKeyTypes) Enum.valueOf(PostpayLMMOptinPayKeyTypes.class, str);
        }
        int i4 = component3 + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return postpayLMMOptinPayKeyTypes;
    }

    public static PostpayLMMOptinPayKeyTypes[] values() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return (PostpayLMMOptinPayKeyTypes[]) $VALUES.clone();
        }
        throw null;
    }

    private static final PostpayLMMOptinPayKeyTypes[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        PostpayLMMOptinPayKeyTypes[] postpayLMMOptinPayKeyTypesArr = {DEPOSITAMOUNT, CREDITLIMIT, OKOAPRODUCT, STKAMOUNT, PRODUCTNAME, DEVICEPRODUCTNAME, DOCTYPE, DOCID, PRODUCTPRICE, REQUESTEDCREDITLIMIT, CALLBACKURL};
        int i5 = i2 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return postpayLMMOptinPayKeyTypesArr;
    }

    public static EnumEntries<PostpayLMMOptinPayKeyTypes> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<PostpayLMMOptinPayKeyTypes> enumEntries = $ENTRIES;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }
}
