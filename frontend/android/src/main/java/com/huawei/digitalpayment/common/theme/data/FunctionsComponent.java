package com.huawei.digitalpayment.common.theme.data;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.constants.GriverEvents;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÓ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010F\u001a\u00020\u0007J\u000f\u0010G\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0002\u0010'J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'JÚ\u0001\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00072\b\u0010[\u001a\u0004\u0018\u00010\\HÖ\u0003J\t\u0010]\u001a\u00020\tHÖ\u0001J\t\u0010^\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010*\u001a\u0004\bE\u0010'¨\u0006_"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/FunctionsComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "title", "", "titleColor", "canHide", "", "columnCount", "", "maxLineCount", "iconStyle", "redirectText", "redirectIcon", "redirectColor", "redirectExecute", "allText", "allIcon", "itemArea", "Lcom/huawei/digitalpayment/common/theme/data/FunctionsItemComponent;", "functions", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "filterFunctions", "order", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/common/theme/data/FunctionsItemComponent;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", GriverEvents.EVENT_SET_TITLE, "(Ljava/lang/String;)V", "getTitleColor", "setTitleColor", "getCanHide", "()Ljava/lang/Boolean;", "setCanHide", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getColumnCount", "()Ljava/lang/Integer;", "setColumnCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMaxLineCount", "setMaxLineCount", "getIconStyle", "setIconStyle", "getRedirectText", "setRedirectText", "getRedirectIcon", "setRedirectIcon", "getRedirectColor", "setRedirectColor", "getRedirectExecute", "setRedirectExecute", "getAllText", "setAllText", "getAllIcon", "setAllIcon", "getItemArea", "()Lcom/huawei/digitalpayment/common/theme/data/FunctionsItemComponent;", "setItemArea", "(Lcom/huawei/digitalpayment/common/theme/data/FunctionsItemComponent;)V", "getFunctions", "()Ljava/util/List;", "setFunctions", "(Ljava/util/List;)V", "getFilterFunctions", "setFilterFunctions", "getOrder", "isLightIcon", "getSortOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/common/theme/data/FunctionsItemComponent;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/FunctionsComponent;", "equals", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FunctionsComponent extends BaseComponent implements Order {
    private String allIcon;
    private String allText;
    private Boolean canHide;
    private Integer columnCount;
    private List<? extends FunctionResp> filterFunctions;
    private List<? extends FunctionResp> functions;
    private String iconStyle;
    private FunctionsItemComponent itemArea;
    private Integer maxLineCount;
    private final Integer order;
    private String redirectColor;
    private String redirectExecute;
    private String redirectIcon;
    private String redirectText;
    private String title;
    private String titleColor;
    private static final byte[] $$c = {79, -25, -14, 102};
    private static final int $$f = 178;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {84, 79, Ascii.SYN, 41, 3, 5, 13, -58, 66, Ascii.FF, 13, -8, 20, 3, -6, Ascii.DC2, -55, 43, Ascii.SUB, Ascii.NAK, 3, 13, 4, -8, 9, -24, 42, 10, 0, -11, 45, 1, 8, -8, Ascii.SI, -66, 38, TarHeader.LF_CHR, 5, 10, -8, 20, 2, 13, 6, 19, 8, Ascii.DLE, -14, 8, 8, 2, Ascii.ESC, -2, Ascii.SI};
    private static final int $$e = 75;
    private static final byte[] $$a = {79, 9, 94, -7, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$b = WSContextConstant.HANDSHAKE_RECEIVE_SIZE;
    private static int copydefault = 0;
    private static int component3 = 1;
    private static long component1 = 8182366418324265903L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = r6 + 102
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.common.theme.data.FunctionsComponent.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.FunctionsComponent.$$i(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 23 - r7
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.common.theme.data.FunctionsComponent.$$a
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-16)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.FunctionsComponent.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 31
            int r0 = 42 - r8
            int r7 = r7 * 12
            int r7 = r7 + 99
            int r6 = r6 * 41
            int r6 = 44 - r6
            byte[] r1 = com.huawei.digitalpayment.common.theme.data.FunctionsComponent.$$d
            byte[] r0 = new byte[r0]
            int r8 = 41 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-7)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.data.FunctionsComponent.c(short, short, short, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $10 + 11;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 33 - TextUtils.getOffsetBefore("", 0), (char) (ExpandableListView.getPackedPositionType(0L) + 60268), -834797019, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() + (component1 & 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - Drawable.resolveOpacity(0, 0), 34 - Gravity.getAbsoluteGravity(0, 0), (char) (60373 - TextUtils.getTrimmedLength("")), -1969106284, false, $$i(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 33 - View.combineMeasuredStates(0, 0), (char) (60268 - View.combineMeasuredStates(0, 0)), -834797019, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, (char) (60372 - MotionEvent.axisFromString("")), -1969106284, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 1;
                byte b11 = (byte) (b10 - 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(688 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 34, (char) (60373 - Drawable.resolveOpacity(0, 0)), -1969106284, false, $$i(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FunctionsComponent(String str, String str2, Boolean bool, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FunctionsItemComponent functionsItemComponent, List list, List list2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        Integer num4;
        Integer num5;
        String str11;
        String str12;
        FunctionsItemComponent functionsItemComponent2;
        List list3;
        List list4;
        List list5;
        Integer num6;
        String str13 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = copydefault + 7;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
            int i4 = 2 % 2;
            str10 = null;
        } else {
            str10 = str2;
        }
        Boolean bool2 = (i & 4) != 0 ? null : bool;
        if ((i & 8) != 0) {
            int i5 = component3 + 19;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 16) != 0) {
            int i6 = copydefault;
            int i7 = i6 + 97;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 19;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            num5 = null;
        } else {
            num5 = num2;
        }
        String str14 = (i & 32) != 0 ? null : str3;
        String str15 = (i & 64) != 0 ? null : str4;
        String str16 = (i & 128) != 0 ? null : str5;
        String str17 = (i & 256) != 0 ? null : str6;
        if ((i & 512) != 0) {
            int i11 = copydefault + 47;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str11 = null;
        } else {
            str11 = str7;
        }
        String str18 = (i & 1024) != 0 ? null : str8;
        if ((i & 2048) != 0) {
            int i13 = component3 + 95;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            str12 = null;
        } else {
            str12 = str9;
        }
        FunctionsItemComponent functionsItemComponent3 = (i & 4096) != 0 ? null : functionsItemComponent;
        if ((i & 8192) != 0) {
            int i15 = copydefault + 83;
            functionsItemComponent2 = functionsItemComponent3;
            component3 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 5 / 2;
            } else {
                int i17 = 2 % 2;
            }
            list3 = null;
        } else {
            functionsItemComponent2 = functionsItemComponent3;
            list3 = list;
        }
        if ((i & 16384) != 0) {
            int i18 = copydefault + 11;
            list4 = list3;
            component3 = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 4 / 0;
            }
            list5 = null;
        } else {
            list4 = list3;
            list5 = list2;
        }
        if ((i & 32768) != 0) {
            int i20 = component3 + 7;
            copydefault = i20 % 128;
            if (i20 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            num6 = null;
        } else {
            num6 = num3;
        }
        this(str13, str10, bool2, num4, num5, str14, str15, str16, str17, str11, str18, str12, functionsItemComponent2, list4, list5, num6);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.title = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getTitleColor() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.titleColor;
        }
        throw null;
    }

    public final void setTitleColor(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.titleColor = str;
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        int i6 = i2 + 73;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean getCanHide() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.canHide;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final void setCanHide(Boolean bool) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.canHide = bool;
        int i5 = i3 + 115;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getColumnCount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.columnCount;
        int i4 = i2 + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final void setColumnCount(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.columnCount = num;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Integer getMaxLineCount() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxLineCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMaxLineCount(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.maxLineCount = num;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIconStyle() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iconStyle;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final void setIconStyle(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.iconStyle = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getRedirectText() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.redirectText;
        int i5 = i2 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setRedirectText(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.redirectText = str;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public final String getRedirectIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.redirectIcon;
        int i4 = i3 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setRedirectIcon(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.redirectIcon = str;
        int i5 = i3 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getRedirectColor() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.redirectColor;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setRedirectColor(String str) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.redirectColor = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getRedirectExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.redirectExecute;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setRedirectExecute(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.redirectExecute = str;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAllText() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.allText;
        int i5 = i3 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAllText(String str) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.allText = str;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAllIcon() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.allIcon;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final void setAllIcon(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.allIcon = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final FunctionsItemComponent getItemArea() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        FunctionsItemComponent functionsItemComponent = this.itemArea;
        int i5 = i3 + 59;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return functionsItemComponent;
    }

    public final void setItemArea(FunctionsItemComponent functionsItemComponent) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.itemArea = functionsItemComponent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<FunctionResp> getFunctions() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.functions;
        int i4 = i2 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void setFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.functions = list;
        if (i3 != 0) {
            throw null;
        }
    }

    public final List<FunctionResp> getFilterFunctions() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.filterFunctions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setFilterFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.filterFunctions = list;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public FunctionsComponent(String str, String str2, Boolean bool, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FunctionsItemComponent functionsItemComponent, List<? extends FunctionResp> list, List<? extends FunctionResp> list2, Integer num3) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.title = str;
        this.titleColor = str2;
        this.canHide = bool;
        this.columnCount = num;
        this.maxLineCount = num2;
        this.iconStyle = str3;
        this.redirectText = str4;
        this.redirectIcon = str5;
        this.redirectColor = str6;
        this.redirectExecute = str7;
        this.allText = str8;
        this.allIcon = str9;
        this.itemArea = functionsItemComponent;
        this.functions = list;
        this.filterFunctions = list2;
        this.order = num3;
    }

    public final boolean isLightIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        return !Intrinsics.areEqual(i2 % 2 == 0 ? this.iconStyle : this.iconStyle, "1");
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.order;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
        if (objCopydefault == null) {
            int i4 = 1116 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
            byte[] bArr = $$a;
            byte b2 = bArr[6];
            byte b3 = bArr[37];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, jumpTapTimeout, cNormalizeMetaState, 573302743, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0, 0) + 64124, new char[]{7140, 57744, 61207, 62598, 61958, 65419, 50435, 49910, 51250, 54693, 54117, 55455, 42552, 41929, 43339, 46805, 48216, 47597, 34639, 36043, 35450, 38905}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getLongPressTimeout() >> 16) + 62969, new char[]{7136, 60944, 61462, 64030, 52242, 54845, 55351, 41496, 46120, 48677, 32851, 35394, 40000, 26189, 26750}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
        if (objCopydefault2 == null) {
            int iRgb = Color.rgb(0, 0, 0) + 16778331;
            int iGreen = Color.green(0) + 22;
            char cResolveSize = (char) View.resolveSize(0, 0);
            byte[] bArr2 = $$a;
            byte b4 = (byte) (bArr2[19] - 1);
            byte b5 = bArr2[37];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRgb, iGreen, cResolveSize, 987555995, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            b(1913 - KeyEvent.normalizeMetaState(0), new char[]{7140, 7314, 5395, 3484, 1550, 16049, 14135, 12260, 8236, 22708, 20815, 18840, 17000, 31427, 29551, 27643, 27747, 25829, 40307, 38407, 36517, 34560, 49041, 45119, 43196, 41264}, objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0) + 56659, new char[]{7142, 50851, 41297, 35854, 28332, 18804, 13315, 5761, 61805, 56350, 48855, 39293, 17410, 9939, 379, 60465, 52954, 43368}, objArr7);
            Context applicationContext = (Context) cls2.getMethod((String) objArr7[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            b(48473 - Drawable.resolveOpacity(0, 0), new char[]{7151, 42685, 24897, 9199, 61135, 43348, 27634, 13956, 61738, 45962, 32428, 14639, 64474, 34420, 16702, 991}, objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(12823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{7148, 10742, 32718, 36270, 54189, 57759, 14203, 17757, 35701, 55595, 61200, 15632, 17106, 37057, 42659, 62649}, objArr9);
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1, 231823171};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[31];
                Object[] objArr11 = new Object[1];
                c(b6, b6, bArr3[28], objArr11);
                Class<?> cls4 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[28];
                Object[] objArr12 = new Object[1];
                c(b7, b7, bArr3[31], objArr12);
                Object[] objArr13 = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
                    if (objCopydefault3 == null) {
                        int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1115;
                        int iGreen2 = 22 - Color.green(0);
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        byte b8 = (byte) ($$a[37] - 1);
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        a(b8, b9, (byte) (b9 | 6), objArr14);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5, iGreen2, absoluteGravity, 1068109365, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault3).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(View.getDefaultSize(0, 0) + 64123, new char[]{7140, 57744, 61207, 62598, 61958, 65419, 50435, 49910, 51250, 54693, 54117, 55455, 42552, 41929, 43339, 46805, 48216, 47597, 34639, 36043, 35450, 38905}, objArr15);
                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(62969 - ExpandableListView.getPackedPositionGroup(0L), new char[]{7136, 60944, 61462, 64030, 52242, 54845, 55351, 41496, 46120, 48677, 32851, 35394, 40000, 26189, 26750}, objArr16);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-8046594);
                        if (objCopydefault4 == null) {
                            int i6 = 1115 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int size = View.MeasureSpec.getSize(0) + 22;
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b10 = (byte) (r15[19] - 1);
                            byte b11 = $$a[37];
                            Object[] objArr17 = new Object[1];
                            a(b10, b11, b11, objArr17);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i6, size, pressedStateDuration, 987555995, false, (String) objArr17[0], null);
                        }
                        ((Field) objCopydefault4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-411944782);
                        if (objCopydefault5 == null) {
                            int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1114;
                            int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            byte[] bArr4 = $$a;
                            byte b12 = bArr4[6];
                            byte b13 = bArr4[37];
                            Object[] objArr18 = new Object[1];
                            a(b12, b13, (byte) (b13 - 1), objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i7, maxKeyCode, maxKeyCode2, 573302743, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            int i8 = copydefault + 33;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-84684464);
            if (objCopydefault6 == null) {
                int trimmedLength = 1115 - TextUtils.getTrimmedLength("");
                int iMyTid = (Process.myTid() >> 22) + 22;
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                byte b14 = (byte) ($$a[37] - 1);
                byte b15 = b14;
                Object[] objArr19 = new Object[1];
                a(b14, b15, (byte) (b15 | 6), objArr19);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, iMyTid, cIndexOf, 1068109365, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objCopydefault6).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int i10 = ((((~(r1 | 306866677)) | (-113669190)) * 56) - 1983785113) + (((~((~System.identityHashCode(this)) | (-113669190))) | 306866677) * 56) + 231823171;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = i15 + ((((~(494927314 | r2)) | (~((-8193041) | iIdentityHashCode))) * 988) - 1355022013) + (((~(iIdentityHashCode | 293536786)) | 201390528 | (~((~iIdentityHashCode) | (-8193041)))) * 988);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
            int i19 = ((int[]) objArr21[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i19 + (-1895262764) + ((~((~iIdentityHashCode2) | (-571609422))) * 433) + (((~(714218957 | iIdentityHashCode2)) | (-907416446)) * (-433)) + (((~(iIdentityHashCode2 | (-907416446))) | 142609536) * 433);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr22[0])[0] = i22 ^ (i22 << 5);
        } else {
            long j2 = -1;
            long j3 = 0;
            long j4 = (((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) 5) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6617, 41 - Process.getGidForName(""), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {1943630986, Long.valueOf(j4), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 6562, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 55, (char) KeyEvent.getDeadChar(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i23 = ((int[]) objArr[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyPid = Process.myPid();
                int i24 = ~iMyPid;
                int i25 = i23 + 1256245011 + ((iMyPid | (-152880268)) * 140) + (((~((-152880268) | i24)) | 32779) * (-280)) + (((~(iMyPid | (-32780))) | (~(346077755 | i24)) | (-498925244)) * 140);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr24[0])[0] = i27 ^ (i27 << 5);
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i28 = ((int[]) objArr24[0])[0];
                Object[] objArr25 = {new int[1], new int[]{((int[]) objArr24[1])[0]}, new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
                int iMyTid2 = Process.myTid();
                int i29 = i28 + 647729428 + ((~(1050621917 | iMyTid2)) * 623) + (((~iMyTid2) | 839065997) * (-623)) + (((~(iMyTid2 | 1041442701)) | (~(848245213 | iMyTid2)) | (-1050621918)) * 623);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr25[0])[0] = i31 ^ (i31 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        String str = this.titleColor;
        int i32 = component3 + 3;
        copydefault = i32 % 128;
        if (i32 % 2 != 0) {
            int i33 = 79 / 0;
        }
        return str;
    }

    public FunctionsComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FunctionsComponent copy$default(FunctionsComponent functionsComponent, String str, String str2, Boolean bool, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FunctionsItemComponent functionsItemComponent, List list, List list2, Integer num3, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str10 = functionsComponent.title;
            int i3 = copydefault + 55;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str10 = str;
        }
        String str13 = (i & 2) != 0 ? functionsComponent.titleColor : str2;
        Boolean bool2 = (i & 4) != 0 ? functionsComponent.canHide : bool;
        Integer num4 = (i & 8) != 0 ? functionsComponent.columnCount : num;
        Integer num5 = (i & 16) != 0 ? functionsComponent.maxLineCount : num2;
        String str14 = (i & 32) != 0 ? functionsComponent.iconStyle : str3;
        String str15 = (i & 64) != 0 ? functionsComponent.redirectText : str4;
        if ((i & 128) != 0) {
            int i5 = component3 + 67;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str16 = functionsComponent.redirectIcon;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str11 = functionsComponent.redirectIcon;
        } else {
            str11 = str5;
        }
        if ((i & 256) != 0) {
            int i6 = component3 + 65;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str12 = functionsComponent.redirectColor;
        } else {
            str12 = str6;
        }
        return functionsComponent.copy(str10, str13, bool2, num4, num5, str14, str15, str11, str12, (i & 512) != 0 ? functionsComponent.redirectExecute : str7, (i & 1024) != 0 ? functionsComponent.allText : str8, (i & 2048) != 0 ? functionsComponent.allIcon : str9, (i & 4096) != 0 ? functionsComponent.itemArea : functionsItemComponent, (i & 8192) != 0 ? functionsComponent.functions : list, (i & 16384) != 0 ? functionsComponent.filterFunctions : list2, (i & 32768) != 0 ? functionsComponent.order : num3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.redirectExecute;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.allText;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.allIcon;
        }
        throw null;
    }

    public final FunctionsItemComponent component13() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        FunctionsItemComponent functionsItemComponent = this.itemArea;
        int i5 = i3 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return functionsItemComponent;
        }
        throw null;
    }

    public final List<FunctionResp> component14() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List list = this.functions;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<FunctionResp> component15() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.filterFunctions;
        }
        throw null;
    }

    public final Integer component16() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.order;
        int i4 = i3 + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Boolean component3() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.canHide;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final Integer component4() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.columnCount;
            int i4 = 17 / 0;
        } else {
            num = this.columnCount;
        }
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxLineCount;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.iconStyle;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.redirectText;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.redirectIcon;
        int i5 = i2 + 1;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.redirectColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FunctionsComponent copy(String title, String titleColor, Boolean canHide, Integer columnCount, Integer maxLineCount, String iconStyle, String redirectText, String redirectIcon, String redirectColor, String redirectExecute, String allText, String allIcon, FunctionsItemComponent itemArea, List<? extends FunctionResp> functions, List<? extends FunctionResp> filterFunctions, Integer order) {
        int i = 2 % 2;
        FunctionsComponent functionsComponent = new FunctionsComponent(title, titleColor, canHide, columnCount, maxLineCount, iconStyle, redirectText, redirectIcon, redirectColor, redirectExecute, allText, allIcon, itemArea, functions, filterFunctions, order);
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return functionsComponent;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionsComponent)) {
            return false;
        }
        FunctionsComponent functionsComponent = (FunctionsComponent) other;
        if (!Intrinsics.areEqual(this.title, functionsComponent.title)) {
            int i2 = component3 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.titleColor, functionsComponent.titleColor)) {
            int i4 = component3 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.canHide, functionsComponent.canHide) || !Intrinsics.areEqual(this.columnCount, functionsComponent.columnCount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.maxLineCount, functionsComponent.maxLineCount)) {
            int i6 = component3 + 57;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 24 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.iconStyle, functionsComponent.iconStyle)) {
            int i8 = component3 + 55;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.redirectText, functionsComponent.redirectText)) {
            int i10 = component3 + 103;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.redirectIcon, functionsComponent.redirectIcon)) {
            int i12 = component3 + 49;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.redirectColor, functionsComponent.redirectColor)) {
            int i14 = copydefault + 101;
            component3 = i14 % 128;
            return i14 % 2 == 0;
        }
        if ((!Intrinsics.areEqual(this.redirectExecute, functionsComponent.redirectExecute)) || !Intrinsics.areEqual(this.allText, functionsComponent.allText)) {
            return false;
        }
        if (Intrinsics.areEqual(this.allIcon, functionsComponent.allIcon)) {
            return Intrinsics.areEqual(this.itemArea, functionsComponent.itemArea) && Intrinsics.areEqual(this.functions, functionsComponent.functions) && Intrinsics.areEqual(this.filterFunctions, functionsComponent.filterFunctions) && Intrinsics.areEqual(this.order, functionsComponent.order);
        }
        int i15 = component3 + 13;
        copydefault = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int i2;
        int i3 = 2 % 2;
        String str = this.title;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.titleColor;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.canHide;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        Integer num = this.columnCount;
        if (num == null) {
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i4 = component3 + 93;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        Integer num2 = this.maxLineCount;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.iconStyle;
        if (str3 == null) {
            int i6 = copydefault + 37;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.redirectText;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.redirectIcon;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.redirectColor;
        if (str6 == null) {
            int i8 = copydefault + 107;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.redirectExecute;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.allText;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.allIcon;
        if (str9 == null) {
            int i10 = component3;
            int i11 = i10 + 53;
            copydefault = i11 % 128;
            iHashCode4 = i11 % 2 != 0 ? 1 : 0;
            int i12 = i10 + 35;
            copydefault = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 / 5;
            }
        } else {
            iHashCode4 = str9.hashCode();
        }
        FunctionsItemComponent functionsItemComponent = this.itemArea;
        int iHashCode13 = functionsItemComponent == null ? 0 : functionsItemComponent.hashCode();
        List<? extends FunctionResp> list = this.functions;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        List<? extends FunctionResp> list2 = this.filterFunctions;
        if (list2 == null) {
            i = iHashCode14;
            i2 = 0;
        } else {
            int iHashCode15 = list2.hashCode();
            int i14 = component3 + 83;
            i = iHashCode14;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            i2 = iHashCode15;
        }
        Integer num3 = this.order;
        return (((((((((((((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode4) * 31) + iHashCode13) * 31) + i) * 31) + i2) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FunctionsComponent(title=" + this.title + ", titleColor=" + this.titleColor + ", canHide=" + this.canHide + ", columnCount=" + this.columnCount + ", maxLineCount=" + this.maxLineCount + ", iconStyle=" + this.iconStyle + ", redirectText=" + this.redirectText + ", redirectIcon=" + this.redirectIcon + ", redirectColor=" + this.redirectColor + ", redirectExecute=" + this.redirectExecute + ", allText=" + this.allText + ", allIcon=" + this.allIcon + ", itemArea=" + this.itemArea + ", functions=" + this.functions + ", filterFunctions=" + this.filterFunctions + ", order=" + this.order + ")";
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
