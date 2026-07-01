package com.huawei.digitalpayment.consumer.sfcui.utils;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.huawei.digitalpayment.consumer.base.util.AirTimeBalanceHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/BalanceUtils;", "", "<init>", "()V", "MIN_BALANCE", "", "MAX_BALANCE", "isAmountValid", "", "amount", "", "isAmountLessMin", "isAmountMoreMax", "minAmountResp", "", "isAirtimeAmountValid", "getUnit", "formatAmount", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceUtils {
    public static final int $stable = 0;
    public static final BalanceUtils INSTANCE = new BalanceUtils();
    public static final double MAX_BALANCE = 250000.0d;
    public static final double MIN_BALANCE = 1.0d;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private BalanceUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (java.lang.Float.parseFloat(r5) > java.lang.Float.parseFloat(r1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.copydefault + 99;
        com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.component3 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.component3 + 41;
        com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.copydefault = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isAmountValid(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.copydefault
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 == 0) goto L27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            com.huawei.digitalpayment.home.util.BalanceHelper r1 = com.huawei.digitalpayment.home.util.BalanceHelper.INSTANCE
            kotlinx.coroutines.flow.StateFlow r1 = r1.getBalance2()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.home.data.local.LocalBalance r1 = (com.huawei.digitalpayment.home.data.local.LocalBalance) r1
            java.lang.String r1 = r1.getBalance()
            if (r1 != 0) goto L46
            goto L3c
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            com.huawei.digitalpayment.home.util.BalanceHelper r1 = com.huawei.digitalpayment.home.util.BalanceHelper.INSTANCE
            kotlinx.coroutines.flow.StateFlow r1 = r1.getBalance2()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.home.data.local.LocalBalance r1 = (com.huawei.digitalpayment.home.data.local.LocalBalance) r1
            java.lang.String r1 = r1.getBalance()
            if (r1 != 0) goto L46
        L3c:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.component3
            int r5 = r5 + 41
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.copydefault = r1
            int r5 = r5 % r0
            return r2
        L46:
            float r5 = java.lang.Float.parseFloat(r5)
            float r1 = java.lang.Float.parseFloat(r1)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L5c
            int r5 = com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.copydefault
            int r5 = r5 + 99
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.component3 = r1
            int r5 = r5 % r0
            goto L5d
        L5c:
            r2 = 0
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.utils.BalanceUtils.isAmountValid(java.lang.String):boolean");
    }

    public final boolean isAmountLessMin(String amount) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        if (Double.parseDouble(amount) < 1.0d) {
            int i2 = component3;
            int i3 = i2 + 65;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        int i7 = component3 + 75;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    public final boolean isAmountMoreMax(String amount) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(amount, "");
            Double.parseDouble(amount);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(amount, "");
        if (Double.parseDouble(amount) > 250000.0d) {
            return true;
        }
        int i3 = component3 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final boolean isAmountLessMin(String amount, float minAmountResp) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(amount, "");
            Float.parseFloat(amount);
            throw null;
        }
        Intrinsics.checkNotNullParameter(amount, "");
        if (Float.parseFloat(amount) >= minAmountResp) {
            return false;
        }
        int i3 = copydefault + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final boolean isAirtimeAmountValid(String amount) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        String balance = AirTimeBalanceHelper.INSTANCE.getBalance().getValue().getBalance();
        if (balance != null) {
            return Float.parseFloat(amount) <= Float.parseFloat(balance);
        }
        int i4 = component3 + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final String getUnit() throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 67, (ViewConfiguration.getFadingEdgeLength() >> 16) + 33, (char) (TextUtils.getTrimmedLength("") + 19696), 518907119, false, "component3", null);
        }
        int i5 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 37, 30 - KeyEvent.keyCodeFromString(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 55511118, false, "component2", null);
        }
        int i6 = ((Field) objCopydefault2).getInt(null);
        long j = i6;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(36 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, (char) Color.red(0), 58536393, false, "component3", null);
        }
        int i7 = ((Field) objCopydefault3).getInt(null);
        long j2 = -754;
        long j3 = -1;
        long j4 = j3 ^ 29395300539162695L;
        long j5 = j4 | 763308153105041729L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (((long) 755) * 29395300539162695L) + (((long) (-753)) * 763308153105041729L) + (((j5 ^ j3) | ((j4 | jIdentityHashCode) ^ j3) | ((jIdentityHashCode | 763308153105041729L) ^ j3)) * j2);
        long j7 = (j5 | jIdentityHashCode) ^ j3;
        long j8 = jIdentityHashCode ^ j3;
        long j9 = j6 + (j2 * (j7 | ((j8 | 792632429536864583L) ^ j3))) + (((long) 754) * (j4 | j8));
        long j10 = j;
        int i8 = i7;
        int i9 = 0;
        while (true) {
            int i10 = 0;
            while (i10 != 8) {
                int i11 = component3 + 115;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    i = (((((int) (j10 << i10)) & 12125) >> (i8 >>> 74)) + (i8 + 78)) - i8;
                    i10 += 54;
                } else {
                    i = (((((int) (j10 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                    i10++;
                }
                i8 = i;
            }
            if (i9 != 0) {
                break;
            }
            int i12 = component3 + 15;
            copydefault = i12 % 128;
            i9 = i12 % 2 == 0 ? i9 + 123 : i9 + 1;
            j10 = j9;
        }
        if (i8 != i5) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (Process.myPid() >> 22), 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (19696 - ExpandableListView.getPackedPositionType(0L)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j11 = -1;
            long j12 = 0;
            long j13 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0, 0) + 43, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-1392439588, Long.valueOf(j13), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSizeAndState(0, 0, 0) + 56, (char) (ViewConfiguration.getEdgeSlop() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i6 / (((i6 - 1) * i6) % 2), 0).show();
                return "Ksh";
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return "Ksh";
    }

    private final String copydefault(String str) {
        NumberFormat numberFormat;
        Integer numValueOf;
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            numberFormat = NumberFormat.getInstance(Locale.US);
            numberFormat.setMaximumFractionDigits(3);
            numberFormat.setMinimumFractionDigits(4);
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } else {
            numberFormat = NumberFormat.getInstance(Locale.US);
            numberFormat.setMaximumFractionDigits(2);
            numberFormat.setMinimumFractionDigits(2);
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        }
        String str2 = numberFormat.format(numValueOf);
        Intrinsics.checkNotNull(str2);
        int i3 = copydefault + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    static {
        int i = component1 + 35;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
