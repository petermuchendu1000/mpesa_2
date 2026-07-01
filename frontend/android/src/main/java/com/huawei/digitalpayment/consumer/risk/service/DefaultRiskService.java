package com.huawei.digitalpayment.consumer.risk.service;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.risk.ui.CommonRiskActivity;
import com.huawei.digitalpayment.consumer.service.IRiskService;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/service/DefaultRiskService;", "Lcom/huawei/digitalpayment/consumer/service/IRiskService;", "<init>", "()V", "startProcess", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultRiskService implements IRiskService {
    private static final byte[] $$c = {9, 8, 112, 107};
    private static final int $$d = 255;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT, -6, 5, -3};
    private static final int $$b = 170;
    private static int component3 = 0;
    private static int component2 = 1;
    private static int ShareDataUIState = -890926367;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r6, short r7, byte r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 65 - r7
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.risk.service.DefaultRiskService.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.service.DefaultRiskService.$$e(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.risk.service.DefaultRiskService.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + 6
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.service.DefaultRiskService.b(short, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public void startProcess(Bundle bundle) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IRiskService.DefaultImpls.startProcess(this, bundle);
        int i4 = component2 + 13;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void startProcess(Bundle bundle, ApiCallback<Bundle> apiCallback) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        IRiskService.DefaultImpls.startProcess(this, bundle, apiCallback);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void startProcess(Activity activity, Bundle bundle, ApiCallback<Bundle> callback) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        CommonRiskActivity.INSTANCE.setCallback(callback);
        RouteUtils.routeWithExecute(activity, RoutePathConstants.COMMON_RISK, bundle);
        int i4 = component2 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $11 + 33;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3785 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 38 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (26860 - Color.green(0)), 2015799920, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7406, 16 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
            int i10 = $10 + 29;
            $11 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 16, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] ShareDataUIState(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.risk.service.DefaultRiskService.ShareDataUIState(int, int):java.lang.Object[]");
    }
}
