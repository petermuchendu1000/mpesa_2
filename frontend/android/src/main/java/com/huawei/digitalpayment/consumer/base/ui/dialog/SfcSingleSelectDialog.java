package com.huawei.digitalpayment.consumer.base.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.dialog.BaseDialog;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import com.huawei.digitalpayment.consumer.baseui.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public class SfcSingleSelectDialog<T> extends BaseDialog {
    private static int component3 = 1;
    private static int copydefault;
    private int ShareDataUIState = -1;
    private final List<T> component1;
    private final String component2;
    protected final OnItemSelectedListener<T> onItemSelectedListener;

    public interface OnItemSelectedListener<T> {
        void onItemSelected(int i, T t);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.dialog_select;
        int i5 = copydefault + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    protected int getItemLayoutId() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.item_dialog_select;
        int i5 = component3 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcSingleSelectDialog(String str, List<T> list, OnItemSelectedListener<T> onItemSelectedListener) {
        this.component2 = str;
        this.component1 = list;
        this.onItemSelectedListener = onItemSelectedListener;
    }

    @Override
    public void onStart() {
        Window window;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i4 = component3 + 103;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                window = dialog.getWindow();
                int i5 = 65 / 0;
                if (window == null) {
                    return;
                }
            } else {
                window = dialog.getWindow();
                if (window == null) {
                    return;
                }
            }
            int i6 = copydefault + 89;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                window.setGravity(90);
                window.setLayout(-1, 106);
                window.setWindowAnimations(R.style.BottomAnimation);
                dialog.setCanceledOnTouchOutside(false);
            } else {
                window.setGravity(80);
                window.setLayout(-1, -2);
                window.setWindowAnimations(R.style.BottomAnimation);
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setCancelable(true);
            int i7 = copydefault + 61;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private void copydefault(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copydefault + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void component2(View view) {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        dismiss();
        OnItemSelectedListener<T> onItemSelectedListener = this.onItemSelectedListener;
        if (onItemSelectedListener == null || (i = this.ShareDataUIState) == -1) {
            return;
        }
        int i5 = copydefault + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        onItemSelectedListener.onItemSelected(i, this.component1.get(i));
        if (i6 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component3(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        OnItemSelectedListener<T> onItemSelectedListener;
        int i2 = 2 % 2;
        int i3 = component3 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            dismiss();
            onItemSelectedListener = this.onItemSelectedListener;
            int i4 = 10 / 0;
            if (onItemSelectedListener == null) {
                return;
            }
        } else {
            dismiss();
            onItemSelectedListener = this.onItemSelectedListener;
            if (onItemSelectedListener == null) {
                return;
            }
        }
        this.ShareDataUIState = i;
        onItemSelectedListener.onItemSelected(i, this.component1.get(i));
        int i5 = component3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivClose);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final void onClick(View view2) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 89;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    SfcSingleSelectDialog.$r8$lambda$p7rjk9DMGCgpXB9DAC7Ws7HGDKg(this.f$0, view2);
                    int i5 = component1 + 31;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
        LoadingButton loadingButton = (LoadingButton) view.findViewById(R.id.btnSelect);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        if (loadingButton != null) {
            loadingButton.setOnClickListener(new View.OnClickListener() {
                private static final byte[] $$c = {113, 66, TarHeader.LF_CHR, 67};
                private static final int $$f = 21;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$d = {4, -66, -36, 8, -17, -3, 58, -57, -24, 3, -8, -9, 10, -3, -10, TarHeader.LF_DIR, -62, -10, -2, 0, -6, TarHeader.LF_SYMLINK, -35, -34, -15, -6, Ascii.US, -39, 8, -12, -8, 9, -8, -6, -18, -17, -3, -8, -4, -4, 4, -14, -11, 62};
                private static final int $$e = 176;
                private static final byte[] $$a = {79, Ascii.ETB, 89, Ascii.VT, -2, Ascii.SI, -51, TarHeader.LF_SYMLINK, -50, TarHeader.LF_CHR, -32, Ascii.NAK, 4, -8, Ascii.SO, 1, -19, Ascii.FF, 3, -2, Ascii.SI, -34, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -50, 35, 9, -9, 1, 3, -6, 6, -8, 17, -9, -4, Ascii.SO, -32, 33, -19, 19, -15, Ascii.FF, 1, 9};
                private static final int $$b = 136;
                private static int component2 = 0;
                private static int component1 = 1;
                private static char[] component3 = {3095, 1088, 7330, 5388, 11641, 9639, 15874, 13872, 20185, 18205, 24360, 22509, 26671, 24701, 30930, 28987, 35227, 33261, 39466, 37521, 43765, 41765, 35747, 33778, 39703, 37566, 43733, 41499, 47538, 45564, 51555, 49343, 55514, 53370, 61327, 59347, 65395, 22309, 24438, 18313, 20006, 30209, 32411, 25918, 27977, 5608, 7289, 1132, 3326, 13084, 15171, 9210, 10762, 3103, 1098, 7331, 5392, 11618, 9639, 15890, 13927, 20222, 18191, 24437, 22486, 26645, 24673, 30914, 28987};
                private static long copydefault = 6584464133328667694L;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static java.lang.String $$g(byte r7, byte r8, int r9) {
                    /*
                        int r7 = r7 + 117
                        int r9 = r9 * 2
                        int r9 = 1 - r9
                        int r8 = r8 * 4
                        int r8 = 3 - r8
                        byte[] r0 = com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.$$c
                        byte[] r1 = new byte[r9]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r3 = r8
                        r5 = r2
                        goto L2a
                    L14:
                        r3 = r2
                    L15:
                        int r8 = r8 + 1
                        byte r4 = (byte) r7
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r9) goto L24
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        return r7
                    L24:
                        r3 = r0[r8]
                        r6 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r6
                    L2a:
                        int r7 = -r7
                        int r7 = r7 + r8
                        r8 = r3
                        r3 = r5
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.$$g(byte, byte, int):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 4
                        int r7 = r7 + 99
                        byte[] r0 = com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.$$a
                        int r6 = r6 * 12
                        int r1 = r6 + 4
                        int r8 = r8 * 3
                        int r8 = 46 - r8
                        byte[] r1 = new byte[r1]
                        int r6 = r6 + 3
                        r2 = 0
                        if (r0 != 0) goto L18
                        r3 = r8
                        r4 = r2
                        goto L2e
                    L18:
                        r3 = r2
                    L19:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r6) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r0[r8]
                        r5 = r3
                        r3 = r7
                        r7 = r4
                        r4 = r5
                    L2e:
                        int r8 = r8 + 1
                        int r7 = r7 + r3
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.a(byte, short, short, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r8 = r8 * 4
                        int r8 = r8 + 99
                        byte[] r0 = com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.$$d
                        int r6 = r6 * 22
                        int r1 = 32 - r6
                        int r7 = r7 * 31
                        int r7 = 35 - r7
                        byte[] r1 = new byte[r1]
                        int r6 = 31 - r6
                        r2 = 0
                        if (r0 != 0) goto L18
                        r3 = r6
                        r4 = r2
                        goto L2e
                    L18:
                        r3 = r2
                    L19:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        if (r3 != r6) goto L26
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L26:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2e:
                        int r8 = -r8
                        int r3 = r3 + r8
                        int r8 = r3 + (-5)
                        int r7 = r7 + 1
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.c(short, int, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:57:0x0224  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0225  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static void b(int r26, int r27, char r28, java.lang.Object[] r29) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 558
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog$$ExternalSyntheticLambda1.b(int, int, char, java.lang.Object[]):void");
                }

                @Override
                public final void onClick(View view2) throws Throwable {
                    Object[] objArr;
                    int i2 = 2 % 2;
                    int i3 = component1 + 95;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                    if (objCopydefault == null) {
                        int i5 = 1116 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i6 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        byte b2 = $$a[15];
                        Object[] objArr2 = new Object[1];
                        a(b2, b2, r2[14], objArr2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5, i6, tapTimeout, -1308762862, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objCopydefault).getLong(null);
                    Object[] objArr3 = new Object[1];
                    b(TextUtils.getCapsMode("", 0, 0) + 22, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    b(15 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionChild(0L) + 23, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34735), objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                    if (objCopydefault2 == null) {
                        int offsetAfter = 1115 - TextUtils.getOffsetAfter("", 0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        Object[] objArr5 = new Object[1];
                        a((byte) (-$$a[4]), r17[15], r17[30], objArr5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, maximumDrawingCacheSize, mirror, -206681338, false, (String) objArr5[0], null);
                    }
                    if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                        int i7 = component2 + 71;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                        if (objCopydefault3 == null) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1115;
                            int mode = View.MeasureSpec.getMode(0) + 22;
                            char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                            byte b3 = (byte) ($$a[15] - 1);
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            a(b3, b4, b4, objArr6);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, mode, mirror2, 44744436, false, (String) objArr6[0], null);
                        }
                        Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                        int i9 = ((int[]) objArr7[2])[0];
                        objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{i9}, (String[]) objArr7[3]};
                        int iIdentityHashCode = System.identityHashCode(this);
                        int i10 = ~iIdentityHashCode;
                        int i11 = (((191694172 + (((~((-755888045) | i10)) | (~(562690556 | i10))) * (-867))) + ((((~((-755888045) | iIdentityHashCode)) | 201590272) | (~(562690556 | iIdentityHashCode))) * (-1734))) + (((~(iIdentityHashCode | 764280828)) | ((~(i10 | (-201590273))) | (~((-554297773) | iIdentityHashCode)))) * 867)) - 1180787560;
                        int i12 = (i11 << 13) ^ i11;
                        int i13 = i12 ^ (i12 >>> 17);
                        ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
                    } else {
                        Object[] objArr8 = new Object[1];
                        b(Color.green(0) + 16, 37 - Gravity.getAbsoluteGravity(0, 0), (char) (23353 - TextUtils.getCapsMode("", 0, 0)), objArr8);
                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        b(16 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 53, (char) TextUtils.getOffsetBefore("", 0), objArr9);
                        try {
                            Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -1180787560};
                            byte[] bArr = $$d;
                            byte b5 = bArr[19];
                            byte b6 = b5;
                            Object[] objArr11 = new Object[1];
                            c(b6, (byte) (b6 + 1), b5, objArr11);
                            Class<?> cls3 = Class.forName((String) objArr11[0]);
                            byte b7 = bArr[19];
                            byte b8 = (byte) (b7 + 1);
                            byte b9 = b7;
                            Object[] objArr12 = new Object[1];
                            c(b8, b9, b9, objArr12);
                            objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                            if (objCopydefault4 == null) {
                                int mirror3 = 1163 - AndroidCharacter.getMirror('0');
                                int defaultSize = 22 - View.getDefaultSize(0, 0);
                                char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                byte b10 = (byte) ($$a[15] - 1);
                                byte b11 = b10;
                                Object[] objArr13 = new Object[1];
                                a(b10, b11, b11, objArr13);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(mirror3, defaultSize, c2, 44744436, false, (String) objArr13[0], null);
                            }
                            ((Field) objCopydefault4).set(null, objArr);
                            try {
                                Object[] objArr14 = new Object[1];
                                b(Drawable.resolveOpacity(0, 0) + 22, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr14);
                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                Object[] objArr15 = new Object[1];
                                b(15 - View.resolveSize(0, 0), 22 - KeyEvent.getDeadChar(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 34737), objArr15);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                                if (objCopydefault5 == null) {
                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1116;
                                    int i14 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    Object[] objArr16 = new Object[1];
                                    a((byte) (-$$a[4]), r12[15], r12[30], objArr16);
                                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i14, keyRepeatTimeout, -206681338, false, (String) objArr16[0], null);
                                }
                                ((Field) objCopydefault5).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                                if (objCopydefault6 == null) {
                                    int offsetBefore = 1115 - TextUtils.getOffsetBefore("", 0);
                                    int i15 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21;
                                    char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                                    byte b12 = $$a[15];
                                    Object[] objArr17 = new Object[1];
                                    a(b12, b12, r4[14], objArr17);
                                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, i15, offsetAfter2, -1308762862, false, (String) objArr17[0], null);
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
                    int i16 = ((int[]) objArr[1])[0];
                    int i17 = ((int[]) objArr[2])[0];
                    if (i17 == i16) {
                        int i18 = ((int[]) objArr[0])[0];
                        int i19 = ((int[]) objArr[2])[0];
                        Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i19}, (String[]) objArr[3]};
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i20 = ~startElapsedRealtime;
                        int i21 = i18 + 108767991 + (((~(178067063 | i20)) | 6473992) * 184) + ((startElapsedRealtime | 169410631) * (-184)) + ((~((-15130425) | i20)) * 184);
                        int i22 = (i21 << 13) ^ i21;
                        int i23 = i22 ^ (i22 >>> 17);
                        ((int[]) objArr18[0])[0] = i23 ^ (i23 << 5);
                        int i24 = ((int[]) objArr18[0])[0];
                        int i25 = ((int[]) objArr18[2])[0];
                        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr18[1])[0]}, new int[]{i25}, (String[]) objArr18[3]};
                        int i26 = ~(System.identityHashCode(this) | 160492353);
                        int i27 = i24 + (((1364889689 + (((-32705135) | i26) * (-220))) + ((i26 | (-166980464)) * 220)) - 1695890894);
                        int i28 = (i27 << 13) ^ i27;
                        int i29 = i28 ^ (i28 >>> 17);
                        ((int[]) objArr19[0])[0] = i29 ^ (i29 << 5);
                        SfcSingleSelectDialog.$r8$lambda$sWWPCi5vcUfrn_ShkYRxX71SMG8(this.f$0, view2);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        int i30 = component1 + 75;
                        component2 = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = 0;
                        while (i32 < strArr.length) {
                            arrayList.add(strArr[i32]);
                            i32++;
                            int i33 = component1 + 17;
                            component2 = i33 % 128;
                            int i34 = i33 % 2;
                        }
                    }
                    long j2 = -1;
                    long j3 = ((long) (i16 ^ i17)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                    long j4 = 0;
                    long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
                    try {
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault7 == null) {
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                        Object[] objArr20 = {599317783, Long.valueOf(j5), arrayList, null, false, false};
                        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault8 == null) {
                            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 6562, TextUtils.lastIndexOf("", '0', 0, 0) + 57, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                        int i35 = ((int[]) objArr[0])[0];
                        int i36 = ((int[]) objArr[2])[0];
                        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i36}, (String[]) objArr[3]};
                        int iIdentityHashCode2 = System.identityHashCode(this);
                        int i37 = i35 + (((((-1073541116) | r2) | (~(636543867 | iIdentityHashCode2))) * (-338)) - 1886446857) + (((~(iIdentityHashCode2 | (-436997249))) | (~((-636543868) | (~iIdentityHashCode2)))) * 338);
                        int i38 = (i37 << 13) ^ i37;
                        int i39 = i38 ^ (i38 >>> 17);
                        ((int[]) objArr21[0])[0] = i39 ^ (i39 << 5);
                        throw null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            });
            int i2 = copydefault + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        component1 component1Var = new component1(getItemLayoutId(), this.component1);
        component1Var.setOnItemClickListener(new OnItemClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i4) {
                int i5 = 2 % 2;
                int i6 = component1 + 11;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                SfcSingleSelectDialog.m10184$r8$lambda$_nnuu54dluD1Zfyg993ToFA7Xs(this.f$0, baseQuickAdapter, view2, i4);
                int i8 = component3 + 79;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        if (recyclerView != null) {
            recyclerView.addItemDecoration(copydefault(view.getContext()));
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            recyclerView.setAdapter(component1Var);
            int i4 = component3 + 55;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        if (textView != null) {
            textView.setText(this.component2);
        }
    }

    private RecycleViewDivider copydefault(Context context) {
        int i = 2 % 2;
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(Utils.getApp().getColor(R.color.colorBackgroundFloating), ConvertUtils.dp2px(0.5f));
        recycleViewDivider.setPadding(ConvertUtils.dp2px(24.0f), 0, ConvertUtils.dp2px(24.0f), 0);
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return recycleViewDivider;
    }

    public static void m10184$r8$lambda$_nnuu54dluD1Zfyg993ToFA7Xs(SfcSingleSelectDialog sfcSingleSelectDialog, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        sfcSingleSelectDialog.component3(baseQuickAdapter, view, i);
        int i5 = copydefault + 53;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$p7rjk9DMGCgpXB9DAC7Ws7HGDKg(SfcSingleSelectDialog sfcSingleSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        copydefault(sfcSingleSelectDialog, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$sWWPCi5vcUfrn_ShkYRxX71SMG8(SfcSingleSelectDialog sfcSingleSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(sfcSingleSelectDialog, view);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void copydefault(SfcSingleSelectDialog sfcSingleSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                sfcSingleSelectDialog.copydefault(view);
                Callback.onClick_exit();
                throw null;
            }
            sfcSingleSelectDialog.copydefault(view);
            Callback.onClick_exit();
            int i4 = copydefault + 113;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    class component1 extends BaseQuickAdapter<T, BaseViewHolder> {
        private static int component1 = 0;
        private static int copydefault = 1;

        public component1(int i, List<T> list) {
            super(i, list);
        }

        @Override
        public void convert(BaseViewHolder baseViewHolder, T t) {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            SfcSingleSelectDialog.this.convert(baseViewHolder, t);
            if (i3 != 0) {
                throw null;
            }
        }
    }

    private static void ShareDataUIState(SfcSingleSelectDialog sfcSingleSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                sfcSingleSelectDialog.component2(view);
                Callback.onClick_exit();
            } else {
                sfcSingleSelectDialog.component2(view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    protected void convert(BaseViewHolder baseViewHolder, T t) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean isSelected(T t) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }
}
