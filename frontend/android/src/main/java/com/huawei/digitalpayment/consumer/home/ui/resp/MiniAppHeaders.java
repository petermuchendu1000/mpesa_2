package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.base.util.HeaderConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/MiniAppHeaders;", "", "contentType", "", "sourceApp", "xCorrelationConversationID", "xMiniappSession", "xMsisdn", "xSourceSystem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "getSourceApp", "getXCorrelationConversationID", "getXMiniappSession", "getXMsisdn", "getXSourceSystem", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppHeaders {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 17 % 128;

    @SerializedName("Content-Type")
    private final String contentType;

    @SerializedName("sourceApp")
    private final String sourceApp;

    @SerializedName(HeaderConstants.CONVERSATION_ID)
    private final String xCorrelationConversationID;

    @SerializedName("x-miniapp-session")
    private final String xMiniappSession;

    @SerializedName("x-msisdn")
    private final String xMsisdn;

    @SerializedName(HeaderConstants.SOURCE_SYSTEM)
    private final String xSourceSystem;

    public MiniAppHeaders(String str, String str2, String str3, String str4, String str5, String str6) {
        this.contentType = str;
        this.sourceApp = str2;
        this.xCorrelationConversationID = str3;
        this.xMiniappSession = str4;
        this.xMsisdn = str5;
        this.xSourceSystem = str6;
    }

    public final String getContentType() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.contentType;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSourceApp() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sourceApp;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String getXCorrelationConversationID() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.xCorrelationConversationID;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getXMiniappSession() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.xMiniappSession;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getXMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.xMsisdn;
        int i5 = i2 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getXSourceSystem() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.xSourceSystem;
        int i4 = i3 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 17 % 2;
    }

    public static MiniAppHeaders copy$default(MiniAppHeaders miniAppHeaders, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 25;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 1;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = miniAppHeaders.contentType;
            if (i7 != 0) {
                int i8 = 92 / 0;
            }
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = miniAppHeaders.sourceApp;
            int i9 = component3 + 121;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i11 = component2 + 93;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str3 = miniAppHeaders.xCorrelationConversationID;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = miniAppHeaders.xMiniappSession;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i13 = component3 + 75;
            component2 = i13 % 128;
            int i14 = i13 % 2;
            str5 = miniAppHeaders.xMsisdn;
            if (i14 == 0) {
                int i15 = 2 / 0;
            }
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            int i16 = component2 + 79;
            component3 = i16 % 128;
            if (i16 % 2 != 0) {
                String str12 = miniAppHeaders.xSourceSystem;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str6 = miniAppHeaders.xSourceSystem;
        }
        return miniAppHeaders.copy(str7, str8, str9, str10, str11, str6);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.contentType;
            int i4 = 75 / 0;
        } else {
            str = this.contentType;
        }
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sourceApp;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.xCorrelationConversationID;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.xMiniappSession;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.xMsisdn;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.xSourceSystem;
        int i5 = i3 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MiniAppHeaders copy(String contentType, String sourceApp, String xCorrelationConversationID, String xMiniappSession, String xMsisdn, String xSourceSystem) {
        int i = 2 % 2;
        MiniAppHeaders miniAppHeaders = new MiniAppHeaders(contentType, sourceApp, xCorrelationConversationID, xMiniappSession, xMsisdn, xSourceSystem);
        int i2 = component3 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return miniAppHeaders;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppHeaders)) {
            return false;
        }
        MiniAppHeaders miniAppHeaders = (MiniAppHeaders) other;
        if (!Intrinsics.areEqual(this.contentType, miniAppHeaders.contentType) || !Intrinsics.areEqual(this.sourceApp, miniAppHeaders.sourceApp) || !Intrinsics.areEqual(this.xCorrelationConversationID, miniAppHeaders.xCorrelationConversationID) || !Intrinsics.areEqual(this.xMiniappSession, miniAppHeaders.xMiniappSession)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.xMsisdn, miniAppHeaders.xMsisdn))) {
            return Intrinsics.areEqual(this.xSourceSystem, miniAppHeaders.xSourceSystem);
        }
        int i2 = component3;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v17 java.lang.String) = (r1v4 java.lang.String), (r1v19 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.resp.MiniAppHeaders.component2
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.resp.MiniAppHeaders.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r7.contentType
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r7.contentType
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r7.sourceApp
            if (r4 != 0) goto L2f
            int r4 = com.huawei.digitalpayment.consumer.home.ui.resp.MiniAppHeaders.component2
            int r4 = r4 + 125
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.resp.MiniAppHeaders.component3 = r5
            int r4 = r4 % r0
            r0 = r2
            goto L33
        L2f:
            int r0 = r4.hashCode()
        L33:
            java.lang.String r4 = r7.xCorrelationConversationID
            if (r4 != 0) goto L39
            r4 = r2
            goto L3d
        L39:
            int r4 = r4.hashCode()
        L3d:
            java.lang.String r5 = r7.xMiniappSession
            if (r5 != 0) goto L43
            r5 = r2
            goto L47
        L43:
            int r5 = r5.hashCode()
        L47:
            java.lang.String r6 = r7.xMsisdn
            if (r6 != 0) goto L4c
            goto L50
        L4c:
            int r2 = r6.hashCode()
        L50:
            java.lang.String r6 = r7.xSourceSystem
            if (r6 != 0) goto L55
            goto L59
        L55:
            int r3 = r6.hashCode()
        L59:
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.MiniAppHeaders.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppHeaders(contentType=" + this.contentType + ", sourceApp=" + this.sourceApp + ", xCorrelationConversationID=" + this.xCorrelationConversationID + ", xMiniappSession=" + this.xMiniappSession + ", xMsisdn=" + this.xMsisdn + ", xSourceSystem=" + this.xSourceSystem + ")";
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
