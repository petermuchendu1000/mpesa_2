package com.huawei.digitalpayment.consumer.scan.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class CustomerType {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private String code;
    private String name;
    public static final CustomerType REGISTERED = new CustomerType("REGISTERED", 0, "Register", "01");
    public static final CustomerType UN_REGISTERED = new CustomerType("UN_REGISTERED", 1, "Unregister", "02");
    private static final CustomerType[] $VALUES = $values();

    private static CustomerType[] $values() {
        CustomerType[] customerTypeArr;
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            CustomerType customerType = REGISTERED;
            CustomerType customerType2 = UN_REGISTERED;
            customerTypeArr = new CustomerType[5];
            customerTypeArr[0] = customerType;
            customerTypeArr[0] = customerType2;
        } else {
            customerTypeArr = new CustomerType[]{REGISTERED, UN_REGISTERED};
        }
        int i4 = i3 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return customerTypeArr;
        }
        throw null;
    }

    public static CustomerType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CustomerType customerType = (CustomerType) Enum.valueOf(CustomerType.class, str);
        int i4 = component2 + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return customerType;
    }

    public static CustomerType[] values() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CustomerType[] customerTypeArr = $VALUES;
        if (i3 != 0) {
            return (CustomerType[]) customerTypeArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 39;
        component1 = i % 128;
        int i2 = i % 2;
    }

    private CustomerType(String str, int i, String str2, String str3) {
        this.name = str2;
        this.code = str3;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getCode() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
