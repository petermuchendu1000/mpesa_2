package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CollectionUtils;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;", "Ljava/io/Serializable;", "name", "", "phoneNumbers", "", "photo", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPhoneNumbers", "()Ljava/util/List;", "getPhoto", "getRealPhoneNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcContact implements Serializable {
    public static final int $stable = 8;
    private static int[] ShareDataUIState;
    private static int component1;
    private final String name;
    private final List<String> phoneNumbers;
    private final String photo;
    private static final byte[] $$c = {10, 80, 9, 70};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {121, -58, 81, 67, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = 227;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -19, 19, 2};
    private static final int $$b = 49;
    private static int copydefault = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r7 = 107 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact.$$g(int, int, byte):java.lang.String");
    }

    private static void a(short s, short s2, int i, Object[] objArr) {
        int i2 = s * 3;
        int i3 = 101 - (i * 2);
        byte[] bArr = $$a;
        int i4 = 4 - (s2 * 2);
        byte[] bArr2 = new byte[i2 + 4];
        int i5 = i2 + 3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = i4 + (-i3);
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4++;
                i3 += -bArr[i4];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 10 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact.$$d
            int r8 = 100 - r8
            int r6 = r6 * 9
            int r6 = 13 - r6
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-27)
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact.b(byte, short, int, java.lang.Object[]):void");
    }

    public SfcContact(String str, List<String> list, String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.phoneNumbers = list;
        this.photo = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SfcContact(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = component2 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = "";
        }
        if ((i & 4) != 0) {
            int i3 = component2 + 59;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str2 = null;
        }
        this(str, list, str2);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> getPhoneNumbers() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.phoneNumbers;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getPhoto() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.photo;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRealPhoneNumber() {
        int i = 2 % 2;
        if (!CollectionUtils.isNotEmpty(this.phoneNumbers)) {
            return "";
        }
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.phoneNumbers.get(1) == null) {
                return "";
            }
        } else if (this.phoneNumbers.get(0) == null) {
            return "";
        }
        int i3 = copydefault + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return StringsKt.trim(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(this.phoneNumbers.get(0), "+", "", false, 4, (Object) null), "-", "", false, 4, (Object) null), " ", "", false, 4, (Object) null)).toString();
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ShareDataUIState;
        long j = 0;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 4390, View.getDefaultSize(0, 0) + 37, (char) View.MeasureSpec.getMode(0), -309236339, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i2++;
                    j = 0;
                    i4 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ShareDataUIState;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 21;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr5[i8]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        int iGreen = 4391 - Color.green(i6);
                        int iMyPid = (Process.myPid() >> 22) + 37;
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i6, i6);
                        byte b4 = (byte) i6;
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iMyPid, cMakeMeasureSpec, -309236339, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 4391, Color.red(0) + 37, (char) ExpandableListView.getPackedPositionType(0L), -309236339, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i8] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i8++;
                }
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i6;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        getactivenotifications.component1 = i10;
        while (getactivenotifications.component1 < iArr.length) {
            int i11 = $10 + 11;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                getactivenotifications.ShareDataUIState ^= iArr4[i13];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 3);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2968, 16 - Color.red(0), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49871), 462826032, false, $$g(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i14 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i14;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i15 = getactivenotifications.ShareDataUIState;
            int i16 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - (ViewConfiguration.getTapTimeout() >> 16), (char) (27637 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1616366948, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        component1 = 0;
        ShareDataUIState();
        int i = component3 + 83;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SfcContact copy$default(SfcContact sfcContact, String str, List list, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = sfcContact.name;
        }
        if ((i & 2) != 0) {
            list = sfcContact.phoneNumbers;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 13;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = sfcContact.photo;
                throw null;
            }
            str2 = sfcContact.photo;
        }
        return sfcContact.copy(str, list, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<String> component2() {
        List<String> list;
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            list = this.phoneNumbers;
            int i4 = 29 / 0;
        } else {
            list = this.phoneNumbers;
        }
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return list;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.photo;
        int i4 = i2 + 31;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return str;
    }

    public final SfcContact copy(String name, List<String> phoneNumbers, String photo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumbers, "");
        SfcContact sfcContact = new SfcContact(name, phoneNumbers, photo);
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return sfcContact;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof SfcContact)) {
            return false;
        }
        SfcContact sfcContact = (SfcContact) other;
        if (!Intrinsics.areEqual(this.name, sfcContact.name)) {
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumbers, sfcContact.phoneNumbers)) {
            return Intrinsics.areEqual(this.photo, sfcContact.photo);
        }
        int i3 = copydefault + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        if (str == null) {
            int i5 = i3 + 51;
            component2 = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.phoneNumbers.hashCode();
        String str2 = this.photo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcContact(name=" + this.name + ", phoneNumbers=" + this.phoneNumbers + ", photo=" + this.photo + ")";
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x043c A[PHI: r1
  0x043c: PHI (r1v104 java.lang.Object[]) = (r1v103 java.lang.Object[]), (r1v132 java.lang.Object[]) binds: [B:68:0x043a, B:64:0x0430] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ShareDataUIState(java.util.List r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact.ShareDataUIState(java.util.List):int");
    }

    static void ShareDataUIState() {
        ShareDataUIState = new int[]{1564772740, -1410471907, -723125563, 788209555, -583838888, -710878908, -520857506, -128492085, 1769000545, -1692120559, -997243517, 154476096, 1059005200, 1953953816, -335866783, 777171744, 417080828, 2086657075};
    }
}
