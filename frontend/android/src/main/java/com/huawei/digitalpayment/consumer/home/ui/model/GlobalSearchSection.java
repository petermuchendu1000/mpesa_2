package com.huawei.digitalpayment.consumer.home.ui.model;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/model/GlobalSearchSection;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "title", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, FirebaseAnalytics.Param.ITEMS, "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getCategory", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalSearchSection {
    public static final int $stable = 8;
    private static char[] component2;
    private static int equals;
    private static char getAsAtTimestamp;
    private final String ShareDataUIState;
    private final String component1;
    private final String component3;
    private final List<LocalHomeFunction> copydefault;
    private static final byte[] $$c = {90, 10, -103, 87};
    private static final int $$d = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarHeader.LF_BLK, -107, 59, -11, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49};
    private static final int $$b = 200;
    private static int copy = 0;
    private static int component4 = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r7 = r7 + 119
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.$$e(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.$$a
            int r8 = 16 - r8
            int r9 = r9 * 16
            int r9 = r9 + 83
            int r7 = r7 * 5
            int r7 = 28 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r7 = r7 + (-16)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.a(short, byte, byte, java.lang.Object[]):void");
    }

    public GlobalSearchSection(String str, String str2, String str3, List<LocalHomeFunction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = str;
        this.component1 = str2;
        this.component3 = str3;
        this.copydefault = list;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 73;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 27;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return str;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = copy + 19;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 59;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component4 + 49;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final List<LocalHomeFunction> getItems() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 27;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.copydefault;
        int i5 = i2 + 37;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String component1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.component1():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r31, char[] r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.model.GlobalSearchSection.b(byte, char[], int, java.lang.Object[]):void");
    }

    static {
        equals = 0;
        copydefault();
        int i = getRequestBeneficiariesState + 69;
        equals = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GlobalSearchSection copy$default(GlobalSearchSection globalSearchSection, String str, String str2, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 113;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = globalSearchSection.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = globalSearchSection.component1;
        }
        if ((i & 4) != 0) {
            str3 = globalSearchSection.component3;
            int i6 = i4 + 67;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 8) != 0) {
            int i8 = i4 + 13;
            copy = i8 % 128;
            int i9 = i8 % 2;
            list = globalSearchSection.copydefault;
            if (i9 != 0) {
                int i10 = 47 / 0;
            }
        }
        return globalSearchSection.copy(str, str2, str3, list);
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 13;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 57;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 19;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final List<LocalHomeFunction> component4() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.copydefault;
        int i5 = i3 + 37;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return list;
    }

    public final GlobalSearchSection copy(String id, String title, String category, List<LocalHomeFunction> items) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(items, "");
        GlobalSearchSection globalSearchSection = new GlobalSearchSection(id, title, category, items);
        int i2 = copy + 39;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return globalSearchSection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalSearchSection)) {
            return false;
        }
        GlobalSearchSection globalSearchSection = (GlobalSearchSection) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, globalSearchSection.ShareDataUIState)) {
            int i2 = copy + 51;
            component4 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.component1, globalSearchSection.component1)) {
            return Intrinsics.areEqual(this.component3, globalSearchSection.component3) && Intrinsics.areEqual(this.copydefault, globalSearchSection.copydefault);
        }
        int i3 = component4 + 59;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 101;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        return i3 == 0 ? (((((iHashCode * 96) - this.component1.hashCode()) >>> 32) - this.component3.hashCode()) << 3) >>> this.copydefault.hashCode() : (((((iHashCode * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalSearchSection(id=" + this.ShareDataUIState + ", title=" + this.component1 + ", category=" + this.component3 + ", items=" + this.copydefault + ")";
        int i2 = copy + 37;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static void copydefault() {
        component2 = new char[]{2025, 2017, 2023, 2020, 2028, 1966, 2018, 2002, 2019, 2021, 2032, 1987, 2026, 2027, 2038, 2041, 2034, 2036, 2024, 2031, 2003, 2029, 1992, 2035, 2030};
        getAsAtTimestamp = (char) 12831;
    }
}
