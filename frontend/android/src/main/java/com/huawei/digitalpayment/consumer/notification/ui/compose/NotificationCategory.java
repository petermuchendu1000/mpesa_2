package com.huawei.digitalpayment.consumer.notification.ui.compose;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "TRANSACTION", "PROMOTIONS", "SYSTEM", "CustomerPushMessageUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationCategory {
    private static final EnumEntries $ENTRIES;
    private static final NotificationCategory[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String display;
    public static final NotificationCategory TRANSACTION = new NotificationCategory("TRANSACTION", 0, "Transaction");
    public static final NotificationCategory PROMOTIONS = new NotificationCategory("PROMOTIONS", 1, "Promotions");
    public static final NotificationCategory SYSTEM = new NotificationCategory("SYSTEM", 2, "System");

    private NotificationCategory(String str, int i, String str2) {
        this.display = str2;
    }

    public final String getDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.display;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        NotificationCategory[] notificationCategoryArr$values = $values();
        $VALUES = notificationCategoryArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(notificationCategoryArr$values);
        int i = component3 + 111;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static NotificationCategory valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (NotificationCategory) Enum.valueOf(NotificationCategory.class, str);
        }
        int i3 = 79 / 0;
        return (NotificationCategory) Enum.valueOf(NotificationCategory.class, str);
    }

    public static NotificationCategory[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return (NotificationCategory[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final NotificationCategory[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        NotificationCategory[] notificationCategoryArr = {TRANSACTION, PROMOTIONS, SYSTEM};
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return notificationCategoryArr;
    }

    public static EnumEntries<NotificationCategory> getEntries() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<NotificationCategory> enumEntries = $ENTRIES;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
