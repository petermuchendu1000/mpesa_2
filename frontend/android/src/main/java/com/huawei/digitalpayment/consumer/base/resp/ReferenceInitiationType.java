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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceInitiationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MANUAL", "QR_CODE", "AI_PAY", ReferenceInitiationTypes.nfc, "SELECT_CONTACTS", "FAVOURITES", "FREQUENTS", "POPULAR_BUSINESS", "DEEP_LINK", "MINI_APP", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceInitiationType {
    private static final EnumEntries $ENTRIES;
    private static final ReferenceInitiationType[] $VALUES;

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private final String value;
    public static final ReferenceInitiationType MANUAL = new ReferenceInitiationType("MANUAL", 0, ReferenceInitiationTypes.manual);
    public static final ReferenceInitiationType QR_CODE = new ReferenceInitiationType("QR_CODE", 1, ReferenceInitiationTypes.qrCode);
    public static final ReferenceInitiationType AI_PAY = new ReferenceInitiationType("AI_PAY", 2, ReferenceInitiationTypes.aiPay);
    public static final ReferenceInitiationType NFC = new ReferenceInitiationType(ReferenceInitiationTypes.nfc, 3, ReferenceInitiationTypes.nfc);
    public static final ReferenceInitiationType SELECT_CONTACTS = new ReferenceInitiationType("SELECT_CONTACTS", 4, ReferenceInitiationTypes.selectContacts);
    public static final ReferenceInitiationType FAVOURITES = new ReferenceInitiationType("FAVOURITES", 5, ReferenceInitiationTypes.favorites);
    public static final ReferenceInitiationType FREQUENTS = new ReferenceInitiationType("FREQUENTS", 6, ReferenceInitiationTypes.frequents);
    public static final ReferenceInitiationType POPULAR_BUSINESS = new ReferenceInitiationType("POPULAR_BUSINESS", 7, ReferenceInitiationTypes.popularBusiness);
    public static final ReferenceInitiationType DEEP_LINK = new ReferenceInitiationType("DEEP_LINK", 8, ReferenceInitiationTypes.deepLink);
    public static final ReferenceInitiationType MINI_APP = new ReferenceInitiationType("MINI_APP", 9, ReferenceInitiationTypes.miniApp);

    private ReferenceInitiationType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    static {
        ReferenceInitiationType[] referenceInitiationTypeArr$values = $values();
        $VALUES = referenceInitiationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(referenceInitiationTypeArr$values);
        INSTANCE = new Companion(null);
        int i = component1 + 69;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceInitiationType$Companion;", "", "<init>", "()V", "from", "Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceInitiationType;", "rawValue", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private Companion() {
        }

        public final ReferenceInitiationType from(String rawValue) {
            ReferenceInitiationType next;
            int i = 2 % 2;
            int i2 = component1 + 77;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(rawValue, "");
            Iterator<ReferenceInitiationType> it = ReferenceInitiationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i4 = component1 + 105;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    next = null;
                    break;
                }
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

    public static ReferenceInitiationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ReferenceInitiationType referenceInitiationType = (ReferenceInitiationType) Enum.valueOf(ReferenceInitiationType.class, str);
        int i4 = component3 + 69;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return referenceInitiationType;
    }

    public static ReferenceInitiationType[] values() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ReferenceInitiationType[] referenceInitiationTypeArr = (ReferenceInitiationType[]) $VALUES.clone();
        int i3 = component2 + 21;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return referenceInitiationTypeArr;
        }
        obj.hashCode();
        throw null;
    }

    private static final ReferenceInitiationType[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ReferenceInitiationType[] referenceInitiationTypeArr = {MANUAL, QR_CODE, AI_PAY, NFC, SELECT_CONTACTS, FAVOURITES, FREQUENTS, POPULAR_BUSINESS, DEEP_LINK, MINI_APP};
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return referenceInitiationTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ReferenceInitiationType> getEntries() {
        EnumEntries<ReferenceInitiationType> enumEntries;
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 76 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
