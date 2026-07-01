package com.huawei.digitalpayment.consumer.sfcui.favorites.manage;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.HttpMethod;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/manage/FavoriteActionType;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "SELECT_ACTION", "EDIT", HttpMethod.DELETE_REQUEST, "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteActionType {
    private static final EnumEntries $ENTRIES;
    private static final FavoriteActionType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final FavoriteActionType NONE = new FavoriteActionType(NetworkUtils.NETWORK_TYPE_NONE, 0);
    public static final FavoriteActionType SELECT_ACTION = new FavoriteActionType("SELECT_ACTION", 1);
    public static final FavoriteActionType EDIT = new FavoriteActionType("EDIT", 2);
    public static final FavoriteActionType DELETE = new FavoriteActionType(HttpMethod.DELETE_REQUEST, 3);

    private FavoriteActionType(String str, int i) {
    }

    static {
        FavoriteActionType[] favoriteActionTypeArr$values = $values();
        $VALUES = favoriteActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(favoriteActionTypeArr$values);
        int i = component2 + 59;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FavoriteActionType valueOf(String str) {
        FavoriteActionType favoriteActionType;
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            favoriteActionType = (FavoriteActionType) Enum.valueOf(FavoriteActionType.class, str);
            int i3 = 64 / 0;
        } else {
            favoriteActionType = (FavoriteActionType) Enum.valueOf(FavoriteActionType.class, str);
        }
        int i4 = component3 + 27;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return favoriteActionType;
    }

    public static FavoriteActionType[] values() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FavoriteActionType[] favoriteActionTypeArr = (FavoriteActionType[]) $VALUES.clone();
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return favoriteActionTypeArr;
    }

    private static final FavoriteActionType[] $values() {
        FavoriteActionType[] favoriteActionTypeArr;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            FavoriteActionType favoriteActionType = NONE;
            FavoriteActionType favoriteActionType2 = SELECT_ACTION;
            FavoriteActionType favoriteActionType3 = EDIT;
            FavoriteActionType favoriteActionType4 = DELETE;
            favoriteActionTypeArr = new FavoriteActionType[4];
            favoriteActionTypeArr[1] = favoriteActionType;
            favoriteActionTypeArr[0] = favoriteActionType2;
            favoriteActionTypeArr[3] = favoriteActionType3;
            favoriteActionTypeArr[4] = favoriteActionType4;
        } else {
            favoriteActionTypeArr = new FavoriteActionType[]{NONE, SELECT_ACTION, EDIT, DELETE};
        }
        int i4 = i2 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return favoriteActionTypeArr;
    }

    public static EnumEntries<FavoriteActionType> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<FavoriteActionType> enumEntries = $ENTRIES;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
