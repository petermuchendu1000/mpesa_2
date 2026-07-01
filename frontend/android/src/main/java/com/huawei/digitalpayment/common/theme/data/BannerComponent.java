package com.huawei.digitalpayment.common.theme.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJz\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001e\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001d¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/BannerComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "bannerType", "", "topSearch", "Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;", "indicatorPosition", "indicatorMargin", "", "indicatorStyle", "indicatorSpacing", "indicatorSelectedImg", "indicatorUnSelectedImg", "indicatorHeight", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBannerType", "()Ljava/lang/String;", "setBannerType", "(Ljava/lang/String;)V", "getTopSearch", "()Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;", "setTopSearch", "(Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;)V", "getIndicatorPosition", "setIndicatorPosition", "getIndicatorMargin", "()Ljava/lang/Integer;", "setIndicatorMargin", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIndicatorStyle", "setIndicatorStyle", "getIndicatorSpacing", "setIndicatorSpacing", "getIndicatorSelectedImg", "setIndicatorSelectedImg", "getIndicatorUnSelectedImg", "setIndicatorUnSelectedImg", "getIndicatorHeight", "setIndicatorHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/BannerComponent;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerComponent extends BaseComponent {
    private static short[] component2;
    private String bannerType;
    private Integer indicatorHeight;
    private Integer indicatorMargin;
    private String indicatorPosition;
    private String indicatorSelectedImg;
    private Integer indicatorSpacing;
    private String indicatorStyle;
    private String indicatorUnSelectedImg;
    private TopSearchAreaComponent topSearch;
    private static final byte[] $$c = {66, 42, 112, 97};
    private static final int $$f = 146;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, -86, -98, TarHeader.LF_DIR, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, 73, -5, -18, 2, -10, -60, TarHeader.LF_SYMLINK, 6, -6, -7, 6, 3, -73, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, 33, -49, 60, 9, -6, 0, 0, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5};
    private static final int $$e = 165;
    private static final byte[] $$a = {41, -64, -63, -4, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 152;
    private static int getAsAtTimestamp = 0;
    private static int copy = 1;
    private static int ShareDataUIState = 835345742;
    private static int component1 = -238323842;
    private static int copydefault = 1978838543;
    private static byte[] component3 = {33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 41, 41, 41, 41};

    private static String $$i(short s, int i, int i2) {
        int i3 = i + 4;
        byte[] bArr = $$c;
        int i4 = i2 * 2;
        int i5 = s + 112;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 = i6 + (-i3);
            i3 = i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i3 + 1;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i9];
            i3 = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 37 - r6
            byte[] r0 = com.huawei.digitalpayment.common.theme.data.BannerComponent.$$a
            int r5 = r5 * 6
            int r1 = 16 - r5
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            int r5 = 15 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.BannerComponent.a(byte, int, short, java.lang.Object[]):void");
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = s2 + 4;
        byte[] bArr = $$d;
        int i3 = 99 - (s * 4);
        int i4 = i * 28;
        byte[] bArr2 = new byte[i4 + 11];
        int i5 = i4 + 10;
        int i6 = -1;
        if (bArr == null) {
            i3 = i3 + i5 + 3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = i3 + bArr[i2] + 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r23, byte r24, int r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.BannerComponent.b(short, byte, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerComponent(String str, TopSearchAreaComponent topSearchAreaComponent, String str2, Integer num, String str3, Integer num2, String str4, String str5, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TopSearchAreaComponent topSearchAreaComponent2;
        Integer num4;
        String str6;
        Integer num5;
        String str7 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = getAsAtTimestamp + 117;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            topSearchAreaComponent2 = null;
        } else {
            topSearchAreaComponent2 = topSearchAreaComponent;
        }
        String str8 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i5 = getAsAtTimestamp + 123;
            copy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 16) != 0) {
            int i8 = getAsAtTimestamp + 71;
            copy = i8 % 128;
            int i9 = i8 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 32) != 0) {
            int i10 = getAsAtTimestamp + 57;
            copy = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
            num5 = null;
        } else {
            num5 = num2;
        }
        this(str7, topSearchAreaComponent2, str8, num4, str6, num5, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? num3 : null);
    }

    public final String getBannerType() {
        int i = 2 % 2;
        int i2 = copy + 57;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bannerType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBannerType(String str) {
        int i = 2 % 2;
        int i2 = copy + 25;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.bannerType = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 51;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public BannerComponent(String str, TopSearchAreaComponent topSearchAreaComponent, String str2, Integer num, String str3, Integer num2, String str4, String str5, Integer num3) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.bannerType = str;
        this.topSearch = topSearchAreaComponent;
        this.indicatorPosition = str2;
        this.indicatorMargin = num;
        this.indicatorStyle = str3;
        this.indicatorSpacing = num2;
        this.indicatorSelectedImg = str4;
        this.indicatorUnSelectedImg = str5;
        this.indicatorHeight = num3;
    }

    public final TopSearchAreaComponent getTopSearch() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int longPressTimeout = 2026 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int offsetAfter = 23 - TextUtils.getOffsetAfter("", 0);
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 6164);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 | Ascii.VT);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 5), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, offsetAfter, deadChar, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ExpandableListView.getPackedPositionType(0L), 1073665433 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 66, 10091 - AndroidCharacter.getMirror('0'), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((short) Color.argb(0, 0, 0, 0), (byte) TextUtils.indexOf("", "", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1073665453, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 72, TextUtils.indexOf("", "", 0, 0) + 2076583743, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int iIndexOf = 2025 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
            char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 6164);
            byte b4 = (byte) ($$a[11] - 1);
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 + 5), (byte) 0, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, threadPriority, cResolveOpacity, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2026;
                int trimmedLength = TextUtils.getTrimmedLength("") + 23;
                char cKeyCodeFromString = (char) (6164 - KeyEvent.keyCodeFromString(""));
                byte b5 = (byte) ($$a[11] - 1);
                byte b6 = (byte) (b5 + 2);
                Object[] objArr6 = new Object[1];
                a(b5, b6, (byte) (b6 - 3), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, trimmedLength, cKeyCodeFromString, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i2 = ((int[]) objArr7[1])[0];
            int i3 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (((1848252080 + (((~((-1957870048) | i4)) | 134763428) * 226)) + (((~(i4 | (-1957865564))) | ((~((-134763429) | iIdentityHashCode)) | 134758944)) * (-113))) + ((~(iIdentityHashCode | (-1957870048))) * 113)) - 1891562199;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((short) ExpandableListView.getPackedPositionType(0L), (byte) (ViewConfiguration.getEdgeSlop() >> 16), 1073665468 - Color.alpha(0), (-71) - Drawable.resolveOpacity(0, 0), 2076583748 - View.MeasureSpec.getMode(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 1073665483, (-72) - MotionEvent.axisFromString(""), 2076583747 - Color.red(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i8 = getAsAtTimestamp + 67;
            copy = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, -1891562199};
                byte[] bArr = $$d;
                byte b7 = bArr[40];
                byte b8 = (byte) (b7 + 1);
                Object[] objArr11 = new Object[1];
                c(b7, b8, (byte) (-b8), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr[40];
                byte b10 = b9;
                Object[] objArr12 = new Object[1];
                c(b9, b10, (byte) (b10 | 37), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2025;
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 23;
                    char windowTouchSlop = (char) (6164 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b11 = (byte) ($$a[11] - 1);
                    byte b12 = (byte) (b11 + 2);
                    Object[] objArr13 = new Object[1];
                    a(b11, b12, (byte) (b12 - 3), objArr13);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i10, offsetAfter2, windowTouchSlop, 385853891, false, (String) objArr13[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1073665432, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 65, 2076583739 - KeyEvent.keyCodeFromString(""), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b((short) View.resolveSize(0, 0), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1073665454 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 72, 2076583743 - Color.argb(0, 0, 0, 0), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int i11 = 2027 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iIndexOf2 = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        char cRed = (char) (Color.red(0) + 6164);
                        byte b13 = (byte) ($$a[11] - 1);
                        Object[] objArr16 = new Object[1];
                        a(b13, (byte) (b13 + 5), (byte) 0, objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i11, iIndexOf2, cRed, 381780032, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2026;
                        int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
                        char modifierMetaStateMask = (char) (6163 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 | Ascii.VT);
                        Object[] objArr17 = new Object[1];
                        a(b14, b15, (byte) (b15 & 5), objArr17);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, i12, modifierMetaStateMask, 163751008, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    int i13 = copy + 107;
                    getAsAtTimestamp = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        if (i16 == i15) {
            int i17 = getAsAtTimestamp + 121;
            copy = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr18 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = i19 + (((~(iIdentityHashCode2 | 715869271)) | 1376764204) * 56) + 172297435 + (((~((~iIdentityHashCode2) | 1376764204)) | 715869271) * 56);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr18[0])[0] = i24 ^ (i24 << 5);
            Object[] objArr19 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i25 = ((int[]) objArr18[0])[0];
            int i26 = ((int[]) objArr18[1])[0];
            int i27 = ((int[]) objArr18[3])[0];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i28 = i25 + 1633135896 + ((~((-1663303713) | iMaxMemory)) * 623) + (((~iMaxMemory) | 1110107) * (-623)) + (((~(iMaxMemory | 215219935)) | (~((-1877413541) | iMaxMemory)) | 1663303712) * 623);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr19[0])[0] = i30 ^ (i30 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[2];
            if (strArr3 != null) {
                int i31 = getAsAtTimestamp + 9;
                copy = i31 % 128;
                int i32 = i31 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6618, TextUtils.getCapsMode("", 0, 0) + 42, (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr20 = {-621572146, Long.valueOf(j5), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6562, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i33 = ((int[]) objArr[0])[0];
                int i34 = ((int[]) objArr[1])[0];
                int i35 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[2];
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i36 = ~iIdentityHashCode3;
                int i37 = i33 + 345231931 + (((~(1403372674 | i36)) | 672139521) * 184) + ((iIdentityHashCode3 | 1386251394) * (-184)) + ((~((-689260802) | i36)) * 184);
                int i38 = (i37 << 13) ^ i37;
                int i39 = i38 ^ (i38 >>> 17);
                ((int[]) objArr21[0])[0] = i39 ^ (i39 << 5);
                int[] iArr = new int[i16];
                int i40 = i16 - 1;
                iArr[i40] = 1;
                Toast.makeText((Context) null, iArr[((i16 * i40) % 2) - 1], 1).show();
                Object[] objArr22 = {new int[1], new int[]{i}, strArr, new int[]{i}};
                int i41 = ((int[]) objArr21[0])[0];
                int i42 = ((int[]) objArr21[1])[0];
                int i43 = ((int[]) objArr21[3])[0];
                String[] strArr5 = (String[]) objArr21[2];
                int iNextInt = new Random().nextInt();
                int i44 = i41 + 1688590328 + (((~((-471073959) | iNextInt)) | 262276) * 345) + (((~((-471073959) | (~iNextInt))) | 1621297241) * 345) + ((~(iNextInt | (-262277))) * 345);
                int i45 = (i44 << 13) ^ i44;
                int i46 = i45 ^ (i45 >>> 17);
                ((int[]) objArr22[0])[0] = i46 ^ (i46 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return this.topSearch;
    }

    public final void setTopSearch(TopSearchAreaComponent topSearchAreaComponent) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 125;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        this.topSearch = topSearchAreaComponent;
        int i5 = i2 + 85;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIndicatorPosition() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 31;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorPosition;
        int i5 = i2 + 99;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIndicatorPosition(String str) throws Throwable {
        int i;
        int length;
        String str2;
        int i2;
        int i3 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(68 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19695), 520092524, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        String str3 = "";
        b((short) ('0' - AndroidCharacter.getMirror('0')), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.blue(0) + 1073665433, Color.blue(0) - 65, TextUtils.getOffsetBefore("", 0) + 2076583739, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b((short) ExpandableListView.getPackedPositionGroup(0L), (byte) (Process.getGidForName(str3) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1073665454, View.combineMeasuredStates(0, 0) - 72, ((byte) KeyEvent.getModifierMetaStateMask()) + SignedBytes.MAX_POWER_OF_TWO, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 140;
        long jIdentityHashCode = System.identityHashCode(this);
        long j2 = jLongValue;
        int i5 = i4;
        long j3 = -1;
        long j4 = (j3 ^ 3414970190462716964L) | 1040752906143793361L;
        long j5 = jIdentityHashCode ^ j3;
        long j6 = (((long) 141) * 3414970190462716964L) + (((long) (-279)) * 1040752906143793361L) + ((jIdentityHashCode | 1040752906143793361L) * j) + (((long) (-280)) * ((j4 ^ j3) | ((j5 | 1040752906143793361L) ^ j3))) + (j * ((j3 ^ (j4 | jIdentityHashCode)) | (((j3 ^ 1040752906143793361L) | 3414970190462716964L) ^ j3) | ((j5 | 3414970190462716964L) ^ j3)));
        int i6 = 0;
        while (true) {
            if (i6 != 10) {
                int i7 = copy + 101;
                getAsAtTimestamp = i7 % 128;
                if (i7 % 2 != 0) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault2 == null) {
                        str2 = str3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (KeyEvent.getMaxKeyCode() >> 16), 30 - TextUtils.indexOf(str2, str2), (char) View.resolveSizeAndState(0, 0, 0), 846241313, false, "copydefault", null);
                    } else {
                        str2 = str3;
                    }
                    i2 = ((Field) objCopydefault2).getInt(null);
                } else {
                    str2 = str3;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getOffsetBefore(str2, 0), 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), 846241313, false, "copydefault", null);
                    }
                    i2 = ((Field) objCopydefault3).getInt(null);
                }
                long j7 = j2;
                int i8 = 0;
                while (true) {
                    int i9 = getAsAtTimestamp + 33;
                    copy = i9 % 128;
                    int i10 = i9 % 2;
                    for (int i11 = 0; i11 != 8; i11++) {
                        i2 = (((((int) (j7 >> i11)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                    }
                    if (i8 != 0) {
                        break;
                    }
                    i8++;
                    j7 = j6;
                }
                int i12 = i5;
                if (i2 == i12) {
                    break;
                }
                j2 -= 1024;
                i6++;
                i5 = i12;
                str3 = str2;
            } else {
                String str4 = str3;
                if (str != null) {
                    int i13 = getAsAtTimestamp + 117;
                    copy = i13 % 128;
                    int i14 = i13 % 2;
                    length = str.length();
                    i = 1;
                } else {
                    i = 1;
                    length = 0;
                }
                try {
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = -273492793;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 10 - TextUtils.indexOf(str4, str4), (char) (KeyEvent.getMaxKeyCode() >> 16), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -856897673, ((Constructor) objCopydefault4).newInstance(objArr3), false};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault5 == null) {
                        byte b2 = (byte) ($$a[11] - 1);
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr5 = new Object[1];
                        a(b2, b3, b3, objArr5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1454 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22 - (Process.myTid() >> 22), (char) (AndroidCharacter.getMirror('0') - '0'), 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf(str4, '0') + 1592, 38 - TextUtils.indexOf((CharSequence) str4, '0', 0, 0), (char) ((-1) - MotionEvent.axisFromString(str4))), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr4);
                    int i15 = ((int[]) objArr6[2])[0];
                    int i16 = ((int[]) objArr6[1])[0];
                    if (i16 != i15) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[3];
                        if (strArr != null) {
                            int i17 = getAsAtTimestamp + 119;
                            copy = i17 % 128;
                            int i18 = i17 % 2;
                            for (String str5 : strArr) {
                                arrayList.add(str5);
                            }
                        }
                        long j8 = -1;
                        long j9 = 0;
                        long j10 = (((j8 - ((j8 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i16 ^ i15))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        try {
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6619, TextUtils.lastIndexOf(str4, '0') + 43, (char) (TextUtils.lastIndexOf(str4, '0', 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                            Object[] objArr7 = {-273492793, Long.valueOf(j10), arrayList, null, false, false};
                            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault7 == null) {
                                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 56 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault7).invoke(objInvoke, objArr7);
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        this.indicatorPosition = str;
    }

    public final Integer getIndicatorMargin() {
        int i = 2 % 2;
        int i2 = copy + 85;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorMargin;
        int i5 = i3 + 77;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setIndicatorMargin(Integer num) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 123;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.indicatorMargin = num;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 97;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getIndicatorStyle() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorStyle;
        int i5 = i2 + 95;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final void setIndicatorStyle(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorStyle = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final Integer getIndicatorSpacing() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorSpacing;
        int i5 = i3 + 71;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return num;
    }

    public final void setIndicatorSpacing(Integer num) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 107;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.indicatorSpacing = num;
        int i5 = i2 + 97;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIndicatorSelectedImg() {
        int i = 2 % 2;
        int i2 = copy + 109;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.indicatorSelectedImg;
        int i4 = i3 + 101;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setIndicatorSelectedImg(String str) {
        int i = 2 % 2;
        int i2 = copy + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorSelectedImg = str;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
    }

    public final String getIndicatorUnSelectedImg() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.indicatorUnSelectedImg;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final void setIndicatorUnSelectedImg(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 41;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.indicatorUnSelectedImg = str;
        int i5 = i2 + 67;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getIndicatorHeight() {
        int i = 2 % 2;
        int i2 = copy + 9;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.indicatorHeight;
        int i4 = i3 + 47;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return num;
    }

    public final void setIndicatorHeight(Integer num) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorHeight = num;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
    }

    public BannerComponent() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static BannerComponent copy$default(BannerComponent bannerComponent, String str, TopSearchAreaComponent topSearchAreaComponent, String str2, Integer num, String str3, Integer num2, String str4, String str5, Integer num3, int i, Object obj) {
        String str6;
        String str7;
        Integer num4;
        String str8;
        int i2 = 2 % 2;
        int i3 = copy + 47;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i6 = i4 + 75;
            int i7 = i6 % 128;
            copy = i7;
            if (i6 % 2 == 0) {
                String str9 = bannerComponent.bannerType;
                obj2.hashCode();
                throw null;
            }
            str6 = bannerComponent.bannerType;
            int i8 = i7 + 39;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str6 = str;
        }
        TopSearchAreaComponent topSearchAreaComponent2 = (i & 2) != 0 ? bannerComponent.topSearch : topSearchAreaComponent;
        if ((i & 4) != 0) {
            str7 = bannerComponent.indicatorPosition;
            int i10 = copy + 97;
            getAsAtTimestamp = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 2;
            }
        } else {
            str7 = str2;
        }
        Integer num5 = (i & 8) != 0 ? bannerComponent.indicatorMargin : num;
        String str10 = (i & 16) != 0 ? bannerComponent.indicatorStyle : str3;
        if ((i & 32) != 0) {
            int i12 = copy + 91;
            getAsAtTimestamp = i12 % 128;
            int i13 = i12 % 2;
            num4 = bannerComponent.indicatorSpacing;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            int i14 = copy + 57;
            getAsAtTimestamp = i14 % 128;
            if (i14 % 2 != 0) {
                String str11 = bannerComponent.indicatorSelectedImg;
                throw null;
            }
            str8 = bannerComponent.indicatorSelectedImg;
        } else {
            str8 = str4;
        }
        return bannerComponent.copy(str6, topSearchAreaComponent2, str7, num5, str10, num4, str8, (i & 128) != 0 ? bannerComponent.indicatorUnSelectedImg : str5, (i & 256) != 0 ? bannerComponent.indicatorHeight : num3);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 61;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.bannerType;
            int i4 = 54 / 0;
        } else {
            str = this.bannerType;
        }
        int i5 = i2 + 93;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TopSearchAreaComponent component2() {
        int i = 2 % 2;
        int i2 = copy + 37;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        TopSearchAreaComponent topSearchAreaComponent = this.topSearch;
        int i4 = i3 + 59;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return topSearchAreaComponent;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 75;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorPosition;
        int i5 = i2 + 83;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        Integer num;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 119;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.indicatorMargin;
            int i4 = 44 / 0;
        } else {
            num = this.indicatorMargin;
        }
        int i5 = i2 + 77;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copy + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.indicatorStyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = copy + 53;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorSpacing;
        int i5 = i3 + 83;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return num;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorSelectedImg;
        int i5 = i2 + 101;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.indicatorUnSelectedImg;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.indicatorHeight;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return num;
    }

    public final BannerComponent copy(String bannerType, TopSearchAreaComponent topSearch, String indicatorPosition, Integer indicatorMargin, String indicatorStyle, Integer indicatorSpacing, String indicatorSelectedImg, String indicatorUnSelectedImg, Integer indicatorHeight) {
        int i = 2 % 2;
        BannerComponent bannerComponent = new BannerComponent(bannerType, topSearch, indicatorPosition, indicatorMargin, indicatorStyle, indicatorSpacing, indicatorSelectedImg, indicatorUnSelectedImg, indicatorHeight);
        int i2 = getAsAtTimestamp + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return bannerComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 111;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BannerComponent)) {
            return false;
        }
        BannerComponent bannerComponent = (BannerComponent) other;
        if (!Intrinsics.areEqual(this.bannerType, bannerComponent.bannerType)) {
            int i4 = copy + 39;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.topSearch, bannerComponent.topSearch)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorPosition, bannerComponent.indicatorPosition)) {
            int i6 = copy + 31;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorMargin, bannerComponent.indicatorMargin) || !Intrinsics.areEqual(this.indicatorStyle, bannerComponent.indicatorStyle) || !Intrinsics.areEqual(this.indicatorSpacing, bannerComponent.indicatorSpacing)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.indicatorSelectedImg, bannerComponent.indicatorSelectedImg))) {
            return Intrinsics.areEqual(this.indicatorUnSelectedImg, bannerComponent.indicatorUnSelectedImg) && Intrinsics.areEqual(this.indicatorHeight, bannerComponent.indicatorHeight);
        }
        int i8 = copy + 87;
        getAsAtTimestamp = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.bannerType;
        if (str == null) {
            int i2 = getAsAtTimestamp + 15;
            copy = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        TopSearchAreaComponent topSearchAreaComponent = this.topSearch;
        int iHashCode5 = topSearchAreaComponent == null ? 0 : topSearchAreaComponent.hashCode();
        String str2 = this.indicatorPosition;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.indicatorMargin;
        if (num == null) {
            int i3 = getAsAtTimestamp;
            int i4 = i3 + 37;
            copy = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 0 : 1;
            int i5 = i3 + 17;
            copy = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str3 = this.indicatorStyle;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.indicatorSpacing;
        if (num2 == null) {
            int i7 = getAsAtTimestamp + 33;
            copy = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num2.hashCode();
        }
        String str4 = this.indicatorSelectedImg;
        if (str4 == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
            int i9 = getAsAtTimestamp + 35;
            copy = i9 % 128;
            int i10 = i9 % 2;
        }
        String str5 = this.indicatorUnSelectedImg;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Integer num3 = this.indicatorHeight;
        return (((((((((((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode8) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BannerComponent(bannerType=" + this.bannerType + ", topSearch=" + this.topSearch + ", indicatorPosition=" + this.indicatorPosition + ", indicatorMargin=" + this.indicatorMargin + ", indicatorStyle=" + this.indicatorStyle + ", indicatorSpacing=" + this.indicatorSpacing + ", indicatorSelectedImg=" + this.indicatorSelectedImg + ", indicatorUnSelectedImg=" + this.indicatorUnSelectedImg + ", indicatorHeight=" + this.indicatorHeight + ")";
        int i2 = copy + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
