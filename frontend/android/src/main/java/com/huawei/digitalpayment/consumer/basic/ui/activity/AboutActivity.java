package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.ActivityName;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.service.AppUpdateService;
import com.huawei.digitalpayment.consumer.baselib.util.AppInfoUtils;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateUtil;
import com.huawei.digitalpayment.consumer.baselib.util.update.contants.UpdateEntrance;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityAboutBinding;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.AboutViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.text.Typography;

@ActivityName(UpdateEntrance.ABOUT_PAGE)
public class AboutActivity extends Hilt_AboutActivity<ActivityAboutBinding, AboutViewModel> {
    private static final byte[] $$a = {Ascii.EM, 43, 92, -56};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static char[] component2 = {33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33504, 33470, 33455, 33462, 33467, 33459, 33452, 33513, 33452, 33464, 33408, 33465, 33512, 33459, 33465, 33430, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33469, 33464, 33462, 33460, 33460, 33295, 33297, 33295, 33301, 33297, 33290, 33291, 33298, 33300, 33292, 33379, 33381, 33293, 33295, 33299, 33303, 33307, 33463, 33334, 33336, 33294, 33291, 33334, 33312, 33337, 33337, 33759, 33312, 33313, 33334, 33295, 33338, 33335, 33292, 33292, 33295, 33336, 33312, 33334, 33294, 33298, 33336, 33336, 33338, 33334, 33295, 33298, 33336, 33312, 33335, 33292, 33293, 33297, 33336, 33335, 33337, 33312, 33336, 33297, 33299, 33297, 33336, 33336, 33294, 33292, 33292, 33293, 33294, 33291, 33293, 33295, 33292, 33332, 33332, 33292, 33335, 33314, 33338, 33336, 33337, 33296, 33533, 33471, 33467, 33468, 33408, 33431, 33430, 33431, 33429, 33470, 33447, 33446, 33468, 33431, 33432, 33471, 33447, 33446, 33470, 33429, 33431, 33430, 33427, 33427, 33429, 33470, 33469, 33430, 33471, 33471, 33431, 33470, 33471, 33431, 33470, 33409, 33434, 33408, 33468, 33468, 33468, 33428, 33427, 33426, 33431, 33430, 33429, 33408, 33408, 33430, 33469, 33468, 33429, 33434, 33434, 33409, 33449, 33447, 33468, 33429, 33430, 33429, 33430, 33470, 33480, 33520, 33517, 33518, 33519, 33513};
    private static long copydefault = -2961926070602147964L;

    private static String $$c(int i, int i2, byte b2) {
        byte[] bArr = $$a;
        int i3 = 4 - (i * 4);
        int i4 = b2 + 103;
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += i6;
            i3++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
            i3++;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getScrollBarSize() >> 8), 34 - (Process.myTid() >> 22), (char) (TextUtils.getOffsetBefore("", 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1389 - ImageFormat.getBitsPerPixel(0), 18 - Drawable.resolveOpacity(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51268), -1883291598, false, $$c(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 73;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.AboutActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.my_about_title));
        int i4 = component1 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    private void lambda$initEvent$0(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogManager.showLoading(this);
        ((AboutViewModel) this.viewModel).versionVerify();
        int i4 = ShareDataUIState + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void initEvent() {
        int i = 2 % 2;
        ((ActivityAboutBinding) this.binding).btnCheckUpdate.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 61;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    AboutActivity.$r8$lambda$CGZ8qXhBV1Dfi4gjMddH4zvYSFk(this.f$0, view);
                    throw null;
                }
                AboutActivity.$r8$lambda$CGZ8qXhBV1Dfi4gjMddH4zvYSFk(this.f$0, view);
                int i4 = copydefault + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivityAboutBinding) this.binding).tvVersion.setText(String.format("V%s", AppInfoUtils.getVersionName()));
        ((ActivityAboutBinding) this.binding).tvReservedVersion.setText(String.format(getString(R.string.my_about_tip2), AppInfoUtils.getVersionName()));
        ((ActivityAboutBinding) this.binding).btnTeamOfService.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 65;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                AboutActivity.$r8$lambda$Y3jLaBzglsz9Uf9swbflX0q4Cuc(view);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void lambda$initEvent$1(View view) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(SPUtils.getInstance().getString(SPConstant.PRIVACY_URL));
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void addObserver() {
        int i = 2 % 2;
        ((AboutViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 115;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                AboutActivity.$r8$lambda$OSKGeKx1rquPtlw_XzOk_PsfsmU(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 47;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
    }

    private void lambda$addObserver$2(Resource resource) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DialogManager.hideLoading(this);
        if (resource.success()) {
            ((AppUpdateService) RouteUtils.getService(AppUpdateService.class)).showAppUpdateDialog(UpdateUtil.checkUpdate(this, (UpdateBean) resource.getData()), this.activity, getString(R.string.appUpdate));
        }
        if (!resource.error()) {
            return;
        }
        int i4 = component1 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if (resource.getMessage() != null) {
            ToastUtils.showShort(resource.getMessage());
            int i6 = component1 + 29;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 4;
            }
        }
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 39;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_about;
            int i4 = 34 / 0;
        } else {
            i = R.layout.activity_about;
        }
        int i5 = component1 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                b(false, new int[]{23, 26, 0, 22}, new byte[]{1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                b(false, new int[]{49, 18, 98, 4}, new byte[]{0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i3 = ShareDataUIState + 27;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                int i5 = ShareDataUIState + 67;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0'), 42 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), 56 - View.MeasureSpec.getMode(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            super.onResume();
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = component2;
        if (cArr2 != null) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (Process.myPid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SI, (char) (65118 - (ViewConfiguration.getEdgeSlop() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i10 = $11 + 57;
                $10 = i10 % 128;
                if (i10 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3580, 28 - Color.alpha(0), (char) Color.red(0), 1180380354, false, $$c(b2, b3, (byte) (b3 | Ascii.FF)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 4502, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36, (char) (27897 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1464227204, false, $$c(b4, b5, (byte) (b5 | 7)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 34 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 80302927, false, $$c(b6, b7, (byte) (b7 | Ascii.VT)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i14 = $10 + 29;
            $11 = i14 % 128;
            char c3 = 2;
            int i15 = i14 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[c3]);
                iTrustedWebActivityService_Parcel.copydefault++;
                c3 = 2;
            }
        }
        String str = new String(cArr3);
        int i16 = $10 + 115;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.AboutActivity.onPause():void");
    }

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext = context;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        b(false, new int[]{0, 18, 0, 0}, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b(false, new int[]{18, 5, 0, 0}, new byte[]{1, 0, 0, 0, 1}, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue >= 99000) {
            int i2 = ShareDataUIState + 99;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (iIntValue <= 99999) {
                return;
            }
        }
        if (applicationContext != null) {
            if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
                int i3 = ShareDataUIState + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        if (applicationContext != null) {
            int i5 = component1 + 113;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0) + 43, (char) Color.blue(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = new Object[1];
                c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) - 31, new char[]{41943, 41910, 55272, 44228, 59333, 4574, 12171, 20405, 24274, 45238, 1496, 804, 31567, 33846, 10529, 5900, 26386, 38858, 23686, 26847, 4837, 64444, 16522, 31848, 15890, 53090, 29757, 20564, 10779, 53981, 26497, 42449, 54777, 9960, 35797, 47423, 49426, 2620, 48959, 36156, 60689, 7640, 41656, 40576, 39081, 24961, 54919, 62048, 33919, 30062, 64055, 50795}, objArr3);
                String str = (String) objArr3[0];
                Object[] objArr4 = new Object[1];
                b(true, new int[]{67, 64, 156, 46}, new byte[]{1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, objArr4);
                String str2 = (String) objArr4[0];
                Object[] objArr5 = new Object[1];
                b(false, new int[]{131, 64, 21, 0}, new byte[]{1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0}, objArr5);
                String str3 = (String) objArr5[0];
                Object[] objArr6 = new Object[1];
                c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952715_res_0x7f13044b).substring(6, 7).length(), new char[]{26559, 26583, 40679, 58758, 44248, 23174, 23982, 35736, 11489, 63924, 20105, 29021, 48929, 52591, 25138, 25905, 41840, 56976, 6090, 6895, 55006, 45748, 2960, 3676, 64047, 34409, 16245, Typography.notEqual, 61033, 39838, 11410, 55204, 4502, 28647, 49370, 51977, 1406, 17185, 62566, 65296, 10540, 21659, 59815, 60576, 23699, 10441, 40411, 32787, 16450, 15396, 45435, 46100, 29740, 4493, 42671, 43489, 26522, 58830, 23263, 23885, 35662, 63780, 20093, 29011, 48928, 51858, 25569, 26300, 41677, 56989, 6103, 6888, 54862, 45600, 2834, 3649}, objArr6);
                String str4 = (String) objArr6[0];
                Object[] objArr7 = new Object[1];
                b(false, new int[]{195, 6, 0, 5}, new byte[]{0, 1, 1, 0, 1, 0}, objArr7);
                String str5 = (String) objArr7[0];
                Object[] objArr8 = new Object[1];
                c(-TextUtils.lastIndexOf("", '0', 0), new char[]{30855, 30947, 15954, 17782, 6005, 57662, 4626, 38119, 25371, 22792, 62825, 16062, 40962, 28127, 55703, 10948, 48203, 32366, 44135, 21781, 51682, 4609, 45090, 16885, 58647, 9947, 34009, 28117, 61769, 15162, 38755, 38985, 3827, 52999, 31546, 33958, 6726, 58323, 20360, 45300}, objArr8);
                Object[] objArr9 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr8[0], Integer.valueOf(CacheConstants.DAY)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 6562, Color.alpha(0) + 56, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr9);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public static void $r8$lambda$CGZ8qXhBV1Dfi4gjMddH4zvYSFk(AboutActivity aboutActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        m10254instrumented$0$initEvent$V(aboutActivity, view);
        int i4 = component1 + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$OSKGeKx1rquPtlw_XzOk_PsfsmU(AboutActivity aboutActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        aboutActivity.lambda$addObserver$2(resource);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$Y3jLaBzglsz9Uf9swbflX0q4Cuc(View view) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10255instrumented$1$initEvent$V(view);
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        int i5 = component1 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10254instrumented$0$initEvent$V(AboutActivity aboutActivity, View view) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                aboutActivity.lambda$initEvent$0(view);
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            aboutActivity.lambda$initEvent$0(view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 89;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10255instrumented$1$initEvent$V(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                lambda$initEvent$1(view);
                Callback.onClick_exit();
                int i4 = 41 / 0;
            } else {
                lambda$initEvent$1(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        int i5 = component1 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }
}
