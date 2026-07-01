package com.huawei.digitalpayment.checkout.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/ReverseTransactionCategoryBean;", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "categoryDisplay", "tips", "inputText", "expand", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getCategoryDisplay", "setCategoryDisplay", "getTips", "setTips", "getInputText", "setInputText", "getExpand", "()Z", "setExpand", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReverseTransactionCategoryBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private String category;
    private String categoryDisplay;
    private boolean expand;
    private String inputText;
    private String tips;

    public ReverseTransactionCategoryBean(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.category = str;
        this.categoryDisplay = str2;
        this.tips = str3;
        this.inputText = str4;
        this.expand = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReverseTransactionCategoryBean(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = component1 + 61;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(str, str2, str3, str4, z);
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.category;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCategory(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.category = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
        int i3 = copydefault + 7;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
    }

    public final String getCategoryDisplay() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryDisplay;
        int i5 = i2 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final void setCategoryDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.categoryDisplay = str;
        int i4 = component1 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getTips() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tips;
        }
        throw null;
    }

    public final void setTips(String str) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tips = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.tips = str;
        int i3 = copydefault + 123;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getInputText() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.inputText;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final void setInputText(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.inputText = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.inputText = str;
            int i3 = 3 / 0;
        }
    }

    public final boolean getExpand() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.expand;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setExpand(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.expand = z;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 1 + 5;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public static ReverseTransactionCategoryBean copy$default(ReverseTransactionCategoryBean reverseTransactionCategoryBean, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        String str5;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1;
            int i4 = i3 + 53;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                String str6 = reverseTransactionCategoryBean.category;
                throw null;
            }
            str5 = reverseTransactionCategoryBean.category;
            int i5 = i3 + 97;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str2 = reverseTransactionCategoryBean.categoryDisplay;
            int i7 = copydefault + 75;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i9 = copydefault + 79;
            component1 = i9 % 128;
            if (i9 % 2 == 0) {
                String str8 = reverseTransactionCategoryBean.tips;
                throw null;
            }
            str3 = reverseTransactionCategoryBean.tips;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            int i10 = copydefault + 31;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            str4 = reverseTransactionCategoryBean.inputText;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i12 = component1 + 95;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            z = reverseTransactionCategoryBean.expand;
            if (i13 != 0) {
                int i14 = 35 / 0;
            }
        }
        return reverseTransactionCategoryBean.copy(str5, str7, str9, str10, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 109;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryDisplay;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tips;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.inputText;
        int i4 = i3 + 77;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final boolean component5() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            z = this.expand;
            int i4 = 7 / 0;
        } else {
            z = this.expand;
        }
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final ReverseTransactionCategoryBean copy(String category, String categoryDisplay, String tips, String inputText, boolean expand) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(categoryDisplay, "");
        Intrinsics.checkNotNullParameter(tips, "");
        Intrinsics.checkNotNullParameter(inputText, "");
        ReverseTransactionCategoryBean reverseTransactionCategoryBean = new ReverseTransactionCategoryBean(category, categoryDisplay, tips, inputText, expand);
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return reverseTransactionCategoryBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ReverseTransactionCategoryBean)) {
            int i4 = component1 + 65;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ReverseTransactionCategoryBean reverseTransactionCategoryBean = (ReverseTransactionCategoryBean) other;
        if (!Intrinsics.areEqual(this.category, reverseTransactionCategoryBean.category)) {
            int i6 = copydefault + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.categoryDisplay, reverseTransactionCategoryBean.categoryDisplay) || (!Intrinsics.areEqual(this.tips, reverseTransactionCategoryBean.tips))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.inputText, reverseTransactionCategoryBean.inputText)) {
            int i8 = copydefault + 25;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.expand != reverseTransactionCategoryBean.expand) {
            return false;
        }
        int i10 = copydefault + 59;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.category.hashCode() * 31) + this.categoryDisplay.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.inputText.hashCode()) * 31) + Boolean.hashCode(this.expand);
        int i4 = copydefault + 21;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReverseTransactionCategoryBean(category=" + this.category + ", categoryDisplay=" + this.categoryDisplay + ", tips=" + this.tips + ", inputText=" + this.inputText + ", expand=" + this.expand + ")";
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
