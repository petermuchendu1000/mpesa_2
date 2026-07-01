package com.huawei.common.contract;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.R;
import com.huawei.common.exception.BaseException;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.common.listener.ApiCallback;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public class GetAllContractFragment extends BaseFragment {
    private static int ArtificialStackFrames = 0;
    private static int ShareDataUIState = 0;
    private static final int component1 = 100;
    private static int component2 = 0;
    private static int component4 = 0;
    private static byte[] copy = null;
    private static final String copydefault = "GetAllContractFragment";
    private static long getAsAtTimestamp;
    private static short[] getRequestBeneficiariesState;
    private ApiCallback<String> component3;
    private static final byte[] $$c = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, 69, -115, -114, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -25, -30, -26, -26, -18, -36, -33, 38};
    private static final int $$e = 219;
    private static final byte[] $$a = {TarHeader.LF_BLK, -58, -85, 74, Ascii.SUB, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.FF, 17, 13, 13, 5, Ascii.ETB, 20, -50, Ascii.FF, Ascii.GS, -20, 33, Ascii.SUB, Ascii.DC2, -2, Ascii.FS, Ascii.SI, -36, TarHeader.LF_LINK, Ascii.ETB, 5, Ascii.SI, 17, 8, 20, 6, Ascii.US, 5, 10, Ascii.FS, -18, 47, -5, 33, -1};
    private static final int $$b = 206;
    private static int toString = 1;
    private static int equals = 0;
    private static int hashCode = 1;

    private static String $$g(short s, byte b2, byte b3) {
        int i = b2 * 4;
        int i2 = 116 - s;
        byte[] bArr = $$c;
        int i3 = (b3 * 3) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i2 += -i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            byte b4 = bArr[i3];
            i3++;
            i2 += -b4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 6
            int r0 = 28 - r7
            int r5 = r5 * 4
            int r5 = 103 - r5
            int r6 = r6 * 3
            int r6 = 16 - r6
            byte[] r1 = com.huawei.common.contract.GetAllContractFragment.$$a
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r6]
        L2a:
            int r5 = r5 + r3
            int r5 = r5 + (-14)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.contract.GetAllContractFragment.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.common.contract.GetAllContractFragment.$$d
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r1 = r8 + 10
            int r6 = r6 * 3
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-27)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.contract.GetAllContractFragment.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r22, char[] r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.contract.GetAllContractFragment.b(int, char[], java.lang.Object[]):void");
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int iBlue = Color.blue(0) + 2405;
            int iIndexOf = 26 - TextUtils.indexOf("", "", 0, 0);
            char gidForName = (char) ((-1) - Process.getGidForName(""));
            byte b2 = (byte) (-$$a[42]);
            byte b3 = (byte) (b2 + 3);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, iIndexOf, gidForName, -2047739879, false, (String) objArr2[0], null);
        }
        Object obj = null;
        if (((Field) objCopydefault).getLong(null) != -1) {
            int i2 = hashCode + 113;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault2 == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2405;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 27;
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte b4 = (byte) (-$$a[42]);
                    byte b5 = (byte) (b4 + 2);
                    Object[] objArr3 = new Object[1];
                    a(b4, b5, b5, objArr3);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iIndexOf2, longPressTimeout, 24929979, false, (String) objArr3[0], null);
                }
                obj.hashCode();
                throw null;
            }
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault3 == null) {
                int keyRepeatTimeout = 2405 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b6 = (byte) (-$$a[42]);
                byte b7 = (byte) (b6 + 2);
                Object[] objArr4 = new Object[1];
                a(b6, b7, b7, objArr4);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, capsMode, c2, 24929979, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30803, new char[]{28629, 6029, 40815, 1831, 36573, 13900, 48684, 9620, 44352, 21882, 56530, 17495, 52264, 29692, 64336, 25359}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(View.MeasureSpec.getMode(0) + 57089, new char[]{28630, 45274, 53720, 62162, 5071, 13523, 21965, 30401, 38911, 47319, 55750, 64220, 7152, 15581, 24021, 32469}, objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, 1665663926};
                Object[] objArr8 = new Object[1];
                c(Drawable.resolveOpacity(0, 0) + 1108459583, MotionEvent.axisFromString("") - 61, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 2098823623, objArr8);
                Class<?> cls2 = Class.forName(((String) objArr8[0]).intern());
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 - 1);
                Object[] objArr9 = new Object[1];
                d(b8, b9, (byte) (b9 + 1), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    int jumpTapTimeout = 2405 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 26;
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    byte b10 = (byte) (-$$a[42]);
                    byte b11 = (byte) (b10 + 2);
                    Object[] objArr10 = new Object[1];
                    a(b10, b11, b11, objArr10);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, capsMode2, tapTimeout, 24929979, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(18287 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{28638, 10430, 57605, 47488, 29292, 2813, 49985, 39832, 21672, 60715, 42439, 32297, 14066, 53103, 34777, 16475, 6434, 53667, 27165, 8941, 64368, 46031}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(52289 - TextUtils.indexOf("", "", 0), new char[]{28634, 41874, 63324, 2828, 24264, 37535, 42589, 64042, 3538, 16791, 38233, 43264, 64730, 12447, 17492}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault5 == null) {
                        int iMyPid = (Process.myPid() >> 22) + 2405;
                        int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        byte b12 = (byte) ($$a[42] + 1);
                        byte b13 = b12;
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, b13, objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, iMakeMeasureSpec, trimmedLength, -1843538389, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault6 == null) {
                        int i3 = 2406 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i4 = 26 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                        byte b14 = (byte) (-$$a[42]);
                        byte b15 = (byte) (b14 + 3);
                        Object[] objArr14 = new Object[1];
                        a(b14, b15, b15, objArr14);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i3, i4, cLastIndexOf, -2047739879, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i5 = ((int[]) objArr[0])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getTrimmedLength(""), 42 - Color.green(0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                int i7 = equals + 39;
                hashCode = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr15 = {-1116393669, Long.valueOf(j3), arrayList, null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6562, 56 - TextUtils.indexOf("", ""), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b16 = (byte) 0;
                    Object[] objArr16 = new Object[1];
                    d(b16, (byte) (b16 | 8), b16, objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = equals + 53;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 100);
        int i4 = equals + 93;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = equals + 3;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 100) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                ApiCallback<String> apiCallback = this.component3;
                if (apiCallback != null) {
                    apiCallback.onError(new BaseException(getString(R.string.common_permission_deny)));
                    int i5 = hashCode + 85;
                    equals = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else {
                int i7 = equals + 25;
                hashCode = i7 % 128;
                int i8 = i7 % 2;
                ShareDataUIState();
            }
        }
        int i9 = hashCode + 97;
        equals = i9 % 128;
        int i10 = i9 % 2;
    }

    private boolean component3() {
        boolean z;
        int i = 2 % 2;
        if (ContextCompat.checkSelfPermission(requireContext(), "android.permission.READ_CONTACTS") == 0) {
            int i2 = equals + 43;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            int i4 = hashCode + 59;
            equals = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        int i6 = hashCode + 85;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return z;
    }

    void ShareDataUIState() {
        int i = 2 % 2;
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<String>() {
            @Override
            public String doInBackground() throws Throwable {
                List<ContactsBean> listCopydefault = GetAllContractFragment.this.copydefault();
                HashMap map = new HashMap(1);
                map.put("list", listCopydefault);
                return GsonUtils.toJson(map);
            }

            @Override
            public void onSuccess(String str) {
                if (GetAllContractFragment.copydefault(GetAllContractFragment.this) != null) {
                    GetAllContractFragment.copydefault(GetAllContractFragment.this).onSuccess(str);
                }
            }
        });
        int i2 = hashCode + 91;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0226 A[PHI: r0
  0x0226: PHI (r0v9 int) = (r0v8 int), (r0v42 int) binds: [B:51:0x0224, B:48:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228 A[PHI: r0
  0x0228: PHI (r0v39 int) = (r0v8 int), (r0v42 int) binds: [B:51:0x0224, B:48:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r29, int r30, short r31, byte r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.contract.GetAllContractFragment.c(int, int, short, byte, int, java.lang.Object[]):void");
    }

    List<ContactsBean> copydefault() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = requireContext().getContentResolver();
        Cursor cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        try {
            copydefault(arrayList, contentResolver, cursorQuery);
            if (cursorQuery != null) {
                cursorQuery.close();
                int i2 = hashCode + 47;
                equals = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = hashCode + 95;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void copydefault(List<ContactsBean> list, ContentResolver contentResolver, Cursor cursor) {
        int i = 2 % 2;
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                int i2 = equals + 61;
                hashCode = i2 % 128;
                int i3 = i2 % 2;
                ContactsBean contactsBeanShareDataUIState = ShareDataUIState(list, contentResolver, cursor);
                if (contactsBeanShareDataUIState == null) {
                    int i4 = equals + 111;
                    hashCode = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                list.add(contactsBeanShareDataUIState);
            }
        }
    }

    private static ContactsBean ShareDataUIState(List<ContactsBean> list, ContentResolver contentResolver, Cursor cursor) {
        int i = 2 % 2;
        if (list.size() < 1000) {
            String string = cursor.getString(cursor.getColumnIndex("_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("display_name"));
            ContactsBean contactsBean = new ContactsBean();
            contactsBean.setId(string);
            contactsBean.setName(string2);
            if (cursor.getInt(cursor.getColumnIndex("has_phone_number")) > 0) {
                Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{string}, null);
                if (cursorQuery != null) {
                    try {
                        component1(contactsBean, cursorQuery);
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            int i2 = hashCode + 85;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return contactsBean;
            }
            throw null;
        }
        int i3 = hashCode + 29;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static void component1(ContactsBean contactsBean, Cursor cursor) {
        int i = 2 % 2;
        while (cursor.moveToNext()) {
            int i2 = equals + 71;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                String string = cursor.getString(cursor.getColumnIndex("data1"));
                if (string == null) {
                    string = "";
                }
                contactsBean.addMobile(string.replace(" ", ""));
                int i3 = equals + 23;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
            } else {
                cursor.getString(cursor.getColumnIndex("data1"));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i5 = equals + 1;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    void component3(ApiCallback<String> apiCallback) {
        int i = 2 % 2;
        this.component3 = apiCallback;
        if (component3()) {
            int i2 = equals + 109;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState();
        } else {
            component2();
            int i4 = equals + 37;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = equals + 3;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
    }

    static ApiCallback copydefault(GetAllContractFragment getAllContractFragment) {
        int i = 2 % 2;
        int i2 = equals + 75;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        ApiCallback<String> apiCallback = getAllContractFragment.component3;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return apiCallback;
    }

    static {
        ArtificialStackFrames = 0;
        component1();
        component2 = 1277511912;
        ShareDataUIState = -238323901;
        component4 = 1932331445;
        copy = new byte[]{63, -58, 103, -5, 13, -32, -47, 33, -44, -35, 111, -23, -42, 43, 41, -41, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
        int i = toString + 117;
        ArtificialStackFrames = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        getAsAtTimestamp = 1523671761045483413L;
    }
}
