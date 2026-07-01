package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkoutUi.databinding.ActivitySfcCommonSuccessBinding;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyOrderInfo;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/activity/SfcRequestMoneyResultActivity;", "Lcom/huawei/digitalpayment/checkout/ui/activity/SfcCommonSuccessActivity;", "<init>", "()V", "requestMoneyOrderInfo", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "manageFavoriteViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "getManageFavoriteViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "manageFavoriteViewModel$delegate", "Lkotlin/Lazy;", "initData", "", "initObserver", "onBackPressed", "refreshFavorteFuction", "favoriteFriendsBeans", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "updateSuccessUI", KeysConstants.KEY_TRANSFER_RESP, "Lcom/huawei/digitalpayment/checkout/model/response/TransferResp;", "getSpanCount", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcRequestMoneyResultActivity extends Hilt_SfcRequestMoneyResultActivity {
    public static final int $stable = 8;
    private static char ArtificialStackFrames;
    private static byte[] ShareDataUIState;
    private static int component1;
    private static short[] component2;
    private static int component3;
    private static long component4;
    private static char copy;
    private static int copydefault;
    private static char equals;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private static int hashCode;
    private static int toString;

    private final Lazy manageFavoriteViewModel;
    private RequestMoneyOrderInfo requestMoneyOrderInfo;
    private static final byte[] $$Y = {114, 69, -115, -114};
    private static final int $$Z = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$Q = {Ascii.GS, -59, -25, -119, Ascii.SYN, Ascii.VT, 19, -11, Ascii.VT, Ascii.VT, 5, Ascii.RS, 1, Ascii.DC2, Ascii.SO, Ascii.SI, 2, 7, Ascii.SI, 20, -64, 63, Ascii.SYN, 13, 7, Ascii.DLE, 9, -1, Ascii.SI, 1, Ascii.CAN, -59, 63, Ascii.SI, 3, Ascii.ETB, 10, 1, 17, 17, -59, 44, 44, 7, -1, Ascii.ESC, -8, Ascii.FF, Ascii.ETB, -21, Ascii.SUB, Ascii.SYN, Ascii.VT, -1, -55, 42, 43, Ascii.VT, 5, Ascii.RS, 1, Ascii.DC2, -33, 46, 13, 6, 17, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -56, Ascii.SYN, 8, 13, 9, 9, 1, 19, Ascii.DLE, -55, Ascii.SYN, 8, -53, Base64.padSymbol, Ascii.NAK, 7, 3, 9, Ascii.VT, 9, -41, Base64.padSymbol, Ascii.ESC, 1, Ascii.ETB, -7, Ascii.ETB, -58, Base64.padSymbol, Ascii.EM, 10, -56, Ascii.GS, 57, 10, -24, 43, -1, Ascii.VT, -55, Ascii.CAN, -4, Ascii.ETB};
    private static final int $$R = 57;
    private static final byte[] $$s = {TarHeader.LF_BLK, -58, -85, 74, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$t = 255;
    private static int getShareableDataState = 0;
    private static int coroutineCreation = 1;
    private static int getSponsorBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$aa(short r7, int r8, byte r9) {
        /*
            int r9 = 116 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$Y
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$aa(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void E(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 85 - r8
            int r9 = r9 * 8
            int r9 = r9 + 99
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$Q
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r5 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.E(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$s
            int r8 = r8 * 2
            int r8 = 103 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            int r7 = r7 + 1
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.j(byte, byte, short, java.lang.Object[]):void");
    }

    public static final ManageFavouriteViewModel access$getManageFavoriteViewModel(SfcRequestMoneyResultActivity sfcRequestMoneyResultActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = coroutineCreation + 63;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            sfcRequestMoneyResultActivity.getManageFavoriteViewModel();
            throw null;
        }
        ManageFavouriteViewModel manageFavoriteViewModel = sfcRequestMoneyResultActivity.getManageFavoriteViewModel();
        int i3 = coroutineCreation + 47;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        return manageFavoriteViewModel;
    }

    public static final void access$refreshFavorteFuction(SfcRequestMoneyResultActivity sfcRequestMoneyResultActivity, List list) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 67;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        sfcRequestMoneyResultActivity.refreshFavorteFuction(list);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcRequestMoneyResultActivity() {
        final SfcRequestMoneyResultActivity sfcRequestMoneyResultActivity = this;
        final Function0 function0 = null;
        this.manageFavoriteViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ManageFavouriteViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 93;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcRequestMoneyResultActivity.getViewModelStore();
                if (i3 == 0) {
                    int i4 = 16 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 7;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component2 + 71;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 79;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 29 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    sfcRequestMoneyResultActivity.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcRequestMoneyResultActivity.getDefaultViewModelProviderFactory();
                int i3 = component2 + 79;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i2 = component3 + 75;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = sfcRequestMoneyResultActivity.getDefaultViewModelCreationExtras();
                int i4 = component3 + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 125;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 115;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1", f = "SfcRequestMoneyResultActivity.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1", f = "SfcRequestMoneyResultActivity.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int copydefault;
            int component2;
            final SfcRequestMoneyResultActivity component3;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<List<FavoriteFriendsBean>> favoriteItems = SfcRequestMoneyResultActivity.access$getManageFavoriteViewModel(this.component3).getFavoriteItems();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends FavoriteFriendsBean>>() {
                        private static int component1 = 1;
                        private static int component2;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 0;
                            private static int component3 = 1;
                            final FlowCollector ShareDataUIState;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1$2", f = "SfcRequestMoneyResultActivity.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component3 = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component3 + 29;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    Object obj2 = null;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 == 0) {
                                        anonymousClass2.emit(null, this);
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    Object objEmit = anonymousClass2.emit(null, this);
                                    int i4 = component3 + 23;
                                    copydefault = i4 % 128;
                                    int i5 = i4 % 2;
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                                /*
                                    r8 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r10 instanceof com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L17
                                    r1 = r10
                                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L17
                                    int r10 = r1.label
                                    int r10 = r10 + r3
                                    r1.label = r10
                                    goto L1c
                                L17:
                                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r10)
                                L1c:
                                    java.lang.Object r10 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L3d
                                    int r9 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r9 = r9 + r4
                                    int r1 = r9 % 128
                                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                    int r9 = r9 % r0
                                    if (r3 != r4) goto L35
                                    kotlin.ResultKt.throwOnFailure(r10)
                                    goto L86
                                L35:
                                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                    r9.<init>(r10)
                                    throw r9
                                L3d:
                                    kotlin.ResultKt.throwOnFailure(r10)
                                    kotlinx.coroutines.flow.FlowCollector r10 = r8.ShareDataUIState
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    java.util.List r9 = (java.util.List) r9
                                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                                    java.util.ArrayList r3 = new java.util.ArrayList
                                    r3.<init>()
                                    java.util.Collection r3 = (java.util.Collection) r3
                                    java.util.Iterator r9 = r9.iterator()
                                L54:
                                    boolean r5 = r9.hasNext()
                                    if (r5 == 0) goto L72
                                    java.lang.Object r5 = r9.next()
                                    r6 = r5
                                    com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r6 = (com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean) r6
                                    java.lang.String r6 = r6.getCategory()
                                    java.lang.String r7 = "P2PTransfer"
                                    boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                                    r6 = r6 ^ r4
                                    if (r6 == r4) goto L54
                                    r3.add(r5)
                                    goto L54
                                L72:
                                    java.util.List r3 = (java.util.List) r3
                                    r1.label = r4
                                    java.lang.Object r9 = r10.emit(r3, r1)
                                    if (r9 != r2) goto L86
                                    int r9 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r9 = r9 + 91
                                    int r10 = r9 % 128
                                    com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r10
                                    int r9 = r9 % r0
                                    return r2
                                L86:
                                    kotlin.Unit r9 = kotlin.Unit.INSTANCE
                                    return r9
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity$initObserver$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.ShareDataUIState = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<? extends FavoriteFriendsBean>> flowCollector, Continuation continuation) {
                            int i5 = 2 % 2;
                            Object objCollect = favoriteItems.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i6 = component1 + 67;
                                component2 = i6 % 128;
                                int i7 = i6 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component2 + 11;
                            component1 = i8 % 128;
                            int i9 = i8 % 2;
                            return unit;
                        }
                    });
                    final SfcRequestMoneyResultActivity sfcRequestMoneyResultActivity = this.component3;
                    this.component2 = 1;
                    if (flowDistinctUntilChanged.collect(new FlowCollector() {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        @Override
                        public Object emit(Object obj2, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = copydefault + 109;
                            component3 = i6 % 128;
                            List<FavoriteFriendsBean> list = (List) obj2;
                            if (i6 % 2 == 0) {
                                return component3(list, continuation);
                            }
                            component3(list, continuation);
                            throw null;
                        }

                        public final Object component3(List<FavoriteFriendsBean> list, Continuation<? super Unit> continuation) {
                            int i5 = 2 % 2;
                            int i6 = copydefault + 57;
                            component3 = i6 % 128;
                            int i7 = i6 % 2;
                            if (!CollectionUtils.isEmpty(list)) {
                                int i8 = component3 + 69;
                                copydefault = i8 % 128;
                                if (i8 % 2 == 0) {
                                    SfcRequestMoneyResultActivity.access$refreshFavorteFuction(sfcRequestMoneyResultActivity, list);
                                    int i9 = 22 / 0;
                                } else {
                                    SfcRequestMoneyResultActivity.access$refreshFavorteFuction(sfcRequestMoneyResultActivity, list);
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            int i10 = copydefault + 75;
                            component3 = i10 % 128;
                            int i11 = i10 % 2;
                            return unit;
                        }
                    }, this) == coroutine_suspended) {
                        int i5 = copydefault + 95;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i7 = copydefault + 19;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SfcRequestMoneyResultActivity sfcRequestMoneyResultActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component3 = sfcRequestMoneyResultActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component3, continuation);
                int i2 = component1 + 43;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                int i4 = copydefault + 53;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objShareDataUIState;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 125;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 69;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SfcRequestMoneyResultActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SfcRequestMoneyResultActivity.this, null), this) == coroutine_suspended) {
                    int i5 = component3 + 93;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = copydefault + 95;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SfcRequestMoneyResultActivity.this.new component3(continuation);
            int i2 = copydefault + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = copydefault + 37;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objComponent3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 111;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static void B(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 79;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = 58224;
            char c2 = 1;
            if (i6 % 2 != 0) {
                cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 % i3];
            } else {
                cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i8 = i3;
            while (i8 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i9 = (c4 + i7) ^ ((c4 << 4) + ((char) (((long) getRequestBeneficiariesState) ^ 4374495167426960553L)));
                int i10 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copy);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iNormalizeMetaState = 844 - KeyEvent.normalizeMetaState(0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 32;
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23251);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        String str$$aa = $$aa(b2, b3, (byte) (b3 & 5));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iArgb, keyRepeatDelay, 592652048, false, str$$aa, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) equals) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getAsAtTimestamp)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 796, 31 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (23251 - TextUtils.getCapsMode("", 0, 0)), 592652048, false, $$aa(b4, b5, (byte) (b5 & 5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i11 = $11 + 1;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 4 % 5;
                    }
                    cArr3 = cArr4;
                    i3 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 465, KeyEvent.keyCodeFromString("") + 49, (char) (ViewConfiguration.getTouchSlop() >> 8), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void C(char c2, char[] cArr, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i6 = 1;
        int i7 = $11 + 1;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i9 = $10 + 71;
            $11 = i9 % 128;
            int i10 = i9 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int edgeSlop = 4037 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0');
                    char c3 = (char) ((TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 19181);
                    byte b2 = (byte) i5;
                    byte b3 = (byte) (b2 - 1);
                    String str$$aa = $$aa(b2, b3, (byte) (b3 & 17));
                    Class[] clsArr = new Class[i6];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iIndexOf, c3, 1912513118, false, str$$aa, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 7568;
                    int i11 = (ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)) + 11;
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    Class[] clsArr2 = new Class[i6];
                    clsArr2[i5] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask, i11, trimmedLength, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i12 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[i6] = Integer.valueOf(i12);
                objArr4[i5] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - ExpandableListView.getPackedPositionType(0L), 28 - (ViewConfiguration.getTouchSlop() >> 8), (char) View.MeasureSpec.makeMeasureSpec(i5, i5), 931716605, false, $$aa(b4, b5, (byte) (b5 & Ascii.DC2)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16784783, TextUtils.getCapsMode("", 0, 0) + 11, (char) Color.alpha(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component4 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) toString) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ArtificialStackFrames) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
                i5 = 0;
                i6 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void D(int r25, int r26, short r27, byte r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.D(int, int, short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel getManageFavoriteViewModel() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.getManageFavoriteViewModel():com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel");
    }

    @Override
    public void initData() {
        int i = 2 % 2;
        super.initData();
        Serializable serializableExtra = getIntent().getSerializableExtra("requestMoneyOrderInfo");
        String str = "";
        Intrinsics.checkNotNull(serializableExtra, "");
        RequestMoneyOrderInfo requestMoneyOrderInfo = (RequestMoneyOrderInfo) serializableExtra;
        this.requestMoneyOrderInfo = requestMoneyOrderInfo;
        if (requestMoneyOrderInfo == null) {
            int i2 = coroutineCreation + 113;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo = null;
        }
        String payeeName = requestMoneyOrderInfo.getPayeeName();
        if (payeeName == null) {
            payeeName = "";
        }
        setPaidToName(payeeName);
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo2 = null;
        }
        String payeeAvatar = requestMoneyOrderInfo2.getPayeeAvatar();
        if (payeeAvatar == null) {
            int i4 = coroutineCreation + 3;
            getShareableDataState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } else {
            str = payeeAvatar;
        }
        setAvatar(str);
        getManageFavoriteViewModel().queryFavourites(TradeTypeConstant.MPESA_TRANSACTION, 0, 100);
    }

    @Override
    public void initObserver() {
        int i = 2 % 2;
        super.initObserver();
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = coroutineCreation + 11;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 125;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        RouteUtils.routeWithExecute(RoutePathConstants.MAIN);
        finish();
        int i4 = getShareableDataState + 69;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void refreshFavorteFuction(List<FavoriteFriendsBean> favoriteFriendsBeans) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 125;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        if (CollectionUtils.isEmpty(favoriteFriendsBeans)) {
            return;
        }
        Iterator<FavoriteFriendsBean> it = favoriteFriendsBeans.iterator();
        while (it.hasNext()) {
            int i4 = coroutineCreation + 37;
            getShareableDataState = i4 % 128;
            RequestMoneyOrderInfo requestMoneyOrderInfo = null;
            if (i4 % 2 != 0) {
                SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(it.next().getPhoneNumber());
                SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
                requestMoneyOrderInfo.hashCode();
                throw null;
            }
            String str = SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(it.next().getPhoneNumber());
            SfcPhoneNumberUtil.Companion companion2 = SfcPhoneNumberUtil.INSTANCE;
            RequestMoneyOrderInfo requestMoneyOrderInfo2 = this.requestMoneyOrderInfo;
            String str2 = "";
            if (requestMoneyOrderInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                requestMoneyOrderInfo = requestMoneyOrderInfo2;
            }
            String payeeIdentifier = requestMoneyOrderInfo.getPayeeIdentifier();
            if (payeeIdentifier == null) {
                int i5 = coroutineCreation + 83;
                getShareableDataState = i5 % 128;
                int i6 = i5 % 2;
            } else {
                str2 = payeeIdentifier;
            }
            if (TextUtils.equals(str, companion2.formatterInputPhoneNumber(str2))) {
                updateFavoriteView();
                return;
            }
        }
    }

    @Override
    public void updateSuccessUI(TransferResp transferResp) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 107;
        getShareableDataState = i2 % 128;
        RequestMoneyOrderInfo requestMoneyOrderInfo = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transferResp, "");
            super.updateSuccessUI(transferResp);
            TextView textView = ((ActivitySfcCommonSuccessBinding) this.binding).tvSendName;
            throw null;
        }
        Intrinsics.checkNotNullParameter(transferResp, "");
        super.updateSuccessUI(transferResp);
        TextView textView2 = ((ActivitySfcCommonSuccessBinding) this.binding).tvSendName;
        RequestMoneyOrderInfo requestMoneyOrderInfo2 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo2 == null) {
            int i3 = getShareableDataState + 9;
            coroutineCreation = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            requestMoneyOrderInfo2 = null;
        }
        String payeeName = requestMoneyOrderInfo2.getPayeeName();
        textView2.setText(payeeName != null ? payeeName : "");
        TextView textView3 = ((ActivitySfcCommonSuccessBinding) this.binding).tvPhoneNumber;
        String string = getString(R.string.request_money_phone_number);
        SfcPhoneNumberUtil.Companion companion = SfcPhoneNumberUtil.INSTANCE;
        RequestMoneyOrderInfo requestMoneyOrderInfo3 = this.requestMoneyOrderInfo;
        if (requestMoneyOrderInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            requestMoneyOrderInfo = requestMoneyOrderInfo3;
        }
        String payeeIdentifier = requestMoneyOrderInfo.getPayeeIdentifier();
        textView3.setText(string + " " + companion.formatterPhoneNumberNoCountryCodePlusZero(payeeIdentifier != null ? payeeIdentifier : ""));
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 30343), new char[]{36103, 26640, 44872, 33374, 2987, 15726, 32322, 49808, 17865, 9026, 60994, 30054, 1306, 55032, 26408, 22501, 61556, 3503}, new char[]{19476, 33221, 53911, 13134}, new char[]{63541, 27644, 42221, 2934}, TextUtils.indexOf("", "", 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 32910), new char[]{50395, 19506, 45937, 19466, 36630}, new char[]{19476, 33221, 53911, 13134}, new char[]{60959, 55325, 43980, 38016}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 858251823, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getShareableDataState + 53;
                coroutineCreation = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                B(27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{47237, 29528, 26129, 54414, 29732, 6203, 24755, 40406, 50895, 5311, 23000, 9884, 5850, 28093, 18497, 29251, 55697, 9032, 50559, 12700, 30813, 22999, 61674, 62097, 22588, 42431}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{27829, 22418, 20020, 18695, 7576, 62807, 13872, 37329, 32771, 38139, 59831, 59715, 11221, 65433, 18497, 29251, 12945, 43585}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i4 = coroutineCreation + 27;
                getShareableDataState = i4 % 128;
                int i5 = i4 % 2;
            }
            if (baseContext != null) {
                int i6 = coroutineCreation + 21;
                getShareableDataState = i6 % 128;
                if (i6 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i7 = getShareableDataState + 53;
                    coroutineCreation = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getOffsetAfter("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 42, (char) ((Process.getThreadPriority(0) + 20) >> 6), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    B(48 - (Process.myPid() >> 22), new char[]{2619, 4708, 47475, 7958, 34743, 33909, 63690, 26936, 17137, 28850, 48443, 24576, 31658, 38515, 28700, 35145, 11236, 49990, 10312, 38607, 10919, 45990, 65522, 43670, 62112, 9694, 30518, 15172, 52334, 28239, 48599, 2676, 7313, 25034, 10063, 48833, 11158, 64905, 11221, 65433, 31094, 5826, 8702, 9729, 33562, 8711, 59303, 18891}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() - 2), new char[]{41311, 40662, 1802, 64076, 57555, 8556, 61390, 32723, 29932, 24967, 30324, 6787, 64242, 6535, 39468, 3244, 22511, 9390, 27761, 18341, 42425, 1966, 9925, 10296, 5858, 1660, 1469, 59987, 11503, 9231, 47434, 41303, 64612, 61604, 38298, 10868, 19842, 63728, 59533, 49208, AbstractJsonLexerKt.END_OBJ, 26225, 62614, 53779, 55674, 41352, 12727, 50997, 38608, 19944, 56966, 46318, 41012, 53024, 41760, 28305, 26899, 25458, 17910, 35413, 9848, 59035, 31543, 48986}, new char[]{19476, 33221, 53911, 13134}, new char[]{21044, 17173, 53443, 38591}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) - 116, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 63, new char[]{20591, 57695, 38397, 31283, 54006, 50232, 19220, 33923, 6596, 41678, 40108, 7846, 19205, 26301, 48978, 49032, 51183, 20148, 10312, 38607, 60358, 1447, 30022, 9077, 7228, 41255, 59845, 51229, 18553, 42806, 43941, 42425, 54946, 45411, 21705, 9490, 48381, 1805, 4207, 62556, 10523, 11910, 44660, 60285, 36122, 43794, 11696, 31940, 1906, 29074, 55096, 26422, 9367, 51713, 31101, 35808, 43651, 733, 36590, 61217, 31094, 5826, 498, 59418}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 29, new char[]{44183, 5883, 21360, 14495, 49668, 31807, 866, 9012, 37599, 45000, 59753, 13947, 43941, 42425, 27102, 18323, 54006, 50232, 19258, 45568, 33562, 8711, 47898, 1022, 16332, 26284, 4373, 59524, 7313, 25034, 41247, 35124, 33692, 15351, 56919, 31286, 36833, 21303, 61362, 36501, 15048, 23812, 56215, 43847, 61362, 36501, 5537, 45397, 37308, 28125, 36504, 61891, 50895, 5311, 32014, 53414, 2912, 62877, 58639, 22851, 30422, 45698, 40631, 58043, 22641, 34622, 42324, 2666, 7576, 62807, 16747, 3819}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) - 103, new char[]{38295, 11544, 40620, 5008, 15988, 1049}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) - 32), new char[]{52073, 49608, 40494, 52583, 5797, 23190, 35740, 9246, 4466, 51567, 44929, 38295, 41419, 58822, 58520, 41952, 16869, 39734, 13542, 59047, 44298, 27533, 12242, 65204, 26161, 24657, 16711, 50040, 40135, 45491, 41344, 27957, 62271, 48907, 54460, 13713}, new char[]{19476, 33221, 53911, 13134}, new char[]{31503, 16772, 38948, 29227}, ExpandableListView.getPackedPositionGroup(0L), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56, (char) ((-1) - Process.getGidForName("")), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
            char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            byte b2 = $$s[66];
            Object[] objArr13 = new Object[1];
            j(b2, (byte) (b2 | 33), r3[64], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, pressedStateDuration, c2, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i9 = getShareableDataState + 125;
            coroutineCreation = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2406;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr = $$s;
                Object[] objArr14 = new Object[1];
                j(bArr[5], (byte) ($$t & 36), bArr[64], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, jumpTapTimeout, c3, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 2274), new char[]{18140, 34375, 60640, 5001, 10881, 45172, 39377, 48799, 16155, 45011, 18968, 21914, 44014, 12894, 41201, 62074}, new char[]{19476, 33221, 53911, 13134}, new char[]{1693, 56569, 65404, 2312}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(17) - 115, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            C((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 14073), new char[]{36882, 13808, 25915, 1635, 49918, 15944, 9380, 52377, 50164, 18764, 1498, 8521, 61837, 51685, 10422, 9077}, new char[]{19476, 33221, 53911, 13134}, new char[]{27645, 54214, 6646, 55607}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 779887607};
                byte[] bArr2 = $$Q;
                Object[] objArr18 = new Object[1];
                E(bArr2[41], (byte) 71, bArr2[12], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = bArr2[12];
                Object[] objArr19 = new Object[1];
                E((byte) (b3 - 1), bArr2[13], (byte) (b3 - 1), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2405;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte[] bArr3 = $$s;
                    Object[] objArr20 = new Object[1];
                    j(bArr3[5], (byte) ($$t & 36), bArr3[64], objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatDelay, iIndexOf2, minimumFlingVelocity, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) - 86, new char[]{47237, 29528, 26129, 54414, 29732, 6203, 24755, 40406, 6900, 56560, 31168, 58712, 43288, 43436, 16121, 9875, 43119, 46121, 53024, 7739, 20211, 53556}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    B((ViewConfiguration.getFadingEdgeLength() >> 16) + 15, new char[]{55492, 27982, 50895, 5311, 62454, 39132, 17998, 31318, 7313, 25034, 5026, 25463, 9554, 47109, 20070, 9671}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2404;
                        int mode = View.MeasureSpec.getMode(0) + 26;
                        char cGreen = (char) Color.green(0);
                        Object[] objArr23 = new Object[1];
                        j((byte) (-$$s[71]), (byte) ($$t & 45), r6[66], objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i11, mode, cGreen, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2405;
                        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        byte b4 = $$s[66];
                        Object[] objArr24 = new Object[1];
                        j(b4, (byte) (b4 | 33), r2[64], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i12, cIndexOf, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = 0;
            long j3 = (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) (i14 ^ i13))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6618, 41 - TextUtils.lastIndexOf("", '0', 0), (char) (MotionEvent.axisFromString("") + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-1610059546, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 6563, (ViewConfiguration.getPressedStateDuration() >> 16) + 56, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                byte b5 = $$Q[12];
                Object[] objArr26 = new Object[1];
                E((byte) (b5 - 1), r1[26], (byte) (b5 - 1), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getShareableDataState + 3;
        coroutineCreation = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 73, new char[]{47237, 29528, 26129, 54414, 29732, 6203, 24755, 40406, 50895, 5311, 23000, 9884, 5850, 28093, 18497, 29251, 55697, 9032, 50559, 12700, 30813, 22999, 61674, 62097, 22588, 42431}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 83, new char[]{27829, 22418, 20020, 18695, 7576, 62807, 13872, 37329, 32771, 38139, 59831, 59715, 11221, 65433, 18497, 29251, 12945, 43585}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getShareableDataState + 75;
            coroutineCreation = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getShareableDataState + 89;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16770598) - Color.rgb(0, 0, 0), TextUtils.getTrimmedLength("") + 42, (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6563, 56 - Color.red(0), (char) KeyEvent.normalizeMetaState(0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = getShareableDataState + 33;
                coroutineCreation = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getShareableDataState + 77;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            B(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 76, new char[]{47237, 29528, 26129, 54414, 29732, 6203, 24755, 40406, 50895, 5311, 23000, 9884, 5850, 28093, 18497, 29251, 55697, 9032, 50559, 12700, 30813, 22999, 61674, 62097, 22588, 42431}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            B(18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{27829, 22418, 20020, 18695, 7576, 62807, 13872, 37329, 32771, 38139, 59831, 59715, 11221, 65433, 18497, 29251, 12945, 43585}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6618, Process.getGidForName("") + 43, (char) Color.red(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarSize() >> 8), 55 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i3 = coroutineCreation + 89;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|841|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(5:833|32|(3:34|914|35)|39|40)|(27:(6:916|(5:42|43|(1:45)|46|47)(24:48|49|829|50|51|928|52|(2:879|54)|58|59|917|60|(3:62|907|63)|67|68|69|(2:871|71)|75|76|77|(1:79)|80|(1:82)|83)|84|(4:87|(3:966|89|(3:964|91|971)(12:963|95|(3:97|(3:100|101|98)|972)|102|899|103|(1:105)|106|107|885|108|970))(3:962|92|(3:965|94|969)(12:967|95|(0)|102|899|103|(0)|106|107|885|108|970))|968|85)|961|121)|(4:235|(1:237)|238|239)(32:240|(31:846|242|(2:244|(3:246|(2:248|253)|252)(3:249|(2:251|253)|252))(1:253)|925|(2:360|(2:362|(1:368)(1:367))(2:371|372))(1:373)|374|903|375|(1:377)|378|887|379|(1:381)|382|383|406|932|407|(1:409)|410|(3:412|(1:414)|415)(25:416|417|926|418|419|912|420|(2:865|422)|426|427|901|428|(2:877|430)|434|435|436|(2:854|438)|442|443|891|444|(2:889|446)(1:448)|449|(1:451)|452)|453|(4:456|(2:458|950)(11:459|(3:461|(3:464|465|462)|951)|468|875|469|(1:471)|472|473|867|474|949)|475|454)|948|487|517|(1:519)|520|(3:522|(1:524)|525)(14:526|527|(1:529)|530|531|(1:533)|534|937|535|536|(1:538)(1:539)|540|(1:542)|543)|544|(9:546|(1:548)|549|(1:551)(1:552)|553|(3:555|(1:557)|558)(16:560|561|(1:563)|564|(1:566)|567|568|(1:570)|571|873|572|573|(1:575)|576|(1:578)|579)|559|580|(26:582|863|583|(1:585)|586|(4:588|589|862|590)(1:591)|592|593|(2:595|(5:597|598|(1:600)|601|602)(3:603|(1:605)|606))(17:607|(16:609|(2:611|(2:613|(2:615|619)(1:616))(2:617|618))(1:619)|700|(1:702)|703|(3:705|(1:707)|708)(13:710|826|711|712|(1:714)|715|895|716|717|(1:719)|720|(1:722)|723)|709|724|(6:727|728|(1:730)|731|732|733)|734|(1:736)|737|(3:739|(1:741)|742)(14:744|745|(1:747)|748|749|(1:751)|752|850|753|754|(1:756)|757|(1:759)|760)|743|761|(1:973)(7:764|765|(1:767)|768|769|770|771))|(19:621|622|856|623|(1:625)|626|627|844|628|(1:630)|631|632|633|(1:635)|636|(1:638)|639|(1:641)|642)|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))|643|(4:646|(3:954|648|957)(12:953|649|(3:651|(3:654|655|652)|958)|656|842|657|(1:659)|660|661|837|662|956)|955|644)|952|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))(10:781|(3:783|(2:786|784)|959)|787|788|(1:790)|791|(1:793)|794|795|796))(10:799|(3:801|(2:804|802)|960)|805|806|(1:808)|809|(1:811)|812|813|814))(1:256)|(21:258|935|259|(1:261)|262|263|919|264|(1:266)|267|268|269|(1:271)|272|273|910|274|(5:276|858|277|278|279)(1:282)|283|(1:285)|286)|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|152|828|153|(1:155)|156|(3:158|(1:160)|161)(14:163|164|930|165|(1:167)|168|169|170|(1:172)|173|(1:175)(1:176)|177|(1:179)|180)|162|181|(9:184|923|185|(1:187)|188|189|190|905|191)|221|839|222|(1:224)|225|(5:933|227|228|835|229)(1:232)|233|909|287|(4:290|(2:292|941)(11:293|(3:295|(4:298|(3:944|300|947)(4:943|301|302|946)|945|296)|942)|303|897|304|(4:306|307|893|308)(1:309)|310|311|883|312|940)|313|288)|939|342|925|(0)(0)|374|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|841|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|833|32|(3:34|914|35)|39|40|(27:(6:916|(5:42|43|(1:45)|46|47)(24:48|49|829|50|51|928|52|(2:879|54)|58|59|917|60|(3:62|907|63)|67|68|69|(2:871|71)|75|76|77|(1:79)|80|(1:82)|83)|84|(4:87|(3:966|89|(3:964|91|971)(12:963|95|(3:97|(3:100|101|98)|972)|102|899|103|(1:105)|106|107|885|108|970))(3:962|92|(3:965|94|969)(12:967|95|(0)|102|899|103|(0)|106|107|885|108|970))|968|85)|961|121)|(4:235|(1:237)|238|239)(32:240|(31:846|242|(2:244|(3:246|(2:248|253)|252)(3:249|(2:251|253)|252))(1:253)|925|(2:360|(2:362|(1:368)(1:367))(2:371|372))(1:373)|374|903|375|(1:377)|378|887|379|(1:381)|382|383|406|932|407|(1:409)|410|(3:412|(1:414)|415)(25:416|417|926|418|419|912|420|(2:865|422)|426|427|901|428|(2:877|430)|434|435|436|(2:854|438)|442|443|891|444|(2:889|446)(1:448)|449|(1:451)|452)|453|(4:456|(2:458|950)(11:459|(3:461|(3:464|465|462)|951)|468|875|469|(1:471)|472|473|867|474|949)|475|454)|948|487|517|(1:519)|520|(3:522|(1:524)|525)(14:526|527|(1:529)|530|531|(1:533)|534|937|535|536|(1:538)(1:539)|540|(1:542)|543)|544|(9:546|(1:548)|549|(1:551)(1:552)|553|(3:555|(1:557)|558)(16:560|561|(1:563)|564|(1:566)|567|568|(1:570)|571|873|572|573|(1:575)|576|(1:578)|579)|559|580|(26:582|863|583|(1:585)|586|(4:588|589|862|590)(1:591)|592|593|(2:595|(5:597|598|(1:600)|601|602)(3:603|(1:605)|606))(17:607|(16:609|(2:611|(2:613|(2:615|619)(1:616))(2:617|618))(1:619)|700|(1:702)|703|(3:705|(1:707)|708)(13:710|826|711|712|(1:714)|715|895|716|717|(1:719)|720|(1:722)|723)|709|724|(6:727|728|(1:730)|731|732|733)|734|(1:736)|737|(3:739|(1:741)|742)(14:744|745|(1:747)|748|749|(1:751)|752|850|753|754|(1:756)|757|(1:759)|760)|743|761|(1:973)(7:764|765|(1:767)|768|769|770|771))|(19:621|622|856|623|(1:625)|626|627|844|628|(1:630)|631|632|633|(1:635)|636|(1:638)|639|(1:641)|642)|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))|643|(4:646|(3:954|648|957)(12:953|649|(3:651|(3:654|655|652)|958)|656|842|657|(1:659)|660|661|837|662|956)|955|644)|952|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))(10:781|(3:783|(2:786|784)|959)|787|788|(1:790)|791|(1:793)|794|795|796))(10:799|(3:801|(2:804|802)|960)|805|806|(1:808)|809|(1:811)|812|813|814))(1:256)|(21:258|935|259|(1:261)|262|263|919|264|(1:266)|267|268|269|(1:271)|272|273|910|274|(5:276|858|277|278|279)(1:282)|283|(1:285)|286)|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|152|828|153|(1:155)|156|(3:158|(1:160)|161)(14:163|164|930|165|(1:167)|168|169|170|(1:172)|173|(1:175)(1:176)|177|(1:179)|180)|162|181|(9:184|923|185|(1:187)|188|189|190|905|191)|221|839|222|(1:224)|225|(5:933|227|228|835|229)(1:232)|233|909|287|(4:290|(2:292|941)(11:293|(3:295|(4:298|(3:944|300|947)(4:943|301|302|946)|945|296)|942)|303|897|304|(4:306|307|893|308)(1:309)|310|311|883|312|940)|313|288)|939|342|925|(0)(0)|374|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|841|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|833|32|(3:34|914|35)|39|40|(6:916|(5:42|43|(1:45)|46|47)(24:48|49|829|50|51|928|52|(2:879|54)|58|59|917|60|(3:62|907|63)|67|68|69|(2:871|71)|75|76|77|(1:79)|80|(1:82)|83)|84|(4:87|(3:966|89|(3:964|91|971)(12:963|95|(3:97|(3:100|101|98)|972)|102|899|103|(1:105)|106|107|885|108|970))(3:962|92|(3:965|94|969)(12:967|95|(0)|102|899|103|(0)|106|107|885|108|970))|968|85)|961|121)|152|828|153|(1:155)|156|(3:158|(1:160)|161)(14:163|164|930|165|(1:167)|168|169|170|(1:172)|173|(1:175)(1:176)|177|(1:179)|180)|162|181|(9:184|923|185|(1:187)|188|189|190|905|191)|221|839|222|(1:224)|225|(5:933|227|228|835|229)(1:232)|233|909|(4:235|(1:237)|238|239)(32:240|(31:846|242|(2:244|(3:246|(2:248|253)|252)(3:249|(2:251|253)|252))(1:253)|925|(2:360|(2:362|(1:368)(1:367))(2:371|372))(1:373)|374|903|375|(1:377)|378|887|379|(1:381)|382|383|406|932|407|(1:409)|410|(3:412|(1:414)|415)(25:416|417|926|418|419|912|420|(2:865|422)|426|427|901|428|(2:877|430)|434|435|436|(2:854|438)|442|443|891|444|(2:889|446)(1:448)|449|(1:451)|452)|453|(4:456|(2:458|950)(11:459|(3:461|(3:464|465|462)|951)|468|875|469|(1:471)|472|473|867|474|949)|475|454)|948|487|517|(1:519)|520|(3:522|(1:524)|525)(14:526|527|(1:529)|530|531|(1:533)|534|937|535|536|(1:538)(1:539)|540|(1:542)|543)|544|(9:546|(1:548)|549|(1:551)(1:552)|553|(3:555|(1:557)|558)(16:560|561|(1:563)|564|(1:566)|567|568|(1:570)|571|873|572|573|(1:575)|576|(1:578)|579)|559|580|(26:582|863|583|(1:585)|586|(4:588|589|862|590)(1:591)|592|593|(2:595|(5:597|598|(1:600)|601|602)(3:603|(1:605)|606))(17:607|(16:609|(2:611|(2:613|(2:615|619)(1:616))(2:617|618))(1:619)|700|(1:702)|703|(3:705|(1:707)|708)(13:710|826|711|712|(1:714)|715|895|716|717|(1:719)|720|(1:722)|723)|709|724|(6:727|728|(1:730)|731|732|733)|734|(1:736)|737|(3:739|(1:741)|742)(14:744|745|(1:747)|748|749|(1:751)|752|850|753|754|(1:756)|757|(1:759)|760)|743|761|(1:973)(7:764|765|(1:767)|768|769|770|771))|(19:621|622|856|623|(1:625)|626|627|844|628|(1:630)|631|632|633|(1:635)|636|(1:638)|639|(1:641)|642)|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))|643|(4:646|(3:954|648|957)(12:953|649|(3:651|(3:654|655|652)|958)|656|842|657|(1:659)|660|661|837|662|956)|955|644)|952|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))(10:781|(3:783|(2:786|784)|959)|787|788|(1:790)|791|(1:793)|794|795|796))(10:799|(3:801|(2:804|802)|960)|805|806|(1:808)|809|(1:811)|812|813|814))(1:256)|(21:258|935|259|(1:261)|262|263|919|264|(1:266)|267|268|269|(1:271)|272|273|910|274|(5:276|858|277|278|279)(1:282)|283|(1:285)|286)|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|287|(4:290|(2:292|941)(11:293|(3:295|(4:298|(3:944|300|947)(4:943|301|302|946)|945|296)|942)|303|897|304|(4:306|307|893|308)(1:309)|310|311|883|312|940)|313|288)|939|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|841|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|833|32|(3:34|914|35)|39|40|916|(5:42|43|(1:45)|46|47)(24:48|49|829|50|51|928|52|(2:879|54)|58|59|917|60|(3:62|907|63)|67|68|69|(2:871|71)|75|76|77|(1:79)|80|(1:82)|83)|84|(4:87|(3:966|89|(3:964|91|971)(12:963|95|(3:97|(3:100|101|98)|972)|102|899|103|(1:105)|106|107|885|108|970))(3:962|92|(3:965|94|969)(12:967|95|(0)|102|899|103|(0)|106|107|885|108|970))|968|85)|961|121|152|828|153|(1:155)|156|(3:158|(1:160)|161)(14:163|164|930|165|(1:167)|168|169|170|(1:172)|173|(1:175)(1:176)|177|(1:179)|180)|162|181|(9:184|923|185|(1:187)|188|189|190|905|191)|221|839|222|(1:224)|225|(5:933|227|228|835|229)(1:232)|233|909|(4:235|(1:237)|238|239)(32:240|(31:846|242|(2:244|(3:246|(2:248|253)|252)(3:249|(2:251|253)|252))(1:253)|925|(2:360|(2:362|(1:368)(1:367))(2:371|372))(1:373)|374|903|375|(1:377)|378|887|379|(1:381)|382|383|406|932|407|(1:409)|410|(3:412|(1:414)|415)(25:416|417|926|418|419|912|420|(2:865|422)|426|427|901|428|(2:877|430)|434|435|436|(2:854|438)|442|443|891|444|(2:889|446)(1:448)|449|(1:451)|452)|453|(4:456|(2:458|950)(11:459|(3:461|(3:464|465|462)|951)|468|875|469|(1:471)|472|473|867|474|949)|475|454)|948|487|517|(1:519)|520|(3:522|(1:524)|525)(14:526|527|(1:529)|530|531|(1:533)|534|937|535|536|(1:538)(1:539)|540|(1:542)|543)|544|(9:546|(1:548)|549|(1:551)(1:552)|553|(3:555|(1:557)|558)(16:560|561|(1:563)|564|(1:566)|567|568|(1:570)|571|873|572|573|(1:575)|576|(1:578)|579)|559|580|(26:582|863|583|(1:585)|586|(4:588|589|862|590)(1:591)|592|593|(2:595|(5:597|598|(1:600)|601|602)(3:603|(1:605)|606))(17:607|(16:609|(2:611|(2:613|(2:615|619)(1:616))(2:617|618))(1:619)|700|(1:702)|703|(3:705|(1:707)|708)(13:710|826|711|712|(1:714)|715|895|716|717|(1:719)|720|(1:722)|723)|709|724|(6:727|728|(1:730)|731|732|733)|734|(1:736)|737|(3:739|(1:741)|742)(14:744|745|(1:747)|748|749|(1:751)|752|850|753|754|(1:756)|757|(1:759)|760)|743|761|(1:973)(7:764|765|(1:767)|768|769|770|771))|(19:621|622|856|623|(1:625)|626|627|844|628|(1:630)|631|632|633|(1:635)|636|(1:638)|639|(1:641)|642)|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))|643|(4:646|(3:954|648|957)(12:953|649|(3:651|(3:654|655|652)|958)|656|842|657|(1:659)|660|661|837|662|956)|955|644)|952|700|(0)|703|(0)(0)|709|724|(0)|734|(0)|737|(0)(0)|743|761|(0)(0))(10:781|(3:783|(2:786|784)|959)|787|788|(1:790)|791|(1:793)|794|795|796))(10:799|(3:801|(2:804|802)|960)|805|806|(1:808)|809|(1:811)|812|813|814))(1:256)|(21:258|935|259|(1:261)|262|263|919|264|(1:266)|267|268|269|(1:271)|272|273|910|274|(5:276|858|277|278|279)(1:282)|283|(1:285)|286)|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0))|287|(4:290|(2:292|941)(11:293|(3:295|(4:298|(3:944|300|947)(4:943|301|302|946)|945|296)|942)|303|897|304|(4:306|307|893|308)(1:309)|310|311|883|312|940)|313|288)|939|342|925|(0)(0)|374|903|375|(0)|378|887|379|(0)|382|383|406|932|407|(0)|410|(0)(0)|453|(1:454)|948|487|517|(0)|520|(0)(0)|544|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0da0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0da1, code lost:
    
        r7 = new java.lang.Object[1];
        B(((android.content.Context) java.lang.Class.forName(r31).getMethod(r4, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 18, new char[]{1906, 29074, 1906, 29074, 9390, 41867, 48443, 24576, 39623, 6115, 9736, 6060}, r7);
        r5 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0dd4, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r3);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0deb, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0def, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r5);
        r14 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r5 = r5 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0e1e, code lost:
    
        r7 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0e22, code lost:
    
        if (r7 == null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0e24, code lost:
    
        r7 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0e4f, code lost:
    
        r7 = ((java.lang.reflect.Method) r7).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0e57, code lost:
    
        r11 = new java.lang.Object[]{-468779943, java.lang.Long.valueOf(r5), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6562, 56 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r6 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$Q[12];
        r12 = new java.lang.Object[1];
        E((byte) (r6 - 1), r3[26], (byte) (r6 - 1), r12);
        r1.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x1484, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x1485, code lost:
    
        r1 = r1;
        r7 = r7;
        r13 = r13;
        r25 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x14ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x14af, code lost:
    
        r1 = r42;
        r7 = "";
        r25 = r13;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x1610, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1706, code lost:
    
        r10 = new java.lang.Object[1];
        B(((android.content.Context) java.lang.Class.forName(r31).getMethod(r4, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 21, new char[]{46998, 38158, 43155, 46709, 32048, 16885, 56589, 46249, 40433, 30602, 9736, 6060}, r10);
        r3 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x1744, code lost:
    
        r5 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r5);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r5.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x175b, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x175f, code lost:
    
        r5 = new java.util.ArrayList(2);
        r5.add(r2);
        r5.add(r3);
        r32 = r9;
        r8 = -1;
        r14 = 0;
        r8 = (((r8 - ((r8 >> 63) << 32)) | (((long) 0) << 32)) & ((long) 1)) | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x1790, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1794, code lost:
    
        if (r3 == null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x1796, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.Gravity.getAbsoluteGravity(0, 0) + 6618, android.graphics.ImageFormat.getBitsPerPixel(0) + 43, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x17be, code lost:
    
        r3 = ((java.lang.reflect.Method) r3).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x17c6, code lost:
    
        r10 = new java.lang.Object[]{-468779943, java.lang.Long.valueOf(r8), r5, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, android.text.TextUtils.lastIndexOf(r7, '0', 0, 0) + 57, (char) android.view.View.resolveSize(0, 0));
        r8 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.$$Q[12];
        r11 = new java.lang.Object[1];
        E((byte) (r8 - 1), r5[26], (byte) (r8 - 1), r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r3, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x1c96, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07c1 A[Catch: all -> 0x087a, TryCatch #38 {all -> 0x087a, blocks: (B:103:0x07bb, B:105:0x07c1, B:106:0x07ed), top: B:899:0x07bb, outer: #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0983 A[Catch: all -> 0x0430, TryCatch #8 {all -> 0x0430, blocks: (B:146:0x097d, B:148:0x0983, B:149:0x09af, B:353:0x153f, B:355:0x1545, B:356:0x156e, B:728:0x2f21, B:730:0x2f27, B:731:0x2f51, B:765:0x325f, B:767:0x3265, B:768:0x328c, B:745:0x309f, B:747:0x30c2, B:748:0x3118, B:694:0x2bd6, B:696:0x2bdc, B:697:0x2c07, B:788:0x3367, B:790:0x336d, B:791:0x3396, B:793:0x33d0, B:794:0x3413, B:561:0x2335, B:563:0x234a, B:564:0x2375, B:566:0x23a9, B:567:0x2420, B:806:0x34fc, B:808:0x3502, B:809:0x3524, B:811:0x355e, B:812:0x35a2, B:527:0x1f03, B:529:0x1f18, B:530:0x1f4a, B:511:0x1cf6, B:513:0x1cfc, B:514:0x1d25, B:400:0x1790, B:402:0x1796, B:403:0x17be, B:215:0x0e1e, B:217:0x0e24, B:218:0x0e4f, B:19:0x020a, B:21:0x0210, B:22:0x0238, B:24:0x039d, B:26:0x03cf, B:27:0x042a, B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62, B:362:0x15fb, B:364:0x15ff, B:386:0x16f4, B:388:0x16fa, B:389:0x16fb, B:391:0x16fd, B:393:0x1704, B:394:0x1705, B:368:0x160b, B:371:0x1614, B:372:0x161a), top: B:841:0x020a, inners: #1, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0a3c A[Catch: all -> 0x0da0, TryCatch #1 {all -> 0x0da0, blocks: (B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62), top: B:828:0x0a36, outer: #8, inners: #41, #51, #55 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0a89 A[Catch: all -> 0x0da0, TryCatch #1 {all -> 0x0da0, blocks: (B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62), top: B:828:0x0a36, outer: #8, inners: #41, #51, #55 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0ae2 A[Catch: all -> 0x0da0, TRY_LEAVE, TryCatch #1 {all -> 0x0da0, blocks: (B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62), top: B:828:0x0a36, outer: #8, inners: #41, #51, #55 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0edb A[Catch: all -> 0x14ae, TryCatch #7 {all -> 0x14ae, blocks: (B:222:0x0ed5, B:224:0x0edb, B:225:0x0f21), top: B:839:0x0ed5 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0fb1 A[Catch: all -> 0x14a8, TryCatch #5 {all -> 0x14a8, blocks: (B:229:0x0f80, B:233:0x0f9e, B:235:0x0fb1, B:237:0x0fba, B:238:0x0fff), top: B:835:0x0f80 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x100e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x133c A[Catch: all -> 0x1041, TryCatch #11 {all -> 0x1041, blocks: (B:287:0x1332, B:288:0x1336, B:290:0x133c, B:293:0x1359, B:296:0x1365, B:300:0x1374, B:301:0x137c, B:242:0x1012, B:246:0x1022, B:258:0x1047, B:269:0x1208, B:271:0x120e, B:272:0x1253, B:279:0x12b3, B:283:0x12d3, B:285:0x12e9, B:286:0x132c, B:249:0x1030, B:253:0x103c), top: B:846:0x1012 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1545 A[Catch: all -> 0x0430, TryCatch #8 {all -> 0x0430, blocks: (B:146:0x097d, B:148:0x0983, B:149:0x09af, B:353:0x153f, B:355:0x1545, B:356:0x156e, B:728:0x2f21, B:730:0x2f27, B:731:0x2f51, B:765:0x325f, B:767:0x3265, B:768:0x328c, B:745:0x309f, B:747:0x30c2, B:748:0x3118, B:694:0x2bd6, B:696:0x2bdc, B:697:0x2c07, B:788:0x3367, B:790:0x336d, B:791:0x3396, B:793:0x33d0, B:794:0x3413, B:561:0x2335, B:563:0x234a, B:564:0x2375, B:566:0x23a9, B:567:0x2420, B:806:0x34fc, B:808:0x3502, B:809:0x3524, B:811:0x355e, B:812:0x35a2, B:527:0x1f03, B:529:0x1f18, B:530:0x1f4a, B:511:0x1cf6, B:513:0x1cfc, B:514:0x1d25, B:400:0x1790, B:402:0x1796, B:403:0x17be, B:215:0x0e1e, B:217:0x0e24, B:218:0x0e4f, B:19:0x020a, B:21:0x0210, B:22:0x0238, B:24:0x039d, B:26:0x03cf, B:27:0x042a, B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62, B:362:0x15fb, B:364:0x15ff, B:386:0x16f4, B:388:0x16fa, B:389:0x16fb, B:391:0x16fd, B:393:0x1704, B:394:0x1705, B:368:0x160b, B:371:0x1614, B:372:0x161a), top: B:841:0x020a, inners: #1, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x15ef  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x161b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1632 A[Catch: all -> 0x16fc, TryCatch #40 {all -> 0x16fc, blocks: (B:375:0x161d, B:377:0x1632, B:378:0x1665), top: B:903:0x161d, outer: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1678 A[Catch: all -> 0x16f2, TryCatch #32 {all -> 0x16f2, blocks: (B:379:0x166b, B:381:0x1678, B:382:0x16e8), top: B:887:0x166b, outer: #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1849 A[Catch: all -> 0x1c96, TryCatch #56 {all -> 0x1c96, blocks: (B:407:0x1843, B:409:0x1849, B:410:0x188a, B:412:0x1897, B:414:0x18a0, B:415:0x18e4, B:478:0x1c5c, B:480:0x1c62, B:481:0x1c63, B:483:0x1c65, B:485:0x1c6c, B:486:0x1c6d, B:416:0x18f3, B:492:0x1c7e, B:494:0x1c84, B:495:0x1c85, B:498:0x1c8a, B:500:0x1c90, B:501:0x1c91, B:474:0x1bdc, B:469:0x1ba6, B:471:0x1bac, B:472:0x1bd4), top: B:932:0x1843, inners: #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x1897 A[Catch: all -> 0x1c96, TryCatch #56 {all -> 0x1c96, blocks: (B:407:0x1843, B:409:0x1849, B:410:0x188a, B:412:0x1897, B:414:0x18a0, B:415:0x18e4, B:478:0x1c5c, B:480:0x1c62, B:481:0x1c63, B:483:0x1c65, B:485:0x1c6c, B:486:0x1c6d, B:416:0x18f3, B:492:0x1c7e, B:494:0x1c84, B:495:0x1c85, B:498:0x1c8a, B:500:0x1c90, B:501:0x1c91, B:474:0x1bdc, B:469:0x1ba6, B:471:0x1bac, B:472:0x1bd4), top: B:932:0x1843, inners: #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x18f3 A[Catch: all -> 0x1c96, TRY_LEAVE, TryCatch #56 {all -> 0x1c96, blocks: (B:407:0x1843, B:409:0x1849, B:410:0x188a, B:412:0x1897, B:414:0x18a0, B:415:0x18e4, B:478:0x1c5c, B:480:0x1c62, B:481:0x1c63, B:483:0x1c65, B:485:0x1c6c, B:486:0x1c6d, B:416:0x18f3, B:492:0x1c7e, B:494:0x1c84, B:495:0x1c85, B:498:0x1c8a, B:500:0x1c90, B:501:0x1c91, B:474:0x1bdc, B:469:0x1ba6, B:471:0x1bac, B:472:0x1bd4), top: B:932:0x1843, inners: #22, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1b36 A[Catch: all -> 0x1c74, TryCatch #34 {all -> 0x1c74, blocks: (B:453:0x1b2c, B:454:0x1b30, B:456:0x1b36, B:459:0x1b53, B:444:0x1a5d, B:449:0x1ac9, B:452:0x1b24), top: B:891:0x1a5d }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x1cfc A[Catch: all -> 0x0430, TryCatch #8 {all -> 0x0430, blocks: (B:146:0x097d, B:148:0x0983, B:149:0x09af, B:353:0x153f, B:355:0x1545, B:356:0x156e, B:728:0x2f21, B:730:0x2f27, B:731:0x2f51, B:765:0x325f, B:767:0x3265, B:768:0x328c, B:745:0x309f, B:747:0x30c2, B:748:0x3118, B:694:0x2bd6, B:696:0x2bdc, B:697:0x2c07, B:788:0x3367, B:790:0x336d, B:791:0x3396, B:793:0x33d0, B:794:0x3413, B:561:0x2335, B:563:0x234a, B:564:0x2375, B:566:0x23a9, B:567:0x2420, B:806:0x34fc, B:808:0x3502, B:809:0x3524, B:811:0x355e, B:812:0x35a2, B:527:0x1f03, B:529:0x1f18, B:530:0x1f4a, B:511:0x1cf6, B:513:0x1cfc, B:514:0x1d25, B:400:0x1790, B:402:0x1796, B:403:0x17be, B:215:0x0e1e, B:217:0x0e24, B:218:0x0e4f, B:19:0x020a, B:21:0x0210, B:22:0x0238, B:24:0x039d, B:26:0x03cf, B:27:0x042a, B:153:0x0a36, B:155:0x0a3c, B:156:0x0a7c, B:158:0x0a89, B:160:0x0a92, B:161:0x0ad6, B:181:0x0c8e, B:189:0x0cfc, B:195:0x0d84, B:197:0x0d8a, B:198:0x0d8b, B:200:0x0d8d, B:202:0x0d94, B:203:0x0d95, B:163:0x0ae2, B:170:0x0b6e, B:172:0x0b74, B:173:0x0bb8, B:175:0x0be2, B:177:0x0c2d, B:179:0x0c43, B:180:0x0c84, B:205:0x0d97, B:207:0x0d9e, B:208:0x0d9f, B:191:0x0d02, B:185:0x0cc2, B:187:0x0cc8, B:188:0x0cf5, B:165:0x0b02, B:167:0x0b14, B:168:0x0b62, B:362:0x15fb, B:364:0x15ff, B:386:0x16f4, B:388:0x16fa, B:389:0x16fb, B:391:0x16fd, B:393:0x1704, B:394:0x1705, B:368:0x160b, B:371:0x1614, B:372:0x161a), top: B:841:0x020a, inners: #1, #52 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x1db5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x1e06  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1ee1  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x208e  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x2c9f  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x2cf1  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x2d4b  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x2f03  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x2fe0  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x3030  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x3081  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x3241  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x34b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x0f48 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:973:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x078b  */
    /* JADX WARN: Type inference failed for: r10v102 */
    /* JADX WARN: Type inference failed for: r10v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v122 */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v128 */
    /* JADX WARN: Type inference failed for: r10v129 */
    /* JADX WARN: Type inference failed for: r10v311 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r10v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v176, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v177, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v101 */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v76, types: [char[]] */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v490 */
    /* JADX WARN: Type inference failed for: r1v491 */
    /* JADX WARN: Type inference failed for: r1v496, types: [int] */
    /* JADX WARN: Type inference failed for: r1v497 */
    /* JADX WARN: Type inference failed for: r1v498 */
    /* JADX WARN: Type inference failed for: r1v499 */
    /* JADX WARN: Type inference failed for: r1v500 */
    /* JADX WARN: Type inference failed for: r1v501 */
    /* JADX WARN: Type inference failed for: r1v508 */
    /* JADX WARN: Type inference failed for: r1v638 */
    /* JADX WARN: Type inference failed for: r1v639 */
    /* JADX WARN: Type inference failed for: r1v640 */
    /* JADX WARN: Type inference failed for: r1v641 */
    /* JADX WARN: Type inference failed for: r1v642 */
    /* JADX WARN: Type inference failed for: r1v643 */
    /* JADX WARN: Type inference failed for: r1v644 */
    /* JADX WARN: Type inference failed for: r1v645 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v23 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v26 */
    /* JADX WARN: Type inference failed for: r25v27 */
    /* JADX WARN: Type inference failed for: r25v28 */
    /* JADX WARN: Type inference failed for: r25v29 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v30 */
    /* JADX WARN: Type inference failed for: r25v31 */
    /* JADX WARN: Type inference failed for: r25v32 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r25v35 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37 */
    /* JADX WARN: Type inference failed for: r25v38 */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v496 */
    /* JADX WARN: Type inference failed for: r2v497, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v508 */
    /* JADX WARN: Type inference failed for: r2v511 */
    /* JADX WARN: Type inference failed for: r2v512 */
    /* JADX WARN: Type inference failed for: r2v515 */
    /* JADX WARN: Type inference failed for: r2v516 */
    /* JADX WARN: Type inference failed for: r2v517 */
    /* JADX WARN: Type inference failed for: r2v532 */
    /* JADX WARN: Type inference failed for: r2v533 */
    /* JADX WARN: Type inference failed for: r2v534 */
    /* JADX WARN: Type inference failed for: r2v535 */
    /* JADX WARN: Type inference failed for: r2v536 */
    /* JADX WARN: Type inference failed for: r2v537 */
    /* JADX WARN: Type inference failed for: r3v512 */
    /* JADX WARN: Type inference failed for: r3v516 */
    /* JADX WARN: Type inference failed for: r3v522, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v533 */
    /* JADX WARN: Type inference failed for: r3v701 */
    /* JADX WARN: Type inference failed for: r7v104 */
    /* JADX WARN: Type inference failed for: r7v105, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v106, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v204 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v60, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r8v284 */
    /* JADX WARN: Type inference failed for: r8v285 */
    /* JADX WARN: Type inference failed for: r8v286 */
    /* JADX WARN: Type inference failed for: r8v287 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v307 */
    /* JADX WARN: Type inference failed for: r8v308 */
    /* JADX WARN: Type inference failed for: r8v309 */
    /* JADX WARN: Type inference failed for: r8v310 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.SfcRequestMoneyResultActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        hashCode = 0;
        component3();
        ShareDataUIState();
        int i = getSponsorBeneficiariesState + 65;
        hashCode = i % 128;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    @Override
    public int getSpanCount() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 15;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return 4;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 11;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getShareableDataState + 121;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 19;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        component1 = 976021159;
        component3 = -238323842;
        copydefault = 1684691409;
        if (i3 != 0) {
            ShareDataUIState = new byte[]{-61, Ascii.RS, 13, 8, 103, 2, 17, Ascii.US, TarHeader.LF_NORMAL, 122, Ascii.ESC, 13, Ascii.EM, Ascii.ESC, 57, Ascii.SI, 110, 119, Ascii.FF, Base64.padSymbol, TarHeader.LF_SYMLINK, 66, 105, 6, Ascii.FS, Ascii.FS, Ascii.RS, 13, 104, -57, 89, 4, Ascii.SUB, Ascii.SYN, Ascii.EM, -36, 78, 97, 4, -39, 81, 5, 2, 19, Ascii.ETB, TarHeader.LF_CHR, 106, 7, 0, 110, 0, Ascii.EM, Ascii.GS, 6, -43, 70, 7, 109, TarHeader.LF_DIR, 111, Ascii.SO, -47, 90, Ascii.GS, Ascii.SI};
            return;
        }
        ShareDataUIState = new byte[]{-61, Ascii.RS, 13, 8, 103, 2, 17, Ascii.US, TarHeader.LF_NORMAL, 122, Ascii.ESC, 13, Ascii.EM, Ascii.ESC, 57, Ascii.SI, 110, 119, Ascii.FF, Base64.padSymbol, TarHeader.LF_SYMLINK, 66, 105, 6, Ascii.FS, Ascii.FS, Ascii.RS, 13, 104, -57, 89, 4, Ascii.SUB, Ascii.SYN, Ascii.EM, -36, 78, 97, 4, -39, 81, 5, 2, 19, Ascii.ETB, TarHeader.LF_CHR, 106, 7, 0, 110, 0, Ascii.EM, Ascii.GS, 6, -43, 70, 7, 109, TarHeader.LF_DIR, 111, Ascii.SO, -47, 90, Ascii.GS, Ascii.SI};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        equals = (char) 62822;
        getAsAtTimestamp = (char) 38434;
        getRequestBeneficiariesState = (char) 34793;
        copy = (char) 47701;
        component4 = -520207612165453595L;
        toString = 1386857713;
        ArtificialStackFrames = (char) 50417;
    }
}
