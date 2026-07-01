package com.huawei.digitalpayment.consumer.home.viewmodel;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.core.model.applist.FetchAppInfo;
import com.huawei.digitalpayment.consumer.home.ui.model.RecentTransaction;
import com.huawei.digitalpayment.consumer.home.ui.utils.ComponentTypeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "", "QueryChanged", "CategorySelected", "QuerySubmitted", "RecentSearchClicked", "RecentSearchRemoved", "SuggestionClicked", "SearchResultClicked", "RecentSearchesCleared", "AppListUpdated", "BiometricsChecked", "TransactionsLoaded", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$AppListUpdated;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$BiometricsChecked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$CategorySelected;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$QueryChanged;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$QuerySubmitted;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchRemoved;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchesCleared;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$SearchResultClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$SuggestionClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$TransactionsLoaded;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GlobalSearchIntent {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$QueryChanged;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QueryChanged implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 115 % 128;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        private final String copydefault;

        public QueryChanged(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public final String getQuery() {
            int i = 2 % 2;
            int i2 = component2 + 9;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            throw null;
        }

        static {
            if (115 % 2 == 0) {
                int i = 73 / 0;
            }
        }

        public static QueryChanged copy$default(QueryChanged queryChanged, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component2;
                int i4 = i3 + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                String str2 = queryChanged.copydefault;
                int i6 = i3 + 95;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                str = str2;
            }
            QueryChanged queryChangedCopy = queryChanged.copy(str);
            int i8 = component2 + 99;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return queryChangedCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 43;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final QueryChanged copy(String query) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(query, "");
            QueryChanged queryChanged = new QueryChanged(query);
            int i2 = component1 + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return queryChanged;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 47;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 47;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(!(other instanceof QueryChanged))) {
                return Intrinsics.areEqual(this.copydefault, ((QueryChanged) other).copydefault);
            }
            int i8 = i2 + 111;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = component2 + 39;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "QueryChanged(query=" + this.copydefault + ")";
            int i2 = component2 + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$CategorySelected;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "<init>", "(Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CategorySelected implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        private final String ShareDataUIState;

        public CategorySelected(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getCategory() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 67;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 101;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static CategorySelected copy$default(CategorySelected categorySelected, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = categorySelected.ShareDataUIState;
                int i3 = component1 + 57;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
            CategorySelected categorySelectedCopy = categorySelected.copy(str);
            int i5 = copydefault + 23;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return categorySelectedCopy;
            }
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final CategorySelected copy(String category) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(category, "");
            CategorySelected categorySelected = new CategorySelected(category);
            int i2 = component1 + 27;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 15 / 0;
            }
            return categorySelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 111;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if ((!(other instanceof CategorySelected)) || !Intrinsics.areEqual(this.ShareDataUIState, ((CategorySelected) other).ShareDataUIState)) {
                return false;
            }
            int i4 = copydefault + 37;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CategorySelected(category=" + this.ShareDataUIState + ")";
            int i2 = component1 + 111;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 58 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$QuerySubmitted;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class QuerySubmitted implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        private final String copydefault;

        public QuerySubmitted(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public final String getQuery() {
            int i = 2 % 2;
            int i2 = component2 + 17;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.copydefault;
            int i5 = i3 + 69;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 41;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static QuerySubmitted copy$default(QuerySubmitted querySubmitted, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 57;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 75;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                str = querySubmitted.copydefault;
            }
            return querySubmitted.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final QuerySubmitted copy(String query) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(query, "");
            QuerySubmitted querySubmitted = new QuerySubmitted(query);
            int i2 = component3 + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return querySubmitted;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuerySubmitted)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((QuerySubmitted) other).copydefault)) {
                return true;
            }
            int i2 = component2;
            int i3 = i2 + 37;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 43;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.copydefault.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.copydefault.hashCode();
            int i3 = component2 + 13;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "QuerySubmitted(query=" + this.copydefault + ")";
            int i2 = component2 + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecentSearchClicked implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 1;
        private final String component3;

        public RecentSearchClicked(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getQuery() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component3;
            }
            throw null;
        }

        static {
            int i = 1 + 11;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static RecentSearchClicked copy$default(RecentSearchClicked recentSearchClicked, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 27;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i & 1;
            if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
                int i6 = i4 + 105;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    String str2 = recentSearchClicked.component3;
                    throw null;
                }
                str = recentSearchClicked.component3;
            }
            return recentSearchClicked.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 35;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 125;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final RecentSearchClicked copy(String query) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(query, "");
            RecentSearchClicked recentSearchClicked = new RecentSearchClicked(query);
            int i2 = copydefault + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return recentSearchClicked;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 105;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i2 + 75;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(other instanceof RecentSearchClicked)) {
                int i8 = i4 + 115;
                ShareDataUIState = i8 % 128;
                return i8 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.component3, ((RecentSearchClicked) other).component3)) {
                return true;
            }
            int i9 = ShareDataUIState + 125;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component3;
            if (i3 != 0) {
                return str.hashCode();
            }
            str.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RecentSearchClicked(query=" + this.component3 + ")";
            int i2 = ShareDataUIState + 83;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 52 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchRemoved;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecentSearchRemoved implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 59 % 128;
        private static int component2;
        private static int copydefault;
        private final String component3;

        public RecentSearchRemoved(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getQuery() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 105;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 47;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            if (59 % 2 == 0) {
                int i = 28 / 0;
            }
        }

        public static RecentSearchRemoved copy$default(RecentSearchRemoved recentSearchRemoved, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = recentSearchRemoved.component3;
                int i3 = component2 + 95;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
            RecentSearchRemoved recentSearchRemovedCopy = recentSearchRemoved.copy(str);
            int i5 = component2 + 17;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return recentSearchRemovedCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 49;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 27;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final RecentSearchRemoved copy(String query) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(query, "");
            RecentSearchRemoved recentSearchRemoved = new RecentSearchRemoved(query);
            int i2 = ShareDataUIState + 111;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 0;
            }
            return recentSearchRemoved;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 91;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof RecentSearchRemoved)) {
                int i4 = ShareDataUIState + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.component3, ((RecentSearchRemoved) other).component3)) {
                return true;
            }
            int i6 = ShareDataUIState + 95;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.component3.hashCode();
                int i3 = 82 / 0;
            } else {
                iHashCode = this.component3.hashCode();
            }
            int i4 = component2 + 43;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RecentSearchRemoved(query=" + this.component3 + ")";
            int i2 = ShareDataUIState + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$SuggestionClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "suggestion", "", "<init>", "(Ljava/lang/String;)V", "getSuggestion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestionClicked implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;
        private final String component3;

        public SuggestionClicked(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getSuggestion() {
            int i = 2 % 2;
            int i2 = component2 + 85;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.component3;
            int i4 = i3 + 77;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 23;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static SuggestionClicked copy$default(SuggestionClicked suggestionClicked, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 11;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                str = suggestionClicked.component3;
                int i6 = i4 + 9;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
            return suggestionClicked.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 27;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final SuggestionClicked copy(String suggestion) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(suggestion, "");
            SuggestionClicked suggestionClicked = new SuggestionClicked(suggestion);
            int i2 = ShareDataUIState + 99;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return suggestionClicked;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 51;
                ShareDataUIState = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(other instanceof SuggestionClicked)) {
                int i3 = ShareDataUIState + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component3, ((SuggestionClicked) other).component3))) {
                return true;
            }
            int i5 = ShareDataUIState + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component3.hashCode();
            int i4 = ShareDataUIState + 93;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SuggestionClicked(suggestion=" + this.component3 + ")";
            int i2 = component2 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$SearchResultClicked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "query", "", "<init>", "(Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SearchResultClicked implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;
        private final String component3;

        public SearchResultClicked(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getQuery() {
            int i = 2 % 2;
            int i2 = component2 + 115;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 125;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                int i2 = 30 / 0;
            }
        }

        public static SearchResultClicked copy$default(SearchResultClicked searchResultClicked, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 97;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                str = searchResultClicked.component3;
                int i5 = i4 + 5;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
            return searchResultClicked.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component3;
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return str;
        }

        public final SearchResultClicked copy(String query) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(query, "");
            SearchResultClicked searchResultClicked = new SearchResultClicked(query);
            int i2 = component2 + 85;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 7 / 0;
            }
            return searchResultClicked;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchResultClicked)) {
                int i2 = copydefault + 3;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.component3, ((SearchResultClicked) other).component3)) {
                return true;
            }
            int i4 = component2 + 101;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.component3.hashCode();
                int i3 = 96 / 0;
            } else {
                iHashCode = this.component3.hashCode();
            }
            int i4 = component2 + 31;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SearchResultClicked(query=" + this.component3 + ")";
            int i2 = copydefault + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$RecentSearchesCleared;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecentSearchesCleared implements GlobalSearchIntent {
        public static final int $stable = 0;
        public static final RecentSearchesCleared INSTANCE = new RecentSearchesCleared();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;

        private RecentSearchesCleared() {
        }

        static {
            int i = copydefault + 71;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 99;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof RecentSearchesCleared) {
                return true;
            }
            int i5 = i3 + 115;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                int i4 = 60 / 0;
            }
            int i5 = i3 + 93;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 1823862299;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "RecentSearchesCleared";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$AppListUpdated;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "appList", "", "Lcom/alibaba/griver/core/model/applist/FetchAppInfo;", "<init>", "(Ljava/util/List;)V", "getAppList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppListUpdated implements GlobalSearchIntent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final List<FetchAppInfo> component2;

        /* JADX WARN: Multi-variable type inference failed */
        public AppListUpdated(List<? extends FetchAppInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.component2 = list;
        }

        public final List<FetchAppInfo> getAppList() {
            List<FetchAppInfo> list;
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 91;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                list = this.component2;
                int i4 = 43 / 0;
            } else {
                list = this.component2;
            }
            int i5 = i2 + 91;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return list;
        }

        static {
            int i = 1 + 71;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AppListUpdated copy$default(AppListUpdated appListUpdated, List list, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 3;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 29;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                list = appListUpdated.component2;
                if (i7 != 0) {
                    int i8 = 28 / 0;
                }
            }
            return appListUpdated.copy(list);
        }

        public final List<FetchAppInfo> component1() {
            int i = 2 % 2;
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            List<FetchAppInfo> list = this.component2;
            int i5 = i3 + 43;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AppListUpdated copy(List<? extends FetchAppInfo> appList) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(appList, "");
            AppListUpdated appListUpdated = new AppListUpdated(appList);
            int i2 = component1 + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return appListUpdated;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 45;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 29;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof AppListUpdated)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component2, ((AppListUpdated) other).component2)) {
                return true;
            }
            int i7 = component1 + 5;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = ShareDataUIState + 79;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AppListUpdated(appList=" + this.component2 + ")";
            int i2 = component1 + 55;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$BiometricsChecked;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", "disabled", "", "<init>", "(Z)V", "getDisabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BiometricsChecked implements GlobalSearchIntent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 99 % 128;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final boolean component1;

        public BiometricsChecked(boolean z) {
            this.component1 = z;
        }

        public final boolean getDisabled() {
            int i = 2 % 2;
            int i2 = component3 + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.component1;
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return z;
        }

        static {
            int i = 99 % 2;
        }

        public static BiometricsChecked copy$default(BiometricsChecked biometricsChecked, boolean z, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = copydefault;
                int i4 = i3 + 49;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                boolean z2 = biometricsChecked.component1;
                int i6 = i3 + 21;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                z = z2;
            }
            return biometricsChecked.copy(z);
        }

        public final boolean component1() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 45;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z = this.component1;
            int i4 = i2 + 27;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final BiometricsChecked copy(boolean disabled) {
            int i = 2 % 2;
            BiometricsChecked biometricsChecked = new BiometricsChecked(disabled);
            int i2 = component3 + 11;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return biometricsChecked;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 85;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i2 + 75;
                copydefault = i6 % 128;
                return i6 % 2 != 0;
            }
            if (other instanceof BiometricsChecked) {
                return this.component1 == ((BiometricsChecked) other).component1;
            }
            int i7 = i4 + 13;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.component1);
            int i4 = copydefault + 47;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BiometricsChecked(disabled=" + this.component1 + ")";
            int i2 = component3 + 121;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent$TransactionsLoaded;", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/GlobalSearchIntent;", ComponentTypeConstants.TYPE_TRANSACTIONS, "", "Lcom/huawei/digitalpayment/consumer/home/ui/model/RecentTransaction;", "<init>", "(Ljava/util/List;)V", "getTransactions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionsLoaded implements GlobalSearchIntent {
        public static final int $stable = 8;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 65 % 128;
        private static int copydefault;
        private final List<RecentTransaction> ShareDataUIState;

        public TransactionsLoaded(List<RecentTransaction> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.ShareDataUIState = list;
        }

        public final List<RecentTransaction> getTransactions() {
            List<RecentTransaction> list;
            int i = 2 % 2;
            int i2 = copydefault + 75;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                list = this.ShareDataUIState;
                int i4 = 88 / 0;
            } else {
                list = this.ShareDataUIState;
            }
            int i5 = i3 + 83;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        static {
            int i = 65 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TransactionsLoaded copy$default(TransactionsLoaded transactionsLoaded, List list, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 43;
            copydefault = i3 % 128;
            int i4 = i & 1;
            if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
                list = transactionsLoaded.ShareDataUIState;
            }
            TransactionsLoaded transactionsLoadedCopy = transactionsLoaded.copy(list);
            int i5 = copydefault + 43;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return transactionsLoadedCopy;
            }
            throw null;
        }

        public final List<RecentTransaction> component1() {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            List<RecentTransaction> list = this.ShareDataUIState;
            int i5 = i3 + 83;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final TransactionsLoaded copy(List<RecentTransaction> transactions) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(transactions, "");
            TransactionsLoaded transactionsLoaded = new TransactionsLoaded(transactions);
            int i2 = component2 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return transactionsLoaded;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionsLoaded)) {
                int i2 = component2 + 73;
                copydefault = i2 % 128;
                return i2 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, ((TransactionsLoaded) other).ShareDataUIState)) {
                return true;
            }
            int i3 = copydefault + 113;
            component2 = i3 % 128;
            return i3 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            int i4 = component2 + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TransactionsLoaded(transactions=" + this.ShareDataUIState + ")";
            int i2 = copydefault + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
