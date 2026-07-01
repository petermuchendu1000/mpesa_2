package com.huawei.digitalpayment.consumer.baselib.widget.text;

import android.graphics.Typeface;
import android.widget.TextView;
import com.huawei.common.util.font.FontManager;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager", imports = {}))
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0005H\u0007R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/widget/text/TypefaceManager;", "", "<init>", "()V", "typeface_regular", "Landroid/graphics/Typeface;", "getTypeface_regular$annotations", "getTypeface_regular", "()Landroid/graphics/Typeface;", "typeface_medium", "getTypeface_medium$annotations", "getTypeface_medium", "typeface_bold", "getTypeface_bold$annotations", "getTypeface_bold", "setTextStyle", "", "textView", "Landroid/widget/TextView;", "textStyle", "", "typeface", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypefaceManager {
    private static int component1 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static int getRequestBeneficiariesState;
    public static final TypefaceManager INSTANCE = new TypefaceManager();
    private static final Typeface copydefault = FontManager.INSTANCE.getTypeface_regular();
    private static final Typeface ShareDataUIState = FontManager.INSTANCE.getTypeface_medium();
    private static final Typeface component2 = FontManager.INSTANCE.getTypeface_bold();

    private TypefaceManager() {
    }

    public final Typeface getTypeface_regular() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault;
        }
        throw null;
    }

    static {
        int i = component1 + 91;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public final Typeface getTypeface_medium() {
        Typeface typeface;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            typeface = ShareDataUIState;
            int i4 = 99 / 0;
        } else {
            typeface = ShareDataUIState;
        }
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return typeface;
    }

    public final Typeface getTypeface_bold() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 35;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Typeface typeface = component2;
        int i4 = i2 + 49;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return typeface;
    }

    @Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager.setTextStyle()", imports = {}))
    public final void setTextStyle(TextView textView, int textStyle) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(textView, "");
            FontManager.INSTANCE.setTextStyle(textView, textStyle);
            throw null;
        }
        Intrinsics.checkNotNullParameter(textView, "");
        FontManager.INSTANCE.setTextStyle(textView, textStyle);
        int i3 = component4 + 31;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager.setTextStyle()", imports = {}))
    public final void setTextStyle(TextView textView, Typeface typeface) {
        int i = 2 % 2;
        int i2 = component4 + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(typeface, "");
        FontManager.INSTANCE.setTextStyle(textView, typeface);
        int i4 = getRequestBeneficiariesState + 65;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager.typeface_bold", imports = {}))
    public static void getTypeface_bold$annotations() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager.typeface_medium", imports = {}))
    public static void getTypeface_medium$annotations() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated(message = "Use FontManager instead", replaceWith = @ReplaceWith(expression = "FontManager.typeface_regular", imports = {}))
    public static void getTypeface_regular$annotations() {
        int i = 2 % 2;
        int i2 = component4 + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }
}
