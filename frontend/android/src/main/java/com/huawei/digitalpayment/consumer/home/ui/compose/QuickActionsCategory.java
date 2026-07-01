package com.huawei.digitalpayment.consumer.home.ui.compose;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "", "<init>", "()V", "All", "FromSection", "FromTitle", "Companion", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$All;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$FromSection;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$FromTitle;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickActionsCategory {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int component1 = 0;
    private static int component2 = 1;

    private QuickActionsCategory() {
    }

    static {
        int i = component2 + 19;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public QuickActionsCategory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$All;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "<init>", "()V", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class All extends QuickActionsCategory {
        public static final int $stable = 0;
        public static final All INSTANCE = new All();
        private static int component1 = 1;
        private static int copydefault;

        private All() {
            super(null);
        }

        static {
            int i = component1 + 61;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$FromSection;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", GriverCacheDao.COLUMN_CACHE_ID, "", "titleRes", "<init>", "(II)V", "getId", "()I", "getTitleRes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FromSection extends QuickActionsCategory {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copy = 1;
        private static int copydefault;
        private final int ShareDataUIState;
        private final int component2;

        public final int getId() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 125;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.ShareDataUIState;
            int i5 = i2 + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final int getTitleRes() {
            int i;
            int i2 = 2 % 2;
            int i3 = copy;
            int i4 = i3 + 47;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.component2;
                int i5 = 16 / 0;
            } else {
                i = this.component2;
            }
            int i6 = i3 + 1;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public FromSection(int i, int i2) {
            super(null);
            this.ShareDataUIState = i;
            this.component2 = i2;
        }

        static {
            int i = 1 + 55;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static FromSection copy$default(FromSection fromSection, int i, int i2, int i3, Object obj) {
            int i4 = 2 % 2;
            if ((i3 & 1) != 0) {
                int i5 = component3 + 73;
                copy = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = fromSection.ShareDataUIState;
                    throw null;
                }
                i = fromSection.ShareDataUIState;
            }
            if ((i3 & 2) != 0) {
                int i7 = component3 + 63;
                copy = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = fromSection.component2;
                    throw null;
                }
                i2 = fromSection.component2;
            }
            return fromSection.copy(i, i2);
        }

        public final int component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 9;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = this.ShareDataUIState;
            int i5 = i2 + 89;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final int component2() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 37;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.component2;
            int i6 = i2 + 105;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        public final FromSection copy(int id, int titleRes) {
            int i = 2 % 2;
            FromSection fromSection = new FromSection(id, titleRes);
            int i2 = component3 + 111;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return fromSection;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r7 instanceof com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r7 = (com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            if (r6.ShareDataUIState == r7.ShareDataUIState) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        
            if (r6.component2 == r7.component2) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        
            r3 = r3 + 11;
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.component3 = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            r1 = r1 + 121;
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.copy = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r3 = r3 + 51;
            com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.component3 = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.component3
                int r2 = r1 + 37
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.copy = r3
                int r2 = r2 % r0
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L16
                r2 = 93
                int r2 = r2 / r5
                if (r6 != r7) goto L20
                goto L18
            L16:
                if (r6 != r7) goto L20
            L18:
                int r3 = r3 + 51
                int r7 = r3 % 128
                com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.component3 = r7
                int r3 = r3 % r0
                return r4
            L20:
                boolean r2 = r7 instanceof com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection
                if (r2 == 0) goto L3c
                com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory$FromSection r7 = (com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection) r7
                int r1 = r6.ShareDataUIState
                int r2 = r7.ShareDataUIState
                if (r1 == r2) goto L2d
                return r5
            L2d:
                int r1 = r6.component2
                int r7 = r7.component2
                if (r1 == r7) goto L3b
                int r3 = r3 + 11
                int r7 = r3 % 128
                com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.component3 = r7
                int r3 = r3 % r0
                return r5
            L3b:
                return r4
            L3c:
                int r1 = r1 + 121
                int r7 = r1 % 128
                com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.copy = r7
                int r1 = r1 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory.FromSection.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 35;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.ShareDataUIState);
            return i3 == 0 ? (iHashCode % 103) << Integer.hashCode(this.component2) : (iHashCode * 31) + Integer.hashCode(this.component2);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FromSection(id=" + this.ShareDataUIState + ", titleRes=" + this.component2 + ")";
            int i2 = copy + 61;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$FromTitle;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FromTitle extends QuickActionsCategory {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromTitle(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getTitle() {
            int i = 2 % 2;
            int i2 = component1 + 1;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        static {
            int i = 1 + 107;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static FromTitle copy$default(FromTitle fromTitle, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component1 = i3 % 128;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                str = fromTitle.ShareDataUIState;
            }
            FromTitle fromTitleCopy = fromTitle.copy(str);
            int i4 = component3 + 27;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return fromTitleCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 117;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 115;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final FromTitle copy(String title) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(title, "");
            FromTitle fromTitle = new FromTitle(title);
            int i2 = component1 + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return fromTitle;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 45;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof FromTitle)) {
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, ((FromTitle) other).ShareDataUIState)) {
                int i4 = component1 + 39;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = component3 + 81;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            int i4 = component3 + 77;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FromTitle(title=" + this.ShareDataUIState + ")";
            int i2 = component1 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory$Companion;", "", "<init>", "()V", "fromSections", "", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "sections", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionSection;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public final List<QuickActionsCategory> fromSections(List<QuickActionSection> sections) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sections, "");
            List listListOf = CollectionsKt.listOf(All.INSTANCE);
            List<QuickActionSection> list = sections;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i2 = ShareDataUIState + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            for (QuickActionSection quickActionSection : list) {
                arrayList.add(new FromSection(quickActionSection.getAction().getId(), quickActionSection.getAction().getTitle()));
            }
            return CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
