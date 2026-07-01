package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.WithExpiryBundleDao;
import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.WithExpiryBundleEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OtherBundlesCatalogResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/WithExpiryBundlesRepository;", "", "dao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/WithExpiryBundleDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/WithExpiryBundleDao;)V", "saveBundles", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesCatalogResponse;", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OtherBundlesCatalogResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBundles", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithExpiryBundlesRepository {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final WithExpiryBundleDao component1;

    @Inject
    public WithExpiryBundlesRepository(WithExpiryBundleDao withExpiryBundleDao) {
        Intrinsics.checkNotNullParameter(withExpiryBundleDao, "");
        this.component1 = withExpiryBundleDao;
    }

    public final Object saveBundles(OtherBundlesCatalogResponse otherBundlesCatalogResponse, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        List<Plans> plans = otherBundlesCatalogResponse.getPlans();
        if (plans != null) {
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            for (Plans plans2 : plans) {
                int i4 = ShareDataUIState + 43;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                List<PackageList> packageList = plans2.getPackageList();
                if (packageList != null) {
                    int i6 = component2 + 7;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    Iterator<T> it = packageList.iterator();
                    while (it.hasNext()) {
                        int i8 = ShareDataUIState + 13;
                        component2 = i8 % 128;
                        if (i8 % 2 == 0) {
                            ((PackageList) it.next()).getChildBundles();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        PackageList packageList2 = (PackageList) it.next();
                        List<SubBundles> childBundles = packageList2.getChildBundles();
                        if (childBundles != null) {
                            for (SubBundles subBundles : childBundles) {
                                int i9 = ShareDataUIState + 109;
                                component2 = i9 % 128;
                                int i10 = i9 % 2;
                                String packageName = plans2.getPackageName();
                                String str = "";
                                if (packageName == null) {
                                    int i11 = component2 + 73;
                                    ShareDataUIState = i11 % 128;
                                    int i12 = i11 % 2;
                                    packageName = "";
                                }
                                String childHeading = packageList2.getChildHeading();
                                if (childHeading != null) {
                                    int i13 = ShareDataUIState + 71;
                                    component2 = i13 % 128;
                                    int i14 = i13 % 2;
                                    str = childHeading;
                                }
                                arrayList.add(WithExpiryBundlesRepositoryKt.access$toEntity(subBundles, packageName, str));
                            }
                        }
                    }
                }
            }
        }
        Object objInsertBundles = this.component1.insertBundles(arrayList, continuation);
        return objInsertBundles == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertBundles : Unit.INSTANCE;
    }

    public final Flow<Resource<List<Plans>>> getAllBundles() {
        int i = 2 % 2;
        final Flow<List<WithExpiryBundleEntity>> allBundles = this.component1.getAllBundles();
        Flow<Resource<List<Plans>>> flow = (Flow) new Flow<Resource<List<? extends Plans>>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;
                final FlowCollector component1;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.WithExpiryBundlesRepository$getAllBundles$$inlined$map$1$2", f = "WithExpiryBundlesRepository.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int ShareDataUIState = 0;
                    private static int component2 = 1;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = ShareDataUIState + 39;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object obj2 = null;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i4 = component2 + 125;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objEmit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
                    /*
                        Method dump skipped, instruction units count: 393
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.WithExpiryBundlesRepository$getAllBundles$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.component1 = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super Resource<List<? extends Plans>>> flowCollector, Continuation continuation) {
                int i2 = 2 % 2;
                Object objCollect = allBundles.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i3 = copydefault + 33;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return objCollect;
                }
                throw null;
            }
        };
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return flow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 1;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
