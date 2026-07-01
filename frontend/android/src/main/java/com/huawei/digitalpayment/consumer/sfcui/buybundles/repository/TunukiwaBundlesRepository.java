package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.TunukiwaBundleDao;
import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/TunukiwaBundlesRepository;", "", "dao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/TunukiwaBundleDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/TunukiwaBundleDao;)V", "saveBundles", "", "resp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaOfferResp;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaOfferResp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBundles", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaBundlesRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 109 % 128;
    private static int component3 = 1;
    private final TunukiwaBundleDao copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository", f = "TunukiwaBundlesRepository.kt", i = {}, l = {16}, m = "saveBundles", n = {}, s = {})
    static final class ShareDataUIState extends ContinuationImpl {
        private static int component1 = 0;
        private static int getRequestBeneficiariesState = 1;
        Object ShareDataUIState;
        Object component2;
        int copydefault;

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            Object objSaveBundles;
            int i = 2 % 2;
            int i2 = component1 + 125;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = obj;
            this.copydefault |= Integer.MIN_VALUE;
            TunukiwaBundlesRepository tunukiwaBundlesRepository = TunukiwaBundlesRepository.this;
            if (i3 == 0) {
                objSaveBundles = tunukiwaBundlesRepository.saveBundles(null, this);
                int i4 = 72 / 0;
            } else {
                objSaveBundles = tunukiwaBundlesRepository.saveBundles(null, this);
            }
            int i5 = component1 + 7;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return objSaveBundles;
        }
    }

    @Inject
    public TunukiwaBundlesRepository(TunukiwaBundleDao tunukiwaBundleDao) {
        Intrinsics.checkNotNullParameter(tunukiwaBundleDao, "");
        this.copydefault = tunukiwaBundleDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveBundles(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.ShareDataUIState
            if (r1 == 0) goto L28
            r1 = r7
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$ShareDataUIState r1 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.ShareDataUIState) r1
            int r2 = r1.copydefault
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L28
            int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component3
            int r7 = r7 + 29
            int r2 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component1 = r2
            int r7 = r7 % r0
            if (r7 == 0) goto L22
            int r7 = r1.copydefault
            int r7 = r7 << r3
            r1.copydefault = r7
            goto L2d
        L22:
            int r7 = r1.copydefault
            int r7 = r7 + r3
            r1.copydefault = r7
            goto L2d
        L28:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$ShareDataUIState r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$ShareDataUIState
            r1.<init>(r7)
        L2d:
            java.lang.Object r7 = r1.ShareDataUIState
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.copydefault
            r4 = 1
            if (r3 == 0) goto L53
            if (r3 != r4) goto L4b
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component3
            int r6 = r6 + 117
            int r2 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component1 = r2
            int r6 = r6 % r0
            java.lang.Object r6 = r1.component2
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L99
        L4b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L53:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r3)
            r7.<init>(r3)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r6 = r6.iterator()
        L69:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r6.next()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp r3 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp) r3
            com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepositoryKt.access$toEntity(r3)
            r7.add(r3)
            goto L69
        L7d:
            java.util.List r7 = (java.util.List) r7
            com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.TunukiwaBundleDao r6 = r5.copydefault
            r1.component2 = r7
            r1.copydefault = r4
            java.lang.Object r6 = r6.insertBundles(r7, r1)
            if (r6 != r2) goto L99
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component3
            int r6 = r6 + 55
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component1 = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L97
            return r2
        L97:
            r6 = 0
            throw r6
        L99:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component1
            int r7 = r7 + 53
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.component3 = r1
            int r7 = r7 % r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository.saveBundles(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow<Resource<TunukiwaOfferResp>> getAllBundles() {
        int i = 2 % 2;
        final Flow<List<TunukiwaBundleEntity>> allBundles = this.copydefault.getAllBundles();
        Flow<Resource<TunukiwaOfferResp>> flow = new Flow<Resource<TunukiwaOfferResp>>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                final FlowCollector copydefault;
                private static final byte[] $$c = {93, TarHeader.LF_LINK, 76, -114};
                private static final int $$d = 254;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {70, 83, 77, 1, -6, 5, -3};
                private static final int $$b = 10;
                private static int ShareDataUIState = 0;
                private static int component2 = 1;
                private static char[] component1 = {33465, 33300, 33293, 33292, 33300, 33298, 33290, 33309, 33380, 33301, 33293, 33290, 33297, 33298, 33293, 33310, 33311, 33290, 33290, 33465, 33306, 33311, 33310, 33303, 33306, 33378, 33393, 33386, 33301, 33387, 33391, 33307, 33306, 33303, 33303, 33376, 33305, 33424, 33377, 33342, 33311, 33398, 33307, 33292, 33284, 33281, 33291, 33288, 33286, 33284, 33343, 33283, 33289, 33480, 33428, 33457, 33460, 33468, 33467, 33430, 33426, 33463, 33462, 33455, 33460, 33463, 33426, 33422, 33449, 33449, 33422, 33423, 33460, 33467, 33469, 33462, 33452, 33462, 33462, 33454, 33462, 33460, 33453, 33452, 33459, 33430, 33428, 33461, 33460, 33465, 33469, 33462, 33452, 33463, 33294, 33293, 33517, 33467, 33463, 33464, 33470, 33464, 33462, 33469, 33469, 33467, 33469, 33462, 33452, 33458, 33429, 33426, 33463, 33462, 33455, 33460, 33463, 33426, 33422, 33449, 33449, 33422, 33430, 33462, 33455, 33454, 33424, 33418, 33512, 33457, 33464, 33468, 33461, 33460, 33465, 33469, 33462, 33452, 33422, 33428, 33461, 33460, 33465, 33469, 33462, 33452, 33422, 33428, 33457, 33460, 33468, 33467, 33430, 33426, 33463, 33462, 33455, 33460, 33463, 33426, 33422, 33449, 33449, 33422};

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1$2", f = "TunukiwaBundlesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component1 = 1;
                    private static int copydefault;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = copydefault + 75;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        Object obj2 = null;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        AnonymousClass1 anonymousClass1 = this;
                        if (i3 != 0) {
                            return anonymousClass2.emit(null, anonymousClass1);
                        }
                        anonymousClass2.emit(null, anonymousClass1);
                        obj2.hashCode();
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static java.lang.String $$e(short r6, byte r7, int r8) {
                    /*
                        int r7 = r7 + 4
                        int r6 = r6 + 110
                        int r8 = r8 * 4
                        int r0 = 1 - r8
                        byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.$$c
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        int r8 = 0 - r8
                        if (r1 != 0) goto L15
                        r6 = r7
                        r4 = r8
                        r3 = r2
                        goto L2a
                    L15:
                        r3 = r2
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L19:
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r8) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        return r6
                    L24:
                        int r6 = r6 + 1
                        int r3 = r3 + 1
                        r4 = r1[r6]
                    L2a:
                        int r7 = r7 + r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.$$e(short, byte, int):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
                    /*
                        int r6 = r6 + 4
                        int r5 = r5 * 3
                        int r0 = 4 - r5
                        int r7 = r7 * 4
                        int r7 = r7 + 99
                        byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.$$a
                        byte[] r0 = new byte[r0]
                        int r5 = 3 - r5
                        r2 = 0
                        if (r1 != 0) goto L16
                        r3 = r5
                        r4 = r2
                        goto L2a
                    L16:
                        r3 = r2
                    L17:
                        int r6 = r6 + 1
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r5) goto L28
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r0, r2)
                        r8[r2] = r5
                        return
                    L28:
                        r3 = r1[r6]
                    L2a:
                        int r3 = -r3
                        int r7 = r7 + r3
                        int r7 = r7 + 6
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.b(short, byte, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        boolean r1 = r9 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r1 == 0) goto L20
                        r1 = r9
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 & r3
                        if (r2 == 0) goto L20
                        int r9 = r1.label
                        int r9 = r9 + r3
                        r1.label = r9
                        int r9 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2
                        int r9 = r9 + 75
                        int r2 = r9 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                        int r9 = r9 % r0
                        goto L25
                    L20:
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1$2$1
                        r1.<init>(r9)
                    L25:
                        java.lang.Object r9 = r1.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r3 = r1.label
                        r4 = 1
                        if (r3 == 0) goto L3f
                        if (r3 != r4) goto L37
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto Laf
                    L37:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L3f:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.copydefault
                        r3 = r1
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        java.util.List r8 = (java.util.List) r8
                        java.lang.Iterable r8 = (java.lang.Iterable) r8
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r8, r5)
                        r3.<init>(r5)
                        java.util.Collection r3 = (java.util.Collection) r3
                        java.util.Iterator r8 = r8.iterator()
                    L5c:
                        boolean r5 = r8.hasNext()
                        if (r5 == 0) goto L8d
                        int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2
                        int r5 = r5 + 77
                        int r6 = r5 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r6
                        int r5 = r5 % r0
                        if (r5 != 0) goto L7b
                        java.lang.Object r5 = r8.next()
                        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity r5 = (com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity) r5
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepositoryKt.access$toBundleResp(r5)
                        r3.add(r5)
                        goto L5c
                    L7b:
                        java.lang.Object r8 = r8.next()
                        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity r8 = (com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.TunukiwaBundleEntity) r8
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepositoryKt.access$toBundleResp(r8)
                        r3.add(r8)
                        r8 = 0
                        r8.hashCode()
                        throw r8
                    L8d:
                        java.util.List r3 = (java.util.List) r3
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp r8 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaOfferResp
                        r8.<init>()
                        java.util.Collection r3 = (java.util.Collection) r3
                        r8.addAll(r3)
                        com.huawei.payment.mvvm.Resource r8 = com.huawei.payment.mvvm.Resource.success(r8)
                        r1.label = r4
                        java.lang.Object r8 = r9.emit(r8, r1)
                        if (r8 != r2) goto Laf
                        int r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2
                        int r8 = r8 + 125
                        int r9 = r8 % 128
                        com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r9
                        int r8 = r8 % r0
                        return r2
                    Laf:
                        kotlin.Unit r8 = kotlin.Unit.INSTANCE
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                    int length;
                    char[] cArr;
                    int i = 2 % 2;
                    ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
                    int i2 = iArr[0];
                    int i3 = 1;
                    int i4 = iArr[1];
                    int i5 = iArr[2];
                    int i6 = iArr[3];
                    char[] cArr2 = component1;
                    long j = 0;
                    float f = 0.0f;
                    if (cArr2 != null) {
                        int i7 = $10 + 3;
                        $11 = i7 % 128;
                        if (i7 % 2 == 0) {
                            length = cArr2.length;
                            cArr = new char[length];
                        } else {
                            length = cArr2.length;
                            cArr = new char[length];
                        }
                        int i8 = 0;
                        while (i8 < length) {
                            try {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = Integer.valueOf(cArr2[i8]);
                                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                                if (objCopydefault == null) {
                                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - TextUtils.lastIndexOf("", '0'), ExpandableListView.getPackedPositionType(j) + 14, (char) (65118 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1))), 1951305196, false, "l", new Class[]{Integer.TYPE});
                                }
                                cArr[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                                i8++;
                                int i9 = $10 + 39;
                                $11 = i9 % 128;
                                int i10 = i9 % 2;
                                i3 = 1;
                                j = 0;
                                f = 0.0f;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        cArr2 = cArr;
                    }
                    char[] cArr3 = new char[i4];
                    System.arraycopy(cArr2, i2, cArr3, 0, i4);
                    if (bArr != null) {
                        char[] cArr4 = new char[i4];
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        int i11 = $10 + 29;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        char c2 = 0;
                        while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                            if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                                int i13 = iTrustedWebActivityService_Parcel.copydefault;
                                try {
                                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                    if (objCopydefault2 == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = (byte) (b2 - 1);
                                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4501, 36 - (KeyEvent.getMaxKeyCode() >> 16), (char) (27898 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1464227204, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                int i14 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                                if (objCopydefault3 == null) {
                                    byte b4 = (byte) (-1);
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3581 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 29 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) Color.blue(0), 1180380354, false, $$e((byte) 5, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                                int i15 = $11 + 119;
                                $10 = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i16 = 4 % 2;
                                }
                            }
                            c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                            Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                            if (objCopydefault4 == null) {
                                int edgeSlop = 1859 - (ViewConfiguration.getEdgeSlop() >> 16);
                                int i17 = 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                byte length2 = (byte) $$c.length;
                                byte b5 = (byte) (length2 - 5);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, i17, cIndexOf, 80302927, false, $$e(length2, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault4).invoke(null, objArr5);
                        }
                        cArr3 = cArr4;
                    }
                    if (i6 > 0) {
                        int i18 = $11 + 25;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        char[] cArr5 = new char[i4];
                        System.arraycopy(cArr3, 0, cArr5, 0, i4);
                        int i20 = i4 - i6;
                        System.arraycopy(cArr5, 0, cArr3, i20, i6);
                        System.arraycopy(cArr5, i6, cArr3, 0, i20);
                    }
                    if (z) {
                        char[] cArr6 = new char[i4];
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        int i21 = $11 + 123;
                        $10 = i21 % 128;
                        int i22 = i21 % 2;
                        while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                            cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                            iTrustedWebActivityService_Parcel.copydefault++;
                        }
                        cArr3 = cArr6;
                    }
                    if (i5 > 0) {
                        iTrustedWebActivityService_Parcel.copydefault = 0;
                        while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                            int i23 = $11 + 73;
                            $10 = i23 % 128;
                            int i24 = i23 % 2;
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                            iTrustedWebActivityService_Parcel.copydefault++;
                        }
                    }
                    objArr[0] = new String(cArr3);
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.copydefault = flowCollector;
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0242, code lost:
                
                    if (r0.canRead() != false) goto L40;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x024c, code lost:
                
                    if (r0.canRead() == false) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x024e, code lost:
                
                    r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2;
                    r6 = r0 + 25;
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r6 % 128;
                    r6 = r6 % 2;
                    r0 = r0 + 63;
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r0 % 128;
                    r0 = r0 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x0261, code lost:
                
                    r6 = new java.io.FileReader(r0);
                    r7 = new java.io.BufferedReader(r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x026b, code lost:
                
                    r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState;
                    r8 = (r0 & 55) + (r0 | 55);
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2 = r8 % 128;
                    r8 = r8 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x0278, code lost:
                
                    r0 = r7.readLine();
                    r8 = new int[]{93, 3, 99, 0};
                    r9 = new byte[]{1, 1, 1};
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x028a, code lost:
                
                    r10 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2;
                    r11 = ((r10 | 61) << 1) - (r10 ^ 61);
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r11 % 128;
                    r11 = r11 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:44:0x0299, code lost:
                
                    r10 = new java.lang.Object[1];
                    a(false, r8, r9, r10);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x02a7, code lost:
                
                    if (r0.equals((java.lang.String) r10[0]) != false) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x02a9, code lost:
                
                    r8 = com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component2;
                    r9 = ((r8 | 109) << 1) - (r8 ^ 109);
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.ShareDataUIState = r9 % 128;
                    r9 = r9 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x02b8, code lost:
                
                    r6.close();
                    r7.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x02bf, code lost:
                
                    r6.close();
                    r7.close();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x02c6, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x02cd, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:58:0x02ff  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0301 A[Catch: Exception -> 0x041f, TRY_LEAVE, TryCatch #1 {Exception -> 0x041f, blocks: (B:56:0x02dd, B:59:0x0301, B:63:0x0338, B:65:0x0340, B:68:0x0367, B:74:0x03b5, B:76:0x03c8, B:86:0x0410, B:87:0x0416, B:89:0x0418, B:90:0x041e, B:60:0x030b, B:62:0x0334, B:71:0x0381, B:73:0x03a8, B:72:0x0395), top: B:103:0x02dd, inners: #6, #7 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static java.lang.Object[] component1(int r31, int r32) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 1466
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.TunukiwaBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.component1(int, int):java.lang.Object[]");
                }
            }

            @Override
            public Object collect(FlowCollector<? super Resource<TunukiwaOfferResp>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allBundles.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = copydefault + 99;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return objCollect;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return flow;
    }

    static {
        if (109 % 2 == 0) {
            int i = 14 / 0;
        }
    }
}
