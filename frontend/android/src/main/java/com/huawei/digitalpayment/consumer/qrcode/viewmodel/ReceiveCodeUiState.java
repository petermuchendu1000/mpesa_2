package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.qrcode.bean.ScanQrResultResp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0083\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/viewmodel/ReceiveCodeUiState;", "", "loading", "", "showName", "", "amount", "note", "avatar", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "qrcode", "currency", "unit", "scanQrResults", "", "Lcom/huawei/digitalpayment/consumer/qrcode/bean/ScanQrResultResp;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/common/exception/BaseException;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLoading", "()Z", "getShowName", "()Ljava/lang/String;", "getAmount", "getNote", "getAvatar", "getException", "()Lcom/huawei/common/exception/BaseException;", "getQrcode", "setQrcode", "(Ljava/lang/String;)V", "getCurrency", "getUnit", "getScanQrResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReceiveCodeUiState {
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private String component4;
    private final String copy;
    private final BaseException copydefault;
    private final String equals;
    private final String getAsAtTimestamp;
    private final List<ScanQrResultResp> getRequestBeneficiariesState;

    public ReceiveCodeUiState(boolean z, String str, String str2, String str3, String str4, BaseException baseException, String str5, String str6, String str7, List<ScanQrResultResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = z;
        this.getAsAtTimestamp = str;
        this.component3 = str2;
        this.equals = str3;
        this.ShareDataUIState = str4;
        this.copydefault = baseException;
        this.component4 = str5;
        this.component2 = str6;
        this.copy = str7;
        this.getRequestBeneficiariesState = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReceiveCodeUiState(boolean z, String str, String str2, String str3, String str4, BaseException baseException, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        List list2 = null;
        if ((i & 2) != 0) {
            int i3 = toString + 67;
            getSponsorBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str8 = "";
        } else {
            str8 = str;
        }
        String str13 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str9 = null;
        } else {
            str9 = str3;
        }
        String str14 = (i & 16) != 0 ? null : str4;
        BaseException baseException2 = (i & 32) != 0 ? null : baseException;
        if ((i & 64) != 0) {
            int i5 = 2 % 2;
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i & 128) != 0) {
            int i6 = 2 % 2;
            str11 = null;
        } else {
            str11 = str6;
        }
        if ((i & 256) != 0) {
            int i7 = toString + 95;
            getSponsorBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str12 = null;
        } else {
            str12 = str7;
        }
        if ((i & 512) != 0) {
            int i8 = getSponsorBeneficiariesState + 73;
            toString = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            list2 = list;
        }
        this(z2, str8, str13, str9, str14, baseException2, str10, str11, str12, list2);
    }

    public final boolean getLoading() {
        boolean z;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 63;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            z = this.component1;
            int i4 = 22 / 0;
        } else {
            z = this.component1;
        }
        int i5 = i3 + 53;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getShowName() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 73;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 85;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = toString + 115;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 5;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return str;
    }

    public final String getNote() {
        int i = 2 % 2;
        int i2 = toString + 99;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 97;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 15;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 71;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseException baseException = this.copydefault;
        int i4 = i2 + 85;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return baseException;
    }

    public final String getQrcode() {
        int i = 2 % 2;
        int i2 = toString + 57;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 49;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setQrcode(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        this.component4 = str;
        int i5 = i3 + 43;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 53;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 91;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 75;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 61;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<ScanQrResultResp> getScanQrResults() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 121;
        toString = i2 % 128;
        int i3 = i2 % 2;
        List<ScanQrResultResp> list = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return list;
    }

    public final String component9() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 67, TextUtils.getTrimmedLength("") + 33, (char) (19696 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 37, 30 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.MeasureSpec.getSize(0), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.normalizeMetaState(0), 30 - TextUtils.getTrimmedLength(""), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 623;
        long j3 = -1;
        long j4 = j3 ^ 477023215577811050L;
        long j5 = j4 | 315680238066393374L;
        long jMyTid = Process.myTid();
        long j6 = (((long) 624) * 315680238066393374L) + (((long) (-622)) * 477023215577811050L) + (((j5 | jMyTid) ^ j3) * j2) + (((long) (-623)) * ((jMyTid ^ j3) | (((j3 ^ 315680238066393374L) | 477023215577811050L) ^ j3))) + (j2 * ((j5 ^ j3) | ((j4 | jMyTid) ^ j3) | (j3 ^ (jMyTid | 315680238066393374L))));
        long j7 = j;
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (i6 != 8) {
                int i7 = getSponsorBeneficiariesState + 75;
                int i8 = i7 % 128;
                toString = i8;
                int i9 = i7 % 2;
                i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                i6++;
                int i10 = i8 + 21;
                getSponsorBeneficiariesState = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 5 / 3;
                }
            }
            if (i5 != 0) {
                break;
            }
            int i12 = toString + 23;
            getSponsorBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            i5++;
            j7 = j6;
        }
        if (i4 == i2) {
            return this.copy;
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 66, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, (char) (19696 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j8 = -1;
        long j9 = ((long) (i2 ^ i3)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
        long j10 = 0;
        long j11 = (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32)) | j9;
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((-16770598) - Color.rgb(0, 0, 0), (Process.myPid() >> 22) + 42, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {1088102177, Long.valueOf(j11), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 6562, 56 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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

    public ReceiveCodeUiState() {
        this(false, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ReceiveCodeUiState copy$default(ReceiveCodeUiState receiveCodeUiState, boolean z, String str, String str2, String str3, String str4, BaseException baseException, String str5, String str6, String str7, List list, int i, Object obj) {
        String str8;
        String str9;
        String str10;
        BaseException baseException2;
        List list2;
        int i2 = 2 % 2;
        boolean z2 = (i & 1) != 0 ? receiveCodeUiState.component1 : z;
        if ((i & 2) != 0) {
            int i3 = getSponsorBeneficiariesState + 77;
            toString = i3 % 128;
            if (i3 % 2 == 0) {
                str8 = receiveCodeUiState.getAsAtTimestamp;
                int i4 = 98 / 0;
            } else {
                str8 = receiveCodeUiState.getAsAtTimestamp;
            }
        } else {
            str8 = str;
        }
        String str11 = (i & 4) != 0 ? receiveCodeUiState.component3 : str2;
        if ((i & 8) != 0) {
            int i5 = toString + 63;
            getSponsorBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                str9 = receiveCodeUiState.equals;
                int i6 = 21 / 0;
            } else {
                str9 = receiveCodeUiState.equals;
            }
        } else {
            str9 = str3;
        }
        if ((i & 16) != 0) {
            str10 = receiveCodeUiState.ShareDataUIState;
            int i7 = getSponsorBeneficiariesState + 57;
            toString = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str10 = str4;
        }
        if ((i & 32) != 0) {
            int i9 = getSponsorBeneficiariesState + 25;
            toString = i9 % 128;
            if (i9 % 2 == 0) {
                BaseException baseException3 = receiveCodeUiState.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            baseException2 = receiveCodeUiState.copydefault;
        } else {
            baseException2 = baseException;
        }
        String str12 = (i & 64) != 0 ? receiveCodeUiState.component4 : str5;
        String str13 = (i & 128) != 0 ? receiveCodeUiState.component2 : str6;
        String str14 = (i & 256) != 0 ? receiveCodeUiState.copy : str7;
        if ((i & 512) != 0) {
            int i10 = toString + 49;
            getSponsorBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            list2 = receiveCodeUiState.getRequestBeneficiariesState;
        } else {
            list2 = list;
        }
        return receiveCodeUiState.copy(z2, str8, str11, str9, str10, baseException2, str12, str13, str14, list2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 51;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 87;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<ScanQrResultResp> component10() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 11;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<ScanQrResultResp> list = this.getRequestBeneficiariesState;
        int i4 = i3 + 111;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = toString + 87;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 35;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 107;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 13;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.equals;
        int i4 = i2 + 77;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 49;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 57;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BaseException component6() {
        int i = 2 % 2;
        int i2 = toString + 61;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        BaseException baseException = this.copydefault;
        int i4 = i3 + 37;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return baseException;
        }
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 5;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 3;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString + 1;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 79;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    public final ReceiveCodeUiState copy(boolean loading, String showName, String amount, String note, String avatar, BaseException exception, String qrcode, String currency, String unit, List<ScanQrResultResp> scanQrResults) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(showName, "");
        ReceiveCodeUiState receiveCodeUiState = new ReceiveCodeUiState(loading, showName, amount, note, avatar, exception, qrcode, currency, unit, scanQrResults);
        int i2 = getSponsorBeneficiariesState + 79;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return receiveCodeUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = toString + 113;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiveCodeUiState)) {
            return false;
        }
        ReceiveCodeUiState receiveCodeUiState = (ReceiveCodeUiState) other;
        if (this.component1 != receiveCodeUiState.component1 || !Intrinsics.areEqual(this.getAsAtTimestamp, receiveCodeUiState.getAsAtTimestamp) || !Intrinsics.areEqual(this.component3, receiveCodeUiState.component3) || !Intrinsics.areEqual(this.equals, receiveCodeUiState.equals)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, receiveCodeUiState.ShareDataUIState)) {
            int i3 = getSponsorBeneficiariesState + 115;
            toString = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.copydefault, receiveCodeUiState.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, receiveCodeUiState.component4)) {
            int i4 = toString + 109;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, receiveCodeUiState.component2)) {
            if (!(!Intrinsics.areEqual(this.copy, receiveCodeUiState.copy))) {
                return Intrinsics.areEqual(this.getRequestBeneficiariesState, receiveCodeUiState.getRequestBeneficiariesState);
            }
            int i6 = getSponsorBeneficiariesState + 81;
            toString = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = Boolean.hashCode(this.component1);
        int iHashCode5 = this.getAsAtTimestamp.hashCode();
        String str = this.component3;
        if (str == null) {
            int i2 = getSponsorBeneficiariesState + 65;
            toString = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.equals;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ShareDataUIState;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        BaseException baseException = this.copydefault;
        int iHashCode8 = baseException == null ? 0 : baseException.hashCode();
        String str4 = this.component4;
        if (str4 == null) {
            int i3 = getSponsorBeneficiariesState + 57;
            toString = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.component2;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.copy;
        if (str6 == null) {
            int i5 = getSponsorBeneficiariesState + 15;
            toString = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        List<ScanQrResultResp> list = this.getRequestBeneficiariesState;
        return (((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReceiveCodeUiState(loading=" + this.component1 + ", showName=" + this.getAsAtTimestamp + ", amount=" + this.component3 + ", note=" + this.equals + ", avatar=" + this.ShareDataUIState + ", exception=" + this.copydefault + ", qrcode=" + this.component4 + ", currency=" + this.component2 + ", unit=" + this.copy + ", scanQrResults=" + this.getRequestBeneficiariesState + ")";
        int i2 = toString + 45;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
