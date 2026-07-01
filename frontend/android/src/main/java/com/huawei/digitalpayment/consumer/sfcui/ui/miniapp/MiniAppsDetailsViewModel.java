package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp;

import androidx.lifecycle.ViewModel;
import com.huawei.digitalpayment.consumer.base.resp.Category;
import com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory;
import com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/MiniAppsDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_categories", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "categories", "Lkotlinx/coroutines/flow/StateFlow;", "getCategories", "()Lkotlinx/coroutines/flow/StateFlow;", "originalCategories", "Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "_miniApps", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/MiniApp;", "miniApps", "getMiniApps", "updateAppList", "", "appList", "Lcom/alibaba/griver/core/model/applist/FetchAppInfo;", "updateCategories", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppsDetailsViewModel extends ViewModel {
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final MutableStateFlow<List<DiscoveryCategory>> ShareDataUIState;
    private final StateFlow<List<MiniApp>> component2;
    private final MutableStateFlow<List<MiniApp>> component3;
    private List<Category> component4;
    private final StateFlow<List<DiscoveryCategory>> copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Category component1 = new Category("All", null, null, null, null, UUID.randomUUID().toString(), -1, null, 158, null);

    public static final Category access$getCATEGORY_ALL$cp() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 119;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Category category = component1;
        int i5 = i2 + 71;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return category;
    }

    @Inject
    public MiniAppsDetailsViewModel() {
        MutableStateFlow<List<DiscoveryCategory>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.ShareDataUIState = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        this.component4 = CollectionsKt.emptyList();
        MutableStateFlow<List<MiniApp>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.component3 = MutableStateFlow2;
        this.component2 = FlowKt.asStateFlow(MutableStateFlow2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/MiniAppsDetailsViewModel$Companion;", "", "<init>", "()V", "CATEGORY_ALL", "Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "getCATEGORY_ALL", "()Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final Category getCATEGORY_ALL() {
            int i = 2 % 2;
            int i2 = component2 + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Category categoryAccess$getCATEGORY_ALL$cp = MiniAppsDetailsViewModel.access$getCATEGORY_ALL$cp();
            int i4 = component3 + 25;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return categoryAccess$getCATEGORY_ALL$cp;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = getRequestBeneficiariesState + 79;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public final StateFlow<List<DiscoveryCategory>> getCategories() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 79;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow<List<DiscoveryCategory>> stateFlow = this.copydefault;
        int i4 = i2 + 63;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow<List<MiniApp>> getMiniApps() {
        int i = 2 % 2;
        int i2 = equals + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAppList(java.util.List<? extends com.alibaba.griver.core.model.applist.FetchAppInfo> r22) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.MiniAppsDetailsViewModel.updateAppList(java.util.List):void");
    }

    public final void updateCategories(List<Category> categories) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categories, "");
        this.component4 = categories;
        MutableStateFlow<List<DiscoveryCategory>> mutableStateFlow = this.ShareDataUIState;
        List<Category> list = categories;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Category category : list) {
            int i2 = equals + 105;
            copy = i2 % 128;
            int i3 = i2 % 2;
            String id = category.getId();
            String categoryName = category.getCategoryName();
            if (categoryName == null) {
                int i4 = equals + 103;
                int i5 = i4 % 128;
                copy = i5;
                if (i4 % 2 == 0) {
                    int i6 = 96 / 0;
                }
                int i7 = i5 + 63;
                equals = i7 % 128;
                int i8 = i7 % 2;
                str = "";
            } else {
                str = categoryName;
            }
            arrayList.add(new DiscoveryCategory(str, null, null, null, id, 14, null));
        }
        List<DiscoveryCategory> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        Category category2 = component1;
        String categoryName2 = category2.getCategoryName();
        mutableList.add(0, new DiscoveryCategory(categoryName2 == null ? "" : categoryName2, null, null, null, category2.getId(), 14, null));
        mutableStateFlow.setValue(mutableList);
    }
}
