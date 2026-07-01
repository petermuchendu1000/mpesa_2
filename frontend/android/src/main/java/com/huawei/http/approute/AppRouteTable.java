package com.huawei.http.approute;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/http/approute/AppRouteTable;", "", "u", "", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getU", "()Ljava/lang/String;", "setU", "(Ljava/lang/String;)V", "getG", "setG", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppRouteTable {
    private String component3;
    private String copydefault;

    public AppRouteTable(String str, String str2) {
        this.component3 = str;
        this.copydefault = str2;
    }

    public AppRouteTable(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getG() {
        return this.copydefault;
    }

    public final String getU() {
        return this.component3;
    }

    public final void setG(String str) {
        this.copydefault = str;
    }

    public final void setU(String str) {
        this.component3 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppRouteTable() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static AppRouteTable copy$default(AppRouteTable appRouteTable, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appRouteTable.component3;
        }
        if ((i & 2) != 0) {
            str2 = appRouteTable.copydefault;
        }
        return appRouteTable.copy(str, str2);
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final AppRouteTable copy(String u, String g) {
        return new AppRouteTable(u, g);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppRouteTable)) {
            return false;
        }
        AppRouteTable appRouteTable = (AppRouteTable) other;
        return Intrinsics.areEqual(this.component3, appRouteTable.component3) && Intrinsics.areEqual(this.copydefault, appRouteTable.copydefault);
    }

    public int hashCode() {
        String str = this.component3;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AppRouteTable(u=" + this.component3 + ", g=" + this.copydefault + ")";
    }
}
