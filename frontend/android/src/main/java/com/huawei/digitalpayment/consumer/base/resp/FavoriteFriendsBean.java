package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jc\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "Ljava/io/Serializable;", "iconRes", "", "name", "", GriverCacheDao.COLUMN_CACHE_ID, "phoneNumber", "accountNumber", Keys.KEY_HEADER_URL, TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "createTime", "", "listPosition", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getIconRes", "()I", "setIconRes", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "setId", Constants.JS_API_GET_PHONE_NUMBER, "setPhoneNumber", "getAccountNumber", "setAccountNumber", "getAvatarUrl", "setAvatarUrl", "getCategory", "setCategory", "getCreateTime", "()J", "setCreateTime", "(J)V", "getListPosition", "setListPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteFriendsBean implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private String accountNumber;
    private String avatarUrl;
    private String category;
    private long createTime;
    private int iconRes;
    private String id;
    private int listPosition;
    private String name;
    private String phoneNumber;

    public FavoriteFriendsBean(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.iconRes = i;
        this.name = str;
        this.id = str2;
        this.phoneNumber = str3;
        this.accountNumber = str4;
        this.avatarUrl = str5;
        this.category = str6;
        this.createTime = j;
        this.listPosition = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavoriteFriendsBean(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str7;
        String str8;
        String str9;
        String str10;
        if ((i3 & 1) != 0) {
            int i5 = 2 % 2;
            i4 = -1;
        } else {
            i4 = i;
        }
        String str11 = "";
        String str12 = (i3 & 2) != 0 ? "" : str;
        if ((i3 & 4) != 0) {
            int i6 = component2 + 55;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
            }
            int i8 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i3 & 8) != 0) {
            int i9 = ShareDataUIState + 13;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str8 = "";
        } else {
            str8 = str3;
        }
        if ((i3 & 16) != 0) {
            int i10 = 2 % 2;
            str9 = "";
        } else {
            str9 = str4;
        }
        if ((i3 & 32) != 0) {
            int i11 = ShareDataUIState + 87;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            str10 = "";
        } else {
            str10 = str5;
        }
        if ((i3 & 64) != 0) {
            int i13 = 2 % 2;
        } else {
            str11 = str6;
        }
        this(i4, str12, str7, str8, str9, str10, str11, (i3 & 128) != 0 ? 0L : j, (i3 & 256) != 0 ? Integer.MAX_VALUE : i2);
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.iconRes;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        this.iconRes = i;
        int i6 = i3 + 9;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        int i4 = component2 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.phoneNumber = str;
        int i4 = component2 + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getAccountNumber() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.accountNumber;
            int i4 = 35 / 0;
        } else {
            str = this.accountNumber;
        }
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAccountNumber(String str) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.accountNumber = str;
        int i4 = ShareDataUIState + 47;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatarUrl;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAvatarUrl(String str) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.avatarUrl = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.avatarUrl = str;
            int i3 = 82 / 0;
        }
    }

    public final String getCategory() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.category;
            int i4 = 84 / 0;
        } else {
            str = this.category;
        }
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCategory(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.category = str;
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.category = str;
        }
        int i4 = ShareDataUIState + 57;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final long getCreateTime() {
        long j;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.createTime;
            int i4 = 59 / 0;
        } else {
            j = this.createTime;
        }
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final void setCreateTime(long j) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.createTime = j;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getListPosition() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.listPosition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setListPosition(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.listPosition = i;
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
    }

    public FavoriteFriendsBean() {
        this(0, null, null, null, null, null, null, 0L, 0, 511, null);
    }

    public static FavoriteFriendsBean copy$default(FavoriteFriendsBean favoriteFriendsBean, int i, String str, String str2, String str3, String str4, String str5, String str6, long j, int i2, int i3, Object obj) {
        int i4;
        String str7;
        String str8;
        String str9;
        long j2;
        int i5;
        int i6 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i7 = component2 + 99;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = favoriteFriendsBean.iconRes;
                throw null;
            }
            i4 = favoriteFriendsBean.iconRes;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            int i9 = component2 + 125;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str7 = favoriteFriendsBean.name;
        } else {
            str7 = str;
        }
        String str10 = (i3 & 4) != 0 ? favoriteFriendsBean.id : str2;
        String str11 = (i3 & 8) != 0 ? favoriteFriendsBean.phoneNumber : str3;
        if ((i3 & 16) != 0) {
            int i11 = ShareDataUIState + 7;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            str8 = favoriteFriendsBean.accountNumber;
        } else {
            str8 = str4;
        }
        String str12 = (i3 & 32) != 0 ? favoriteFriendsBean.avatarUrl : str5;
        if ((i3 & 64) != 0) {
            int i13 = ShareDataUIState + 113;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                str9 = favoriteFriendsBean.category;
                int i14 = 50 / 0;
            } else {
                str9 = favoriteFriendsBean.category;
            }
        } else {
            str9 = str6;
        }
        if ((i3 & 128) != 0) {
            int i15 = component2 + 71;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            j2 = favoriteFriendsBean.createTime;
        } else {
            j2 = j;
        }
        if ((i3 & 256) != 0) {
            i5 = favoriteFriendsBean.listPosition;
            int i17 = component2 + 103;
            ShareDataUIState = i17 % 128;
            int i18 = i17 % 2;
        } else {
            i5 = i2;
        }
        return favoriteFriendsBean.copy(i4, str7, str10, str11, str8, str12, str9, j2, i5);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.iconRes;
        int i6 = i3 + 73;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.phoneNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountNumber;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatarUrl;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long component8() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.createTime;
        }
        int i3 = 17 / 0;
        return this.createTime;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.listPosition;
        int i6 = i2 + 57;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FavoriteFriendsBean copy(int iconRes, String name, String id, String phoneNumber, String accountNumber, String avatarUrl, String category, long createTime, int listPosition) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Intrinsics.checkNotNullParameter(category, "");
        FavoriteFriendsBean favoriteFriendsBean = new FavoriteFriendsBean(iconRes, name, id, phoneNumber, accountNumber, avatarUrl, category, createTime, listPosition);
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return favoriteFriendsBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteFriendsBean)) {
            int i2 = ShareDataUIState + 71;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FavoriteFriendsBean favoriteFriendsBean = (FavoriteFriendsBean) other;
        if (this.iconRes != favoriteFriendsBean.iconRes) {
            return false;
        }
        if (Intrinsics.areEqual(this.name, favoriteFriendsBean.name)) {
            return !(Intrinsics.areEqual(this.id, favoriteFriendsBean.id) ^ true) && Intrinsics.areEqual(this.phoneNumber, favoriteFriendsBean.phoneNumber) && Intrinsics.areEqual(this.accountNumber, favoriteFriendsBean.accountNumber) && Intrinsics.areEqual(this.avatarUrl, favoriteFriendsBean.avatarUrl) && Intrinsics.areEqual(this.category, favoriteFriendsBean.category) && this.createTime == favoriteFriendsBean.createTime && this.listPosition == favoriteFriendsBean.listPosition;
        }
        int i4 = ShareDataUIState + 121;
        component2 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Integer.hashCode(this.iconRes) * 31) + this.name.hashCode()) * 31) + this.id.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.category.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.listPosition);
        int i4 = component2 + 59;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteFriendsBean(iconRes=" + this.iconRes + ", name=" + this.name + ", id=" + this.id + ", phoneNumber=" + this.phoneNumber + ", accountNumber=" + this.accountNumber + ", avatarUrl=" + this.avatarUrl + ", category=" + this.category + ", createTime=" + this.createTime + ", listPosition=" + this.listPosition + ")";
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
