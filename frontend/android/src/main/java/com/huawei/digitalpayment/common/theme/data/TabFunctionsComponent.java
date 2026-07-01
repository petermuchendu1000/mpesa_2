package com.huawei.digitalpayment.common.theme.data;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getSmallIconId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JP\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TabFunctionsComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "selectedTextColor", "", "unSelectedTextColor", "indicatorColor", "titleHeight", "", "tabList", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionsComponent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getSelectedTextColor", "()Ljava/lang/String;", "setSelectedTextColor", "(Ljava/lang/String;)V", "getUnSelectedTextColor", "setUnSelectedTextColor", "getIndicatorColor", "setIndicatorColor", "getTitleHeight", "()Ljava/lang/Integer;", "setTitleHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTabList", "()Ljava/util/List;", "setTabList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/huawei/digitalpayment/common/theme/data/TabFunctionsComponent;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabFunctionsComponent extends BaseComponent {
    private static short[] ShareDataUIState;
    private String indicatorColor;
    private String selectedTextColor;
    private List<FunctionsComponent> tabList;
    private Integer titleHeight;
    private String unSelectedTextColor;
    private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
    private static final int $$f = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {84, -122, 19, 43, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, Ascii.SO, 4, 2, -17, Ascii.SI, 56, -50, -7, 60, -69, -4, 10, Ascii.FF, 56, -38, -24, 4, -2, 0, -7, 10, Ascii.US, -16, -16, -1, -11, 3, -2, 2, 2, 10, -8, -5, 68};
    private static final int $$e = 159;
    private static final byte[] $$a = {4, 8, -22, -73, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component1 = 16126675;
    private static int component3 = -238323909;
    private static int copydefault = 285466307;
    private static byte[] component2 = {45, -74, 74, -67, -105, 104, -74, 79, -65, 68, -104, -101, 5, -70, -1, 116, 69, 68, 67, -80, 72, -77, -44, -112, 108, -99, 96, 99, -108, 123, -122, -105, -102, 107, 103, -99, 111, 33, -99, 98, 109, -108, -118, 69, -101, -107, 109, -109, 107, -113, PSSSigner.TRAILER_IMPLICIT, -115, 32, -98, -111, -83, 84, 101, 100, 99, -112, 104, -109, 41, -69, 66, -79, 87, -70, -66, -71, -72, 68, 107, -119, 66, 77, -73, 68, -71, 86, -41, -101, 98, -110, 105, -75, -74, 84, 106, -98, 102, -83, 94, 120, -122, 100, -41, -14, 6, -33, 40, 6, -31, -22, 60, -10, -8, 6, -11, -6, -14, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.$$c
            int r8 = 116 - r8
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.$$a
            int r7 = r7 + 10
            int r5 = r5 * 16
            int r5 = 99 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r6]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-16)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r6 = r6 * 29
            int r0 = 39 - r6
            byte[] r1 = com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.$$d
            int r7 = r7 * 38
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 38 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.TabFunctionsComponent.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabFunctionsComponent(String str, String str2, String str3, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        List list2 = null;
        if ((i & 1) != 0) {
            int i2 = copy + 57;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 22 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        String str5 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i5 = getRequestBeneficiariesState + 5;
            copy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        Integer num2 = (i & 8) != 0 ? null : num;
        if ((i & 16) != 0) {
            int i8 = getRequestBeneficiariesState + 77;
            copy = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            list2 = list;
        }
        this(str, str5, str4, num2, list2);
    }

    public final String getSelectedTextColor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.selectedTextColor;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return str;
    }

    public final void setSelectedTextColor(String str) {
        int i = 2 % 2;
        int i2 = copy + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.selectedTextColor = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getUnSelectedTextColor() {
        int i = 2 % 2;
        int i2 = copy + 99;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.unSelectedTextColor;
        }
        throw null;
    }

    public final void setUnSelectedTextColor(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.unSelectedTextColor = str;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
    }

    public final String getIndicatorColor() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.indicatorColor;
        int i5 = i3 + 5;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setIndicatorColor(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        this.indicatorColor = str;
        int i5 = i3 + 51;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getTitleHeight() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.titleHeight;
        int i4 = i3 + 105;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public TabFunctionsComponent(String str, String str2, String str3, Integer num, List<FunctionsComponent> list) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.selectedTextColor = str;
        this.unSelectedTextColor = str2;
        this.indicatorColor = str3;
        this.titleHeight = num;
        this.tabList = list;
    }

    private static void b(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        boolean z;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i7 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(998 - Process.getGidForName(""), 31 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (61685 - View.resolveSizeAndState(0, 0, 0)), 1874745193, false, $$i(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr = component2;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) i7;
                            byte b6 = (byte) (b5 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 2984, ImageFormat.getBitsPerPixel(0) + 49, (char) (54462 - KeyEvent.normalizeMetaState(0)), -1178636483, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i8++;
                        i7 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component2;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 31, (char) (Color.red(0) + 61685), 1874745193, false, $$i(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) ShareDataUIState[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                int i9 = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j));
                if (z2) {
                    int i10 = $10 + 65;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i9 + i4;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) (-1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, (char) ((-16777216) - Color.rgb(0, 0, 0)), -1454191902, false, $$i(b9, (byte) (b9 + 1), (byte) $$c.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component2;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                    i5 = 2;
                } else {
                    int i13 = $10 + 47;
                    $11 = i13 % 128;
                    i5 = 2;
                    int i14 = i13 % 2;
                    z = false;
                }
                getsmalliconid.component2 = 1;
                int i15 = $10 + 71;
                $11 = i15 % 128;
                int i16 = i15 % i5;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = component2;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void setTitleHeight(Integer num) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
        if (objCopydefault == null) {
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1115;
            int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            char cResolveSize = (char) View.resolveSize(0, 0);
            byte b2 = $$a[37];
            byte b3 = (byte) (b2 - 1);
            byte b4 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 + 1), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, fadingEdgeLength, cResolveSize, 573302743, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) ((-105) - Color.red(0)), 247634438 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 18, TextUtils.indexOf("", "", 0, 0) + 523720311, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) (TextUtils.lastIndexOf("", '0') + 66), KeyEvent.keyCodeFromString("") + 247634460, (-16777235) - Color.rgb(0, 0, 0), 523720316 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
        if (objCopydefault2 == null) {
            int iAlpha = Color.alpha(0) + 1115;
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b5 = $$a[37];
            Object[] objArr5 = new Object[1];
            a((byte) (b5 - 1), r16[1], b5, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, maximumDrawingCacheSize, keyRepeatTimeout, 987555995, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
            if (objCopydefault3 == null) {
                int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1114;
                int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr6 = new Object[1];
                a(r7[37], (byte) (r7[6] - 1), (byte) ($$a[9] - 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i2, tapTimeout, keyRepeatTimeout2, 1068109365, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i3 = ((((~((-42704811) | r1)) | 175360431) * 398) - 1209358965) + (((~((~System.identityHashCode(this)) | (-42704811))) | 175360431) * 398) + 231908771;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((short) TextUtils.getOffsetAfter("", 0), (byte) ((-72) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 247634475 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getWindowTouchSlop() >> 8) - 19, 523720311 - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 109), 247634501 - (ViewConfiguration.getScrollBarSize() >> 8), (-20) - TextUtils.lastIndexOf("", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) + 523720313, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b((short) Drawable.resolveOpacity(0, 0), (byte) (Gravity.getAbsoluteGravity(0, 0) - 70), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 247634519, (-19) - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 523720320, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b((short) TextUtils.getCapsMode("", 0, 0), (byte) ((-38) - TextUtils.getTrimmedLength("")), 247634535 - TextUtils.getCapsMode("", 0, 0), ImageFormat.getBitsPerPixel(0) - 18, 22191 - AndroidCharacter.getMirror('0'), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1, 231908771};
                byte[] bArr = $$d;
                byte b6 = bArr[35];
                byte b7 = b6;
                Object[] objArr13 = new Object[1];
                c(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr[9];
                Object[] objArr14 = new Object[1];
                c(b8, b8, bArr[35], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                    if (objCopydefault4 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1115;
                        int i6 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        byte[] bArr2 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr2[37], (byte) (bArr2[6] - 1), (byte) (bArr2[9] - 1), objArr16);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, i6, cLastIndexOf, 1068109365, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b((short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (byte) ((-105) - TextUtils.indexOf("", "", 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 247634437, (ViewConfiguration.getPressedStateDuration() >> 16) - 19, 523720311 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b((short) ExpandableListView.getPackedPositionGroup(0L), (byte) (65 - Drawable.resolveOpacity(0, 0)), 247634460 - TextUtils.getOffsetAfter("", 0), (-19) - View.MeasureSpec.getSize(0), 523720315 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
                        if (objCopydefault5 == null) {
                            int scrollDefaultDelay = 1115 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            byte b9 = $$a[37];
                            Object[] objArr19 = new Object[1];
                            a((byte) (b9 - 1), r14[1], b9, objArr19);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, i7, offsetBefore, 987555995, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
                        if (objCopydefault6 == null) {
                            int packedPositionType = 1115 - ExpandableListView.getPackedPositionType(0L);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                            char cRgb = (char) ((-16777216) - Color.rgb(0, 0, 0));
                            byte b10 = $$a[37];
                            byte b11 = (byte) (b10 - 1);
                            byte b12 = (byte) (-b10);
                            Object[] objArr20 = new Object[1];
                            a(b11, b12, (byte) (b12 + 1), objArr20);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, longPressTimeout, cRgb, 573302743, false, (String) objArr20[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                        int i8 = copy + 117;
                        getRequestBeneficiariesState = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j2 = -1;
            long j3 = ((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 5) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6619, 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr21 = {-284743085, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) ((Process.getThreadPriority(0) + 20) >> 6), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                int i12 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i13 = ~((int) SystemClock.uptimeMillis());
                int i14 = i12 + (-1940606413) + ((~((-75762257) | i13)) * 52) + (((~(323604901 | i13)) | (~(130407413 | i13)) | (-399367158)) * (-52)) + (((~(i13 | (-323604902))) | 54645157) * 52);
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr22[0])[0] = i16 ^ (i16 << 5);
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i17 = copy + 55;
        getRequestBeneficiariesState = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[0])[0];
        Object[] objArr23 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i20 = i19 + (((((-1020075991) | r2) | (~(877467014 | iMaxMemory))) * (-338)) - 995103791) + (((~(iMaxMemory | (-142608977))) | (~((-877467015) | (~iMaxMemory)))) * 338);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr23[0])[0] = i22 ^ (i22 << 5);
        int i23 = ((int[]) objArr23[0])[0];
        Object[] objArr24 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, new int[]{((int[]) objArr23[2])[0]}, (String[]) objArr23[3]};
        int iNextInt = new Random().nextInt(1344075097);
        int i24 = ~iNextInt;
        int i25 = i23 + (-1668502079) + (((~((-58553693) | i24)) | (~((-134643796) | iNextInt))) * 210) + (((~(iNextInt | (-58291469))) | (~(i24 | (-134381572)))) * 210);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr24[0])[0] = i27 ^ (i27 << 5);
        this.titleHeight = num;
        int i28 = copy + 83;
        getRequestBeneficiariesState = i28 % 128;
        if (i28 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List<FunctionsComponent> getTabList() {
        int i = 2 % 2;
        int i2 = copy + 109;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tabList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTabList(List<FunctionsComponent> list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 91;
        copy = i3 % 128;
        int i4 = i3 % 2;
        this.tabList = list;
        int i5 = i2 + 11;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public TabFunctionsComponent() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TabFunctionsComponent copy$default(TabFunctionsComponent tabFunctionsComponent, String str, String str2, String str3, Integer num, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 49;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = tabFunctionsComponent.selectedTextColor;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = tabFunctionsComponent.unSelectedTextColor;
            int i5 = i4 + 75;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = tabFunctionsComponent.indicatorColor;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            int i7 = i4 + 21;
            copy = i7 % 128;
            int i8 = i7 % 2;
            num = tabFunctionsComponent.titleHeight;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = tabFunctionsComponent.tabList;
        }
        return tabFunctionsComponent.copy(str4, str5, str6, num2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.selectedTextColor;
        int i5 = i3 + 31;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 41;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.unSelectedTextColor;
        int i5 = i3 + 69;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 9;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorColor;
        int i5 = i2 + 101;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Integer num = this.titleHeight;
        int i5 = i3 + 41;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return num;
    }

    public final List<FunctionsComponent> component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<FunctionsComponent> list = this.tabList;
        int i5 = i3 + 7;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final TabFunctionsComponent copy(String selectedTextColor, String unSelectedTextColor, String indicatorColor, Integer titleHeight, List<FunctionsComponent> tabList) {
        int i = 2 % 2;
        TabFunctionsComponent tabFunctionsComponent = new TabFunctionsComponent(selectedTextColor, unSelectedTextColor, indicatorColor, titleHeight, tabList);
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return tabFunctionsComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabFunctionsComponent)) {
            return false;
        }
        TabFunctionsComponent tabFunctionsComponent = (TabFunctionsComponent) other;
        if (!Intrinsics.areEqual(this.selectedTextColor, tabFunctionsComponent.selectedTextColor) || !Intrinsics.areEqual(this.unSelectedTextColor, tabFunctionsComponent.unSelectedTextColor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorColor, tabFunctionsComponent.indicatorColor)) {
            int i2 = getRequestBeneficiariesState + 65;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.titleHeight, tabFunctionsComponent.titleHeight)) {
            int i4 = copy + 95;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.tabList, tabFunctionsComponent.tabList)) {
            return true;
        }
        int i6 = copy + 21;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.selectedTextColor;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.unSelectedTextColor;
        if (str2 == null) {
            int i2 = copy + 39;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.indicatorColor;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.titleHeight;
        if (num == null) {
            int i4 = getRequestBeneficiariesState + 45;
            copy = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        List<FunctionsComponent> list = this.tabList;
        if (list != null) {
            iHashCode3 = list.hashCode();
            int i6 = copy + 105;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TabFunctionsComponent(selectedTextColor=" + this.selectedTextColor + ", unSelectedTextColor=" + this.unSelectedTextColor + ", indicatorColor=" + this.indicatorColor + ", titleHeight=" + this.titleHeight + ", tabList=" + this.tabList + ")";
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
