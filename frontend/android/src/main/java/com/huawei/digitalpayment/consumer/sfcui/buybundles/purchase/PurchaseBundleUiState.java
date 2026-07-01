package com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.PurchaseBundleInfoCardData;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Jm\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÇ\u0001J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010.\u001a\u00020/H×\u0001J\t\u00100\u001a\u00020\tH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleUiState;", "", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "bundleInfoCardData", "Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleInfoCardData;", "formState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;", "airtimeBalance", "", "mpesaBalance", "bongaBalance", GriverMonitorConstants.KEY_IS_LOADING, "", "error", "rawDaimaPaymentOptions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleInfoCardData;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "getBundleInfoCardData", "()Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleInfoCardData;", "getFormState", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;", "getAirtimeBalance", "()Ljava/lang/String;", "getMpesaBalance", "getBongaBalance", "()Z", "getError", "getRawDaimaPaymentOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseBundleUiState {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int getShareableDataState = 1;
    private static int hashCode = 1;
    private static int toString;
    private final String ShareDataUIState;
    private final String component1;
    private final PurchaseBundleInfoCardData component2;
    private final WithExpiryResp component3;
    private final PurchaseBundleFormState component4;
    private final String copydefault;
    private final boolean equals;
    private final String getAsAtTimestamp;
    private final List<DaimaProductPaymentOption> getRequestBeneficiariesState;

    public PurchaseBundleUiState(WithExpiryResp withExpiryResp, PurchaseBundleInfoCardData purchaseBundleInfoCardData, PurchaseBundleFormState purchaseBundleFormState, String str, String str2, String str3, boolean z, String str4, List<DaimaProductPaymentOption> list) {
        Intrinsics.checkNotNullParameter(purchaseBundleInfoCardData, "");
        Intrinsics.checkNotNullParameter(purchaseBundleFormState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component3 = withExpiryResp;
        this.component2 = purchaseBundleInfoCardData;
        this.component4 = purchaseBundleFormState;
        this.ShareDataUIState = str;
        this.getAsAtTimestamp = str2;
        this.copydefault = str3;
        this.equals = z;
        this.component1 = str4;
        this.getRequestBeneficiariesState = list;
    }

    public final WithExpiryResp getBundle() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 57;
        toString = i3 % 128;
        int i4 = i3 % 2;
        WithExpiryResp withExpiryResp = this.component3;
        int i5 = i2 + 123;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return withExpiryResp;
    }

    public PurchaseBundleUiState(WithExpiryResp withExpiryResp, PurchaseBundleInfoCardData purchaseBundleInfoCardData, PurchaseBundleFormState purchaseBundleFormState, String str, String str2, String str3, boolean z, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PurchaseBundleFormState purchaseBundleFormState2;
        String str5;
        String str6;
        String str7;
        List listEmptyList;
        WithExpiryResp withExpiryResp2 = (i & 1) != 0 ? null : withExpiryResp;
        PurchaseBundleInfoCardData purchaseBundleInfoCardData2 = (i & 2) != 0 ? new PurchaseBundleInfoCardData("", "", null, 0, null, 4, null) : purchaseBundleInfoCardData;
        if ((i & 4) != 0) {
            purchaseBundleFormState2 = new PurchaseBundleFormState(null, null, null, null, null, PaymentOption.MPESA.INSTANCE, null, false, 223, null);
            int i2 = 2 % 2;
        } else {
            purchaseBundleFormState2 = purchaseBundleFormState;
        }
        if ((i & 8) != 0) {
            int i3 = toString + 9;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            } else {
                int i5 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 16) != 0) {
            int i6 = getShareableDataState + 43;
            int i7 = i6 % 128;
            toString = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 113;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        String str8 = (i & 32) == 0 ? str3 : "";
        boolean z2 = (i & 64) != 0 ? false : z;
        if ((i & 128) != 0) {
            int i12 = toString + 15;
            getShareableDataState = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 256) != 0) {
            int i13 = toString + 73;
            getShareableDataState = i13 % 128;
            if (i13 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
            int i14 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        this(withExpiryResp2, purchaseBundleInfoCardData2, purchaseBundleFormState2, str5, str6, str8, z2, str7, listEmptyList);
    }

    public final PurchaseBundleInfoCardData getBundleInfoCardData() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 23;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        PurchaseBundleInfoCardData purchaseBundleInfoCardData = this.component2;
        int i5 = i2 + 117;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return purchaseBundleInfoCardData;
    }

    public final PurchaseBundleFormState getFormState() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 113;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        PurchaseBundleFormState purchaseBundleFormState = this.component4;
        int i5 = i3 + 119;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return purchaseBundleFormState;
        }
        throw null;
    }

    public final String getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = toString + 11;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getMpesaBalance() {
        int i = 2 % 2;
        int i2 = toString + 63;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 89;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBongaBalance() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 109;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 67;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 69;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.equals;
        int i5 = i2 + 113;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getError() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 3;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 109;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DaimaProductPaymentOption> getRawDaimaPaymentOptions() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 33;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    static {
        int i = 1 + 75;
        copy = i % 128;
        int i2 = i % 2;
    }

    public PurchaseBundleUiState() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PurchaseBundleUiState copy$default(PurchaseBundleUiState purchaseBundleUiState, WithExpiryResp withExpiryResp, PurchaseBundleInfoCardData purchaseBundleInfoCardData, PurchaseBundleFormState purchaseBundleFormState, String str, String str2, String str3, boolean z, String str4, List list, int i, Object obj) {
        WithExpiryResp withExpiryResp2;
        PurchaseBundleInfoCardData purchaseBundleInfoCardData2;
        String str5;
        String str6;
        boolean z2;
        List list2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getShareableDataState + 69;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                withExpiryResp2 = purchaseBundleUiState.component3;
                int i4 = 58 / 0;
            } else {
                withExpiryResp2 = purchaseBundleUiState.component3;
            }
        } else {
            withExpiryResp2 = withExpiryResp;
        }
        if ((i & 2) != 0) {
            purchaseBundleInfoCardData2 = purchaseBundleUiState.component2;
            int i5 = getShareableDataState + 91;
            toString = i5 % 128;
            int i6 = i5 % 2;
        } else {
            purchaseBundleInfoCardData2 = purchaseBundleInfoCardData;
        }
        PurchaseBundleFormState purchaseBundleFormState2 = (i & 4) != 0 ? purchaseBundleUiState.component4 : purchaseBundleFormState;
        String str7 = (i & 8) != 0 ? purchaseBundleUiState.ShareDataUIState : str;
        if ((i & 16) != 0) {
            int i7 = getShareableDataState + 39;
            toString = i7 % 128;
            int i8 = i7 % 2;
            str5 = purchaseBundleUiState.getAsAtTimestamp;
        } else {
            str5 = str2;
        }
        if ((i & 32) != 0) {
            int i9 = getShareableDataState + 69;
            toString = i9 % 128;
            int i10 = i9 % 2;
            str6 = purchaseBundleUiState.copydefault;
        } else {
            str6 = str3;
        }
        if ((i & 64) != 0) {
            z2 = purchaseBundleUiState.equals;
            int i11 = getShareableDataState + 77;
            toString = i11 % 128;
            int i12 = i11 % 2;
        } else {
            z2 = z;
        }
        String str8 = (i & 128) != 0 ? purchaseBundleUiState.component1 : str4;
        if ((i & 256) != 0) {
            int i13 = toString + 123;
            getShareableDataState = i13 % 128;
            if (i13 % 2 == 0) {
                List<DaimaProductPaymentOption> list3 = purchaseBundleUiState.getRequestBeneficiariesState;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list2 = purchaseBundleUiState.getRequestBeneficiariesState;
        } else {
            list2 = list;
        }
        return purchaseBundleUiState.copy(withExpiryResp2, purchaseBundleInfoCardData2, purchaseBundleFormState2, str7, str5, str6, z2, str8, list2);
    }

    public final WithExpiryResp component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 23;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final PurchaseBundleInfoCardData component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 41;
        toString = i3 % 128;
        int i4 = i3 % 2;
        PurchaseBundleInfoCardData purchaseBundleInfoCardData = this.component2;
        int i5 = i2 + 21;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return purchaseBundleInfoCardData;
        }
        throw null;
    }

    public final PurchaseBundleFormState component3() {
        PurchaseBundleFormState purchaseBundleFormState;
        int i = 2 % 2;
        int i2 = getShareableDataState + 57;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            purchaseBundleFormState = this.component4;
            int i4 = 70 / 0;
        } else {
            purchaseBundleFormState = this.component4;
        }
        int i5 = i3 + 25;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return purchaseBundleFormState;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 85;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 17;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 57;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 37;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 119;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 15;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 109;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.equals;
        int i5 = i2 + 55;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return z;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString + 113;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DaimaProductPaymentOption> component9() {
        List<DaimaProductPaymentOption> list;
        int i = 2 % 2;
        int i2 = getShareableDataState + 41;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            list = this.getRequestBeneficiariesState;
            int i4 = 17 / 0;
        } else {
            list = this.getRequestBeneficiariesState;
        }
        int i5 = i3 + 119;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PurchaseBundleUiState copy(WithExpiryResp bundle, PurchaseBundleInfoCardData bundleInfoCardData, PurchaseBundleFormState formState, String airtimeBalance, String mpesaBalance, String bongaBalance, boolean isLoading, String error, List<DaimaProductPaymentOption> rawDaimaPaymentOptions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundleInfoCardData, "");
        Intrinsics.checkNotNullParameter(formState, "");
        Intrinsics.checkNotNullParameter(airtimeBalance, "");
        Intrinsics.checkNotNullParameter(mpesaBalance, "");
        Intrinsics.checkNotNullParameter(bongaBalance, "");
        Intrinsics.checkNotNullParameter(rawDaimaPaymentOptions, "");
        PurchaseBundleUiState purchaseBundleUiState = new PurchaseBundleUiState(bundle, bundleInfoCardData, formState, airtimeBalance, mpesaBalance, bongaBalance, isLoading, error, rawDaimaPaymentOptions);
        int i2 = toString + 99;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return purchaseBundleUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseBundleUiState)) {
            int i2 = getShareableDataState + 31;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PurchaseBundleUiState purchaseBundleUiState = (PurchaseBundleUiState) other;
        if (!Intrinsics.areEqual(this.component3, purchaseBundleUiState.component3) || !Intrinsics.areEqual(this.component2, purchaseBundleUiState.component2) || !Intrinsics.areEqual(this.component4, purchaseBundleUiState.component4) || !Intrinsics.areEqual(this.ShareDataUIState, purchaseBundleUiState.ShareDataUIState) || !Intrinsics.areEqual(this.getAsAtTimestamp, purchaseBundleUiState.getAsAtTimestamp) || !Intrinsics.areEqual(this.copydefault, purchaseBundleUiState.copydefault)) {
            return false;
        }
        if (this.equals != purchaseBundleUiState.equals) {
            int i4 = getShareableDataState + 99;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, purchaseBundleUiState.component1)) {
            int i6 = toString + 33;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.getRequestBeneficiariesState, purchaseBundleUiState.getRequestBeneficiariesState)) {
            return true;
        }
        int i8 = toString + 117;
        getShareableDataState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        WithExpiryResp withExpiryResp;
        int iHashCode;
        int i = 2 % 2;
        int i2 = toString + 9;
        getShareableDataState = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            withExpiryResp = this.component3;
            iHashCode = 1;
            if (withExpiryResp != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = withExpiryResp.hashCode();
            }
        } else {
            withExpiryResp = this.component3;
            if (withExpiryResp == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = withExpiryResp.hashCode();
            }
        }
        int iHashCode3 = this.component2.hashCode();
        int iHashCode4 = this.component4.hashCode();
        int iHashCode5 = this.ShareDataUIState.hashCode();
        int iHashCode6 = this.getAsAtTimestamp.hashCode();
        int iHashCode7 = this.copydefault.hashCode();
        int iHashCode8 = Boolean.hashCode(this.equals);
        String str = this.component1;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        int iHashCode9 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + this.getRequestBeneficiariesState.hashCode();
        int i3 = toString + 85;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseBundleUiState(bundle=" + this.component3 + ", bundleInfoCardData=" + this.component2 + ", formState=" + this.component4 + ", airtimeBalance=" + this.ShareDataUIState + ", mpesaBalance=" + this.getAsAtTimestamp + ", bongaBalance=" + this.copydefault + ", isLoading=" + this.equals + ", error=" + this.component1 + ", rawDaimaPaymentOptions=" + this.getRequestBeneficiariesState + ")";
        int i2 = getShareableDataState + 47;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return str;
    }
}
