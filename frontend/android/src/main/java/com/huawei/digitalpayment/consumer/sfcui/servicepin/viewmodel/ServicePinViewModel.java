package com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.permission.PermissionConstant;
import com.alibaba.griver.lottie.value.LottieRelativeFloatValueCallback;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.navigation.ServicePinScreen;
import com.huawei.http.BaseRequest;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u00020/H\u0002J\u0006\u00107\u001a\u00020/J\u000e\u0010\u000b\u001a\u0002032\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u000203J\u0006\u0010\u0013\u001a\u000203J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0;2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020>H\u0002J*\u0010?\u001a\u0002032\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0;2\u0012\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002J\u0016\u0010B\u001a\u0002032\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u0006\u0010D\u001a\u000203J\u0006\u0010E\u001a\u000203J\u0006\u0010F\u001a\u000203J\u0012\u0010G\u001a\u0002032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0006J\b\u0010I\u001a\u000203H\u0002J\u0006\u0010J\u001a\u000203J\u0006\u0010K\u001a\u000203J\u0010\u0010L\u001a\u0002032\b\u0010M\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0019\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0019\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006O"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/viewmodel/ServicePinViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "msisdn", "", "_validateServicePin", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "", "validateServicePin", "Landroidx/lifecycle/LiveData;", "getValidateServicePin", "()Landroidx/lifecycle/LiveData;", "_servicePinStatus", "servicePinStatus", "getServicePinStatus", "_changeServicePin", "changeServicePin", "getChangeServicePin", "_screenTransition", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "screenTransition", "getScreenTransition", "value", "pinStatusKey", "getPinStatusKey", "()Ljava/lang/String;", "errorMessage", "getErrorMessage", CheckIdentityActivity.ID_NUMBER, "getIdNumber", "()Landroidx/lifecycle/MutableLiveData;", "newPin", "getNewPin", "confirmNewPin", "getConfirmNewPin", "idNumberError", "getIdNumberError", "newPinError", "getNewPinError", "confirmNewPinError", "getConfirmNewPinError", "areAllFieldsValid", "Landroidx/lifecycle/MediatorLiveData;", "", "getAreAllFieldsValid", "()Landroidx/lifecycle/MediatorLiveData;", "validateIdNumberLive", "", "validateNewPinLive", "validateConfirmNewPinLive", "validatePinSimilarity", "validatePinEntries", "pin", "checkServicePinStatus", "createRequest", "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "endpoint", "method", "Lcom/huawei/http/BaseRequest$Method;", "executeRequest", PermissionConstant.ACTION_REQUEST, "liveData", "setScreen", "screenInformation", "previousScreen", "showConfirmation", "showSuccess", "showError", "message", "showDetailEntry", "showChangePinLoading", "finish", "handleStatusResponse", "nullableData", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServicePinViewModel extends ViewModel implements BaseModel {
    public static final String PIN_NOT_SET = "PIN not set";
    public static final String PIN_SET = "Success";

    private static int f2776b = 1;
    private static int coroutineBoundary = 1;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private static int invoke;
    private final MutableLiveData<Object> ArtificialStackFrames;
    private final LiveData<ScreenInformation<ServicePinScreen>> CoroutineDebuggingKt;
    private final MutableLiveData<ScreenInformation<ServicePinScreen>> ShareDataUIState;
    private final LiveData<Resource<Object>> accessartificialFrame;
    private final MutableLiveData<Resource<Object>> component1;
    private final MutableLiveData<Resource<Object>> component2;
    private final MediatorLiveData<Boolean> component3;
    private final MutableLiveData<String> component4;
    private final MutableLiveData<Object> copy;
    private final MutableLiveData<Resource<Object>> copydefault;
    private final LiveData<Resource<Object>> coroutineCreation;
    private String equals;
    private final LiveData<Resource<Object>> getAsAtTimestamp;
    private final MutableLiveData<String> getRequestBeneficiariesState;
    private String getShareableDataState;
    private final MutableLiveData<String> getSponsorBeneficiariesState;
    private final String hashCode;
    private final MutableLiveData<Object> toString;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int copydefault = 1;
        private final Function1 component3;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.component1
                int r1 = r1 + 53
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.copydefault = r2
                int r1 = r1 % r0
                boolean r1 = r6 instanceof androidx.lifecycle.Observer
                r3 = 0
                if (r1 == 0) goto L3a
                int r2 = r2 + 47
                int r1 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.component1 = r1
                int r2 = r2 % r0
                r1 = 1
                if (r2 == 0) goto L24
                boolean r2 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                r4 = 11
                int r4 = r4 / r3
                r1 = r1 ^ r2
                if (r1 == 0) goto L29
                goto L3a
            L24:
                boolean r2 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r2 == r1) goto L29
                goto L3a
            L29:
                r1 = r5
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r6 = (kotlin.jvm.internal.FunctionAdapter) r6
                kotlin.Function r6 = r6.getFunctionDelegate()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            L3a:
                int r6 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.copydefault
                int r6 = r6 + 71
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.component1 = r1
                int r6 = r6 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.ShareDataUIState.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 61;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 67;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = copydefault + 83;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 59;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public static Object component3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i4) | i7)) | i9;
        int i11 = (~(i4 | i7)) | i9;
        int i12 = ~(i8 | i6);
        int i13 = i6 + i3 + i + (104229478 * i5) + ((-1414784667) * i2);
        int i14 = i13 * i13;
        int i15 = ((i6 * (-393484327)) - 513802240) + ((-393484327) * i3) + (i10 * 23337000) + (i11 * 23337000) + (23337000 * i12) + ((-370147328) * i) + ((-1784676352) * i5) + ((-1146093568) * i2) + ((-1043988480) * i14);
        int i16 = ((i6 * 256725217) - 1927268364) + (i3 * 256725217) + (i10 * 872) + (i11 * 872) + (i12 * 872) + (i * 256726089) + (i5 * (-1692676330)) + (i2 * (-87465523)) + (i14 * 964034560);
        return i15 + ((i16 * i16) * (-1055260672)) != 1 ? component3(objArr) : component1(objArr);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/viewmodel/ServicePinViewModel$Companion;", "", "<init>", "()V", "PIN_NOT_SET", "", "PIN_SET", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Inject
    public ServicePinViewModel() {
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.hashCode = "254" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
        MutableLiveData<Resource<Object>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.coroutineCreation = mutableLiveData;
        MutableLiveData<Resource<Object>> mutableLiveData2 = new MutableLiveData<>();
        this.component1 = mutableLiveData2;
        this.accessartificialFrame = mutableLiveData2;
        MutableLiveData<Resource<Object>> mutableLiveData3 = new MutableLiveData<>();
        this.component2 = mutableLiveData3;
        this.getAsAtTimestamp = mutableLiveData3;
        MutableLiveData<ScreenInformation<ServicePinScreen>> mutableLiveData4 = new MutableLiveData<>();
        this.ShareDataUIState = mutableLiveData4;
        this.CoroutineDebuggingKt = mutableLiveData4;
        this.getShareableDataState = "";
        MutableLiveData<String> mutableLiveData5 = new MutableLiveData<>();
        this.component4 = mutableLiveData5;
        MutableLiveData<String> mutableLiveData6 = new MutableLiveData<>();
        this.getSponsorBeneficiariesState = mutableLiveData6;
        MutableLiveData<String> mutableLiveData7 = new MutableLiveData<>();
        this.getRequestBeneficiariesState = mutableLiveData7;
        MutableLiveData<Object> mutableLiveData8 = new MutableLiveData<>();
        this.toString = mutableLiveData8;
        MutableLiveData<Object> mutableLiveData9 = new MutableLiveData<>();
        this.ArtificialStackFrames = mutableLiveData9;
        MutableLiveData<Object> mutableLiveData10 = new MutableLiveData<>();
        this.copy = mutableLiveData10;
        MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        this.component3 = mediatorLiveData;
        mutableLiveData5.observeForever(new ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitM11923$r8$lambda$5AOzM2z2VOQ8TA3abeJnR7JaaI = ServicePinViewModel.m11923$r8$lambda$5AOzM2z2VOQ8TA3abeJnR7JaaI(this.f$0, (String) obj);
                int i4 = component2 + 3;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitM11923$r8$lambda$5AOzM2z2VOQ8TA3abeJnR7JaaI;
            }
        }));
        mutableLiveData6.observeForever(new ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unit$r8$lambda$mjIqwD1lGzKeeWREyxhDuLUznfs = ServicePinViewModel.$r8$lambda$mjIqwD1lGzKeeWREyxhDuLUznfs(this.f$0, (String) obj);
                int i4 = ShareDataUIState + 57;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit$r8$lambda$mjIqwD1lGzKeeWREyxhDuLUznfs;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        mutableLiveData7.observeForever(new ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 61;
                component3 = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    ServicePinViewModel.$r8$lambda$L5U4ayJuDbQApUjg5LdYgFsZPlo(this.f$0, (String) obj);
                    throw null;
                }
                Unit unit$r8$lambda$L5U4ayJuDbQApUjg5LdYgFsZPlo = ServicePinViewModel.$r8$lambda$L5U4ayJuDbQApUjg5LdYgFsZPlo(this.f$0, (String) obj);
                int i3 = component3 + 55;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit$r8$lambda$L5U4ayJuDbQApUjg5LdYgFsZPlo;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        mediatorLiveData.setValue(false);
        Function0 function0 = new Function0() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 11;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit$r8$lambda$ok2SEHrtabK_33Ri6cBYoQW0Na8 = ServicePinViewModel.$r8$lambda$ok2SEHrtabK_33Ri6cBYoQW0Na8(this.f$0);
                int i4 = ShareDataUIState + 73;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit$r8$lambda$ok2SEHrtabK_33Ri6cBYoQW0Na8;
            }
        };
        Iterator it = CollectionsKt.listOf((Object[]) new MutableLiveData[]{mutableLiveData5, mutableLiveData6, mutableLiveData7, mutableLiveData8, mutableLiveData9, mutableLiveData10}).iterator();
        while (it.hasNext()) {
            this.component3.addSource((MutableLiveData) it.next(), new ShareDataUIState(new copydefault(function0)));
            int i = coroutineBoundary + 65;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        copydefault(new ScreenInformation<>(ServicePinScreen.CheckStatus.INSTANCE, ScreenDirection.NONE));
        int i3 = coroutineBoundary + 109;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
    }

    public final LiveData<Resource<Object>> getValidateServicePin() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 111;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        LiveData<Resource<Object>> liveData = this.coroutineCreation;
        int i5 = i2 + 123;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final LiveData<Resource<Object>> getServicePinStatus() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 77;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        LiveData<Resource<Object>> liveData = this.accessartificialFrame;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return liveData;
    }

    public final LiveData<Resource<Object>> getChangeServicePin() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        LiveData<Resource<Object>> liveData = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return liveData;
    }

    public final LiveData<ScreenInformation<ServicePinScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.CoroutineDebuggingKt;
        }
        throw null;
    }

    public final String getPinStatusKey() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 21;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 7;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 49;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 39;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MutableLiveData<String> getIdNumber() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 73;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        MutableLiveData<String> mutableLiveData = this.component4;
        int i5 = i3 + 83;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<String> getNewPin() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 117;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<String> mutableLiveData = this.getSponsorBeneficiariesState;
        int i4 = i2 + 49;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return mutableLiveData;
    }

    public final MutableLiveData<String> getConfirmNewPin() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 75;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<String> mutableLiveData = this.getRequestBeneficiariesState;
        int i4 = i2 + 93;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Object> getIdNumberError() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 97;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        MutableLiveData<Object> mutableLiveData = this.toString;
        int i5 = i3 + 29;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Object> getNewPinError() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 29;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Object> mutableLiveData = this.ArtificialStackFrames;
        int i5 = i2 + 63;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MutableLiveData<Object> getConfirmNewPinError() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 55;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        MutableLiveData<Object> mutableLiveData = this.copy;
        int i5 = i3 + 123;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final MediatorLiveData<Boolean> getAreAllFieldsValid() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 3;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    private static final Unit component1(ServicePinViewModel servicePinViewModel, String str) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 91;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(servicePinViewModel, "");
            servicePinViewModel.component2();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(servicePinViewModel, "");
        servicePinViewModel.component2();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit ShareDataUIState(ServicePinViewModel servicePinViewModel, String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(servicePinViewModel, "");
            int iComponent1 = LottieRelativeFloatValueCallback.component1();
            component3(LottieRelativeFloatValueCallback.component1(), new Object[]{servicePinViewModel}, LottieRelativeFloatValueCallback.component1(), -320610750, iComponent1, LottieRelativeFloatValueCallback.component1(), 320610751);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(servicePinViewModel, "");
        int iComponent12 = LottieRelativeFloatValueCallback.component1();
        component3(LottieRelativeFloatValueCallback.component1(), new Object[]{servicePinViewModel}, LottieRelativeFloatValueCallback.component1(), -320610750, iComponent12, LottieRelativeFloatValueCallback.component1(), 320610751);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static Object component3(Object[] objArr) {
        ServicePinViewModel servicePinViewModel = (ServicePinViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 51;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(servicePinViewModel, "");
        servicePinViewModel.component1();
        Unit unit = Unit.INSTANCE;
        int i4 = coroutineBoundary + 59;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit copydefault(com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel r8) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.copydefault(com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel):kotlin.Unit");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function1 {
        private static int component2 = 1;
        private static int copydefault;
        final Function0<Unit> component1;

        public final void component3(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke();
            if (i3 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component3(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        copydefault(Function0<Unit> function0) {
            this.component1 = function0;
        }
    }

    private final void component2() {
        Integer numValueOf;
        int i = 2 % 2;
        MutableLiveData<Object> mutableLiveData = this.toString;
        String value = this.component4.getValue();
        if (value != null) {
            int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
            coroutineBoundary = i2 % 128;
            numValueOf = null;
            if (i2 % 2 == 0) {
                value.length();
                throw null;
            }
            if (value.length() == 0) {
                int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
                coroutineBoundary = i3 % 128;
                int i4 = i3 % 2;
                numValueOf = Integer.valueOf(R.string.please_enter_service_pin);
            } else {
                String value2 = this.component4.getValue();
                Intrinsics.checkNotNull(value2);
                if (value2.length() > 10) {
                    int i5 = coroutineBoundary + 25;
                    getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
                    if (i5 % 2 != 0) {
                        Integer.valueOf(R.string.please_enter_service_pin);
                        numValueOf.hashCode();
                        throw null;
                    }
                    numValueOf = Integer.valueOf(R.string.please_enter_service_pin);
                }
            }
        } else {
            numValueOf = Integer.valueOf(R.string.please_enter_service_pin);
        }
        mutableLiveData.setValue(numValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object component1(java.lang.Object[] r7) {
        /*
            r0 = 0
            r7 = r7[r0]
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel r7 = (com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel) r7
            r1 = 2
            int r2 = r1 % r1
            androidx.lifecycle.MutableLiveData<java.lang.Object> r2 = r7.ArtificialStackFrames
            androidx.lifecycle.MutableLiveData<java.lang.String> r3 = r7.getSponsorBeneficiariesState
            java.lang.Object r3 = r3.getValue()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            if (r3 == 0) goto L55
            int r5 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r5 = r5 + 113
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.coroutineBoundary = r6
            int r5 = r5 % r1
            int r3 = r3.length()
            if (r3 != 0) goto L25
            goto L55
        L25:
            androidx.lifecycle.MutableLiveData<java.lang.String> r7 = r7.getSponsorBeneficiariesState
            java.lang.Object r7 = r7.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.length()
            r3 = 4
            if (r7 >= r3) goto L53
            int r7 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.coroutineBoundary
            int r7 = r7 + 43
            int r3 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r3
            int r7 = r7 % r1
            if (r7 == 0) goto L4c
            int r7 = com.huawei.digitalpayment.consumer.sfc.R.string.please_enter_new_pin_length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1 = 57
            int r1 = r1 / r0
            goto L5b
        L4c:
            int r7 = com.huawei.digitalpayment.consumer.sfc.R.string.please_enter_new_pin_length
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L5b
        L53:
            r7 = r4
            goto L5b
        L55:
            int r7 = com.huawei.digitalpayment.consumer.sfc.R.string.please_enter_new_pin
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L5b:
            r2.setValue(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.component1(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component1() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.lifecycle.MutableLiveData<java.lang.Object> r1 = r5.copy
            androidx.lifecycle.MutableLiveData<java.lang.String> r2 = r5.getRequestBeneficiariesState
            java.lang.Object r2 = r2.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L45
            int r3 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r3 = r3 + 13
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.coroutineBoundary = r4
            int r3 = r3 % r0
            int r2 = r2.length()
            if (r2 != 0) goto L1f
            goto L45
        L1f:
            androidx.lifecycle.MutableLiveData<java.lang.String> r2 = r5.getSponsorBeneficiariesState
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.MutableLiveData<java.lang.String> r3 = r5.getRequestBeneficiariesState
            java.lang.Object r3 = r3.getValue()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L3a
            int r2 = com.huawei.digitalpayment.consumer.sfc.R.string.please_confirm_similar_pin
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L4b
        L3a:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r2 = r2 + 49
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.coroutineBoundary = r3
            int r2 = r2 % r0
            r2 = 0
            goto L4b
        L45:
            int r2 = com.huawei.digitalpayment.consumer.sfc.R.string.please_confirm_new_pin
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L4b:
            r1.setValue(r2)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.coroutineBoundary = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel.component1():void");
    }

    private final boolean component3() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 71;
        coroutineBoundary = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String value = this.getSponsorBeneficiariesState.getValue();
            if (value != null) {
                if (value.length() == 0) {
                    int i3 = coroutineBoundary + 69;
                    getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    String value2 = this.getRequestBeneficiariesState.getValue();
                    if (value2 != null && value2.length() != 0 && !Intrinsics.areEqual(this.getSponsorBeneficiariesState.getValue(), this.getRequestBeneficiariesState.getValue())) {
                        this.copy.setValue(Integer.valueOf(R.string.please_confirm_similar_pin));
                        int i5 = getARTIFICIAL_FRAME_PACKAGE_NAME + 65;
                        coroutineBoundary = i5 % 128;
                        int i6 = i5 % 2;
                        return false;
                    }
                }
            }
            this.copy.setValue(null);
            return true;
        }
        this.getSponsorBeneficiariesState.getValue();
        obj.hashCode();
        throw null;
    }

    public final boolean validatePinEntries() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 103;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        if (component3() && this.toString.getValue() == null) {
            int i4 = coroutineBoundary + 19;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
            int i5 = i4 % 2;
            if (this.ArtificialStackFrames.getValue() == null) {
                int i6 = getARTIFICIAL_FRAME_PACKAGE_NAME + 123;
                coroutineBoundary = i6 % 128;
                int i7 = i6 % 2;
                if (this.copy.getValue() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void validateServicePin(String pin) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 45;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pin, "");
            HaProxyRequest<Object> haProxyRequestComponent3 = component3(GsmEndpoints.VALIDATE_SERVICE_PIN, BaseRequest.Method.POST);
            haProxyRequestComponent3.addParams("msisdn", this.hashCode);
            haProxyRequestComponent3.addParams("pin", pin);
            copydefault(haProxyRequestComponent3, this.copydefault);
            return;
        }
        Intrinsics.checkNotNullParameter(pin, "");
        HaProxyRequest<Object> haProxyRequestComponent32 = component3(GsmEndpoints.VALIDATE_SERVICE_PIN, BaseRequest.Method.POST);
        haProxyRequestComponent32.addParams("msisdn", this.hashCode);
        haProxyRequestComponent32.addParams("pin", pin);
        copydefault(haProxyRequestComponent32, this.copydefault);
        int i3 = 28 / 0;
    }

    public final void checkServicePinStatus() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        copydefault(component3(GsmEndpoints.CHECK_SERVICE_PIN_STATUS, BaseRequest.Method.GET), this.component1);
        int i4 = coroutineBoundary + 69;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void changeServicePin() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 87;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        HaProxyRequest<Object> haProxyRequestComponent3 = component3(GsmEndpoints.CHANGE_SERVICE_PIN, BaseRequest.Method.POST);
        haProxyRequestComponent3.addParams("msisdn", this.hashCode);
        haProxyRequestComponent3.addParams("pin", this.getSponsorBeneficiariesState.getValue());
        haProxyRequestComponent3.addParams(CheckIdentityActivity.ID_NUMBER, this.component4.getValue());
        copydefault(haProxyRequestComponent3, this.component2);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    private final HaProxyRequest<Object> component3(final String str, BaseRequest.Method method) {
        int i = 2 % 2;
        HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 69;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                String str2 = str;
                int i6 = i3 + 13;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return str2;
            }
        };
        HaProxyRequest<Object> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.method(method);
        int i2 = coroutineBoundary + 23;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return haProxyRequest2;
        }
        throw null;
    }

    private final void copydefault(HaProxyRequest<Object> haProxyRequest, final MutableLiveData<Resource<Object>> mutableLiveData) {
        int i = 2 % 2;
        mutableLiveData.setValue(Resource.loading(null));
        sendRequest(haProxyRequest, new ApiCallback<Object>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Object value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 35;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData<Resource<Object>> mutableLiveData2 = mutableLiveData;
                Resource<Object> resourceSuccess = Resource.success(value);
                if (i4 != 0) {
                    mutableLiveData2.setValue(resourceSuccess);
                } else {
                    mutableLiveData2.setValue(resourceSuccess);
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    mutableLiveData.setValue(Resource.error(e, null));
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                mutableLiveData.setValue(Resource.error(e, null));
                int i4 = copydefault + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 11;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void copydefault(ScreenInformation<ServicePinScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 19;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.setValue(screenInformation);
        int i4 = coroutineBoundary + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void previousScreen() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 87;
        coroutineBoundary = i2 % 128;
        ServicePinScreen screen = null;
        if (i2 % 2 != 0) {
            ScreenInformation<ServicePinScreen> value = this.ShareDataUIState.getValue();
            if (value != null) {
                screen = value.getScreen();
                int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 57;
                coroutineBoundary = i3 % 128;
                int i4 = i3 % 2;
            }
            copydefault(new ScreenInformation<>(Intrinsics.areEqual(screen, ServicePinScreen.Confirmation.INSTANCE) ? ServicePinScreen.EnterDetails.INSTANCE : ServicePinScreen.Close.INSTANCE, ScreenDirection.BACK));
            return;
        }
        this.ShareDataUIState.getValue();
        throw null;
    }

    public final void showConfirmation() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(ServicePinScreen.Confirmation.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 53;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void showSuccess() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(ServicePinScreen.Success.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 81;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void showError$default(ServicePinViewModel servicePinViewModel, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 29;
        int i4 = i3 % 128;
        coroutineBoundary = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 111;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 0;
            }
            str = null;
        }
        servicePinViewModel.showError(str);
    }

    public final void showError(String message) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 95;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (message != null) {
            this.equals = message;
            int i4 = i2 + 49;
            coroutineBoundary = i4 % 128;
            int i5 = i4 % 2;
        }
        copydefault(new ScreenInformation<>(ServicePinScreen.Error.INSTANCE, ScreenDirection.FORWARD));
    }

    private final void copydefault() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(ServicePinScreen.EnterDetails.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 59;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void showChangePinLoading() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(ServicePinScreen.ChangePin.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 61;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void finish() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(ServicePinScreen.Close.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 55;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void handleStatusResponse(Object nullableData) {
        Map map;
        String str;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 111;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (nullableData == null) {
            showError$default(this, null, 1, null);
            return;
        }
        Map map2 = !(nullableData instanceof Map) ? null : (Map) nullableData;
        if (map2 == null) {
            showError$default(this, null, 1, null);
            return;
        }
        Object obj2 = map2.get("header");
        if (obj2 == null) {
            showError$default(this, null, 1, null);
            return;
        }
        if (obj2 instanceof Map) {
            map = (Map) obj2;
            int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 97;
            coroutineBoundary = i3 % 128;
            int i4 = i3 % 2;
        } else {
            map = null;
        }
        if (map == null) {
            showError$default(this, null, 1, null);
            return;
        }
        Object obj3 = map.get("responseMessage");
        if (obj3 == null) {
            showError$default(this, null, 1, null);
            return;
        }
        if (obj3 instanceof String) {
            int i5 = coroutineBoundary + 53;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = (String) obj3;
        } else {
            int i6 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        if (str == null) {
            showError$default(this, null, 1, null);
            return;
        }
        String str2 = str;
        if (!(true ^ StringsKt.contains$default((CharSequence) str2, (CharSequence) PIN_NOT_SET, false, 2, (Object) null))) {
            this.getShareableDataState = PIN_NOT_SET;
        } else if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "Success", false, 2, (Object) null)) {
            this.getShareableDataState = "Success";
        }
        copydefault();
    }

    public static Unit m11923$r8$lambda$5AOzM2z2VOQ8TA3abeJnR7JaaI(ServicePinViewModel servicePinViewModel, String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 67;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            component1(servicePinViewModel, str);
            throw null;
        }
        Unit unitComponent1 = component1(servicePinViewModel, str);
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 95;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 != 0) {
            return unitComponent1;
        }
        throw null;
    }

    public static Unit $r8$lambda$L5U4ayJuDbQApUjg5LdYgFsZPlo(ServicePinViewModel servicePinViewModel, String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 109;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            int iComponent1 = LottieRelativeFloatValueCallback.component1();
            return (Unit) component3(LottieRelativeFloatValueCallback.component1(), new Object[]{servicePinViewModel, str}, LottieRelativeFloatValueCallback.component1(), 1934928949, iComponent1, LottieRelativeFloatValueCallback.component1(), -1934928949);
        }
        int iComponent12 = LottieRelativeFloatValueCallback.component1();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$mjIqwD1lGzKeeWREyxhDuLUznfs(ServicePinViewModel servicePinViewModel, String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(servicePinViewModel, str);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 105;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            return unitShareDataUIState;
        }
        throw null;
    }

    public static Unit $r8$lambda$ok2SEHrtabK_33Ri6cBYoQW0Na8(ServicePinViewModel servicePinViewModel) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 75;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            copydefault(servicePinViewModel);
            throw null;
        }
        Unit unitCopydefault = copydefault(servicePinViewModel);
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 13;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 != 0) {
            return unitCopydefault;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = f2776b + 57;
        invoke = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit component2(ServicePinViewModel servicePinViewModel, String str) {
        int iComponent1 = LottieRelativeFloatValueCallback.component1();
        return (Unit) component3(LottieRelativeFloatValueCallback.component1(), new Object[]{servicePinViewModel, str}, LottieRelativeFloatValueCallback.component1(), 1934928949, iComponent1, LottieRelativeFloatValueCallback.component1(), -1934928949);
    }

    private final void ShareDataUIState() {
        int iComponent1 = LottieRelativeFloatValueCallback.component1();
        component3(LottieRelativeFloatValueCallback.component1(), new Object[]{this}, LottieRelativeFloatValueCallback.component1(), -320610750, iComponent1, LottieRelativeFloatValueCallback.component1(), 320610751);
    }
}
