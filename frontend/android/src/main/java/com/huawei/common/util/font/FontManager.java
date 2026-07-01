package com.huawei.common.util.font;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.core.graphics.TypefaceCompat;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0007J\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\""}, d2 = {"Lcom/huawei/common/util/font/FontManager;", "", "<init>", "()V", "typefaceInterceptor", "Lcom/huawei/common/util/font/FontManager$TypefaceInterceptor;", "typeface_regular", "Landroid/graphics/Typeface;", "getTypeface_regular", "()Landroid/graphics/Typeface;", "setTypeface_regular", "(Landroid/graphics/Typeface;)V", "typeface_medium", "getTypeface_medium", "setTypeface_medium", "typeface_bold", "getTypeface_bold", "setTypeface_bold", "setTextStyle", "", "textView", "Landroid/widget/TextView;", "textStyle", "", "typeface", "createFromAsset", "path", "", "default", "createFromFile", "file", "Ljava/io/File;", "setTypefaceInterceptor", "TypefaceInterceptor", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FontManager {
    public static final FontManager INSTANCE;
    private static Typeface ShareDataUIState;
    private static Typeface component1;
    private static Typeface component2;
    private static TypefaceInterceptor copydefault;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/common/util/font/FontManager$TypefaceInterceptor;", "", "setTextStyle", "", "textView", "Landroid/widget/TextView;", "textStyle", "", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TypefaceInterceptor {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static boolean setTextStyle(TypefaceInterceptor typefaceInterceptor, TextView textView, int i) {
                Intrinsics.checkNotNullParameter(textView, "");
                return false;
            }
        }

        boolean setTextStyle(TextView textView, int textStyle);
    }

    private FontManager() {
    }

    static {
        FontManager fontManager = new FontManager();
        INSTANCE = fontManager;
        Typeface typefaceCreateFromAsset = fontManager.createFromAsset("fonts/Regular.ttf", Typeface.DEFAULT);
        Intrinsics.checkNotNull(typefaceCreateFromAsset);
        component1 = typefaceCreateFromAsset;
        Typeface typefaceCreateFromAsset2 = fontManager.createFromAsset("fonts/Medium.ttf", typefaceCreateFromAsset);
        Intrinsics.checkNotNull(typefaceCreateFromAsset2);
        component2 = typefaceCreateFromAsset2;
        Typeface typefaceCreateFromAsset3 = fontManager.createFromAsset("fonts/Bold.ttf", typefaceCreateFromAsset2);
        Intrinsics.checkNotNull(typefaceCreateFromAsset3);
        ShareDataUIState = typefaceCreateFromAsset3;
    }

    public final Typeface getTypeface_regular() {
        return component1;
    }

    public final void setTypeface_regular(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        component1 = typeface;
    }

    public final Typeface getTypeface_medium() {
        return component2;
    }

    public final void setTypeface_medium(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        component2 = typeface;
    }

    public final Typeface getTypeface_bold() {
        return ShareDataUIState;
    }

    public final void setTypeface_bold(Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        ShareDataUIState = typeface;
    }

    public final void setTextStyle(TextView textView, int textStyle) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(textView, "");
        TypefaceInterceptor typefaceInterceptor = copydefault;
        if (typefaceInterceptor == null || !typefaceInterceptor.setTextStyle(textView, textStyle)) {
            if (textStyle == 1) {
                typeface = component2;
            } else if (textStyle == 2) {
                typeface = ShareDataUIState;
            } else {
                typeface = component1;
            }
            Typeface typeface2 = textView.getTypeface();
            textView.setTypeface(TypefaceCompat.create(textView.getContext(), typeface, typeface2 != null ? typeface2.isItalic() : false ? 2 : 0));
        }
    }

    public final void setTextStyle(TextView textView, Typeface typeface) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(typeface, "");
        textView.setTypeface(typeface);
        textView.invalidate();
    }

    public static Typeface createFromAsset$default(FontManager fontManager, String str, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            typeface = Typeface.DEFAULT;
        }
        return fontManager.createFromAsset(str, typeface);
    }

    public final Typeface createFromAsset(String path, Typeface typeface) {
        try {
            return Typeface.createFromAsset(Utils.getApp().getAssets(), path);
        } catch (Exception unused) {
            return typeface;
        }
    }

    public static Typeface createFromFile$default(FontManager fontManager, String str, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            typeface = Typeface.DEFAULT;
        }
        return fontManager.createFromFile(str, typeface);
    }

    public final Typeface createFromFile(String file, Typeface typeface) {
        try {
            return Typeface.createFromFile(file);
        } catch (Exception unused) {
            return typeface;
        }
    }

    public static Typeface createFromFile$default(FontManager fontManager, File file, Typeface typeface, int i, Object obj) {
        if ((i & 2) != 0) {
            typeface = Typeface.DEFAULT;
        }
        return fontManager.createFromFile(file, typeface);
    }

    public final Typeface createFromFile(File file, Typeface typeface) {
        try {
            return Typeface.createFromFile(file);
        } catch (Exception unused) {
            return typeface;
        }
    }

    public final void setTypefaceInterceptor(TypefaceInterceptor typefaceInterceptor) {
        copydefault = typefaceInterceptor;
    }
}
