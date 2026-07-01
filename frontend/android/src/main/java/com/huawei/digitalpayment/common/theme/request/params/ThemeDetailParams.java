package com.huawei.digitalpayment.common.theme.request.params;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.huawei.http.BaseRequestParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "Lcom/huawei/http/BaseRequestParams;", "themeId", "", "themeVersion", "", "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getThemeId", "()Ljava/lang/String;", "getThemeVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInitiatorMsisdn", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeDetailParams extends BaseRequestParams {
    private static int component1 = 1;
    private static int component3;
    private final String initiatorMsisdn;
    private final String themeId;
    private final Integer themeVersion;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeDetailParams(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            num = null;
        }
        if ((i & 4) != 0) {
            int i4 = component3;
            int i5 = i4 + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 29;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str2 = null;
        }
        this(str, num, str2);
    }

    public final String getThemeId() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.themeId;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    public final Integer getThemeVersion() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.themeVersion;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getInitiatorMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.initiatorMsisdn;
            int i4 = 49 / 0;
        } else {
            str = this.initiatorMsisdn;
        }
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public ThemeDetailParams(String str, Integer num, String str2) {
        this.themeId = str;
        this.themeVersion = num;
        this.initiatorMsisdn = str2;
    }

    public final String component1() throws Throwable {
        int i;
        long j;
        long j2;
        int i2;
        String str;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = component3 + 11;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            str = this.themeId;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.keyCodeFromString("") + 33, (char) (19696 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 518907119, false, "component3", null);
            }
            i2 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 38, (ViewConfiguration.getLongPressTimeout() >> 16) + 30, (char) View.getDefaultSize(0, 0), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault2).getInt(null);
            j = i;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(36 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, (char) KeyEvent.getDeadChar(0, 0), 58536393, false, "component3", null);
            }
            i3 = ((Field) objCopydefault3).getInt(null);
            long j3 = -712;
            long j4 = -1;
            long j5 = j4 ^ (-3228855609436716424L);
            long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j6 = jMaxMemory ^ j4;
            long j7 = (j6 | 4021559063080920848L) ^ j4;
            j2 = (((long) (-711)) * 4021559063080920848L) + (((long) 713) * (-3228855609436716424L)) + ((((j5 | 4021559063080920848L) ^ j4) | j7) * j3) + (j3 * ((((j5 | j6) | 4021559063080920848L) ^ j4) | (j4 ^ ((-576461923915143304L) | jMaxMemory)))) + (((long) 712) * (j5 | j7));
            i4 = 1;
        } else {
            String str2 = this.themeId;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (19696 - View.MeasureSpec.getSize(0)), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 37, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (char) View.getDefaultSize(0, 0), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault5).getInt(null);
            j = i;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.MeasureSpec.getSize(0), 29 - TextUtils.lastIndexOf("", '0', 0), (char) KeyEvent.keyCodeFromString(""), 58536393, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault6).getInt(null);
            long j8 = 959;
            long j9 = -1;
            long j10 = j9 ^ (-1478871977743990281L);
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            long j11 = startElapsedRealtime ^ j9;
            j2 = (((long) 960) * 2271575431388194705L) + (((long) (-1917)) * (-1478871977743990281L)) + ((((j10 | j11) ^ j9) | ((startElapsedRealtime | 2271575431388194705L) ^ j9)) * j8) + (((long) (-959)) * j10) + (j8 * (((j10 | startElapsedRealtime) ^ j9) | ((j11 | 2271575431388194705L) ^ j9)));
            i2 = i7;
            str = str2;
            i3 = i8;
            i4 = 0;
        }
        while (true) {
            for (int i9 = 0; i9 != 8; i9++) {
                i3 = (((((int) (j >> i9)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j2;
        }
        if (i3 == i2) {
            return str;
        }
        int i10 = component3 + 109;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault7 == null) {
            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(67 - KeyEvent.normalizeMetaState(0), 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (19696 - View.resolveSizeAndState(0, 0, 0)), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault7).get(null);
        long j12 = -1;
        long j13 = 0;
        long j14 = (((long) (i ^ i2)) & ((((long) 0) << 32) | (j12 - ((j12 >> 63) << 32)))) | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
        try {
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6617, View.MeasureSpec.getSize(0) + 42, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
            Object[] objArr = {-444728544, Long.valueOf(j14), obj, null, false, false};
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.red(0), 55 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault9).invoke(objInvoke, objArr);
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public ThemeDetailParams() {
        this(null, null, null, 7, null);
    }

    public static ThemeDetailParams copy$default(ThemeDetailParams themeDetailParams, String str, Integer num, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 121;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = themeDetailParams.themeId;
        }
        if ((i & 2) != 0) {
            num = themeDetailParams.themeVersion;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 109;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            str2 = themeDetailParams.initiatorMsisdn;
            int i8 = i6 + 17;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        return themeDetailParams.copy(str, num, str2);
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.themeVersion;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorMsisdn;
        }
        throw null;
    }

    public final ThemeDetailParams copy(String themeId, Integer themeVersion, String initiatorMsisdn) {
        int i = 2 % 2;
        ThemeDetailParams themeDetailParams = new ThemeDetailParams(themeId, themeVersion, initiatorMsisdn);
        int i2 = component1 + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return themeDetailParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 27;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof ThemeDetailParams)) {
            int i7 = i4 + 47;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ThemeDetailParams themeDetailParams = (ThemeDetailParams) other;
        if (!Intrinsics.areEqual(this.themeId, themeDetailParams.themeId) || (!Intrinsics.areEqual(this.themeVersion, themeDetailParams.themeVersion))) {
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorMsisdn, themeDetailParams.initiatorMsisdn)) {
            return true;
        }
        int i9 = component3 + 19;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int iHashCode3 = 0;
        if (i3 % 2 != 0 ? (str = this.themeId) != null : (str = this.themeId) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 95;
            int i5 = i4 % 128;
            component1 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 57;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        }
        Integer num = this.themeVersion;
        if (num == null) {
            int i9 = component3 + 61;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str2 = this.initiatorMsisdn;
        if (str2 == null) {
            int i11 = component3 + 109;
            component1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode3 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemeDetailParams(themeId=" + this.themeId + ", themeVersion=" + this.themeVersion + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component1 + 87;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
