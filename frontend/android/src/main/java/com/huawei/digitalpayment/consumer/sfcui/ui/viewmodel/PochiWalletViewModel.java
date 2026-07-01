package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.resp.BalanceItem;
import com.huawei.digitalpayment.consumer.base.resp.BalanceResp;
import com.huawei.digitalpayment.consumer.base.util.AppFabricRequest;
import com.huawei.digitalpayment.consumer.base.util.PochiWalletBalanceHelper;
import com.huawei.digitalpayment.consumer.base.viewmode.ThirdPartyViewModel;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterKycParamsKt;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.PochiStatusResp;
import com.huawei.payment.mvvm.Resource;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/PochiWalletViewModel;", "Lcom/huawei/digitalpayment/consumer/base/viewmode/ThirdPartyViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "POCHI_WALLET_BALANCE_NAME", "", "statementData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PochiStatusResp;", "getStatementData", "queryWalletStatus", "", "queryWalletBalance", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiWalletViewModel extends ThirdPartyViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copy = 1;
    private final String component1 = "M-PESA Business Account";
    private MutableLiveData<Resource<PochiStatusResp>> copydefault = new MutableLiveData<>();

    public static final String access$getPOCHI_WALLET_BALANCE_NAME$p(PochiWalletViewModel pochiWalletViewModel) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = pochiWalletViewModel.component1;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 85;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final MutableLiveData access$getStatementData$p(PochiWalletViewModel pochiWalletViewModel) {
        int i = 2 % 2;
        int i2 = copy + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<PochiStatusResp>> mutableLiveData = pochiWalletViewModel.copydefault;
        if (i4 != 0) {
            int i5 = 82 / 0;
        }
        int i6 = i3 + 55;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MutableLiveData<Resource<PochiStatusResp>> getStatementData() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final void queryWalletStatus() {
        int i = 2 % 2;
        AppFabricRequest<PochiStatusResp> appFabricRequest = new AppFabricRequest<PochiStatusResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component1 + 55;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                if (i3 % 2 != 0) {
                    int i5 = 96 / 0;
                }
                int i6 = i4 + 57;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return "/MiniappToPayment/checkProductBound";
            }
        };
        appFabricRequest.addParams("productType", "Pochi");
        appFabricRequest.addParams("tradeType", "NativeApp");
        appFabricRequest.addParams("appType", RegisterKycParamsKt.REGISTER_CODE);
        sendRequest(appFabricRequest, new ApiCallback<PochiStatusResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(PochiStatusResp pochiStatusResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(pochiStatusResp);
                int i5 = copydefault + 7;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(PochiStatusResp value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(value);
                    PochiWalletViewModel.access$getStatementData$p(PochiWalletViewModel.this).setValue(Resource.success(value));
                    int i4 = 68 / 0;
                } else {
                    super.onSuccess(value);
                    PochiWalletViewModel.access$getStatementData$p(PochiWalletViewModel.this).setValue(Resource.success(value));
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                PochiWalletViewModel.access$getStatementData$p(PochiWalletViewModel.this).setValue(Resource.error(new BaseException(e.getMessage()), null));
                int i3 = component1 + 41;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = component2 + 63;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
    }

    public final void queryWalletBalance() {
        int i = 2 % 2;
        sendRequest(new PaymentRequest<BalanceResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return "queryMultiBalance";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, new ApiCallback<BalanceResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BalanceResp balanceResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 49;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(balanceResp);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public void onSuccess2(BalanceResp value) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 21;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                BalanceItem balanceItem = null;
                Object obj = null;
                balanceItem = null;
                if (value != null) {
                    int i6 = i3 + 11;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    List<BalanceItem> balances = value.getBalances();
                    if (balances != null) {
                        PochiWalletViewModel pochiWalletViewModel = PochiWalletViewModel.this;
                        Iterator<T> it = balances.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i8 = component2 + 33;
                            component3 = i8 % 128;
                            if (i8 % 2 == 0) {
                                Intrinsics.areEqual(((BalanceItem) it.next()).getAccountTypeName(), PochiWalletViewModel.access$getPOCHI_WALLET_BALANCE_NAME$p(pochiWalletViewModel));
                                balanceItem.hashCode();
                                throw null;
                            }
                            Object next = it.next();
                            if (Intrinsics.areEqual(((BalanceItem) next).getAccountTypeName(), PochiWalletViewModel.access$getPOCHI_WALLET_BALANCE_NAME$p(pochiWalletViewModel))) {
                                obj = next;
                                break;
                            }
                        }
                        balanceItem = (BalanceItem) obj;
                    }
                }
                if (balanceItem != null) {
                    int i9 = component2 + 99;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                    PochiWalletBalanceHelper.INSTANCE.saveBalance(balanceItem);
                    int i11 = component3 + 83;
                    component2 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 4 % 5;
                    }
                }
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                int i5 = component2 + 75;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 35 / 0;
                }
            }
        });
        int i2 = component2 + 69;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 107;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
