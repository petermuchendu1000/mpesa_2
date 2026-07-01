package com.safaricom.consumer.commons.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.rpc.constant.BodyFields;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bª\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 »\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002»\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010²\u0001\u001a\u00030³\u0001H\u0016J\n\u0010´\u0001\u001a\u00030³\u0001H\u0016J\u0007\u0010µ\u0001\u001a\u00020\u0004J\u001b\u0010¶\u0001\u001a\u00030·\u00012\b\u0010¸\u0001\u001a\u00030¹\u00012\u0007\u0010º\u0001\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010®\u0001\u001a\u00030¯\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/safaricom/consumer/commons/transaction/TransactionType;", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "", BodyFields.OPERATION_TYPE, "", "<init>", "(Ljava/lang/String;II)V", "getOperationType", "()I", "BUY_GOODS", "PAY_TO_MOBILE", "PAY_TO_MANY", "WITHDRAW_TO_OWNER", "WITHDRAW_TO_BANK", "WITHDRAW_AT_AGENT", "SEND_MONEY", "SEND_TIP", "SEND_MONEY_TO_MANY", "PAY_BILL", "WITHDRAW_AT_ATM", "POCHI_LA_BIASHARA", "SELL_AIRTIME", "UNDEFINED", "BUY_AIRTIME", "SEND_MONEY_TO_OTHER_NETWORKS", "WITHDRAW", "REVERSAL", "ROAMING_CASH_OUT", "M_SHWARI_DEPOSIT", "KCB_M_PESA_DEPOSIT", "M_SHWARI_LOAN_PAYMENT", "KCB_M_PESA_LOAN_PAYMENT", "WITHDRAW_FROM_M_SHWARI", "WITHDRAW_FROM_KCB_M_PESA", "BUSINESS_TO_CUSTOMER", "ROLL_UP_FUNDS", "PAYPAL_TOP_UP", "CREATE_OPERATOR", "REMOVE_OPERATOR", "CHANGE_OPERATOR_STATUS", "SEND_MONEY_TO_MOBILE", "KYC", "RESET_OPERATOR_PIN", "BUSINESS_BUY_GOODS", "BUSINESS_BUY_GOODS_REVERSAL", "BUY_GOODS_REVERSAL", "BUSINESS_PAY_BILL", "BUSINESS_PAY_BILL_REVERSAL", "SELL_AIRTIME_REVERSAL", "WITHDRAW_TO_OWNER_REVERSAL", "WITHDRAW_AT_AGENT_REVERSAL", "RECEIVE_PAYMENTS_C2B", "ROLL_UP_ALL_STORES", "ROLL_UP_ONE_STORE", "MINI_APP_PAY_BILL", "MINI_APP_BUY_GOODS", "SEND_TO_BANK", "REQUEST_MONEY", "SEND_MONEY_TO_WESTERN_UNION", "SELL_AIRTIME_COMMISSION", "REQUEST_TERM_LOAN", "PAY_TERM_LOAN", "WITHDRAW_TO_OTHER_BANK", "CREATE_PAYMENT_LINK", "REQUEST_EXPORT_STATEMENTS", "SIM_REPLACEMENT", "RECEIVED_BUSINESS_PAYMENT", "BUY_GOODS_OD", "INTERNAL_TRANSFERS", "LOAN_DISBURSEMENT", "LOAN_REPAYMENT", "OVERDRAFT_DISBURSEMENT", "OVERDRAFT_REPAYMENT", "PAY_BILL_OD", "PAY_TO_MOBILE_NUMBER", "PAY_TO_MOBILE_NUMBER_OD", "RECEIVED_CUSTOMER_PAYMENT", "RECEIVED_PAYMENT", "STORE_ROLL_UP", "WITHDRAW_TO_BANK_EFT", "WITHDRAW_TO_BANK_RTS", "WITHDRAW_TO_OWNER_OD", "CUSTOMER_WITHDRAWAL", "RECEIVED_BUSINESS_DEPOSIT", "BUSINESS_DEPOSIT", "RECEIVED_BUSINESS_WITHDRAWAL", "BUSINESS_WITHDRAWAL", "MOVE_MONEY_FROM_WORKING_ACCOUNT", "MOVE_MONEY_TO_WORKING_ACCOUNT", "MOVE_MONEY_FROM_FLOAT_ACCOUNT", "MOVE_MONEY_TO_FLOAT_ACCOUNT", "FLOAT_REDISTRIBUTION", "CUSTOMER_DEPOSIT", "GIVE_CASH", "MERCHANT_WITHDRAW_AT_AGENT", "BANK_DEPOSIT_REVERSAL", "POCHI_DEPOSIT_REVERSAL", "BUSINESS_TO_BUSINESS_REVERSAL", "WITHDRAW_TO_BANK_REVERSAL", "BANK_DEPOSIT", "TUNUKIWA_REVERSAL", "CUSTOMER_DEPOSIT_REVERSAL", "COMMISSION_ROLL_UP", "STAWISHA_REDEMPTION", "COMMISSION_RECEIVED", "COMMISSION_PAID", "COMMISSION_CLAWBACK_REVERSAL", "FLOAT_ADVANCE", "BUSINESS_TO_BUSINESS", "FLOAT_FINANCING", "BUSINESS_DEPOSIT_REVERSAL", "POCHI_WITHDRAWAL", "POCHI_DEPOSIT", "POCHI_WITHDRAWAL_REVERSAL", "COMMISSION_REVERSAL", "CUSTOMER_WITHDRAWAL_REVERSAL", "FLOAT_FINANCING_REPAYMENT", "TUNUKIWA", "M_SHWARI_LOAN", "KCB_M_PESA_LOAN", "GLOBAL_SEND_TO_MOBILE", "GLOBAL_SEND_TO_BANK", "RECEIVED_POCHI_PAYMENT", "POCHI_LA_BIASHARA_WITHDRAW_TO_PERSONAL_ACCOUNT", "MOVE_MONEY_BETWEEN_ACCOUNTS", "FLOAT_ADMINISTRATION", "POCHI_LA_BIASHARA_BUY_GOODS", "REGISTER_CUSTOMER", "PAY_WITH_MPESA", "FULIZA_REPAYMENT", "BUSINESS_PAY_TO_MOBILE_NUMBER", "SELL_AIRTIME_TO_CUSTOMER", "CUSTOMER_PAYMENT_TO_POCHI", "CUSTOMER_PAYMENT_TO_POCHI_WITH_OD", "MICRO_SME_WITHDRAWAL_AT_AGENT_TILL", "WITHDRAWAL_OF_FUNDS_FROM_MPESA_TO_POCHI", "WITHDRAWAL_OF_FUNDS_FROM_POCHI_TO_MPESA", "TRANSFER_OF_FUNDS_FROM_POCHI_TO_MPESA", "MICRO_SME_DEPOSIT_AT_AGENT_TILL", "PAYMENT_TO_POCHI_MERCHANT", "BUY_AIRTIME_FOR_SELF", "AGENT_DEPOSIT", "OTHER", "CREATE_PAYMENT_REQUEST", "CASH_UP_REPORT", "TRANSFER_FROM_BANK", "POCHI_LA_BIASHARA_WITHDRAW_TO_BUSINESS_ACCOUNT", "POCHI_LA_BIASHARA_PAY_BILL", "POCHI_LA_BIASHARA_WITHDRAW_AT_AGENT", "POCHI_LA_BIASHARA_PAY_TO_OTHER_MOBILE_NUMBER", "WITHDRAW_TO_BANK_FROM_ALL_STORES", "PAY_FUEL", "SELL_FUEL", "ADD_CAR", "EDIT_CAR", "SPLIT_BILL", "UTILITY_PAYMENT", "CANAL_PLUS", "DSTV", "ETHIOPIAN_AIRLINES", "ETHIOPIAN_ELECTRICITY_UTILITIES", "BUY_BUNDLES", "SELL_FUEL_BY_CODE", "MOVE_MONEY_FLOAT_TO_WORKING", "MOVE_MONEY_FLOAT_TO_MERCHANT", "MOVE_MONEY_WORKING_TO_FLOAT", "MOVE_MONEY_WORKING_TO_MERCHANT", "MOVE_MONEY_MERCHANT_TO_WORKING", "MOVE_MONEY_MERCHANT_TO_FLOAT", "SEND_MONEY_OD", "PAY_WITH_MPESA_OD", "BUY_AIRTIME_OD", "BUY_BUNDLES_OD", "EXPRESS_CHECKOUT", "operationName", "", "getOperationName", "()Ljava/lang/String;", "usesMsisdn", "", "hasSecondaryNumber", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionType implements ITransactionType {
    private static final EnumEntries $ENTRIES;
    private static final TransactionType[] $VALUES;
    public static final Parcelable.Creator<TransactionType> CREATOR;
    private static final List<TransactionType> HAS_SECONDARY_NUMBER_TYPES;
    private static final List<TransactionType> USE_MSISDN_TYPES;
    private final int operationType;
    public static final TransactionType BUY_GOODS = new TransactionType("BUY_GOODS", 0, 0);
    public static final TransactionType PAY_TO_MOBILE = new TransactionType("PAY_TO_MOBILE", 1, 1);
    public static final TransactionType PAY_TO_MANY = new TransactionType("PAY_TO_MANY", 2, 2);
    public static final TransactionType WITHDRAW_TO_OWNER = new TransactionType("WITHDRAW_TO_OWNER", 3, 3);
    public static final TransactionType WITHDRAW_TO_BANK = new TransactionType("WITHDRAW_TO_BANK", 4, 4);
    public static final TransactionType WITHDRAW_AT_AGENT = new TransactionType("WITHDRAW_AT_AGENT", 5, 5);
    public static final TransactionType SEND_MONEY = new TransactionType("SEND_MONEY", 6, 6);
    public static final TransactionType SEND_TIP = new TransactionType("SEND_TIP", 7, 7);
    public static final TransactionType SEND_MONEY_TO_MANY = new TransactionType("SEND_MONEY_TO_MANY", 8, 8);
    public static final TransactionType PAY_BILL = new TransactionType("PAY_BILL", 9, 9);
    public static final TransactionType WITHDRAW_AT_ATM = new TransactionType("WITHDRAW_AT_ATM", 10, 10);
    public static final TransactionType POCHI_LA_BIASHARA = new TransactionType("POCHI_LA_BIASHARA", 11, 11);
    public static final TransactionType SELL_AIRTIME = new TransactionType("SELL_AIRTIME", 12, 12);
    public static final TransactionType UNDEFINED = new TransactionType("UNDEFINED", 13, 13);
    public static final TransactionType BUY_AIRTIME = new TransactionType("BUY_AIRTIME", 14, 14);
    public static final TransactionType SEND_MONEY_TO_OTHER_NETWORKS = new TransactionType("SEND_MONEY_TO_OTHER_NETWORKS", 15, 15);
    public static final TransactionType WITHDRAW = new TransactionType("WITHDRAW", 16, 16);
    public static final TransactionType REVERSAL = new TransactionType("REVERSAL", 17, 17);
    public static final TransactionType ROAMING_CASH_OUT = new TransactionType("ROAMING_CASH_OUT", 18, 18);
    public static final TransactionType M_SHWARI_DEPOSIT = new TransactionType("M_SHWARI_DEPOSIT", 19, 19);
    public static final TransactionType KCB_M_PESA_DEPOSIT = new TransactionType("KCB_M_PESA_DEPOSIT", 20, 20);
    public static final TransactionType M_SHWARI_LOAN_PAYMENT = new TransactionType("M_SHWARI_LOAN_PAYMENT", 21, 21);
    public static final TransactionType KCB_M_PESA_LOAN_PAYMENT = new TransactionType("KCB_M_PESA_LOAN_PAYMENT", 22, 22);
    public static final TransactionType WITHDRAW_FROM_M_SHWARI = new TransactionType("WITHDRAW_FROM_M_SHWARI", 23, 23);
    public static final TransactionType WITHDRAW_FROM_KCB_M_PESA = new TransactionType("WITHDRAW_FROM_KCB_M_PESA", 24, 24);
    public static final TransactionType BUSINESS_TO_CUSTOMER = new TransactionType("BUSINESS_TO_CUSTOMER", 25, 25);
    public static final TransactionType ROLL_UP_FUNDS = new TransactionType("ROLL_UP_FUNDS", 26, 26);
    public static final TransactionType PAYPAL_TOP_UP = new TransactionType("PAYPAL_TOP_UP", 27, 27);
    public static final TransactionType CREATE_OPERATOR = new TransactionType("CREATE_OPERATOR", 28, 28);
    public static final TransactionType REMOVE_OPERATOR = new TransactionType("REMOVE_OPERATOR", 29, 29);
    public static final TransactionType CHANGE_OPERATOR_STATUS = new TransactionType("CHANGE_OPERATOR_STATUS", 30, 30);
    public static final TransactionType SEND_MONEY_TO_MOBILE = new TransactionType("SEND_MONEY_TO_MOBILE", 31, 31);
    public static final TransactionType KYC = new TransactionType("KYC", 32, 32);
    public static final TransactionType RESET_OPERATOR_PIN = new TransactionType("RESET_OPERATOR_PIN", 33, 33);
    public static final TransactionType BUSINESS_BUY_GOODS = new TransactionType("BUSINESS_BUY_GOODS", 34, 34);
    public static final TransactionType BUSINESS_BUY_GOODS_REVERSAL = new TransactionType("BUSINESS_BUY_GOODS_REVERSAL", 35, 35);
    public static final TransactionType BUY_GOODS_REVERSAL = new TransactionType("BUY_GOODS_REVERSAL", 36, 36);
    public static final TransactionType BUSINESS_PAY_BILL = new TransactionType("BUSINESS_PAY_BILL", 37, 37);
    public static final TransactionType BUSINESS_PAY_BILL_REVERSAL = new TransactionType("BUSINESS_PAY_BILL_REVERSAL", 38, 38);
    public static final TransactionType SELL_AIRTIME_REVERSAL = new TransactionType("SELL_AIRTIME_REVERSAL", 39, 39);
    public static final TransactionType WITHDRAW_TO_OWNER_REVERSAL = new TransactionType("WITHDRAW_TO_OWNER_REVERSAL", 40, 40);
    public static final TransactionType WITHDRAW_AT_AGENT_REVERSAL = new TransactionType("WITHDRAW_AT_AGENT_REVERSAL", 41, 41);
    public static final TransactionType RECEIVE_PAYMENTS_C2B = new TransactionType("RECEIVE_PAYMENTS_C2B", 42, 42);
    public static final TransactionType ROLL_UP_ALL_STORES = new TransactionType("ROLL_UP_ALL_STORES", 43, 43);
    public static final TransactionType ROLL_UP_ONE_STORE = new TransactionType("ROLL_UP_ONE_STORE", 44, 44);
    public static final TransactionType MINI_APP_PAY_BILL = new TransactionType("MINI_APP_PAY_BILL", 45, 45);
    public static final TransactionType MINI_APP_BUY_GOODS = new TransactionType("MINI_APP_BUY_GOODS", 46, 46);
    public static final TransactionType SEND_TO_BANK = new TransactionType("SEND_TO_BANK", 47, 47);
    public static final TransactionType REQUEST_MONEY = new TransactionType("REQUEST_MONEY", 48, 48);
    public static final TransactionType SEND_MONEY_TO_WESTERN_UNION = new TransactionType("SEND_MONEY_TO_WESTERN_UNION", 49, 49);
    public static final TransactionType SELL_AIRTIME_COMMISSION = new TransactionType("SELL_AIRTIME_COMMISSION", 50, 50);
    public static final TransactionType REQUEST_TERM_LOAN = new TransactionType("REQUEST_TERM_LOAN", 51, 51);
    public static final TransactionType PAY_TERM_LOAN = new TransactionType("PAY_TERM_LOAN", 52, 52);
    public static final TransactionType WITHDRAW_TO_OTHER_BANK = new TransactionType("WITHDRAW_TO_OTHER_BANK", 53, 53);
    public static final TransactionType CREATE_PAYMENT_LINK = new TransactionType("CREATE_PAYMENT_LINK", 54, 54);
    public static final TransactionType REQUEST_EXPORT_STATEMENTS = new TransactionType("REQUEST_EXPORT_STATEMENTS", 55, 55);
    public static final TransactionType SIM_REPLACEMENT = new TransactionType("SIM_REPLACEMENT", 56, 56);
    public static final TransactionType RECEIVED_BUSINESS_PAYMENT = new TransactionType("RECEIVED_BUSINESS_PAYMENT", 57, 57);
    public static final TransactionType BUY_GOODS_OD = new TransactionType("BUY_GOODS_OD", 58, 58);
    public static final TransactionType INTERNAL_TRANSFERS = new TransactionType("INTERNAL_TRANSFERS", 59, 59);
    public static final TransactionType LOAN_DISBURSEMENT = new TransactionType("LOAN_DISBURSEMENT", 60, 60);
    public static final TransactionType LOAN_REPAYMENT = new TransactionType("LOAN_REPAYMENT", 61, 61);
    public static final TransactionType OVERDRAFT_DISBURSEMENT = new TransactionType("OVERDRAFT_DISBURSEMENT", 62, 62);
    public static final TransactionType OVERDRAFT_REPAYMENT = new TransactionType("OVERDRAFT_REPAYMENT", 63, 63);
    public static final TransactionType PAY_BILL_OD = new TransactionType("PAY_BILL_OD", 64, 64);
    public static final TransactionType PAY_TO_MOBILE_NUMBER = new TransactionType("PAY_TO_MOBILE_NUMBER", 65, 65);
    public static final TransactionType PAY_TO_MOBILE_NUMBER_OD = new TransactionType("PAY_TO_MOBILE_NUMBER_OD", 66, 66);
    public static final TransactionType RECEIVED_CUSTOMER_PAYMENT = new TransactionType("RECEIVED_CUSTOMER_PAYMENT", 67, 67);
    public static final TransactionType RECEIVED_PAYMENT = new TransactionType("RECEIVED_PAYMENT", 68, 68);
    public static final TransactionType STORE_ROLL_UP = new TransactionType("STORE_ROLL_UP", 69, 69);
    public static final TransactionType WITHDRAW_TO_BANK_EFT = new TransactionType("WITHDRAW_TO_BANK_EFT", 70, 70);
    public static final TransactionType WITHDRAW_TO_BANK_RTS = new TransactionType("WITHDRAW_TO_BANK_RTS", 71, 71);
    public static final TransactionType WITHDRAW_TO_OWNER_OD = new TransactionType("WITHDRAW_TO_OWNER_OD", 72, 72);
    public static final TransactionType CUSTOMER_WITHDRAWAL = new TransactionType("CUSTOMER_WITHDRAWAL", 73, 73);
    public static final TransactionType RECEIVED_BUSINESS_DEPOSIT = new TransactionType("RECEIVED_BUSINESS_DEPOSIT", 74, 74);
    public static final TransactionType BUSINESS_DEPOSIT = new TransactionType("BUSINESS_DEPOSIT", 75, 75);
    public static final TransactionType RECEIVED_BUSINESS_WITHDRAWAL = new TransactionType("RECEIVED_BUSINESS_WITHDRAWAL", 76, 76);
    public static final TransactionType BUSINESS_WITHDRAWAL = new TransactionType("BUSINESS_WITHDRAWAL", 77, 77);
    public static final TransactionType MOVE_MONEY_FROM_WORKING_ACCOUNT = new TransactionType("MOVE_MONEY_FROM_WORKING_ACCOUNT", 78, 78);
    public static final TransactionType MOVE_MONEY_TO_WORKING_ACCOUNT = new TransactionType("MOVE_MONEY_TO_WORKING_ACCOUNT", 79, 79);
    public static final TransactionType MOVE_MONEY_FROM_FLOAT_ACCOUNT = new TransactionType("MOVE_MONEY_FROM_FLOAT_ACCOUNT", 80, 80);
    public static final TransactionType MOVE_MONEY_TO_FLOAT_ACCOUNT = new TransactionType("MOVE_MONEY_TO_FLOAT_ACCOUNT", 81, 81);
    public static final TransactionType FLOAT_REDISTRIBUTION = new TransactionType("FLOAT_REDISTRIBUTION", 82, 82);
    public static final TransactionType CUSTOMER_DEPOSIT = new TransactionType("CUSTOMER_DEPOSIT", 83, 83);
    public static final TransactionType GIVE_CASH = new TransactionType("GIVE_CASH", 84, 84);
    public static final TransactionType MERCHANT_WITHDRAW_AT_AGENT = new TransactionType("MERCHANT_WITHDRAW_AT_AGENT", 85, 85);
    public static final TransactionType BANK_DEPOSIT_REVERSAL = new TransactionType("BANK_DEPOSIT_REVERSAL", 86, 86);
    public static final TransactionType POCHI_DEPOSIT_REVERSAL = new TransactionType("POCHI_DEPOSIT_REVERSAL", 87, 87);
    public static final TransactionType BUSINESS_TO_BUSINESS_REVERSAL = new TransactionType("BUSINESS_TO_BUSINESS_REVERSAL", 88, 88);
    public static final TransactionType WITHDRAW_TO_BANK_REVERSAL = new TransactionType("WITHDRAW_TO_BANK_REVERSAL", 89, 89);
    public static final TransactionType BANK_DEPOSIT = new TransactionType("BANK_DEPOSIT", 90, 90);
    public static final TransactionType TUNUKIWA_REVERSAL = new TransactionType("TUNUKIWA_REVERSAL", 91, 91);
    public static final TransactionType CUSTOMER_DEPOSIT_REVERSAL = new TransactionType("CUSTOMER_DEPOSIT_REVERSAL", 92, 92);
    public static final TransactionType COMMISSION_ROLL_UP = new TransactionType("COMMISSION_ROLL_UP", 93, 93);
    public static final TransactionType STAWISHA_REDEMPTION = new TransactionType("STAWISHA_REDEMPTION", 94, 94);
    public static final TransactionType COMMISSION_RECEIVED = new TransactionType("COMMISSION_RECEIVED", 95, 95);
    public static final TransactionType COMMISSION_PAID = new TransactionType("COMMISSION_PAID", 96, 96);
    public static final TransactionType COMMISSION_CLAWBACK_REVERSAL = new TransactionType("COMMISSION_CLAWBACK_REVERSAL", 97, 97);
    public static final TransactionType FLOAT_ADVANCE = new TransactionType("FLOAT_ADVANCE", 98, 98);
    public static final TransactionType BUSINESS_TO_BUSINESS = new TransactionType("BUSINESS_TO_BUSINESS", 99, 99);
    public static final TransactionType FLOAT_FINANCING = new TransactionType("FLOAT_FINANCING", 100, 100);
    public static final TransactionType BUSINESS_DEPOSIT_REVERSAL = new TransactionType("BUSINESS_DEPOSIT_REVERSAL", 101, 101);
    public static final TransactionType POCHI_WITHDRAWAL = new TransactionType("POCHI_WITHDRAWAL", 102, 102);
    public static final TransactionType POCHI_DEPOSIT = new TransactionType("POCHI_DEPOSIT", 103, 103);
    public static final TransactionType POCHI_WITHDRAWAL_REVERSAL = new TransactionType("POCHI_WITHDRAWAL_REVERSAL", 104, 104);
    public static final TransactionType COMMISSION_REVERSAL = new TransactionType("COMMISSION_REVERSAL", 105, 105);
    public static final TransactionType CUSTOMER_WITHDRAWAL_REVERSAL = new TransactionType("CUSTOMER_WITHDRAWAL_REVERSAL", 106, 106);
    public static final TransactionType FLOAT_FINANCING_REPAYMENT = new TransactionType("FLOAT_FINANCING_REPAYMENT", 107, 107);
    public static final TransactionType TUNUKIWA = new TransactionType("TUNUKIWA", 108, 108);
    public static final TransactionType M_SHWARI_LOAN = new TransactionType("M_SHWARI_LOAN", 109, 109);
    public static final TransactionType KCB_M_PESA_LOAN = new TransactionType("KCB_M_PESA_LOAN", 110, 110);
    public static final TransactionType GLOBAL_SEND_TO_MOBILE = new TransactionType("GLOBAL_SEND_TO_MOBILE", 111, 111);
    public static final TransactionType GLOBAL_SEND_TO_BANK = new TransactionType("GLOBAL_SEND_TO_BANK", 112, 114);
    public static final TransactionType RECEIVED_POCHI_PAYMENT = new TransactionType("RECEIVED_POCHI_PAYMENT", 113, 115);
    public static final TransactionType POCHI_LA_BIASHARA_WITHDRAW_TO_PERSONAL_ACCOUNT = new TransactionType("POCHI_LA_BIASHARA_WITHDRAW_TO_PERSONAL_ACCOUNT", 114, 116);
    public static final TransactionType MOVE_MONEY_BETWEEN_ACCOUNTS = new TransactionType("MOVE_MONEY_BETWEEN_ACCOUNTS", 115, 117);
    public static final TransactionType FLOAT_ADMINISTRATION = new TransactionType("FLOAT_ADMINISTRATION", 116, 118);
    public static final TransactionType POCHI_LA_BIASHARA_BUY_GOODS = new TransactionType("POCHI_LA_BIASHARA_BUY_GOODS", 117, 119);
    public static final TransactionType REGISTER_CUSTOMER = new TransactionType("REGISTER_CUSTOMER", 118, 120);
    public static final TransactionType PAY_WITH_MPESA = new TransactionType("PAY_WITH_MPESA", 119, 121);
    public static final TransactionType FULIZA_REPAYMENT = new TransactionType("FULIZA_REPAYMENT", 120, 122);
    public static final TransactionType BUSINESS_PAY_TO_MOBILE_NUMBER = new TransactionType("BUSINESS_PAY_TO_MOBILE_NUMBER", 121, 123);
    public static final TransactionType SELL_AIRTIME_TO_CUSTOMER = new TransactionType("SELL_AIRTIME_TO_CUSTOMER", 122, 124);
    public static final TransactionType CUSTOMER_PAYMENT_TO_POCHI = new TransactionType("CUSTOMER_PAYMENT_TO_POCHI", 123, 125);
    public static final TransactionType CUSTOMER_PAYMENT_TO_POCHI_WITH_OD = new TransactionType("CUSTOMER_PAYMENT_TO_POCHI_WITH_OD", 124, 126);
    public static final TransactionType MICRO_SME_WITHDRAWAL_AT_AGENT_TILL = new TransactionType("MICRO_SME_WITHDRAWAL_AT_AGENT_TILL", 125, 127);
    public static final TransactionType WITHDRAWAL_OF_FUNDS_FROM_MPESA_TO_POCHI = new TransactionType("WITHDRAWAL_OF_FUNDS_FROM_MPESA_TO_POCHI", 126, 128);
    public static final TransactionType WITHDRAWAL_OF_FUNDS_FROM_POCHI_TO_MPESA = new TransactionType("WITHDRAWAL_OF_FUNDS_FROM_POCHI_TO_MPESA", 127, 129);
    public static final TransactionType TRANSFER_OF_FUNDS_FROM_POCHI_TO_MPESA = new TransactionType("TRANSFER_OF_FUNDS_FROM_POCHI_TO_MPESA", 128, 130);
    public static final TransactionType MICRO_SME_DEPOSIT_AT_AGENT_TILL = new TransactionType("MICRO_SME_DEPOSIT_AT_AGENT_TILL", 129, 131);
    public static final TransactionType PAYMENT_TO_POCHI_MERCHANT = new TransactionType("PAYMENT_TO_POCHI_MERCHANT", 130, 132);
    public static final TransactionType BUY_AIRTIME_FOR_SELF = new TransactionType("BUY_AIRTIME_FOR_SELF", 131, 133);
    public static final TransactionType AGENT_DEPOSIT = new TransactionType("AGENT_DEPOSIT", 132, 134);
    public static final TransactionType OTHER = new TransactionType("OTHER", 133, 135);
    public static final TransactionType CREATE_PAYMENT_REQUEST = new TransactionType("CREATE_PAYMENT_REQUEST", 134, 136);
    public static final TransactionType CASH_UP_REPORT = new TransactionType("CASH_UP_REPORT", 135, 137);
    public static final TransactionType TRANSFER_FROM_BANK = new TransactionType("TRANSFER_FROM_BANK", 136, 138);
    public static final TransactionType POCHI_LA_BIASHARA_WITHDRAW_TO_BUSINESS_ACCOUNT = new TransactionType("POCHI_LA_BIASHARA_WITHDRAW_TO_BUSINESS_ACCOUNT", 137, 139);
    public static final TransactionType POCHI_LA_BIASHARA_PAY_BILL = new TransactionType("POCHI_LA_BIASHARA_PAY_BILL", 138, 140);
    public static final TransactionType POCHI_LA_BIASHARA_WITHDRAW_AT_AGENT = new TransactionType("POCHI_LA_BIASHARA_WITHDRAW_AT_AGENT", 139, 141);
    public static final TransactionType POCHI_LA_BIASHARA_PAY_TO_OTHER_MOBILE_NUMBER = new TransactionType("POCHI_LA_BIASHARA_PAY_TO_OTHER_MOBILE_NUMBER", 140, 142);
    public static final TransactionType WITHDRAW_TO_BANK_FROM_ALL_STORES = new TransactionType("WITHDRAW_TO_BANK_FROM_ALL_STORES", 141, 143);
    public static final TransactionType PAY_FUEL = new TransactionType("PAY_FUEL", 142, 144);
    public static final TransactionType SELL_FUEL = new TransactionType("SELL_FUEL", 143, 145);
    public static final TransactionType ADD_CAR = new TransactionType("ADD_CAR", 144, 146);
    public static final TransactionType EDIT_CAR = new TransactionType("EDIT_CAR", 145, 147);
    public static final TransactionType SPLIT_BILL = new TransactionType("SPLIT_BILL", 146, 148);
    public static final TransactionType UTILITY_PAYMENT = new TransactionType("UTILITY_PAYMENT", 147, 149);
    public static final TransactionType CANAL_PLUS = new TransactionType("CANAL_PLUS", 148, 150);
    public static final TransactionType DSTV = new TransactionType("DSTV", 149, 151);
    public static final TransactionType ETHIOPIAN_AIRLINES = new TransactionType("ETHIOPIAN_AIRLINES", 150, 152);
    public static final TransactionType ETHIOPIAN_ELECTRICITY_UTILITIES = new TransactionType("ETHIOPIAN_ELECTRICITY_UTILITIES", 151, 153);
    public static final TransactionType BUY_BUNDLES = new TransactionType("BUY_BUNDLES", 152, 154);
    public static final TransactionType SELL_FUEL_BY_CODE = new TransactionType("SELL_FUEL_BY_CODE", 153, 155);
    public static final TransactionType MOVE_MONEY_FLOAT_TO_WORKING = new TransactionType("MOVE_MONEY_FLOAT_TO_WORKING", 154, 156);
    public static final TransactionType MOVE_MONEY_FLOAT_TO_MERCHANT = new TransactionType("MOVE_MONEY_FLOAT_TO_MERCHANT", 155, 157);
    public static final TransactionType MOVE_MONEY_WORKING_TO_FLOAT = new TransactionType("MOVE_MONEY_WORKING_TO_FLOAT", 156, 158);
    public static final TransactionType MOVE_MONEY_WORKING_TO_MERCHANT = new TransactionType("MOVE_MONEY_WORKING_TO_MERCHANT", 157, 159);
    public static final TransactionType MOVE_MONEY_MERCHANT_TO_WORKING = new TransactionType("MOVE_MONEY_MERCHANT_TO_WORKING", 158, 160);
    public static final TransactionType MOVE_MONEY_MERCHANT_TO_FLOAT = new TransactionType("MOVE_MONEY_MERCHANT_TO_FLOAT", 159, 161);
    public static final TransactionType SEND_MONEY_OD = new TransactionType("SEND_MONEY_OD", 160, 162);
    public static final TransactionType PAY_WITH_MPESA_OD = new TransactionType("PAY_WITH_MPESA_OD", 161, 163);
    public static final TransactionType BUY_AIRTIME_OD = new TransactionType("BUY_AIRTIME_OD", 162, 164);
    public static final TransactionType BUY_BUNDLES_OD = new TransactionType("BUY_BUNDLES_OD", 163, 165);
    public static final TransactionType EXPRESS_CHECKOUT = new TransactionType("EXPRESS_CHECKOUT", 164, 166);

    @Override
    public final int describeContents() {
        return 0;
    }

    private TransactionType(String str, int i, int i2) {
        this.operationType = i2;
    }

    @Override
    public int getOperationType() {
        return this.operationType;
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transactionTypeArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<TransactionType>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TransactionType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final TransactionType[] newArray(int i) {
                return new TransactionType[i];
            }
        };
        USE_MSISDN_TYPES = CollectionsKt.emptyList();
        HAS_SECONDARY_NUMBER_TYPES = CollectionsKt.emptyList();
    }

    @Override
    public String getOperationName() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @Override
    public boolean usesMsisdn() {
        return USE_MSISDN_TYPES.contains(this);
    }

    @Override
    public boolean hasSecondaryNumber() {
        return HAS_SECONDARY_NUMBER_TYPES.contains(this);
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }

    private static final TransactionType[] $values() {
        return new TransactionType[]{BUY_GOODS, PAY_TO_MOBILE, PAY_TO_MANY, WITHDRAW_TO_OWNER, WITHDRAW_TO_BANK, WITHDRAW_AT_AGENT, SEND_MONEY, SEND_TIP, SEND_MONEY_TO_MANY, PAY_BILL, WITHDRAW_AT_ATM, POCHI_LA_BIASHARA, SELL_AIRTIME, UNDEFINED, BUY_AIRTIME, SEND_MONEY_TO_OTHER_NETWORKS, WITHDRAW, REVERSAL, ROAMING_CASH_OUT, M_SHWARI_DEPOSIT, KCB_M_PESA_DEPOSIT, M_SHWARI_LOAN_PAYMENT, KCB_M_PESA_LOAN_PAYMENT, WITHDRAW_FROM_M_SHWARI, WITHDRAW_FROM_KCB_M_PESA, BUSINESS_TO_CUSTOMER, ROLL_UP_FUNDS, PAYPAL_TOP_UP, CREATE_OPERATOR, REMOVE_OPERATOR, CHANGE_OPERATOR_STATUS, SEND_MONEY_TO_MOBILE, KYC, RESET_OPERATOR_PIN, BUSINESS_BUY_GOODS, BUSINESS_BUY_GOODS_REVERSAL, BUY_GOODS_REVERSAL, BUSINESS_PAY_BILL, BUSINESS_PAY_BILL_REVERSAL, SELL_AIRTIME_REVERSAL, WITHDRAW_TO_OWNER_REVERSAL, WITHDRAW_AT_AGENT_REVERSAL, RECEIVE_PAYMENTS_C2B, ROLL_UP_ALL_STORES, ROLL_UP_ONE_STORE, MINI_APP_PAY_BILL, MINI_APP_BUY_GOODS, SEND_TO_BANK, REQUEST_MONEY, SEND_MONEY_TO_WESTERN_UNION, SELL_AIRTIME_COMMISSION, REQUEST_TERM_LOAN, PAY_TERM_LOAN, WITHDRAW_TO_OTHER_BANK, CREATE_PAYMENT_LINK, REQUEST_EXPORT_STATEMENTS, SIM_REPLACEMENT, RECEIVED_BUSINESS_PAYMENT, BUY_GOODS_OD, INTERNAL_TRANSFERS, LOAN_DISBURSEMENT, LOAN_REPAYMENT, OVERDRAFT_DISBURSEMENT, OVERDRAFT_REPAYMENT, PAY_BILL_OD, PAY_TO_MOBILE_NUMBER, PAY_TO_MOBILE_NUMBER_OD, RECEIVED_CUSTOMER_PAYMENT, RECEIVED_PAYMENT, STORE_ROLL_UP, WITHDRAW_TO_BANK_EFT, WITHDRAW_TO_BANK_RTS, WITHDRAW_TO_OWNER_OD, CUSTOMER_WITHDRAWAL, RECEIVED_BUSINESS_DEPOSIT, BUSINESS_DEPOSIT, RECEIVED_BUSINESS_WITHDRAWAL, BUSINESS_WITHDRAWAL, MOVE_MONEY_FROM_WORKING_ACCOUNT, MOVE_MONEY_TO_WORKING_ACCOUNT, MOVE_MONEY_FROM_FLOAT_ACCOUNT, MOVE_MONEY_TO_FLOAT_ACCOUNT, FLOAT_REDISTRIBUTION, CUSTOMER_DEPOSIT, GIVE_CASH, MERCHANT_WITHDRAW_AT_AGENT, BANK_DEPOSIT_REVERSAL, POCHI_DEPOSIT_REVERSAL, BUSINESS_TO_BUSINESS_REVERSAL, WITHDRAW_TO_BANK_REVERSAL, BANK_DEPOSIT, TUNUKIWA_REVERSAL, CUSTOMER_DEPOSIT_REVERSAL, COMMISSION_ROLL_UP, STAWISHA_REDEMPTION, COMMISSION_RECEIVED, COMMISSION_PAID, COMMISSION_CLAWBACK_REVERSAL, FLOAT_ADVANCE, BUSINESS_TO_BUSINESS, FLOAT_FINANCING, BUSINESS_DEPOSIT_REVERSAL, POCHI_WITHDRAWAL, POCHI_DEPOSIT, POCHI_WITHDRAWAL_REVERSAL, COMMISSION_REVERSAL, CUSTOMER_WITHDRAWAL_REVERSAL, FLOAT_FINANCING_REPAYMENT, TUNUKIWA, M_SHWARI_LOAN, KCB_M_PESA_LOAN, GLOBAL_SEND_TO_MOBILE, GLOBAL_SEND_TO_BANK, RECEIVED_POCHI_PAYMENT, POCHI_LA_BIASHARA_WITHDRAW_TO_PERSONAL_ACCOUNT, MOVE_MONEY_BETWEEN_ACCOUNTS, FLOAT_ADMINISTRATION, POCHI_LA_BIASHARA_BUY_GOODS, REGISTER_CUSTOMER, PAY_WITH_MPESA, FULIZA_REPAYMENT, BUSINESS_PAY_TO_MOBILE_NUMBER, SELL_AIRTIME_TO_CUSTOMER, CUSTOMER_PAYMENT_TO_POCHI, CUSTOMER_PAYMENT_TO_POCHI_WITH_OD, MICRO_SME_WITHDRAWAL_AT_AGENT_TILL, WITHDRAWAL_OF_FUNDS_FROM_MPESA_TO_POCHI, WITHDRAWAL_OF_FUNDS_FROM_POCHI_TO_MPESA, TRANSFER_OF_FUNDS_FROM_POCHI_TO_MPESA, MICRO_SME_DEPOSIT_AT_AGENT_TILL, PAYMENT_TO_POCHI_MERCHANT, BUY_AIRTIME_FOR_SELF, AGENT_DEPOSIT, OTHER, CREATE_PAYMENT_REQUEST, CASH_UP_REPORT, TRANSFER_FROM_BANK, POCHI_LA_BIASHARA_WITHDRAW_TO_BUSINESS_ACCOUNT, POCHI_LA_BIASHARA_PAY_BILL, POCHI_LA_BIASHARA_WITHDRAW_AT_AGENT, POCHI_LA_BIASHARA_PAY_TO_OTHER_MOBILE_NUMBER, WITHDRAW_TO_BANK_FROM_ALL_STORES, PAY_FUEL, SELL_FUEL, ADD_CAR, EDIT_CAR, SPLIT_BILL, UTILITY_PAYMENT, CANAL_PLUS, DSTV, ETHIOPIAN_AIRLINES, ETHIOPIAN_ELECTRICITY_UTILITIES, BUY_BUNDLES, SELL_FUEL_BY_CODE, MOVE_MONEY_FLOAT_TO_WORKING, MOVE_MONEY_FLOAT_TO_MERCHANT, MOVE_MONEY_WORKING_TO_FLOAT, MOVE_MONEY_WORKING_TO_MERCHANT, MOVE_MONEY_MERCHANT_TO_WORKING, MOVE_MONEY_MERCHANT_TO_FLOAT, SEND_MONEY_OD, PAY_WITH_MPESA_OD, BUY_AIRTIME_OD, BUY_BUNDLES_OD, EXPRESS_CHECKOUT};
    }

    public static EnumEntries<TransactionType> getEntries() {
        return $ENTRIES;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }
}
