package com.safaricom.consumer.commons.statements;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0012HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003JÑ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006N"}, d2 = {"Lcom/safaricom/consumer/commons/statements/Statement;", "Ljava/io/Serializable;", "accountRef", "", "accountType", "accountTypeID", "currency", ErrorBundle.DETAIL_ENTRY, "endTime", "funds_type", GriverCacheDao.COLUMN_CACHE_ID, "money_in", "money_out", "primaryParty", "Lcom/safaricom/consumer/commons/statements/PrimaryParty;", "reasonType", "reasonTypeID", "receiverParty", "Lcom/safaricom/consumer/commons/statements/ReceiverParty;", "reversible", "runningBalance", "transID", "transactionFee", "transactionType", "transactionTypeID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/statements/PrimaryParty;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/consumer/commons/statements/ReceiverParty;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountRef", "()Ljava/lang/String;", "getAccountType", "getAccountTypeID", "getCurrency", "getDetails", "getEndTime", "getFunds_type", "getId", "getMoney_in", "getMoney_out", "getPrimaryParty", "()Lcom/safaricom/consumer/commons/statements/PrimaryParty;", "getReasonType", "getReasonTypeID", "getReceiverParty", "()Lcom/safaricom/consumer/commons/statements/ReceiverParty;", "getReversible", "getRunningBalance", "getTransID", "getTransactionFee", "getTransactionType", "getTransactionTypeID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Statement implements Serializable {
    private final String accountRef;
    private final String accountType;
    private final String accountTypeID;
    private final String currency;
    private final String details;
    private final String endTime;
    private final String funds_type;
    private final String id;
    private final String money_in;
    private final String money_out;
    private final PrimaryParty primaryParty;
    private final String reasonType;
    private final String reasonTypeID;
    private final ReceiverParty receiverParty;
    private final String reversible;
    private final String runningBalance;
    private final String transID;
    private final String transactionFee;
    private final String transactionType;
    private final String transactionTypeID;

    public Statement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, PrimaryParty primaryParty, String str11, String str12, ReceiverParty receiverParty, String str13, String str14, String str15, String str16, String str17, String str18) {
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
        Intrinsics.checkNotNullParameter(primaryParty, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(receiverParty, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.accountRef = str;
        this.accountType = str2;
        this.accountTypeID = str3;
        this.currency = str4;
        this.details = str5;
        this.endTime = str6;
        this.funds_type = str7;
        this.id = str8;
        this.money_in = str9;
        this.money_out = str10;
        this.primaryParty = primaryParty;
        this.reasonType = str11;
        this.reasonTypeID = str12;
        this.receiverParty = receiverParty;
        this.reversible = str13;
        this.runningBalance = str14;
        this.transID = str15;
        this.transactionFee = str16;
        this.transactionType = str17;
        this.transactionTypeID = str18;
    }

    public final String getAccountRef() {
        return this.accountRef;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getAccountTypeID() {
        return this.accountTypeID;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFunds_type() {
        return this.funds_type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMoney_in() {
        return this.money_in;
    }

    public final String getMoney_out() throws Throwable {
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(68 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 33, (char) (19695 - TextUtils.indexOf((CharSequence) "", '0', 0)), 518907119, false, "component3", null);
        }
        int i = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ImageFormat.getBitsPerPixel(0) + 31, (char) (ViewConfiguration.getTapTimeout() >> 16), 55511118, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault2).getInt(null);
        long j = i2;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 37, (ViewConfiguration.getTouchSlop() >> 8) + 30, (char) TextUtils.getTrimmedLength(""), 58536393, false, "component3", null);
        }
        int i3 = ((Field) objCopydefault3).getInt(null);
        long j2 = 503;
        long j3 = (j2 * 2427466127996547888L) + (j2 * (-1634762674352343464L));
        long j4 = -502;
        long j5 = -1;
        long j6 = j5 ^ 2427466127996547888L;
        long j7 = (j6 | (j5 ^ (-1634762674352343464L))) ^ j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = j6 | (jIdentityHashCode ^ j5);
        long j9 = ((-1589700749352241288L) | jIdentityHashCode) ^ j5;
        long j10 = j3 + (j4 * (-1589700749352241288L)) + (j4 * (j7 | (j8 ^ j5) | j9)) + (((long) 502) * (j9 | (j5 ^ (j8 | (-1634762674352343464L)))));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j10;
        }
        if (i3 != i) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j11 = -1;
            long j12 = 0;
            long j13 = (((long) (i2 ^ i)) & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 6618, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-588244829, Long.valueOf(j13), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 56, (char) Color.blue(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.money_out;
    }

    public final PrimaryParty getPrimaryParty() {
        return this.primaryParty;
    }

    public final String getReasonType() {
        return this.reasonType;
    }

    public final String getReasonTypeID() {
        return this.reasonTypeID;
    }

    public final ReceiverParty getReceiverParty() {
        return this.receiverParty;
    }

    public final String getReversible() {
        return this.reversible;
    }

    public final String getRunningBalance() {
        return this.runningBalance;
    }

    public final String getTransID() {
        return this.transID;
    }

    public final String getTransactionFee() {
        return this.transactionFee;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public final String getTransactionTypeID() {
        return this.transactionTypeID;
    }

    public final String getAccountRef() {
        return this.accountRef;
    }

    public final String getMoney_out() {
        return this.money_out;
    }

    public final PrimaryParty getPrimaryParty() {
        return this.primaryParty;
    }

    public final String getReasonType() {
        return this.reasonType;
    }

    public final String getReasonTypeID() {
        return this.reasonTypeID;
    }

    public final ReceiverParty getReceiverParty() {
        return this.receiverParty;
    }

    public final String getReversible() {
        return this.reversible;
    }

    public final String getRunningBalance() {
        return this.runningBalance;
    }

    public final String getTransID() {
        return this.transID;
    }

    public final String getTransactionFee() {
        return this.transactionFee;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getTransactionTypeID() {
        return this.transactionTypeID;
    }

    public final String getAccountTypeID() {
        return this.accountTypeID;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFunds_type() {
        return this.funds_type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMoney_in() {
        return this.money_in;
    }

    public final Statement copy(String accountRef, String accountType, String accountTypeID, String currency, String details, String endTime, String funds_type, String id, String money_in, String money_out, PrimaryParty primaryParty, String reasonType, String reasonTypeID, ReceiverParty receiverParty, String reversible, String runningBalance, String transID, String transactionFee, String transactionType, String transactionTypeID) {
        Intrinsics.checkNotNullParameter(accountRef, "");
        Intrinsics.checkNotNullParameter(accountType, "");
        Intrinsics.checkNotNullParameter(accountTypeID, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(details, "");
        Intrinsics.checkNotNullParameter(endTime, "");
        Intrinsics.checkNotNullParameter(funds_type, "");
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(money_in, "");
        Intrinsics.checkNotNullParameter(money_out, "");
        Intrinsics.checkNotNullParameter(primaryParty, "");
        Intrinsics.checkNotNullParameter(reasonType, "");
        Intrinsics.checkNotNullParameter(reasonTypeID, "");
        Intrinsics.checkNotNullParameter(receiverParty, "");
        Intrinsics.checkNotNullParameter(reversible, "");
        Intrinsics.checkNotNullParameter(runningBalance, "");
        Intrinsics.checkNotNullParameter(transID, "");
        Intrinsics.checkNotNullParameter(transactionFee, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(transactionTypeID, "");
        return new Statement(accountRef, accountType, accountTypeID, currency, details, endTime, funds_type, id, money_in, money_out, primaryParty, reasonType, reasonTypeID, receiverParty, reversible, runningBalance, transID, transactionFee, transactionType, transactionTypeID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Statement)) {
            return false;
        }
        Statement statement = (Statement) other;
        return Intrinsics.areEqual(this.accountRef, statement.accountRef) && Intrinsics.areEqual(this.accountType, statement.accountType) && Intrinsics.areEqual(this.accountTypeID, statement.accountTypeID) && Intrinsics.areEqual(this.currency, statement.currency) && Intrinsics.areEqual(this.details, statement.details) && Intrinsics.areEqual(this.endTime, statement.endTime) && Intrinsics.areEqual(this.funds_type, statement.funds_type) && Intrinsics.areEqual(this.id, statement.id) && Intrinsics.areEqual(this.money_in, statement.money_in) && Intrinsics.areEqual(this.money_out, statement.money_out) && Intrinsics.areEqual(this.primaryParty, statement.primaryParty) && Intrinsics.areEqual(this.reasonType, statement.reasonType) && Intrinsics.areEqual(this.reasonTypeID, statement.reasonTypeID) && Intrinsics.areEqual(this.receiverParty, statement.receiverParty) && Intrinsics.areEqual(this.reversible, statement.reversible) && Intrinsics.areEqual(this.runningBalance, statement.runningBalance) && Intrinsics.areEqual(this.transID, statement.transID) && Intrinsics.areEqual(this.transactionFee, statement.transactionFee) && Intrinsics.areEqual(this.transactionType, statement.transactionType) && Intrinsics.areEqual(this.transactionTypeID, statement.transactionTypeID);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.accountRef.hashCode() * 31) + this.accountType.hashCode()) * 31) + this.accountTypeID.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.details.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.funds_type.hashCode()) * 31) + this.id.hashCode()) * 31) + this.money_in.hashCode()) * 31) + this.money_out.hashCode()) * 31) + this.primaryParty.hashCode()) * 31) + this.reasonType.hashCode()) * 31) + this.reasonTypeID.hashCode()) * 31) + this.receiverParty.hashCode()) * 31) + this.reversible.hashCode()) * 31) + this.runningBalance.hashCode()) * 31) + this.transID.hashCode()) * 31) + this.transactionFee.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.transactionTypeID.hashCode();
    }

    public String toString() {
        return "Statement(accountRef=" + this.accountRef + ", accountType=" + this.accountType + ", accountTypeID=" + this.accountTypeID + ", currency=" + this.currency + ", details=" + this.details + ", endTime=" + this.endTime + ", funds_type=" + this.funds_type + ", id=" + this.id + ", money_in=" + this.money_in + ", money_out=" + this.money_out + ", primaryParty=" + this.primaryParty + ", reasonType=" + this.reasonType + ", reasonTypeID=" + this.reasonTypeID + ", receiverParty=" + this.receiverParty + ", reversible=" + this.reversible + ", runningBalance=" + this.runningBalance + ", transID=" + this.transID + ", transactionFee=" + this.transactionFee + ", transactionType=" + this.transactionType + ", transactionTypeID=" + this.transactionTypeID + ')';
    }
}
