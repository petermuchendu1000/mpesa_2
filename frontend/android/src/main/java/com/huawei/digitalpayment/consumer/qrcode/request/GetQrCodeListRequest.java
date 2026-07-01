package com.huawei.digitalpayment.consumer.qrcode.request;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.huawei.digitalpayment.consumer.webview.interaction.function.StartAaPay;
import com.huawei.http.BaseRequestParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/request/GetQrCodeListRequest;", "Lcom/huawei/http/BaseRequestParams;", "amount", "", "entrance", StartAaPay.KEY_NOTES, "qrGroupId", "currency", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getEntrance", "getNotes", "getQrGroupId", "getCurrency", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetQrCodeListRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int component2 = 1;
    private final String amount;
    private final String currency;
    private final String entrance;
    private final String notes;
    private final String qrGroupId;
    private final String unit;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetQrCodeListRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i2 = component1 + 71;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str7 = "";
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            int i4 = component1 + 69;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str8 = "";
        } else {
            str8 = str6;
        }
        this(str, str2, str3, str9, str7, str8);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEntrance() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.entrance;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getNotes() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.notes;
            int i4 = 97 / 0;
        } else {
            str = this.notes;
        }
        int i5 = i2 + 45;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getQrGroupId() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.qrGroupId;
            int i4 = 59 / 0;
        } else {
            str = this.qrGroupId;
        }
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public GetQrCodeListRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.entrance = str2;
        this.notes = str3;
        this.qrGroupId = str4;
        this.currency = str5;
        this.unit = str6;
    }

    public final String getCurrency() throws Throwable {
        int i;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = component2 + 107;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(68 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 33 - View.MeasureSpec.getSize(0), (char) (19695 - ImageFormat.getBitsPerPixel(0)), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, 29 - ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 55511118, false, "component2", null);
            }
            i3 = ((Field) objCopydefault2).getInt(null);
            i2 = i7;
            j2 = i3;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getCapsMode("", 0, 0), 29 - ExpandableListView.getPackedPositionChild(0L), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 58536393, false, "component3", null);
            }
            i = ((Field) objCopydefault3).getInt(null);
            long j3 = 253;
            long j4 = (j3 * 1289361897534649872L) + (j3 * (-496658443890445448L));
            long j5 = -252;
            long j6 = -1;
            long j7 = j6 ^ (-496658443890445448L);
            long j8 = ((j6 ^ 1289361897534649872L) | j7) ^ j6;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j9 = j7 | (jUptimeMillis ^ j6);
            long j10 = ((-432420507824949384L) | jUptimeMillis) ^ j6;
            j = j4 + ((j8 | (j9 ^ j6) | j10) * j5) + (j5 * (-432420507824949384L)) + (((long) 252) * (j10 | ((j9 | 1289361897534649872L) ^ j6)));
            i4 = 1;
        } else {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - ExpandableListView.getPackedPositionType(0L), 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 19696), 518907119, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(37 - (KeyEvent.getMaxKeyCode() >> 16), 29 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.getDefaultSize(0, 0), 55511118, false, "component2", null);
            }
            int i9 = ((Field) objCopydefault5).getInt(null);
            long j11 = i9;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.MeasureSpec.getMode(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 58536393, false, "component3", null);
            }
            i = ((Field) objCopydefault6).getInt(null);
            long j12 = 590;
            long j13 = -1;
            long j14 = j13 ^ (-1307186767988057685L);
            long jIdentityHashCode = System.identityHashCode(this);
            long j15 = jIdentityHashCode ^ j13;
            long j16 = ((j14 | j15) ^ j13) | ((j14 | 2099890221632262109L) ^ j13) | ((j15 | 2099890221632262109L) ^ j13);
            long j17 = j13 ^ 2099890221632262109L;
            j = (((long) (-589)) * 2099890221632262109L) + (((long) 591) * (-1307186767988057685L)) + ((j16 | (((j17 | (-1307186767988057685L)) | jIdentityHashCode) ^ j13)) * j12) + (((long) (-1180)) * j16) + (j12 * (((j17 | j15) ^ j13) | ((j15 | (-1307186767988057685L)) ^ j13)));
            j2 = j11;
            i2 = i8;
            i3 = i9;
            i4 = 0;
        }
        while (true) {
            for (int i10 = 0; i10 != 8; i10++) {
                i = (((((int) (j2 >> i10)) & 255) + (i << 6)) + (i << 16)) - i;
            }
            if (i4 != 0) {
                break;
            }
            int i11 = component1 + 67;
            int i12 = i11 % 128;
            component2 = i12;
            i4 = i11 % 2 == 0 ? i4 + 36 : i4 + 1;
            int i13 = i12 + 31;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            j2 = j;
        }
        if (i != i2) {
            int i15 = component1 + 101;
            component2 = i15 % 128;
            int i16 = i15 % 2;
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(68 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, (char) (19696 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j18 = -1;
            long j19 = 0;
            long j20 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j18 - ((j18 >> 63) << 32)))) | (((long) 1) << 32) | (j19 - ((j19 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 6618, TextUtils.indexOf("", "", 0, 0) + 42, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {-84175705, Long.valueOf(j20), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), Color.red(0) + 56, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault9).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.currency;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetQrCodeListRequest(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, 48, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    public static GetQrCodeListRequest copy$default(GetQrCodeListRequest getQrCodeListRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        String str9 = (i & 1) != 0 ? getQrCodeListRequest.amount : str;
        String str10 = (i & 2) != 0 ? getQrCodeListRequest.entrance : str2;
        if ((i & 4) != 0) {
            int i6 = i3 + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str7 = getQrCodeListRequest.notes;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = component1 + 17;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                String str11 = getQrCodeListRequest.qrGroupId;
                throw null;
            }
            str8 = getQrCodeListRequest.qrGroupId;
        } else {
            str8 = str4;
        }
        return getQrCodeListRequest.copy(str9, str10, str7, str8, (i & 16) != 0 ? getQrCodeListRequest.currency : str5, (i & 32) != 0 ? getQrCodeListRequest.unit : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.entrance;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.notes;
            int i4 = 81 / 0;
        } else {
            str = this.notes;
        }
        int i5 = i2 + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.qrGroupId;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final GetQrCodeListRequest copy(String amount, String entrance, String notes, String qrGroupId, String currency, String unit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(entrance, "");
        Intrinsics.checkNotNullParameter(notes, "");
        GetQrCodeListRequest getQrCodeListRequest = new GetQrCodeListRequest(amount, entrance, notes, qrGroupId, currency, unit);
        int i2 = component2 + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return getQrCodeListRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 119;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof GetQrCodeListRequest)) {
            return false;
        }
        GetQrCodeListRequest getQrCodeListRequest = (GetQrCodeListRequest) other;
        if (!Intrinsics.areEqual(this.amount, getQrCodeListRequest.amount)) {
            int i4 = component1 + 29;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.entrance, getQrCodeListRequest.entrance) || !Intrinsics.areEqual(this.notes, getQrCodeListRequest.notes)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.qrGroupId, getQrCodeListRequest.qrGroupId)) {
            int i6 = component2 + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.currency, getQrCodeListRequest.currency)) {
            return Intrinsics.areEqual(this.unit, getQrCodeListRequest.unit);
        }
        int i8 = component2 + 71;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.amount.hashCode();
        int iHashCode4 = this.entrance.hashCode();
        int iHashCode5 = this.notes.hashCode();
        String str = this.qrGroupId;
        if (str == null) {
            int i2 = component1 + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.currency;
        if (str2 == null) {
            int i4 = component1 + 37;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.unit;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetQrCodeListRequest(amount=" + this.amount + ", entrance=" + this.entrance + ", notes=" + this.notes + ", qrGroupId=" + this.qrGroupId + ", currency=" + this.currency + ", unit=" + this.unit + ")";
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
