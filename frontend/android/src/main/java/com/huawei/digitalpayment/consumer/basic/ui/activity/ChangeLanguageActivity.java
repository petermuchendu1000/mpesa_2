package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.language.LanguageListBean;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityChangeLanguageBinding;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.ChangeLanguageViewModel;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.mobileapp.resourcelib.ResourceStringUtils;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;
import kotlin.cancelAll;
import org.apache.commons.lang3.CharUtils;

public class ChangeLanguageActivity extends Hilt_ChangeLanguageActivity<ActivityChangeLanguageBinding, ChangeLanguageViewModel> {
    private String currentLang = LanguageUtils.getInstance().getCurrentLang();
    private List<LanguageListBean.LanguageBean> data;
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = 51;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static char[] component3 = {30248, 30239, 30245, 30235, 30238, 30240, 30431, 30234, 30265, 30250, 30244, 30416, 30424, 30247, 30423, 30422, 30425, 30426, 30251, 30420, 30421, 30417, 30427, 30241, 30229, 30233, 30419, 30430, 30246, 30228, 30232, 30236, 30231, 30428};
    private static int component2 = 321287817;
    private static boolean component1 = true;
    private static boolean ShareDataUIState = true;
    private static char[] copydefault = {2018, 2016, 1051, 2024, 2038, 2030, 2022, 2041, 2031, 1968, 1975, 1973, 2004, 2025, 2034, 2029, 2032, 1985, 2005, 1969, 2021, 2017, 1976, 1970, 2036, 1966, 1977, 2020, 1974, 1971, 2023, 1972, 2019, 2028, 2037, 1050};
    private static char component4 = 12828;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.ChangeLanguageActivity.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r5 = r5 + 68
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ChangeLanguageActivity.$$c(byte, byte, int):java.lang.String");
    }

    private void lambda$onCreate$0(SelectAdapter selectAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        if (this.data.get(i).getLanguageCode().equals(this.currentLang)) {
            return;
        }
        Iterator<LanguageListBean.LanguageBean> it = this.data.iterator();
        while (it.hasNext()) {
            int i3 = copy + 61;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            it.next().setChecked(false);
        }
        this.data.get(i).setChecked(true);
        this.currentLang = this.data.get(i).getLanguageCode();
        selectAdapter.notifyDataSetChanged();
        int i5 = getAsAtTimestamp + 115;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ChangeLanguageActivity.onCreate(android.os.Bundle):void");
    }

    private void initObserve() {
        int i = 2 % 2;
        ((ChangeLanguageViewModel) this.viewModel).getData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ChangeLanguageActivity changeLanguageActivity = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    ChangeLanguageActivity.$r8$lambda$vZz4rMJtTSM_Vj972lt1ZPa3214(changeLanguageActivity, resource);
                } else {
                    ChangeLanguageActivity.$r8$lambda$vZz4rMJtTSM_Vj972lt1ZPa3214(changeLanguageActivity, resource);
                    throw null;
                }
            }
        });
        int i2 = copy + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        char c2 = '0';
        int i3 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(i3, i3) + 3760, TextUtils.indexOf("", c2) + 25, (char) Gravity.getAbsoluteGravity(i3, i3), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    c2 = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(component2)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, (char) TextUtils.indexOf("", ""), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i6 = 689978476;
            int i7 = 5;
            if (ShareDataUIState) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i7;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 2748, 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 7645), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        i7 = 5;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                String str = new String(cArr4);
                int i10 = $10 + 115;
                $11 = i10 % 128;
                if (i10 % 2 != 0) {
                    objArr[0] = str;
                    return;
                } else {
                    int i11 = 55 / 0;
                    objArr[0] = str;
                    return;
                }
            }
            if (!component1) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i12 = $10 + 109;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i14 = $11 + 35;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i6);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 5;
                    byte b7 = (byte) (b6 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 19, (char) (7643 - MotionEvent.axisFromString("")), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i6 = 689978476;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private void lambda$initObserve$1(Resource resource) {
        int i = 2 % 2;
        if (resource == null) {
            return;
        }
        if (!(!resource.success())) {
            refreshMenu();
            DialogManager.hideLoading(this);
        }
        if (resource.error()) {
            int i2 = copy + 111;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DialogManager.hideLoading(this);
            if (resource.getException() != null) {
                int i4 = getAsAtTimestamp + 83;
                copy = i4 % 128;
                int i5 = i4 % 2;
                ToastUtils.showShort(resource.getException().getResponseDesc());
            }
        }
        int i6 = getAsAtTimestamp + 15;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void refreshMenu() {
        int i = 2 % 2;
        ResourceStringUtils.init();
        ValidatorManager.INSTANCE.refreshValidatorConfig();
        Bundle bundle = new Bundle(1);
        bundle.putString(KeysConstants.KEY_EXECUTE, RoutePathConstants.EXECUTE_MY);
        RouteUtils.routeWithExecute(null, RoutePathConstants.MAIN, bundle, null, null, 268435456);
        int i2 = getAsAtTimestamp + 125;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void rightBtnClick() {
        int i = 2 % 2;
        int i2 = copy + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.rightBtnClick();
        if (!LanguageUtils.getInstance().getCurrentLang().equals(this.currentLang)) {
            DialogManager.showLoading(this.activity);
            ((ChangeLanguageViewModel) this.viewModel).changeLanguage(this.currentLang);
        } else {
            finish();
            int i4 = copy + 51;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copy + 35;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String string = getString(R.string.mine_change_language_title1);
        if (i3 != 0) {
            super.initToolbar(string, getString(R.string.mine_change_language_button1));
        } else {
            super.initToolbar(string, getString(R.string.mine_change_language_button1));
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_change_language;
        int i5 = getAsAtTimestamp + 5;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            c(new char[]{23, 3, JSONLexer.EOI, 15, 7, 14, 28, JSONLexer.EOI, 22, 15, CharUtils.CR, 28, 14, '#', 25, '\f', 1, 16, 25, 6, 15, 0, 20, JSONLexer.EOI, 27, '!'}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 77), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{'!', '#', 13823, 13823, 23, 2, 29, '\f', 13825, 13825, 31, 15, '!', 20, 25, '\f', 11, 2}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 23), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getAsAtTimestamp + 79;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = getAsAtTimestamp + 85;
                copy = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6619, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, 56 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = copydefault;
        Object obj2 = null;
        int i5 = 8;
        if (cArr3 != null) {
            int i6 = $11 + 81;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 7422, (ViewConfiguration.getWindowTouchSlop() >> i5) + 15, (char) (64290 - TextUtils.lastIndexOf("", '0', 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(component4)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7422, KeyEvent.normalizeMetaState(0) + 15, (char) (64291 - Color.green(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 87;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                int i8 = $10 + 113;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i10 = $10 + 71;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, (char) (ExpandableListView.getPackedPositionType(0L) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i12 = $11 + 49;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 2944, ExpandableListView.getPackedPositionChild(0L) + 25, (char) (ExpandableListView.getPackedPositionType(0L) + 27637), 794909189, false, $$c((byte) $$b, b3, b3), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i14];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i15 = $11 + 15;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i17 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i17];
                            cArr4[cancelall.component2 + 1] = cArr3[i18];
                        } else {
                            int i19 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i20 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i19];
                            cArr4[cancelall.component2 + 1] = cArr3[i20];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ChangeLanguageActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.ChangeLanguageActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10258$r8$lambda$OuAOBVyUQbEI0mp7RmGBKoY1U(ChangeLanguageActivity changeLanguageActivity, SelectAdapter selectAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 123;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        changeLanguageActivity.lambda$onCreate$0(selectAdapter, baseQuickAdapter, view, i);
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = getAsAtTimestamp + 23;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$vZz4rMJtTSM_Vj972lt1ZPa3214(ChangeLanguageActivity changeLanguageActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        changeLanguageActivity.lambda$initObserve$1(resource);
        int i4 = copy + 29;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 105;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }
}
