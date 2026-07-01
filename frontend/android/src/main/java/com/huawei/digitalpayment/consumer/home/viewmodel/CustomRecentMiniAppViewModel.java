package com.huawei.digitalpayment.consumer.home.viewmodel;

import com.huawei.digitalpayment.home.viewmodel.RecentMiniAppViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/CustomRecentMiniAppViewModel;", "Lcom/huawei/digitalpayment/home/viewmodel/RecentMiniAppViewModel;", "<init>", "()V", "getMaxMiniApps", "", "Companion", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomRecentMiniAppViewModel extends RecentMiniAppViewModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    public static final Companion INSTANCE = new Companion(null);
    private static int component1 = 7;

    public static final int access$getMaxMiniApps$cp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = component1;
        int i6 = i2 + 45;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final void access$setMaxMiniApps$cp(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        component1 = i;
        if (i4 == 0) {
            throw null;
        }
    }

    @Override
    public int getMaxMiniApps() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = component1;
        int i6 = i3 + 73;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return i5;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/CustomRecentMiniAppViewModel$Companion;", "", "<init>", "()V", "maxMiniApps", "", "getMaxMiniApps", "()I", "setMaxMiniApps", "(I)V", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final int getMaxMiniApps() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iAccess$getMaxMiniApps$cp = CustomRecentMiniAppViewModel.access$getMaxMiniApps$cp();
            int i4 = component3 + 63;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iAccess$getMaxMiniApps$cp;
        }

        public final void setMaxMiniApps(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 43;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            CustomRecentMiniAppViewModel.access$setMaxMiniApps$cp(i);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = component3 + 121;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = component3 + 123;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
