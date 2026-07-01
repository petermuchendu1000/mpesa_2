package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import java.util.UUID;
import kotlin.IResultReceiver2_Parcel;
import kotlin.Metadata;
import kotlin.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0015\u0016\u0017B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00070\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "verifyData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/VerifyNumberRespWrapper;", "accountNameData", "", "getVerifyData", "getAccountNameData", "queryOrganization", "", "requesterShortCode", "receiverTillNo", "businessType", "verifyAccountNumber", "shortcode", "accountNumber", "VerifyAccountPayload", "VerifyAccountHeader", "VerifyAccountBody", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyOrganizationViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 61 % 128;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private final MutableLiveData<Resource<VerifyNumberRespWrapper>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<String>> copydefault = new MutableLiveData<>();

    public static final MutableLiveData access$getAccountNameData$p(VerifyOrganizationViewModel verifyOrganizationViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = verifyOrganizationViewModel.copydefault;
        int i5 = i2 + 59;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$getVerifyData$p(VerifyOrganizationViewModel verifyOrganizationViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberRespWrapper>> mutableLiveData = verifyOrganizationViewModel.component2;
        int i5 = i2 + 11;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<VerifyNumberRespWrapper>> getVerifyData() {
        MutableLiveData<Resource<VerifyNumberRespWrapper>> mutableLiveData;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            mutableLiveData = this.component2;
            int i4 = 47 / 0;
        } else {
            mutableLiveData = this.component2;
        }
        int i5 = i2 + 39;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Resource<String>> getAccountNameData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<String>> mutableLiveData = this.copydefault;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return mutableLiveData;
    }

    public final void queryOrganization(String requesterShortCode, String receiverTillNo, final String businessType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requesterShortCode, "");
        Intrinsics.checkNotNullParameter(receiverTillNo, "");
        Intrinsics.checkNotNullParameter(businessType, "");
        this.component2.setValue(Resource.loading(new VerifyNumberRespWrapper(null, businessType)));
        PaymentRequest<VerifyNumberResp> paymentRequest = new PaymentRequest<VerifyNumberResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 11;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 87 / 0;
                }
                return "verifyOrganization";
            }
        };
        if (!TextUtils.isEmpty(requesterShortCode)) {
            int i2 = getAsAtTimestamp + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            paymentRequest.addParams("requesterShortCode", requesterShortCode);
            int i4 = component3 + 13;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!TextUtils.isEmpty(receiverTillNo)) {
            int i6 = component3 + 31;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            paymentRequest.addParams("receiverTillNo", receiverTillNo);
            int i8 = getAsAtTimestamp + 83;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 % 3;
            }
        }
        paymentRequest.addParams("receiverMsisdn", "000000");
        sendRequest(paymentRequest, new ApiCallback<VerifyNumberResp>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i10 = 2 % 2;
                int i11 = component2 + 27;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                onSuccess2(verifyNumberResp);
                int i13 = component2 + 61;
                component1 = i13 % 128;
                if (i13 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(VerifyNumberResp value) {
                int i10 = 2 % 2;
                VerifyOrganizationViewModel.access$getVerifyData$p(this).setValue(Resource.success(new VerifyNumberRespWrapper(value, businessType)));
                int i11 = component2 + 33;
                component1 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i10 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                Object obj = null;
                VerifyOrganizationViewModel.access$getVerifyData$p(this).setValue(Resource.error(e, new VerifyNumberRespWrapper(null, businessType)));
                int i11 = component1 + 1;
                component2 = i11 % 128;
                if (i11 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
    }

    public final void verifyAccountNumber(String shortcode, String accountNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shortcode, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        this.copydefault.setValue(Resource.loading(null));
        VerifyAccountPayload verifyAccountPayload = new VerifyAccountPayload(new VerifyAccountHeader(UUID.randomUUID() + "-1", String.valueOf(System.currentTimeMillis() / ((long) 1000)), "OneApp"), new VerifyAccountBody(shortcode, accountNumber));
        HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 15;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 65;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return GsmEndpoints.C2B_HAKIKISHA;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams(verifyAccountPayload);
        haProxyRequest.method(BaseRequest.Method.POST);
        sendRequest(haProxyRequest, new ApiCallback<Object>() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.VerifyOrganizationViewModel.C09361.onSuccess(java.lang.Object):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                VerifyOrganizationViewModel.access$getAccountNameData$p(VerifyOrganizationViewModel.this).postValue(Resource.error(e, null));
                int i5 = component3 + 85;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 61 % 2;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountPayload;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountHeader;Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountBody;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VerifyAccountPayload implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VerifyAccountPayload> CREATOR = new Creator();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        @SerializedName("body")
        private final VerifyAccountBody body;

        @SerializedName("header")
        private final VerifyAccountHeader header;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifyAccountPayload> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountPayload createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                VerifyAccountPayload verifyAccountPayload = new VerifyAccountPayload(VerifyAccountHeader.CREATOR.createFromParcel(parcel), VerifyAccountBody.CREATOR.createFromParcel(parcel));
                int i2 = component3 + 71;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return verifyAccountPayload;
                }
                throw null;
            }

            @Override
            public VerifyAccountPayload createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 115;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                VerifyAccountPayload verifyAccountPayloadCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 33;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return verifyAccountPayloadCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountPayload[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                VerifyAccountPayload[] verifyAccountPayloadArr = new VerifyAccountPayload[i];
                int i6 = i3 + 123;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return verifyAccountPayloadArr;
            }

            @Override
            public VerifyAccountPayload[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                VerifyAccountPayload[] verifyAccountPayloadArrNewArray = newArray(i);
                int i5 = component3 + 51;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return verifyAccountPayloadArrNewArray;
            }
        }

        public VerifyAccountPayload(VerifyAccountHeader verifyAccountHeader, VerifyAccountBody verifyAccountBody) {
            Intrinsics.checkNotNullParameter(verifyAccountHeader, "");
            Intrinsics.checkNotNullParameter(verifyAccountBody, "");
            this.header = verifyAccountHeader;
            this.body = verifyAccountBody;
        }

        public final VerifyAccountHeader getHeader() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 77;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            VerifyAccountHeader verifyAccountHeader = this.header;
            int i5 = i2 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return verifyAccountHeader;
        }

        public final VerifyAccountBody getBody() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 45;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            VerifyAccountBody verifyAccountBody = this.body;
            int i5 = i2 + 101;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return verifyAccountBody;
        }

        static {
            int i = component2 + 27;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static VerifyAccountPayload copy$default(VerifyAccountPayload verifyAccountPayload, VerifyAccountHeader verifyAccountHeader, VerifyAccountBody verifyAccountBody, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 121;
            component3 = i4 % 128;
            if (i4 % 2 != 0 && (i & 1) != 0) {
                verifyAccountHeader = verifyAccountPayload.header;
            }
            if ((i & 2) != 0) {
                int i5 = i3 + 71;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                verifyAccountBody = verifyAccountPayload.body;
            }
            return verifyAccountPayload.copy(verifyAccountHeader, verifyAccountBody);
        }

        public final VerifyAccountHeader component1() {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            VerifyAccountHeader verifyAccountHeader = this.header;
            int i5 = i3 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return verifyAccountHeader;
        }

        public final VerifyAccountBody component2() {
            int i = 2 % 2;
            int i2 = component3 + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            VerifyAccountBody verifyAccountBody = this.body;
            if (i3 != 0) {
                int i4 = 59 / 0;
            }
            return verifyAccountBody;
        }

        public final VerifyAccountPayload copy(VerifyAccountHeader header, VerifyAccountBody body) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(header, "");
            Intrinsics.checkNotNullParameter(body, "");
            VerifyAccountPayload verifyAccountPayload = new VerifyAccountPayload(header, body);
            int i2 = component3 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return verifyAccountPayload;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 119;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 123;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 43;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyAccountPayload)) {
                return false;
            }
            VerifyAccountPayload verifyAccountPayload = (VerifyAccountPayload) other;
            if (!(!Intrinsics.areEqual(this.header, verifyAccountPayload.header))) {
                return Intrinsics.areEqual(this.body, verifyAccountPayload.body);
            }
            int i3 = copydefault + 97;
            int i4 = i3 % 128;
            component3 = i4;
            boolean z = !(i3 % 2 != 0);
            int i5 = i4 + 29;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 21;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.header.hashCode() * 31) + this.body.hashCode();
            int i4 = copydefault + 41;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VerifyAccountPayload(header=" + this.header + ", body=" + this.body + ")";
            int i2 = copydefault + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            VerifyAccountHeader verifyAccountHeader = this.header;
            if (i3 == 0) {
                verifyAccountHeader.writeToParcel(dest, flags);
                this.body.writeToParcel(dest, flags);
            } else {
                verifyAccountHeader.writeToParcel(dest, flags);
                this.body.writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountHeader;", "Landroid/os/Parcelable;", "requestId", "", "timestamp", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getTimestamp", "getChannel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VerifyAccountHeader implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VerifyAccountHeader> CREATOR = new Creator();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        @SerializedName("channel")
        private final String channel;

        @SerializedName("requestId")
        private final String requestId;

        @SerializedName("timestamp")
        private final String timestamp;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifyAccountHeader> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountHeader createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                VerifyAccountHeader verifyAccountHeader = new VerifyAccountHeader(parcel.readString(), parcel.readString(), parcel.readString());
                int i2 = component3 + 29;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return verifyAccountHeader;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public VerifyAccountHeader createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 11;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                VerifyAccountHeader verifyAccountHeaderCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 27 / 0;
                }
                return verifyAccountHeaderCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountHeader[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 77;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                VerifyAccountHeader[] verifyAccountHeaderArr = new VerifyAccountHeader[i];
                int i6 = i3 + 1;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 16 / 0;
                }
                return verifyAccountHeaderArr;
            }

            @Override
            public VerifyAccountHeader[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                VerifyAccountHeader[] verifyAccountHeaderArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 31 / 0;
                }
                int i6 = copydefault + 19;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return verifyAccountHeaderArrNewArray;
            }
        }

        public VerifyAccountHeader(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.requestId = str;
            this.timestamp = str2;
            this.channel = str3;
        }

        public final String getRequestId() {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.requestId;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getTimestamp() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 49;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.timestamp;
            int i4 = i2 + 103;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String getChannel() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 13;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.channel;
            int i5 = i2 + 29;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 39 / 0;
            }
            return str;
        }

        static {
            int i = component1 + 15;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static VerifyAccountHeader copy$default(VerifyAccountHeader verifyAccountHeader, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 81;
            component2 = i4 % 128;
            if (i4 % 2 == 0 && (i & 1) != 0) {
                str = verifyAccountHeader.requestId;
            }
            if ((i & 2) != 0) {
                int i5 = i3 + 5;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    String str4 = verifyAccountHeader.timestamp;
                    throw null;
                }
                str2 = verifyAccountHeader.timestamp;
            }
            if ((i & 4) != 0) {
                int i6 = component2 + 65;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    str3 = verifyAccountHeader.channel;
                    int i7 = 31 / 0;
                } else {
                    str3 = verifyAccountHeader.channel;
                }
            }
            return verifyAccountHeader.copy(str, str2, str3);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 111;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.requestId;
            int i5 = i2 + 61;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2 + 109;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.timestamp;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.channel;
            int i5 = i3 + 93;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 83 / 0;
            }
            return str;
        }

        public final VerifyAccountHeader copy(String requestId, String timestamp, String channel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(requestId, "");
            Intrinsics.checkNotNullParameter(timestamp, "");
            Intrinsics.checkNotNullParameter(channel, "");
            VerifyAccountHeader verifyAccountHeader = new VerifyAccountHeader(requestId, timestamp, channel);
            int i2 = component2 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return verifyAccountHeader;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 69;
            component2 = i3 % 128;
            int i4 = i3 % 2 != 0 ? 1 : 0;
            int i5 = i2 + 93;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 89;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyAccountHeader)) {
                int i4 = i2 + 3;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            VerifyAccountHeader verifyAccountHeader = (VerifyAccountHeader) other;
            if (!Intrinsics.areEqual(this.requestId, verifyAccountHeader.requestId)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.timestamp, verifyAccountHeader.timestamp)) {
                int i6 = component2 + 59;
                copydefault = i6 % 128;
                return i6 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.channel, verifyAccountHeader.channel)) {
                int i7 = component2 + 105;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = copydefault + 5;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((this.requestId.hashCode() * 31) + this.timestamp.hashCode()) * 31) + this.channel.hashCode();
            int i4 = copydefault + 33;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VerifyAccountHeader(requestId=" + this.requestId + ", timestamp=" + this.timestamp + ", channel=" + this.channel + ")";
            int i2 = component2 + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.requestId);
            dest.writeString(this.timestamp);
            dest.writeString(this.channel);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/VerifyOrganizationViewModel$VerifyAccountBody;", "Landroid/os/Parcelable;", "shortcode", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getShortcode", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VerifyAccountBody implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VerifyAccountBody> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;

        @SerializedName("accountNumber")
        private final String accountNumber;

        @SerializedName("shortcode")
        private final String shortcode;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifyAccountBody> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountBody createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                VerifyAccountBody verifyAccountBody = new VerifyAccountBody(parcel.readString(), parcel.readString());
                int i2 = ShareDataUIState + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return verifyAccountBody;
            }

            @Override
            public VerifyAccountBody createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                VerifyAccountBody verifyAccountBodyCreateFromParcel = createFromParcel(parcel);
                int i3 = ShareDataUIState + 35;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 84 / 0;
                }
                return verifyAccountBodyCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final VerifyAccountBody[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 19;
                copydefault = i4 % 128;
                VerifyAccountBody[] verifyAccountBodyArr = new VerifyAccountBody[i];
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 125;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 12 / 0;
                }
                return verifyAccountBodyArr;
            }

            @Override
            public VerifyAccountBody[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                VerifyAccountBody[] verifyAccountBodyArrNewArray = newArray(i);
                int i5 = copydefault + 103;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return verifyAccountBodyArrNewArray;
            }

            public static void component1() {
                ResultReceiver.component3[0] = IResultReceiver2_Parcel.component3[0];
            }
        }

        public VerifyAccountBody(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.shortcode = str;
            this.accountNumber = str2;
        }

        public final String getShortcode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.shortcode;
            int i4 = i3 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String getAccountNumber() {
            int i = 2 % 2;
            int i2 = component2 + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.accountNumber;
            if (i3 != 0) {
                int i4 = 61 / 0;
            }
            return str;
        }

        static {
            int i = component1 + 71;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static VerifyAccountBody copy$default(VerifyAccountBody verifyAccountBody, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 123;
            component2 = i4 % 128;
            if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i5 = i3 + 37;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                str = verifyAccountBody.shortcode;
            }
            if ((i & 2) != 0) {
                int i7 = i3 + 79;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                str2 = verifyAccountBody.accountNumber;
            }
            return verifyAccountBody.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 69;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.shortcode;
            int i5 = i2 + 109;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.accountNumber;
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            return str;
        }

        public final VerifyAccountBody copy(String shortcode, String accountNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(shortcode, "");
            Intrinsics.checkNotNullParameter(accountNumber, "");
            VerifyAccountBody verifyAccountBody = new VerifyAccountBody(shortcode, accountNumber);
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return verifyAccountBody;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerifyAccountBody)) {
                int i2 = component2 + 75;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            VerifyAccountBody verifyAccountBody = (VerifyAccountBody) other;
            if (Intrinsics.areEqual(this.shortcode, verifyAccountBody.shortcode)) {
                return Intrinsics.areEqual(this.accountNumber, verifyAccountBody.accountNumber);
            }
            int i4 = component2 + 87;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            component2 = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (this.shortcode.hashCode() >> 46) * this.accountNumber.hashCode() : (this.shortcode.hashCode() * 31) + this.accountNumber.hashCode();
            int i3 = ShareDataUIState + 73;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 93 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "VerifyAccountBody(shortcode=" + this.shortcode + ", accountNumber=" + this.accountNumber + ")";
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            String str = this.shortcode;
            if (i3 == 0) {
                dest.writeString(str);
                dest.writeString(this.accountNumber);
            } else {
                dest.writeString(str);
                dest.writeString(this.accountNumber);
                throw null;
            }
        }
    }
}
