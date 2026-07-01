package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/UserInfoComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "avatarRoundCorner", "", "rightIcon", "Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "<init>", "(Ljava/lang/Integer;Lcom/huawei/digitalpayment/common/theme/data/IconConfig;)V", "getAvatarRoundCorner", "()Ljava/lang/Integer;", "setAvatarRoundCorner", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRightIcon", "()Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "setRightIcon", "(Lcom/huawei/digitalpayment/common/theme/data/IconConfig;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/huawei/digitalpayment/common/theme/data/IconConfig;)Lcom/huawei/digitalpayment/common/theme/data/UserInfoComponent;", "equals", "", "other", "", "hashCode", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UserInfoComponent extends BaseComponent {
    private static int ShareDataUIState = 1;
    private static int component2;
    private Integer avatarRoundCorner;
    private IconConfig rightIcon;

    /* JADX WARN: Illegal instructions before constructor call */
    public UserInfoComponent(Integer num, IconConfig iconConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = ShareDataUIState + 55;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            iconConfig = null;
        }
        this(num, iconConfig);
    }

    public final Integer getAvatarRoundCorner() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            num = this.avatarRoundCorner;
            int i4 = 90 / 0;
        } else {
            num = this.avatarRoundCorner;
        }
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAvatarRoundCorner(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.avatarRoundCorner = num;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IconConfig getRightIcon() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        IconConfig iconConfig = this.rightIcon;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return iconConfig;
    }

    public final void setRightIcon(IconConfig iconConfig) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.rightIcon = iconConfig;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
    }

    public UserInfoComponent(Integer num, IconConfig iconConfig) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.avatarRoundCorner = num;
        this.rightIcon = iconConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserInfoComponent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static UserInfoComponent copy$default(UserInfoComponent userInfoComponent, Integer num, IconConfig iconConfig, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 3;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            num = userInfoComponent.avatarRoundCorner;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 61;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                IconConfig iconConfig2 = userInfoComponent.rightIcon;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            iconConfig = userInfoComponent.rightIcon;
        }
        return userInfoComponent.copy(num, iconConfig);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarRoundCorner;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return num;
    }

    public final IconConfig component2() {
        IconConfig iconConfig;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            iconConfig = this.rightIcon;
            int i4 = 17 / 0;
        } else {
            iconConfig = this.rightIcon;
        }
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return iconConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UserInfoComponent copy(Integer avatarRoundCorner, IconConfig rightIcon) {
        int i = 2 % 2;
        UserInfoComponent userInfoComponent = new UserInfoComponent(avatarRoundCorner, rightIcon);
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return userInfoComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof UserInfoComponent)) {
            return false;
        }
        UserInfoComponent userInfoComponent = (UserInfoComponent) other;
        if (Intrinsics.areEqual(this.avatarRoundCorner, userInfoComponent.avatarRoundCorner)) {
            if (!Intrinsics.areEqual(this.rightIcon, userInfoComponent.rightIcon)) {
                int i4 = ShareDataUIState + 65;
                int i5 = i4 % 128;
                component2 = i5;
                z = i4 % 2 != 0;
                int i6 = i5 + 55;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
            return z;
        }
        int i8 = component2 + 91;
        int i9 = i8 % 128;
        ShareDataUIState = i9;
        z = i8 % 2 == 0;
        int i10 = i9 + 47;
        component2 = i10 % 128;
        if (i10 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.avatarRoundCorner;
        int iHashCode2 = 0;
        if (num == null) {
            int i2 = ShareDataUIState + 19;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        IconConfig iconConfig = this.rightIcon;
        if (iconConfig != null) {
            iHashCode2 = iconConfig.hashCode();
            int i4 = ShareDataUIState + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserInfoComponent(avatarRoundCorner=" + this.avatarRoundCorner + ", rightIcon=" + this.rightIcon + ")";
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
