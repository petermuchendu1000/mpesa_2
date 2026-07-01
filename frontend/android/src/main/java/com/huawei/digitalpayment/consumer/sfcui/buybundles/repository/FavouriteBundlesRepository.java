package com.huawei.digitalpayment.consumer.sfcui.buybundles.repository;

import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundleWrapper;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ*\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\u0006\u0010\r\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\u0006\u0010\r\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u000eJ(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H¦@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/FavouriteBundlesRepository;", "", "getBundlesFavouritesMenu", "Lkotlinx/coroutines/flow/Flow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundleWrapper;", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavourites", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "addFavourite", "bundle", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFavourite", "reorderFavourites", "reorderedBundles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllFavourites", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalFavorites", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FavouriteBundlesRepository {
    Object addFavourite(FavoriteBundle favoriteBundle, Continuation<? super Resource<? extends List<FavoriteBundle>>> continuation);

    Object getBundlesFavouritesMenu(boolean z, Continuation<? super Flow<Resource<FavoriteBundleWrapper>>> continuation);

    Object getFavourites(boolean z, Continuation<? super Flow<? extends Resource<? extends List<FavoriteBundle>>>> continuation);

    List<FavoriteBundle> getLocalFavorites();

    Object removeAllFavourites(Continuation<? super Resource<? extends List<FavoriteBundle>>> continuation);

    Object removeFavourite(FavoriteBundle favoriteBundle, Continuation<? super Resource<? extends List<FavoriteBundle>>> continuation);

    Object reorderFavourites(List<FavoriteBundle> list, Continuation<? super Resource<? extends List<FavoriteBundle>>> continuation);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int component2 = 1;

        public static Object getBundlesFavouritesMenu$default(FavouriteBundlesRepository favouriteBundlesRepository, boolean z, Continuation continuation, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 105;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBundlesFavouritesMenu");
            }
            int i6 = i4 + 3;
            component1 = i6 % 128;
            if (i6 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i7 = i4 + 9;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
            return favouriteBundlesRepository.getBundlesFavouritesMenu(z, continuation);
        }

        public static Object getFavourites$default(FavouriteBundlesRepository favouriteBundlesRepository, boolean z, Continuation continuation, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 97;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFavourites");
            }
            int i5 = i4 + 71;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            if ((i & 1) != 0) {
                z = false;
            }
            Object favourites = favouriteBundlesRepository.getFavourites(z, continuation);
            int i7 = component2 + 95;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 38 / 0;
            }
            return favourites;
        }
    }
}
