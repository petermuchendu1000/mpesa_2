package com.huawei.digitalpayment.consumer.base.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ServicesResponse;", "Landroid/os/Parcelable;", "datum", "Lcom/huawei/digitalpayment/consumer/base/resp/CategoryData;", "requestId", "", "status", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/CategoryData;Ljava/lang/String;Ljava/lang/String;)V", "getDatum", "()Lcom/huawei/digitalpayment/consumer/base/resp/CategoryData;", "getRequestId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServicesResponse implements Parcelable {
    public static final Parcelable.Creator<ServicesResponse> CREATOR;
    private static long component3;
    private static int copydefault;

    @SerializedName("data")
    private final CategoryData datum;

    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("status")
    private final String status;
    private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
    private static final int $$d = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {115, -125, 45, -41, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 149;
    private static int component2 = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServicesResponse> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CategoryData categoryDataCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() != 0) {
                categoryDataCreateFromParcel = CategoryData.CREATOR.createFromParcel(parcel);
                int i4 = component1 + 31;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            return new ServicesResponse(categoryDataCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override
        public ServicesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ServicesResponse servicesResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 1;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 89 / 0;
            }
            return servicesResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 23;
            component2 = i3 % 128;
            ServicesResponse[] servicesResponseArr = new ServicesResponse[i];
            if (i3 % 2 == 0) {
                return servicesResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ServicesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 111;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ServicesResponse[] servicesResponseArrNewArray = newArray(i);
            int i5 = component1 + 109;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return servicesResponseArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = r5 * 3
            int r5 = 105 - r5
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r6
            r5 = r7
            goto L29
        L16:
            r4 = r7
            r7 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            r3 = r1[r5]
        L29:
            int r3 = -r3
            int r7 = r7 + r3
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.$$e(short, byte, byte):java.lang.String");
    }

    private static void b(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = 3 - (b2 * 3);
        int i2 = b3 * 4;
        int i3 = 99 - (b4 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[10 - i2];
        int i4 = 9 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + i3) - 26;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i++;
                i3 = (i3 + bArr[i]) - 26;
            }
        }
    }

    public ServicesResponse(CategoryData categoryData, String str, String str2) {
        this.datum = categoryData;
        this.requestId = str;
        this.status = str2;
    }

    public final CategoryData getDatum() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        CategoryData categoryData = this.datum;
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return categoryData;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 87;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33, (char) (60269 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -834797019, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() + (component3 - 5431355972723572778L);
                    try {
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 60374), -1969106284, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3265, 33 - KeyEvent.keyCodeFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60269), -834797019, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(686 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33, (char) (60373 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), -1969106284, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $10 + 125;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 60372), -1969106284, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    public String toString() throws Throwable {
        CharSequence charSequence;
        int i = 2;
        int i2 = 2 % 2;
        CategoryData categoryData = this.datum;
        String str = this.requestId;
        String str2 = this.status;
        StringBuilder sb = new StringBuilder("ServicesResponse(datum=");
        sb.append(categoryData);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 67, 33 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (19744 - AndroidCharacter.getMirror('0')), 520092524, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault).getInt(null);
        int i4 = 22;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39046, new char[]{25186, 64234, 21353, 44004, 'p', 39113, 61773, 18844, 42580, 16079, 38763, 61341, 17454, 56491, 13589, 36239, 59934, 17079, 56081, 12393, 35052, 57723}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(MotionEvent.axisFromString("") + 37530, new char[]{25190, 61686, 18256, 54712, 10260, 48795, 3569, 24702, 63150, 17667, 56213, 12004, 48454, 5035, 26168}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        CharSequence charSequence2 = "";
        long j = -496;
        long j2 = 497;
        long j3 = -1;
        long j4 = j3 ^ 4075559910945525091L;
        long j5 = j3 ^ 380163185660985234L;
        long j6 = j4 | j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j3;
        long j8 = (j * 4075559910945525091L) + (j * 380163185660985234L) + ((j6 ^ j3) * j2) + ((((j6 | jIdentityHashCode) ^ j3) | (((j5 | j7) | 4075559910945525091L) ^ j3)) * j2) + (j2 * (((j4 | j7) ^ j3) | ((j4 | 380163185660985234L) ^ j3) | (j3 ^ ((j5 | 4075559910945525091L) | jIdentityHashCode))));
        int i5 = ShareDataUIState + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            if (i7 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    charSequence = charSequence2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (Process.myTid() >> i4), Color.blue(0) + 30, (char) TextUtils.indexOf(charSequence, charSequence, 0), 846241313, false, "copydefault", null);
                } else {
                    charSequence = charSequence2;
                }
                int i8 = ((Field) objCopydefault2).getInt(null);
                int i9 = ShareDataUIState + 99;
                component2 = i9 % 128;
                int i10 = i9 % i;
                long j9 = jLongValue;
                int i11 = 0;
                while (true) {
                    for (int i12 = 0; i12 != 8; i12++) {
                        i8 = (((((int) (j9 >> i12)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                    }
                    if (i11 != 0) {
                        break;
                    }
                    i11++;
                    j9 = j8;
                }
                if (i8 == i3) {
                    break;
                }
                jLongValue -= 1024;
                i7++;
                charSequence2 = charSequence;
                i = 2;
                i4 = 22;
            } else {
                CharSequence charSequence3 = charSequence2;
                Object[] objArr3 = new Object[1];
                a(Gravity.getAbsoluteGravity(0, 0) + 49919, new char[]{25193, 41117, 59275, 10911, 27089, 44180, 62360, 13972, 30108, 47322, 65446, 655, 16772, 33924, 52116, 3743}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23251, new char[]{25194, 14516, 55232, 29204, 2363, 42101, 17029, 6591, 46291, 21257, 61006, 34170, 9124, 65243, 38381, 12347}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1314278146};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1663 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (char) ((-16777216) - Color.rgb(0, 0, 0)), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1224997387, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int iAlpha = 1454 - Color.alpha(0);
                        int iRed = 22 - Color.red(0);
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(charSequence3, '0', 0));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, iRed, cLastIndexOf, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - TextUtils.indexOf(charSequence3, charSequence3, 0, 0), 39 - TextUtils.indexOf(charSequence3, charSequence3), (char) View.resolveSize(0, 0)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i13 = ((int[]) objArr8[2])[0];
                    int i14 = ((int[]) objArr8[1])[0];
                    if (i14 != i13) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            for (String str3 : strArr) {
                                arrayList.add(str3);
                            }
                        }
                        long j10 = -1;
                        long j11 = 0;
                        long j12 = (((long) (i14 ^ i13)) & ((j10 - ((j10 >> 63) << 32)) | (((long) 0) << 32))) | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6618, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {-1314278146, Long.valueOf(j12), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6561, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i14];
                        int i15 = i14 - 1;
                        iArr[i15] = 1;
                        Toast.makeText((Context) null, iArr[((i14 * i15) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        sb.append(", requestId=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(")");
        String string = sb.toString();
        int i16 = ShareDataUIState + 81;
        component2 = i16 % 128;
        if (i16 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component1 + 89;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ServicesResponse copy$default(ServicesResponse servicesResponse, CategoryData categoryData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            categoryData = servicesResponse.datum;
        }
        if ((i & 2) != 0) {
            str = servicesResponse.requestId;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 67;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str2 = servicesResponse.status;
        }
        return servicesResponse.copy(categoryData, str, str2);
    }

    public final CategoryData component1() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.datum;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.requestId;
        int i4 = i2 + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final ServicesResponse copy(CategoryData datum, String requestId, String status) {
        int i = 2 % 2;
        ServicesResponse servicesResponse = new ServicesResponse(datum, requestId, status);
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return servicesResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicesResponse)) {
            int i4 = i2 + 85;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ServicesResponse servicesResponse = (ServicesResponse) other;
        if (!Intrinsics.areEqual(this.datum, servicesResponse.datum)) {
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, servicesResponse.requestId)) {
            return Intrinsics.areEqual(this.status, servicesResponse.status);
        }
        int i6 = ShareDataUIState + 121;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r1 r4
  0x0023: PHI (r1v12 com.huawei.digitalpayment.consumer.base.resp.CategoryData) = 
  (r1v4 com.huawei.digitalpayment.consumer.base.resp.CategoryData)
  (r1v14 com.huawei.digitalpayment.consumer.base.resp.CategoryData)
 binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r4
  0x001a: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.ShareDataUIState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.component2 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L15
            com.huawei.digitalpayment.consumer.base.resp.CategoryData r1 = r6.datum
            r4 = 1
            if (r1 != 0) goto L23
            goto L1a
        L15:
            com.huawei.digitalpayment.consumer.base.resp.CategoryData r1 = r6.datum
            r4 = r3
            if (r1 != 0) goto L23
        L1a:
            int r2 = r2 + 103
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.ShareDataUIState = r1
            int r2 = r2 % r0
            r1 = r3
            goto L30
        L23:
            int r1 = r1.hashCode()
            int r2 = com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.ShareDataUIState
            int r2 = r2 + 87
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.component2 = r5
            int r2 = r2 % r0
        L30:
            java.lang.String r2 = r6.requestId
            if (r2 != 0) goto L3e
            int r2 = com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.ShareDataUIState
            int r2 = r2 + 37
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.component2 = r5
            int r2 = r2 % r0
            goto L42
        L3e:
            int r3 = r2.hashCode()
        L42:
            java.lang.String r0 = r6.status
            if (r0 != 0) goto L47
            goto L4b
        L47:
            int r4 = r0.hashCode()
        L4b:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ServicesResponse.hashCode():int");
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        CategoryData categoryData = this.datum;
        if (categoryData == null) {
            int i2 = component2 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
            int i4 = ShareDataUIState + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            categoryData.writeToParcel(dest, flags);
        }
        dest.writeString(this.requestId);
        dest.writeString(this.status);
    }

    static void ShareDataUIState() {
        component3 = -6784674170974969303L;
    }
}
