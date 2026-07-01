package com.huawei.digitalpayment.consumer.home.viewmodel;

import com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection;
import com.huawei.digitalpayment.consumer.home.ui.model.RecentTransaction;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003Jg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÇ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchUiState;", "", "query", "", "categories", "", "selectedCategory", "sections", "Lcom/huawei/digitalpayment/consumer/home/ui/model/GlobalSearchSection;", "recentSearches", HomeConstants.RECENT_TRANSACTIONS, "Lcom/huawei/digitalpayment/consumer/home/ui/model/RecentTransaction;", "suggestion", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getCategories", "()Ljava/util/List;", "getSelectedCategory", "getSections", "getRecentSearches", "getRecentTransactions", "getSuggestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalSearchUiState {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 0;
    private static int toString = 1;
    private final List<String> ShareDataUIState;
    private final List<GlobalSearchSection> component1;
    private final String component2;
    private final List<String> component3;
    private final List<RecentTransaction> copydefault;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public GlobalSearchUiState(String str, List<String> list, String str2, List<GlobalSearchSection> list2, List<String> list3, List<RecentTransaction> list4, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = str;
        this.ShareDataUIState = list;
        this.getRequestBeneficiariesState = str2;
        this.component1 = list2;
        this.component3 = list3;
        this.copydefault = list4;
        this.getAsAtTimestamp = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalSearchUiState(String str, List list, String str2, List list2, List list3, List list4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = "";
        if ((i & 1) != 0) {
            int i2 = equals + 115;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        String str5 = "All";
        List listListOf = (i & 2) != 0 ? CollectionsKt.listOf("All") : list;
        if ((i & 4) != 0) {
            int i4 = equals + 85;
            toString = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            int i6 = equals + 39;
            toString = i6 % 128;
            int i7 = i6 % 2;
            list2 = CollectionsKt.emptyList();
            int i8 = 2 % 2;
        }
        List list5 = list2;
        List listEmptyList = (i & 16) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i & 32) != 0) {
            list4 = CollectionsKt.emptyList();
            int i9 = 2 % 2;
        }
        List list6 = list4;
        if ((i & 64) != 0) {
            int i10 = equals + 111;
            int i11 = i10 % 128;
            toString = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 63;
            equals = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
        } else {
            str4 = str3;
        }
        this(str, listListOf, str5, list5, listEmptyList, list6, str4);
    }

    public final String getQuery() {
        int i = 2 % 2;
        int i2 = toString + 97;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 117;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> getCategories() {
        int i = 2 % 2;
        int i2 = toString + 33;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getSelectedCategory() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 85;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 53;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<GlobalSearchSection> getSections() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 37;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<GlobalSearchSection> list = this.component1;
        int i5 = i2 + 47;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> getRecentSearches() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 87;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.component3;
        int i5 = i2 + 65;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<RecentTransaction> getRecentTransactions() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 91;
        toString = i3 % 128;
        int i4 = i3 % 2;
        List<RecentTransaction> list = this.copydefault;
        int i5 = i2 + 67;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getSuggestion() {
        int i = 2 % 2;
        int i2 = equals + 97;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 119;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 119;
        copy = i % 128;
        int i2 = i % 2;
    }

    public GlobalSearchUiState() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GlobalSearchUiState copy$default(GlobalSearchUiState globalSearchUiState, String str, List list, String str2, List list2, List list3, List list4, String str3, int i, Object obj) {
        String str4;
        List list5;
        String str5;
        List list6;
        String str6;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = toString + 111;
            equals = i3 % 128;
            int i4 = i3 % 2;
            str4 = globalSearchUiState.component2;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            list5 = globalSearchUiState.ShareDataUIState;
            int i5 = equals + 37;
            toString = i5 % 128;
            int i6 = i5 % 2;
        } else {
            list5 = list;
        }
        if ((i & 4) != 0) {
            str5 = globalSearchUiState.getRequestBeneficiariesState;
            int i7 = toString + 79;
            equals = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str5 = str2;
        }
        List list7 = (i & 8) != 0 ? globalSearchUiState.component1 : list2;
        List list8 = (i & 16) != 0 ? globalSearchUiState.component3 : list3;
        if ((i & 32) != 0) {
            int i9 = toString + 25;
            equals = i9 % 128;
            int i10 = i9 % 2;
            list6 = globalSearchUiState.copydefault;
        } else {
            list6 = list4;
        }
        if ((i & 64) != 0) {
            int i11 = toString + 1;
            equals = i11 % 128;
            int i12 = i11 % 2;
            str6 = globalSearchUiState.getAsAtTimestamp;
        } else {
            str6 = str3;
        }
        GlobalSearchUiState globalSearchUiStateCopy = globalSearchUiState.copy(str4, list5, str5, list7, list8, list6, str6);
        int i13 = equals + 49;
        toString = i13 % 128;
        int i14 = i13 % 2;
        return globalSearchUiStateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = toString + 35;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 45;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 25;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.ShareDataUIState;
        int i5 = i2 + 3;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 73;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<GlobalSearchSection> component4() {
        List<GlobalSearchSection> list;
        int i = 2 % 2;
        int i2 = toString + 91;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            list = this.component1;
            int i4 = 0 / 0;
        } else {
            list = this.component1;
        }
        int i5 = i3 + 117;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<String> component5() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 13;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.component3;
        int i5 = i2 + 17;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<RecentTransaction> component6() {
        int i = 2 % 2;
        int i2 = equals + 51;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        List<RecentTransaction> list = this.copydefault;
        int i5 = i3 + 105;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = equals + 109;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    public final GlobalSearchUiState copy(String query, List<String> categories, String selectedCategory, List<GlobalSearchSection> sections, List<String> recentSearches, List<RecentTransaction> recentTransactions, String suggestion) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(query, "");
        Intrinsics.checkNotNullParameter(categories, "");
        Intrinsics.checkNotNullParameter(selectedCategory, "");
        Intrinsics.checkNotNullParameter(sections, "");
        Intrinsics.checkNotNullParameter(recentSearches, "");
        Intrinsics.checkNotNullParameter(recentTransactions, "");
        Intrinsics.checkNotNullParameter(suggestion, "");
        GlobalSearchUiState globalSearchUiState = new GlobalSearchUiState(query, categories, selectedCategory, sections, recentSearches, recentTransactions, suggestion);
        int i2 = toString + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return globalSearchUiState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 11;
        com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString + 115;
        com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getRequestBeneficiariesState, r6.getRequestBeneficiariesState) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString + 53;
        com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault)) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getAsAtTimestamp, r6.getAsAtTimestamp) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals + 119;
        com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals + 59;
        com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if ((r6 % 2) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString
            int r2 = r1 + 27
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L15
            int r2 = r4 / r4
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r3
        L18:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState
            r2 = r2 ^ r3
            if (r2 == 0) goto L25
            int r1 = r1 + 11
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState r6 = (com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState) r6
            java.lang.String r1 = r5.component2
            java.lang.String r2 = r6.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            return r4
        L32:
            java.util.List<java.lang.String> r1 = r5.ShareDataUIState
            java.util.List<java.lang.String> r2 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            int r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString
            int r6 = r6 + 115
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r1
            int r6 = r6 % r0
            return r4
        L46:
            java.lang.String r1 = r5.getRequestBeneficiariesState
            java.lang.String r2 = r6.getRequestBeneficiariesState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L51
            return r4
        L51:
            java.util.List<com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection> r1 = r5.component1
            java.util.List<com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection> r2 = r6.component1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5c
            return r4
        L5c:
            java.util.List<java.lang.String> r1 = r5.component3
            java.util.List<java.lang.String> r2 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L70
            int r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString
            int r6 = r6 + 53
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals = r1
            int r6 = r6 % r0
            return r4
        L70:
            java.util.List<com.huawei.digitalpayment.consumer.home.ui.model.RecentTransaction> r1 = r5.copydefault
            java.util.List<com.huawei.digitalpayment.consumer.home.ui.model.RecentTransaction> r2 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L90
            java.lang.String r1 = r5.getAsAtTimestamp
            java.lang.String r6 = r6.getAsAtTimestamp
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L8f
            int r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals
            int r6 = r6 + 119
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString = r1
            int r6 = r6 % r0
            return r4
        L8f:
            return r3
        L90:
            int r6 = com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals
            int r6 = r6 + 59
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.toString = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L9c
            return r4
        L9c:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.viewmodel.GlobalSearchUiState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = toString + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.component2.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.getRequestBeneficiariesState.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.getAsAtTimestamp.hashCode();
        int i4 = equals + 51;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalSearchUiState(query=" + this.component2 + ", categories=" + this.ShareDataUIState + ", selectedCategory=" + this.getRequestBeneficiariesState + ", sections=" + this.component1 + ", recentSearches=" + this.component3 + ", recentTransactions=" + this.copydefault + ", suggestion=" + this.getAsAtTimestamp + ")";
        int i2 = toString + 47;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return str;
    }
}
