package com.huawei.digitalpayment.common.theme.data;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", AUAttrsConstant.TV_TEXTSIZE, "", CdpConstants.CONTENT_TEXT_COLOR, "", "itemSpace", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getTextSize", "()Ljava/lang/Integer;", "setTextSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/String;", "setTextColor", "(Ljava/lang/String;)V", "getItemSpace", "setItemSpace", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardsFunctionsItemComponent extends BaseComponent {
    private static int component1 = 0;
    private static int component3 = 1;
    private Integer itemSpace;
    private String textColor;
    private Integer textSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardsFunctionsItemComponent(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 121;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i7 = component3 + 109;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            num2 = null;
        }
        this(num, str, num2);
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final void setTextSize(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.textSize = num;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTextColor() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.textColor;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return str;
    }

    public final void setTextColor(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.textColor = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final Integer getItemSpace() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.itemSpace;
            int i4 = 32 / 0;
        } else {
            num = this.itemSpace;
        }
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final void setItemSpace(Integer num) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.itemSpace = num;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public CardsFunctionsItemComponent(Integer num, String str, Integer num2) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.textSize = num;
        this.textColor = str;
        this.itemSpace = num2;
    }

    public CardsFunctionsItemComponent() {
        this(null, null, null, 7, null);
    }

    public static CardsFunctionsItemComponent copy$default(CardsFunctionsItemComponent cardsFunctionsItemComponent, Integer num, String str, Integer num2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 13;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                Integer num3 = cardsFunctionsItemComponent.textSize;
                throw null;
            }
            num = cardsFunctionsItemComponent.textSize;
        }
        if ((i & 2) != 0) {
            str = cardsFunctionsItemComponent.textColor;
            int i4 = component1 + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 4) != 0) {
            num2 = cardsFunctionsItemComponent.itemSpace;
            int i6 = component3 + 53;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 2;
            }
        }
        return cardsFunctionsItemComponent.copy(num, str, num2);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.textColor;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.itemSpace;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return num;
    }

    public final CardsFunctionsItemComponent copy(Integer textSize, String textColor, Integer itemSpace) {
        int i = 2 % 2;
        CardsFunctionsItemComponent cardsFunctionsItemComponent = new CardsFunctionsItemComponent(textSize, textColor, itemSpace);
        int i2 = component1 + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return cardsFunctionsItemComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 25;
            component1 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof CardsFunctionsItemComponent)) {
            return false;
        }
        CardsFunctionsItemComponent cardsFunctionsItemComponent = (CardsFunctionsItemComponent) other;
        if (!Intrinsics.areEqual(this.textSize, cardsFunctionsItemComponent.textSize)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.textColor, cardsFunctionsItemComponent.textColor)) {
            int i6 = component1 + 95;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.itemSpace, cardsFunctionsItemComponent.itemSpace)) {
            return true;
        }
        int i8 = component1 + 55;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.textSize;
        int iHashCode2 = 0;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.textColor;
        if (str == null) {
            int i2 = component3 + 87;
            component1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num2 = this.itemSpace;
        if (num2 != null) {
            iHashCode2 = num2.hashCode();
            int i3 = component1 + 69;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardsFunctionsItemComponent(textSize=" + this.textSize + ", textColor=" + this.textColor + ", itemSpace=" + this.itemSpace + ")";
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return str;
    }
}
