package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JL\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/CategorizedMiniApp;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "categoryName", "", "categoryId", "appId", "icon", "appName", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategoryName", "()Ljava/lang/String;", "getCategoryId", "getAppId", "getIcon", "getAppName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/database/entities/CategorizedMiniApp;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategorizedMiniApp {
    private static int component4 = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;
    private final Integer getAsAtTimestamp;

    public CategorizedMiniApp(Integer num, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.getAsAtTimestamp = num;
        this.component3 = str;
        this.copydefault = str2;
        this.ShareDataUIState = str3;
        this.component1 = str4;
        this.component2 = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CategorizedMiniApp(Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        if ((i & 1) != 0) {
            int i2 = component4 + 75;
            getRequestBeneficiariesState = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            num2 = null;
        } else {
            num2 = num;
        }
        this(num2, str, str2, str3, str4, str5);
    }

    public final Integer getId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.getAsAtTimestamp;
        int i4 = i3 + 87;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return num;
    }

    public final String getCategoryName() {
        int i = 2 % 2;
        int i2 = component4 + 111;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getCategoryId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getAppId() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 46 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 19;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 107;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAppName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 75;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 35;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CategorizedMiniApp copy$default(CategorizedMiniApp categorizedMiniApp, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 1;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            num = categorizedMiniApp.getAsAtTimestamp;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            str = categorizedMiniApp.component3;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = categorizedMiniApp.copydefault;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            int i5 = component4 + 71;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                String str8 = categorizedMiniApp.ShareDataUIState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = categorizedMiniApp.ShareDataUIState;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = categorizedMiniApp.component1;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = categorizedMiniApp.component2;
            int i6 = getRequestBeneficiariesState + 29;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            }
        }
        return categorizedMiniApp.copy(num2, str6, str7, str9, str10, str5);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 55;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 33;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 55;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 35;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CategorizedMiniApp copy(Integer id, String categoryName, String categoryId, String appId, String icon, String appName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryName, "");
        Intrinsics.checkNotNullParameter(categoryId, "");
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(icon, "");
        Intrinsics.checkNotNullParameter(appName, "");
        CategorizedMiniApp categorizedMiniApp = new CategorizedMiniApp(id, categoryName, categoryId, appId, icon, appName);
        int i2 = getRequestBeneficiariesState + 15;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return categorizedMiniApp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4 + 117;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 25;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof CategorizedMiniApp)) {
            int i7 = i3 + 15;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        CategorizedMiniApp categorizedMiniApp = (CategorizedMiniApp) other;
        if ((!Intrinsics.areEqual(this.getAsAtTimestamp, categorizedMiniApp.getAsAtTimestamp)) || !Intrinsics.areEqual(this.component3, categorizedMiniApp.component3) || !Intrinsics.areEqual(this.copydefault, categorizedMiniApp.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, categorizedMiniApp.ShareDataUIState)) {
            int i9 = component4 + 115;
            getRequestBeneficiariesState = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component1, categorizedMiniApp.component1)) {
            int i10 = component4 + 83;
            getRequestBeneficiariesState = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.component2, categorizedMiniApp.component2)) {
            return true;
        }
        int i11 = component4 + 25;
        getRequestBeneficiariesState = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[PHI: r2
  0x0023: PHI (r2v4 java.lang.Integer) = (r2v2 java.lang.Integer), (r2v6 java.lang.Integer) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.component4
            int r2 = r1 + 91
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.getRequestBeneficiariesState = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            java.lang.Integer r2 = r5.getAsAtTimestamp
            r4 = 49
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            java.lang.Integer r2 = r5.getAsAtTimestamp
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.getRequestBeneficiariesState = r2
        L21:
            int r1 = r1 % r0
            goto L30
        L23:
            int r3 = r2.hashCode()
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.getRequestBeneficiariesState
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.component4 = r2
            goto L21
        L30:
            int r3 = r3 * 31
            java.lang.String r0 = r5.component3
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 31
            java.lang.String r0 = r5.copydefault
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 31
            java.lang.String r0 = r5.ShareDataUIState
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 31
            java.lang.String r0 = r5.component1
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * 31
            java.lang.String r0 = r5.component2
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.CategorizedMiniApp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CategorizedMiniApp(id=" + this.getAsAtTimestamp + ", categoryName=" + this.component3 + ", categoryId=" + this.copydefault + ", appId=" + this.ShareDataUIState + ", icon=" + this.component1 + ", appName=" + this.component2 + ")";
        int i2 = getRequestBeneficiariesState + 13;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
