package com.huawei.digitalpayment.common.theme.font;

import android.graphics.Color;
import android.graphics.Typeface;
import android.media.AudioTrack;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.common.util.font.FontManager;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ.\u0010\u0002\u001a\u00020\u00032$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/font/IThemeFontInterface;", "Lcom/huawei/common/util/font/FontManager$TypefaceInterceptor;", "setThemeFonts", "", "themeFonts", "", "", "getFontKey", "textStyle", "", "getTypeFaceForLang", "Landroid/graphics/Typeface;", "langCode", "fontKey", "getFontFileForLang", "Ljava/io/File;", "getFontFilePathForLang", "getFontInputStreamForH5", "Ljava/io/InputStream;", "copyAssetsFontToFile", "fontAssetsPath", "fontFileName", "getThemeDefaultFontName", "getThemeMediumFontName", "getThemeBoldFontName", "getDefaultFontName", "getMediumFontName", "getBoldFontName", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemeFontInterface extends FontManager.TypefaceInterceptor {

    public static final Companion INSTANCE = Companion.copydefault;
    public static final String FONT_PATH = "theme/font/%s";
    public static final String URL_BOLD = "bold_url";
    public static final String URL_DEFAULT = "default_url";
    public static final String URL_MEDIUM = "medium_url";

    void copyAssetsFontToFile();

    void copyAssetsFontToFile(String fontAssetsPath, String fontFileName);

    String getBoldFontName();

    String getDefaultFontName();

    File getFontFileForLang(String langCode, String fontKey);

    String getFontFilePathForLang(String langCode, String fontKey);

    InputStream getFontInputStreamForH5();

    String getFontKey(int textStyle);

    String getMediumFontName();

    String getThemeBoldFontName();

    String getThemeDefaultFontName();

    String getThemeMediumFontName();

    Typeface getTypeFaceForLang(String langCode, String fontKey);

    void setThemeFonts(Map<String, ? extends Map<String, String>> themeFonts);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static final byte[] $$c = {119, -27, 13, -93};
        private static final int $$f = 255;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {104, -2, Ascii.CAN, -74, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 75;
        private static final byte[] $$a = {115, 102, 60, 8, 2, -10, 10};
        private static final int $$b = 140;
        private static int component2 = 0;
        private static int copydefault = 1;
        private static int component1 = -890926383;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r6, byte r7, int r8) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r8 = 65 - r8
                int r7 = r7 * 4
                int r0 = r7 + 1
                byte[] r1 = com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r8 = r6
                r4 = r7
                r3 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r5
            L2d:
                int r6 = r6 + 1
                int r4 = -r4
                int r8 = r8 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.$$g(int, byte, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = 111 - r8
                int r9 = r9 * 2
                int r9 = 4 - r9
                byte[] r0 = com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r7
                r3 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
                r6 = r8
                r8 = r7
                r7 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
            L2c:
                int r7 = r7 + r3
                int r7 = r7 + (-1)
                int r8 = r8 + 1
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.a(int, int, int, java.lang.Object[]):void");
        }

        private static void b(int i, int i2, short s, Object[] objArr) {
            int i3 = s * 3;
            int i4 = 100 - i2;
            byte[] bArr = $$d;
            int i5 = (i * 9) + 4;
            byte[] bArr2 = new byte[10 - i3];
            int i6 = 9 - i3;
            int i7 = -1;
            if (bArr == null) {
                i5++;
                i4 = (i5 + (-i4)) - 27;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b2 = bArr[i5];
                    i5++;
                    i4 = (i4 + (-b2)) - 27;
                }
            }
        }

        public static boolean setTextStyle(IThemeFontInterface iThemeFontInterface, TextView textView, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 69;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(textView, "");
                return FontManager.TypefaceInterceptor.DefaultImpls.setTextStyle(iThemeFontInterface, textView, i);
            }
            Intrinsics.checkNotNullParameter(textView, "");
            FontManager.TypefaceInterceptor.DefaultImpls.setTextStyle(iThemeFontInterface, textView, i);
            throw null;
        }

        public static String getFontKey(IThemeFontInterface iThemeFontInterface, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 117;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 != 0 ? i == 1 : i == 0) {
                int i5 = i4 + 3;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return "medium_url";
            }
            if (i == 2) {
                return "bold_url";
            }
            int i7 = i4 + 55;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return "default_url";
        }

        public static void copyAssetsFontToFile(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iThemeFontInterface.copyAssetsFontToFile(iThemeFontInterface.getDefaultFontName(), iThemeFontInterface.getThemeDefaultFontName());
            iThemeFontInterface.copyAssetsFontToFile(iThemeFontInterface.getMediumFontName(), iThemeFontInterface.getThemeMediumFontName());
            iThemeFontInterface.copyAssetsFontToFile(iThemeFontInterface.getBoldFontName(), iThemeFontInterface.getThemeBoldFontName());
            int i4 = copydefault + 55;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void c(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            Object obj;
            char[] cArr2;
            int i4 = 2 % 2;
            ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
            char[] cArr3 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (true) {
                obj = null;
                if (iTrustedWebActivityServiceStub.ShareDataUIState >= i) {
                    break;
                }
                int i5 = $11 + 67;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
                int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(component1)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - View.MeasureSpec.makeMeasureSpec(0, 0), 38 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (26859 - Process.getGidForName("")), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7406, 16 - (Process.myPid() >> 22), (char) View.resolveSizeAndState(0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i2 > 0) {
                int i8 = $11 + 63;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                iTrustedWebActivityServiceStub.component1 = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i - iTrustedWebActivityServiceStub.component1);
            }
            if (z) {
                int i10 = $11 + 97;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 1;
                } else {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                }
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                    cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    try {
                        Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - KeyEvent.normalizeMetaState(0), 16 - Color.green(0), (char) View.MeasureSpec.getSize(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        int i11 = $10 + 69;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr3 = cArr2;
            }
            String str = new String(cArr3);
            int i13 = $11 + 125;
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                objArr[0] = str;
            } else {
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0341, code lost:
        
            r1 = com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.component2 + 65;
            com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.copydefault = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x034b, code lost:
        
            if ((r1 % 2) != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0350, code lost:
        
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0354, code lost:
        
            if (r1 != null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0356, code lost:
        
            r1 = android.widget.ExpandableListView.getPackedPositionChild(0) + 1343;
            r29 = 33 - android.view.KeyEvent.normalizeMetaState(0);
            r4 = (char) (android.view.KeyEvent.normalizeMetaState(0) + 6425);
            r9 = (byte) (r10 + 1);
            r12 = new java.lang.Object[1];
            b(r10, r9, (byte) (r9 - 1), r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x038d, code lost:
        
            ((java.lang.reflect.Field) r1).set(null, r13);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x039a, code lost:
        
            if (r1 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x039c, code lost:
        
            r1 = 1342 - android.view.View.resolveSize(0, 0);
            r29 = android.graphics.Color.rgb(0, 0, 0) + 16777249;
            r4 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 6426);
            r9 = (byte) (r10 + 1);
            r12 = new java.lang.Object[1];
            b(r10, r9, (byte) (r9 - 1), r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x03dc, code lost:
        
            r9 = new java.lang.Object[]{1L, ((java.lang.reflect.Field) r1).get(null)};
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x03f0, code lost:
        
            if (r1 != null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x03f2, code lost:
        
            r1 = 1342 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            r29 = 33 - android.text.TextUtils.indexOf("", "", 0, 0);
            r4 = (char) (6425 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
            r11 = (byte) (com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.$$e & 5);
            r12 = (byte) (r11 - 1);
            r14 = new java.lang.Object[1];
            b(r11, r12, (byte) (r12 + 3), r14);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, -181198845, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x043b, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r9)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0449, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x044a, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x044e, code lost:
        
            if (r1 != null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0450, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0451, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0452, code lost:
        
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0459, code lost:
        
            if (r1 != null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x045b, code lost:
        
            r1 = android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 1343;
            r29 = (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33;
            r4 = (char) (android.view.View.combineMeasuredStates(0, 0) + 6425);
            r9 = (byte) (r10 + 1);
            r12 = new java.lang.Object[1];
            b(r10, r9, (byte) (r9 - 1), r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0495, code lost:
        
            ((java.lang.reflect.Field) r1).set(null, r13);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x04a2, code lost:
        
            if (r1 != null) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x04a4, code lost:
        
            r1 = (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1342;
            r29 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
            r4 = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6425);
            r9 = (byte) (r10 + 1);
            r12 = new java.lang.Object[1];
            b(r10, r9, (byte) (r9 - 1), r12);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x04ea, code lost:
        
            r9 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r1).get(null)};
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x04fe, code lost:
        
            if (r1 != null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0500, code lost:
        
            r1 = 1342 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            r29 = 33 - android.text.TextUtils.indexOf("", "", 0, 0);
            r4 = (char) (6425 - android.view.View.getDefaultSize(0, 0));
            r11 = (byte) (com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.$$e & 5);
            r12 = (byte) (r11 - 1);
            r14 = new java.lang.Object[1];
            b(r11, r12, (byte) (r12 + 3), r14);
            r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r29, r4, -181198845, false, (java.lang.String) r14[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0546, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r9)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0553, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0554, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0558, code lost:
        
            if (r1 != null) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x055a, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x055b, code lost:
        
            throw r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0734  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void copyAssetsFontToFile(com.huawei.digitalpayment.common.theme.font.IThemeFontInterface r35, java.lang.String r36, java.lang.String r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2364
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.font.IThemeFontInterface.DefaultImpls.copyAssetsFontToFile(com.huawei.digitalpayment.common.theme.font.IThemeFontInterface, java.lang.String, java.lang.String):void");
        }

        public static String getThemeDefaultFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = copydefault + 27;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "HuaweiSans-Regular.ttf";
        }

        public static String getThemeMediumFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 21;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 66 / 0;
            }
            return "HuaweiSans-Medium.ttf";
        }

        public static String getThemeBoldFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return "HuaweiSans-Bold.ttf";
            }
            int i3 = 40 / 0;
            return "HuaweiSans-Bold.ttf";
        }

        public static String getDefaultFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 61;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return "fonts/Regular.ttf";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static String getMediumFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 121;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return "fonts/Medium.ttf";
            }
            throw null;
        }

        public static String getBoldFontName(IThemeFontInterface iThemeFontInterface) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 46 / 0;
            }
            return "fonts/Bold.ttf";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/font/IThemeFontInterface$Companion;", "", "<init>", "()V", "FONT_PATH", "", "URL_DEFAULT", "URL_MEDIUM", "URL_BOLD", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final String FONT_PATH = "theme/font/%s";
        private static int ShareDataUIState = 0;
        public static final String URL_BOLD = "bold_url";
        public static final String URL_DEFAULT = "default_url";
        public static final String URL_MEDIUM = "medium_url";
        private static int component2 = 1;
        static final Companion copydefault = new Companion();

        private Companion() {
        }

        static {
            int i = ShareDataUIState + 61;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
