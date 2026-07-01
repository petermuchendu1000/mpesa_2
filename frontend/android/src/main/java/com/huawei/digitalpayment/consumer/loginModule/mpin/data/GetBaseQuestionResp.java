package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.huawei.http.BaseResp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/GetBaseQuestionResp;", "Lcom/huawei/http/BaseResp;", "baseQuestions", "", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/BaseQuestionItem;", "<init>", "(Ljava/util/List;)V", "getBaseQuestions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetBaseQuestionResp extends BaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final List<BaseQuestionItem> baseQuestions;

    public final List<BaseQuestionItem> getBaseQuestions() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.baseQuestions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GetBaseQuestionResp(List<BaseQuestionItem> list) {
        this.baseQuestions = list;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        List<BaseQuestionItem> list = this.baseQuestions;
        StringBuilder sb = new StringBuilder("GetBaseQuestionResp(baseQuestions=");
        sb.append(list);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - TextUtils.getOffsetBefore("", 0), ImageFormat.getBitsPerPixel(0) + 34, (char) (19697 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 37, 30 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getCapsMode("", 0, 0), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 37, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 52;
        long j3 = -1;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j4 = j3 ^ (-1477740644148412146L);
        long j5 = j3 ^ 2270444097792616570L;
        long j6 = (((long) (-51)) * 2270444097792616570L) + (((long) 53) * (-1477740644148412146L)) + (((jIdentityHashCode | (-493720794322562L)) ^ j3) * j2) + (((long) (-52)) * (((j4 | jIdentityHashCode) ^ j3) | ((j4 | 2270444097792616570L) ^ j3) | ((jIdentityHashCode | 2270444097792616570L) ^ j3))) + (j2 * ((j3 ^ (j5 | (-1477740644148412146L))) | ((jIdentityHashCode | j5) ^ j3)));
        int i5 = 0;
        long j7 = j;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                int i7 = component3 + 39;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            int i9 = copydefault + 113;
            component3 = i9 % 128;
            i5 = i9 % 2 != 0 ? i5 + 51 : i5 + 1;
            j7 = j6;
        }
        if (i4 == i2) {
            sb.append(")");
            return sb.toString();
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 67, 33 - Color.argb(0, 0, 0, 0), (char) ((Process.myPid() >> 22) + 19696), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j8 = -1;
        long j9 = 0;
        long j10 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {389100749, Long.valueOf(j10), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6561, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) Color.green(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault6).invoke(objInvoke, objArr);
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GetBaseQuestionResp copy$default(GetBaseQuestionResp getBaseQuestionResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 37;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            List<BaseQuestionItem> list2 = getBaseQuestionResp.baseQuestions;
            int i8 = i6 + 125;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            list = list2;
        }
        GetBaseQuestionResp getBaseQuestionRespCopy = getBaseQuestionResp.copy(list);
        int i10 = copydefault + 117;
        component3 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 1 / 0;
        }
        return getBaseQuestionRespCopy;
    }

    public final List<BaseQuestionItem> component1() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        List<BaseQuestionItem> list = this.baseQuestions;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return list;
    }

    public final GetBaseQuestionResp copy(List<BaseQuestionItem> baseQuestions) {
        int i = 2 % 2;
        GetBaseQuestionResp getBaseQuestionResp = new GetBaseQuestionResp(baseQuestions);
        int i2 = component3 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return getBaseQuestionResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 39;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof GetBaseQuestionResp)) {
            int i7 = i2 + 117;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.baseQuestions, ((GetBaseQuestionResp) other).baseQuestions)) {
            return true;
        }
        int i9 = copydefault + 123;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 109;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp.copydefault
            int r2 = r1 + 65
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp.component3 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            java.util.List<com.huawei.digitalpayment.consumer.loginModule.mpin.data.BaseQuestionItem> r2 = r5.baseQuestions
            r4 = 8
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            java.util.List<com.huawei.digitalpayment.consumer.loginModule.mpin.data.BaseQuestionItem> r2 = r5.baseQuestions
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp.component3 = r2
            int r1 = r1 % r0
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.data.GetBaseQuestionResp.hashCode():int");
    }
}
