package com.huawei.digitalpayment.consumer.notification.ui.viewmodel;

import com.huawei.digitalpayment.consumer.notification.ui.compose.NotificationCategory;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "", "toPushType", "(Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;)Ljava/lang/String;", "", "j$/time/LocalDateTime", "toLocalDateTime", "(J)Lj$/time/LocalDateTime;", "CustomerPushMessageUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NotificationsViewModelKt {
    private static int component1 = 0;
    private static int component2 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 1;
        private static int copydefault;

        static {
            int[] iArr = new int[NotificationCategory.values().length];
            try {
                iArr[NotificationCategory.TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationCategory.PROMOTIONS.ordinal()] = 2;
                int i = ShareDataUIState + 79;
                copydefault = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i4 = ShareDataUIState + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final String toPushType(NotificationCategory notificationCategory) {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(notificationCategory, "");
        int i4 = WhenMappings.$EnumSwitchMapping$0[notificationCategory.ordinal()];
        if (i4 != 1) {
            int i5 = component2 + 103;
            int i6 = i5 % 128;
            component1 = i6;
            if (i5 % 2 == 0 ? i4 == 2 : i4 == 2) {
                int i7 = i6 + 121;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                str = "2";
            } else {
                int i9 = i6 + 123;
                component2 = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
                str = "0";
            }
        } else {
            str = "1";
        }
        int i10 = component2 + 77;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }

    public static final LocalDateTime toLocalDateTime(long j) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
            Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "");
            int i3 = component2 + 69;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return localDateTimeOfInstant;
        }
        Intrinsics.checkNotNullExpressionValue(LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault()), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
