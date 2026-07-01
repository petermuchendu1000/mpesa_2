package com.huawei.digitalpayment.consumer.base.resp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceAuthenticationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PIN", "BIOMETRICS", "STK_PUSH", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceAuthenticationType {
    private static final EnumEntries $ENTRIES;
    private static final ReferenceAuthenticationType[] $VALUES;

    public static final Companion INSTANCE;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String value;
    public static final ReferenceAuthenticationType PIN = new ReferenceAuthenticationType("PIN", 0, "PIN");
    public static final ReferenceAuthenticationType BIOMETRICS = new ReferenceAuthenticationType("BIOMETRICS", 1, ReferenceAuthenticationTypes.BIOMETRICS);
    public static final ReferenceAuthenticationType STK_PUSH = new ReferenceAuthenticationType("STK_PUSH", 2, ReferenceAuthenticationTypes.STK_PUSH);

    private ReferenceAuthenticationType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        ReferenceAuthenticationType[] referenceAuthenticationTypeArr$values = $values();
        $VALUES = referenceAuthenticationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(referenceAuthenticationTypeArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component1 + 13;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceAuthenticationType$Companion;", "", "<init>", "()V", "from", "Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceAuthenticationType;", "rawValue", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int component3;

        private Companion() {
        }

        public final ReferenceAuthenticationType from(String rawValue) {
            ReferenceAuthenticationType next;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(rawValue, "");
            Iterator<ReferenceAuthenticationType> it = ReferenceAuthenticationType.getEntries().iterator();
            int i2 = component2 + 125;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = component2 + 1;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                next = it.next();
                if (StringsKt.equals(next.getValue(), StringsKt.trim(rawValue).toString(), true)) {
                    break;
                }
            }
            return next;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static ReferenceAuthenticationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (ReferenceAuthenticationType) Enum.valueOf(ReferenceAuthenticationType.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReferenceAuthenticationType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (ReferenceAuthenticationType[]) $VALUES.clone();
        }
        throw null;
    }

    private static final ReferenceAuthenticationType[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ReferenceAuthenticationType referenceAuthenticationType = PIN;
        if (i3 != 0) {
            return new ReferenceAuthenticationType[]{referenceAuthenticationType, BIOMETRICS, STK_PUSH};
        }
        ReferenceAuthenticationType referenceAuthenticationType2 = BIOMETRICS;
        ReferenceAuthenticationType referenceAuthenticationType3 = STK_PUSH;
        ReferenceAuthenticationType[] referenceAuthenticationTypeArr = new ReferenceAuthenticationType[5];
        referenceAuthenticationTypeArr[1] = referenceAuthenticationType;
        referenceAuthenticationTypeArr[0] = referenceAuthenticationType2;
        referenceAuthenticationTypeArr[4] = referenceAuthenticationType3;
        return referenceAuthenticationTypeArr;
    }

    public static EnumEntries<ReferenceAuthenticationType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<ReferenceAuthenticationType> enumEntries = $ENTRIES;
        int i4 = i3 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
