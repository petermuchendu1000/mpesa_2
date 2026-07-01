package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalKycGroup;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityProfileBinding;
import com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter;
import com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfilesAdapter;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import org.bouncycastle.math.Primes;

public class ProfileActivity extends Hilt_ProfileActivity<ProfileActivityProfileBinding, ProfileViewModel> {
    private ProfileInfoAdapter profileInfoAdapter;
    private ProfilesAdapter profilesAdapter;
    private static final byte[] $$l = {115, -125, 45, -41};
    private static final int $$o = 161;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_CHR, -39, 98, -44, Ascii.ETB, 9, -52, 62, Ascii.SYN, 8, 4, 10, Ascii.FF, 10, -40, 62, Ascii.FS, 2, Ascii.CAN, -6, Ascii.CAN, -57, 62, Ascii.SUB, Ascii.VT, -55, Ascii.RS, 58, Ascii.VT, -23, 44, 0, Ascii.FF, -54, Ascii.EM, -3, Ascii.CAN, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54, Ascii.ETB, 9, -52, 68, 19, Ascii.VT, 3, Ascii.DLE, 4, -44, 62, Ascii.CAN, 1, Ascii.EM, 8, 5, 6, -43, 74, -1, Ascii.RS, -4, Ascii.CAN, 2, 3, Ascii.SYN, -51, 70, Ascii.DLE, 17, -4, Ascii.CAN, 7, -2, Ascii.SYN, -51, 45, Ascii.FS, Ascii.FS, -4, 13, Ascii.DC2, 0, Ascii.FF, Ascii.NAK, 4, -7, 40, -4, Ascii.FS, Ascii.FF, -3, -17, TarHeader.LF_NORMAL, 17, -40, 60, Ascii.VT, -6, 35, -74, Ascii.CAN, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -56};
    private static final int $$k = 36;
    private static final byte[] $$d = {Ascii.SI, 58, -59, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = Primes.SMALL_FACTOR_LIMIT;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static long component1 = -7106246753115843176L;
    private static char[] ShareDataUIState = {968, 41614, 16735, 57344, 34530, 9645, 50299, 27512, 2432, 43080, 20227, 60836, 35972, 13183, 53795, 28807, 5967, 46617, 21759, 64443, 39497, 14652, 57245, 32323, 7440, 50156, 5307, 46565, 22049, 63341, 37256, 13020, 25697, 50471, 9974, 34729, 57675, 16900, 41938, 3281, 28199, 53218, 10484, 35440, 60181, 21702, 46474, 5922, 28925, 53658, 13134, 39940, 64983, 24214, 12796, 37098, 29548, 53873, 46301, 6037, 63053, 22866, 15281, 39487, 32037, 57307, 48835, 284, 57429, 17081, 9532, 33910, 26334, 51655, 43087, 2820, 60856, 19489, 12144, 61837, 20679, 13133, 37380, 29932, 55154, 46719, 6275, 64407, 23057, 15701, 40934, 32289, 49529, 41917, 663, 58648, 17489, 9919, 35189, 26750, 51941, 44489, 3148, 61274, 45502, 4211, 62333, 21986, 13464, 38668, 30209, 55487, 47913, 6782, 64694, 24526, 15959, 33038, 3141, 44299, 20183, 61336, 35179, 10796, 52211, 25777, 1549, 42961, 16532, 3138, 44301, 20189, 61337, 35179, 10797, 52215, 25787, 1543, 42961, 16540, 59804, 18648, 43790, 2630, 27833, 53242, 11814, 33134, 58325, 16903, 3138, 44301, 20189, 61337, 35179, 10797, 52215, 25787, 1543, 42961};
    private static long component2 = -7025641586833380033L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r5, int r6, byte r7) {
        /*
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.$$l
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 + 103
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r5 = r5 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            r4 = r0[r5]
            int r3 = r3 + 1
        L25:
            int r6 = r6 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.$$r(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.$$d
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-8)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.h(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 10
            int r6 = r6 * 4
            int r6 = 99 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.$$j
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.i(byte, byte, short, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.profile_activity_profile;
        int i5 = component3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.profile_info_title1));
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 31;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 34 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.getOffsetAfter("", 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 51268), -1883291598, false, $$r(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 13;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(char r33, int r34, int r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.g(char, int, int, java.lang.Object[]):void");
    }

    private void lambda$onCreate$0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        LocalKycGroup item = this.profilesAdapter.getItem(i);
        Intent intent = new Intent(this, (Class<?>) DynamicsKycActivity.class);
        intent.putExtra(DynamicsKycActivity.KEY_GUIGROUP, item);
        startActivity(intent);
        int i3 = copydefault + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 100, new char[]{37317, 37284, 51342, 12777, 58476, 39185, 30094, 60589, 5658, 49224, 48489, 29304, 23010, 61643, 44142, 49483, 15835, 38131, 34823, 58778, 294, 47107}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{48149, 48248, 55405, 8477, 50825, 10152, 22613, 13518, 52442}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4034), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 83, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() - 1, new char[]{49210, 49241, 18342, 48858, 29835, 41887, 9339, 25497, 34539, 20649, 34696, 18678, 2050, 32763, 15581, 64508, 27701, 7118, 6369, 57112, 20677, 14125}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getFadingEdgeLength() >> 16), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) - 45, new char[]{43667, 43762, 60710, 5142, 45009, 62583, 20097, 51468, 24050, 35751, 53328, 7946, 25323, 54564, 59294, 44112, 1734, 45392, 50153, 35003, 14945, 40382, 57189, 25748, 56902, 31128, 15106, 16544, 62079, 17871, 6014, 23757, 38413, 8818, 29338, 14203, 35798, 3678, 20208, 4864, 45029, 60002, 43719, 61236, 17357, 63059, 34488, 52156, 26411, 53940, 57944, 42959}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, new char[]{48403, 48417, 33332, 31577, 53644, 58883, 22791, 42560, 9133, 62968, 49781, 3369, 30057, 47726, 39366, 48766, 4422, 56858, 48560, 39629, 11696, 62192, 41271, 30432, 51607, 5762, 17755, 21205, 58867, 10971, 26915, 20201, 33241, 19812, 3221, 9564, 39939, 24904, 12540, 368, 47154, 34160, 54474, 64789, 21528, 39184, 63726, 55707, 28921, 48633, 39942, 46527, 3271, 53714, 32782, 37248, 10480, 62908, 42029, 36350, 50397, 2155, 20382, 26626, 58172, 11333, 29621, 17447}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{62586, 62538, 19257, 45654, 15671, 6738, 4207, 28493, 53021, 6425, 15911, 61741, 15364, 29540, 29988, 16936, 22561, 5907, 20822, 26312, 25743, 15276, 19850, 35507, 33020, 57308, 43491, 44756, 44182, 58323, 34241, 45805, 51426, 33888, 57376, 55644, 54634, 43081, 56396, 64806, 61711, 19583, 14451, 279, 7461, 20497, 5214, 9625, 14790, 29946, 28849, 18921, 17915, 6360, 27836, 28127, 24991, 15547, 18635, 29088, 36323, 49458, 41775, 37900, 43600, 58695, 40710, 47225}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) - 111, new char[]{22064, 22104, 60295, 4858, 16180, 42048, 45671, 53229, 52562, 6987, 32827, 20267, 40526, 54174, 30512, 64639, 64111, 47081, 21272, 55449, 50833, 39765, 20418, 13490, 8880, 32624, 44023, 4230, 3782, 17263, 34768, 3242, 27305, 9374, 57896, 26463, 30577, 2208, 56852, 17214, 21267, 60610, 14949, 48902, 48956, 61688, 5721, 39901, 39901, 54301, 29353, 63394, 59363, 47148, 28413, 54223, 50053, 40023, 19165, 53227, 12193, 24981, 41279, 10845, 2143, 17835, 40275, 1642, 5186, 10652, 63845, 25094, 28721, 3577, 54608, 24103}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).length() + 6387), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, Gravity.getAbsoluteGravity(0, 0) + 6, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 110, new char[]{51545, 51517, 47683, 17275, 49841, 21784, 11593, 40549, 12482, 59030, 28988, 48693, 316, 33306, 35496, 3438, 25861, 58915, 44680, 10631, 23036, 51924, 45645, 50687, 48601, 12022, 22118, 57815, 37303, 4863, 31260, 64931, 62877, 30026, 8181, 38420, 59416, 22886, 9159, 45630}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 56, (char) ((-1) - MotionEvent.axisFromString("")), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2405;
            int trimmedLength = TextUtils.getTrimmedLength("") + 26;
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            Object[] objArr13 = new Object[1];
            h((byte) 96, r9[37], (byte) (-$$d[30]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, trimmedLength, cCombineMeasuredStates, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i2 = component3 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2406;
                int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0);
                char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$d;
                byte b2 = (byte) (-bArr[94]);
                byte b3 = (byte) (-bArr[30]);
                Object[] objArr14 = new Object[1];
                h((byte) 93, b2, b3, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iLastIndexOf2, scrollBarSize, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 31, new char[]{38899, 38809, 64141, 997, 29401, 481, 29689, 56996, 32957, 22250, 9674, 60059, 24540, 49818, 15028, 22913, 15340, 42724, 7846, 32113}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 96, new char[]{59052, 59077, 32284, 34673, 23631, 30143, 764, 23093, 44600, 30842, 20876, 40650, 11948, 17985, 5137, 11713, 19075, 8811, 12322, 2344}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -563800442};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                i(bArr2[31], bArr2[18], bArr2[65], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr2[31];
                byte b5 = b4;
                Object[] objArr19 = new Object[1];
                i(b4, b5, (byte) (b5 | 32), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i4 = 2406 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    h((byte) 93, (byte) (-bArr3[94]), (byte) (-bArr3[30]), objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i4, absoluteGravity, cResolveSizeAndState, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26713), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(4) - 75, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(Color.blue(0) + 1, new char[]{58009, 58108, 56380, 9561, 61243, 55492, 1742, 63505, 7496, 51994, 64706, 13231, 10932, 58473, 42878, 32952, 20124, 32833, 33619}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2405;
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte b6 = $$d[32];
                        Object[] objArr23 = new Object[1];
                        h((byte) 84, b6, b6, objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, iResolveSizeAndState, longPressTimeout, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        byte[] bArr4 = $$d;
                        byte b7 = bArr4[37];
                        byte b8 = (byte) (-bArr4[30]);
                        Object[] objArr24 = new Object[1];
                        h((byte) 96, b7, b8, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2405 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, (char) (AndroidCharacter.getMirror('0') - '0'), -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i5 = ((int[]) objArr[0])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 == i5) {
            int i7 = copydefault + 83;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            long j = -1;
            long j2 = ((long) (i6 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 6619, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr25 = {-1390305644, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6562, 56 - TextUtils.getTrimmedLength(""), (char) Color.red(0));
                byte b9 = $$j[31];
                byte b10 = b9;
                Object[] objArr26 = new Object[1];
                i(b9, b10, (byte) (b10 | 32), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i9 = component3 + 77;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        ((ProfileActivityProfileBinding) this.binding).profilesList.setLayoutManager(new LinearLayoutManager(this));
        this.profilesAdapter = new ProfilesAdapter(R.layout.profile_item_profile, new ArrayList());
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(ColorUtils.getColor(R.color.colorSecondLevelBorder), ConvertUtils.dp2px(1 + 0.0f));
        recycleViewDivider.setPadding(getResources().getDimensionPixelOffset(R.dimen.level3), 0, getResources().getDimensionPixelOffset(R.dimen.level3), 0);
        ((ProfileActivityProfileBinding) this.binding).profilesList.addItemDecoration(recycleViewDivider);
        ((ProfileActivityProfileBinding) this.binding).profilesList.setAdapter(this.profilesAdapter);
        this.profilesAdapter.setOnItemClickListener(new OnItemClickListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                int i12 = 2 % 2;
                int i13 = component3 + 21;
                component2 = i13 % 128;
                int i14 = i13 % 2;
                ProfileActivity.m10884$r8$lambda$Qa4T9CHHSNx2heRiKkwwLGsJK8(this.f$0, baseQuickAdapter, view, i11);
                int i15 = component2 + 41;
                component3 = i15 % 128;
                int i16 = i15 % 2;
            }
        });
        ((ProfileActivityProfileBinding) this.binding).profilesRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.profileInfoAdapter = new ProfileInfoAdapter();
        ((ProfileActivityProfileBinding) this.binding).profilesRecycler.addItemDecoration(recycleViewDivider);
        ((ProfileActivityProfileBinding) this.binding).profilesRecycler.setAdapter(this.profileInfoAdapter);
        ((ProfileViewModel) this.viewModel).getKycInfo();
        addObserve();
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) + 3947), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 32, 26 - ExpandableListView.getPackedPositionType(0L), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() - 3, new char[]{49210, 49241, 18342, 48858, 29835, 41887, 9339, 25497, 34539, 20649, 34696, 18678, 2050, 32763, 15581, 64508, 27701, 7118, 6369, 57112, 20677, 14125}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = copydefault + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6618, 42 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myTid() >> 22), 57 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 1), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i6 = component3 + 85;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        if (ProfileHelper.INSTANCE.getCustomer() == null) {
            return;
        }
        ((ProfileActivityProfileBinding) this.binding).profilemgt.profilesName.setText(R.string.mgt_account_life);
        ((ProfileActivityProfileBinding) this.binding).profilemgt.profilesValue.setVisibility(8);
        ((ProfileActivityProfileBinding) this.binding).profilemgt.profilesImg.setVisibility(8);
        ((ProfileActivityProfileBinding) this.binding).profilemgt.ivEditMore.setVisibility(0);
        ((ProfileActivityProfileBinding) this.binding).profilemgt.getRoot().setOnClickListener(new View.OnClickListener(this) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onClick(View view) {
                int i8 = 2 % 2;
                Callback.onClick_enter(view);
                try {
                    String string = SPUtils.getInstance().getString(KeysConstants.KEY_DEREGISTER_MERCHANT_URL, "");
                    if (!TextUtils.isEmpty(string)) {
                        RouteUtils.routeWithExecute(string);
                        return;
                    }
                    int i9 = copydefault + 1;
                    component2 = i9 % 128;
                    int i10 = i9 % 2;
                    Callback.onClick_exit();
                    int i11 = copydefault + 17;
                    component2 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 93 / 0;
                    }
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        List<LocalProfileItem> profiles = ProfileHelper.INSTANCE.getProfiles();
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(profiles)) {
            int i8 = component3 + 3;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            int i10 = copydefault + 55;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            for (LocalProfileItem localProfileItem : profiles) {
                if ("picture".equals(localProfileItem.getType()) || !TextUtils.isEmpty(localProfileItem.getValue())) {
                    arrayList.add(localProfileItem);
                }
            }
        }
        this.profileInfoAdapter.submitList(arrayList);
        if (!arrayList.isEmpty()) {
            ((ProfileActivityProfileBinding) this.binding).profilesRecycler.setVisibility(0);
            return;
        }
        int i12 = component3 + 47;
        copydefault = i12 % 128;
        if (i12 % 2 == 0) {
            ((ProfileActivityProfileBinding) this.binding).profilesRecycler.setVisibility(109);
        } else {
            ((ProfileActivityProfileBinding) this.binding).profilesRecycler.setVisibility(8);
        }
    }

    private void addObserve() {
        int i = 2 % 2;
        ((ProfileViewModel) this.viewModel).getKycInfoData().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ProfileActivity.m10885$r8$lambda$fxWyE4Et_1KK3eoA6zIlaqdbF8(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 121;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$addObserve$1(Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (resource.loading()) {
            int i4 = copydefault + 91;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                DialogManager.showLoading(this);
                return;
            } else {
                DialogManager.showLoading(this);
                obj.hashCode();
                throw null;
            }
        }
        DialogManager.hideLoading(this);
        if (resource.error()) {
            int i5 = copydefault + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            ToastUtils.showLong(resource.getMessage());
            return;
        }
        this.profilesAdapter.setNewInstance(ProfileHelper.INSTANCE.getKycGroups());
        if (!CollectionUtils.isNotEmpty(ProfileHelper.INSTANCE.getKycGroups())) {
            ((ProfileActivityProfileBinding) this.binding).profilesList.setVisibility(8);
        } else {
            ((ProfileActivityProfileBinding) this.binding).profilesList.setVisibility(0);
        }
        int i7 = copydefault + 59;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = copydefault + 83;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) + 3962), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 26 - View.MeasureSpec.getSize(0), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{49210, 49241, 18342, 48858, 29835, 41887, 9339, 25497, 34539, 20649, 34696, 18678, 2050, 32763, 15581, 64508, 27701, 7118, 6369, 57112, 20677, 14125}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = copydefault + 95;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.green(0) + 42, (char) TextUtils.indexOf("", ""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6561, 55 - ExpandableListView.getPackedPositionChild(0L), (char) KeyEvent.keyCodeFromString(""), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
        int i8 = copydefault + 1;
        component3 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 73 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08c0 A[Catch: all -> 0x0a0f, TryCatch #52 {all -> 0x0a0f, blocks: (B:115:0x08b6, B:116:0x08ba, B:118:0x08c0, B:121:0x08dd, B:80:0x05b1, B:83:0x066e, B:101:0x0783, B:104:0x07d2, B:110:0x0847, B:114:0x08ae), top: B:924:0x05b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0aed A[Catch: all -> 0x03cf, TryCatch #24 {all -> 0x03cf, blocks: (B:181:0x0ae7, B:183:0x0aed, B:184:0x0b12, B:267:0x0f9e, B:269:0x0fa4, B:270:0x0fcb, B:441:0x1781, B:443:0x1787, B:444:0x17b4, B:746:0x3155, B:748:0x315b, B:749:0x3186, B:783:0x34ae, B:785:0x34b4, B:786:0x34db, B:763:0x32dd, B:765:0x3300, B:766:0x3357, B:706:0x2da3, B:708:0x2da9, B:709:0x2dd5, B:806:0x35b7, B:808:0x35bd, B:809:0x35ec, B:811:0x3626, B:812:0x3669, B:592:0x253e, B:594:0x2553, B:595:0x257e, B:597:0x25b2, B:598:0x2633, B:570:0x2194, B:572:0x219a, B:573:0x21c6, B:575:0x2200, B:576:0x224f, B:543:0x1eb0, B:545:0x1ec5, B:546:0x1efa, B:527:0x1cc3, B:529:0x1cc9, B:530:0x1cf0, B:313:0x11ec, B:315:0x11f2, B:316:0x121a, B:24:0x01f0, B:26:0x01f6, B:27:0x0220, B:29:0x033e, B:31:0x036f, B:32:0x03c9, B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90, B:614:0x2844, B:616:0x284a, B:617:0x288f, B:619:0x28b6, B:620:0x28fc, B:622:0x290f, B:624:0x2918, B:625:0x2958, B:658:0x2bad, B:659:0x2bb1, B:661:0x2bb7, B:664:0x2bcf, B:667:0x2bdc, B:669:0x2bdf, B:681:0x2cbe, B:683:0x2cc4, B:684:0x2cc5, B:686:0x2cc7, B:688:0x2cce, B:689:0x2ccf, B:628:0x2967, B:630:0x296b, B:634:0x2977, B:636:0x297d, B:648:0x2a92, B:650:0x2a98, B:651:0x2ad8, B:653:0x2b02, B:654:0x2b49, B:656:0x2b5f, B:657:0x2ba7, B:691:0x2cd1, B:693:0x2cd8, B:694:0x2cd9, B:696:0x2cdb, B:698:0x2ce2, B:699:0x2ce3, B:276:0x105d, B:278:0x1061, B:299:0x114c, B:301:0x1152, B:302:0x1153, B:304:0x1155, B:306:0x115c, B:307:0x115d, B:282:0x106d), top: B:875:0x01f0, inners: #12, #34, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0fa4 A[Catch: all -> 0x03cf, TryCatch #24 {all -> 0x03cf, blocks: (B:181:0x0ae7, B:183:0x0aed, B:184:0x0b12, B:267:0x0f9e, B:269:0x0fa4, B:270:0x0fcb, B:441:0x1781, B:443:0x1787, B:444:0x17b4, B:746:0x3155, B:748:0x315b, B:749:0x3186, B:783:0x34ae, B:785:0x34b4, B:786:0x34db, B:763:0x32dd, B:765:0x3300, B:766:0x3357, B:706:0x2da3, B:708:0x2da9, B:709:0x2dd5, B:806:0x35b7, B:808:0x35bd, B:809:0x35ec, B:811:0x3626, B:812:0x3669, B:592:0x253e, B:594:0x2553, B:595:0x257e, B:597:0x25b2, B:598:0x2633, B:570:0x2194, B:572:0x219a, B:573:0x21c6, B:575:0x2200, B:576:0x224f, B:543:0x1eb0, B:545:0x1ec5, B:546:0x1efa, B:527:0x1cc3, B:529:0x1cc9, B:530:0x1cf0, B:313:0x11ec, B:315:0x11f2, B:316:0x121a, B:24:0x01f0, B:26:0x01f6, B:27:0x0220, B:29:0x033e, B:31:0x036f, B:32:0x03c9, B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90, B:614:0x2844, B:616:0x284a, B:617:0x288f, B:619:0x28b6, B:620:0x28fc, B:622:0x290f, B:624:0x2918, B:625:0x2958, B:658:0x2bad, B:659:0x2bb1, B:661:0x2bb7, B:664:0x2bcf, B:667:0x2bdc, B:669:0x2bdf, B:681:0x2cbe, B:683:0x2cc4, B:684:0x2cc5, B:686:0x2cc7, B:688:0x2cce, B:689:0x2ccf, B:628:0x2967, B:630:0x296b, B:634:0x2977, B:636:0x297d, B:648:0x2a92, B:650:0x2a98, B:651:0x2ad8, B:653:0x2b02, B:654:0x2b49, B:656:0x2b5f, B:657:0x2ba7, B:691:0x2cd1, B:693:0x2cd8, B:694:0x2cd9, B:696:0x2cdb, B:698:0x2ce2, B:699:0x2ce3, B:276:0x105d, B:278:0x1061, B:299:0x114c, B:301:0x1152, B:302:0x1153, B:304:0x1155, B:306:0x115c, B:307:0x115d, B:282:0x106d), top: B:875:0x01f0, inners: #12, #34, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1787 A[Catch: all -> 0x03cf, TryCatch #24 {all -> 0x03cf, blocks: (B:181:0x0ae7, B:183:0x0aed, B:184:0x0b12, B:267:0x0f9e, B:269:0x0fa4, B:270:0x0fcb, B:441:0x1781, B:443:0x1787, B:444:0x17b4, B:746:0x3155, B:748:0x315b, B:749:0x3186, B:783:0x34ae, B:785:0x34b4, B:786:0x34db, B:763:0x32dd, B:765:0x3300, B:766:0x3357, B:706:0x2da3, B:708:0x2da9, B:709:0x2dd5, B:806:0x35b7, B:808:0x35bd, B:809:0x35ec, B:811:0x3626, B:812:0x3669, B:592:0x253e, B:594:0x2553, B:595:0x257e, B:597:0x25b2, B:598:0x2633, B:570:0x2194, B:572:0x219a, B:573:0x21c6, B:575:0x2200, B:576:0x224f, B:543:0x1eb0, B:545:0x1ec5, B:546:0x1efa, B:527:0x1cc3, B:529:0x1cc9, B:530:0x1cf0, B:313:0x11ec, B:315:0x11f2, B:316:0x121a, B:24:0x01f0, B:26:0x01f6, B:27:0x0220, B:29:0x033e, B:31:0x036f, B:32:0x03c9, B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90, B:614:0x2844, B:616:0x284a, B:617:0x288f, B:619:0x28b6, B:620:0x28fc, B:622:0x290f, B:624:0x2918, B:625:0x2958, B:658:0x2bad, B:659:0x2bb1, B:661:0x2bb7, B:664:0x2bcf, B:667:0x2bdc, B:669:0x2bdf, B:681:0x2cbe, B:683:0x2cc4, B:684:0x2cc5, B:686:0x2cc7, B:688:0x2cce, B:689:0x2ccf, B:628:0x2967, B:630:0x296b, B:634:0x2977, B:636:0x297d, B:648:0x2a92, B:650:0x2a98, B:651:0x2ad8, B:653:0x2b02, B:654:0x2b49, B:656:0x2b5f, B:657:0x2ba7, B:691:0x2cd1, B:693:0x2cd8, B:694:0x2cd9, B:696:0x2cdb, B:698:0x2ce2, B:699:0x2ce3, B:276:0x105d, B:278:0x1061, B:299:0x114c, B:301:0x1152, B:302:0x1153, B:304:0x1155, B:306:0x115c, B:307:0x115d, B:282:0x106d), top: B:875:0x01f0, inners: #12, #34, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1839 A[Catch: all -> 0x1c39, TryCatch #12 {all -> 0x1c39, blocks: (B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90), top: B:852:0x1833, outer: #24, inners: #1, #5, #55, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1888 A[Catch: all -> 0x1c39, TryCatch #12 {all -> 0x1c39, blocks: (B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90), top: B:852:0x1833, outer: #24, inners: #1, #5, #55, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x18e0 A[Catch: all -> 0x1c39, TRY_LEAVE, TryCatch #12 {all -> 0x1c39, blocks: (B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90), top: B:852:0x1833, outer: #24, inners: #1, #5, #55, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1b07 A[Catch: all -> 0x1c39, TryCatch #12 {all -> 0x1c39, blocks: (B:448:0x1833, B:450:0x1839, B:451:0x187b, B:453:0x1888, B:455:0x1891, B:456:0x18d5, B:479:0x1afd, B:480:0x1b01, B:482:0x1b07, B:485:0x1b1e, B:488:0x1b2b, B:490:0x1b2e, B:502:0x1c13, B:504:0x1c19, B:505:0x1c1a, B:507:0x1c1c, B:509:0x1c23, B:510:0x1c24, B:457:0x18e0, B:469:0x19e7, B:471:0x19ed, B:472:0x1a2e, B:474:0x1a58, B:475:0x1a9d, B:477:0x1ab3, B:478:0x1af7, B:512:0x1c26, B:514:0x1c2d, B:515:0x1c2e, B:517:0x1c30, B:519:0x1c37, B:520:0x1c38, B:464:0x1950, B:466:0x196c, B:467:0x19db, B:459:0x1900, B:461:0x1915, B:462:0x1949, B:498:0x1b98, B:493:0x1b5a, B:495:0x1b60, B:496:0x1b90), top: B:852:0x1833, outer: #24, inners: #1, #5, #55, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x1d75  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1dc7  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x1e90  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x2045  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x2152  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x234c  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x23b9  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x2415  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x2520  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x276f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x2e68  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x2ebb  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2f80  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x3136  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x3211  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x3264  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x32bf  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x348e  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x3576  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x0458 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:963:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v110 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v36, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v119 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v150 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v152 */
    /* JADX WARN: Type inference failed for: r12v153 */
    /* JADX WARN: Type inference failed for: r12v154 */
    /* JADX WARN: Type inference failed for: r12v155 */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v157 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v76 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r13v79 */
    /* JADX WARN: Type inference failed for: r13v80 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v87 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v53 */
    /* JADX WARN: Type inference failed for: r19v54 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v758, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v659 */
    /* JADX WARN: Type inference failed for: r3v660 */
    /* JADX WARN: Type inference failed for: r3v661 */
    /* JADX WARN: Type inference failed for: r3v675 */
    /* JADX WARN: Type inference failed for: r3v676 */
    /* JADX WARN: Type inference failed for: r4v220 */
    /* JADX WARN: Type inference failed for: r4v527 */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v87, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v228, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v232 */
    /* JADX WARN: Type inference failed for: r6v252 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v421 */
    /* JADX WARN: Type inference failed for: r7v422 */
    /* JADX WARN: Type inference failed for: r7v423 */
    /* JADX WARN: Type inference failed for: r7v425 */
    /* JADX WARN: Type inference failed for: r7v426 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v138 */
    /* JADX WARN: Type inference failed for: r8v139 */
    /* JADX WARN: Type inference failed for: r8v141 */
    /* JADX WARN: Type inference failed for: r8v145, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v162 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v164 */
    /* JADX WARN: Type inference failed for: r8v165 */
    /* JADX WARN: Type inference failed for: r8v166 */
    /* JADX WARN: Type inference failed for: r8v167 */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v82 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r9v332, types: [int[]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.ProfileActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10884$r8$lambda$Qa4T9CHHSNx2heRiKkwwLGsJK8(ProfileActivity profileActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        profileActivity.lambda$onCreate$0(baseQuickAdapter, view, i);
        int i5 = copydefault + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m10885$r8$lambda$fxWyE4Et_1KK3eoA6zIlaqdbF8(ProfileActivity profileActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        profileActivity.lambda$addObserve$1(resource);
        int i4 = copydefault + 47;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copydefault + 33;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }
}
