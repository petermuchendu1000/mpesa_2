package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.image.PicBase64Utils;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.glide.ImageRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import org.json.JSONObject;

public class LoadImage extends JavascriptFunction {
    private static int component1 = 0;
    private static int copydefault = 1;

    static void component3(LoadImage loadImage, String str, Map map) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        loadImage.callJs(str, (Map<String, String>) map);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_LOAD_DOC_ID_IMAGE;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        FragmentActivity hostActivity = this.interactionView.getHostActivity();
        if (jSONObject != null) {
            int i2 = copydefault;
            int i3 = i2 + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (hostActivity == null) {
                int i5 = i2 + 91;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                final String strOptString = jSONObject.optString("docId");
                final String strOptString2 = jSONObject.optString("type");
                final String strOptString3 = jSONObject.optString(WebViewConstants.FUNCTION_CALLBACK_NAME);
                ImageRequest.get().load(new Base64Mode(strOptString, strOptString2)).listener(new ApiCallback<Drawable>() {
                    private static short[] getAsAtTimestamp;
                    private static final byte[] $$c = {80, 83, -21, -55};
                    private static final int $$d = 215;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {120, -46, -95, -23, 6, -5, 3};
                    private static final int $$b = 95;
                    private static int component4 = 0;
                    private static int toString = 1;
                    private static int component3 = 599612125;
                    private static int copy = -238323951;
                    private static int getRequestBeneficiariesState = 2057283564;
                    private static byte[] equals = {-42, -40, 56, -41, -34, 41, -42, 5, -8, 36, -41, 41, -37, 58, -44, 8, -8, 35, 36, -41, 41, -37, 58, -44, 8, -5, 42, 0, -10, -48, 44, -36, 34, 33, -61, -37, 58, -44, 8, 63, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, 36, 43, 43, -58, -41, 60, -62, 47, 32, -38, 41, -44, 59, Ascii.GS, -31, -48, 44, 47, 43, -58, -41, 108, -31, -37, 58, -44, 40, Ascii.FS, -22, 46, -34, -43, 36, -45, Ascii.NAK, -107, -45, 47, 109, 40, 40, -42, -48, 35, 40, -38, 32, 47, -45, 43, 43, -58, -41, 39, Ascii.RS, -22, 46, -34, -43, 36, -45, Ascii.NAK, -107, -45, 47, 109, -27, -35, -44, 43, 104, -42, 57, -47, -48, 44, 47, 43, -58, -41, 108, -31, -48, 44, 47, 43, -58, -41, 108, -31, -37, 58, -44, 40, Ascii.FS, -22, 46, -34, -43, 36, -45, Ascii.NAK, -107, -45, 47, 109, 41, 41, 41, 41, 41, 41, 41, 41};

                    private static String $$e(short s, byte b2, int i7) {
                        int i8 = (s * 4) + 4;
                        byte[] bArr = $$c;
                        int i9 = b2 * 2;
                        int i10 = 116 - i7;
                        byte[] bArr2 = new byte[1 - i9];
                        int i11 = 0 - i9;
                        int i12 = -1;
                        if (bArr == null) {
                            i10 = (-i10) + i11;
                            i8++;
                            i12 = -1;
                        }
                        while (true) {
                            int i13 = i12 + 1;
                            bArr2[i13] = (byte) i10;
                            if (i13 == i11) {
                                return new String(bArr2, 0);
                            }
                            i10 = (-bArr[i8]) + i10;
                            i8++;
                            i12 = i13;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static void b(int r7, byte r8, short r9, java.lang.Object[] r10) {
                        /*
                            int r9 = r9 * 3
                            int r9 = r9 + 99
                            int r8 = r8 * 3
                            int r8 = r8 + 4
                            byte[] r0 = com.huawei.digitalpayment.consumer.webview.interaction.function.LoadImage.AnonymousClass3.$$a
                            int r7 = r7 * 4
                            int r7 = r7 + 4
                            byte[] r1 = new byte[r7]
                            r2 = 0
                            if (r0 != 0) goto L17
                            r3 = r7
                            r9 = r8
                            r4 = r2
                            goto L2c
                        L17:
                            r3 = r2
                        L18:
                            int r4 = r3 + 1
                            byte r5 = (byte) r9
                            r1[r3] = r5
                            if (r4 != r7) goto L27
                            java.lang.String r7 = new java.lang.String
                            r7.<init>(r1, r2)
                            r10[r2] = r7
                            return
                        L27:
                            r3 = r0[r8]
                            r6 = r9
                            r9 = r8
                            r8 = r6
                        L2c:
                            int r8 = r8 + r3
                            int r8 = r8 + 6
                            int r9 = r9 + 1
                            r3 = r4
                            r6 = r9
                            r9 = r8
                            r8 = r6
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.LoadImage.AnonymousClass3.b(int, byte, short, java.lang.Object[]):void");
                    }

                    @Override
                    public void onSuccess(Drawable drawable) {
                        int i7 = 2 % 2;
                        int i8 = component4 + 103;
                        toString = i8 % 128;
                        int i9 = i8 % 2;
                        copydefault(drawable);
                        if (i9 == 0) {
                            throw null;
                        }
                    }

                    public void copydefault(Drawable drawable) {
                        int i7 = 2 % 2;
                        try {
                            String strEncodeImage = PicBase64Utils.encodeImage(PicBase64Utils.drawableToBitmap(drawable));
                            HashMap map = new HashMap();
                            map.put("base64Content", strEncodeImage);
                            map.put("docId", strOptString);
                            map.put("type", strOptString2);
                            LoadImage.component3(LoadImage.this, strOptString3, map);
                            int i8 = component4 + 89;
                            toString = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (Exception e) {
                            LoadImage.ShareDataUIState(LoadImage.this, strOptString3, strOptString, strOptString2);
                            L.e(e.getMessage());
                        }
                    }

                    @Override
                    public void onError(BaseException baseException) {
                        int i7 = 2 % 2;
                        int i8 = toString + 21;
                        component4 = i8 % 128;
                        if (i8 % 2 != 0) {
                            LoadImage.ShareDataUIState(LoadImage.this, strOptString3, strOptString, strOptString2);
                            int i9 = 65 / 0;
                        } else {
                            LoadImage.ShareDataUIState(LoadImage.this, strOptString3, strOptString, strOptString2);
                        }
                        int i10 = component4 + 91;
                        toString = i10 % 128;
                        int i11 = i10 % 2;
                    }

                    private static void a(short s, byte b2, int i7, int i8, int i9, Object[] objArr) throws Throwable {
                        int length;
                        byte[] bArr;
                        int i10;
                        int i11 = 2 % 2;
                        getSmallIconId getsmalliconid = new getSmallIconId();
                        StringBuilder sb = new StringBuilder();
                        try {
                            Object[] objArr2 = {Integer.valueOf(i8), Integer.valueOf(copy)};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                            if (objCopydefault == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(998 - MotionEvent.axisFromString(""), Color.green(0) + 31, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61685), 1874745193, false, $$e(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                            int i12 = iIntValue == -1 ? 1 : 0;
                            if (i12 != 0) {
                                byte[] bArr2 = equals;
                                if (bArr2 != null) {
                                    int length2 = bArr2.length;
                                    byte[] bArr3 = new byte[length2];
                                    for (int i13 = 0; i13 < length2; i13++) {
                                        Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                        if (objCopydefault2 == null) {
                                            byte b5 = (byte) 0;
                                            byte b6 = b5;
                                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 2984, 48 - Color.argb(0, 0, 0, 0), (char) (54462 - TextUtils.indexOf("", "")), -1178636483, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                                        }
                                        bArr3[i13] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                    }
                                    bArr2 = bArr3;
                                }
                                if (bArr2 != null) {
                                    byte[] bArr4 = equals;
                                    Object[] objArr4 = {Integer.valueOf(i7), Integer.valueOf(component3)};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                                    if (objCopydefault3 == null) {
                                        byte b7 = (byte) 0;
                                        byte b8 = b7;
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (61685 - TextUtils.getOffsetBefore("", 0)), 1874745193, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                                } else {
                                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i7 + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                                }
                            }
                            if (iIntValue > 0) {
                                int i14 = $11 + 71;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                getsmalliconid.copydefault = ((i7 + iIntValue) - 2) + ((int) (((long) component3) ^ 7083766810336261929L)) + i12;
                                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i9), Integer.valueOf(getRequestBeneficiariesState), sb};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                                if (objCopydefault4 == null) {
                                    byte b9 = (byte) 0;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 1649, ImageFormat.getBitsPerPixel(0) + 38, (char) (Process.myPid() >> 22), -1454191902, false, $$e(b9, b9, (byte) $$c.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                }
                                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                                getsmalliconid.component3 = getsmalliconid.component1;
                                byte[] bArr5 = equals;
                                if (bArr5 != null) {
                                    int i16 = $10 + 39;
                                    int i17 = i16 % 128;
                                    $11 = i17;
                                    if (i16 % 2 == 0) {
                                        length = bArr5.length;
                                        bArr = new byte[length];
                                        i10 = 1;
                                    } else {
                                        length = bArr5.length;
                                        bArr = new byte[length];
                                        i10 = 0;
                                    }
                                    int i18 = i17 + 107;
                                    $10 = i18 % 128;
                                    int i19 = i18 % 2;
                                    while (i10 < length) {
                                        int i20 = $10 + 23;
                                        $11 = i20 % 128;
                                        if (i20 % 2 == 0) {
                                            bArr[i10] = (byte) (((long) bArr5[i10]) ^ 7083766810336261929L);
                                        } else {
                                            bArr[i10] = (byte) (((long) bArr5[i10]) ^ 7083766810336261929L);
                                            i10++;
                                        }
                                    }
                                    bArr5 = bArr;
                                }
                                boolean z = bArr5 != null;
                                getsmalliconid.component2 = 1;
                                while (getsmalliconid.component2 < iIntValue) {
                                    int i21 = $10 + 21;
                                    $11 = i21 % 128;
                                    int i22 = i21 % 2;
                                    if (z) {
                                        byte[] bArr6 = equals;
                                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                                    } else {
                                        short[] sArr = getAsAtTimestamp;
                                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                                    }
                                    sb.append(getsmalliconid.component1);
                                    getsmalliconid.component3 = getsmalliconid.component1;
                                    getsmalliconid.component2++;
                                }
                            }
                            objArr[0] = sb.toString();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(26:123|20|(1:22)|23|24|(1:26)(1:27)|28|118|29|30|111|31|32|33|(8:35|36|114|(1:38)(1:39)|40|41|42|(11:44|122|53|54|55|(1:57)(11:58|120|59|60|(1:62)(1:63)|64|65|66|(5:110|68|(1:70)(8:71|112|72|73|74|75|76|(0)(5:83|(1:85)(1:86)|87|(1:89)(1:90)|91))|80|(0))|100|101)|95|(1:97)(1:98)|99|100|101)(2:45|46))(1:50)|52|122|53|54|55|(0)(0)|95|(0)(0)|99|100|101) */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x06d6  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x06e8 A[Catch: Exception -> 0x0a74, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0a74, blocks: (B:53:0x05ec, B:55:0x06d0, B:58:0x06e8, B:66:0x0804, B:93:0x0a6d, B:94:0x0a73, B:59:0x06f2, B:65:0x07f5), top: B:122:0x05ec, inners: #6 }] */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x0a8b  */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x0a93  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public static java.lang.Object[] ShareDataUIState(int r28, int r29) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 3061
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.interaction.function.LoadImage.AnonymousClass3.ShareDataUIState(int, int):java.lang.Object[]");
                    }
                }).request();
            }
        }
    }

    private void copydefault(String str, String str2, String str3) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put("base64Content", "");
        map.put("docId", str2);
        map.put("type", str3);
        callJs(str, map);
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    static void ShareDataUIState(LoadImage loadImage, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        loadImage.copydefault(str, str2, str3);
        int i4 = copydefault + 47;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
