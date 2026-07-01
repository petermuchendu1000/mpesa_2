package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/MakeUrBundleSpinnerAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleValidationItem;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "getDropDownView", "Landroid/view/View;", "position", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getView", "isEnabled", "", "areAllItemsEnabled", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleSpinnerAdapter extends ArrayAdapter<MakeUrBundleValidationItem> {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static int component3;
    private final List<MakeUrBundleValidationItem> component2;
    private static final byte[] $$c = {78, -86, -128, -128};
    private static final int $$d = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.SI, -12, 105, 108, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 234;
    private static int copydefault = 0;
    private static int component4 = 1;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r7, byte r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.$$c
            int r9 = r9 * 3
            int r9 = r9 + 102
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.$$e(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.$$a
            int r5 = r5 * 2
            int r5 = 99 - r5
            int r6 = r6 * 4
            int r1 = r6 + 10
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r5 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2b:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-26)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.b(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeUrBundleSpinnerAdapter(Context context, List<MakeUrBundleValidationItem> list) {
        super(context, R.layout.item_make_ur_bundle_spinner_selected, R.id.tv_spinner_option, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = list;
        setDropDownViewResource(R.layout.item_make_ur_bundle_spinner_dropdown);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 107;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        View dropDownView = super.getDropDownView(position, convertView, parent);
        TextView textView = (TextView) dropDownView.findViewById(R.id.tv_spinner_option);
        View viewFindViewById = dropDownView.findViewById(R.id.divider_bottom);
        textView.setText(this.component2.get(position).getName());
        if (position == 0) {
            textView.setTextColor(ContextCompat.getColor(getContext(), android.R.color.darker_gray));
        } else {
            textView.setTextColor(ContextCompat.getColor(getContext(), android.R.color.black));
        }
        if (viewFindViewById != null) {
            int i5 = copydefault + 115;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            if (position == getCount() - 1) {
                i = 101;
                int i7 = component4 + 101;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    i = 8;
                }
            } else {
                i = 0;
            }
            viewFindViewById.setVisibility(i);
        }
        Intrinsics.checkNotNull(dropDownView);
        return dropDownView;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[PHI: r5 r6
  0x0050: PHI (r5v4 android.view.View) = (r5v1 android.view.View), (r5v5 android.view.View) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r6v6 android.widget.TextView) = (r6v3 android.widget.TextView), (r6v9 android.widget.TextView) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r5 r6
  0x003d: PHI (r5v2 android.view.View) = (r5v1 android.view.View), (r5v5 android.view.View) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r6v4 android.widget.TextView) = (r6v3 android.widget.TextView), (r6v9 android.widget.TextView) binds: [B:8:0x003b, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.component4
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.copydefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            android.view.View r5 = super.getView(r4, r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            int r6 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_spinner_option
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 50
            int r1 = r1 / 0
            if (r4 != 0) goto L50
            goto L3d
        L29:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            android.view.View r5 = super.getView(r4, r5, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            int r6 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_spinner_option
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r4 != 0) goto L50
        L3d:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.copydefault
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L4b
            r0 = 17170432(0x1060000, float:2.4611913E-38)
            goto L53
        L4b:
            r4 = 0
            r4.hashCode()
            throw r4
        L50:
            r0 = 17170444(0x106000c, float:2.4611947E-38)
        L53:
            android.content.Context r1 = r3.getContext()
            int r0 = androidx.core.content.ContextCompat.getColor(r1, r0)
            r6.setTextColor(r0)
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem> r0 = r3.component2
            java.lang.Object r4 = r0.get(r4)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem r4 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem) r4
            java.lang.String r4 = r4.getName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.setText(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r24, char[] r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.MakeUrBundleSpinnerAdapter.a(int, char[], java.lang.Object[]):void");
    }

    @Override
    public boolean areAllItemsEnabled() throws Throwable {
        String str;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0', 0), 34 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19696), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(61000 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{57430, 3600, 15553, 10910, 22908, 18227, 30181, 25574, 37392, 32981, 44739, 56647, 52002, 63985, 59325, 5653, 1226, 12973, 8569, 20275, 32224, 27553}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(15970 - TextUtils.lastIndexOf("", '0', 0), new char[]{57426, 56888, 40080, 23406, 6600, 55229, 38401, 21712, 4938, 53549, 36741, 19970, 3322, 52061, 35128}, objArr2);
        long j = -318;
        int i3 = -1;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -1;
        long j3 = j2 ^ 2986091946330414751L;
        long j4 = j2 ^ 1469631150276095574L;
        int i4 = i2;
        long jNextInt = new Random().nextInt(833203387);
        long j5 = (((long) (-317)) * 2986091946330414751L) + (((long) 319) * 1469631150276095574L) + (((((j3 | j4) | jNextInt) ^ j2) | (((jNextInt ^ j2) | 4428656914816040671L) ^ j2)) * j) + (j * (((j4 | 2986091946330414751L) ^ j2) | ((jNextInt | 2986091946330414751L) ^ j2))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j4 | ((j3 | jNextInt) ^ j2)));
        int i5 = 0;
        while (true) {
            if (i5 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 31 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + i3), 846241313, false, "copydefault", null);
                }
                int i6 = ((Field) objCopydefault2).getInt(null);
                int i7 = 0;
                long j6 = jLongValue;
                while (true) {
                    int i8 = copydefault + 3;
                    component4 = i8 % 128;
                    int i9 = i8 % 2;
                    for (int i10 = 0; i10 != 8; i10++) {
                        i6 = (((((int) (j6 >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    }
                    if (i7 != 0) {
                        break;
                    }
                    int i11 = component4 + 39;
                    copydefault = i11 % 128;
                    int i12 = i11 % 2;
                    i7++;
                    j6 = j5;
                }
                int i13 = i4;
                if (i6 == i13) {
                    break;
                }
                int i14 = component4 + 87;
                copydefault = i14 % 128;
                if (i14 % 2 != 0) {
                    jLongValue -= 1024;
                    i5 += 125;
                } else {
                    jLongValue -= 1024;
                    i5++;
                }
                i4 = i13;
                i3 = -1;
            } else {
                Object[] objArr3 = new Object[1];
                a(28687 - Color.red(0), new char[]{57437, 36953, '_', 45179, 8229, 53264, 16396, 61488, 24616, 4254, 33010, 12523, 41200, 20608, 49280, 28859}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7349, new char[]{57438, 64742, 55608, 46662, 37527, 28631, 19581, 10429, 1495, 57867, 65366, 56216, 47112, 38249, 29109, 20169}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1241358506};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 1664, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 263341976, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int scrollDefaultDelay = 1454 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int i15 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        str = "";
                        char cIndexOf = (char) TextUtils.indexOf(str, str, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, i15, cIndexOf, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore(str, 0) + 1591, 39 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 1)), Boolean.TYPE});
                    } else {
                        str = "";
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i16 = ((int[]) objArr8[2])[0];
                    int i17 = ((int[]) objArr8[1])[0];
                    if (i17 != i16) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i18 = copydefault + 9;
                            component4 = i18 % 128;
                            int i19 = 2;
                            int i20 = i18 % 2 == 0 ? 1 : 0;
                            while (i20 < strArr.length) {
                                int i21 = component4 + 1;
                                copydefault = i21 % 128;
                                int i22 = i21 % i19;
                                arrayList.add(strArr[i20]);
                                i20++;
                                i19 = 2;
                            }
                        }
                        long j7 = -1;
                        long j8 = 0;
                        long j9 = (((j7 - ((j7 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i17 ^ i16))) | (((long) 1) << 32) | (j8 - ((j8 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6618, 42 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {-1241358506, Long.valueOf(j9), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - Process.getGidForName(str), 56 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.getMode(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        throw null;
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
        return false;
    }

    static {
        component3 = 0;
        component3();
        int i = component1 + 125;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean isEnabled(int position) {
        int i = 2 % 2;
        if (position != 0) {
            int i2 = copydefault + 93;
            component4 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = copydefault + 75;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    static void component3() {
        ShareDataUIState = -2715611259918262243L;
    }
}
