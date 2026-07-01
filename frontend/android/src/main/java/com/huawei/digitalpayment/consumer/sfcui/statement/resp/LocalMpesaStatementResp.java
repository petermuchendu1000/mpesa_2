package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.consumer.commons.statements.Statement;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0004H×\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/LocalMpesaStatementResp;", "Ljava/io/Serializable;", "cateGoryList", "", "", "groups", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/StatementGroup;", "feeStatementList", "Lcom/safaricom/consumer/commons/statements/Statement;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCateGoryList", "()Ljava/util/List;", "setCateGoryList", "(Ljava/util/List;)V", "getGroups", "setGroups", "getFeeStatementList", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalMpesaStatementResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static long component1;
    private static char[] component3;
    private List<String> cateGoryList;
    private final List<Statement> feeStatementList;
    private List<StatementGroup> groups;
    private static final byte[] $$c = {Ascii.GS, -59, -25, -119};
    private static final int $$d = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -43, -105, 125, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 11;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, short r6, short r7) {
        /*
            int r6 = 122 - r6
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r7 = r7 + 1
            r3 = r1[r7]
        L28:
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp.$$e(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = r7 * 6
            int r0 = 16 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp.$$a
            byte[] r0 = new byte[r0]
            int r7 = 15 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-17)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp.a(short, byte, int, java.lang.Object[]):void");
    }

    public LocalMpesaStatementResp(List<String> list, List<StatementGroup> list2, List<Statement> list3) {
        this.cateGoryList = list;
        this.groups = list2;
        this.feeStatementList = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalMpesaStatementResp(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = equals + 69;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            int i4 = 2 % 2;
            list = null;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 39;
            equals = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            list2 = null;
        }
        this(list, list2, (i & 4) != 0 ? null : list3);
    }

    public final List<String> getCateGoryList() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.cateGoryList;
        int i4 = i2 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void setCateGoryList(List<String> list) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.cateGoryList = list;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<StatementGroup> getGroups() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<StatementGroup> list = this.groups;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setGroups(List<StatementGroup> list) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.groups = list;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Statement> getFeeStatementList() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        List<Statement> list = this.feeStatementList;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return list;
    }

    private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i5 = $10 + 101;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component3[i2 * i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1757 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0) + 35, (char) Color.argb(0, 0, 0, 0), 1159210934, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3607, 28 - MotionEvent.axisFromString(""), (char) (ExpandableListView.getPackedPositionChild(0L) + 7172), 1951385784, false, $$e(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSize(0, 0) + 24, (char) (27761 - View.getDefaultSize(0, 0)), -1529629956, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(component3[i2 + i7])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1757 - ExpandableListView.getPackedPositionChild(0L), 33 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.indexOf("", "", 0), 1159210934, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3607, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.RS, (char) (7171 - View.getDefaultSize(0, 0)), 1951385784, false, $$e(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 4014, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, (char) (27762 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1529629956, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            int i8 = $11 + 95;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i3 = 2;
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - Drawable.resolveOpacity(0, 0), 24 - TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$e(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i10 = $10 + 77;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> component1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.LocalMpesaStatementResp.component1():java.util.List");
    }

    static {
        ShareDataUIState = 1;
        copydefault();
        int i = component2 + 33;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public LocalMpesaStatementResp() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalMpesaStatementResp copy$default(LocalMpesaStatementResp localMpesaStatementResp, List list, List list2, List list3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = localMpesaStatementResp.cateGoryList;
            int i3 = equals + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            list2 = localMpesaStatementResp.groups;
        }
        if ((i & 4) != 0) {
            int i5 = equals + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            list3 = localMpesaStatementResp.feeStatementList;
        }
        LocalMpesaStatementResp localMpesaStatementRespCopy = localMpesaStatementResp.copy(list, list2, list3);
        int i7 = equals + 47;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return localMpesaStatementRespCopy;
        }
        throw null;
    }

    public final List<StatementGroup> component2() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        List<StatementGroup> list = this.groups;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return list;
    }

    public final List<Statement> component3() {
        int i = 2 % 2;
        int i2 = equals + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.feeStatementList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalMpesaStatementResp copy(List<String> cateGoryList, List<StatementGroup> groups, List<Statement> feeStatementList) {
        int i = 2 % 2;
        LocalMpesaStatementResp localMpesaStatementResp = new LocalMpesaStatementResp(cateGoryList, groups, feeStatementList);
        int i2 = equals + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return localMpesaStatementResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalMpesaStatementResp)) {
            return false;
        }
        LocalMpesaStatementResp localMpesaStatementResp = (LocalMpesaStatementResp) other;
        if (!Intrinsics.areEqual(this.cateGoryList, localMpesaStatementResp.cateGoryList) || (!Intrinsics.areEqual(this.groups, localMpesaStatementResp.groups))) {
            return false;
        }
        if (Intrinsics.areEqual(this.feeStatementList, localMpesaStatementResp.feeStatementList)) {
            return true;
        }
        int i4 = equals + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<String> list = this.cateGoryList;
        int iHashCode2 = 1;
        if (list == null) {
            int i2 = equals;
            int i3 = i2 + 93;
            copydefault = i3 % 128;
            iHashCode = i3 % 2 != 0 ? 1 : 0;
            int i4 = i2 + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = list.hashCode();
        }
        List<StatementGroup> list2 = this.groups;
        if (list2 == null) {
            int i6 = copydefault + 123;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = list2.hashCode();
        }
        List<Statement> list3 = this.feeStatementList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalMpesaStatementResp(cateGoryList=" + this.cateGoryList + ", groups=" + this.groups + ", feeStatementList=" + this.feeStatementList + ")";
        int i2 = equals + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        component3 = new char[]{3095, 6398, 9694, 12982, 24449, 25697, 29046, 40466, 43817, 45075, 56484, 59847, 63175, 939, 10390, 13673, 17019, 28531, 29750, 33035, 44525, 47811, 3091, 6396, 9691, 12980, 24477, 25709, 29046, 40558, 43811, 45057, 56550, 59872, 63191, 949, 10375};
        component1 = 1745781364383815824L;
    }
}
