package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItemType;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository;", "", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "<init>", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "MINI_APP_GLOBAL_PAY_VIRTUAL_CARD_ID", "", "getMINI_APP_GLOBAL_PAY_VIRTUAL_CARD_ID", "()Ljava/lang/String;", "MINI_APP_GLOBAL_PAY_VIRTUAL_CARD_ID$delegate", "Lkotlin/Lazy;", "MINI_APP_PAY_PAL_ID", "getMINI_APP_PAY_PAL_ID", "MINI_APP_PAY_PAL_ID$delegate", "isGridViewMode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setGridViewMode", "", "getInternationalTransactionActions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;", "getCostEstimatorActions", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalDashboardRepository {
    private static final String component1 = "Global Pay Virtual Card";
    private static final String component2 = "PayPal";
    private static int component4 = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final Lazy ShareDataUIState;
    private final Lazy component3;
    private final RemoteConfig copy;
    private final MutableStateFlow<Boolean> copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public MpesaGlobalDashboardRepository(RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.copy = remoteConfig;
        this.ShareDataUIState = LazyKt.lazy(new Function0() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component1 + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                String str$r8$lambda$Re2fhJ9GOtBia1O49qVePwhRVN4 = MpesaGlobalDashboardRepository.$r8$lambda$Re2fhJ9GOtBia1O49qVePwhRVN4(this.f$0);
                int i4 = component1 + 29;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 0;
                }
                return str$r8$lambda$Re2fhJ9GOtBia1O49qVePwhRVN4;
            }
        });
        this.component3 = LazyKt.lazy(new Function0() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 19;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                String strM11003$r8$lambda$Lhz59ua4UrOAdsupeYaCbo9EUY = MpesaGlobalDashboardRepository.m11003$r8$lambda$Lhz59ua4UrOAdsupeYaCbo9EUY(this.f$0);
                int i4 = copydefault + 115;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return strM11003$r8$lambda$Lhz59ua4UrOAdsupeYaCbo9EUY;
                }
                throw null;
            }
        });
        this.copydefault = StateFlowKt.MutableStateFlow(false);
    }

    private final String copydefault() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ShareDataUIState.getValue();
        int i4 = getRequestBeneficiariesState + 33;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String component1(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardRepository, "");
        MiniAppIds miniAppIds = mpesaGlobalDashboardRepository.copy.getMiniAppIds();
        if (miniAppIds != null) {
            int i4 = component4 + 79;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            String mpesaGlobalMiniAppId = miniAppIds.getMpesaGlobalMiniAppId();
            if (mpesaGlobalMiniAppId != null) {
                return mpesaGlobalMiniAppId;
            }
        }
        return "3459010058086194";
    }

    private final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.component3.getValue();
        int i4 = getRequestBeneficiariesState + 27;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r3
  0x002a: PHI (r3v3 com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds) = 
  (r3v2 com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds)
  (r3v8 com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds)
 binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String component2(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository.component4
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig r3 = r3.copy
            com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds r3 = r3.getMiniAppIds()
            r1 = 5
            int r1 = r1 / 0
            if (r3 == 0) goto L30
            goto L2a
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig r3 = r3.copy
            com.huawei.digitalpayment.consumer.remoteconfig.models.MiniAppIds r3 = r3.getMiniAppIds()
            if (r3 == 0) goto L30
        L2a:
            java.lang.String r3 = r3.getPaypalMiniAppId()
            if (r3 != 0) goto L32
        L30:
            java.lang.String r3 = "3459010143009828"
        L32:
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository.component4
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository.component2(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository):java.lang.String");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository$Companion;", "", "<init>", "()V", "MINI_APP_GLOBAL_PAY_VIRTUAL_CARD_NAME", "", "MINI_APP_PAY_PAL_NAME", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final MutableStateFlow<Boolean> isGridViewMode() {
        int i = 2 % 2;
        int i2 = component4 + 125;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setGridViewMode(boolean isGridViewMode) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setValue(Boolean.valueOf(isGridViewMode));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<MpesaGlobalDashboardItem> getInternationalTransactionActions() {
        int i = 2 % 2;
        int i2 = R.id.action_global_pay_virtual_card_id;
        int i3 = R.string.one_app_mpesa_global_global_pay_virtual_card;
        int i4 = R.string.one_app_mpesa_global_global_pay_virtual_card_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem = new MpesaGlobalDashboardItem(i2, i3, Integer.valueOf(i4), R.drawable.ic_one_app_action_send_to_bank, 0, false, new MpesaGlobalDashboardItemType.MiniApp(copydefault(), component1), 32, null);
        int i5 = R.id.action_send_to_mobile_id;
        int i6 = R.string.one_app_mpesa_global_send_to_mobile;
        int i7 = R.string.one_app_mpesa_global_send_to_mobile_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem2 = new MpesaGlobalDashboardItem(i5, i6, Integer.valueOf(i7), R.drawable.ic_one_app_action_send_to_mobile, 0, false, null, 96, null);
        int i8 = R.id.action_send_to_bank_id;
        int i9 = R.string.one_app_mpesa_global_send_to_bank;
        int i10 = R.string.one_app_mpesa_global_send_to_bank_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem3 = new MpesaGlobalDashboardItem(i8, i9, Integer.valueOf(i10), R.drawable.ic_one_app_action_send_to_bank, 0, false, null, 96, null);
        int i11 = R.id.action_western_union_id;
        int i12 = R.string.one_app_mpesa_global_send_to_western_union;
        int i13 = R.string.one_app_mpesa_global_send_to_western_union_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem4 = new MpesaGlobalDashboardItem(i11, i12, Integer.valueOf(i13), R.drawable.ic_one_app_action_send_to_western_union, R.color.action_western_union_color, false, null, 64, null);
        int i14 = R.id.action_paypal_mini_app_id;
        int i15 = R.string.one_app_mpesa_global_paypal;
        int i16 = R.string.one_app_mpesa_global_paypal_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem5 = new MpesaGlobalDashboardItem(i14, i15, Integer.valueOf(i16), R.drawable.ic_one_app_action_paypal, 0, false, new MpesaGlobalDashboardItemType.MiniApp(component3(), component2), 32, null);
        int i17 = R.id.action_roaming_cash_out_id;
        int i18 = R.string.one_app_mpesa_global_roaming_cash_out;
        int i19 = R.string.one_app_mpesa_global_roaming_cash_out_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem6 = new MpesaGlobalDashboardItem(i17, i18, Integer.valueOf(i19), R.drawable.ic_one_app_action_roaming_cashout, 0, false, null, 96, null);
        int i20 = R.id.action_cost_estimator_id;
        int i21 = R.string.one_app_mpesa_global_cost_estimator;
        int i22 = R.string.one_app_mpesa_global_cost_estimator_description;
        PersistentList persistentList = ExtensionsKt.toPersistentList(CollectionsKt.listOf((Object[]) new MpesaGlobalDashboardItem[]{mpesaGlobalDashboardItem, mpesaGlobalDashboardItem2, mpesaGlobalDashboardItem3, mpesaGlobalDashboardItem4, mpesaGlobalDashboardItem5, mpesaGlobalDashboardItem6, new MpesaGlobalDashboardItem(i20, i21, Integer.valueOf(i22), R.drawable.ic_one_app_action_cost_estimator, 0, false, null, 96, null)}));
        int i23 = component4 + 13;
        getRequestBeneficiariesState = i23 % 128;
        if (i23 % 2 != 0) {
            return persistentList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<MpesaGlobalDashboardItem> getCostEstimatorActions() {
        int i = 2 % 2;
        int i2 = R.id.action_send_to_mobile_id;
        int i3 = R.string.one_app_mpesa_global_send_to_mobile;
        int i4 = R.string.one_app_mpesa_global_send_to_mobile_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem = new MpesaGlobalDashboardItem(i2, i3, Integer.valueOf(i4), R.drawable.ic_one_app_action_send_to_mobile, 0, false, null, 96, null);
        int i5 = R.id.action_send_to_bank_id;
        int i6 = R.string.one_app_mpesa_global_send_to_bank;
        int i7 = R.string.one_app_mpesa_global_send_to_bank_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem2 = new MpesaGlobalDashboardItem(i5, i6, Integer.valueOf(i7), R.drawable.ic_one_app_action_send_to_bank, 0, false, null, 96, null);
        int i8 = R.id.action_western_union_id;
        int i9 = R.string.one_app_mpesa_global_send_to_western_union;
        int i10 = R.string.one_app_mpesa_global_send_to_western_union_description;
        MpesaGlobalDashboardItem mpesaGlobalDashboardItem3 = new MpesaGlobalDashboardItem(i8, i9, Integer.valueOf(i10), R.drawable.ic_one_app_action_send_to_western_union, R.color.action_western_union_color, false, null, 64, null);
        int i11 = R.id.action_roaming_cash_out_id;
        int i12 = R.string.globalTransactScreen_item_roamingCashout_title;
        int i13 = R.string.one_app_mpesa_global_roaming_cash_out_description;
        PersistentList persistentList = ExtensionsKt.toPersistentList(CollectionsKt.listOf((Object[]) new MpesaGlobalDashboardItem[]{mpesaGlobalDashboardItem, mpesaGlobalDashboardItem2, mpesaGlobalDashboardItem3, new MpesaGlobalDashboardItem(i11, i12, Integer.valueOf(i13), R.drawable.ic_one_app_action_roaming_cashout, 0, false, null, 96, null)}));
        int i14 = getRequestBeneficiariesState + 87;
        component4 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 35 / 0;
        }
        return persistentList;
    }

    public static String m11003$r8$lambda$Lhz59ua4UrOAdsupeYaCbo9EUY(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            component2(mpesaGlobalDashboardRepository);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strComponent2 = component2(mpesaGlobalDashboardRepository);
        int i3 = getRequestBeneficiariesState + 27;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return strComponent2;
    }

    public static String $r8$lambda$Re2fhJ9GOtBia1O49qVePwhRVN4(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String strComponent1 = component1(mpesaGlobalDashboardRepository);
        int i4 = component4 + 77;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return strComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = getAsAtTimestamp + 7;
        equals = i % 128;
        int i2 = i % 2;
    }
}
