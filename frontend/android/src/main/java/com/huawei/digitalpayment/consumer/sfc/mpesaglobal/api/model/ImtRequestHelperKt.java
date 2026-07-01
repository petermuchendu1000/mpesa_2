package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import j$.time.Instant;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.IResultReceiver2Default;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"generateImtRequestHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceRequestHeader;", "operationName", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImtRequestHelperKt {
    private static final byte[] $$a = {20, 103, 109, TarHeader.LF_BLK};
    private static final int $$b = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component3 = 0;
    private static int component2 = 1;
    private static char[] ShareDataUIState = {50877, 7214, 29581, 18733, 44234, 33712, 55557, 15600, 4675, 26912, 19654, 41583, 63939, 56490, 12805, 2555, 28495, 16957, 39296, 65394, 53963, 10680, 3857, 25337, 47170, 40823, 62107, 51316, 12244, 686, 22537, 49138, 38235, 59603, 53230, 9488, 30948, 24134, 46385, 34958, 60968, 50635, 6311, 32261, 21997, 43852, 36450, 58797, 15201, 7903, 30135, 19218, 44753, 33882, 56122, 16017, 5247, 27595, 20149, 42042, 64505, 53577, 13365, 2953, 24951, 17653, 39513, 61799, 54413, 10859, 487, 25781, 47619, 37352, 63324, 51758, 8654, 1852, 23176, 45566, 38730, 60085, 49269, 10027, 31366, 20592, 47046, 35513, 57367, 51189, 7531, 28706, 22420, 44393, 32980, 59322, 15626, 4232, 30307, 19951, 41123, 34312, 56806, 13123, 5671, 28124};
    private static long copydefault = -1319500341840914711L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = 122 - r8
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtRequestHelperKt.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtRequestHelperKt.$$c(byte, short, byte):java.lang.String");
    }

    public static final ImtServiceRequestHeader generateImtRequestHeader(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        ImtServiceRequestHeader imtServiceRequestHeader = new ImtServiceRequestHeader(string, Instant.now().toEpochMilli(), str, 1, ImtConstants.SOURCE_SYSTEM);
        int i2 = component3 + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return imtServiceRequestHeader;
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 1758, 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1159210934, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(copydefault), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 3609, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, (char) (7219 - AndroidCharacter.getMirror('0')), 1951385784, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4013, 24 - View.resolveSize(0, 0), (char) (27761 - (ViewConfiguration.getTouchSlop() >> 8)), -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getTrimmedLength(""), 23 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Color.red(0) + 27761), -1529629956, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i7 = $10 + 111;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 % 2;
            }
        }
        objArr[0] = new String(cArr);
    }

    public static void component1() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Member[] memberArr = IResultReceiver2Default.ShareDataUIState;
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 106, (char) (TextUtils.getCapsMode("", 0, 0) + 51880), objArr);
        memberArr[0] = Class.forName(((String) objArr[0]).intern()).getDeclaredField("component2");
        int i4 = component3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
