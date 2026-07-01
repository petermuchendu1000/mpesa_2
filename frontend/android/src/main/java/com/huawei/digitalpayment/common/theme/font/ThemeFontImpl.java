package com.huawei.digitalpayment.common.theme.font;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.language.OnLanguageChangeListener;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.font.FontManager;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.huawei.digitalpayment.common.theme.font.IThemeFontInterface;
import com.huawei.digitalpayment.common.theme.model.IThemeInterface;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016J.\u0010\u001c\u001a\u00020\u00142$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0005H\u0016J.\u0010\u001d\u001a\u00020\u00142$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016J\u001a\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020(H\u0016R,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/font/ThemeFontImpl;", "Lcom/huawei/digitalpayment/common/theme/font/IThemeFontInterface;", "<init>", "()V", ThemeFontImpl.component1, "", "", "normalTypeFace", "Landroid/graphics/Typeface;", "getNormalTypeFace", "()Landroid/graphics/Typeface;", "setNormalTypeFace", "(Landroid/graphics/Typeface;)V", "mediumTypeFace", "getMediumTypeFace", "setMediumTypeFace", "boldTypeFace", "getBoldTypeFace", "setBoldTypeFace", "init", "", "observeLanguageChange", "updateTypeFace", "getTypeFaceForLangStyle", "langCode", "textStyle", "", "loadFromLocal", "setThemeFonts", "saveToLocal", "setTextStyle", "", "textView", "Landroid/widget/TextView;", "getTypeFaceForLang", "fontKey", "getFontFileForLang", "Ljava/io/File;", "getFontFilePathForLang", "getFontInputStreamForH5", "Ljava/io/InputStream;", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeFontImpl implements IThemeFontInterface {

    public static final Companion INSTANCE;
    private static final String component1 = "themeFonts";
    private static final String component2 = "default";
    private static int copy;
    private static long equals;
    private Typeface ShareDataUIState;
    private Typeface component3;
    private Typeface copydefault;
    private Map<String, ? extends Map<String, String>> getAsAtTimestamp = Collections.emptyMap();
    private static final byte[] $$c = {0, -128, 34, -14, 68};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarHeader.LF_CHR, -113, 92, 4, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 53;
    private static final byte[] $$a = {111, -53, -88, 102, 2, -10, 10};
    private static final int $$b = 145;
    private static int getRequestBeneficiariesState = 0;
    private static int ArtificialStackFrames = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$c
            int r5 = r5 * 3
            int r5 = r5 + 103
            int r7 = r7 * 3
            int r7 = r7 + 5
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$g(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r6 = r6 + 111
            byte[] r0 = com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r8 = r8 + 98
            byte[] r0 = com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$d
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r8 = r8 + r9
            int r8 = r8 + (-27)
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.b(int, short, short, java.lang.Object[]):void");
    }

    public ThemeFontImpl() {
        component3();
    }

    @Override
    public void copyAssetsFontToFile() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        IThemeFontInterface.DefaultImpls.copyAssetsFontToFile(this);
        int i4 = getRequestBeneficiariesState + 93;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void copyAssetsFontToFile(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        IThemeFontInterface.DefaultImpls.copyAssetsFontToFile(this, str, str2);
        int i4 = getRequestBeneficiariesState + 7;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public String getBoldFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String boldFontName = IThemeFontInterface.DefaultImpls.getBoldFontName(this);
        int i4 = getRequestBeneficiariesState + 83;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return boldFontName;
        }
        throw null;
    }

    @Override
    public String getDefaultFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String defaultFontName = IThemeFontInterface.DefaultImpls.getDefaultFontName(this);
        int i4 = getRequestBeneficiariesState + 47;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return defaultFontName;
    }

    @Override
    public String getFontKey(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 87;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String fontKey = IThemeFontInterface.DefaultImpls.getFontKey(this, i);
        int i5 = ArtificialStackFrames + 59;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return fontKey;
        }
        throw null;
    }

    @Override
    public String getMediumFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String mediumFontName = IThemeFontInterface.DefaultImpls.getMediumFontName(this);
        int i4 = getRequestBeneficiariesState + 93;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return mediumFontName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getThemeBoldFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 123;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            IThemeFontInterface.DefaultImpls.getThemeBoldFontName(this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String themeBoldFontName = IThemeFontInterface.DefaultImpls.getThemeBoldFontName(this);
        int i3 = getRequestBeneficiariesState + 3;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return themeBoldFontName;
    }

    @Override
    public String getThemeDefaultFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String themeDefaultFontName = IThemeFontInterface.DefaultImpls.getThemeDefaultFontName(this);
        int i4 = ArtificialStackFrames + 103;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return themeDefaultFontName;
    }

    @Override
    public String getThemeMediumFontName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 47;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String themeMediumFontName = IThemeFontInterface.DefaultImpls.getThemeMediumFontName(this);
        int i4 = getRequestBeneficiariesState + 31;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return themeMediumFontName;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/font/ThemeFontImpl$Companion;", "", "<init>", "()V", "FONT_DEFAULT", "", "KEY_THEME_FONTS", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    protected final Typeface getNormalTypeFace() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 9;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        Typeface typeface = this.ShareDataUIState;
        int i5 = i2 + 13;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return typeface;
        }
        throw null;
    }

    protected final void setNormalTypeFace(Typeface typeface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = typeface;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final Typeface getMediumTypeFace() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 53;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Typeface typeface = this.copydefault;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return typeface;
    }

    protected final void setMediumTypeFace(Typeface typeface) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 41;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = typeface;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 39;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final Typeface getBoldTypeFace() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        Typeface typeface = this.component3;
        int i5 = i3 + 7;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return typeface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setBoldTypeFace(Typeface typeface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        this.component3 = typeface;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 25;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(equals ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 25;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(equals)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 34, (char) (63440 - Color.green(0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    int i6 = 1391 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int minimumFlingVelocity = 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51269);
                    byte b2 = $$c[0];
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i6, minimumFlingVelocity, c2, -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i7 = $11 + 19;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private final void component3() {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public Object doInBackground() {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return doInBackground();
                }
                doInBackground();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess((Void) obj);
                if (i4 != 0) {
                    int i5 = 98 / 0;
                }
            }

            @Override
            public Void doInBackground() {
                int i2 = 2 % 2;
                int i3 = component1 + 77;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                this.component2.loadFromLocal();
                int i5 = component3 + 53;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return null;
            }

            public void onSuccess(Void result) {
                int i2 = 2 % 2;
                int i3 = component3 + 109;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        observeLanguageChange();
        int i2 = ArtificialStackFrames + 65;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void observeLanguageChange() {
        int i = 2 % 2;
        LanguageUtils.getInstance().addCallBack(new OnLanguageChangeListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onLanguageChange(String oldLanguage, String newLanguage) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(newLanguage, "");
                    ThemeFontImpl.this.updateTypeFace();
                    int i4 = 28 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(newLanguage, "");
                    ThemeFontImpl.this.updateTypeFace();
                }
                int i5 = component1 + 99;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 83;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
    }

    public void updateTypeFace() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String currentLang = LanguageUtils.getInstance().getCurrentLang();
        Intrinsics.checkNotNull(currentLang);
        this.ShareDataUIState = getTypeFaceForLangStyle(currentLang, 0);
        this.copydefault = getTypeFaceForLangStyle(currentLang, 1);
        this.component3 = getTypeFaceForLangStyle(currentLang, 2);
        int i4 = ArtificialStackFrames + 91;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public Typeface getTypeFaceForLangStyle(String langCode, int textStyle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(langCode, "");
        String fontKey = getFontKey(textStyle);
        Typeface typeFaceForLang = getTypeFaceForLang(langCode, fontKey);
        if (typeFaceForLang == null) {
            int i2 = getRequestBeneficiariesState + 13;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                getTypeFaceForLang("default", fontKey);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            typeFaceForLang = getTypeFaceForLang("default", fontKey);
        }
        int i3 = getRequestBeneficiariesState + 23;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return typeFaceForLang;
    }

    public void loadFromLocal() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        setThemeFonts(((IThemeInterface) RouteUtils.getService(IThemeInterface.class)).parseFonts(SPUtils.getInstance(ThemeConstants.SP_NAME).getString(component1, null)));
        int i4 = ArtificialStackFrames + 65;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setThemeFonts(Map<String, ? extends Map<String, String>> themeFonts) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            this.getAsAtTimestamp = themeFonts;
            saveToLocal(themeFonts);
            updateTypeFace();
        } else {
            this.getAsAtTimestamp = themeFonts;
            saveToLocal(themeFonts);
            updateTypeFace();
            throw null;
        }
    }

    public void saveToLocal(Map<String, ? extends Map<String, String>> themeFonts) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 53;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance(ThemeConstants.SP_NAME).put(component1, GsonUtils.toJson(themeFonts));
        int i4 = ArtificialStackFrames + 47;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
    }

    @Override
    public boolean setTextStyle(TextView textView, int textStyle) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 65;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(textView, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(textView, "");
        Typeface typeface = this.ShareDataUIState;
        if (typeface == null) {
            return false;
        }
        Typeface typeface2 = textStyle != 1 ? textStyle != 2 ? typeface : this.component3 : this.copydefault;
        if (typeface2 == null) {
            textView.getPaint().setFakeBoldText(true);
            textView.setTypeface(typeface);
            return true;
        }
        int i3 = getRequestBeneficiariesState + 21;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        textView.getPaint().setFakeBoldText(false);
        textView.setTypeface(typeface2);
        return true;
    }

    @Override
    public Typeface getTypeFaceForLang(String langCode, String fontKey) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 5;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(langCode, "");
            Intrinsics.checkNotNullParameter(fontKey, "");
            FontManager.INSTANCE.createFromFile(getFontFileForLang(langCode, fontKey), (Typeface) null);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(langCode, "");
        Intrinsics.checkNotNullParameter(fontKey, "");
        Typeface typefaceCreateFromFile = FontManager.INSTANCE.createFromFile(getFontFileForLang(langCode, fontKey), (Typeface) null);
        int i3 = ArtificialStackFrames + 25;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            return typefaceCreateFromFile;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File getFontFileForLang(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.getFontFileForLang(java.lang.String, java.lang.String):java.io.File");
    }

    @Override
    public String getFontFilePathForLang(String langCode, String fontKey) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(langCode, "");
            Intrinsics.checkNotNullParameter(fontKey, "");
            getFontFileForLang(langCode, fontKey);
            throw null;
        }
        Intrinsics.checkNotNullParameter(langCode, "");
        Intrinsics.checkNotNullParameter(fontKey, "");
        File fontFileForLang = getFontFileForLang(langCode, fontKey);
        if (fontFileForLang == null) {
            fontFileForLang = getFontFileForLang("default", fontKey);
        }
        if (fontFileForLang == null) {
            String defaultFontName = getDefaultFontName();
            int i3 = getRequestBeneficiariesState + 81;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
            return defaultFontName;
        }
        int i5 = ArtificialStackFrames + 5;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(fontFileForLang.getAbsolutePath(), "");
            throw null;
        }
        String absolutePath = fontFileForLang.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return absolutePath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x025a, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0261, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0263, code lost:
    
        r0 = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1342;
        r25 = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
        r5 = (char) (6425 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
        r6 = (byte) (com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$d[3] - 1);
        r9 = (byte) (r6 - 2);
        r13 = new java.lang.Object[1];
        b(r6, r9, (byte) (-r9), r13);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r25, r5, 1443979249, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02a2, code lost:
    
        ((java.lang.reflect.Field) r5).set(null, r15);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02af, code lost:
    
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b1, code lost:
    
        r0 = 1342 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r25 = 33 - android.text.TextUtils.getTrimmedLength("");
        r5 = (char) (6426 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)));
        r6 = (byte) (com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.$$d[3] - 1);
        r9 = (byte) (r6 - 2);
        r13 = new java.lang.Object[1];
        b(r6, r9, (byte) (-r9), r13);
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r25, r5, 1443979249, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02fb, code lost:
    
        r6 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r5).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x030f, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0311, code lost:
    
        r0 = 1342 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
        r25 = (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 32;
        r5 = (char) (6424 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
        r9 = (byte) (r7 + 2);
        r13 = new java.lang.Object[1];
        b(r7, r9, (byte) (r9 << 2), r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r25, r5, -181198845, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x035c, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r6)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0663, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0549  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream getFontInputStreamForH5() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.ThemeFontImpl.getFontInputStreamForH5():java.io.InputStream");
    }

    static {
        copy = 1;
        component2();
        INSTANCE = new Companion(null);
        int i = component4 + 67;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    static void component2() {
        equals = -4310130057002847616L;
    }
}
