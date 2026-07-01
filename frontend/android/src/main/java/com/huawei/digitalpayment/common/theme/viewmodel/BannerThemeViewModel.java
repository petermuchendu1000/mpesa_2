package com.huawei.digitalpayment.common.theme.viewmodel;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.digitalpayment.common.theme.model.BannerThemeModel;
import com.huawei.digitalpayment.common.theme.model.IBannerThemeModel;
import com.huawei.digitalpayment.common.theme.viewmodel.base.BaseBannerThemeViewModel;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/BannerThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseBannerThemeViewModel;", "Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;", DeviceInfoFieldGroup.FIELD_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/BannerThemeModel;", "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/BannerThemeModel;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BannerThemeViewModel extends BaseBannerThemeViewModel<IBannerThemeModel> {
    private static final byte[] $$c = {96, -37, -4, -26};
    private static final int $$d = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {7, 80, 121, 38, 6, -5, 3};
    private static final int $$b = 111;
    private static int component1 = 0;
    private static int component4 = 1;
    private static char component2 = 3303;
    private static char copydefault = 12957;
    private static char component3 = 37347;
    private static char ShareDataUIState = 1305;

    private static String $$e(int i, short s, int i2) {
        int i3 = s + 4;
        int i4 = i * 3;
        byte[] bArr = $$c;
        int i5 = (i2 * 3) + 111;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i5 = i3 + i6;
            i3 = i3;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i3 + 1;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i8;
            i5 = bArr[i9] + i5;
            i3 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = r9 * 2
            int r9 = r9 + 99
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + 6
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel.b(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BannerThemeViewModel(BannerThemeModel bannerThemeModel) {
        super(bannerThemeModel);
        Intrinsics.checkNotNullParameter(bannerThemeModel, "");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            char c2 = 1;
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iIndexOf = 844 - TextUtils.indexOf("", "", 0, 0);
                        int longPressTimeout = 32 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 23251);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        String str$$e = $$e(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, longPressTimeout, trimmedLength, 592652048, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[c2] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 844, 32 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 23251), 592652048, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                    c2 = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(466 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 49 - View.combineMeasuredStates(0, 0), (char) Color.red(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i13 = $10 + 101;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|2|(9:125|(1:4)(2:5|6)|7|(1:9)(2:10|11)|12|13|(1:15)(1:16)|17|(1:(2:19|(2:128|21)(1:22))(2:127|23)))|25|118|26|(1:28)|29|30|(1:32)(1:33)|34|120|35|(8:37|57|122|58|(2:60|(1:62)(1:63))(7:64|65|123|(1:67)(1:71)|68|72|73)|(8:121|75|(2:77|84)(4:78|114|79|80)|85|(1:98)(2:88|(1:90)(0))|99|(1:101)(1:102)|103)(0)|104|105)(10:38|39|116|40|41|(1:43)(1:45)|44|46|47|(9:49|50|51|122|58|(0)(0)|(0)(0)|104|105)(1:52))|56|57|122|58|(0)(0)|(0)(0)|104|105|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0592, code lost:
    
        if (r10 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0595, code lost:
    
        if (r10 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0597, code lost:
    
        r0 = new java.lang.Object[]{new java.lang.String[]{r10}, new int[]{r6}};
        r6 = (~(r26 & 20)) & (r26 | 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05ae, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0490 A[Catch: Exception -> 0x05b7, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x05b7, blocks: (B:58:0x0456, B:64:0x0490, B:73:0x04d9, B:96:0x05b0, B:97:0x05b6, B:67:0x04a9, B:68:0x04b6, B:72:0x04cc, B:71:0x04bd), top: B:122:0x0456, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component1(int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.BannerThemeViewModel.component1(int, int):java.lang.Object[]");
    }
}
