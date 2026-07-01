package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.WorkInfo;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload;
import com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.client.plugins.cache.storage.CachingCacheStorage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyPairGeneratorSpi;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J(\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020!H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014¨\u0006(²\u0006\f\u0010)\u001a\u0004\u0018\u00010\fX\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectAddBeneficiaryFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "beneficiaryMsisdn", "Landroidx/compose/runtime/MutableState;", "", "beneficiaryNickname", "limitText", "isManagingBeneficiary", "", "currentOperation", "userMsisdn", "getUserMsisdn", "()Ljava/lang/String;", "userMsisdn$delegate", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "observeViewModel", "showAddBeneficiaryScreen", "balanceResponse", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBalanceResponse;", "addBeneficiary", "msisdn", "nickname", "limit", "", "Companion", "ConsumerSfcUI_release", "selectedPhoneNumber", "formState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/AddBeneficiaryFormState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectAddBeneficiaryFragment extends Hilt_FamilyConnectAddBeneficiaryFragment {
    private static int ArtificialStackFrames = 1;
    private static int component4 = 1;
    private static final String copydefault;
    private static int equals;
    private static int hashCode;
    private String component2;
    private final Lazy component3;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MutableState<String> ShareDataUIState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    private final MutableState<String> component1 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    private final MutableState<String> getRequestBeneficiariesState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    private final MutableState<Boolean> copy = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final Lazy getAsAtTimestamp = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$MRX7k7cNJwPPP51dndJsMZH1AWo = FamilyConnectAddBeneficiaryFragment.$r8$lambda$MRX7k7cNJwPPP51dndJsMZH1AWo();
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            return str$r8$lambda$MRX7k7cNJwPPP51dndJsMZH1AWo;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component2 = 1;
        private final Function1 ShareDataUIState;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component2
                int r1 = r1 + 33
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component1 = r2
                int r1 = r1 % r0
                boolean r1 = r7 instanceof androidx.lifecycle.Observer
                r3 = 1
                r1 = r1 ^ r3
                r4 = 0
                if (r1 == r3) goto L4e
                int r1 = r2 + 57
                int r5 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component2 = r5
                int r1 = r1 % r0
                if (r1 == 0) goto L4b
                boolean r1 = r7 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L4e
                int r2 = r2 + r3
                int r1 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component2 = r1
                int r2 = r2 % r0
                if (r2 == 0) goto L3a
                r1 = r6
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r7 = (kotlin.jvm.internal.FunctionAdapter) r7
                kotlin.Function r7 = r7.getFunctionDelegate()
                boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)
                goto L4f
            L3a:
                r0 = r6
                kotlin.jvm.internal.FunctionAdapter r0 = (kotlin.jvm.internal.FunctionAdapter) r0
                kotlin.Function r0 = r0.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r7 = (kotlin.jvm.internal.FunctionAdapter) r7
                kotlin.Function r7 = r7.getFunctionDelegate()
                kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
                throw r4
            L4b:
                boolean r7 = r7 instanceof kotlin.jvm.internal.FunctionAdapter
                throw r4
            L4e:
                r7 = 0
            L4f:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component1
                int r1 = r1 + 101
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.component2 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L5b
                return r7
            L5b:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.component3.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 113;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i3 + 81;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    public static final void access$addBeneficiary(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2, int i, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
        int i2 = 2 % 2;
        int i3 = component4 + 57;
        equals = i3 % 128;
        int i4 = i3 % 2;
        familyConnectAddBeneficiaryFragment.component3(str, str2, i, familyConnectBalanceResponse);
        int i5 = component4 + 117;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final MutableState access$getBeneficiaryMsisdn$p(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 23;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableState<String> mutableState = familyConnectAddBeneficiaryFragment.ShareDataUIState;
        int i5 = i2 + 51;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableState access$getBeneficiaryNickname$p(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 125;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableState<String> mutableState = familyConnectAddBeneficiaryFragment.component1;
        int i5 = i2 + 51;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return mutableState;
    }

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = equals + 113;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return familyConnectAddBeneficiaryFragment.component3();
        }
        familyConnectAddBeneficiaryFragment.component3();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableState access$getLimitText$p(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableState<String> mutableState = familyConnectAddBeneficiaryFragment.getRequestBeneficiariesState;
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        int i6 = i2 + 1;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return mutableState;
    }

    public static final String access$getTAG$cp() {
        int i = 2 % 2;
        int i2 = equals + 31;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = copydefault;
        int i5 = i3 + 1;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final MutableState access$isManagingBeneficiary$p(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 107;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableState<Boolean> mutableState = familyConnectAddBeneficiaryFragment.copy;
        int i5 = i2 + 15;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectAddBeneficiaryFragment$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        public final String getTAG() {
            String strAccess$getTAG$cp;
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                strAccess$getTAG$cp = FamilyConnectAddBeneficiaryFragment.access$getTAG$cp();
                int i3 = 56 / 0;
            } else {
                strAccess$getTAG$cp = FamilyConnectAddBeneficiaryFragment.access$getTAG$cp();
            }
            int i4 = copydefault + 5;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return strAccess$getTAG$cp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FamilyConnectAddBeneficiaryFragment() {
        final FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment = this;
        final Function0 function0 = null;
        this.component3 = FragmentViewModelLazyKt.createViewModelLazy(familyConnectAddBeneficiaryFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 111;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component3 + 57;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 65;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectAddBeneficiaryFragment.requireActivity().getViewModelStore();
                int i4 = copydefault + 103;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 56 / 0;
                }
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static final byte[] $$a = {59, -24, -77, -23};
            private static final int $$b = 252;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int getRequestBeneficiariesState = 0;
            private static int getAsAtTimestamp = 1;
            private static char[] component3 = {30442, 30431, 30444, 30440, 30271, 30405, 30267, 30270, 30400, 30345, 30437, 30404, 30411, 30260, 30406, 30461, 30430, 30420, 30426, 30261, 30425, 30408, 30410, 30402, 30428, 30463, 30265, 30268, 30432, 30407, 30403, 30263, 30266, 30256, 30439, 30443};
            private static int copydefault = 321287849;
            private static boolean component2 = true;
            private static boolean component1 = true;
            private static char[] ShareDataUIState = {2024, 1973, 1993, 2008, 2035, 1051, 2034, 2000, 2029, 2037, 2041, 2027, 2025, 2030, 1966, 2020, 2031, 1977, 2017, 2021, 2036, 2040, 2026, 1050, 1998, 2038, 2028, 1987, 2032, 1968, 2016, 2022, 2023, 2018, 2003, 2019};
            private static char equals = 12828;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$c(short r7, int r8, short r9) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.$$a
                    int r7 = r7 * 2
                    int r7 = 4 - r7
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    int r9 = 119 - r9
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r9 = r7
                    r3 = r8
                    r5 = r2
                    goto L28
                L15:
                    r3 = r2
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L19:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L26:
                    r3 = r0[r9]
                L28:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r9 = r9 + 1
                    r3 = r5
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.$$c(short, int, short):java.lang.String");
            }

            private static void a(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
                int i2;
                char[] cArr2;
                int i3 = 2 % 2;
                cancel cancelVar = new cancel();
                char[] cArr3 = component3;
                int i4 = 0;
                if (cArr3 != null) {
                    int i5 = $10 + 107;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i4] = Integer.valueOf(cArr3[i7]);
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                            if (objCopydefault == null) {
                                byte b2 = (byte) i4;
                                byte b3 = b2;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(i4, i4) + 3760, (Process.myTid() >> 22) + 24, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1670574543, false, $$c(b2, b3, (byte) (b3 | TarHeader.LF_CHR)), new Class[]{Integer.TYPE});
                            }
                            cArr4[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            i7++;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
                    long j = 0;
                    char c2 = '0';
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - TextUtils.lastIndexOf("", '0', 0, 0), 13 - ExpandableListView.getPackedPositionType(0L), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i8 = 689978476;
                    try {
                        if (component1) {
                            int i9 = $11 + 49;
                            $10 = i9 % 128;
                            if (i9 % 2 != 0) {
                                cancelVar.component1 = bArr.length;
                                cArr2 = new char[cancelVar.component1];
                                i2 = 0;
                            } else {
                                i2 = 0;
                                cancelVar.component1 = bArr.length;
                                cArr2 = new char[cancelVar.component1];
                            }
                            cancelVar.component3 = i2;
                            while (cancelVar.component3 < cancelVar.component1) {
                                cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                                Object[] objArr4 = {cancelVar, cancelVar};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                                if (objCopydefault3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 19 - ExpandableListView.getPackedPositionType(j), (char) (TextUtils.lastIndexOf("", c2) + 7645), -327556343, false, $$c(b4, b5, (byte) (b5 | 46)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault3).invoke(null, objArr4);
                                j = 0;
                                c2 = '0';
                            }
                            objArr[0] = new String(cArr2);
                            return;
                        }
                        if (!component2) {
                            cancelVar.component1 = iArr.length;
                            char[] cArr5 = new char[cancelVar.component1];
                            cancelVar.component3 = 0;
                            while (cancelVar.component3 < cancelVar.component1) {
                                cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                                cancelVar.component3++;
                                int i10 = $10 + 35;
                                $11 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    int i11 = 4 % 3;
                                }
                            }
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        int i12 = $11 + 7;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        cancelVar.component1 = cArr.length;
                        char[] cArr6 = new char[cancelVar.component1];
                        cancelVar.component3 = 0;
                        while (cancelVar.component3 < cancelVar.component1) {
                            int i14 = $10 + 81;
                            $11 = i14 % 128;
                            int i15 = i14 % 2;
                            cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                            Object[] objArr5 = {cancelVar, cancelVar};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i8);
                            if (objCopydefault4 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2749 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, (char) (ImageFormat.getBitsPerPixel(0) + 7645), -327556343, false, $$c(b6, b7, (byte) (b7 | 46)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault4).invoke(null, objArr5);
                            i8 = 689978476;
                        }
                        objArr[0] = new String(cArr6);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = getAsAtTimestamp + 19;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = getAsAtTimestamp + 11;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v11 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.getRequestBeneficiariesState
                    int r1 = r1 + 113
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.getAsAtTimestamp = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 39
                    int r2 = r2 / 0
                    if (r1 == 0) goto L23
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L36
                L23:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.getAsAtTimestamp
                    int r2 = r2 + 107
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.getRequestBeneficiariesState = r3
                    int r2 = r2 % r0
                L36:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            private static void b(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                cancelAll cancelall = new cancelAll();
                char[] cArr2 = ShareDataUIState;
                int i4 = 64291;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                            if (objCopydefault == null) {
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + i4), 682917265, false, "v", new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            i5++;
                            i4 = 64291;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr3 = {Integer.valueOf(equals)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7423, 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                        int i6 = $10 + 25;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        cancelall.component2 = 0;
                        while (cancelall.component2 < i2) {
                            cancelall.component1 = cArr[cancelall.component2];
                            cancelall.component3 = cArr[cancelall.component2 + 1];
                            if (cancelall.component1 == cancelall.component3) {
                                int i8 = $11 + 27;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                                cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                                obj = obj2;
                            } else {
                                Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                                if (objCopydefault3 == null) {
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, (char) (44463 - TextUtils.indexOf("", "")), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                                    Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                    if (objCopydefault4 == null) {
                                        byte b3 = (byte) 0;
                                        byte b4 = b3;
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 2944, 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (27637 - KeyEvent.getDeadChar(0, 0)), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                    int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                    cArr4[cancelall.component2] = cArr2[iIntValue];
                                    cArr4[cancelall.component2 + 1] = cArr2[i10];
                                } else {
                                    obj = null;
                                    if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                        int i11 = $10 + 31;
                                        $11 = i11 % 128;
                                        int i12 = i11 % 2;
                                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                        int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                        int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                        cArr4[cancelall.component2] = cArr2[i13];
                                        cArr4[cancelall.component2 + 1] = cArr2[i14];
                                    } else {
                                        int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                        cArr4[cancelall.component2] = cArr2[i15];
                                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                                    }
                                }
                            }
                            cancelall.component2 += 2;
                            obj2 = obj;
                        }
                    }
                    int i17 = $11 + 11;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    for (int i19 = 0; i19 < i; i19++) {
                        cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r24v2 */
            /* JADX WARN: Type inference failed for: r24v3 */
            /* JADX WARN: Type inference failed for: r24v4 */
            /* JADX WARN: Type inference failed for: r2v156, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v10 */
            /* JADX WARN: Type inference failed for: r7v107, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v142 */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v197, types: [int] */
            /* JADX WARN: Type inference failed for: r7v199 */
            /* JADX WARN: Type inference failed for: r7v200 */
            /* JADX WARN: Type inference failed for: r7v201 */
            /* JADX WARN: Type inference failed for: r7v202 */
            /* JADX WARN: Type inference failed for: r7v203 */
            /* JADX WARN: Type inference failed for: r7v41, types: [int] */
            /* JADX WARN: Type inference failed for: r7v47 */
            /* JADX WARN: Type inference failed for: r7v48 */
            /* JADX WARN: Type inference failed for: r7v75, types: [int] */
            /* JADX WARN: Type inference failed for: r7v9 */
            /* JADX WARN: Type inference failed for: r7v94, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r7v96 */
            public static Object[] ShareDataUIState(Context context, int i, int i2) {
                int i3;
                int i4;
                ?? NewInstance;
                String str;
                Object objNewInstance;
                char[] cArr;
                byte b2;
                int i5;
                int i6;
                int iComponent3;
                ?? r24;
                int i7;
                int i8;
                Object[] objArr;
                int length;
                int i9;
                int i10;
                int i11;
                int i12;
                Method method;
                char[] cArr2;
                byte bLastIndexOf;
                int windowTouchSlop;
                int iComponent32;
                int i13;
                Object obj;
                Class<?> cls;
                char[] cArr3;
                int i14;
                int i15;
                int i16;
                Object[] objArr2;
                int i17;
                int i18;
                int i19;
                int i20 = i2;
                int i21 = 2 % 2;
                if (context != null) {
                    try {
                        int i22 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i23 = i22 * (-711);
                        int i24 = getAsAtTimestamp;
                        int i25 = (i24 ^ 59) + ((i24 & 59) << 1);
                        int i26 = i25 % 128;
                        getRequestBeneficiariesState = i26;
                        int i27 = i25 % 2 != 0 ? ((i23 | (-585)) << 1) - (i23 ^ (-585)) : ((i23 | 91264) << 1) - (i23 ^ 91264);
                        int i28 = ~(((-129) & i22) | ((-129) ^ i22));
                        i3 = ~i;
                        int i29 = ~(i3 | i22);
                        int i30 = -(-((-712) * ((i28 & i29) | (i28 ^ i29))));
                        int i31 = (i27 & i30) + (i30 | i27);
                        int i32 = ((-129) ^ i3) | ((-129) & i3);
                        int i33 = ~((i32 & i22) | (i32 ^ i22));
                        int i34 = (i26 ^ 27) + ((i26 & 27) << 1);
                        getAsAtTimestamp = i34 % 128;
                        int i35 = i34 % 2;
                        int i36 = ~((i22 ^ 128) | (i22 & 128) | i);
                        int i37 = (i31 - (~((-712) * ((i36 & i33) | (i33 ^ i36))))) - 1;
                        i4 = ~i;
                        int i38 = ~((i22 & i4) | (i4 ^ i22));
                        int i39 = i37 + (((i38 & (-129)) | ((-129) ^ i38)) * 712);
                        NewInstance = 31;
                        NewInstance = 31;
                        Object[] objArr3 = new Object[1];
                        a(null, i39, new byte[]{-109, -110, -125, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr3);
                        str = (String) objArr3[0];
                        int i40 = getRequestBeneficiariesState;
                        int i41 = (i40 & 19) + (i40 | 19);
                        getAsAtTimestamp = i41 % 128;
                        int i42 = i41 % 2;
                    } catch (Throwable unused) {
                        NewInstance = i20;
                    }
                    try {
                        try {
                            byte b3 = (byte) (78 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16))));
                            int i43 = -ExpandableListView.getPackedPositionChild(0L);
                            Object[] objArr4 = new Object[1];
                            b(new char[]{23, 19, 24, 19, 20, 15, 1, 22, '!', 11, '\f', 18, 22, '\b', '\f', 20, '\b', 21, 2, '\f', 19, 3, 13817, 13817, 15, 2, 5, 25, 25, 11, '\f', 18, 17, 31, 16, 24, 20, 24}, b3, ((i43 | 37) << 1) - (i43 ^ 37), objArr4);
                            objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(str);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                            int iComponent33 = CachingCacheStorage.component2.component3();
                            int i44 = iLastIndexOf * (-501);
                            int i45 = (i44 & 64384) + (i44 | 64384);
                            int i46 = ~(((-129) ^ iComponent33) | ((-129) & iComponent33));
                            int i47 = ~(iLastIndexOf | 128);
                            int i48 = -(-(((i46 ^ i47) | (i47 & i46)) * (-502)));
                            int i49 = ((i45 | i48) << 1) - (i45 ^ i48);
                            int i50 = ~iComponent33;
                            int i51 = ((-129) ^ i50) | (i50 & (-129));
                            int i52 = -(-((~((i51 ^ iLastIndexOf) | (i51 & iLastIndexOf))) * (-502)));
                            int i53 = (i49 ^ i52) + ((i52 & i49) << 1);
                            int i54 = ~iLastIndexOf;
                            int i55 = ~((i54 & iComponent33) | (i54 ^ iComponent33));
                            Object[] objArr5 = new Object[1];
                            a(null, (i53 - (~(((i55 & (-129)) | ((-129) ^ i55)) * 502))) - 1, new byte[]{-113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -109, -110, -125, -127}, null, objArr5);
                            NewInstance = (String) objArr5[0];
                            try {
                                Object[] objArr6 = {NewInstance};
                                byte b4 = (byte) (78 - (~(-View.getDefaultSize(0, 0))));
                                int i56 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                int i57 = (i56 & 37) + (i56 | 37);
                                Object[] objArr7 = new Object[1];
                                b(new char[]{23, 19, 24, 19, 20, 15, 1, 22, '!', 11, '\f', 18, 22, '\b', '\f', 20, '\b', 21, 2, '\f', 19, 3, 13817, 13817, 15, 2, 5, 25, 25, 11, '\f', 18, 17, 31, 16, 24, 20, 24}, b4, i57, objArr7);
                                Class<?> cls2 = Class.forName((String) objArr7[0]);
                                int i58 = getRequestBeneficiariesState + 95;
                                getAsAtTimestamp = i58 % 128;
                                int i59 = i58 % 2;
                                NewInstance = cls2.getDeclaredConstructor(String.class).newInstance(objArr6);
                                try {
                                    char[] cArr4 = {19, '\f', '\f', '\t', 17, CharUtils.CR, 16, 15, '\"', 17, 14, 19, 25, 19, JSONLexer.EOI, 20, 28, 15, 14, 19, 20, 22, 13883};
                                    byte b5 = (byte) (76 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))));
                                    int i60 = getRequestBeneficiariesState + 45;
                                    getAsAtTimestamp = i60 % 128;
                                    int i61 = i60 % 2;
                                    int i62 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                    int i63 = (i62 & 23) + (i62 | 23);
                                    Object[] objArr8 = new Object[1];
                                    b(cArr4, b5, i63, objArr8);
                                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                                    Object[] objArr9 = new Object[1];
                                    a(null, 126 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), new byte[]{-121, -116, -113, -106, -123, -106, -103, -116, -113, -106, -104, -105, -106, -107, -108, -116, -113}, null, objArr9);
                                    Object objInvoke = cls3.getMethod((String) objArr9[0], null).invoke(context, null);
                                    CachingCacheStorage.component2.component3();
                                    int i64 = getRequestBeneficiariesState + 35;
                                    getAsAtTimestamp = i64 % 128;
                                    try {
                                        if (i64 % 2 == 0) {
                                            cArr = new char[]{19, '\f', '\f', '\t', 17, CharUtils.CR, 16, 15, '\"', 17, 14, 19, 25, 19, JSONLexer.EOI, 20, 28, 15, 14, 19, 20, 22, 13883};
                                            int i65 = -(-KeyEvent.normalizeMetaState(0));
                                            b2 = (byte) ((i65 ^ 17) + ((i65 & 17) << 1));
                                            int scrollBarSize = ViewConfiguration.getScrollBarSize();
                                            i5 = -((scrollBarSize & (-54)) + (scrollBarSize | (-54)));
                                            iComponent3 = CachingCacheStorage.component2.component3();
                                            i6 = 119;
                                        } else {
                                            cArr = new char[]{19, '\f', '\f', '\t', 17, CharUtils.CR, 16, 15, '\"', 17, 14, 19, 25, 19, JSONLexer.EOI, 20, 28, 15, 14, 19, 20, 22, 13883};
                                            b2 = (byte) (76 - (~(-KeyEvent.normalizeMetaState(0))));
                                            i5 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                            i6 = 23;
                                            iComponent3 = CachingCacheStorage.component2.component3();
                                        }
                                        int i66 = ((-661) * i5) + (i6 * (-661));
                                        int i67 = ~iComponent3;
                                        int i68 = ~i5;
                                        int i69 = ~i6;
                                        int i70 = ~((i68 ^ i69) | (i68 & i69));
                                        i20 = ((i67 ^ i70) | (i70 & i67)) * 1324;
                                        int i71 = getRequestBeneficiariesState + 15;
                                        r24 = NewInstance;
                                        getAsAtTimestamp = i71 % 128;
                                        if (i71 % 2 == 0) {
                                            int i72 = i66 + i20;
                                            int i73 = ~((i5 ^ iComponent3) | (i5 & iComponent3));
                                            int i74 = ~(i6 | iComponent3);
                                            int i75 = -(-((i73 & i74) | (i73 ^ i74)));
                                            i7 = i72 >> ((i75 & (-1324)) + (i75 | (-1324)));
                                        } else {
                                            int i76 = ((i66 | i20) << 1) - (i66 ^ i20);
                                            int i77 = ~((i5 ^ iComponent3) | (i5 & iComponent3));
                                            int i78 = ~((i6 ^ iComponent3) | (iComponent3 & i6));
                                            i7 = (((i77 & i78) | (i77 ^ i78)) * (-1324)) + i76;
                                        }
                                        int i79 = ~((i6 & i68) | (i68 ^ i6));
                                        int i80 = ~((i69 & i5) | (i69 ^ i5));
                                        int i81 = -(-(662 * ((i80 & i79) | (i79 ^ i80))));
                                        i8 = (i7 & i81) + (i7 | i81);
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        Object[] objArr10 = new Object[1];
                                        b(cArr, b2, i8, objArr10);
                                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                                        char[] cArr5 = {31, 20, 19, '\b', 23, 30, 6, 23, 31, 20, 30, 24, 7, 20};
                                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        int i82 = offsetBefore * (-432);
                                        int i83 = ((i82 | 32550) << 1) - (i82 ^ 32550);
                                        int i84 = ~offsetBefore;
                                        int i85 = i83 + ((~((i84 ^ i3) | (i84 & i3) | 75)) * 433);
                                        int i86 = ~offsetBefore;
                                        int i87 = ~((-76) | i);
                                        int i88 = ((i86 & i87) | (i86 ^ i87)) * (-433);
                                        int i89 = ((i85 | i88) << 1) - (i85 ^ i88);
                                        int i90 = ~((i84 & i) | (i84 ^ i));
                                        int i91 = ~((offsetBefore & 75) | (offsetBefore ^ 75));
                                        int i92 = -(-(((i91 & i90) | (i90 ^ i91)) * 433));
                                        byte b6 = (byte) ((i89 & i92) + (i92 | i89));
                                        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
                                        int i93 = getRequestBeneficiariesState;
                                        int i94 = (i93 & 11) + (i93 | 11);
                                        getAsAtTimestamp = i94 % 128;
                                        int i95 = i94 % 2;
                                        int i96 = -(maximumFlingVelocity >> 16);
                                        NewInstance = (14 ^ i96) + ((i96 & 14) << 1);
                                        Object[] objArr11 = new Object[1];
                                        b(cArr5, b6, NewInstance, objArr11);
                                        try {
                                            Object[] objArr12 = {cls4.getMethod((String) objArr11[0], null).invoke(context, null), 64};
                                            int i97 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int iComponent34 = CachingCacheStorage.component2.component3();
                                            int i98 = i97 * (-501);
                                            int i99 = (i98 & 63881) + (i98 | 63881);
                                            int i100 = ~((-128) | iComponent34);
                                            int i101 = ~((i97 ^ 127) | (i97 & 127));
                                            int i102 = ((i100 & i101) | (i100 ^ i101)) * (-502);
                                            int i103 = (i99 ^ i102) + ((i102 & i99) << 1);
                                            int i104 = (~iComponent34) | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                            int i105 = (~((i104 & i97) | (i104 ^ i97))) * (-502);
                                            int i106 = ~((~i97) | iComponent34);
                                            Object[] objArr13 = new Object[1];
                                            a(null, (((i103 | i105) << 1) - (i105 ^ i103)) + (((i106 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i106)) * 502), new byte[]{-121, -116, -113, -106, -123, -106, -103, -116, -113, -106, -104, -105, -106, -107, -102, -100, -101, -102, -108, -123, -116, -108, -123, -120, -105, -102, -122, -119, -120, -121, -122, -123, -106}, null, objArr13);
                                            Class<?> cls5 = Class.forName((String) objArr13[0]);
                                            int i107 = -KeyEvent.keyCodeFromString("");
                                            int i108 = i107 * (-167);
                                            int i109 = (i108 ^ (-21209)) + ((i108 & (-21209)) << 1);
                                            int i110 = ~i107;
                                            int i111 = ~((i110 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i110 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                            int i112 = ~((-128) | i4);
                                            int i113 = (i109 - (~(-(-(((i112 & i111) | (i111 ^ i112)) * 168))))) - 1;
                                            int i114 = (i110 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i110 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                            int i115 = i113 + ((~((i114 & i) | (i114 ^ i))) * 168);
                                            int i116 = ~((i110 ^ i3) | (i110 & i3));
                                            int i117 = ~((~i107) | 127);
                                            int i118 = (i116 & i117) | (i116 ^ i117);
                                            int i119 = (i107 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ i107);
                                            int i120 = ~((i119 & i) | (i119 ^ i));
                                            int i121 = ((i118 & i120) | (i118 ^ i120)) * 168;
                                            Object[] objArr14 = new Object[1];
                                            a(null, ((i115 | i121) << 1) - (i121 ^ i115), new byte[]{-120, -98, -123, -99, -116, -113, -106, -104, -105, -106, -107, -108, -116, -113}, null, objArr14);
                                            NewInstance = 1;
                                            Object objInvoke2 = cls5.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                            try {
                                                int threadPriority = Process.getThreadPriority(0);
                                                int iComponent35 = CachingCacheStorage.component2.component3();
                                                int i122 = -(-(threadPriority * WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
                                                int i123 = ((-3660) & i122) + (i122 | (-3660)) + (((threadPriority ^ (-21)) | (threadPriority & (-21))) * (-368));
                                                int i124 = ~threadPriority;
                                                int i125 = (i124 & 20) | (i124 ^ 20);
                                                int i126 = ~iComponent35;
                                                int i127 = (i123 - (~(((i125 & i126) | (i125 ^ i126)) * 184))) - 1;
                                                int i128 = ~threadPriority;
                                                int i129 = ~((i128 & (-21)) | ((-21) ^ i128));
                                                int i130 = ~((i126 & 20) | (i126 ^ 20));
                                                int i131 = (i130 & i129) | (i129 ^ i130);
                                                int i132 = ~((threadPriority & 20) | (threadPriority ^ 20));
                                                int i133 = -(-(((i131 & i132) | (i131 ^ i132)) * 184));
                                                Object[] objArr15 = new Object[1];
                                                a(null, (((i127 ^ i133) + ((i133 & i127) << 1)) >> 6) + 127, new byte[]{-120, -98, -123, -99, -116, -113, -106, -104, -105, -106, -107, -102, -100, -101, -102, -108, -123, -116, -108, -123, -120, -105, -102, -122, -119, -120, -121, -122, -123, -106}, null, objArr15);
                                                Class<?> cls6 = Class.forName((String) objArr15[0]);
                                                int i134 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                int i135 = ~i134;
                                                int i136 = (((i134 * (-167)) - 8183) - (~(-(-(((~((i135 & (-50)) | (i135 ^ (-50)))) | (~(((-50) ^ i4) | ((-50) & i4)))) * 168))))) - 1;
                                                int i137 = ~i134;
                                                int i138 = i137 | (-50);
                                                int i139 = i136 + ((~((i138 & i) | (i138 ^ i))) * 168);
                                                int i140 = ~((i137 ^ i3) | (i137 & i3));
                                                int i141 = ~((i137 & 49) | (i137 ^ 49));
                                                int i142 = (i134 & (-50)) | ((-50) ^ i134);
                                                int i143 = -(-(((~((i142 & i) | (i142 ^ i))) | (i141 & i140) | (i140 ^ i141)) * 168));
                                                Object[] objArr16 = new Object[1];
                                                b(new char[]{0, 16, 31, 14, 19, 21, '\n', 7, 22, 1}, (byte) ((i139 & i143) + (i143 | i139)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, objArr16);
                                                objArr = (Object[]) cls6.getField((String) objArr16[0]).get(objInvoke2);
                                                length = objArr.length;
                                                i9 = 0;
                                            } catch (Throwable unused2) {
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause = th2.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable cause2 = th.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause3 = th4.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                Throwable cause4 = th5.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            Throwable cause5 = th6.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th6;
                        }
                    } catch (Throwable unused3) {
                        objArr2 = new Object[]{new int[1], new int[]{i}, new int[]{i}, null};
                        int i144 = ~i;
                        int i145 = (~((-163586740) | i144)) | 29360816;
                        int i146 = ~(i | 163836671);
                        int i147 = 2047425231 + ((i145 | i146) * (-502)) + (((~(i144 | (-134225924))) | i146) * 502);
                        int iComponent36 = CachingCacheStorage.component2.component3();
                        int i148 = ~NewInstance;
                        int i149 = ~iComponent36;
                        int i150 = ~((i149 & i148) | (i148 ^ i149));
                        int i151 = ~NewInstance;
                        int i152 = (i147 * (-244)) + (NewInstance * 246) + ((i150 | (~((i151 & i147) | (i151 ^ i147)))) * (-245));
                        int i153 = (~((i148 ^ iComponent36) | (i148 & iComponent36))) * (-245);
                        int i154 = (i152 & i153) + (i152 | i153);
                        int i155 = ~((iComponent36 & i148) | (i148 ^ iComponent36));
                        int i156 = -(-(((i155 & i147) | (i147 ^ i155)) * 245));
                        int i157 = ((i154 | i156) << 1) - (i156 ^ i154);
                        int i158 = i157 << 13;
                        int i159 = (i158 | i157) & (~(i157 & i158));
                        int i160 = i159 ^ (i159 >>> 17);
                        ((int[]) objArr2[0])[0] = i160 ^ (i160 << 5);
                    }
                    while (i9 < length) {
                        Object obj2 = objArr[i9];
                        char[] cArr6 = {2, 15, 5, 25, 13732};
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                        int iComponent37 = CachingCacheStorage.component2.component3();
                        int i161 = packedPositionGroup * 141;
                        int i162 = (i161 ^ (-139)) + ((i161 & (-139)) << 1);
                        int i163 = ~packedPositionGroup;
                        int i164 = ~((i163 ^ 1) | (i163 & 1));
                        int i165 = ~((i163 & iComponent37) | (i163 ^ iComponent37));
                        int i166 = ((i165 & i164) | (i164 ^ i165)) * (-280);
                        int i167 = getRequestBeneficiariesState;
                        int i168 = i167 + 29;
                        getAsAtTimestamp = i168 % 128;
                        int i169 = i168 % 2;
                        int i170 = -(-i166);
                        int i171 = (i162 ^ i170) + ((i170 & i162) << 1);
                        int i172 = ~packedPositionGroup;
                        int i173 = ~((i172 ^ iComponent37) | (i172 & iComponent37));
                        int i174 = ~(((-2) ^ iComponent37) | ((-2) & iComponent37));
                        int i175 = (i171 - (~(-(-(((i173 ^ i174) | (i173 & i174)) * 140))))) - 1;
                        int i176 = i167 + 3;
                        getAsAtTimestamp = i176 % 128;
                        int i177 = i176 % 2;
                        int i178 = i172 | (-2);
                        int i179 = ~((i178 & iComponent37) | (i178 ^ iComponent37));
                        int i180 = ~iComponent37;
                        int i181 = (i172 & i180) | (i172 ^ i180);
                        int i182 = ~((i181 & 1) | (i181 ^ 1));
                        int i183 = (i182 & i179) | (i179 ^ i182);
                        int i184 = (i180 & (-2)) | ((-2) ^ i180);
                        int i185 = ~((packedPositionGroup & i184) | (i184 ^ packedPositionGroup));
                        byte b7 = (byte) (i175 + (((i185 & i183) | (i183 ^ i185)) * 140));
                        int iResolveSize = View.resolveSize(0, 0);
                        int iComponent38 = CachingCacheStorage.component2.component3();
                        int i186 = (iResolveSize * (-711)) + 3565;
                        int i187 = ~(((-6) ^ iResolveSize) | ((-6) & iResolveSize));
                        int i188 = ~iComponent38;
                        int i189 = getRequestBeneficiariesState;
                        int i190 = ((i189 | 25) << 1) - (i189 ^ 25);
                        Object[] objArr17 = objArr;
                        getAsAtTimestamp = i190 % 128;
                        if (i190 % 2 == 0) {
                            int i191 = ~((i188 ^ iResolveSize) | (i188 & iResolveSize));
                            i10 = i186 >> ((-712) / ((i187 ^ i191) | (i191 & i187)));
                        } else {
                            int i192 = ~((i188 ^ iResolveSize) | (i188 & iResolveSize));
                            int i193 = -(-(((i187 ^ i192) | (i192 & i187)) * (-712)));
                            i10 = ((i186 | i193) << 1) - (i193 ^ i186);
                        }
                        int i194 = ((-6) & i188) | ((-6) ^ i188);
                        int i195 = ~((i194 & iResolveSize) | (i194 ^ iResolveSize));
                        int i196 = (iResolveSize ^ 5) | (iResolveSize & 5);
                        int i197 = ~((i196 & iComponent38) | (i196 ^ iComponent38));
                        int i198 = -(-((-712) * ((i195 & i197) | (i195 ^ i197))));
                        int i199 = ((i10 | i198) << 1) - (i10 ^ i198);
                        int i200 = ~iComponent38;
                        int i201 = ~((i200 & iResolveSize) | (i200 ^ iResolveSize));
                        int i202 = ((i201 & (-6)) | ((-6) ^ i201)) * 712;
                        NewInstance = (i199 & i202) + (i202 | i199);
                        Object[] objArr18 = new Object[1];
                        b(cArr6, b7, NewInstance, objArr18);
                        try {
                            Object[] objArr19 = {(String) objArr18[0]};
                            int i203 = -(-(Process.myPid() >> 22));
                            Object[] objArr20 = new Object[1];
                            a(null, (i203 ^ 127) + ((i203 & 127) << 1), new byte[]{-94, -121, -120, -108, -105, -106, -93, -116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -102, -108, -121, -116, -105, -102, -94, -108, -119, -121, -114, -105, -116, -95, -102, -106, -96, -106, -97}, null, objArr20);
                            Class<?> cls7 = Class.forName((String) objArr20[0]);
                            char[] cArr7 = {31, 20, JSONLexer.EOI, '\b', 16, 1, 21, 19, 17, 31, 13914};
                            int i204 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iComponent39 = CachingCacheStorage.component2.component3();
                            int i205 = i204 * (-391);
                            int i206 = (i205 ^ (-17745)) + ((i205 & (-17745)) << 1);
                            int i207 = ~(((-92) & i204) | ((-92) ^ i204));
                            int i208 = (iComponent39 & 91) | (iComponent39 ^ 91);
                            int i209 = ~i208;
                            int i210 = i206 + (((i207 & i209) | (i207 ^ i209)) * (-196)) + ((i204 | 91) * 392);
                            int i211 = ~i204;
                            int i212 = ~((i211 & (-92)) | (i211 ^ (-92)));
                            int i213 = ~i208;
                            int i214 = -(-(((i212 & i213) | (i212 ^ i213)) * 196));
                            byte b8 = (byte) (((i210 | i214) << 1) - (i214 ^ i210));
                            int iMyPid = Process.myPid() >> 22;
                            int iComponent310 = CachingCacheStorage.component2.component3();
                            int i215 = iMyPid * (-589);
                            int i216 = ((i215 | 6501) << 1) - (i215 ^ 6501);
                            int i217 = ~iComponent310;
                            int i218 = length;
                            int i219 = (~((-12) | i217)) | (~((-12) | iMyPid));
                            int i220 = ~((i217 ^ iMyPid) | (i217 & iMyPid));
                            int i221 = (i219 ^ i220) | (i219 & i220);
                            int i222 = i4;
                            int i223 = ~iMyPid;
                            int i224 = (i223 ^ 11) | (i223 & 11);
                            int i225 = ~((i224 ^ iComponent310) | (i224 & iComponent310));
                            int i226 = ((i221 ^ i225) | (i221 & i225)) * 590;
                            int i227 = ((i216 | i226) << 1) - (i226 ^ i216);
                            int i228 = ~iComponent310;
                            int i229 = ~(((-12) ^ i228) | ((-12) & i228));
                            int i230 = ~((-12) | iMyPid);
                            int i231 = (i229 ^ i230) | (i229 & i230);
                            int i232 = ~iMyPid;
                            int i233 = ((i227 + (((i231 & i220) | (i231 ^ i220)) * (-1180))) - (~(((~((i228 & i232) | (i232 ^ i228))) | (~((i217 ^ 11) | (i217 & 11)))) * 590))) - 1;
                            Object[] objArr21 = new Object[1];
                            b(cArr7, b8, i233, objArr21);
                            NewInstance = (String) objArr21[0];
                            Object objInvoke3 = cls7.getMethod(NewInstance, String.class).invoke(null, objArr19);
                            try {
                                int i234 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                NewInstance = 1;
                                int i235 = (i234 ^ 127) + ((i234 & 127) << 1);
                                byte[] bArr = {-116, -121, -114, -108, -106, -123, -113, -119, -109, -102, -100, -101, -102, -108, -123, -116, -108, -123, -120, -105, -102, -122, -119, -120, -121, -122, -123, -106};
                                int i236 = getRequestBeneficiariesState + 9;
                                getAsAtTimestamp = i236 % 128;
                                int i237 = i236 % 2;
                                Object[] objArr22 = new Object[1];
                                a(null, i235, bArr, null, objArr22);
                                Class<?> cls8 = Class.forName((String) objArr22[0]);
                                int i238 = -(-View.MeasureSpec.getMode(0));
                                Object[] objArr23 = new Object[1];
                                a(null, ((i238 | 127) << 1) - (i238 ^ 127), new byte[]{-94, -106, -121, -121, -124, -116, -108, -94, -92, -120, -108}, null, objArr23);
                                NewInstance = (String) objArr23[0];
                                try {
                                    Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls8.getMethod(NewInstance, null).invoke(obj2, null))};
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0');
                                    int iComponent311 = CachingCacheStorage.component2.component3();
                                    int i239 = iIndexOf * (-589);
                                    int i240 = (i239 & 75648) + (i239 | 75648);
                                    int i241 = ~iComponent311;
                                    int i242 = getRequestBeneficiariesState + 39;
                                    int i243 = i242 % 128;
                                    getAsAtTimestamp = i243;
                                    int i244 = i242 % 2;
                                    int i245 = ~(((-129) ^ i241) | ((-129) & i241));
                                    int i246 = ~((-129) | iIndexOf);
                                    int i247 = (i245 & i246) | (i245 ^ i246);
                                    int i248 = ~((i241 ^ iIndexOf) | (i241 & iIndexOf));
                                    int i249 = (i247 & i248) | (i247 ^ i248);
                                    int i250 = ~iIndexOf;
                                    int i251 = (i243 & 41) + (i243 | 41);
                                    getRequestBeneficiariesState = i251 % 128;
                                    if (i251 % 2 != 0) {
                                        int i252 = (i250 & 128) | (i250 ^ 128);
                                        i11 = i240 * (590 << (i249 | (~((i252 & iComponent311) | (i252 ^ iComponent311)))));
                                        i12 = ~((-129) | i241);
                                    } else {
                                        int i253 = (i249 | (~(i250 | 128 | iComponent311))) * 590;
                                        i11 = ((i240 | i253) << 1) - (i253 ^ i240);
                                        int i254 = ~iComponent311;
                                        i12 = ~((i254 & (-129)) | ((-129) ^ i254));
                                    }
                                    int i255 = ~((-129) | iIndexOf);
                                    int i256 = (i12 & i255) | (i12 ^ i255);
                                    int i257 = ~iComponent311;
                                    int i258 = ~(i257 | iIndexOf);
                                    int i259 = i11 + ((-1180) * ((i256 & i258) | (i256 ^ i258)));
                                    int i260 = ~iIndexOf;
                                    int i261 = ((~((i260 & i241) | (i260 ^ i241))) | (~((i257 & 128) | (i257 ^ 128)))) * 590;
                                    Object[] objArr25 = new Object[1];
                                    a(null, (i259 & i261) + (i261 | i259), new byte[]{-94, -121, -120, -108, -105, -106, -93, -116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -102, -108, -121, -116, -105, -102, -94, -108, -119, -121, -114, -105, -116, -95, -102, -106, -96, -106, -97}, null, objArr25);
                                    Class<?> cls9 = Class.forName((String) objArr25[0]);
                                    char[] cArr8 = {31, 20, 19, 25, '\f', 24, 21, 20, 25, 21, '\b', 18, CharUtils.CR, 30, 17, 30, 19, 21, 13930};
                                    byte b9 = (byte) (107 - (~(-(-Process.getGidForName("")))));
                                    int i262 = -(ViewConfiguration.getTouchSlop() >> 8);
                                    int i263 = ((i262 | 19) << 1) - (i262 ^ 19);
                                    Object[] objArr26 = new Object[1];
                                    b(cArr8, b9, i263, objArr26);
                                    String str2 = (String) objArr26[0];
                                    Class<?>[] clsArr = new Class[1];
                                    int i264 = getAsAtTimestamp;
                                    int i265 = (i264 ^ 81) + ((i264 & 81) << 1);
                                    getRequestBeneficiariesState = i265 % 128;
                                    if (i265 % 2 != 0) {
                                        clsArr[1] = InputStream.class;
                                        method = cls9.getMethod(str2, clsArr);
                                        NewInstance = InputStream.class;
                                    } else {
                                        clsArr[0] = InputStream.class;
                                        method = cls9.getMethod(str2, clsArr);
                                        NewInstance = InputStream.class;
                                    }
                                    Object objInvoke4 = method.invoke(objInvoke3, objArr24);
                                    int i266 = getRequestBeneficiariesState;
                                    int i267 = (i266 & 41) + (i266 | 41);
                                    getAsAtTimestamp = i267 % 128;
                                    if (i267 % 2 == 0) {
                                        try {
                                            cArr2 = new char[]{23, 19, 24, 19, 16, 2, 23, 31, '\n', 7, 14, 18, '\b', 16, 31, 23, '\b', 18, 15, 2, 5, 25, 15, 29, 18, 7, 18, 14, 30, CharUtils.CR, 30, 23, 21, 20};
                                            bLastIndexOf = (byte) (11 / TextUtils.lastIndexOf("", 'C', 0));
                                            int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop();
                                            windowTouchSlop = (windowTouchSlop2 ^ (-90)) + ((windowTouchSlop2 & (-90)) << 1);
                                            iComponent32 = CachingCacheStorage.component2.component3();
                                            i13 = 117;
                                            NewInstance = 117;
                                        } catch (Throwable th7) {
                                            Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } else {
                                        cArr2 = new char[]{23, 19, 24, 19, 16, 2, 23, 31, '\n', 7, 14, 18, '\b', 16, 31, 23, '\b', 18, 15, 2, 5, 25, 15, 29, 18, 7, 18, 14, 30, CharUtils.CR, 30, 23, 21, 20};
                                        int i268 = -(-TextUtils.lastIndexOf("", '0', 0));
                                        bLastIndexOf = (byte) ((i268 ^ 116) + ((i268 & 116) << 1));
                                        windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                        iComponent32 = CachingCacheStorage.component2.component3();
                                        i13 = 34;
                                    }
                                    int i269 = getAsAtTimestamp;
                                    int i270 = (i269 & 15) + (i269 | 15);
                                    getRequestBeneficiariesState = i270 % 128;
                                    int i271 = i270 % 2;
                                    int i272 = (windowTouchSlop * 399) + (i13 * 399);
                                    int i273 = ~windowTouchSlop;
                                    int i274 = ~((i273 ^ i13) | (i273 & i13));
                                    int i275 = ~i13;
                                    int i276 = i269 + 111;
                                    int i277 = i9;
                                    int i278 = i276 % 128;
                                    getRequestBeneficiariesState = i278;
                                    int i279 = i276 % 2;
                                    int i280 = ~((i275 ^ windowTouchSlop) | (i275 & windowTouchSlop));
                                    Object obj3 = objNewInstance;
                                    int i281 = ~i13;
                                    int i282 = -(-(398 * ((~((i281 ^ iComponent32) | (i281 & iComponent32))) | (i274 ^ i280) | (i274 & i280))));
                                    int i283 = (i272 ^ i282) + ((i282 & i272) << 1);
                                    int i284 = -(-((windowTouchSlop | i13) * (-1194)));
                                    int i285 = (i283 & i284) + (i284 | i283);
                                    int i286 = (i278 ^ 15) + ((i278 & 15) << 1);
                                    getAsAtTimestamp = i286 % 128;
                                    int i287 = i286 % 2;
                                    int i288 = ~iComponent32;
                                    if (i287 == 0) {
                                        int i289 = ~(i288 | i275);
                                        int i290 = (i289 & i274) | (i289 ^ i274);
                                        int i291 = i285 / (398 % ((i290 & i280) | (i290 ^ i280)));
                                        Object[] objArr27 = new Object[1];
                                        b(cArr2, bLastIndexOf, i291, objArr27);
                                        obj = objArr27[0];
                                    } else {
                                        int i292 = ~((i288 & i275) | (i275 ^ i288));
                                        int i293 = ~((i13 & i273) | (i273 ^ i13));
                                        int i294 = (i292 & i293) | (i292 ^ i293);
                                        int i295 = ~(windowTouchSlop | i275);
                                        int i296 = i285 + (((i294 & i295) | (i294 ^ i295)) * 398);
                                        Object[] objArr28 = new Object[1];
                                        b(cArr2, bLastIndexOf, i296, objArr28);
                                        obj = objArr28[0];
                                    }
                                    String str3 = (String) obj;
                                    int i297 = getAsAtTimestamp;
                                    int i298 = ((i297 | 63) << 1) - (i297 ^ 63);
                                    getRequestBeneficiariesState = i298 % 128;
                                    if (i298 % 2 != 0) {
                                        cls = Class.forName(str3);
                                        cArr3 = new char[]{31, 20, 22, ' ', 15, 3, 23, 20, ' ', 23, 4, 2, 13741, 13741, '\b', 7, CharUtils.CR, 14, 30, 17, 24, 22, 13817};
                                        i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        i15 = (-743) >> i14;
                                        i16 = 4;
                                    } else {
                                        cls = Class.forName(str3);
                                        cArr3 = new char[]{31, 20, 22, ' ', 15, 3, 23, 20, ' ', 23, 4, 2, 13741, 13741, '\b', 7, CharUtils.CR, 14, 30, 17, 24, 22, 13817};
                                        i14 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        i15 = i14 * (-743);
                                        i16 = 2;
                                    }
                                    int i299 = (i14 ^ i16) | (i14 & i16);
                                    int i300 = ~i299;
                                    int i301 = ~(i14 | i);
                                    int i302 = (i300 & i301) | (i300 ^ i301);
                                    int i303 = ~(i16 | i);
                                    int i304 = ((i15 + ((-743) * i16)) - (~(((i302 & i303) | (i302 ^ i303)) * (-744)))) - 1;
                                    int i305 = ~i14;
                                    int i306 = ~i16;
                                    int i307 = ~((i305 & i306) | (i305 ^ i306));
                                    int i308 = i304 + (((i307 & i3) | (i3 ^ i307)) * 744);
                                    int i309 = ((i299 ^ i) | (i299 & i)) * 744;
                                    byte b10 = (byte) (((i308 | i309) << 1) - (i309 ^ i308));
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                    int i310 = ((packedPositionChild | 24) << 1) - (packedPositionChild ^ 24);
                                    Object[] objArr29 = new Object[1];
                                    b(cArr3, b10, i310, objArr29);
                                    if (!obj3.equals(cls.getMethod((String) objArr29[0], null).invoke(objInvoke4, null))) {
                                        int i311 = (((-69647) & i3) | ((-69647) ^ i3)) * 494;
                                        int i312 = ((-1693373378) ^ i311) + ((i311 & (-1693373378)) << 1);
                                        int i313 = (~(((-541399120) & i3) | (i3 ^ (-541399120)))) | (-1777180672);
                                        int i314 = ((i313 & 541329473) | (i313 ^ 541329473)) * 494;
                                        int i315 = (i312 ^ i314) + ((i314 & i312) << 1);
                                        int i316 = (i3 ^ (-1259008484)) | (i3 & (-1259008484));
                                        int i317 = -(-((~((i316 & (-1213244043)) | (i316 ^ (-1213244043)))) * (-116)));
                                        int i318 = ((841199069 | i317) << 1) - (i317 ^ 841199069);
                                        int i319 = ((-1259008484) | i) * 116;
                                        int i320 = ((i318 | i319) << 1) - (i319 ^ i318);
                                        int i321 = ~(1213244042 | i);
                                        if (i315 <= i320 + (((i321 & (-1264251884)) | ((-1264251884) ^ i321)) * 116)) {
                                            throw null;
                                        }
                                        try {
                                            char[] cArr9 = {23, 19, 24, 19, 16, 2, 23, 31, '\n', 7, 14, 18, '\b', 16, 31, 23, '\b', 18, 15, 2, 5, 25, 15, 29, 18, 7, 18, 14, 30, CharUtils.CR, 30, 23, 21, 20};
                                            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                            Object[] objArr30 = new Object[1];
                                            b(cArr9, (byte) ((packedPositionType & 115) + (packedPositionType | 115)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33, objArr30);
                                            Class<?> cls10 = Class.forName((String) objArr30[0]);
                                            char[] cArr10 = {31, 20, 22, ' ', 15, 3, 23, 20, ' ', 23, 4, 2, 13741, 13741, '\b', 7, CharUtils.CR, 14, 30, 17, 24, 22, 13817};
                                            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                                            int iComponent312 = CachingCacheStorage.component2.component3();
                                            int i322 = (scrollBarSize2 * (-813)) + 1224;
                                            int i323 = ~(((-4) & scrollBarSize2) | ((-4) ^ scrollBarSize2));
                                            int i324 = ~((scrollBarSize2 ^ iComponent312) | (scrollBarSize2 & iComponent312));
                                            int i325 = ((i323 & i324) | (i323 ^ i324)) * (-814);
                                            int i326 = ((i322 | i325) << 1) - (i322 ^ i325);
                                            int i327 = ~((~iComponent312) | (-4));
                                            int i328 = ~scrollBarSize2;
                                            int i329 = ~((i328 ^ 3) | (i328 & 3));
                                            int i330 = (i327 & i329) | (i327 ^ i329);
                                            int i331 = -(-(((i330 & i324) | (i330 ^ i324)) * 407));
                                            int i332 = ((i326 | i331) << 1) - (i331 ^ i326);
                                            int i333 = ~((i328 ^ 3) | (i328 & 3));
                                            int i334 = ~((i328 & iComponent312) | (i328 ^ iComponent312));
                                            int i335 = (i334 & i333) | (i333 ^ i334);
                                            int i336 = ~((iComponent312 & 3) | (iComponent312 ^ 3));
                                            int i337 = -(-(((i335 & i336) | (i335 ^ i336)) * 407));
                                            byte b11 = (byte) ((i332 & i337) + (i337 | i332));
                                            int i338 = -TextUtils.indexOf("", "");
                                            int iComponent313 = CachingCacheStorage.component2.component3();
                                            int i339 = i338 * (-167);
                                            int i340 = (i339 ^ (-3841)) + ((i339 & (-3841)) << 1);
                                            int i341 = ~i338;
                                            int i342 = ~((i341 ^ (-24)) | (i341 & (-24)));
                                            int i343 = ~iComponent313;
                                            int i344 = ~((i343 & (-24)) | ((-24) ^ i343));
                                            int i345 = i340 + (((i342 & i344) | (i342 ^ i344)) * 168);
                                            int i346 = (i341 ^ (-24)) | (i341 & (-24));
                                            int i347 = (i345 - (~(-(-((~((i346 & iComponent313) | (i346 ^ iComponent313))) * 168))))) - 1;
                                            int i348 = ~i338;
                                            int i349 = ~iComponent313;
                                            int i350 = ~((i348 & i349) | (i348 ^ i349));
                                            int i351 = ~((i341 & 23) | (i341 ^ 23));
                                            int i352 = (i351 & i350) | (i350 ^ i351);
                                            int i353 = ~(i338 | (-24) | iComponent313);
                                            int i354 = -(-(((i353 & i352) | (i352 ^ i353)) * 168));
                                            int i355 = (i347 ^ i354) + ((i354 & i347) << 1);
                                            Object[] objArr31 = new Object[1];
                                            b(cArr10, b11, i355, objArr31);
                                            Object objInvoke5 = cls10.getMethod((String) objArr31[0], null).invoke(objInvoke4, null);
                                            ?? r2 = r24;
                                            if (!r2.equals(objInvoke5)) {
                                                int i356 = i277 - 39;
                                                r24 = r2;
                                                objNewInstance = obj3;
                                                length = i218;
                                                i4 = i222;
                                                i9 = (i356 | 40) + (i356 & 40);
                                                objArr = objArr17;
                                            }
                                        } catch (Throwable th8) {
                                            Throwable cause7 = th8.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th8;
                                        }
                                        NewInstance = i2;
                                        objArr2 = new Object[]{new int[1], new int[]{i}, new int[]{i}, null};
                                        int i1442 = ~i;
                                        int i1452 = (~((-163586740) | i1442)) | 29360816;
                                        int i1462 = ~(i | 163836671);
                                        int i1472 = 2047425231 + ((i1452 | i1462) * (-502)) + (((~(i1442 | (-134225924))) | i1462) * 502);
                                        int iComponent362 = CachingCacheStorage.component2.component3();
                                        int i1482 = ~NewInstance;
                                        int i1492 = ~iComponent362;
                                        int i1502 = ~((i1492 & i1482) | (i1482 ^ i1492));
                                        int i1512 = ~NewInstance;
                                        int i1522 = (i1472 * (-244)) + (NewInstance * 246) + ((i1502 | (~((i1512 & i1472) | (i1512 ^ i1472)))) * (-245));
                                        int i1532 = (~((i1482 ^ iComponent362) | (i1482 & iComponent362))) * (-245);
                                        int i1542 = (i1522 & i1532) + (i1522 | i1532);
                                        int i1552 = ~((iComponent362 & i1482) | (i1482 ^ iComponent362));
                                        int i1562 = -(-(((i1552 & i1472) | (i1472 ^ i1552)) * 245));
                                        int i1572 = ((i1542 | i1562) << 1) - (i1562 ^ i1542);
                                        int i1582 = i1572 << 13;
                                        int i1592 = (i1582 | i1572) & (~(i1572 & i1582));
                                        int i1602 = i1592 ^ (i1592 >>> 17);
                                        ((int[]) objArr2[0])[0] = i1602 ^ (i1602 << 5);
                                    }
                                    int[] iArr = new int[1];
                                    objArr2 = new Object[]{iArr, new int[]{(~(i & 1)) & (i | 1)}, new int[]{i}, null};
                                    int i357 = (-758082789) + (((~((-583084347) | i3)) | 549455920 | (~(389886858 | i3)) | (~((-356258433) | i))) * (-84));
                                    int i358 = (~(389886858 | i)) | 583084346;
                                    int i359 = ~((-389886859) | i3);
                                    int i360 = i357 + ((i358 | i359) * (-84)) + ((356258432 | i359) * 84) + 16;
                                    int i361 = getRequestBeneficiariesState;
                                    int i362 = (i361 & 29) + (i361 | 29);
                                    int i363 = i362 % 128;
                                    getAsAtTimestamp = i363;
                                    if (i362 % 2 == 0) {
                                        i17 = i2;
                                        i18 = (714 >> i360) - ((-712) << i17);
                                        int i364 = ~i360;
                                        i19 = (i364 & i3) | (i364 ^ i3);
                                    } else {
                                        i17 = i2;
                                        int i365 = i360 * 714;
                                        int i366 = i17 * (-712);
                                        i18 = ((i365 | i366) << 1) - (i365 ^ i366);
                                        i19 = (~i360) | i3;
                                    }
                                    int i367 = ~i19;
                                    int i368 = ~i360;
                                    int i369 = ~((i368 & i17) | (i368 ^ i17));
                                    int i370 = (i367 & i369) | (i367 ^ i369);
                                    int i371 = ~i17;
                                    int i372 = (i360 & i371) | (i371 ^ i360);
                                    int i373 = -(-((-713) * (i370 | (~((i372 ^ i) | (i372 & i))))));
                                    int i374 = (((((i18 | i373) << 1) - (i18 ^ i373)) + ((~(i372 | i)) * 1426)) - (~((~((i371 ^ i222) | (i371 & i222))) * 713))) - 1;
                                    int i375 = i374 << 13;
                                    int i376 = (i375 | i374) & (~(i374 & i375));
                                    int i377 = (i363 ^ 49) + ((i363 & 49) << 1);
                                    getRequestBeneficiariesState = i377 % 128;
                                    if (i377 % 2 != 0) {
                                        int i378 = ((i376 | (-59)) << 1) - (i376 ^ (-59));
                                        int i379 = (i378 & (~i376)) | ((~i378) & i376);
                                        int i380 = i379 >> 2;
                                        iArr[1] = ((~i379) & i380) | ((~i380) & i379);
                                    } else {
                                        int i381 = (i376 >>> 17) ^ i376;
                                        iArr[0] = i381 ^ (i381 << 5);
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    }
                    NewInstance = i2;
                    objArr2 = new Object[]{new int[1], new int[]{i}, new int[]{i}, null};
                    int i14422 = ~i;
                    int i14522 = (~((-163586740) | i14422)) | 29360816;
                    int i14622 = ~(i | 163836671);
                    int i14722 = 2047425231 + ((i14522 | i14622) * (-502)) + (((~(i14422 | (-134225924))) | i14622) * 502);
                    int iComponent3622 = CachingCacheStorage.component2.component3();
                    int i14822 = ~NewInstance;
                    int i14922 = ~iComponent3622;
                    int i15022 = ~((i14922 & i14822) | (i14822 ^ i14922));
                    int i15122 = ~NewInstance;
                    int i15222 = (i14722 * (-244)) + (NewInstance * 246) + ((i15022 | (~((i15122 & i14722) | (i15122 ^ i14722)))) * (-245));
                    int i15322 = (~((i14822 ^ iComponent3622) | (i14822 & iComponent3622))) * (-245);
                    int i15422 = (i15222 & i15322) + (i15222 | i15322);
                    int i15522 = ~((iComponent3622 & i14822) | (i14822 ^ iComponent3622));
                    int i15622 = -(-(((i15522 & i14722) | (i14722 ^ i15522)) * 245));
                    int i15722 = ((i15422 | i15622) << 1) - (i15622 ^ i15422);
                    int i15822 = i15722 << 13;
                    int i15922 = (i15822 | i15722) & (~(i15722 & i15822));
                    int i16022 = i15922 ^ (i15922 >>> 17);
                    ((int[]) objArr2[0])[0] = i16022 ^ (i16022 << 5);
                } else {
                    NewInstance = i20;
                    objArr2 = new Object[]{new int[1], new int[]{i}, new int[]{i}, null};
                    int i144222 = ~i;
                    int i145222 = (~((-163586740) | i144222)) | 29360816;
                    int i146222 = ~(i | 163836671);
                    int i147222 = 2047425231 + ((i145222 | i146222) * (-502)) + (((~(i144222 | (-134225924))) | i146222) * 502);
                    int iComponent36222 = CachingCacheStorage.component2.component3();
                    int i148222 = ~NewInstance;
                    int i149222 = ~iComponent36222;
                    int i150222 = ~((i149222 & i148222) | (i148222 ^ i149222));
                    int i151222 = ~NewInstance;
                    int i152222 = (i147222 * (-244)) + (NewInstance * 246) + ((i150222 | (~((i151222 & i147222) | (i151222 ^ i147222)))) * (-245));
                    int i153222 = (~((i148222 ^ iComponent36222) | (i148222 & iComponent36222))) * (-245);
                    int i154222 = (i152222 & i153222) + (i152222 | i153222);
                    int i155222 = ~((iComponent36222 & i148222) | (i148222 ^ iComponent36222));
                    int i156222 = -(-(((i155222 & i147222) | (i147222 ^ i155222)) * 245));
                    int i157222 = ((i154222 | i156222) << 1) - (i156222 ^ i154222);
                    int i158222 = i157222 << 13;
                    int i159222 = (i158222 | i157222) & (~(i157222 & i158222));
                    int i160222 = i159222 ^ (i159222 >>> 17);
                    ((int[]) objArr2[0])[0] = i160222 ^ (i160222 << 5);
                }
                int i382 = getRequestBeneficiariesState + 77;
                getAsAtTimestamp = i382 % 128;
                int i383 = i382 % 2;
                return objArr2;
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 99;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 15;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 109;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectAddBeneficiaryFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component1 + 79;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    static {
        Intrinsics.checkNotNullExpressionValue("FamilyConnectAddBeneficiaryFragment", "");
        copydefault = "FamilyConnectAddBeneficiaryFragment";
        int i = hashCode + 65;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    private final FamilyConnectViewModel component3() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.component3.getValue();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return familyConnectViewModel;
    }

    private final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.getAsAtTimestamp.getValue();
        int i4 = component4 + 119;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    private static final String component2() {
        int i = 2 % 2;
        int i2 = equals + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        int i4 = component4 + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return strReplaceFirst$default;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        equals = i2 % 128;
        int i3 = i2 % 2;
        component3().previousScreen();
        int i4 = component4 + 111;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = equals + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ShareDataUIState();
        FamilyConnectBalanceResponse balanceResponse = component3().getBalanceResponse();
        if (balanceResponse != null) {
            int i4 = equals + 55;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            copydefault(balanceResponse);
        }
    }

    @Override
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = component4 + 73;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            component3().resetAddBeneficiaryForm();
        } else {
            super.onDestroyView();
            component3().resetAddBeneficiaryForm();
            throw null;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        component3().getManageBeneficiaryData().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 105;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$0nS7epk7sYKZCf1bVr1MOFyPOpg = FamilyConnectAddBeneficiaryFragment.$r8$lambda$0nS7epk7sYKZCf1bVr1MOFyPOpg(this.f$0, (Resource) obj);
                int i5 = copydefault + 49;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 52 / 0;
                }
                return unit$r8$lambda$0nS7epk7sYKZCf1bVr1MOFyPOpg;
            }
        }));
        int i2 = equals + 1;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void component1(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
        FamilyConnectViewModel familyConnectViewModelComponent3 = familyConnectAddBeneficiaryFragment.component3();
        FamilyConnectViewModel.showDashboard$default(familyConnectViewModelComponent3, null, 1, null);
        familyConnectViewModelComponent3.familyConnectQueryBalance(new FamilyConnectCheckStatusPayload(familyConnectAddBeneficiaryFragment.component1()));
        int i2 = component4 + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit copydefault(final FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, Resource resource) {
        String message;
        int i = 2 % 2;
        int i2 = component4 + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
        Object obj = null;
        if (resource.loading()) {
            int i4 = equals + 117;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                DialogUtils.showLoading(familyConnectAddBeneficiaryFragment);
                obj.hashCode();
                throw null;
            }
            DialogUtils.showLoading(familyConnectAddBeneficiaryFragment);
        } else if (resource.success()) {
            FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment2 = familyConnectAddBeneficiaryFragment;
            DialogUtils.hideLoading(familyConnectAddBeneficiaryFragment2);
            FamilyConnectViewModel familyConnectViewModelComponent3 = familyConnectAddBeneficiaryFragment.component3();
            Object data = resource.getData();
            String string = familyConnectAddBeneficiaryFragment.getString(R.string.the_beneficiary_was_added_successfully);
            Intrinsics.checkNotNullExpressionValue(string, "");
            ToastHelperKt.showCustomToast$default(familyConnectAddBeneficiaryFragment2, familyConnectViewModelComponent3.extractCustomerMessage(data, string), 1000L, (Integer) null, (String) null, (Function0) null, 28, (Object) null);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                private static int component1 = 0;
                private static int component2 = 1;

                @Override
                public final void run() {
                    int i5 = 2 % 2;
                    int i6 = component2 + 17;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    FamilyConnectAddBeneficiaryFragment.$r8$lambda$KpbtysjBCfm3FS0KZP9DIv0AYV8(this.f$0);
                    int i8 = component1 + 47;
                    component2 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 71 / 0;
                    }
                }
            }, 1000L);
        } else if (resource.error()) {
            int i5 = component4 + 113;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                DialogUtils.hideLoading(familyConnectAddBeneficiaryFragment);
                familyConnectAddBeneficiaryFragment.component3();
                resource.getData();
                resource.getException();
                obj.hashCode();
                throw null;
            }
            FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment3 = familyConnectAddBeneficiaryFragment;
            DialogUtils.hideLoading(familyConnectAddBeneficiaryFragment3);
            FamilyConnectViewModel familyConnectViewModelComponent32 = familyConnectAddBeneficiaryFragment.component3();
            Object data2 = resource.getData();
            BaseException exception = resource.getException();
            if (exception == null || (message = exception.getMessage()) == null) {
                message = "Failed to add beneficiary";
            }
            ToastHelperKt.showCustomToast$default(familyConnectAddBeneficiaryFragment3, familyConnectViewModelComponent32.extractCustomerMessage(data2, message), 5000L, (Integer) null, (String) null, (Function0) null, 28, (Object) null);
        }
        return Unit.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;
        final FamilyConnectBalanceResponse component2;

        public static final AddBeneficiaryFormState copydefault(State state) {
            int i = 2 % 2;
            int i2 = component1 + 85;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AddBeneficiaryFormState addBeneficiaryFormStateComponent2 = component2(state);
            int i4 = component1 + 23;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return addBeneficiaryFormStateComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 0;
            private static int copy = 1;
            final FamilyConnectAddBeneficiaryFragment ShareDataUIState;
            final FamilyConnectBalanceResponse component2;
            final String component3;
            final State<AddBeneficiaryFormState> copydefault;

            public static Object component1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = (~((~i4) | i2)) | (~(i4 | i3));
                int i8 = ~i2;
                int i9 = (~(i8 | i3)) | i4;
                int i10 = (~(i3 | i2)) | (~(i8 | (~i3))) | i4;
                int i11 = i2 + i4 + i + ((-737137436) * i5) + ((-1840598144) * i6);
                int i12 = i11 * i11;
                int i13 = (((-699670985) * i2) - 818937856) + (24099949 * i4) + (723770934 * i7) + ((-1447541868) * i9) + ((-723770934) * i10) + ((-1423441920) * i) + (1335885824 * i5) + ((-1946157056) * i6) + ((-1593638912) * i12);
                int i14 = (i2 * 1252406331) + 1981669868 + (i4 * 1252405337) + (i7 * (-994)) + (i9 * 1988) + (i10 * 994) + (i * 1252407325) + (i5 * (-1820396076)) + (i6 * 1320834432) + (i12 * (-447283200));
                if (i13 + (i14 * i14 * 1511325696) != 1) {
                    return component2(objArr);
                }
                final FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment = (FamilyConnectAddBeneficiaryFragment) objArr[0];
                final FamilyConnectBalanceResponse familyConnectBalanceResponse = (FamilyConnectBalanceResponse) objArr[1];
                final String str = (String) objArr[2];
                final String str2 = (String) objArr[3];
                final int iIntValue = ((Number) objArr[4]).intValue();
                PinValidationType pinValidationType = (PinValidationType) objArr[5];
                int i15 = 2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(familyConnectBalanceResponse, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(pinValidationType, "");
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment).showPinScreen(pinValidationType, new Runnable() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Override
                    public final void run() {
                        int i16 = 2 % 2;
                        int i17 = ShareDataUIState + 87;
                        component1 = i17 % 128;
                        int i18 = i17 % 2;
                        FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.ShareDataUIState(familyConnectAddBeneficiaryFragment, str, str2, iIntValue, familyConnectBalanceResponse);
                        int i19 = ShareDataUIState + 51;
                        component1 = i19 % 128;
                        int i20 = i19 % 2;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i16 = component1 + 37;
                copy = i16 % 128;
                int i17 = i16 % 2;
                return unit;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copy + 27;
                component1 = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component3(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                component3(composer2, num2.intValue());
                int i3 = 51 / 0;
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component3(androidx.compose.runtime.Composer r20, int r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = 2
                    int r2 = r1 % r1
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component1
                    int r2 = r2 + 85
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.copy = r3
                    int r2 = r2 % r1
                    if (r2 != 0) goto L16
                    r2 = r21 & 101(0x65, float:1.42E-43)
                    r3 = 4
                    if (r2 != r3) goto L26
                    goto L1a
                L16:
                    r2 = r21 & 11
                    if (r2 != r1) goto L26
                L1a:
                    boolean r2 = r20.getSkipping()
                    if (r2 != 0) goto L21
                    goto L26
                L21:
                    r20.skipToGroupEnd()
                    goto La3
                L26:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    androidx.compose.runtime.MutableState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryMsisdn$p(r2)
                    java.lang.Object r2 = r2.getValue()
                    r6 = r2
                    java.lang.String r6 = (java.lang.String) r6
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    androidx.compose.runtime.MutableState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryNickname$p(r2)
                    java.lang.Object r2 = r2.getValue()
                    r8 = r2
                    java.lang.String r8 = (java.lang.String) r8
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    androidx.compose.runtime.MutableState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$getLimitText$p(r2)
                    java.lang.Object r2 = r2.getValue()
                    r10 = r2
                    java.lang.String r10 = (java.lang.String) r10
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.AddBeneficiaryFormState> r2 = r0.copydefault
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.AddBeneficiaryFormState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.copydefault(r2)
                    java.lang.String r13 = r2.getAmountError()
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.AddBeneficiaryFormState> r2 = r0.copydefault
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.AddBeneficiaryFormState r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.copydefault(r2)
                    boolean r14 = r2.isFormValid()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$copydefault$4$1 r2 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$copydefault$4$1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r3 = r0.ShareDataUIState
                    r2.<init>(r3)
                    kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda0 r3 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r4 = r0.ShareDataUIState
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse r5 = r0.component2
                    r3.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda1 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r5 = r0.ShareDataUIState
                    r4.<init>()
                    r5 = r2
                    kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda2 r7 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    java.lang.String r9 = r0.component3
                    r7.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda3 r9 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    java.lang.String r11 = r0.component3
                    r9.<init>()
                    java.lang.String r11 = r0.component3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda4 r12 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment$showAddBeneficiaryScreen$1$2$$ExternalSyntheticLambda4
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r2 = r0.ShareDataUIState
                    r12.<init>()
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r15 = r20
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.manage.AddBeneficiaryScreenKt.AddBeneficiaryScreen(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                La3:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.copy
                    int r2 = r2 + 45
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component1 = r3
                    int r2 = r2 % r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component3(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component3(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                int i = 2 % 2;
                int i2 = component1 + 95;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryMsisdn$p(familyConnectAddBeneficiaryFragment).setValue(str2);
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment).updateAddBeneficiaryForm(str2, (String) FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryNickname$p(familyConnectAddBeneficiaryFragment).getValue(), (String) FamilyConnectAddBeneficiaryFragment.access$getLimitText$p(familyConnectAddBeneficiaryFragment).getValue(), str);
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 59;
                copy = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                int i = 2 % 2;
                int i2 = component1 + 91;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryNickname$p(familyConnectAddBeneficiaryFragment).setValue(str2);
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment).updateAddBeneficiaryForm((String) FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryMsisdn$p(familyConnectAddBeneficiaryFragment).getValue(), str2, (String) FamilyConnectAddBeneficiaryFragment.access$getLimitText$p(familyConnectAddBeneficiaryFragment).getValue(), str);
                Unit unit = Unit.INSTANCE;
                int i4 = copy + 15;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            private static Object component2(Object[] objArr) {
                FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment = (FamilyConnectAddBeneficiaryFragment) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                int i = 2 % 2;
                int i2 = component1 + 83;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                FamilyConnectAddBeneficiaryFragment.access$getLimitText$p(familyConnectAddBeneficiaryFragment).setValue(str2);
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment).updateAddBeneficiaryForm((String) FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryMsisdn$p(familyConnectAddBeneficiaryFragment).getValue(), (String) FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryNickname$p(familyConnectAddBeneficiaryFragment).getValue(), str2, str);
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 7;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 7 / 0;
                }
                return unit;
            }

            private static final void component1(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2, int i, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                copy = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(familyConnectAddBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(familyConnectBalanceResponse, "");
                FamilyConnectAddBeneficiaryFragment.access$addBeneficiary(familyConnectAddBeneficiaryFragment, str, str2, i, familyConnectBalanceResponse);
                int i5 = component1 + 119;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void component1() {
                    int i = 2 % 2;
                    int i2 = copydefault + 63;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ((FamilyConnectAddBeneficiaryFragment) this.receiver).handleBackAction();
                    int i4 = copydefault + 3;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 51;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component1();
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 105;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass1(Object obj) {
                    super(0, obj, FamilyConnectAddBeneficiaryFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit component2(com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment r3) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component1
                    int r1 = r1 + 15
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.copy = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    if (r1 != 0) goto L2a
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    androidx.compose.runtime.MutableState r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$isManagingBeneficiary$p(r3)
                    java.lang.Object r1 = r1.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    r2 = 39
                    int r2 = r2 / 0
                    r2 = 1
                    r1 = r1 ^ r2
                    if (r1 == r2) goto L3d
                    goto L4d
                L2a:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    androidx.compose.runtime.MutableState r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$isManagingBeneficiary$p(r3)
                    java.lang.Object r1 = r1.getValue()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L4d
                L3d:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(r3)
                    r3.showContactPicker()
                    int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component1
                    int r3 = r3 + 29
                    int r1 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.copy = r1
                    int r3 = r3 % r0
                L4d:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component1
                    int r1 = r1 + 13
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.copy = r2
                    int r1 = r1 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment.copydefault.AnonymousClass4.component2(com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectAddBeneficiaryFragment):kotlin.Unit");
            }

            public static Unit component2(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                int i = 2 % 2;
                int i2 = copy + 89;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    copydefault(familyConnectAddBeneficiaryFragment, str, str2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitCopydefault = copydefault(familyConnectAddBeneficiaryFragment, str, str2);
                int i3 = component1 + 51;
                copy = i3 % 128;
                int i4 = i3 % 2;
                return unitCopydefault;
            }

            public static Unit component1(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component1 + 39;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    int iComponent2 = KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2();
                    unit = (Unit) component1(KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), 1947586045, iComponent2, -1947586045, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), new Object[]{familyConnectAddBeneficiaryFragment, str, str2}, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2());
                    int i3 = 92 / 0;
                } else {
                    int iComponent22 = KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2();
                    unit = (Unit) component1(KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), 1947586045, iComponent22, -1947586045, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), new Object[]{familyConnectAddBeneficiaryFragment, str, str2}, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2());
                }
                int i4 = component1 + 5;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 31 / 0;
                }
                return unit;
            }

            public static Unit ShareDataUIState(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                int i = 2 % 2;
                int i2 = component1 + 93;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    component3(familyConnectAddBeneficiaryFragment, str, str2);
                    throw null;
                }
                Unit unitComponent3 = component3(familyConnectAddBeneficiaryFragment, str, str2);
                int i3 = component1 + 97;
                copy = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent3;
            }

            public static Unit component3(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
                int i = 2 % 2;
                int i2 = copy + 61;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(familyConnectAddBeneficiaryFragment);
                int i4 = component1 + 89;
                copy = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent2;
            }

            public static void ShareDataUIState(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2, int i, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
                int i2 = 2 % 2;
                int i3 = copy + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(familyConnectAddBeneficiaryFragment, str, str2, i, familyConnectBalanceResponse);
                int i5 = component1 + 125;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }

            public static Unit component2(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, FamilyConnectBalanceResponse familyConnectBalanceResponse, String str, String str2, int i, PinValidationType pinValidationType) {
                int i2 = 2 % 2;
                int i3 = component1 + 25;
                copy = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {familyConnectAddBeneficiaryFragment, familyConnectBalanceResponse, str, str2, Integer.valueOf(i), pinValidationType};
                Unit unit = (Unit) component1(KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), -933568152, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), 933568153, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), objArr, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2());
                int i5 = copy + 15;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass4(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, State<AddBeneficiaryFormState> state, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
                this.ShareDataUIState = familyConnectAddBeneficiaryFragment;
                this.component3 = str;
                this.copydefault = state;
                this.component2 = familyConnectBalanceResponse;
            }

            private static final Unit ShareDataUIState(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, FamilyConnectBalanceResponse familyConnectBalanceResponse, String str, String str2, int i, PinValidationType pinValidationType) {
                Object[] objArr = {familyConnectAddBeneficiaryFragment, familyConnectBalanceResponse, str, str2, Integer.valueOf(i), pinValidationType};
                return (Unit) component1(KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), -933568152, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), 933568153, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), objArr, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2());
            }

            private static final Unit getAsAtTimestamp(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, String str, String str2) {
                int iComponent2 = KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2();
                return (Unit) component1(KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), 1947586045, iComponent2, -1947586045, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2(), new Object[]{familyConnectAddBeneficiaryFragment, str, str2}, KeyPairGeneratorSpi.MLDSA65_ECDSA_P256_SHA512.component2());
            }
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 95;
            component1 = i4 % 128;
            if (i4 % 2 == 0 ? (i & 11) == 2 : (i & 50) == 2) {
                int i5 = i3 + 61;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(FamilyConnectAddBeneficiaryFragment.this).getSelectedPhoneNumber(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            State stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(FamilyConnectAddBeneficiaryFragment.this).getAddBeneficiaryFormState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            String strComponent1 = component1(stateCollectAsStateWithLifecycle);
            if (strComponent1 != null) {
                FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment = FamilyConnectAddBeneficiaryFragment.this;
                FamilyConnectBalanceResponse familyConnectBalanceResponse = this.component2;
                FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryMsisdn$p(familyConnectAddBeneficiaryFragment).setValue(strComponent1);
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment);
                double sponsorBalance = familyConnectBalanceResponse.getSponsorBalance();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sponsorBalance)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectAddBeneficiaryFragment).updateAddBeneficiaryForm(strComponent1, (String) FamilyConnectAddBeneficiaryFragment.access$getBeneficiaryNickname$p(familyConnectAddBeneficiaryFragment).getValue(), (String) FamilyConnectAddBeneficiaryFragment.access$getLimitText$p(familyConnectAddBeneficiaryFragment).getValue(), str);
            }
            Object obj = null;
            if (!((Boolean) FamilyConnectAddBeneficiaryFragment.access$isManagingBeneficiary$p(FamilyConnectAddBeneficiaryFragment.this).getValue()).booleanValue()) {
                DialogUtils.showOrHideLoading(FamilyConnectAddBeneficiaryFragment.this.requireActivity(), Resource.success(null));
            } else {
                int i7 = component1 + 35;
                component3 = i7 % 128;
                if (i7 % 2 == 0) {
                    DialogUtils.showLoading(FamilyConnectAddBeneficiaryFragment.this.requireActivity());
                    obj.hashCode();
                    throw null;
                }
                DialogUtils.showLoading(FamilyConnectAddBeneficiaryFragment.this.requireActivity());
            }
            FamilyConnectAddBeneficiaryFragment.access$getFamilyConnectViewModel(FamilyConnectAddBeneficiaryFragment.this);
            double sponsorBalance2 = this.component2.getSponsorBalance();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sponsorBalance2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2145962356, true, new AnonymousClass4(FamilyConnectAddBeneficiaryFragment.this, str2, stateCollectAsStateWithLifecycle2, this.component2), composer, 54), composer, 1572864, 63);
        }

        private static final String component1(State<String> state) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String value = state.getValue();
            int i4 = component3 + 19;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final AddBeneficiaryFormState component2(State<AddBeneficiaryFormState> state) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AddBeneficiaryFormState value = state.getValue();
            if (i3 == 0) {
                throw null;
            }
            int i4 = component1 + 47;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        copydefault(FamilyConnectBalanceResponse familyConnectBalanceResponse) {
            this.component2 = familyConnectBalanceResponse;
        }
    }

    private final void copydefault(FamilyConnectBalanceResponse familyConnectBalanceResponse) {
        int i = 2 % 2;
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(274301289, true, new copydefault(familyConnectBalanceResponse)));
        int i2 = component4 + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void component3(String str, String str2, int i, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
        int i2 = 2 % 2;
        this.component2 = "1";
        this.copy.setValue(true);
        component3().familyConnectManageBeneficiaries(new FamilyConnectManageBeneficiaryPayload(str, str2, i, "1", familyConnectBalanceResponse.getSponsorMsisdn()));
        int i3 = equals + 109;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static Unit $r8$lambda$0nS7epk7sYKZCf1bVr1MOFyPOpg(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 83;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(familyConnectAddBeneficiaryFragment, resource);
        int i4 = equals + 97;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return unitCopydefault;
    }

    public static void $r8$lambda$KpbtysjBCfm3FS0KZP9DIv0AYV8(FamilyConnectAddBeneficiaryFragment familyConnectAddBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = equals + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component1(familyConnectAddBeneficiaryFragment);
        int i4 = equals + 35;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static String $r8$lambda$MRX7k7cNJwPPP51dndJsMZH1AWo() {
        int i = 2 % 2;
        int i2 = equals + 25;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            component2();
            obj.hashCode();
            throw null;
        }
        String strComponent2 = component2();
        int i3 = component4 + 69;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return strComponent2;
        }
        throw null;
    }
}
