package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/ErrorResp;", "", "message", "", "errorCode", "errorSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getErrorCode", "getErrorSource", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorResp {
    public static final int $stable = 0;
    private static int component2;
    private static long component3;

    @SerializedName("message")
    private final String ShareDataUIState;

    @SerializedName("errorCode")
    private final String component1;

    @SerializedName("errorSource")
    private final String copydefault;
    private static final byte[] $$c = {108, -1, -36, 99};
    private static final int $$d = 246;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Base64.padSymbol, -49, -70, 93, -6, 5, -3};
    private static final int $$b = 117;
    private static int copy = 0;
    private static int component4 = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r7, byte r8, short r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.ErrorResp.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 * 3
            int r8 = r8 + 102
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r5 = r2
            r8 = r7
            goto L2a
        L17:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.ErrorResp.$$e(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.statement.resp.ErrorResp.$$a
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = 99 - r8
            int r7 = r7 * 4
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L31
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + 6
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.ErrorResp.b(short, short, byte, java.lang.Object[]):void");
    }

    public ErrorResp(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.component1 = str2;
        this.copydefault = str3;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 39;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getErrorCode() {
        int i = 2 % 2;
        int i2 = copy + 43;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String getErrorSource() {
        int i = 2 % 2;
        int i2 = copy + 11;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 91;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 3266;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 33;
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 60268);
                    byte b2 = (byte) ($$c[1] + 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, fadingEdgeLength, capsMode, -834797019, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    int iMyTid = (Process.myTid() >> 22) + 687;
                    int i4 = 34 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    char threadPriority = (char) (60373 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b4 = $$c[1];
                    byte b5 = (byte) (b4 + 1);
                    byte b6 = (byte) (-b4);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, i4, threadPriority, -1969106284, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i5 = $11 + 57;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i7 = $11 + 67;
        $10 = i7 % 128;
        while (true) {
            int i8 = i7 % 2;
            if (notifyVar.copydefault >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 688;
                int packedPositionChild = 33 - ExpandableListView.getPackedPositionChild(0L);
                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 60373);
                byte b7 = $$c[1];
                byte b8 = (byte) (b7 + 1);
                byte b9 = (byte) (-b7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, packedPositionChild, c2, -1969106284, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i7 = $10 + 75;
            $11 = i7 % 128;
        }
    }

    static {
        component2 = 0;
        ShareDataUIState();
        int i = equals + 39;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ErrorResp copy$default(ErrorResp errorResp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 117;
        int i4 = i3 % 128;
        component4 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = errorResp.ShareDataUIState;
            int i5 = i4 + 53;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = errorResp.component1;
        }
        if ((i & 4) != 0) {
            str3 = errorResp.copydefault;
        }
        return errorResp.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 75;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 91;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ErrorResp copy(String message, String errorCode, String errorSource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(errorSource, "");
        ErrorResp errorResp = new ErrorResp(message, errorCode, errorSource);
        int i2 = copy + 49;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return errorResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 27;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResp)) {
            int i4 = i2 + 57;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ErrorResp errorResp = (ErrorResp) other;
        if (Intrinsics.areEqual(this.ShareDataUIState, errorResp.ShareDataUIState)) {
            return !(Intrinsics.areEqual(this.component1, errorResp.component1) ^ true) && Intrinsics.areEqual(this.copydefault, errorResp.copydefault);
        }
        int i6 = copy + 51;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 99;
        component4 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.ShareDataUIState.hashCode() - 9) * this.component1.hashCode()) % 99) * this.copydefault.hashCode() : (((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode();
        int i3 = component4 + 109;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ErrorResp(message=" + this.ShareDataUIState + ", errorCode=" + this.component1 + ", errorSource=" + this.copydefault + ")";
        int i2 = component4 + 31;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return str;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] component3(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.statement.resp.ErrorResp.component3(int, int):java.lang.Object[]");
    }

    static void ShareDataUIState() {
        component3 = 1534030048075401613L;
    }
}
