package com.huawei.digitalpayment.customer.dynamics.model;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J·\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\u0013\u0010>\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\bHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001e¨\u0006C"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "Ljava/io/Serializable;", "key", "", "label", "required", "", "maxLength", "", "tips", "value", "defaultValue", "regularExpr", "errorMessage", "visibility", "modifiable", "dataType", "elementType", "selectInfos", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsSelectInfo;", "order", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getKey", "()Ljava/lang/String;", "getLabel", "getRequired", "()Z", "getMaxLength", "()I", "getTips", "setTips", "(Ljava/lang/String;)V", "getValue", "setValue", "getDefaultValue", "getRegularExpr", "getErrorMessage", "getVisibility", "getModifiable", "getDataType", "getElementType", "getSelectInfos", "()Ljava/util/List;", "getOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "", "hashCode", "toString", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicsElement implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String dataType;
    private final String defaultValue;
    private final String elementType;
    private final String errorMessage;
    private final String key;
    private final String label;
    private final int maxLength;
    private final boolean modifiable;
    private final int order;
    private final String regularExpr;
    private final boolean required;
    private final List<DynamicsSelectInfo> selectInfos;
    private String tips;
    private String value;
    private final boolean visibility;

    public DynamicsElement(String str, String str2, boolean z, int i, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, String str9, List<DynamicsSelectInfo> list, int i2) {
        Intrinsics.checkNotNullParameter(str8, "");
        this.key = str;
        this.label = str2;
        this.required = z;
        this.maxLength = i;
        this.tips = str3;
        this.value = str4;
        this.defaultValue = str5;
        this.regularExpr = str6;
        this.errorMessage = str7;
        this.visibility = z2;
        this.modifiable = z3;
        this.dataType = str8;
        this.elementType = str9;
        this.selectInfos = list;
        this.order = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicsElement(String str, String str2, boolean z, int i, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, String str9, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        boolean z4;
        String str10;
        String str11;
        int i5;
        boolean z5 = (i3 & 4) != 0 ? false : z;
        if ((i3 & 8) != 0) {
            int i6 = ShareDataUIState + 11;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = i;
        }
        boolean z6 = (i3 & 512) != 0 ? false : z2;
        if ((i3 & 1024) != 0) {
            int i7 = ShareDataUIState + 39;
            int i8 = i7 % 128;
            component2 = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 43;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            z4 = false;
        } else {
            z4 = z3;
        }
        if ((i3 & 2048) != 0) {
            int i12 = component2 + 11;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            str10 = "TEXT";
        } else {
            str10 = str8;
        }
        if ((i3 & 4096) != 0) {
            int i14 = 2 % 2;
            str11 = null;
        } else {
            str11 = str9;
        }
        if ((i3 & 16384) != 0) {
            int i15 = ShareDataUIState + 65;
            component2 = i15 % 128;
            int i16 = i15 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        this(str, str2, z5, i4, str3, str4, str5, str6, str7, z6, z4, str10, str11, list, i5);
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.label;
        int i4 = i2 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getRequired() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.required;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return z;
    }

    public final int getMaxLength() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxLength;
        }
        throw null;
    }

    public final String getTips() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tips;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTips(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.tips = str;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setValue(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.value = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getDefaultValue() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.defaultValue;
        int i4 = i3 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return str;
    }

    public final String getRegularExpr() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.regularExpr;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.errorMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getVisibility() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.visibility;
        }
        throw null;
    }

    public final boolean getModifiable() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.modifiable;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getDataType() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.dataType;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getElementType() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.elementType;
        int i4 = i3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<DynamicsSelectInfo> getSelectInfos() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<DynamicsSelectInfo> list = this.selectInfos;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 95;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DynamicsElement copy$default(DynamicsElement dynamicsElement, String str, String str2, boolean z, int i, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, String str8, String str9, List list, int i2, int i3, Object obj) {
        String str10;
        boolean z4;
        int i4;
        String str11;
        String str12;
        int i5 = 2 % 2;
        String str13 = (i3 & 1) != 0 ? dynamicsElement.key : str;
        if ((i3 & 2) != 0) {
            int i6 = ShareDataUIState + 19;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str14 = dynamicsElement.label;
                throw null;
            }
            str10 = dynamicsElement.label;
        } else {
            str10 = str2;
        }
        if ((i3 & 4) != 0) {
            int i7 = component2 + 99;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            z4 = dynamicsElement.required;
        } else {
            z4 = z;
        }
        if ((i3 & 8) != 0) {
            i4 = dynamicsElement.maxLength;
            int i9 = ShareDataUIState + 121;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i4 = i;
        }
        String str15 = (i3 & 16) != 0 ? dynamicsElement.tips : str3;
        if ((i3 & 32) != 0) {
            str11 = dynamicsElement.value;
            int i11 = component2 + 65;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str11 = str4;
        }
        if ((i3 & 64) != 0) {
            int i13 = ShareDataUIState + 97;
            component2 = i13 % 128;
            if (i13 % 2 == 0) {
                String str16 = dynamicsElement.defaultValue;
                throw null;
            }
            str12 = dynamicsElement.defaultValue;
        } else {
            str12 = str5;
        }
        return dynamicsElement.copy(str13, str10, z4, i4, str15, str11, str12, (i3 & 128) != 0 ? dynamicsElement.regularExpr : str6, (i3 & 256) != 0 ? dynamicsElement.errorMessage : str7, (i3 & 512) != 0 ? dynamicsElement.visibility : z2, (i3 & 1024) != 0 ? dynamicsElement.modifiable : z3, (i3 & 2048) != 0 ? dynamicsElement.dataType : str8, (i3 & 4096) != 0 ? dynamicsElement.elementType : str9, (i3 & 8192) != 0 ? dynamicsElement.selectInfos : list, (i3 & 16384) != 0 ? dynamicsElement.order : i2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.visibility;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return z;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.modifiable;
        int i4 = i2 + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dataType;
        }
        throw null;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.elementType;
            int i4 = 3 / 0;
        } else {
            str = this.elementType;
        }
        int i5 = i2 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<DynamicsSelectInfo> component14() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectInfos;
        }
        throw null;
    }

    public final int component15() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.order;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.required;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.maxLength;
        int i6 = i3 + 57;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tips;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 89 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.defaultValue;
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.regularExpr;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.errorMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicsElement copy(String key, String label, boolean required, int maxLength, String tips, String value, String defaultValue, String regularExpr, String errorMessage, boolean visibility, boolean modifiable, String dataType, String elementType, List<DynamicsSelectInfo> selectInfos, int order) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dataType, "");
        DynamicsElement dynamicsElement = new DynamicsElement(key, label, required, maxLength, tips, value, defaultValue, regularExpr, errorMessage, visibility, modifiable, dataType, elementType, selectInfos, order);
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return dynamicsElement;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicsElement)) {
            return false;
        }
        DynamicsElement dynamicsElement = (DynamicsElement) other;
        if (!Intrinsics.areEqual(this.key, dynamicsElement.key) || !Intrinsics.areEqual(this.label, dynamicsElement.label) || this.required != dynamicsElement.required || this.maxLength != dynamicsElement.maxLength) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tips, dynamicsElement.tips)) {
            int i2 = ShareDataUIState + 19;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.value, dynamicsElement.value) || !Intrinsics.areEqual(this.defaultValue, dynamicsElement.defaultValue)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.regularExpr, dynamicsElement.regularExpr)) {
            int i4 = component2 + 57;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.errorMessage, dynamicsElement.errorMessage) || this.visibility != dynamicsElement.visibility || this.modifiable != dynamicsElement.modifiable || !Intrinsics.areEqual(this.dataType, dynamicsElement.dataType) || !Intrinsics.areEqual(this.elementType, dynamicsElement.elementType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.selectInfos, dynamicsElement.selectInfos)) {
            return this.order == dynamicsElement.order;
        }
        int i6 = component2 + 91;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.key;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = Boolean.hashCode(this.required);
        int iHashCode6 = Integer.hashCode(this.maxLength);
        String str3 = this.tips;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.defaultValue;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.regularExpr;
        if (str6 == null) {
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str6.hashCode();
            int i3 = component2 + 79;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        String str7 = this.errorMessage;
        if (str7 == null) {
            int i5 = component2 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str7.hashCode();
        }
        int iHashCode10 = Boolean.hashCode(this.visibility);
        int iHashCode11 = Boolean.hashCode(this.modifiable);
        int iHashCode12 = this.dataType.hashCode();
        String str8 = this.elementType;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        List<DynamicsSelectInfo> list = this.selectInfos;
        return (((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DynamicsElement(key=" + this.key + ", label=" + this.label + ", required=" + this.required + ", maxLength=" + this.maxLength + ", tips=" + this.tips + ", value=" + this.value + ", defaultValue=" + this.defaultValue + ", regularExpr=" + this.regularExpr + ", errorMessage=" + this.errorMessage + ", visibility=" + this.visibility + ", modifiable=" + this.modifiable + ", dataType=" + this.dataType + ", elementType=" + this.elementType + ", selectInfos=" + this.selectInfos + ", order=" + this.order + ")";
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
