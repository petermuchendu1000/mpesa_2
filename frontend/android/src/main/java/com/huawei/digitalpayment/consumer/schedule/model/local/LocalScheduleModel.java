package com.huawei.digitalpayment.consumer.schedule.model.local;

import com.huawei.common.display.DisplayItem;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J¯\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "Lcom/huawei/http/BaseResp;", "scheduleName", "", "amount", "firstPaymentReminderDate", "initiatorIdentifier", "frequency", "transactionType", "initiatorIdentifierType", "issuePaymentReminderUntil", "freeText", "reminderScheduleId", "currency", "preWarningPeriod", "receiverMsisdn", "needConfirmation", "sendPreWarning", "displayItems", "", "Lcom/huawei/common/display/DisplayItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getScheduleName", "()Ljava/lang/String;", "getAmount", "getFirstPaymentReminderDate", "getInitiatorIdentifier", "getFrequency", "getTransactionType", "getInitiatorIdentifierType", "getIssuePaymentReminderUntil", "getFreeText", "getReminderScheduleId", "getCurrency", "getPreWarningPeriod", "getReceiverMsisdn", "getNeedConfirmation", "getSendPreWarning", "getDisplayItems", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "toString", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalScheduleModel extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private final String amount;
    private final String currency;
    private final List<DisplayItem> displayItems;
    private final String firstPaymentReminderDate;
    private final String freeText;
    private final String frequency;
    private final String initiatorIdentifier;
    private final String initiatorIdentifierType;
    private final String issuePaymentReminderUntil;
    private final String needConfirmation;
    private final String preWarningPeriod;
    private final String receiverMsisdn;
    private final String reminderScheduleId;
    private final String scheduleName;
    private final String sendPreWarning;
    private final String transactionType;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalScheduleModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str16 = "";
        } else {
            str16 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = copydefault + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str17 = "";
        } else {
            str17 = str3;
        }
        String str28 = (i & 8) != 0 ? "" : str4;
        String str29 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            int i7 = component2 + 75;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str18 = "";
        } else {
            str18 = str6;
        }
        String str30 = (i & 64) != 0 ? "" : str7;
        if ((i & 128) != 0) {
            int i9 = component2 + 77;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            str19 = "";
        } else {
            str19 = str8;
        }
        if ((i & 256) != 0) {
            int i11 = copydefault + 15;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            str20 = "";
        } else {
            str20 = str9;
        }
        if ((i & 512) != 0) {
            int i13 = 2 % 2;
            str21 = "";
        } else {
            str21 = str10;
        }
        String str31 = (i & 1024) != 0 ? "" : str11;
        if ((i & 2048) != 0) {
            int i14 = copydefault + 97;
            component2 = i14 % 128;
            int i15 = i14 % 2;
            str22 = "";
        } else {
            str22 = str12;
        }
        if ((i & 4096) != 0) {
            int i16 = component2 + 17;
            str23 = "";
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            str24 = str23;
        } else {
            str23 = "";
            str24 = str13;
        }
        if ((i & 8192) != 0) {
            int i18 = component2 + 125;
            str25 = str24;
            copydefault = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 93 / 0;
            }
            str26 = str23;
        } else {
            str25 = str24;
            str26 = str14;
        }
        this(str27, str16, str17, str28, str29, str18, str30, str19, str20, str21, str31, str22, str25, str26, (i & 16384) != 0 ? str23 : str15, (i & 32768) != 0 ? new ArrayList() : list);
    }

    public final String getScheduleName() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.scheduleName;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getFirstPaymentReminderDate() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.firstPaymentReminderDate;
            int i4 = 27 / 0;
        } else {
            str = this.firstPaymentReminderDate;
        }
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final String getInitiatorIdentifier() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorIdentifier;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFrequency() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.frequency;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTransactionType() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionType;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return str;
    }

    public final String getInitiatorIdentifierType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorIdentifierType;
        int i4 = i2 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getIssuePaymentReminderUntil() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.issuePaymentReminderUntil;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getFreeText() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.freeText;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String getReminderScheduleId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.reminderScheduleId;
        int i4 = i2 + 93;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.currency;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public final String getPreWarningPeriod() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.preWarningPeriod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getReceiverMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.receiverMsisdn;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNeedConfirmation() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.needConfirmation;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final String getSendPreWarning() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.sendPreWarning;
        }
        throw null;
    }

    public final List<DisplayItem> getDisplayItems() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<DisplayItem> list = this.displayItems;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public LocalScheduleModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<DisplayItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.scheduleName = str;
        this.amount = str2;
        this.firstPaymentReminderDate = str3;
        this.initiatorIdentifier = str4;
        this.frequency = str5;
        this.transactionType = str6;
        this.initiatorIdentifierType = str7;
        this.issuePaymentReminderUntil = str8;
        this.freeText = str9;
        this.reminderScheduleId = str10;
        this.currency = str11;
        this.preWarningPeriod = str12;
        this.receiverMsisdn = str13;
        this.needConfirmation = str14;
        this.sendPreWarning = str15;
        this.displayItems = list;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof LocalScheduleModel) {
            return Objects.equals(this.reminderScheduleId, ((LocalScheduleModel) other).reminderScheduleId);
        }
        int i5 = i2 + 49;
        component2 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.reminderScheduleId.hashCode();
            throw null;
        }
        int iHashCode = this.reminderScheduleId.hashCode();
        int i3 = copydefault + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public LocalScheduleModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalScheduleModel copy$default(LocalScheduleModel localScheduleModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, int i, Object obj) {
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 51;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str23 = localScheduleModel.scheduleName;
                throw null;
            }
            str16 = localScheduleModel.scheduleName;
        } else {
            str16 = str;
        }
        String str24 = (i & 2) != 0 ? localScheduleModel.amount : str2;
        String str25 = (i & 4) != 0 ? localScheduleModel.firstPaymentReminderDate : str3;
        if ((i & 8) != 0) {
            int i4 = component2 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str17 = localScheduleModel.initiatorIdentifier;
        } else {
            str17 = str4;
        }
        if ((i & 16) != 0) {
            str18 = localScheduleModel.frequency;
            int i6 = component2 + 85;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str18 = str5;
        }
        String str26 = (i & 32) != 0 ? localScheduleModel.transactionType : str6;
        String str27 = (i & 64) != 0 ? localScheduleModel.initiatorIdentifierType : str7;
        String str28 = (i & 128) != 0 ? localScheduleModel.issuePaymentReminderUntil : str8;
        if ((i & 256) != 0) {
            int i8 = copydefault + 93;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str19 = localScheduleModel.freeText;
        } else {
            str19 = str9;
        }
        if ((i & 512) != 0) {
            int i10 = copydefault + 41;
            component2 = i10 % 128;
            if (i10 % 2 == 0) {
                String str29 = localScheduleModel.reminderScheduleId;
                throw null;
            }
            str20 = localScheduleModel.reminderScheduleId;
        } else {
            str20 = str10;
        }
        String str30 = (i & 1024) != 0 ? localScheduleModel.currency : str11;
        String str31 = (i & 2048) != 0 ? localScheduleModel.preWarningPeriod : str12;
        if ((i & 4096) != 0) {
            int i11 = component2 + 23;
            str21 = str31;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                String str32 = localScheduleModel.receiverMsisdn;
                throw null;
            }
            str22 = localScheduleModel.receiverMsisdn;
        } else {
            str21 = str31;
            str22 = str13;
        }
        return localScheduleModel.copy(str16, str24, str25, str17, str18, str26, str27, str28, str19, str20, str30, str21, str22, (i & 8192) != 0 ? localScheduleModel.needConfirmation : str14, (i & 16384) != 0 ? localScheduleModel.sendPreWarning : str15, (i & 32768) != 0 ? localScheduleModel.displayItems : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.scheduleName;
        int i4 = i2 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.reminderScheduleId;
        }
        throw null;
    }

    public final String component11() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.currency;
            int i4 = 91 / 0;
        } else {
            str = this.currency;
        }
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.preWarningPeriod;
            int i4 = 25 / 0;
        } else {
            str = this.preWarningPeriod;
        }
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.receiverMsisdn;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.needConfirmation;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sendPreWarning;
        }
        throw null;
    }

    public final List<DisplayItem> component16() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<DisplayItem> list = this.displayItems;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.amount;
            int i4 = 99 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.firstPaymentReminderDate;
            int i4 = 65 / 0;
        } else {
            str = this.firstPaymentReminderDate;
        }
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorIdentifier;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.frequency;
        int i4 = i2 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.transactionType;
        int i4 = i3 + 95;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorIdentifierType;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.issuePaymentReminderUntil;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.freeText;
        int i5 = i3 + 7;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalScheduleModel copy(String scheduleName, String amount, String firstPaymentReminderDate, String initiatorIdentifier, String frequency, String transactionType, String initiatorIdentifierType, String issuePaymentReminderUntil, String freeText, String reminderScheduleId, String currency, String preWarningPeriod, String receiverMsisdn, String needConfirmation, String sendPreWarning, List<DisplayItem> displayItems) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(scheduleName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(firstPaymentReminderDate, "");
        Intrinsics.checkNotNullParameter(initiatorIdentifier, "");
        Intrinsics.checkNotNullParameter(frequency, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(initiatorIdentifierType, "");
        Intrinsics.checkNotNullParameter(issuePaymentReminderUntil, "");
        Intrinsics.checkNotNullParameter(freeText, "");
        Intrinsics.checkNotNullParameter(reminderScheduleId, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(preWarningPeriod, "");
        Intrinsics.checkNotNullParameter(receiverMsisdn, "");
        Intrinsics.checkNotNullParameter(needConfirmation, "");
        Intrinsics.checkNotNullParameter(sendPreWarning, "");
        Intrinsics.checkNotNullParameter(displayItems, "");
        LocalScheduleModel localScheduleModel = new LocalScheduleModel(scheduleName, amount, firstPaymentReminderDate, initiatorIdentifier, frequency, transactionType, initiatorIdentifierType, issuePaymentReminderUntil, freeText, reminderScheduleId, currency, preWarningPeriod, receiverMsisdn, needConfirmation, sendPreWarning, displayItems);
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return localScheduleModel;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalScheduleModel(scheduleName=" + this.scheduleName + ", amount=" + this.amount + ", firstPaymentReminderDate=" + this.firstPaymentReminderDate + ", initiatorIdentifier=" + this.initiatorIdentifier + ", frequency=" + this.frequency + ", transactionType=" + this.transactionType + ", initiatorIdentifierType=" + this.initiatorIdentifierType + ", issuePaymentReminderUntil=" + this.issuePaymentReminderUntil + ", freeText=" + this.freeText + ", reminderScheduleId=" + this.reminderScheduleId + ", currency=" + this.currency + ", preWarningPeriod=" + this.preWarningPeriod + ", receiverMsisdn=" + this.receiverMsisdn + ", needConfirmation=" + this.needConfirmation + ", sendPreWarning=" + this.sendPreWarning + ", displayItems=" + this.displayItems + ")";
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 82 / 0;
        }
        return str;
    }
}
