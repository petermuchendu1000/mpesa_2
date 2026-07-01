package com.huawei.digitalpayment.consumer.zuriui.state;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getAvatar", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserUiState {
    public static final int $stable = 0;
    private static int ShareDataUIState = 11 % 128;
    private static int copy = 1;
    private static int copydefault;
    private static int getAsAtTimestamp;
    private final String component1;
    private final String component2;
    private final String component3;

    public UserUiState(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = str;
        this.component1 = str2;
        this.component2 = str3;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = copy + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 19;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 125;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 69;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final UserUiState copy(String id, String name, String avatar) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, (char) (19696 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 518907119, false, "component3", null);
        }
        int i3 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 30 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 55511118, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault2).getInt(null);
        long j = i4;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, (char) Color.blue(0), 58536393, false, "component3", null);
        }
        int i5 = ((Field) objCopydefault3).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 3286739017503285460L;
        long j4 = j;
        long jIdentityHashCode = (((long) System.identityHashCode(this)) | (-2494035563859081036L)) ^ j2;
        long j5 = (((long) (-109)) * 3286739017503285460L) + (((long) 111) * (-2494035563859081036L)) + (((long) (-220)) * (j3 | jIdentityHashCode)) + (((long) 220) * (((-144123988463900428L) ^ j2) | jIdentityHashCode)) + (((long) 110) * ((((j2 ^ (-2494035563859081036L)) | 3286739017503285460L) ^ j2) | ((j3 | (-2494035563859081036L)) ^ j2)));
        int i6 = 0;
        while (true) {
            int i7 = 0;
            while (i7 != 8) {
                int i8 = getAsAtTimestamp + 77;
                copy = i8 % 128;
                if (i8 % 2 == 0) {
                    i = (((((int) (j4 >>> i7)) & 14874) % (i5 / 121)) >> (i5 - 2)) + i5;
                    i7 += 22;
                } else {
                    i = (((((int) (j4 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                    i7++;
                }
                i5 = i;
            }
            if (i6 != 0) {
                break;
            }
            i6++;
            j4 = j5;
        }
        if (i5 != i3) {
            int i9 = copy + 107;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getTouchSlop() >> 8) + 33, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j6 = -1;
            long j7 = 0;
            long j8 = (((long) (i4 ^ i3)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))) | (((long) 1) << 32) | (j7 - ((j7 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {1014857870, Long.valueOf(j8), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 56, (char) (Process.myTid() >> 22), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                int[] iArr = new int[i4];
                int i11 = i4 - 1;
                iArr[i11] = 1;
                Toast.makeText((Context) null, iArr[((i4 * i11) % 2) - 1], 1).show();
                int i12 = copy + 37;
                getAsAtTimestamp = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return new UserUiState(id, name, avatar);
    }

    static {
        if (11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static UserUiState copy$default(UserUiState userUiState, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 9;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = userUiState.component3;
        }
        if ((i & 2) != 0) {
            str2 = userUiState.component1;
            int i5 = i4 + 51;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
        }
        if ((i & 4) != 0) {
            int i7 = getAsAtTimestamp + 11;
            copy = i7 % 128;
            int i8 = i7 % 2;
            str3 = userUiState.component2;
        }
        return userUiState.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 19;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 59;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 43;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 15;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 69;
            getAsAtTimestamp = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof UserUiState)) {
            return false;
        }
        UserUiState userUiState = (UserUiState) other;
        if (!Intrinsics.areEqual(this.component3, userUiState.component3)) {
            int i3 = copy + 57;
            int i4 = i3 % 128;
            getAsAtTimestamp = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 115;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, userUiState.component1)) {
            int i8 = copy + 117;
            getAsAtTimestamp = i8 % 128;
            return i8 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.component2, userUiState.component2)) {
            return true;
        }
        int i9 = getAsAtTimestamp + 105;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copy + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.component3.hashCode();
        int iHashCode3 = this.component1.hashCode();
        String str = this.component2;
        if (str == null) {
            int i4 = getAsAtTimestamp + 91;
            copy = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserUiState(id=" + this.component3 + ", name=" + this.component1 + ", avatar=" + this.component2 + ')';
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
