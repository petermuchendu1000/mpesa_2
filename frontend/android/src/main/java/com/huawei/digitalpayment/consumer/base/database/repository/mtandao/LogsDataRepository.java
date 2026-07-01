package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.LogsDataDAO;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.LogsData;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/LogsDataRepository;", "", "logsDataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/LogsDataDAO;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/LogsDataDAO;)V", "checksentlogs", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/LogsData;", "insert", "", "logsData", "update", "updateLogStatus", "datasessionid", "", "delete", "deleteAllLogsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogsDataRepository {
    private final LogsDataDAO component1;
    private static final byte[] $$c = {46, -35, 45, 111};
    private static final int $$d = 142;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {69, -38, -90, 81, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$b = 181;
    private static int component3 = 0;
    private static int component2 = 1;
    private static long copydefault = 1306889566506128166L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository.$$c
            int r8 = r8 * 4
            int r8 = r8 + 103
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository.$$e(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 99
            int r7 = r7 * 7
            int r0 = r7 + 4
            int r5 = r5 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository.b(byte, short, short, java.lang.Object[]):void");
    }

    @Inject
    public LogsDataRepository(LogsDataDAO logsDataDAO) {
        Intrinsics.checkNotNullParameter(logsDataDAO, "");
        this.component1 = logsDataDAO;
    }

    public final List<LogsData> checksentlogs() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<LogsData> allLogsData = this.component1.getAllLogsData();
        int i4 = component3 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return allLogsData;
    }

    public final void insert(LogsData logsData) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(logsData, "");
            this.component1.insertLogsData(logsData);
        } else {
            Intrinsics.checkNotNullParameter(logsData, "");
            this.component1.insertLogsData(logsData);
            int i3 = 76 / 0;
        }
    }

    public final void update(LogsData logsData) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(logsData, "");
            this.component1.updateLogsData(logsData);
            throw null;
        }
        Intrinsics.checkNotNullParameter(logsData, "");
        this.component1.updateLogsData(logsData);
        int i3 = component2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void updateLogStatus(String datasessionid) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(datasessionid, "");
            this.component1.updateLogSentStatus(datasessionid);
        } else {
            Intrinsics.checkNotNullParameter(datasessionid, "");
            this.component1.updateLogSentStatus(datasessionid);
            int i3 = 55 / 0;
        }
    }

    public final void delete(String datasessionid) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(datasessionid, "");
        this.component1.deleteLogsData(datasessionid);
        int i4 = component2 + 117;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public final Object deleteAllLogsData(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1.deleteAllLogsData(continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objDeleteAllLogsData = this.component1.deleteAllLogsData(continuation);
        if (objDeleteAllLogsData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i3 = component2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return objDeleteAllLogsData;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 49;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - TextUtils.lastIndexOf("", '0', 0, 0), 34 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - View.MeasureSpec.getSize(0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51269), -1883291598, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 47;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x090c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] copydefault(java.lang.Class r30, int r31, int r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository.copydefault(java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
