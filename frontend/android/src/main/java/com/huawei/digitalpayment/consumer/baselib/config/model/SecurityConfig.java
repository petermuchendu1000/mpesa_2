package com.huawei.digitalpayment.consumer.baselib.config.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/SecurityConfig;", "", "sslPinning", "", "Lcom/huawei/digitalpayment/consumer/baselib/config/model/SslPinningInfo;", "<init>", "(Ljava/util/List;)V", "getSslPinning", "()Ljava/util/List;", "setSslPinning", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SecurityConfig {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private List<SslPinningInfo> component3;

    public SecurityConfig(List<SslPinningInfo> list) {
        this.component3 = list;
    }

    public SecurityConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            list = new ArrayList();
            int i2 = component2 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list);
    }

    public final List<SslPinningInfo> getSslPinning() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        List<SslPinningInfo> list = this.component3;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setSslPinning(List<SslPinningInfo> list) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.component3 = list;
        int i5 = i3 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SecurityConfig copy$default(SecurityConfig securityConfig, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 81;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            list = securityConfig.component3;
            int i6 = i4 + 17;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return securityConfig.copy(list);
    }

    public final List<SslPinningInfo> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<SslPinningInfo> list = this.component3;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return list;
    }

    public final SecurityConfig copy(List<SslPinningInfo> sslPinning) {
        int i = 2 % 2;
        SecurityConfig securityConfig = new SecurityConfig(sslPinning);
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return securityConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(other instanceof SecurityConfig))) {
            return Intrinsics.areEqual(this.component3, ((SecurityConfig) other).component3);
        }
        int i4 = ShareDataUIState + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        List<SslPinningInfo> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            list = this.component3;
            int i3 = 39 / 0;
            if (list == null) {
                return 0;
            }
        } else {
            list = this.component3;
            if (list == null) {
                return 0;
            }
        }
        int iHashCode = list.hashCode();
        int i4 = component2 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityConfig(sslPinning=" + this.component3 + ")";
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
