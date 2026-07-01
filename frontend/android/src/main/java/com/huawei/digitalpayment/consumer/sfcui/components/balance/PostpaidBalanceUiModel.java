package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceUiModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceItem;", "billUsage", "", "creditLimit", "prepayment", "availableBalance", "billProgress", "", "dueDate", "outstandingBill", "hasOutstandingBill", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Z)V", "getBillUsage", "()Ljava/lang/String;", "getCreditLimit", "getPrepayment", "getAvailableBalance", "getBillProgress", "()F", "getDueDate", "getOutstandingBill", "getHasOutstandingBill", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpaidBalanceUiModel implements BalanceItem {
    public static final int $stable = 0;
    private static int ArtificialStackFrames = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 83 % 128;
    private static int toString;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final float component3;
    private final String component4;
    private final String copy;
    private final String copydefault;
    private final boolean getRequestBeneficiariesState;

    public PostpaidBalanceUiModel(String str, String str2, String str3, String str4, float f, String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.component1 = str;
        this.ShareDataUIState = str2;
        this.component4 = str3;
        this.copydefault = str4;
        this.component3 = f;
        this.component2 = str5;
        this.copy = str6;
        this.getRequestBeneficiariesState = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostpaidBalanceUiModel(String str, String str2, String str3, String str4, float f, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        float f2;
        boolean z2;
        if ((i & 1) != 0) {
            int i2 = ArtificialStackFrames + 23;
            toString = i2 % 128;
            int i3 = i2 % 2;
            str7 = "";
        } else {
            str7 = str;
        }
        if ((i & 2) != 0) {
            int i4 = ArtificialStackFrames + 9;
            toString = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str8 = "";
        } else {
            str8 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = ArtificialStackFrames + 35;
            toString = i7 % 128;
            if (i7 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str9 = "";
        } else {
            str9 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            str10 = "";
        } else {
            str10 = str4;
        }
        if ((i & 16) != 0) {
            int i9 = toString + 3;
            ArtificialStackFrames = i9 % 128;
            int i10 = i9 % 2;
            f2 = 0.0f;
        } else {
            f2 = f;
        }
        String str11 = (i & 32) == 0 ? str5 : "";
        String str12 = (i & 64) != 0 ? "Ksh.  0" : str6;
        if ((i & 128) != 0) {
            int i11 = toString + 63;
            ArtificialStackFrames = i11 % 128;
            int i12 = i11 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str7, str8, str9, str10, f2, str11, str12, z2);
    }

    public final String getBillUsage() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 15;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 23;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCreditLimit() {
        int i = 2 % 2;
        int i2 = toString + 13;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 23;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPrepayment() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 65;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 11;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAvailableBalance() {
        int i = 2 % 2;
        int i2 = toString + 77;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getBillProgress() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 19;
        toString = i2 % 128;
        int i3 = i2 % 2;
        float f = this.component3;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return f;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getOutstandingBill() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 69;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copy;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final boolean getHasOutstandingBill() {
        int i = 2 % 2;
        int i2 = toString + 43;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() throws Throwable {
        int i = 2 % 2;
        String str = this.component2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - KeyEvent.keyCodeFromString(""), TextUtils.getTrimmedLength("") + 33, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19696), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.indexOf("", "", 0), 30 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, KeyEvent.normalizeMetaState(0) + 30, (char) View.getDefaultSize(0, 0), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 764;
        long j3 = -1;
        long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j3;
        long j4 = (jIdentityHashCode | 1657925711252295879L) ^ j3;
        long j5 = j;
        long j6 = ((j3 ^ 1657925711252295879L) | (-865222257608091455L)) ^ j3;
        long j7 = (((long) 765) * 1657925711252295879L) + (((long) (-1527)) * (-865222257608091455L)) + ((j4 | (-865222257608091455L)) * j2) + (((long) (-1528)) * (j6 | ((jIdentityHashCode | (-865222257608091455L)) ^ j3))) + (j2 * (j6 | (j3 ^ ((j3 ^ (-865222257608091455L)) | 1657925711252295879L)) | j4));
        int i5 = ArtificialStackFrames + 27;
        toString = i5 % 128;
        int i6 = 2;
        int i7 = i5 % 2;
        int i8 = 0;
        while (true) {
            int i9 = 0;
            while (i9 != 8) {
                int i10 = toString + 67;
                ArtificialStackFrames = i10 % 128;
                int i11 = i10 % i6;
                i4 = (((((int) (j5 >> i9)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                i9++;
                i6 = 2;
            }
            if (i8 != 0) {
                break;
            }
            int i12 = toString + 115;
            ArtificialStackFrames = i12 % 128;
            int i13 = i12 % 2;
            i8++;
            j5 = j7;
            i6 = 2;
        }
        if (i4 == i2) {
            return str;
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 68, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 19696), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j8 = -1;
        long j9 = 0;
        long j10 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 6618, 42 - Color.red(0), (char) View.getDefaultSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {-154072045, Long.valueOf(j10), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6562, Drawable.resolveOpacity(0, 0) + 56, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault6).invoke(objInvoke, objArr);
            throw new RuntimeException(String.valueOf(i3));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        if (83 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PostpaidBalanceUiModel() {
        this(null, null, null, null, 0.0f, null, null, false, 255, null);
    }

    public static PostpaidBalanceUiModel copy$default(PostpaidBalanceUiModel postpaidBalanceUiModel, String str, String str2, String str3, String str4, float f, String str5, String str6, boolean z, int i, Object obj) {
        String str7;
        float f2;
        String str8;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str7 = postpaidBalanceUiModel.component1;
            int i3 = toString + 33;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 2;
            }
        } else {
            str7 = str;
        }
        String str9 = (i & 2) != 0 ? postpaidBalanceUiModel.ShareDataUIState : str2;
        String str10 = (i & 4) != 0 ? postpaidBalanceUiModel.component4 : str3;
        String str11 = (i & 8) != 0 ? postpaidBalanceUiModel.copydefault : str4;
        if ((i & 16) != 0) {
            int i5 = toString + 71;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            f2 = postpaidBalanceUiModel.component3;
        } else {
            f2 = f;
        }
        String str12 = (i & 32) != 0 ? postpaidBalanceUiModel.component2 : str5;
        if ((i & 64) != 0) {
            str8 = postpaidBalanceUiModel.copy;
            int i7 = ArtificialStackFrames + 99;
            toString = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str8 = str6;
        }
        if ((i & 128) != 0) {
            int i9 = ArtificialStackFrames + 49;
            toString = i9 % 128;
            if (i9 % 2 != 0) {
                z2 = postpaidBalanceUiModel.getRequestBeneficiariesState;
                int i10 = 61 / 0;
            } else {
                z2 = postpaidBalanceUiModel.getRequestBeneficiariesState;
            }
        } else {
            z2 = z;
        }
        return postpaidBalanceUiModel.copy(str7, str9, str10, str11, f2, str12, str8, z2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 119;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component1;
            int i4 = 43 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 53;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 57;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 21;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 103;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 65;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component5() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 87;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        float f = this.component3;
        int i5 = i2 + 83;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return f;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 99;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 45;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 119;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i3 + 67;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PostpaidBalanceUiModel copy(String billUsage, String creditLimit, String prepayment, String availableBalance, float billProgress, String dueDate, String outstandingBill, boolean hasOutstandingBill) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(billUsage, "");
        Intrinsics.checkNotNullParameter(creditLimit, "");
        Intrinsics.checkNotNullParameter(prepayment, "");
        Intrinsics.checkNotNullParameter(availableBalance, "");
        Intrinsics.checkNotNullParameter(dueDate, "");
        Intrinsics.checkNotNullParameter(outstandingBill, "");
        PostpaidBalanceUiModel postpaidBalanceUiModel = new PostpaidBalanceUiModel(billUsage, creditLimit, prepayment, availableBalance, billProgress, dueDate, outstandingBill, hasOutstandingBill);
        int i2 = ArtificialStackFrames + 43;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return postpaidBalanceUiModel;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = toString + 33;
            ArtificialStackFrames = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PostpaidBalanceUiModel)) {
            int i4 = toString + 117;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        PostpaidBalanceUiModel postpaidBalanceUiModel = (PostpaidBalanceUiModel) other;
        if (!Intrinsics.areEqual(this.component1, postpaidBalanceUiModel.component1)) {
            int i6 = toString + 43;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, postpaidBalanceUiModel.ShareDataUIState)) {
            int i8 = toString + 11;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, postpaidBalanceUiModel.component4) || !Intrinsics.areEqual(this.copydefault, postpaidBalanceUiModel.copydefault)) {
            return false;
        }
        if (Float.compare(this.component3, postpaidBalanceUiModel.component3) != 0) {
            int i10 = ArtificialStackFrames + 45;
            toString = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, postpaidBalanceUiModel.component2)) {
            return Intrinsics.areEqual(this.copy, postpaidBalanceUiModel.copy) && this.getRequestBeneficiariesState == postpaidBalanceUiModel.getRequestBeneficiariesState;
        }
        int i12 = toString + 97;
        ArtificialStackFrames = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 29;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.component1.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Float.hashCode(this.component3)) * 31) + this.component2.hashCode()) * 31) + this.copy.hashCode()) * 31) + Boolean.hashCode(this.getRequestBeneficiariesState);
        int i4 = toString + 75;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostpaidBalanceUiModel(billUsage=" + this.component1 + ", creditLimit=" + this.ShareDataUIState + ", prepayment=" + this.component4 + ", availableBalance=" + this.copydefault + ", billProgress=" + this.component3 + ", dueDate=" + this.component2 + ", outstandingBill=" + this.copy + ", hasOutstandingBill=" + this.getRequestBeneficiariesState + ")";
        int i2 = toString + 85;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
