package com.huawei.digitalpayment.form.validator.response;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "Lcom/huawei/http/BaseResp;", "referenceName", "", "maxLength", "", "minLength", "inputHint", "inputTips", "regularList", "", "Lcom/huawei/digitalpayment/form/validator/response/LocalRegular;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getReferenceName", "()Ljava/lang/String;", "getMaxLength", "()I", "getMinLength", "getInputHint", "getInputTips", "getRegularList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalValidatorItem extends BaseResp {
    private static short[] getAsAtTimestamp;
    private final String inputHint;
    private final String inputTips;
    private final int maxLength;
    private final int minLength;
    private final String referenceName;
    private final List<LocalRegular> regularList;
    private static final byte[] $$c = {109, 5, -57, 108};
    private static final int $$f = 245;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -4, -80, 1, 6, -5, 3};
    private static final int $$e = 116;
    private static final byte[] $$a = {115, Ascii.RS, 119, 102, Ascii.VT, -19, Ascii.ETB, TarHeader.LF_DIR, -60, 13, -11, 9, 59, -36, -18, -8, Ascii.SI, 6, -1, -1, 9, 1, Ascii.NAK, -15, 0};
    private static final int $$b = 57;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] ShareDataUIState = {54774, 26226, 45720, 53031, 7041, 21515, 57462, 15580, 18733, 34199, 54811, 3076, 49038, 27434, 5854, 49786, 36350, 9102, 36874, 17632, 14663, 60906, 41582, 5646, 51878, 48983, 29673, 8232, 37890, 18609, 15703, 61911, 42605, 6669, 52918, 33610, 30674, 9338, 38932, 19624, 16573, 62265, 10195, 23156, 36569, 49501, 30013, 43413, 56420, 4314, 17179, 63279, 11162, 24185, 37605, 50525, 31026, 44488, 57440, 5365, 18261, 64311, 12175, 25105, 38644, 51530, 32048, 45470, 58390, 6376, 3076, 49024, 27498, 5849, 49783, 36329, 14741, 58686, 37081, 23670, 4078, 48009, 26431, 3143, 3089, 49035, 27430, 5838, 49783, 36345, 14742, 58684, 37068, 27904, 56980, 2615, 30657, 41825, 60669, 63778, 19132, 40464, 58356, 14082, 30930, 52408, 4102, 26102, 43341, 64159, 20138, 37380, 3103, 49024, 27440, 5842, 49762, 3103, 49055, 27425, 5839, 49780, 36280, 3098, 49024, 27427, 5837, 49783, 36345, 14739, 58672, 37069, 23651, 4002, 48022, 26414, 4818, 56922, 35317, 54648, 26339, 45653, 53157, 6927, 21658, 57586, 15435, 18853, 34058, 54918, 25343, 12220, 39975, 18577, 13665, 57803, 44638, 6710, 50831, 45921, 32718, 11330, 38972, 17556, 12645, 3076, 49034, 27433, 5842, 49767, 36325, 14740, 3077, 49031, 27435, 5834, 49791, 36330, 14736, 10718, 39495, 53901, 24851, 46526, 51284, 7417, 21350, 3077, 49050, 3077, 49038, 27434, 5844, 49766, 36322, 14746, 58684, 37068, 23610, 4095, 48017, 26427, 4807, 56925, 35314, 3074, 49053, 27429, 5854, 49783, 36347, 14721, 58669, 37078, 23585, 3074, 49053, 27429, 5854, 49783, 36345, 14735, 58668, 37066, 23666, 4026, 3161, 49052, 27453, 5838, 49766, 36334, 14733, 58742, 37084, 23678, 4066, 48074, 3161, 49052, 27453, 5838, 49725, 36333, 14739, 58742, 37069, 23666, 4064, 48012, 26420, 4806, 56912, 35246, 13699, 57649, 44242, 22594, 3056, 47000, 25397, 3161, 49035, 27425, 5835, 3931, 48286, 26687, 5580, 49508, 36588, 14991, 58996, 37854, 24444, 3296, 18363, 62590, 8415, 23852, 35204, 50700, 29295, 44692, 56111, 6039, 17415, 61545, 43696, 6512, 52680, 45114, 25759, 11021, 40827, 17311, 13877, 64151, 43275, 3161, 49034, 27440, 5854, 48067, 2112, 56563, 41221, 30123, 14906, 36435, 21217, 9989, 60334, 47166, 3078, 49034, 27446, 5838, 49787, 36344, 14740, 58743, 37069, 23662, 4095, 48075, 26408, 4828, 56903, 35317, 13753, 57662, 44247, 22606, 3047, 46984, 25379, 49297, 29524, 42990, 55836, 3764, 16748, 3161, 49052, 27453, 5838, 49766, 36334, 14733, 58742, 37084, 23678, 4066, 48074, 26484, 4822, 56912, 35317, 13769, 8589, 37448, 18153, 15130, 61362, 41018, 5209, 51362, 48392, 29098, 8758, 38430, 19176, 16134, 62357, 42041, 6209, 52458, 33030, 30108, 9849, 34718, 13405, 57584, 40200, 18938, 1582, 45646, 28400, 6998, 64201, 18747, 40333, 57440, 13483, 31556, 3161, 49026, 27435, 5832, 49788, 36351, 14739};
    private static long component2 = 8034677271539662831L;
    private static int component1 = -1332588964;
    private static int component3 = -238323960;
    private static int copydefault = 487983607;
    private static byte[] equals = {-50, -36, 35, 42, 43, -47, -44, 33, -46, -40, 109, -32, -48, 35, 40, -45, 41, -37, 58, -44, 40, Ascii.RS, -32, -48, -42, 41, 20, -110, 34, -46, 44, 19, -27, -58, 38, Ascii.US, -50, -45, Base64.padSymbol, -45, 37, -44, -41, 42, -52, -48, 44, -48, -41, 56, -49, -37, 36, -37, -41, 33, 32, -56, 39, -64, -40, 109, -29, -44, 47, -60, 36, -47, 42, -50, -44, 36, -58, 38, -35, -44, 43, -49, -25, -40, 34, -44, -46, -41, -38, 47, 32, -41, 47, -33, 33, -35, 42, 36, -34, -35, 34, -37, TarHeader.LF_LINK, -62, 43, 56, -60, 40, -63, -35, 58, -40, 34, 43, 43, -58, -41, -61, 32, -47, 44, 35, -46, -33, 44, -37, 32, -48, -57, 32, -47, 44, 35, -47, 43, -38, 58, -46, -33, 44, -37, 32, -48, -60, 46, -44, 36, -36, -35, 47, Base64.padSymbol, -46, -33, 44, -37, 32, -48, -39, -41, 40, 58, -60, 40, 109, -32, -45, 46, -37, 109, -27, -35, -44, 43, 104, -49, 33, -40, 40, -45, 47, 109, -62, 44, 46, -61, 96, -21, 33, -40, 40, -45, 47, 109, -51, 44, 46, -58, 109, -59, 40, 45, 46, 19, -29, -47, 42, -35, 58, Ascii.GS, -106, -44, -40, -42, 43, 33, 45, -44, 44, -61, 43, 108, -30, -60, 42, 108, -109, 34, -46, 44, -49, -48, 44, -46, 41, -48, 42, -62, -22, 34, -41, -35, 42, 20, -25, -60, 58, -44, Ascii.FS, -58, -24, 44, 46, Ascii.SUB, -22, 34, -41, -35, 42, 20, -25, -60, 58, -44, Ascii.FS, -39, -24, 44, 46, -61, 96, -22, 34, -41, -35, 42, 20, -25, -60, 58, -44, Ascii.FS, -58, -24, 44, 46, -61, 96, -30, -40, 109, -21, 33, -40, 40, -45, 47, 109, -47, -110, 44, 41, -44, 108, -32, -42, 41, -34, 104, -31, -57, 97, -108, -42, -41, 111, -21, 33, -40, 40, -45, 47, 109, -59, -24, 44, 46, -61, 96, -21, 33, -40, 40, -45, 47, 109, -50, -24, 44, 46, Ascii.SUB, -109, 43, 109, -39, -42, 47, -48, 47, 43, Ascii.ETB, -32, -45, 46, -37, 109, -27, -35, -44, 43, 104, -52, -27, -35, -44, 43, 104, -36, 63, -45, -44, -44, -42, 104, -98, 42, 46, 44, -44, 46, -37, 109, -107, 36, Ascii.RS, -107, -45, 47, 109, -61, -47, 35, 43, -57, -42, 98, -112, 56, 40, Ascii.FS};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r5, short r6, int r7) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.$$c
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r5 = 122 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            r4 = r0[r6]
            int r3 = r3 + 1
        L24:
            int r5 = r5 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.$$i(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.$$d
            int r5 = r5 * 3
            int r1 = r5 + 1
            int r6 = r6 + 4
            int r7 = 100 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + 6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 106
            int r5 = r5 + 4
            int r0 = r7 + 3
            byte[] r1 = com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 2
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalValidatorItem(String str, int i, int i2, String str2, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str4;
        String str5 = "";
        if ((i3 & 1) != 0) {
            int i5 = 2 % 2;
            str = "";
        }
        if ((i3 & 2) != 0) {
            int i6 = getRequestBeneficiariesState + 55;
            component4 = i6 % 128;
            i4 = Integer.MAX_VALUE;
            if (i6 % 2 != 0) {
                int i7 = 29 / 0;
            }
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            int i8 = component4 + 123;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i2 = Integer.MIN_VALUE;
        }
        int i11 = i2;
        if ((i3 & 8) != 0) {
            int i12 = component4 + 33;
            getRequestBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i3 & 16) != 0) {
            int i14 = component4 + 99;
            getRequestBeneficiariesState = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 99 / 0;
            }
            int i16 = 2 % 2;
        } else {
            str5 = str3;
        }
        if ((i3 & 32) != 0) {
            list = CollectionsKt.emptyList();
            int i17 = 2 % 2;
        }
        this(str, i4, i11, str4, str5, list);
    }

    public final String getReferenceName() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.referenceName;
        int i5 = i2 + 121;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final int getMaxLength() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxLength;
        }
        throw null;
    }

    public final int getMinLength() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.minLength;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInputHint() {
        int i = 2 % 2;
        int i2 = component4 + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.inputHint;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return str;
    }

    public final String getInputTips() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.inputTips;
        int i4 = i3 + 23;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<LocalRegular> getRegularList() {
        int i = 2 % 2;
        int i2 = component4 + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        List<LocalRegular> list = this.regularList;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return list;
    }

    public LocalValidatorItem(String str, int i, int i2, String str2, String str3, List<LocalRegular> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.referenceName = str;
        this.maxLength = i;
        this.minLength = i2;
        this.inputHint = str2;
        this.inputTips = str3;
        this.regularList = list;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $10 + 35;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int iBlue = Color.blue(0) + 1758;
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 34;
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b2 = (byte) ($$f & 3);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, jumpTapTimeout, maximumFlingVelocity, 1159210934, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component2), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 3608, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 7172), 1951385784, false, $$i($$c[1], b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 24, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27761), -1529629956, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $11 + 31;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                try {
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 4013, 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (27761 - (ViewConfiguration.getLongPressTimeout() >> 16)), -1529629956, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i8 = 52 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 4013, Color.green(0) + 24, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27761), -1529629956, false, $$i(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0 A[PHI: r0
  0x01e0: PHI (r0v9 int) = (r0v8 int), (r0v43 int) binds: [B:42:0x01de, B:39:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e2 A[PHI: r0
  0x01e2: PHI (r0v40 int) = (r0v8 int), (r0v43 int) binds: [B:42:0x01de, B:39:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r27, byte r28, int r29, short r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.c(int, byte, int, short, int, java.lang.Object[]):void");
    }

    public LocalValidatorItem() {
        this(null, 0, 0, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalValidatorItem copy$default(LocalValidatorItem localValidatorItem, String str, int i, int i2, String str2, String str3, List list, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = getRequestBeneficiariesState;
        int i6 = i5 + 125;
        component4 = i6 % 128;
        if (i6 % 2 == 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
            int i7 = i5 + 55;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            str = localValidatorItem.referenceName;
        }
        String str4 = str;
        if ((i3 & 2) != 0) {
            int i9 = component4 + 11;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            i = localValidatorItem.maxLength;
        }
        int i11 = i;
        if ((i3 & 4) != 0) {
            i2 = localValidatorItem.minLength;
        }
        int i12 = i2;
        if ((i3 & 8) != 0) {
            str2 = localValidatorItem.inputHint;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            int i13 = getRequestBeneficiariesState + 29;
            component4 = i13 % 128;
            if (i13 % 2 != 0) {
                String str6 = localValidatorItem.inputTips;
                throw null;
            }
            str3 = localValidatorItem.inputTips;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            int i14 = component4 + 125;
            getRequestBeneficiariesState = i14 % 128;
            int i15 = i14 % 2;
            list = localValidatorItem.regularList;
        }
        return localValidatorItem.copy(str4, i11, i12, str5, str7, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.referenceName;
        int i4 = i3 + 3;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4 + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.maxLength;
        if (i3 == 0) {
            int i5 = 58 / 0;
        }
        return i4;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.minLength;
        int i6 = i3 + 43;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 125;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.inputHint;
        int i5 = i3 + 79;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 35;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.inputTips;
        int i4 = i2 + 37;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<LocalRegular> component6() {
        int i = 2 % 2;
        int i2 = component4 + 103;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.regularList;
        }
        throw null;
    }

    public final LocalValidatorItem copy(String referenceName, int maxLength, int minLength, String inputHint, String inputTips, List<LocalRegular> regularList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(referenceName, "");
        Intrinsics.checkNotNullParameter(inputHint, "");
        Intrinsics.checkNotNullParameter(inputTips, "");
        Intrinsics.checkNotNullParameter(regularList, "");
        LocalValidatorItem localValidatorItem = new LocalValidatorItem(referenceName, maxLength, minLength, inputHint, inputTips, regularList);
        int i2 = component4 + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return localValidatorItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 53;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalValidatorItem)) {
            int i5 = i2 + 77;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        LocalValidatorItem localValidatorItem = (LocalValidatorItem) other;
        if (!Intrinsics.areEqual(this.referenceName, localValidatorItem.referenceName)) {
            return false;
        }
        if (this.maxLength != localValidatorItem.maxLength) {
            int i7 = component4 + 117;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.minLength != localValidatorItem.minLength || !Intrinsics.areEqual(this.inputHint, localValidatorItem.inputHint)) {
            return false;
        }
        if (Intrinsics.areEqual(this.inputTips, localValidatorItem.inputTips)) {
            return Intrinsics.areEqual(this.regularList, localValidatorItem.regularList);
        }
        int i9 = getRequestBeneficiariesState + 101;
        component4 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 99;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.referenceName.hashCode() * 31) + Integer.hashCode(this.maxLength)) * 31) + Integer.hashCode(this.minLength)) * 31) + this.inputHint.hashCode()) * 31) + this.inputTips.hashCode()) * 31) + this.regularList.hashCode();
        int i4 = getRequestBeneficiariesState + 61;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalValidatorItem(referenceName=" + this.referenceName + ", maxLength=" + this.maxLength + ", minLength=" + this.minLength + ", inputHint=" + this.inputHint + ", inputTips=" + this.inputTips + ", regularList=" + this.regularList + ")";
        int i2 = component4 + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:616|3|4|(1:6)|7|8|9|(1:11)|12|(23:(67:14|(1:16)(1:17)|18|19|(1:21)|22|23|(12:25|26|(1:28)(1:29)|30|31|32|(1:34)(1:35)|36|(5:38|(1:40)(1:41)|42|43|(0)(3:46|76|(4:78|(1:80)(1:81)|82|(5:84|(1:86)|87|88|89)(5:90|(1:92)|93|94|(2:96|104)))(6:97|98|(1:100)|101|102|(1:104))))(1:47)|(6:49|50|(1:52)(1:53)|54|55|(0)(0))(1:58)|(8:60|61|(1:63)|64|65|(0)(0)|76|(0)(0))|(6:68|69|(1:71)(1:72)|73|74|(2:76|(0)(0)))(1:105))(0)|108|109|(1:111)|112|(6:114|(3:117|(11:628|119|120|(1:122)|123|124|125|(1:127)|128|(10:130|(1:132)|133|134|(0)(1:137)|148|(8:151|152|(1:154)|155|156|(2:158|631)(2:159|630)|160|149)|629|161|(1:163)(1:168))(1:138)|(7:140|141|(1:143)(1:144)|145|146|(5:148|(1:149)|629|161|(0)(0))(1:167)|168)(2:164|168))(1:165)|115)|627|166|167|168)(3:166|167|168)|169|170|(1:172)|173|174|175|(1:177)|178|179|(1:186)(1:185)|187|188|(1:190)|191|192|193|(1:195)|196|197|(1:204)(2:201|(1:203)(0))|205|(1:207)(4:208|(7:211|212|(1:214)(1:215)|216|217|(2:646|219)(1:220)|209)|645|207)|221|597|222|595|223|(1:225)|226|601|(29:228|229|608|230|(1:232)|233|234|235|236|237|(1:239)|287|288|(2:290|291)(6:292|293|(1:295)|296|(6:298|299|(1:301)|302|303|(3:305|(7:308|309|(1:311)|312|313|(2:644|315)(1:316)|306)|643)(0))(0)|291)|317|623|318|319|(3:619|320|(3:322|(4:325|326|(5:632|328|604|329|(1:331))(1:332)|323)|633)(2:617|333))|345|(1:347)(2:348|(4:350|(4:355|(2:357|(2:359|(5:361|625|362|363|(3:621|364|(3:366|(4:369|370|(6:641|372|593|373|374|(2:636|376)(1:638))(1:377)|367)|642)(3:591|378|640)))(2:390|637))(0))(0)|391|351)|635|347)(0))|392|393|(1:395)|396|397|(1:399)(1:400)|401|(6:403|404|(1:406)|407|408|409)(12:410|411|(1:413)|414|415|(1:417)(1:418)|419|420|(1:422)|423|424|(55:426|(1:428)(1:429)|430|(1:438)(5:432|433|(1:435)|436|437)|439|440|(1:442)|443|444|(1:464)(6:446|447|(1:449)|450|451|(3:453|(3:457|(1:459)(1:460)|461)(1:462)|463)(0))|465|466|(1:468)(1:469)|470|471|472|(1:474)(1:475)|476|477|(5:479|480|(1:482)|483|484)(1:485)|486|487|(1:489)|490|491|(5:493|494|(1:496)(1:497)|498|499)(1:500)|501|502|(1:504)|505|506|(1:508)(1:509)|510|(1:512)(1:513)|514|515|(1:517)|518|519|(1:521)(1:522)|523|(2:525|(5:527|528|(1:530)|531|532)(1:533))(0)|534|(5:536|537|(1:539)|540|541)(1:542)|543|(5:545|546|(1:548)|549|550)(1:551)|552|553|(1:555)|556|599|(2:558|(1:560)(2:563|564))(2:565|566)|561|567|568)(2:574|575)))(1:245)|246|612|247|(4:249|250|610|251)(1:252)|253|(4:255|256|(1:258)(6:259|602|260|(1:262)|263|(0)(1:267))|287)(1:287)|288|(0)(0)|317|623|318|319|(4:619|320|(0)(0)|633)|345|(0)(0)|392|393|(0)|396|397|(0)(0)|401|(0)(0))(1:106)|612|247|(0)(0)|253|(0)(0)|288|(0)(0)|317|623|318|319|(4:619|320|(0)(0)|633)|345|(0)(0)|392|393|(0)|396|397|(0)(0)|401|(0)(0))|107|108|109|(0)|112|(0)(0)|169|170|(0)|173|174|175|(0)|178|179|(2:181|186)(0)|187|188|(0)|191|192|193|(0)|196|197|(2:199|204)(0)|205|(0)(0)|221|597|222|595|223|(0)|226|601|(0)(0)|246) */
    /* JADX WARN: Can't wrap try/catch for region: R(73:0|2|616|3|4|(1:6)|7|8|9|(1:11)|12|(67:14|(1:16)(1:17)|18|19|(1:21)|22|23|(12:25|26|(1:28)(1:29)|30|31|32|(1:34)(1:35)|36|(5:38|(1:40)(1:41)|42|43|(0)(3:46|76|(4:78|(1:80)(1:81)|82|(5:84|(1:86)|87|88|89)(5:90|(1:92)|93|94|(2:96|104)))(6:97|98|(1:100)|101|102|(1:104))))(1:47)|(6:49|50|(1:52)(1:53)|54|55|(0)(0))(1:58)|(8:60|61|(1:63)|64|65|(0)(0)|76|(0)(0))|(6:68|69|(1:71)(1:72)|73|74|(2:76|(0)(0)))(1:105))(0)|108|109|(1:111)|112|(6:114|(3:117|(11:628|119|120|(1:122)|123|124|125|(1:127)|128|(10:130|(1:132)|133|134|(0)(1:137)|148|(8:151|152|(1:154)|155|156|(2:158|631)(2:159|630)|160|149)|629|161|(1:163)(1:168))(1:138)|(7:140|141|(1:143)(1:144)|145|146|(5:148|(1:149)|629|161|(0)(0))(1:167)|168)(2:164|168))(1:165)|115)|627|166|167|168)(3:166|167|168)|169|170|(1:172)|173|174|175|(1:177)|178|179|(1:186)(1:185)|187|188|(1:190)|191|192|193|(1:195)|196|197|(1:204)(2:201|(1:203)(0))|205|(1:207)(4:208|(7:211|212|(1:214)(1:215)|216|217|(2:646|219)(1:220)|209)|645|207)|221|597|222|595|223|(1:225)|226|601|(29:228|229|608|230|(1:232)|233|234|235|236|237|(1:239)|287|288|(2:290|291)(6:292|293|(1:295)|296|(6:298|299|(1:301)|302|303|(3:305|(7:308|309|(1:311)|312|313|(2:644|315)(1:316)|306)|643)(0))(0)|291)|317|623|318|319|(3:619|320|(3:322|(4:325|326|(5:632|328|604|329|(1:331))(1:332)|323)|633)(2:617|333))|345|(1:347)(2:348|(4:350|(4:355|(2:357|(2:359|(5:361|625|362|363|(3:621|364|(3:366|(4:369|370|(6:641|372|593|373|374|(2:636|376)(1:638))(1:377)|367)|642)(3:591|378|640)))(2:390|637))(0))(0)|391|351)|635|347)(0))|392|393|(1:395)|396|397|(1:399)(1:400)|401|(6:403|404|(1:406)|407|408|409)(12:410|411|(1:413)|414|415|(1:417)(1:418)|419|420|(1:422)|423|424|(55:426|(1:428)(1:429)|430|(1:438)(5:432|433|(1:435)|436|437)|439|440|(1:442)|443|444|(1:464)(6:446|447|(1:449)|450|451|(3:453|(3:457|(1:459)(1:460)|461)(1:462)|463)(0))|465|466|(1:468)(1:469)|470|471|472|(1:474)(1:475)|476|477|(5:479|480|(1:482)|483|484)(1:485)|486|487|(1:489)|490|491|(5:493|494|(1:496)(1:497)|498|499)(1:500)|501|502|(1:504)|505|506|(1:508)(1:509)|510|(1:512)(1:513)|514|515|(1:517)|518|519|(1:521)(1:522)|523|(2:525|(5:527|528|(1:530)|531|532)(1:533))(0)|534|(5:536|537|(1:539)|540|541)(1:542)|543|(5:545|546|(1:548)|549|550)(1:551)|552|553|(1:555)|556|599|(2:558|(1:560)(2:563|564))(2:565|566)|561|567|568)(2:574|575)))(1:245)|246|612|247|(4:249|250|610|251)(1:252)|253|(4:255|256|(1:258)(6:259|602|260|(1:262)|263|(0)(1:267))|287)(1:287)|288|(0)(0)|317|623|318|319|(4:619|320|(0)(0)|633)|345|(0)(0)|392|393|(0)|396|397|(0)(0)|401|(0)(0))(1:106)|107|108|109|(0)|112|(0)(0)|169|170|(0)|173|174|175|(0)|178|179|(2:181|186)(0)|187|188|(0)|191|192|193|(0)|196|197|(2:199|204)(0)|205|(0)(0)|221|597|222|595|223|(0)|226|601|(0)(0)|246|612|247|(0)(0)|253|(0)(0)|288|(0)(0)|317|623|318|319|(4:619|320|(0)(0)|633)|345|(0)(0)|392|393|(0)|396|397|(0)(0)|401|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x26f5, code lost:
    
        r8 = r1;
        r29 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x2ef4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x2ef5, code lost:
    
        r1 = r0;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x2efd, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7738 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0c18 A[PHI: r15
  0x0c18: PHI (r15v56 java.lang.String) = (r15v55 java.lang.String), (r15v59 java.lang.String) binds: [B:24:0x03d9, B:67:0x0810] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x1507 A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x1555  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x192a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1a80  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1a9a A[PHI: r2
  0x1a9a: PHI (r2v13 int) = (r2v12 int), (r2v835 int) binds: [B:113:0x1553, B:627:0x1a9a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1af9 A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1c1a A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1d25  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1db1 A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x1eea A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x2004  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x2219 A[PHI: r1 r2 r6 r29
  0x2219: PHI (r1v615 int) = (r1v60 int), (r1v61 int) binds: [B:206:0x2217, B:645:0x2219] A[DONT_GENERATE, DONT_INLINE]
  0x2219: PHI (r2v829 java.lang.String) = (r2v70 java.lang.String), (r2v71 java.lang.String) binds: [B:206:0x2217, B:645:0x2219] A[DONT_GENERATE, DONT_INLINE]
  0x2219: PHI (r6v528 int) = (r6v133 int), (r6v134 int) binds: [B:206:0x2217, B:645:0x2219] A[DONT_GENERATE, DONT_INLINE]
  0x2219: PHI (r29v36 ??) = (r29v12 ??), (r29v13 ??) binds: [B:206:0x2217, B:645:0x2219] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x2222  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x23ac A[Catch: all -> 0x26e6, TryCatch #2 {all -> 0x26e6, blocks: (B:223:0x239f, B:225:0x23ac, B:226:0x23f3), top: B:595:0x239f, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x23fc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x2544  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x2598 A[Catch: all -> 0x26da, TRY_LEAVE, TryCatch #17 {all -> 0x26da, blocks: (B:247:0x258b, B:249:0x2598), top: B:612:0x258b }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x25e6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x25f1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x26fa A[PHI: r4 r8 r29
  0x26fa: PHI (r4v625 ??) = (r4v626 ??), (r4v627 ??), (r4v636 ??), (r4v636 ??), (r4v636 ??), (r4v636 ??) binds: [B:239:0x2533, B:589:0x26fa, B:254:0x25ef, B:264:0x26c0, B:266:0x26c6, B:258:0x263c] A[DONT_GENERATE, DONT_INLINE]
  0x26fa: PHI (r8v632 ??) = (r8v633 ??), (r8v636 ??), (r8v643 ??), (r8v643 ??), (r8v643 ??), (r8v643 ??) binds: [B:239:0x2533, B:589:0x26fa, B:254:0x25ef, B:264:0x26c0, B:266:0x26c6, B:258:0x263c] A[DONT_GENERATE, DONT_INLINE]
  0x26fa: PHI (r29v28 ??) = (r29v29 ??), (r29v30 ??), (r29v33 ??), (r29v33 ??), (r29v33 ??), (r29v33 ??) binds: [B:239:0x2533, B:589:0x26fa, B:254:0x25ef, B:264:0x26c0, B:266:0x26c6, B:258:0x263c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x2718  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x271d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x2ec2 A[Catch: all -> 0x2ef0, IOException -> 0x2efe, TryCatch #24 {IOException -> 0x2efe, all -> 0x2ef0, blocks: (B:320:0x2ebb, B:322:0x2ec2, B:325:0x2ece), top: B:619:0x2ebb }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x2f07  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x2f0a  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x308a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x3140 A[Catch: all -> 0x47db, TryCatch #19 {all -> 0x47db, blocks: (B:3:0x000a, B:6:0x0017, B:7:0x004d, B:9:0x01a2, B:11:0x01b0, B:12:0x01f2, B:19:0x02ee, B:21:0x02fb, B:22:0x0342, B:26:0x0405, B:28:0x0412, B:30:0x045f, B:32:0x048a, B:34:0x0497, B:36:0x04de, B:38:0x04e7, B:40:0x04ff, B:42:0x054a, B:84:0x09f4, B:86:0x0a01, B:87:0x0a3f, B:90:0x0a57, B:92:0x0a64, B:93:0x0aad, B:109:0x14fa, B:111:0x1507, B:112:0x154a, B:120:0x15fe, B:122:0x160b, B:123:0x1653, B:125:0x1688, B:127:0x1695, B:128:0x16de, B:130:0x16e7, B:132:0x16ff, B:133:0x174a, B:152:0x1958, B:154:0x1965, B:155:0x19b0, B:170:0x1aec, B:172:0x1af9, B:173:0x1b40, B:175:0x1c0d, B:177:0x1c1a, B:178:0x1c65, B:188:0x1da4, B:190:0x1db1, B:191:0x1df5, B:193:0x1edd, B:195:0x1eea, B:196:0x1f31, B:393:0x311d, B:395:0x3140, B:396:0x3195, B:404:0x3277, B:406:0x327d, B:407:0x32b4, B:411:0x32cb, B:413:0x32d1, B:414:0x3312, B:420:0x33d4, B:422:0x33da, B:423:0x341c, B:433:0x34f8, B:435:0x34fe, B:436:0x3541, B:440:0x3609, B:442:0x360f, B:443:0x364d, B:447:0x3720, B:449:0x3726, B:450:0x3767, B:466:0x3879, B:468:0x3886, B:470:0x38cd, B:472:0x3a22, B:474:0x3a35, B:476:0x3a7b, B:480:0x3b64, B:482:0x3b6a, B:483:0x3bad, B:487:0x3c76, B:489:0x3c7c, B:490:0x3cbb, B:494:0x3d8e, B:496:0x3d94, B:498:0x3de0, B:502:0x3f48, B:504:0x3f6b, B:505:0x3fc7, B:515:0x4107, B:517:0x4114, B:518:0x4159, B:528:0x4252, B:530:0x4258, B:531:0x429a, B:537:0x4375, B:539:0x437b, B:540:0x43c3, B:546:0x4499, B:548:0x44a6, B:549:0x44ee, B:553:0x45e6, B:555:0x4610, B:556:0x466f, B:293:0x275c, B:295:0x2769, B:296:0x27aa, B:299:0x27e3, B:301:0x27f0, B:302:0x2836, B:309:0x2d4d, B:311:0x2d5a, B:312:0x2da6, B:212:0x2228, B:214:0x2235, B:216:0x2287, B:141:0x1804, B:143:0x181b, B:145:0x186d, B:98:0x0b8f, B:100:0x0b9c, B:101:0x0be7, B:50:0x05dd, B:52:0x05f4, B:54:0x0645, B:61:0x06fb, B:63:0x0712, B:64:0x075d, B:69:0x0813, B:71:0x082a, B:73:0x0878), top: B:616:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x3237  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x3239  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x3274  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x32c8  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x3851  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x05d4 A[PHI: r15
  0x05d4: PHI (r15v62 java.lang.String) = (r15v59 java.lang.String), (r15v60 java.lang.String), (r15v63 java.lang.String) binds: [B:66:0x080e, B:56:0x06f1, B:44:0x05d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x4368  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x3075 A[EXC_TOP_SPLITTER, PHI: r11
  0x3075: PHI (r11v297 java.io.BufferedInputStream) = (r11v296 java.io.BufferedInputStream), (r11v298 java.io.BufferedInputStream) binds: [B:388:0x3087, B:365:0x3040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:617:0x2eec A[EXC_TOP_SPLITTER, PHI: r2
  0x2eec: PHI (r2v226 java.io.BufferedInputStream) = (r2v225 java.io.BufferedInputStream), (r2v776 java.io.BufferedInputStream) binds: [B:343:0x2efe, B:321:0x2ec0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0b66  */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v275, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v379 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r29v12, types: [int] */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v20, types: [long] */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v29 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v36 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v52 */
    /* JADX WARN: Type inference failed for: r29v53 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v55 */
    /* JADX WARN: Type inference failed for: r29v56 */
    /* JADX WARN: Type inference failed for: r32v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v328, types: [long] */
    /* JADX WARN: Type inference failed for: r4v329, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v625 */
    /* JADX WARN: Type inference failed for: r4v626 */
    /* JADX WARN: Type inference failed for: r4v627 */
    /* JADX WARN: Type inference failed for: r4v635 */
    /* JADX WARN: Type inference failed for: r4v636, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v950 */
    /* JADX WARN: Type inference failed for: r4v951 */
    /* JADX WARN: Type inference failed for: r4v952 */
    /* JADX WARN: Type inference failed for: r6v285, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r6v336 */
    /* JADX WARN: Type inference failed for: r6v337, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v471 */
    /* JADX WARN: Type inference failed for: r6v472 */
    /* JADX WARN: Type inference failed for: r6v473, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v695 */
    /* JADX WARN: Type inference failed for: r6v696 */
    /* JADX WARN: Type inference failed for: r7v906, types: [java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r8v224 */
    /* JADX WARN: Type inference failed for: r8v225 */
    /* JADX WARN: Type inference failed for: r8v402 */
    /* JADX WARN: Type inference failed for: r8v403, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v570, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v632 */
    /* JADX WARN: Type inference failed for: r8v633 */
    /* JADX WARN: Type inference failed for: r8v635, types: [int] */
    /* JADX WARN: Type inference failed for: r8v636 */
    /* JADX WARN: Type inference failed for: r8v640, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v641 */
    /* JADX WARN: Type inference failed for: r8v642 */
    /* JADX WARN: Type inference failed for: r8v643 */
    /* JADX WARN: Type inference failed for: r8v651, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v653 */
    /* JADX WARN: Type inference failed for: r8v656 */
    /* JADX WARN: Type inference failed for: r8v803 */
    /* JADX WARN: Type inference failed for: r8v804 */
    /* JADX WARN: Type inference failed for: r8v805 */
    /* JADX WARN: Type inference failed for: r8v806 */
    /* JADX WARN: Type inference failed for: r8v807 */
    /* JADX WARN: Type inference failed for: r8v808 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] ShareDataUIState$16dd2b22(int r69, int r70, java.lang.Object r71, int r72, boolean r73, boolean r74) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 18405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.form.validator.response.LocalValidatorItem.ShareDataUIState$16dd2b22(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
    }
}
