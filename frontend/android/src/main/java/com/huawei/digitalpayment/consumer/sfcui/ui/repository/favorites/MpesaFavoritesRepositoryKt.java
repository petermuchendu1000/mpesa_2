package com.huawei.digitalpayment.consumer.sfcui.ui.repository.favorites;

import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.base.database.entities.favorite.MpesaFavoriteEntity;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteContent;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteCustomBean;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"toEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/favorite/MpesaFavoriteEntity;", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomBean;", "toFriendBean", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MpesaFavoritesRepositoryKt {
    private static int component3 = 1;
    private static int copydefault;

    public static final MpesaFavoriteEntity toEntity(FavoriteCustomBean favoriteCustomBean) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(favoriteCustomBean, "");
        MpesaFavoriteEntity mpesaFavoriteEntity = new MpesaFavoriteEntity(favoriteCustomBean.getServiceType(), favoriteCustomBean.getFavoriteCategory(), favoriteCustomBean.getCreateTime(), favoriteCustomBean.getConsumerId(), favoriteCustomBean.getId(), favoriteCustomBean.getFavoriteContent(), null, 64, null);
        int i2 = copydefault + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mpesaFavoriteEntity;
    }

    public static final FavoriteFriendsBean toFriendBean(MpesaFavoriteEntity mpesaFavoriteEntity) {
        int iIntValue;
        String avatarUrl;
        String accountNum;
        String idNumber;
        String favouriteName;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mpesaFavoriteEntity, "");
        FavoriteContent favoriteContent = (FavoriteContent) SecureGsonUtils.fromJson(mpesaFavoriteEntity.getFavoriteContent(), FavoriteContent.class);
        String str = (favoriteContent == null || (favouriteName = favoriteContent.getFavouriteName()) == null) ? "" : favouriteName;
        String str2 = (favoriteContent == null || (idNumber = favoriteContent.getIdNumber()) == null) ? "" : idNumber;
        String id = mpesaFavoriteEntity.getId();
        String str3 = (favoriteContent == null || (accountNum = favoriteContent.getAccountNum()) == null) ? "" : accountNum;
        String str4 = (favoriteContent == null || (avatarUrl = favoriteContent.getAvatarUrl()) == null) ? "" : avatarUrl;
        String favoriteCategory = mpesaFavoriteEntity.getFavoriteCategory();
        long createTime = mpesaFavoriteEntity.getCreateTime();
        Integer listPosition = mpesaFavoriteEntity.getListPosition();
        Object obj = null;
        if (listPosition != null) {
            int i2 = component3 + 111;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                listPosition.intValue();
                throw null;
            }
            iIntValue = listPosition.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        FavoriteFriendsBean favoriteFriendsBean = new FavoriteFriendsBean(0, str, id, str2, str3, str4, favoriteCategory, createTime, iIntValue, 1, null);
        int i3 = component3 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return favoriteFriendsBean;
        }
        obj.hashCode();
        throw null;
    }
}
