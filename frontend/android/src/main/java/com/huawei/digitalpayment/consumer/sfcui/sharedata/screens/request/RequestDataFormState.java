package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request;

import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/request/RequestDataFormState;", "", "sponsorMsisdn", "", "sponsorMsisdnError", "sponsorMsisdnFormatted", "requestedAmount", "requestedAmountError", "isValid", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getSponsorMsisdnError", "getSponsorMsisdnFormatted", "getRequestedAmount", "getRequestedAmountError", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestDataFormState {
    public static final int $stable = 0;
    private static int ArtificialStackFrames = 1;
    public static int component1 = 0;
    public static int component3 = 0;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getSponsorBeneficiariesState;
    private final String ShareDataUIState;
    private final boolean component2;
    private final String copy;
    private final String copydefault;
    private final String equals;
    private final String getRequestBeneficiariesState;

    public RequestDataFormState(String str, String str2, String str3, String str4, String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.getRequestBeneficiariesState = str;
        this.equals = str2;
        this.copy = str3;
        this.ShareDataUIState = str4;
        this.copydefault = str5;
        this.component2 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestDataFormState(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7 = "";
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = null;
        if ((i & 2) != 0) {
            int i2 = getSponsorBeneficiariesState + 89;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str2;
        }
        String str10 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            int i4 = getSponsorBeneficiariesState + 113;
            ArtificialStackFrames = i4 % 128;
            if (i4 % 2 == 0) {
                str9.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i6 = getSponsorBeneficiariesState + 23;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i9 = ArtificialStackFrames + 97;
            getSponsorBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            z = false;
        }
        this(str8, str6, str10, str7, str9, z);
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 35;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String getSponsorMsisdnError() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 105;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.equals;
        int i4 = i3 + 55;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSponsorMsisdnFormatted() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 59;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 121;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRequestedAmount() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 7;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 97;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final String getRequestedAmountError() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 77;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 119;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component2;
        int i4 = i2 + 53;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static {
        int i = 1 + 119;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public RequestDataFormState() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static RequestDataFormState copy$default(RequestDataFormState requestDataFormState, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = getSponsorBeneficiariesState + 15;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 == 0) {
                String str6 = requestDataFormState.getRequestBeneficiariesState;
                obj2.hashCode();
                throw null;
            }
            str = requestDataFormState.getRequestBeneficiariesState;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = requestDataFormState.equals;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i4 = ArtificialStackFrames + 13;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            str3 = requestDataFormState.copy;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            int i6 = ArtificialStackFrames + 91;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                String str10 = requestDataFormState.ShareDataUIState;
                throw null;
            }
            str4 = requestDataFormState.ShareDataUIState;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = requestDataFormState.copydefault;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            z = requestDataFormState.component2;
            int i7 = getSponsorBeneficiariesState + 117;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
        }
        return requestDataFormState.copy(str7, str8, str9, str11, str12, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 45;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 23;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 27;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 97;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 97;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 79;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 105;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 21;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 41;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 27;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final RequestDataFormState copy(String sponsorMsisdn, String sponsorMsisdnError, String sponsorMsisdnFormatted, String requestedAmount, String requestedAmountError, boolean isValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdnFormatted, "");
        Intrinsics.checkNotNullParameter(requestedAmount, "");
        RequestDataFormState requestDataFormState = new RequestDataFormState(sponsorMsisdn, sponsorMsisdnError, sponsorMsisdnFormatted, requestedAmount, requestedAmountError, isValid);
        int i2 = ArtificialStackFrames + 95;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return requestDataFormState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 9;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getRequestBeneficiariesState, r6.getRequestBeneficiariesState) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames + 61;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.equals, r6.equals) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copy, r6.copy) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r5.component2 == r6.component2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames + 49;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if ((r6 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState + 123;
        com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if ((r6 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        r6 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState
            int r2 = r1 + 15
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 19
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState
            if (r2 != 0) goto L25
            int r1 = r1 + 9
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r6 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState) r6
            java.lang.String r1 = r5.getRequestBeneficiariesState
            java.lang.String r2 = r6.getRequestBeneficiariesState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3b
            int r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames
            int r6 = r6 + 61
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState = r1
            int r6 = r6 % r0
            return r4
        L3b:
            java.lang.String r1 = r5.equals
            java.lang.String r2 = r6.equals
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            return r4
        L46:
            java.lang.String r1 = r5.copy
            java.lang.String r2 = r6.copy
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L51
            return r4
        L51:
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r2 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L5c
            return r4
        L5c:
            java.lang.String r1 = r5.copydefault
            java.lang.String r2 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == r3) goto L67
            return r4
        L67:
            boolean r1 = r5.component2
            boolean r6 = r6.component2
            if (r1 == r6) goto L7a
            int r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames
            int r6 = r6 + 49
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L79
            return r3
        L79:
            return r4
        L7a:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.getSponsorBeneficiariesState
            int r6 = r6 + 123
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.ArtificialStackFrames = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L88
            r6 = 34
            int r6 = r6 / r4
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.getRequestBeneficiariesState.hashCode();
        String str = this.equals;
        if (str == null) {
            int i2 = getSponsorBeneficiariesState + 101;
            ArtificialStackFrames = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = ArtificialStackFrames + 39;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode3 = this.copy.hashCode();
        int iHashCode4 = this.ShareDataUIState.hashCode();
        String str2 = this.copydefault;
        return (((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.component2);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestDataFormState(sponsorMsisdn=" + this.getRequestBeneficiariesState + ", sponsorMsisdnError=" + this.equals + ", sponsorMsisdnFormatted=" + this.copy + ", requestedAmount=" + this.ShareDataUIState + ", requestedAmountError=" + this.copydefault + ", isValid=" + this.component2 + ")";
        int i2 = ArtificialStackFrames + 103;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static int ShareDataUIState() {
        int i = component1;
        int i2 = i % 7199438;
        component1 = i + 1;
        if (i2 != 0) {
            return component3;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        component3 = startUptimeMillis;
        return startUptimeMillis;
    }
}
