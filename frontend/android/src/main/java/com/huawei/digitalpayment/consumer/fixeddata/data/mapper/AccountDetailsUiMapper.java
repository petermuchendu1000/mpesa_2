package com.huawei.digitalpayment.consumer.fixeddata.data.mapper;

import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home4G5GGetAccountDetailResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.AccountList;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetails;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.consumer.sfcui.utils.StringExtensionsKt;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/mapper/AccountDetailsUiMapper;", "", "<init>", "()V", "mergeHome4G5GDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;", "base", ErrorBundle.DETAIL_ENTRY, "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailResponse;", "mapAccountGroups", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "", "userDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "mergeDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "mergeBalances", "balances", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;", "formatDate", "", "input", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountDetailsUiMapper {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @Inject
    public AccountDetailsUiMapper() {
    }

    public final AccountDetailsUiModel mergeHome4G5GDetails(AccountDetailsUiModel base, Home4G5GGetAccountDetailResponse details) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(base, "");
        if (details == null) {
            return base;
        }
        String str4 = Intrinsics.areEqual((Object) details.getExpired(), (Object) false) ? "Active" : (Intrinsics.areEqual((Object) details.getExpired(), (Object) true) && StringExtensionsKt.isNotNullOrEmpty(details.getProductName())) ? TransactionHistoryDetailResponse.EXPIRED : "Inactive";
        String accountBalance = details.getAccountBalance();
        if (accountBalance == null) {
            accountBalance = "";
        }
        String productId = details.getProductId();
        Object obj = null;
        if (productId == null) {
            int i2 = component1 + 49;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            productId = "";
        }
        String productName = details.getProductName();
        String str5 = productName == null ? "" : productName;
        String speed = details.getSpeed();
        if (speed == null) {
            int i3 = component2;
            int i4 = i3 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 43;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = "";
        } else {
            str = speed;
        }
        String productCost = details.getProductCost();
        if (productCost == null) {
            int i8 = component1 + 15;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "";
        } else {
            str2 = productCost;
        }
        String productCost2 = details.getProductCost();
        String str6 = productCost2 == null ? "" : productCost2;
        String expiryDate = details.getExpiryDate();
        String str7 = expiryDate == null ? "" : expiryDate;
        Boolean autoRenew = details.getAutoRenew();
        boolean zBooleanValue = autoRenew != null ? autoRenew.booleanValue() : false;
        String mainBalance = details.getMainBalance();
        if (mainBalance == null) {
            int i9 = component1 + 79;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str3 = "";
        } else {
            str3 = mainBalance;
        }
        Boolean postPay = details.getPostPay();
        return AccountDetailsUiModel.copy$default(base, null, accountBalance, productId, null, str4, str6, str2, null, str5, str, "month", str7, str3, zBooleanValue, postPay != null ? postPay.booleanValue() : false, false, false, null, 229513, null);
    }

    public final Map<FixedDataType, List<AccountDetailsUiModel>> mapAccountGroups(FibreUserDetails userDetails) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<AccountList> accountList = userDetails != null ? userDetails.getAccountList() : null;
        if (accountList == null) {
            int i4 = component1 + 103;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            accountList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = accountList.iterator();
        while (it.hasNext()) {
            int i6 = component2 + 63;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            CollectionsKt.addAll(arrayList, ((AccountList) it.next()).getAccounts());
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (!(!it2.hasNext())) {
            Account account = (Account) it2.next();
            FixedDataType fixedDataTypeFromLastMile = FixedDataType.INSTANCE.fromLastMile(account.getLastMile());
            Pair pair = fixedDataTypeFromLastMile == null ? null : TuplesKt.to(fixedDataTypeFromLastMile, new AccountDetailsUiModel(account.getAccountId(), null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, fixedDataTypeFromLastMile, 131070, null));
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair2 : arrayList2) {
            int i8 = component1 + 3;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            FixedDataType fixedDataType = (FixedDataType) pair2.getFirst();
            Object obj = linkedHashMap.get(fixedDataType);
            if (obj == null) {
                obj = (List) new ArrayList();
                linkedHashMap.put(fixedDataType, obj);
            }
            ((List) obj).add((AccountDetailsUiModel) pair2.getSecond());
        }
        return MapsKt.toSortedMap(linkedHashMap, new Comparator() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i10 = 2 % 2;
                int i11 = ShareDataUIState + 17;
                component3 = i11 % 128;
                int i12 = i11 % 2;
                int iCompareValues = ComparisonsKt.compareValues(Integer.valueOf(((FixedDataType) t).getOrder()), Integer.valueOf(((FixedDataType) t2).getOrder()));
                int i13 = component3 + 119;
                ShareDataUIState = i13 % 128;
                if (i13 % 2 == 0) {
                    return iCompareValues;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel mergeDetails(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r24, com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r25) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.mergeDetails(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel, com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails):com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel mergeBalances(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r22, com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.component2
            int r2 = r2 + 77
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.component1 = r3
            int r2 = r2 % r1
            java.lang.String r3 = ""
            if (r2 == 0) goto L1b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r2 = 3
            int r2 = r2 / 0
            if (r23 == 0) goto L25
            goto L20
        L1b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            if (r23 == 0) goto L25
        L20:
            java.lang.String r2 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMatchingProductBalanceExpiry(r23)
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 != 0) goto L34
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.component2
            int r2 = r2 + 109
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.component1 = r4
            int r2 = r2 % r1
            r15 = r21
            goto L37
        L34:
            r15 = r21
            r3 = r2
        L37:
            java.lang.String r12 = r15.formatDate(r3)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 260095(0x3f7ff, float:3.64471E-40)
            r20 = 0
            r0 = r22
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r0 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper.mergeBalances(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel, com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances):com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel");
    }

    public final String formatDate(String input) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.ISO_DATE_FORMAT, Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
            Date date = simpleDateFormat.parse(input);
            if (date != null) {
                return simpleDateFormat2.format(date);
            }
            int i2 = component2 + 119;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return "";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return "";
        }
    }

    static {
        int i = 1 + 23;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
