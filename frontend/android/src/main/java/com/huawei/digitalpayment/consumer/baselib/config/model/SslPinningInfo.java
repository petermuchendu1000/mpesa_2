package com.huawei.digitalpayment.consumer.baselib.config.model;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/SslPinningInfo;", "", "domain", "", "hash", "algorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "getHash", "setHash", "getAlgorithm", "setAlgorithm", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SslPinningInfo {
    private static int component1 = 0;
    private static int copydefault = 1;
    private String ShareDataUIState;
    private String component2;
    private String component3;

    public SslPinningInfo(String str, String str2, String str3) {
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component2 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SslPinningInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = component1 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 53;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 5;
            } else {
                int i7 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getDomain() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 65 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDomain(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = str;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getHash() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setHash(String str) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.component3 = str;
        int i5 = i3 + 73;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
    }

    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public final void setAlgorithm(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.component2 = str;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String component2() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(68 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, (char) (19696 - KeyEvent.normalizeMetaState(0)), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 37, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, View.resolveSize(0, 0) + 30, (char) TextUtils.getOffsetBefore("", 0), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 69;
        long j3 = -1;
        long j4 = j3 ^ 4352935518628003107L;
        long j5 = j3 ^ (-3560232064983798683L);
        long startUptimeMillis = (int) Process.getStartUptimeMillis();
        long j6 = (((long) 70) * 4352935518628003107L) + (((long) (-68)) * (-3560232064983798683L)) + (((((j4 | j5) | startUptimeMillis) ^ j3) | (((-72132571975123609L) | startUptimeMillis) ^ j3)) * j2) + (((long) (-69)) * (((j4 | (-3560232064983798683L)) ^ j3) | ((j4 | startUptimeMillis) ^ j3) | ((startUptimeMillis | (-3560232064983798683L)) ^ j3))) + (j2 * ((j5 | 4352935518628003107L) ^ j3));
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            int i7 = copydefault + 107;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            j = j6;
        }
        if (i4 != i2) {
            int i9 = copydefault + 105;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 67, 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (19695 - MotionEvent.axisFromString("")), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = i3 ^ i2;
            long j8 = -1;
            long j9 = 0;
            long j10 = (j7 & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.getDeadChar(0, 0), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-1279624054, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 6562, 56 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                int[] iArr = new int[i3];
                int i11 = i3 - 1;
                iArr[i11] = 1;
                Toast.makeText((Context) null, iArr[((i11 * i3) % 2) - 1], 1).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.component3;
    }

    public SslPinningInfo() {
        this(null, null, null, 7, null);
    }

    public static SslPinningInfo copy$default(SslPinningInfo sslPinningInfo, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = sslPinningInfo.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = sslPinningInfo.component3;
            int i3 = component1 + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 41;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = sslPinningInfo.component2;
                throw null;
            }
            str3 = sslPinningInfo.component2;
        }
        return sslPinningInfo.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return str;
    }

    public final SslPinningInfo copy(String domain, String hash, String algorithm) {
        int i = 2 % 2;
        SslPinningInfo sslPinningInfo = new SslPinningInfo(domain, hash, algorithm);
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return sslPinningInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SslPinningInfo)) {
            return false;
        }
        SslPinningInfo sslPinningInfo = (SslPinningInfo) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, sslPinningInfo.ShareDataUIState)) {
            int i4 = copydefault + 23;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, sslPinningInfo.component3)) {
            int i6 = copydefault + 65;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, sslPinningInfo.component2)) {
            return false;
        }
        int i8 = component1 + 49;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.ShareDataUIState;
        if (str == null) {
            int i2 = component1 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.component3;
        if (str2 == null) {
            int i4 = copydefault + 3;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.component2;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SslPinningInfo(domain=" + this.ShareDataUIState + ", hash=" + this.component3 + ", algorithm=" + this.component2 + ")";
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
