package com.huawei.digitalpayment.consumer.notification.ui.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationUiState;", "", "selectedCategory", "Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "notifications", "", "Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationItem;", "<init>", "(Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;Ljava/util/List;)V", "getSelectedCategory", "()Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "getNotifications", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CustomerPushMessageUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationUiState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    private final NotificationCategory component2;
    private final List<NotificationItem> copydefault;

    public NotificationUiState(NotificationCategory notificationCategory, List<NotificationItem> list) {
        Intrinsics.checkNotNullParameter(notificationCategory, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = notificationCategory;
        this.copydefault = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationUiState(NotificationCategory notificationCategory, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = equals + 7;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            notificationCategory = NotificationCategory.TRANSACTION;
        }
        if ((i & 2) != 0) {
            int i4 = equals + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            list = CollectionsKt.emptyList();
            int i6 = 2 % 2;
        }
        this(notificationCategory, list);
    }

    public final NotificationCategory getSelectedCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        NotificationCategory notificationCategory = this.component2;
        int i5 = i2 + 75;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return notificationCategory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<NotificationItem> getNotifications() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<NotificationItem> list = this.copydefault;
        int i5 = i3 + 61;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 125;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NotificationUiState copy$default(NotificationUiState notificationUiState, NotificationCategory notificationCategory, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            notificationCategory = notificationUiState.component2;
            int i3 = equals + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = equals + 115;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            if (i5 % 2 != 0) {
                list = notificationUiState.copydefault;
                int i7 = 87 / 0;
            } else {
                list = notificationUiState.copydefault;
            }
            int i8 = i6 + 67;
            equals = i8 % 128;
            int i9 = i8 % 2;
        }
        return notificationUiState.copy(notificationCategory, list);
    }

    public final NotificationCategory component1() {
        int i = 2 % 2;
        int i2 = equals + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        NotificationCategory notificationCategory = this.component2;
        int i4 = i3 + 73;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return notificationCategory;
    }

    public final List<NotificationItem> component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<NotificationItem> list = this.copydefault;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final NotificationUiState copy(NotificationCategory selectedCategory, List<NotificationItem> notifications) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedCategory, "");
        Intrinsics.checkNotNullParameter(notifications, "");
        NotificationUiState notificationUiState = new NotificationUiState(selectedCategory, notifications);
        int i2 = equals + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return notificationUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        equals = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 71;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof NotificationUiState)) {
            int i6 = i2 + 107;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        NotificationUiState notificationUiState = (NotificationUiState) other;
        if (this.component2 != notificationUiState.component2) {
            int i7 = i2 + 3;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, notificationUiState.copydefault)) {
            return true;
        }
        int i9 = ShareDataUIState + 69;
        equals = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        equals = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.component2.hashCode() / 62) >> this.copydefault.hashCode() : (this.component2.hashCode() * 31) + this.copydefault.hashCode();
        int i3 = equals + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotificationUiState(selectedCategory=" + this.component2 + ", notifications=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
