package com.huawei.digitalpayment.consumer.sfcui.local;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\r\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/local/FavouriteBundlesLocalDataSource;", "", "<init>", "()V", "saveFavoriteBundles", "", "favoriteBundleWrapper", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "getFavoriteBundles", "saveFavoriteBundlesMenuConfiguration", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "getFavoriteBundlesMenuConfiguration", "clearSavedFavourites", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavouriteBundlesLocalDataSource {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static final String component1 = "favorite_bundles_menu_configuration";
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static final String copydefault = "favorite_bundles_menu";

    @Inject
    public FavouriteBundlesLocalDataSource() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/local/FavouriteBundlesLocalDataSource$Companion;", "", "<init>", "()V", "KEY_FAVORITE_BUNDLES_MENU_CONFIGURATION", "", "KEY_FAVORITE_BUNDLES", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void saveFavoriteBundles(List<FavoriteBundle> favoriteBundleWrapper) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (favoriteBundleWrapper == null) {
            return;
        }
        SPUtils.getInstance().put(copydefault, GsonUtils.toJson(favoriteBundleWrapper));
        int i4 = component4 + 59;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final List<FavoriteBundle> getFavoriteBundles() {
        List<FavoriteBundle> listEmptyList;
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString(copydefault, "");
        Intrinsics.checkNotNull(string);
        if (string.length() != 0) {
            try {
                listEmptyList = (List) GsonUtils.fromJson(string, new TypeToken<List<? extends FavoriteBundle>>() {
                }.getType());
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Exception unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            int i2 = ShareDataUIState + 79;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return listEmptyList;
            }
            throw null;
        }
        int i3 = component4 + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return CollectionsKt.emptyList();
        }
        int i4 = 40 / 0;
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        com.huawei.common.util.SPUtils.getInstance().put(com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.component1, com.blankj.utilcode.util.GsonUtils.toJson(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 65;
        com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.component4 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void saveFavoriteBundlesMenuConfiguration(com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.ShareDataUIState
            int r2 = r1 + 33
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.component4 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 39
            int r2 = r2 / 0
            if (r5 != 0) goto L1f
            goto L17
        L15:
            if (r5 != 0) goto L1f
        L17:
            int r1 = r1 + 65
            int r5 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.component4 = r5
            int r1 = r1 % r0
            return
        L1f:
            java.lang.String r5 = com.blankj.utilcode.util.GsonUtils.toJson(r5)
            com.huawei.common.util.SPUtils r0 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = "favorite_bundles_menu_configuration"
            r0.put(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.local.FavouriteBundlesLocalDataSource.saveFavoriteBundlesMenuConfiguration(com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper):void");
    }

    public final FavoriteBundleWrapper getFavoriteBundlesMenuConfiguration() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            String string = SPUtils.getInstance().getString(component1, "");
            Intrinsics.checkNotNull(string);
            if (string.length() == 0) {
                return null;
            }
            try {
                FavoriteBundleWrapper favoriteBundleWrapper = (FavoriteBundleWrapper) GsonUtils.fromJson(string, FavoriteBundleWrapper.class);
                int i3 = component4 + 29;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return favoriteBundleWrapper;
            } catch (Exception unused) {
                return null;
            }
        }
        String string2 = SPUtils.getInstance().getString(component1, "");
        Intrinsics.checkNotNull(string2);
        string2.length();
        throw null;
    }

    public final void clearSavedFavourites() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            SPUtils.getInstance().remove(copydefault);
            return;
        }
        SPUtils.getInstance().remove(copydefault);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 73;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
