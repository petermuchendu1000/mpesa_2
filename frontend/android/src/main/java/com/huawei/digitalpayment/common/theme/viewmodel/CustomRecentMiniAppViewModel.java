package com.huawei.digitalpayment.common.theme.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/CustomRecentMiniAppViewModel;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/RecentMiniAppViewModel;", "<init>", "()V", "getMaxMiniApps", "", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomRecentMiniAppViewModel extends RecentMiniAppViewModel {

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault = 7;

    public static final int access$getMaxMiniApps$cp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = copydefault;
        int i6 = i3 + 61;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setMaxMiniApps$cp(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        copydefault = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getMaxMiniApps() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = copydefault;
        int i6 = i2 + 125;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return i5;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/CustomRecentMiniAppViewModel$Companion;", "", "<init>", "()V", "maxMiniApps", "", "getMaxMiniApps", "()I", "setMaxMiniApps", "(I)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public final int getMaxMiniApps() {
            int iAccess$getMaxMiniApps$cp;
            int i = 2 % 2;
            int i2 = copydefault + 113;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                iAccess$getMaxMiniApps$cp = CustomRecentMiniAppViewModel.access$getMaxMiniApps$cp();
                int i3 = 2 / 0;
            } else {
                iAccess$getMaxMiniApps$cp = CustomRecentMiniAppViewModel.access$getMaxMiniApps$cp();
            }
            int i4 = copydefault + 121;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return iAccess$getMaxMiniApps$cp;
            }
            throw null;
        }

        public final void setMaxMiniApps(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 91;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            CustomRecentMiniAppViewModel.access$setMaxMiniApps$cp(i);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = component2 + 45;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component3 + 87;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
