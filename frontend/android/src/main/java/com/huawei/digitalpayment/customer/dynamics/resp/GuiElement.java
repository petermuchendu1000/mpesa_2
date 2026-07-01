package com.huawei.digitalpayment.customer.dynamics.resp;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsSelectInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001eJÄ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b0\u0010\u001e¨\u0006I"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElement;", "Ljava/io/Serializable;", "guiInputLabel", "", "guiOutputLabel", "guiInputLen", "", "guiDefaultValue", "guiInputType", "guiMandatoryFlag", "", "guiVisibility", "guiModifiability", "guiErrorMessage", "dataType", "valueMin", "valueMax", "guiConditionExpr", "propCode", "propTips", "selectList", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsSelectInfo;", "guiDisplayOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getGuiInputLabel", "()Ljava/lang/String;", "getGuiOutputLabel", "getGuiInputLen", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGuiDefaultValue", "getGuiInputType", "getGuiMandatoryFlag", "()Z", "getGuiVisibility", "getGuiModifiability", "getGuiErrorMessage", "getDataType", "getValueMin", "()I", "getValueMax", "getGuiConditionExpr", "getPropCode", "getPropTips", "getSelectList", "()Ljava/util/List;", "getGuiDisplayOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElement;", "equals", "other", "", "hashCode", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiElement implements Serializable {
    private static int component3 = 1;
    private static int copydefault;
    private final String dataType;
    private final String guiConditionExpr;
    private final String guiDefaultValue;
    private final Integer guiDisplayOrder;
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
    private final List<DynamicsSelectInfo> selectList;
    private final int valueMax;
    private final int valueMin;

    public GuiElement(String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List<DynamicsSelectInfo> list, Integer num2) {
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
        this.guiDisplayOrder = num2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GuiElement(String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List list, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        int i4;
        boolean z2 = (i3 & 32) != 0 ? false : z;
        if ((i3 & 64) != 0) {
            int i5 = 2 % 2;
            str12 = "0";
        } else {
            str12 = str5;
        }
        if ((i3 & 128) != 0) {
            int i6 = component3 + 19;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i8 = i7 + 69;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str13 = "0";
        } else {
            str13 = str6;
        }
        if ((i3 & 1024) != 0) {
            int i10 = 2 % 2;
            i4 = Integer.MIN_VALUE;
        } else {
            i4 = i;
        }
        this(str, str2, num, str3, str4, z2, str12, str13, str7, str8, i4, (i3 & 2048) != 0 ? Integer.MAX_VALUE : i2, str9, str10, str11, list, num2);
    }

    public final String getGuiInputLabel() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiInputLabel;
        int i5 = i2 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGuiOutputLabel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiOutputLabel;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getGuiInputLen() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.guiInputLen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getGuiDefaultValue() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.guiDefaultValue;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public final String getGuiInputType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiInputType;
        int i5 = i2 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final boolean getGuiMandatoryFlag() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.guiMandatoryFlag;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getGuiVisibility() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiVisibility;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGuiModifiability() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.guiModifiability;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGuiErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.guiErrorMessage;
            int i4 = 55 / 0;
        } else {
            str = this.guiErrorMessage;
        }
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDataType() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.dataType;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    public final int getValueMin() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.valueMin;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getValueMax() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.valueMax;
        if (i3 == 0) {
            int i5 = 69 / 0;
        }
        return i4;
    }

    public final String getGuiConditionExpr() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.guiConditionExpr;
        int i4 = i2 + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPropCode() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.propCode;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPropTips() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.propTips;
        int i4 = i2 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final List<DynamicsSelectInfo> getSelectList() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<DynamicsSelectInfo> list = this.selectList;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return list;
    }

    public final Integer getGuiDisplayOrder() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.guiDisplayOrder;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GuiElement copy$default(GuiElement guiElement, String str, String str2, Integer num, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, String str11, List list, Integer num2, int i3, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        int i4;
        String str18;
        String str19;
        List list2;
        int i5 = 2 % 2;
        int i6 = component3;
        int i7 = i6 + 43;
        copydefault = i7 % 128;
        if (i7 % 2 == 0 ? (i3 & 1) == 0 : (i3 & 1) == 0) {
            str12 = str;
        } else {
            str12 = guiElement.guiInputLabel;
            int i8 = i6 + 47;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i3 & 2) != 0) {
            int i10 = i6 + 115;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            str13 = guiElement.guiOutputLabel;
        } else {
            str13 = str2;
        }
        Integer num3 = (i3 & 4) != 0 ? guiElement.guiInputLen : num;
        if ((i3 & 8) != 0) {
            int i12 = i6 + 119;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            str14 = guiElement.guiDefaultValue;
        } else {
            str14 = str3;
        }
        String str20 = (i3 & 16) != 0 ? guiElement.guiInputType : str4;
        boolean z2 = (i3 & 32) != 0 ? guiElement.guiMandatoryFlag : z;
        if ((i3 & 64) != 0) {
            int i14 = i6 + 77;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            str15 = guiElement.guiVisibility;
        } else {
            str15 = str5;
        }
        if ((i3 & 128) != 0) {
            int i16 = copydefault + 31;
            component3 = i16 % 128;
            if (i16 % 2 == 0) {
                str16 = guiElement.guiModifiability;
                int i17 = 12 / 0;
            } else {
                str16 = guiElement.guiModifiability;
            }
        } else {
            str16 = str6;
        }
        if ((i3 & 256) != 0) {
            int i18 = component3 + 15;
            copydefault = i18 % 128;
            int i19 = i18 % 2;
            str17 = guiElement.guiErrorMessage;
        } else {
            str17 = str7;
        }
        String str21 = (i3 & 512) != 0 ? guiElement.dataType : str8;
        int i20 = (i3 & 1024) != 0 ? guiElement.valueMin : i;
        if ((i3 & 2048) != 0) {
            int i21 = copydefault + 103;
            component3 = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = guiElement.valueMax;
                throw null;
            }
            i4 = guiElement.valueMax;
        } else {
            i4 = i2;
        }
        String str22 = (i3 & 4096) != 0 ? guiElement.guiConditionExpr : str9;
        String str23 = (i3 & 8192) != 0 ? guiElement.propCode : str10;
        String str24 = (i3 & 16384) != 0 ? guiElement.propTips : str11;
        if ((i3 & 32768) != 0) {
            str18 = str24;
            int i23 = component3 + 53;
            str19 = str22;
            copydefault = i23 % 128;
            int i24 = i23 % 2;
            list2 = guiElement.selectList;
        } else {
            str18 = str24;
            str19 = str22;
            list2 = list;
        }
        return guiElement.copy(str12, str13, num3, str14, str20, z2, str15, str16, str17, str21, i20, i4, str19, str23, str18, list2, (i3 & 65536) != 0 ? guiElement.guiDisplayOrder : num2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.guiInputLabel;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.dataType;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final int component11() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.valueMin;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return i4;
    }

    public final int component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.valueMax;
        int i6 = i2 + 43;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiConditionExpr;
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.propCode;
        int i4 = i2 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.propTips;
        int i5 = i3 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DynamicsSelectInfo> component16() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<DynamicsSelectInfo> list = this.selectList;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Integer component17() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.guiDisplayOrder;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.guiOutputLabel;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.guiInputLen;
        int i4 = i2 + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiDefaultValue;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.guiInputType;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.guiMandatoryFlag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiVisibility;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.guiModifiability;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.guiErrorMessage;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GuiElement copy(String guiInputLabel, String guiOutputLabel, Integer guiInputLen, String guiDefaultValue, String guiInputType, boolean guiMandatoryFlag, String guiVisibility, String guiModifiability, String guiErrorMessage, String dataType, int valueMin, int valueMax, String guiConditionExpr, String propCode, String propTips, List<DynamicsSelectInfo> selectList, Integer guiDisplayOrder) {
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
        GuiElement guiElement = new GuiElement(guiInputLabel, guiOutputLabel, guiInputLen, guiDefaultValue, guiInputType, guiMandatoryFlag, guiVisibility, guiModifiability, guiErrorMessage, dataType, valueMin, valueMax, guiConditionExpr, propCode, propTips, selectList, guiDisplayOrder);
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return guiElement;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuiElement)) {
            int i2 = copydefault + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GuiElement guiElement = (GuiElement) other;
        if (!Intrinsics.areEqual(this.guiInputLabel, guiElement.guiInputLabel) || (!Intrinsics.areEqual(this.guiOutputLabel, guiElement.guiOutputLabel)) || !Intrinsics.areEqual(this.guiInputLen, guiElement.guiInputLen)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.guiDefaultValue, guiElement.guiDefaultValue)) {
            int i4 = component3 + 57;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.guiInputType, guiElement.guiInputType) || this.guiMandatoryFlag != guiElement.guiMandatoryFlag) {
            return false;
        }
        if (!Intrinsics.areEqual(this.guiVisibility, guiElement.guiVisibility)) {
            int i6 = copydefault + 105;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.guiModifiability, guiElement.guiModifiability)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.guiErrorMessage, guiElement.guiErrorMessage)) {
            int i8 = component3 + 91;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dataType, guiElement.dataType)) {
            int i10 = copydefault + 101;
            component3 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (this.valueMin != guiElement.valueMin) {
            return false;
        }
        if (this.valueMax != guiElement.valueMax) {
            int i11 = copydefault + 85;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.guiConditionExpr, guiElement.guiConditionExpr)) {
            int i13 = component3 + 35;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.propCode, guiElement.propCode) || (!Intrinsics.areEqual(this.propTips, guiElement.propTips))) {
            return false;
        }
        if (Intrinsics.areEqual(this.selectList, guiElement.selectList)) {
            return Intrinsics.areEqual(this.guiDisplayOrder, guiElement.guiDisplayOrder);
        }
        int i15 = copydefault + 39;
        component3 = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode3 = this.guiInputLabel.hashCode();
        int iHashCode4 = this.guiOutputLabel.hashCode();
        Integer num = this.guiInputLen;
        if (num == null) {
            int i5 = component3 + 85;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode5 = this.guiDefaultValue.hashCode();
        int iHashCode6 = this.guiInputType.hashCode();
        int iHashCode7 = Boolean.hashCode(this.guiMandatoryFlag);
        int iHashCode8 = this.guiVisibility.hashCode();
        int iHashCode9 = this.guiModifiability.hashCode();
        int iHashCode10 = this.guiErrorMessage.hashCode();
        int iHashCode11 = this.dataType.hashCode();
        int iHashCode12 = Integer.hashCode(this.valueMin);
        int iHashCode13 = Integer.hashCode(this.valueMax);
        int iHashCode14 = this.guiConditionExpr.hashCode();
        int iHashCode15 = this.propCode.hashCode();
        int iHashCode16 = this.propTips.hashCode();
        List<DynamicsSelectInfo> list = this.selectList;
        if (list == null) {
            int i7 = component3 + 51;
            i = iHashCode15;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            i = iHashCode15;
            iHashCode2 = list.hashCode();
        }
        Integer num2 = this.guiDisplayOrder;
        return (((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode16) * 31) + iHashCode2) * 31) + (num2 == null ? 0 : num2.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiElement(guiInputLabel=" + this.guiInputLabel + ", guiOutputLabel=" + this.guiOutputLabel + ", guiInputLen=" + this.guiInputLen + ", guiDefaultValue=" + this.guiDefaultValue + ", guiInputType=" + this.guiInputType + ", guiMandatoryFlag=" + this.guiMandatoryFlag + ", guiVisibility=" + this.guiVisibility + ", guiModifiability=" + this.guiModifiability + ", guiErrorMessage=" + this.guiErrorMessage + ", dataType=" + this.dataType + ", valueMin=" + this.valueMin + ", valueMax=" + this.valueMax + ", guiConditionExpr=" + this.guiConditionExpr + ", propCode=" + this.propCode + ", propTips=" + this.propTips + ", selectList=" + this.selectList + ", guiDisplayOrder=" + this.guiDisplayOrder + ")";
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
