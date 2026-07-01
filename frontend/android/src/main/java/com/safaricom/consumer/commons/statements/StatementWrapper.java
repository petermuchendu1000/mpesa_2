package com.safaricom.consumer.commons.statements;

import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/safaricom/consumer/commons/statements/StatementWrapper;", "Ljava/io/Serializable;", "cateGoryDate", "", "statement", "Lcom/safaricom/consumer/commons/statements/Statement;", "isFromNotification", "", "<init>", "(Ljava/lang/String;Lcom/safaricom/consumer/commons/statements/Statement;Z)V", "getCateGoryDate", "()Ljava/lang/String;", "getStatement", "()Lcom/safaricom/consumer/commons/statements/Statement;", "()Z", "getMaskNumber", "getNumber", "getName", "getFavoriteCategory", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementWrapper implements Serializable {
    private final String cateGoryDate;
    private final boolean isFromNotification;
    private final Statement statement;

    public StatementWrapper(String str, Statement statement, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(statement, "");
        this.cateGoryDate = str;
        this.statement = statement;
        this.isFromNotification = z;
    }

    public StatementWrapper(String str, Statement statement, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, statement, (i & 4) != 0 ? false : z);
    }

    public final String getCateGoryDate() {
        return this.cateGoryDate;
    }

    public final Statement getStatement() {
        return this.statement;
    }

    public final boolean isFromNotification() {
        return this.isFromNotification;
    }

    public final String getMaskNumber() {
        if (Float.parseFloat(this.statement.getMoney_out()) > 0.0f) {
            if (Intrinsics.areEqual(this.statement.getTransactionTypeID(), DisPlayItems.SEND_MONEY_TYPE_ID)) {
                return SfcPhoneNumberUtil.INSTANCE.formatPhoneNumberWithMask(this.statement.getReceiverParty().getId());
            }
            return this.statement.getReceiverParty().getId();
        }
        if (Intrinsics.areEqual(this.statement.getTransactionTypeID(), DisPlayItems.SEND_MONEY_TYPE_ID)) {
            return SfcPhoneNumberUtil.INSTANCE.formatPhoneNumberWithMask(this.statement.getPrimaryParty().getId());
        }
        return this.statement.getPrimaryParty().getId();
    }

    public final String getNumber() {
        if (Float.parseFloat(this.statement.getMoney_out()) > 0.0f) {
            return this.statement.getReceiverParty().getId();
        }
        return this.statement.getPrimaryParty().getId();
    }

    public final String getName() {
        if (Float.parseFloat(this.statement.getMoney_out()) > 0.0f) {
            return this.statement.getReceiverParty().getName();
        }
        return this.statement.getPrimaryParty().getName();
    }

    public final String getFavoriteCategory() {
        String transactionTypeID = this.statement.getTransactionTypeID();
        int iHashCode = transactionTypeID.hashCode();
        if (iHashCode != 47653691) {
            if (iHashCode != 47653713) {
                if (iHashCode == 47653744 && transactionTypeID.equals(DisPlayItems.SEND_MONEY_TYPE_ID)) {
                    return "P2PTransfer";
                }
            } else if (transactionTypeID.equals(DisPlayItems.BUY_GOODS_TYPE_ID)) {
                return "BuyGoods";
            }
        } else if (transactionTypeID.equals(DisPlayItems.PAY_BILL_TYPE_ID)) {
            return "PayBill";
        }
        return "";
    }

    public static StatementWrapper copy$default(StatementWrapper statementWrapper, String str, Statement statement, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statementWrapper.cateGoryDate;
        }
        if ((i & 2) != 0) {
            statement = statementWrapper.statement;
        }
        if ((i & 4) != 0) {
            z = statementWrapper.isFromNotification;
        }
        return statementWrapper.copy(str, statement, z);
    }

    public final String getCateGoryDate() {
        return this.cateGoryDate;
    }

    public final Statement getStatement() {
        return this.statement;
    }

    public final boolean getIsFromNotification() {
        return this.isFromNotification;
    }

    public final StatementWrapper copy(String cateGoryDate, Statement statement, boolean isFromNotification) {
        Intrinsics.checkNotNullParameter(cateGoryDate, "");
        Intrinsics.checkNotNullParameter(statement, "");
        return new StatementWrapper(cateGoryDate, statement, isFromNotification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementWrapper)) {
            return false;
        }
        StatementWrapper statementWrapper = (StatementWrapper) other;
        return Intrinsics.areEqual(this.cateGoryDate, statementWrapper.cateGoryDate) && Intrinsics.areEqual(this.statement, statementWrapper.statement) && this.isFromNotification == statementWrapper.isFromNotification;
    }

    public int hashCode() {
        return (((this.cateGoryDate.hashCode() * 31) + this.statement.hashCode()) * 31) + Boolean.hashCode(this.isFromNotification);
    }

    public String toString() {
        return "StatementWrapper(cateGoryDate=" + this.cateGoryDate + ", statement=" + this.statement + ", isFromNotification=" + this.isFromNotification + ')';
    }
}
