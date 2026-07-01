package com.huawei.digitalpayment.consumer.base.resp;

import android.text.TextUtils;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomResp;", "Lcom/huawei/http/BaseResp;", "favoriteList", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteCustomBean;", "<init>", "(Ljava/util/List;)V", "getFavoriteList", "()Ljava/util/List;", "setFavoriteList", "toFavoriteFriendsBeans", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteCustomResp extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private List<FavoriteCustomBean> favoriteList;

    public final List<FavoriteCustomBean> getFavoriteList() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteCustomBean> list = this.favoriteList;
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setFavoriteList(List<FavoriteCustomBean> list) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.favoriteList = list;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = i3 + 9;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 55 / 0;
        }
    }

    public FavoriteCustomResp(List<FavoriteCustomBean> list) {
        this.favoriteList = list;
    }

    public static List toFavoriteFriendsBeans$default(FavoriteCustomResp favoriteCustomResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = "";
        }
        List<FavoriteFriendsBean> favoriteFriendsBeans = favoriteCustomResp.toFavoriteFriendsBeans(str);
        int i4 = component2 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return favoriteFriendsBeans;
        }
        throw null;
    }

    public final List<FavoriteFriendsBean> toFavoriteFriendsBeans(String category) {
        String str;
        String avatarUrl;
        String accountNum;
        String idNumber;
        String favouriteName;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        List<FavoriteCustomBean> list = this.favoriteList;
        if (list == null) {
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return arrayList;
        }
        for (FavoriteCustomBean favoriteCustomBean : list) {
            if (TextUtils.isEmpty(category) || Intrinsics.areEqual(category, favoriteCustomBean.getFavoriteCategory())) {
                FavoriteContent favoriteContent = (FavoriteContent) SecureGsonUtils.fromJson(favoriteCustomBean.getFavoriteContent(), FavoriteContent.class);
                String str2 = (favoriteContent == null || (favouriteName = favoriteContent.getFavouriteName()) == null) ? "" : favouriteName;
                String str3 = (favoriteContent == null || (idNumber = favoriteContent.getIdNumber()) == null) ? "" : idNumber;
                String id = favoriteCustomBean.getId();
                if (favoriteContent == null || (accountNum = favoriteContent.getAccountNum()) == null) {
                    int i4 = copydefault + 47;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    str = "";
                } else {
                    str = accountNum;
                }
                arrayList.add(new FavoriteFriendsBean(0, str2, id, str3, str, (favoriteContent == null || (avatarUrl = favoriteContent.getAvatarUrl()) == null) ? "" : avatarUrl, null, 0L, 0, 449, null));
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, new Comparator() {
                private static int ShareDataUIState = 1;
                private static int component1;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final int compare(T t, T t2) {
                    int i6 = 2 % 2;
                    int i7 = ShareDataUIState + 23;
                    component1 = i7 % 128;
                    FavoriteFriendsBean favoriteFriendsBean = (FavoriteFriendsBean) t;
                    if (i7 % 2 == 0) {
                        return ComparisonsKt.compareValues(favoriteFriendsBean.getName(), ((FavoriteFriendsBean) t2).getName());
                    }
                    ComparisonsKt.compareValues(favoriteFriendsBean.getName(), ((FavoriteFriendsBean) t2).getName());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            int i6 = copydefault + 79;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            if (hashSet.add(((FavoriteFriendsBean) obj).getId())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FavoriteCustomResp copy$default(FavoriteCustomResp favoriteCustomResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 13;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 105;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                List<FavoriteCustomBean> list2 = favoriteCustomResp.favoriteList;
                throw null;
            }
            list = favoriteCustomResp.favoriteList;
        }
        return favoriteCustomResp.copy(list);
    }

    public final List<FavoriteCustomBean> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<FavoriteCustomBean> list = this.favoriteList;
        int i4 = i2 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return list;
    }

    public final FavoriteCustomResp copy(List<FavoriteCustomBean> favoriteList) {
        int i = 2 % 2;
        FavoriteCustomResp favoriteCustomResp = new FavoriteCustomResp(favoriteList);
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return favoriteCustomResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteCustomResp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.favoriteList, ((FavoriteCustomResp) other).favoriteList)) {
            int i4 = component2 + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = copydefault + 111;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 80 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<FavoriteCustomBean> list = this.favoriteList;
        if (list != null) {
            return list.hashCode();
        }
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        return i5 % 2 == 0 ? 1 : 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteCustomResp(favoriteList=" + this.favoriteList + ")";
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return str;
    }
}
