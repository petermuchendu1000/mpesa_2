package com.huawei.digitalpayment.home.data.source.locaL;

import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¹\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\n\u0010;\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010<\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010>H\u0096\u0002J\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0000J\b\u0010D\u001a\u0004\u0018\u00010\u0004J\u0012\u0010D\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\rJ\u000b\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010M\u001a\u00020\rHÆ\u0003J\t\u0010N\u001a\u00020\rHÆ\u0003J\t\u0010O\u001a\u00020\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J»\u0001\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010U\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010*\"\u0004\b3\u0010,R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001a¨\u0006V"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "Lcom/huawei/http/BaseResp;", "funcId", "", "funcName", "funIcon", "funIconDark", "funIconSelected", KeysConstants.KEY_EXECUTE, "marker", "showSeconds", "editEnable", "", "added", "funTag", "funTagName", "isLightIcon", "childMenus", "", "extraCondition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "getFuncId", "()Ljava/lang/String;", "setFuncId", "(Ljava/lang/String;)V", "getFuncName", "setFuncName", "getFunIcon", "setFunIcon", "getFunIconDark", "setFunIconDark", "getFunIconSelected", "setFunIconSelected", "getExecute", "setExecute", "getMarker", "setMarker", "getShowSeconds", "setShowSeconds", "getEditEnable", "()Z", "setEditEnable", "(Z)V", "getAdded", "setAdded", "getFunTag", "setFunTag", "getFunTagName", "setFunTagName", "setLightIcon", "getChildMenus", "()Ljava/util/List;", "setChildMenus", "(Ljava/util/List;)V", "getExtraCondition", "setExtraCondition", "delayTime", GriverParams.ShareParams.IMAGE_URL, "equals", "other", "", "hashCode", "", "fillEmptyWithOther", "", "function", "getIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalHomeFunction extends BaseResp implements BannerView.BannerBean {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private boolean added;
    private List<LocalHomeFunction> childMenus;
    private boolean editEnable;
    private String execute;
    private String extraCondition;

    @SerializedName(alternate = {"icon"}, value = "funIcon")
    private String funIcon;
    private String funIconDark;
    private String funIconSelected;
    private String funTag;
    private String funTagName;
    private String funcId;
    private String funcName;
    private boolean isLightIcon;
    private String marker;
    private String showSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalHomeFunction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, List list, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z4;
        boolean z5;
        List list2;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            str12 = null;
        } else {
            str12 = str;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str13 = null;
        } else {
            str13 = str2;
        }
        String str17 = (i & 4) != 0 ? null : str3;
        String str18 = (i & 8) != 0 ? null : str4;
        String str19 = (i & 16) != 0 ? null : str5;
        boolean z6 = false;
        if ((i & 32) != 0) {
            int i5 = ShareDataUIState + 77;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            str14 = null;
        } else {
            str14 = str6;
        }
        if ((i & 64) != 0) {
            int i7 = 2 % 2;
            str15 = null;
        } else {
            str15 = str7;
        }
        String str20 = (i & 128) != 0 ? null : str8;
        boolean z7 = (i & 256) != 0 ? true : z;
        if ((i & 512) != 0) {
            int i8 = component3 + 1;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                z6 = true;
            }
        } else {
            z6 = z2;
        }
        String str21 = (i & 1024) != 0 ? "other" : str9;
        if ((i & 2048) != 0) {
            int i9 = component3 + 75;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            int i10 = 2 % 2;
            str16 = null;
        } else {
            str16 = str10;
        }
        if ((i & 4096) != 0) {
            int i11 = component3 + 37;
            ShareDataUIState = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 / 2;
            } else {
                int i13 = 2 % 2;
            }
            z4 = true;
        } else {
            z4 = z3;
        }
        if ((i & 8192) != 0) {
            int i14 = ShareDataUIState + 47;
            z5 = z4;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            list2 = null;
        } else {
            z5 = z4;
            list2 = list;
        }
        this(str12, str13, str17, str18, str19, str14, str15, str20, z7, z6, str21, str16, z5, list2, (i & 16384) != 0 ? null : str11);
    }

    public final String getFuncId() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.funcId;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setFuncId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.funcId = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getFuncName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.funcName;
        int i4 = i3 + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setFuncName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.funcName = str;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public final String getFunIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.funIcon;
        int i4 = i2 + 71;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setFunIcon(String str) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.funIcon = str;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getFunIconDark() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.funIconDark;
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setFunIconDark(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.funIconDark = str;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getFunIconSelected() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.funIconSelected;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setFunIconSelected(String str) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.funIconSelected = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.execute = str;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    public final String getMarker() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.marker;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMarker(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.marker = str;
        int i5 = i2 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setShowSeconds(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.showSeconds = str;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getEditEnable() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.editEnable;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setEditEnable(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.editEnable = z;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 89;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean getAdded() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.added;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAdded(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.added = z;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getFunTag() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.funTag;
        int i4 = i3 + 65;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setFunTag(String str) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.funTag = str;
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getFunTagName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.funTagName;
        }
        throw null;
    }

    public final void setFunTagName(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.funTagName = str;
        int i5 = i2 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean isLightIcon() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isLightIcon;
        int i5 = i2 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setLightIcon(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.isLightIcon = z;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 39;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
    }

    public final List<LocalHomeFunction> getChildMenus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.childMenus;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setChildMenus(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.childMenus = list;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getExtraCondition() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.extraCondition;
        int i4 = i3 + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setExtraCondition(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.extraCondition = str;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public LocalHomeFunction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, List<LocalHomeFunction> list, String str11) {
        Intrinsics.checkNotNullParameter(str9, "");
        this.funcId = str;
        this.funcName = str2;
        this.funIcon = str3;
        this.funIconDark = str4;
        this.funIconSelected = str5;
        this.execute = str6;
        this.marker = str7;
        this.showSeconds = str8;
        this.editEnable = z;
        this.added = z2;
        this.funTag = str9;
        this.funTagName = str10;
        this.isLightIcon = z3;
        this.childMenus = list;
        this.extraCondition = str11;
    }

    @Override
    public String delayTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        if (str == null) {
            int i5 = i3 + 39;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 53;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str = "5";
        }
        int i10 = component3 + 17;
        ShareDataUIState = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String imageUrl() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.funIcon;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof LocalHomeFunction) {
            return Objects.equals(this.funcId, ((LocalHomeFunction) other).funcId);
        }
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.funcId;
        if (str == null) {
            int i4 = i2 + 97;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 5;
            }
            return 0;
        }
        int i6 = i2 + 61;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fillEmptyWithOther(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction r7) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction.fillEmptyWithOther(com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction):void");
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String icon = getIcon(this.isLightIcon);
        int i4 = component3 + 59;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return icon;
    }

    public static String getIcon$default(LocalHomeFunction localHomeFunction, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 35;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            z = true;
        }
        String icon = localHomeFunction.getIcon(z);
        int i4 = ShareDataUIState + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return icon;
    }

    public final String getIcon(boolean isLightIcon) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (isLightIcon) {
            return this.funIcon;
        }
        String str = this.funIconDark;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LocalHomeFunction() {
        this(null, null, null, null, null, null, null, null, false, false, null, null, false, null, null, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalHomeFunction copy$default(LocalHomeFunction localHomeFunction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, boolean z3, List list, String str11, int i, Object obj) {
        String str12;
        boolean z4;
        boolean z5;
        String str13;
        boolean z6;
        boolean z7;
        List list2;
        String str14;
        int i2 = 2 % 2;
        String str15 = (i & 1) != 0 ? localHomeFunction.funcId : str;
        String str16 = (i & 2) != 0 ? localHomeFunction.funcName : str2;
        String str17 = (i & 4) != 0 ? localHomeFunction.funIcon : str3;
        String str18 = (i & 8) != 0 ? localHomeFunction.funIconDark : str4;
        String str19 = (i & 16) != 0 ? localHomeFunction.funIconSelected : str5;
        if ((i & 32) != 0) {
            int i3 = ShareDataUIState + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str12 = localHomeFunction.execute;
        } else {
            str12 = str6;
        }
        String str20 = (i & 64) != 0 ? localHomeFunction.marker : str7;
        String str21 = (i & 128) != 0 ? localHomeFunction.showSeconds : str8;
        if ((i & 256) != 0) {
            int i5 = ShareDataUIState + 121;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z8 = localHomeFunction.editEnable;
                throw null;
            }
            z4 = localHomeFunction.editEnable;
        } else {
            z4 = z;
        }
        if ((i & 512) != 0) {
            int i6 = component3 + 19;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            z5 = localHomeFunction.added;
        } else {
            z5 = z2;
        }
        String str22 = (i & 1024) != 0 ? localHomeFunction.funTag : str9;
        String str23 = (i & 2048) != 0 ? localHomeFunction.funTagName : str10;
        if ((i & 4096) != 0) {
            int i8 = ShareDataUIState + 67;
            str13 = str23;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            z6 = localHomeFunction.isLightIcon;
        } else {
            str13 = str23;
            z6 = z3;
        }
        if ((i & 8192) != 0) {
            int i10 = ShareDataUIState + 79;
            z7 = z6;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            list2 = localHomeFunction.childMenus;
            if (i11 == 0) {
                int i12 = 91 / 0;
            }
        } else {
            z7 = z6;
            list2 = list;
        }
        if ((i & 16384) != 0) {
            int i13 = component3 + 53;
            ShareDataUIState = i13 % 128;
            if (i13 % 2 != 0) {
                String str24 = localHomeFunction.extraCondition;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str14 = localHomeFunction.extraCondition;
        } else {
            str14 = str11;
        }
        return localHomeFunction.copy(str15, str16, str17, str18, str19, str12, str20, str21, z4, z5, str22, str13, z7, list2, str14);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.funcId;
        int i4 = i2 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.added;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funTag;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funTagName;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component13() {
        boolean z;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.isLightIcon;
            int i4 = 91 / 0;
        } else {
            z = this.isLightIcon;
        }
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LocalHomeFunction> component14() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.childMenus;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.extraCondition;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.funcName;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funIcon;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.funIconDark;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.funIconSelected;
        int i4 = i3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marker;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.editEnable;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final LocalHomeFunction copy(String funcId, String funcName, String funIcon, String funIconDark, String funIconSelected, String execute, String marker, String showSeconds, boolean editEnable, boolean added, String funTag, String funTagName, boolean isLightIcon, List<LocalHomeFunction> childMenus, String extraCondition) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(funTag, "");
        LocalHomeFunction localHomeFunction = new LocalHomeFunction(funcId, funcName, funIcon, funIconDark, funIconSelected, execute, marker, showSeconds, editEnable, added, funTag, funTagName, isLightIcon, childMenus, extraCondition);
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return localHomeFunction;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalHomeFunction(funcId=" + this.funcId + ", funcName=" + this.funcName + ", funIcon=" + this.funIcon + ", funIconDark=" + this.funIconDark + ", funIconSelected=" + this.funIconSelected + ", execute=" + this.execute + ", marker=" + this.marker + ", showSeconds=" + this.showSeconds + ", editEnable=" + this.editEnable + ", added=" + this.added + ", funTag=" + this.funTag + ", funTagName=" + this.funTagName + ", isLightIcon=" + this.isLightIcon + ", childMenus=" + this.childMenus + ", extraCondition=" + this.extraCondition + ")";
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return str;
    }
}
