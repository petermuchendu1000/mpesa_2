package com.huawei.digitalpayment.consumer.notification.ui.compose;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.bean.NotificationMessageBean;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.iap.ac.android.acs.operation.log.LogConstants;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0080\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÇ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u000101H×\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b\u0003\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b;\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u0010!R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b=\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bB\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010,¨\u0006E"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationItem;", "Landroid/os/Parcelable;", "", "isSeen", "", "iconRes", "", "title", "content", LogConstants.Mpm.Interceptor.ACTION, "amount", DisPlayItems.TRANSACTION_ID, "Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "j$/time/LocalDateTime", "timestamp", "notificationId", "Lcom/huawei/digitalpayment/consumer/bean/NotificationMessageBean;", "originalRecord", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;Lj$/time/LocalDateTime;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/bean/NotificationMessageBean;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "component9", "()Lj$/time/LocalDateTime;", "component10", "component11", "()Lcom/huawei/digitalpayment/consumer/bean/NotificationMessageBean;", "copy", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;Lj$/time/LocalDateTime;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/bean/NotificationMessageBean;)Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "I", "getIconRes", "Ljava/lang/String;", "getTitle", "getContent", "getAction", "getAmount", "getTransactionId", "Lcom/huawei/digitalpayment/consumer/notification/ui/compose/NotificationCategory;", "getCategory", "Lj$/time/LocalDateTime;", "getTimestamp", "getNotificationId", "Lcom/huawei/digitalpayment/consumer/bean/NotificationMessageBean;", "getOriginalRecord", "CustomerPushMessageUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final String action;
    private final String amount;
    private final NotificationCategory category;
    private final String content;
    private final int iconRes;
    private final boolean isSeen;
    private final String notificationId;
    private final NotificationMessageBean originalRecord;
    private final LocalDateTime timestamp;
    private final String title;
    private final String transactionId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationItem> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final NotificationItem createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i4 = copydefault + 33;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new NotificationItem(z, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), NotificationCategory.valueOf(parcel.readString()), (LocalDateTime) parcel.readSerializable(), parcel.readString(), (NotificationMessageBean) parcel.readSerializable());
        }

        @Override
        public NotificationItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final NotificationItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 101;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            NotificationItem[] notificationItemArr = new NotificationItem[i];
            int i6 = i4 + 31;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 41 / 0;
            }
            return notificationItemArr;
        }

        @Override
        public NotificationItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 77;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            NotificationItem[] notificationItemArrNewArray = newArray(i);
            int i4 = copydefault + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return notificationItemArrNewArray;
        }
    }

    public NotificationItem(boolean z, int i, String str, String str2, String str3, String str4, String str5, NotificationCategory notificationCategory, LocalDateTime localDateTime, String str6, NotificationMessageBean notificationMessageBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(notificationCategory, "");
        Intrinsics.checkNotNullParameter(localDateTime, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.isSeen = z;
        this.iconRes = i;
        this.title = str;
        this.content = str2;
        this.action = str3;
        this.amount = str4;
        this.transactionId = str5;
        this.category = notificationCategory;
        this.timestamp = localDateTime;
        this.notificationId = str6;
        this.originalRecord = notificationMessageBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotificationItem(boolean z, int i, String str, String str2, String str3, String str4, String str5, NotificationCategory notificationCategory, LocalDateTime localDateTime, String str6, NotificationMessageBean notificationMessageBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        String str7;
        NotificationCategory notificationCategory2;
        LocalDateTime localDateTimeNow;
        if ((i2 & 1) != 0) {
            int i3 = component2 + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        int i6 = (i2 & 2) != 0 ? R.drawable.notification : i;
        String str8 = "";
        String str9 = (i2 & 4) != 0 ? "" : str;
        String str10 = (i2 & 8) != 0 ? "" : str2;
        if ((i2 & 16) != 0) {
            int i7 = component2 + 9;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        String str11 = (i2 & 32) != 0 ? "" : str4;
        String str12 = (i2 & 64) != 0 ? "" : str5;
        if ((i2 & 128) != 0) {
            notificationCategory2 = NotificationCategory.TRANSACTION;
            int i9 = 2 % 2;
        } else {
            notificationCategory2 = notificationCategory;
        }
        if ((i2 & 256) != 0) {
            localDateTimeNow = LocalDateTime.now();
            int i10 = 2 % 2;
        } else {
            localDateTimeNow = localDateTime;
        }
        if ((i2 & 512) != 0) {
            int i11 = component2 + 93;
            ShareDataUIState = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 2 % 2;
            }
        } else {
            str8 = str6;
        }
        this(z2, i6, str9, str10, str7, str11, str12, notificationCategory2, localDateTimeNow, str8, (i2 & 1024) != 0 ? null : notificationMessageBean);
    }

    public final boolean isSeen() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isSeen;
        }
        throw null;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.iconRes;
        if (i3 != 0) {
            int i5 = 9 / 0;
        }
        return i4;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.content;
        int i4 = i3 + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAction() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.action;
        }
        throw null;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.amount;
            int i4 = 81 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.transactionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NotificationCategory getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        NotificationCategory notificationCategory = this.category;
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return notificationCategory;
    }

    public final LocalDateTime getTimestamp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.timestamp;
        }
        throw null;
    }

    public final String getNotificationId() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.notificationId;
            int i4 = 29 / 0;
        } else {
            str = this.notificationId;
        }
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NotificationMessageBean getOriginalRecord() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        NotificationMessageBean notificationMessageBean = this.originalRecord;
        int i4 = i2 + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return notificationMessageBean;
        }
        throw null;
    }

    static {
        int i = component1 + 83;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public NotificationItem() {
        this(false, 0, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static NotificationItem copy$default(NotificationItem notificationItem, boolean z, int i, String str, String str2, String str3, String str4, String str5, NotificationCategory notificationCategory, LocalDateTime localDateTime, String str6, NotificationMessageBean notificationMessageBean, int i2, Object obj) {
        String str7;
        NotificationCategory notificationCategory2;
        int i3 = 2 % 2;
        boolean z2 = (i2 & 1) != 0 ? notificationItem.isSeen : z;
        int i4 = (i2 & 2) != 0 ? notificationItem.iconRes : i;
        String str8 = (i2 & 4) != 0 ? notificationItem.title : str;
        String str9 = (i2 & 8) != 0 ? notificationItem.content : str2;
        String str10 = (i2 & 16) != 0 ? notificationItem.action : str3;
        String str11 = (i2 & 32) != 0 ? notificationItem.amount : str4;
        if ((i2 & 64) != 0) {
            int i5 = ShareDataUIState + 115;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str7 = notificationItem.transactionId;
        } else {
            str7 = str5;
        }
        if ((i2 & 128) != 0) {
            int i7 = ShareDataUIState + 113;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            notificationCategory2 = notificationItem.category;
        } else {
            notificationCategory2 = notificationCategory;
        }
        return notificationItem.copy(z2, i4, str8, str9, str10, str11, str7, notificationCategory2, (i2 & 256) != 0 ? notificationItem.timestamp : localDateTime, (i2 & 512) != 0 ? notificationItem.notificationId : str6, (i2 & 1024) != 0 ? notificationItem.originalRecord : notificationMessageBean);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isSeen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.notificationId;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NotificationMessageBean component11() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        NotificationMessageBean notificationMessageBean = this.originalRecord;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return notificationMessageBean;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.iconRes;
        int i5 = i2 + 53;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.content;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.action;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.transactionId;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final NotificationCategory component8() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public final LocalDateTime component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LocalDateTime localDateTime = this.timestamp;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return localDateTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NotificationItem copy(boolean isSeen, int iconRes, String title, String content, String action, String amount, String transactionId, NotificationCategory category, LocalDateTime timestamp, String notificationId, NotificationMessageBean originalRecord) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(content, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(transactionId, "");
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        Intrinsics.checkNotNullParameter(notificationId, "");
        NotificationItem notificationItem = new NotificationItem(isSeen, iconRes, title, content, action, amount, transactionId, category, timestamp, notificationId, originalRecord);
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return notificationItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationItem)) {
            int i2 = component2 + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        NotificationItem notificationItem = (NotificationItem) other;
        if (this.isSeen != notificationItem.isSeen) {
            int i4 = component2 + 35;
            ShareDataUIState = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.iconRes != notificationItem.iconRes || !Intrinsics.areEqual(this.title, notificationItem.title) || !Intrinsics.areEqual(this.content, notificationItem.content) || !Intrinsics.areEqual(this.action, notificationItem.action)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, notificationItem.amount)) {
            int i5 = component2 + 75;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.transactionId, notificationItem.transactionId)) {
            return false;
        }
        if (this.category != notificationItem.category) {
            int i7 = ShareDataUIState + 91;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.timestamp, notificationItem.timestamp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.notificationId, notificationItem.notificationId)) {
            int i9 = component2 + 73;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.originalRecord, notificationItem.originalRecord)) {
            return false;
        }
        int i11 = component2 + 33;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.isSeen);
        int iHashCode3 = Integer.hashCode(this.iconRes);
        int iHashCode4 = this.title.hashCode();
        int iHashCode5 = this.content.hashCode();
        int iHashCode6 = this.action.hashCode();
        int iHashCode7 = this.amount.hashCode();
        int iHashCode8 = this.transactionId.hashCode();
        int iHashCode9 = this.category.hashCode();
        int iHashCode10 = this.timestamp.hashCode();
        int iHashCode11 = this.notificationId.hashCode();
        NotificationMessageBean notificationMessageBean = this.originalRecord;
        if (notificationMessageBean == null) {
            int i4 = component2 + 17;
            ShareDataUIState = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = notificationMessageBean.hashCode();
        }
        int i5 = (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode;
        int i6 = component2 + 97;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return i5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NotificationItem(isSeen=" + this.isSeen + ", iconRes=" + this.iconRes + ", title=" + this.title + ", content=" + this.content + ", action=" + this.action + ", amount=" + this.amount + ", transactionId=" + this.transactionId + ", category=" + this.category + ", timestamp=" + this.timestamp + ", notificationId=" + this.notificationId + ", originalRecord=" + this.originalRecord + ")";
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isSeen ? 1 : 0);
        dest.writeInt(this.iconRes);
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeString(this.action);
        dest.writeString(this.amount);
        dest.writeString(this.transactionId);
        dest.writeString(this.category.name());
        dest.writeSerializable(this.timestamp);
        dest.writeString(this.notificationId);
        dest.writeSerializable(this.originalRecord);
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
