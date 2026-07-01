package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001d\"\u0004\b \u0010\u001fR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/SettingsBean;", "Ljava/io/Serializable;", GriverCacheDao.COLUMN_CACHE_ID, "", "iconRes", "", "name", "funcIcon", KeysConstants.KEY_EXECUTE, "isSettingEnabled", "", "isToggleEnabled", CdpConstants.CONTENT_URL_MODEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getName", "setName", "getFuncIcon", "setFuncIcon", "getExecute", "setExecute", "()Z", "setSettingEnabled", "(Z)V", "setToggleEnabled", "getLink", "setLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsBean implements Serializable {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String execute;
    private String funcIcon;
    private int iconRes;
    private String id;
    private boolean isSettingEnabled;
    private boolean isToggleEnabled;
    private String link;
    private String name;

    public SettingsBean(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.iconRes = i;
        this.name = str2;
        this.funcIcon = str3;
        this.execute = str4;
        this.isSettingEnabled = z;
        this.isToggleEnabled = z2;
        this.link = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingsBean(String str, int i, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        boolean z3;
        String str8 = "";
        if ((i2 & 1) != 0) {
            int i3 = ShareDataUIState + 107;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str6 = "";
        } else {
            str6 = str;
        }
        boolean z4 = false;
        int i4 = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            int i5 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        String str9 = (i2 & 8) != 0 ? "" : str3;
        String str10 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            int i6 = component3 + 31;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 64) != 0) {
            int i9 = ShareDataUIState + 15;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            int i11 = 2 % 2;
        } else {
            str8 = str5;
        }
        this(str6, i4, str7, str9, str10, z3, z4, str8);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.iconRes;
        int i6 = i2 + 77;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.iconRes = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        int i4 = ShareDataUIState + 35;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getFuncIcon() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.funcIcon;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setFuncIcon(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.funcIcon = str;
        int i4 = ShareDataUIState + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        throw null;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
            int i3 = 69 / 0;
        }
    }

    public final boolean isSettingEnabled() {
        boolean z;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            z = this.isSettingEnabled;
            int i4 = 64 / 0;
        } else {
            z = this.isSettingEnabled;
        }
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return z;
    }

    public final void setSettingEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.isSettingEnabled = z;
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean isToggleEnabled() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isToggleEnabled;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setToggleEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.isToggleEnabled = z;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getLink() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.link;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLink(String str) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.link = str;
        int i4 = ShareDataUIState + 37;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    public SettingsBean() {
        this(null, 0, null, null, null, false, false, null, 255, null);
    }

    public static SettingsBean copy$default(SettingsBean settingsBean, String str, int i, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i2, Object obj) {
        int i3;
        String str6;
        String str7;
        boolean z3;
        boolean z4;
        String str8;
        int i4 = 2 % 2;
        String str9 = (i2 & 1) != 0 ? settingsBean.id : str;
        if ((i2 & 2) != 0) {
            int i5 = component3 + 21;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = settingsBean.iconRes;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i3 = settingsBean.iconRes;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            str6 = settingsBean.name;
            int i7 = ShareDataUIState + 15;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str6 = str2;
        }
        String str10 = (i2 & 8) != 0 ? settingsBean.funcIcon : str3;
        if ((i2 & 16) != 0) {
            int i9 = component3 + 65;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            str7 = settingsBean.execute;
        } else {
            str7 = str4;
        }
        if ((i2 & 32) != 0) {
            int i11 = ShareDataUIState + 121;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            z3 = settingsBean.isSettingEnabled;
        } else {
            z3 = z;
        }
        if ((i2 & 64) != 0) {
            int i13 = component3 + 67;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
            z4 = settingsBean.isToggleEnabled;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            int i15 = ShareDataUIState + 117;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            str8 = settingsBean.link;
        } else {
            str8 = str5;
        }
        SettingsBean settingsBeanCopy = settingsBean.copy(str9, i3, str6, str10, str7, z3, z4, str8);
        int i17 = component3 + 15;
        ShareDataUIState = i17 % 128;
        int i18 = i17 % 2;
        return settingsBeanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.iconRes;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funcIcon;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.isSettingEnabled;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.isToggleEnabled;
        int i5 = i3 + 3;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.link;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SettingsBean copy(String id, int iconRes, String name, String funcIcon, String execute, boolean isSettingEnabled, boolean isToggleEnabled, String link) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(funcIcon, "");
        Intrinsics.checkNotNullParameter(execute, "");
        Intrinsics.checkNotNullParameter(link, "");
        SettingsBean settingsBean = new SettingsBean(id, iconRes, name, funcIcon, execute, isSettingEnabled, isToggleEnabled, link);
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return settingsBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SettingsBean)) {
            return false;
        }
        SettingsBean settingsBean = (SettingsBean) other;
        if (!Intrinsics.areEqual(this.id, settingsBean.id)) {
            return false;
        }
        if (this.iconRes == settingsBean.iconRes) {
            return Intrinsics.areEqual(this.name, settingsBean.name) && !(Intrinsics.areEqual(this.funcIcon, settingsBean.funcIcon) ^ true) && Intrinsics.areEqual(this.execute, settingsBean.execute) && this.isSettingEnabled == settingsBean.isSettingEnabled && this.isToggleEnabled == settingsBean.isToggleEnabled && Intrinsics.areEqual(this.link, settingsBean.link);
        }
        int i4 = ShareDataUIState + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.iconRes)) * 31) + this.name.hashCode()) * 31) + this.funcIcon.hashCode()) * 31) + this.execute.hashCode()) * 31) + Boolean.hashCode(this.isSettingEnabled)) * 31) + Boolean.hashCode(this.isToggleEnabled)) * 31) + this.link.hashCode();
        int i4 = component3 + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SettingsBean(id=" + this.id + ", iconRes=" + this.iconRes + ", name=" + this.name + ", funcIcon=" + this.funcIcon + ", execute=" + this.execute + ", isSettingEnabled=" + this.isSettingEnabled + ", isToggleEnabled=" + this.isToggleEnabled + ", link=" + this.link + ")";
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
