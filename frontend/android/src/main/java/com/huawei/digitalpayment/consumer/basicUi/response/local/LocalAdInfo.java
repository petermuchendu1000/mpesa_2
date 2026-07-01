package com.huawei.digitalpayment.consumer.basicUi.response.local;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/response/local/LocalAdInfo;", "Lcom/huawei/http/BaseResp;", "showInterval", "", "showSeconds", "width", "", "height", CdpConstants.CONTENT_IMAGE_URL, KeysConstants.KEY_EXECUTE, "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShowInterval", "()I", "getShowSeconds", "getWidth", "()Ljava/lang/String;", "getHeight", "getImgUrl", "getExecute", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalAdInfo extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private final String execute;
    private final String height;
    private final String imgUrl;
    private final int showInterval;
    private final int showSeconds;
    private final String width;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalAdInfo(int i, int i2, String str, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            int i6 = 2 % 2;
        } else {
            i4 = i2;
        }
        if ((i3 & 4) != 0) {
            int i7 = component3 + 43;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i3 & 8) != 0) {
            int i9 = component3 + 107;
            int i10 = i9 % 128;
            component1 = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 83;
            component3 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 5 / 2;
            } else {
                int i14 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i3 & 16) != 0) {
            int i15 = component3 + 57;
            component1 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        this(i5, i4, str5, str6, str7, (i3 & 32) != 0 ? null : str4);
    }

    public final int getShowInterval() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.showInterval;
        }
        throw null;
    }

    public final int getShowSeconds() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.showSeconds;
        if (i3 != 0) {
            int i5 = 82 / 0;
        }
        return i4;
    }

    public final String getWidth() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.width;
        int i4 = i3 + 3;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return str;
    }

    public final String getHeight() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.height;
        int i5 = i3 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getImgUrl() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.imgUrl;
            int i4 = 33 / 0;
        } else {
            str = this.imgUrl;
        }
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.execute;
            int i4 = 83 / 0;
        } else {
            str = this.execute;
        }
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public LocalAdInfo(int i, int i2, String str, String str2, String str3, String str4) {
        this.showInterval = i;
        this.showSeconds = i2;
        this.width = str;
        this.height = str2;
        this.imgUrl = str3;
        this.execute = str4;
    }

    public LocalAdInfo() {
        this(0, 0, null, null, null, null, 63, null);
    }

    public static LocalAdInfo copy$default(LocalAdInfo localAdInfo, int i, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = component3 + 51;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = localAdInfo.showInterval;
                throw null;
            }
            i = localAdInfo.showInterval;
        }
        int i7 = i;
        if ((i3 & 2) != 0) {
            int i8 = component3 + 99;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            i2 = localAdInfo.showSeconds;
        }
        int i10 = i2;
        if ((i3 & 4) != 0) {
            int i11 = component3 + 73;
            int i12 = i11 % 128;
            component1 = i12;
            int i13 = i11 % 2;
            str = localAdInfo.width;
            int i14 = i12 + 59;
            component3 = i14 % 128;
            int i15 = i14 % 2;
        }
        String str5 = str;
        if ((i3 & 8) != 0) {
            str2 = localAdInfo.height;
        }
        String str6 = str2;
        if ((i3 & 16) != 0) {
            int i16 = component3 + 11;
            component1 = i16 % 128;
            int i17 = i16 % 2;
            str3 = localAdInfo.imgUrl;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = localAdInfo.execute;
        }
        return localAdInfo.copy(i7, i10, str5, str6, str7, str4);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.showInterval;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.showSeconds;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.width;
        int i4 = i2 + 71;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.height;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imgUrl;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalAdInfo copy(int showInterval, int showSeconds, String width, String height, String imgUrl, String execute) {
        int i = 2 % 2;
        LocalAdInfo localAdInfo = new LocalAdInfo(showInterval, showSeconds, width, height, imgUrl, execute);
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localAdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r7 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r7 = (com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6.showInterval == r7.showInterval) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r3 = r3 + 71;
        com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component1 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r6.showSeconds == r7.showSeconds) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.width, r7.width) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.height, r7.height) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.imgUrl, r7.imgUrl) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.execute, r7.execute) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 77;
        com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component3 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
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
            int r1 = com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component1
            int r2 = r1 + 41
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component3 = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 80
            int r2 = r2 / r5
            if (r6 != r7) goto L25
            goto L18
        L16:
            if (r6 != r7) goto L25
        L18:
            int r1 = r1 + 77
            int r7 = r1 % 128
            com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component3 = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            r7 = 95
            int r7 = r7 / r5
        L24:
            return r4
        L25:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo
            if (r1 != 0) goto L2a
            return r5
        L2a:
            com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo r7 = (com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo) r7
            int r1 = r6.showInterval
            int r2 = r7.showInterval
            if (r1 == r2) goto L3d
            int r3 = r3 + 71
            int r7 = r3 % 128
            com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.component1 = r7
            int r3 = r3 % r0
            if (r3 != 0) goto L3c
            return r4
        L3c:
            return r5
        L3d:
            int r0 = r6.showSeconds
            int r1 = r7.showSeconds
            if (r0 == r1) goto L44
            return r5
        L44:
            java.lang.String r0 = r6.width
            java.lang.String r1 = r7.width
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L70
            java.lang.String r0 = r6.height
            java.lang.String r1 = r7.height
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = r6.imgUrl
            java.lang.String r1 = r7.imgUrl
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L64
            return r5
        L64:
            java.lang.String r0 = r6.execute
            java.lang.String r7 = r7.execute
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r7 != 0) goto L6f
            return r5
        L6f:
            return r4
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.response.local.LocalAdInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = Integer.hashCode(this.showInterval);
        int iHashCode5 = Integer.hashCode(this.showSeconds);
        String str = this.width;
        if (str == null) {
            int i2 = component3 + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.height;
        if (str2 == null) {
            int i4 = component3 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.imgUrl;
        if (str3 == null) {
            int i6 = component3 + 27;
            component1 = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.execute;
        return (((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalAdInfo(showInterval=" + this.showInterval + ", showSeconds=" + this.showSeconds + ", width=" + this.width + ", height=" + this.height + ", imgUrl=" + this.imgUrl + ", execute=" + this.execute + ")";
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
