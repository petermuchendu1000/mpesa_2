package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValueItem;", "Landroid/os/Parcelable;", "key", "", "value", "additionalInfo", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValueItemAdditionalInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "getAdditionalInfo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValueItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankComboValueItem> CREATOR;
    private static char[] ShareDataUIState;
    private static int component3;
    private final List<BankComboValueItemAdditionalInfo> additionalInfo;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;
    private static final byte[] $$c = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$d = 44;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {66, 42, 112, 97, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 239;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static int component1 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValueItem> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component1 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    int i6 = copydefault + 81;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList2.add(BankComboValueItemAdditionalInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BankComboValueItem(string, string2, arrayList);
        }

        @Override
        public BankComboValueItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BankComboValueItem bankComboValueItemCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 35;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bankComboValueItemCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 123;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            BankComboValueItem[] bankComboValueItemArr = new BankComboValueItem[i];
            int i6 = i4 + 19;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return bankComboValueItemArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BankComboValueItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 121;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            BankComboValueItem[] bankComboValueItemArrNewArray = newArray(i);
            int i4 = component1 + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bankComboValueItemArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem.$$c
            int r7 = r7 + 110
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem.$$e(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem.$$a
            int r7 = r7 * 3
            int r1 = r7 + 10
            int r5 = r5 * 3
            int r5 = 99 - r5
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r5 = r7
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-26)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValueItem.b(short, short, short, java.lang.Object[]):void");
    }

    public BankComboValueItem(String str, String str2, List<BankComboValueItemAdditionalInfo> list) {
        this.key = str;
        this.value = str2;
        this.additionalInfo = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BankComboValueItem(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = component2;
            int i3 = i2 + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 33;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 63;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i10 = copydefault + 49;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            list = null;
        }
        this(str, str2, list);
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        char[] cArr2;
        char c2;
        int length;
        char[] cArr3;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        byte b2 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr4 = ShareDataUIState;
        if (cArr4 != null) {
            int i8 = $10 + 115;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 658, (KeyEvent.getMaxKeyCode() >> 16) + 14, (char) (View.getDefaultSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr3;
        }
        char[] cArr5 = new char[i5];
        System.arraycopy(cArr4, i4, cArr5, 0, i5);
        if (bArr != null) {
            int i10 = $10 + 55;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr2 = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 1;
            } else {
                cArr2 = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i11 = $10 + 33;
                $11 = i11 % 128;
                if (i11 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != b2 : bArr[iTrustedWebActivityService_Parcel.copydefault] != b2) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr5[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getEdgeSlop() >> 16), 28 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1180380354, false, $$e(b3, b4, (byte) (b4 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = $11 + 103;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c3);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Color.green(0), (ViewConfiguration.getScrollBarSize() >> 8) + 36, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27897), -1464227204, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr2[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1859;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 34;
                    char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte length2 = (byte) $$c.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iCombineMeasuredStates, c4, 80302927, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr5 = cArr2;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr5, 0, cArr6, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr5, i16, i7);
            System.arraycopy(cArr6, i7, cArr5, 0, i16);
        }
        if (z) {
            int i17 = $11 + 23;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr = new char[i5];
                i2 = 1;
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                i2 = 1;
                cArr = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr5[(i5 - iTrustedWebActivityService_Parcel.copydefault) - i2];
                iTrustedWebActivityService_Parcel.copydefault += i2;
                i2 = 1;
            }
            cArr5 = cArr;
        }
        if (i6 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i18 = $11 + 85;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr5[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr5[iTrustedWebActivityService_Parcel.copydefault] / iArr[4]);
                    i = iTrustedWebActivityService_Parcel.copydefault - 1;
                } else {
                    cArr5[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr5[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public final List<BankComboValueItemAdditionalInfo> getAdditionalInfo() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33, (char) (19696 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 22, 0, 2}, new byte[]{1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(true, new int[]{22, 15, 0, 4}, new byte[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr2);
        long j = 130;
        int i3 = i2;
        long j2 = -1;
        long j3 = j2 ^ 2983696265694117050L;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = (((long) (-129)) * 1472026830912393275L) + (((long) 131) * 2983696265694117050L) + ((((j3 | (jIdentityHashCode ^ j2)) | 1472026830912393275L) ^ j2) * j);
        long j5 = j3 | 1472026830912393275L;
        long j6 = j4 + (((long) (-260)) * (j5 ^ j2)) + (j * ((j2 ^ (j5 | jIdentityHashCode)) | (((j2 ^ 1472026830912393275L) | 2983696265694117050L) ^ j2)));
        int i4 = 0;
        while (true) {
            if (i4 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 30, (char) (KeyEvent.getMaxKeyCode() >> 16), 846241313, false, "copydefault", null);
                }
                int i5 = ((Field) objCopydefault2).getInt(null);
                long j7 = jLongValue;
                int i6 = 0;
                while (true) {
                    for (int i7 = 0; i7 != 8; i7++) {
                        i5 = (((((int) (j7 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                    }
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    int i8 = copydefault + 119;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    j7 = j6;
                }
                int i10 = i3;
                if (i5 == i10) {
                    break;
                }
                jLongValue -= 1024;
                i4++;
                int i11 = component2 + 115;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 2 / 3;
                }
                i3 = i10;
            } else {
                Object[] objArr3 = new Object[1];
                a(false, new int[]{37, 16, 186, 0}, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(false, new int[]{53, 16, 0, 1}, new byte[]{1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1632435412};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1662 - TextUtils.lastIndexOf("", '0'), 9 - MotionEvent.axisFromString(""), (char) KeyEvent.getDeadChar(0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1300030413, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int iBlue = 1454 - Color.blue(0);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, absoluteGravity, offsetAfter, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1591, 39 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i13 = ((int[]) objArr8[2])[0];
                    int i14 = ((int[]) objArr8[1])[0];
                    if (i14 != i13) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i15 = copydefault + 51;
                            component2 = i15 % 128;
                            int i16 = 2;
                            int i17 = i15 % 2;
                            int i18 = 0;
                            while (i18 < strArr.length) {
                                int i19 = component2 + 119;
                                copydefault = i19 % 128;
                                if (i19 % i16 == 0) {
                                    arrayList.add(strArr[i18]);
                                    i18 += 119;
                                } else {
                                    arrayList.add(strArr[i18]);
                                    i18++;
                                }
                                i16 = 2;
                            }
                        }
                        long j8 = -1;
                        long j9 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
                        long j10 = 0;
                        long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0, 0), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {-1632435412, Long.valueOf(j11), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, (Process.myTid() >> 22) + 56, (char) (ViewConfiguration.getTapTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
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
        return this.additionalInfo;
    }

    static {
        component3 = 0;
        copydefault();
        CREATOR = new Creator();
        int i = component1 + 101;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BankComboValueItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankComboValueItem copy$default(BankComboValueItem bankComboValueItem, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 49;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                str = bankComboValueItem.key;
                int i4 = 69 / 0;
            } else {
                str = bankComboValueItem.key;
            }
        }
        if ((i & 2) != 0) {
            str2 = bankComboValueItem.value;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            list = bankComboValueItem.additionalInfo;
        }
        return bankComboValueItem.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<BankComboValueItemAdditionalInfo> component3() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<BankComboValueItemAdditionalInfo> list = this.additionalInfo;
        int i4 = i3 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final BankComboValueItem copy(String key, String value, List<BankComboValueItemAdditionalInfo> additionalInfo) {
        int i = 2 % 2;
        BankComboValueItem bankComboValueItem = new BankComboValueItem(key, value, additionalInfo);
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return bankComboValueItem;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankComboValueItem)) {
            return false;
        }
        BankComboValueItem bankComboValueItem = (BankComboValueItem) other;
        if (!Intrinsics.areEqual(this.key, bankComboValueItem.key)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, bankComboValueItem.value)) {
            if (Intrinsics.areEqual(this.additionalInfo, bankComboValueItem.additionalInfo)) {
                return true;
            }
            int i2 = component2 + 81;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = component2 + 63;
        int i5 = i4 % 128;
        copydefault = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 5;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.key) != null : (str = this.key) != null) ? str.hashCode() : 0;
        String str2 = this.value;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<BankComboValueItemAdditionalInfo> list = this.additionalInfo;
        if (list == null) {
            int i3 = component2 + 59;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValueItem(key=" + this.key + ", value=" + this.value + ", additionalInfo=" + this.additionalInfo + ')';
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.key);
            dest.writeString(this.value);
            throw null;
        }
        dest.writeString(this.key);
        dest.writeString(this.value);
        List<BankComboValueItemAdditionalInfo> list = this.additionalInfo;
        if (list == null) {
            int i4 = component2 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<BankComboValueItemAdditionalInfo> it = list.iterator();
            int i6 = component2 + 47;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 2;
            }
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        int i8 = copydefault + 81;
        component2 = i8 % 128;
        int i9 = i8 % 2;
    }

    static void copydefault() {
        ShareDataUIState = new char[]{33518, 33464, 33465, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33439, 33465, 33449, 33452, 33459, 33462, 33415, 33416, 33458, 33511, 33463, 33465, 33463, 33466, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33357, 33728, 33786, 33786, 33758, 33752, 33791, 33790, 33787, 33755, 33317, 33791, 33775, 33778, 33785, 33788, 33517, 33464, 33465, 33467, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462};
    }
}
