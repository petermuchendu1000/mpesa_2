package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J¸\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0006HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006F"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElement;", "Ljava/io/Serializable;", "guiInputLabel", "", "guiOutputLabel", "guiInputLen", "", "guiDefaultValue", "guiInputType", "guiMandatoryFlag", "", "guiVisibility", "guiModifiability", "guiErrorMessage", "dataType", "valueMin", "valueMax", "guiConditionExpr", "propCode", "propTips", "selectList", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiSelectInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGuiInputLabel", "()Ljava/lang/String;", "getGuiOutputLabel", "getGuiInputLen", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGuiDefaultValue", "getGuiInputType", "getGuiMandatoryFlag", "()Z", "getGuiVisibility", "getGuiModifiability", "getGuiErrorMessage", "getDataType", "getValueMin", "()I", "getValueMax", "getGuiConditionExpr", "getPropCode", "getPropTips", "getSelectList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElement;", "equals", "other", "", "hashCode", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiElement implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String dataType;
    private final String guiConditionExpr;
    private final String guiDefaultValue;
    private final String guiErrorMessage;
    private final String guiInputLabel;
    private final Integer guiInputLen;
    private final String guiInputType;
    private final boolean guiMandatoryFlag;
    private final String guiModifiability;
    private final String guiOutputLabel;
    private final String guiVisibility;
    private final String propCode;
    private final String propTips;
    private final List<GuiSelectInfo> selectList;
    private final int valueMax;
    private final int valueMin;

    public GuiElement(String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List<GuiSelectInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.guiInputLabel = str;
        this.guiOutputLabel = str2;
        this.guiInputLen = num;
        this.guiDefaultValue = str3;
        this.guiInputType = str4;
        this.guiMandatoryFlag = z;
        this.guiVisibility = str5;
        this.guiModifiability = str6;
        this.guiErrorMessage = str7;
        this.dataType = str8;
        this.valueMin = i;
        this.valueMax = i2;
        this.guiConditionExpr = str9;
        this.propCode = str10;
        this.propTips = str11;
        this.selectList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuiElement(String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        int i4;
        int i5;
        boolean z2 = (i3 & 32) != 0 ? false : z;
        if ((i3 & 64) != 0) {
            int i6 = component2 + 125;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str12 = "0";
        } else {
            str12 = str5;
        }
        if ((i3 & 128) != 0) {
            int i7 = 2 % 2;
            str13 = "0";
        } else {
            str13 = str6;
        }
        if ((i3 & 1024) != 0) {
            int i8 = component2 + 91;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 49 / 0;
            }
            int i10 = 2 % 2;
            i4 = Integer.MIN_VALUE;
        } else {
            i4 = i;
        }
        if ((i3 & 2048) != 0) {
            int i11 = 2 % 2;
            i5 = Integer.MAX_VALUE;
        } else {
            i5 = i2;
        }
        this(str, str2, num, str3, str4, z2, str12, str13, str7, str8, i4, i5, str9, str10, str11, list);
    }

    public final String getGuiInputLabel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.guiInputLabel;
        int i4 = i3 + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getGuiOutputLabel() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.guiOutputLabel;
        int i4 = i2 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getGuiInputLen() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.guiInputLen;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGuiDefaultValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiDefaultValue;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGuiInputType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiInputType;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getGuiMandatoryFlag() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.guiMandatoryFlag;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getGuiVisibility() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.guiVisibility;
            int i4 = 86 / 0;
        } else {
            str = this.guiVisibility;
        }
        int i5 = i2 + 53;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGuiModifiability() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.guiModifiability;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGuiErrorMessage() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.guiErrorMessage;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return str;
    }

    public final String getDataType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.dataType;
        int i4 = i2 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getValueMin() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.valueMin;
        if (i3 != 0) {
            int i5 = 43 / 0;
        }
        return i4;
    }

    public final int getValueMax() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.valueMax;
        int i6 = i3 + 99;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getGuiConditionExpr() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiConditionExpr;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPropCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.propCode;
        int i4 = i3 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPropTips() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.propTips;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<GuiSelectInfo> getSelectList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<GuiSelectInfo> list = this.selectList;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GuiElement copy$default(GuiElement guiElement, String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List list, int i3, Object obj) {
        Integer num2;
        String str12;
        String str13;
        String str14;
        int i4;
        String str15;
        String str16;
        int i5 = 2 % 2;
        String str17 = (i3 & 1) != 0 ? guiElement.guiInputLabel : str;
        String str18 = (i3 & 2) != 0 ? guiElement.guiOutputLabel : str2;
        if ((i3 & 4) != 0) {
            int i6 = ShareDataUIState + 115;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            num2 = guiElement.guiInputLen;
        } else {
            num2 = num;
        }
        String str19 = (i3 & 8) != 0 ? guiElement.guiDefaultValue : str3;
        if ((i3 & 16) != 0) {
            int i8 = ShareDataUIState + 33;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str12 = guiElement.guiInputType;
        } else {
            str12 = str4;
        }
        boolean z2 = (i3 & 32) != 0 ? guiElement.guiMandatoryFlag : z;
        String str20 = (i3 & 64) != 0 ? guiElement.guiVisibility : str5;
        String str21 = (i3 & 128) != 0 ? guiElement.guiModifiability : str6;
        if ((i3 & 256) != 0) {
            int i10 = component2 + 93;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            str13 = guiElement.guiErrorMessage;
        } else {
            str13 = str7;
        }
        if ((i3 & 512) != 0) {
            str14 = guiElement.dataType;
            int i12 = component2 + 17;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str14 = str8;
        }
        int i14 = (i3 & 1024) != 0 ? guiElement.valueMin : i;
        if ((i3 & 2048) != 0) {
            int i15 = ShareDataUIState + 29;
            component2 = i15 % 128;
            int i16 = i15 % 2;
            i4 = guiElement.valueMax;
        } else {
            i4 = i2;
        }
        String str22 = (i3 & 4096) != 0 ? guiElement.guiConditionExpr : str9;
        String str23 = (i3 & 8192) != 0 ? guiElement.propCode : str10;
        if ((i3 & 16384) != 0) {
            int i17 = ShareDataUIState + 53;
            str15 = str22;
            component2 = i17 % 128;
            int i18 = i17 % 2;
            str16 = guiElement.propTips;
        } else {
            str15 = str22;
            str16 = str11;
        }
        return guiElement.copy(str17, str18, num2, str19, str12, z2, str20, str21, str13, str14, i14, i4, str15, str23, str16, (i3 & 32768) != 0 ? guiElement.selectList : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiInputLabel;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.dataType;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.valueMin;
        int i6 = i3 + 79;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int component12() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.valueMax;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.guiConditionExpr;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.propCode;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.propTips;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<GuiSelectInfo> component16() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<GuiSelectInfo> list = this.selectList;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.guiOutputLabel;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.guiInputLen;
            int i4 = 12 / 0;
        } else {
            num = this.guiInputLen;
        }
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.guiDefaultValue;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.guiInputType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.guiMandatoryFlag;
        int i4 = i3 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.guiVisibility;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiModifiability;
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.guiErrorMessage;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return str;
    }

    public final GuiElement copy(String guiInputLabel, String guiOutputLabel, Integer guiInputLen, String guiDefaultValue, String guiInputType, boolean guiMandatoryFlag, String guiVisibility, String guiModifiability, String guiErrorMessage, String dataType, int valueMin, int valueMax, String guiConditionExpr, String propCode, String propTips, List<GuiSelectInfo> selectList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(guiInputLabel, "");
        Intrinsics.checkNotNullParameter(guiOutputLabel, "");
        Intrinsics.checkNotNullParameter(guiDefaultValue, "");
        Intrinsics.checkNotNullParameter(guiInputType, "");
        Intrinsics.checkNotNullParameter(guiVisibility, "");
        Intrinsics.checkNotNullParameter(guiModifiability, "");
        Intrinsics.checkNotNullParameter(guiErrorMessage, "");
        Intrinsics.checkNotNullParameter(dataType, "");
        Intrinsics.checkNotNullParameter(guiConditionExpr, "");
        Intrinsics.checkNotNullParameter(propCode, "");
        Intrinsics.checkNotNullParameter(propTips, "");
        GuiElement guiElement = new GuiElement(guiInputLabel, guiOutputLabel, guiInputLen, guiDefaultValue, guiInputType, guiMandatoryFlag, guiVisibility, guiModifiability, guiErrorMessage, dataType, valueMin, valueMax, guiConditionExpr, propCode, propTips, selectList);
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return guiElement;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiElement)) {
            return false;
        }
        GuiElement guiElement = (GuiElement) other;
        if (!Intrinsics.areEqual(this.guiInputLabel, guiElement.guiInputLabel) || !Intrinsics.areEqual(this.guiOutputLabel, guiElement.guiOutputLabel) || !Intrinsics.areEqual(this.guiInputLen, guiElement.guiInputLen) || !Intrinsics.areEqual(this.guiDefaultValue, guiElement.guiDefaultValue) || !Intrinsics.areEqual(this.guiInputType, guiElement.guiInputType)) {
            return false;
        }
        if (this.guiMandatoryFlag != guiElement.guiMandatoryFlag) {
            int i2 = component2 + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.guiVisibility, guiElement.guiVisibility) || !Intrinsics.areEqual(this.guiModifiability, guiElement.guiModifiability)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.guiErrorMessage, guiElement.guiErrorMessage)) {
            int i4 = component2 + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dataType, guiElement.dataType)) {
            return false;
        }
        if (this.valueMin != guiElement.valueMin) {
            int i6 = ShareDataUIState + 115;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.valueMax != guiElement.valueMax || !Intrinsics.areEqual(this.guiConditionExpr, guiElement.guiConditionExpr)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.propCode, guiElement.propCode)) {
            int i8 = component2 + 117;
            ShareDataUIState = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.propTips, guiElement.propTips)) {
            return false;
        }
        if (Intrinsics.areEqual(this.selectList, guiElement.selectList)) {
            return true;
        }
        int i9 = ShareDataUIState + 121;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r2 r4 r5
  0x0033: PHI (r2v38 int) = (r2v5 int), (r2v40 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r5v3 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v5 java.lang.Integer) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r2 r4
  0x0031: PHI (r2v6 int) = (r2v5 int), (r2v40 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElement.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiElement(guiInputLabel=" + this.guiInputLabel + ", guiOutputLabel=" + this.guiOutputLabel + ", guiInputLen=" + this.guiInputLen + ", guiDefaultValue=" + this.guiDefaultValue + ", guiInputType=" + this.guiInputType + ", guiMandatoryFlag=" + this.guiMandatoryFlag + ", guiVisibility=" + this.guiVisibility + ", guiModifiability=" + this.guiModifiability + ", guiErrorMessage=" + this.guiErrorMessage + ", dataType=" + this.dataType + ", valueMin=" + this.valueMin + ", valueMax=" + this.valueMax + ", guiConditionExpr=" + this.guiConditionExpr + ", propCode=" + this.propCode + ", propTips=" + this.propTips + ", selectList=" + this.selectList + ")";
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
