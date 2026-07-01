package com.huawei.common.widget.dialog;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.R;
import com.huawei.digitalpayment.consumer.sfcui.commons.BottomSheetHeaderKt$$ExternalSyntheticLambda2;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;

public class TipsDialog extends BaseDialog {
    private CharSequence ArtificialStackFrames;
    private CharSequence ShareDataUIState;
    private int component1;
    private TextView component2;
    private CharSequence component3;
    private int component4;
    private CharSequence copy;
    private int copydefault;
    private int equals;
    private TextView getAsAtTimestamp;
    private View.OnClickListener getRequestBeneficiariesState;
    private TextView getShareableDataState;
    private View.OnClickListener getSponsorBeneficiariesState;
    private TextView hashCode;
    private int toString;

    public TipsDialog() {
    }

    public CharSequence getContent() {
        return this.ShareDataUIState;
    }

    public CharSequence getLeftButtonText() {
        return this.component3;
    }

    public CharSequence getRightButtonText() {
        return this.copy;
    }

    public int getLeftButtonTextColor() {
        return this.component4;
    }

    public int getRightButtonTextColor() {
        return this.equals;
    }

    private TipsDialog(Builder builder) {
        this.ArtificialStackFrames = Builder.getAsAtTimestamp(builder);
        this.ShareDataUIState = Builder.copydefault(builder);
        this.toString = Builder.toString(builder);
        this.copydefault = Builder.component1(builder);
        this.component3 = Builder.ShareDataUIState(builder);
        this.copy = Builder.component4(builder);
        int iShareDataUIState = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        int iShareDataUIState2 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        int iShareDataUIState3 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        this.component4 = ((Integer) Builder.copydefault(iShareDataUIState, BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState(), -380767443, 380767444, new Object[]{builder}, iShareDataUIState2, iShareDataUIState3)).intValue();
        this.equals = Builder.equals(builder);
        this.getRequestBeneficiariesState = Builder.getRequestBeneficiariesState(builder);
        int iShareDataUIState4 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        int iShareDataUIState5 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        int iShareDataUIState6 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
        this.getSponsorBeneficiariesState = (View.OnClickListener) Builder.copydefault(iShareDataUIState4, BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState(), -1905244360, 1905244360, new Object[]{builder}, iShareDataUIState5, iShareDataUIState6);
        this.component1 = Builder.component2(builder);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_common_tips;
    }

    @Override
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout((getWidth(window) * 8) / 10, -2);
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.component2 = (TextView) view.findViewById(R.id.tv_left_button);
        this.getAsAtTimestamp = (TextView) view.findViewById(R.id.tv_right_button);
        this.hashCode = (TextView) view.findViewById(R.id.tv_tips_content);
        this.getShareableDataState = (TextView) view.findViewById(R.id.tv_tips_title);
        int i = this.component1;
        if (i == 0) {
            this.hashCode.setGravity(17);
        } else {
            this.hashCode.setGravity(i);
        }
        this.component2.setFocusable(false);
        this.component2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                TipsDialog.ShareDataUIState(this.f$0, view2);
            }
        });
        this.getAsAtTimestamp.setFocusable(false);
        this.getAsAtTimestamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                TipsDialog.component1(this.f$0, view2);
            }
        });
        copydefault();
    }

    public static class Builder {
        private CharSequence ShareDataUIState;
        private int component1;
        private int component2;
        private int component3;
        private View.OnClickListener component4;
        private int copy;
        private CharSequence copydefault;
        private CharSequence equals;
        private View.OnClickListener getAsAtTimestamp;
        private CharSequence getRequestBeneficiariesState;
        private int hashCode;
        private static final byte[] $$c = {69, -50, 81, 75};
        private static final int $$f = 122;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {60, -123, -116, -1, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 251;
        private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -8, -25, 33, -47, -15, -11, 9, -23, 1, -12};
        private static final int $$b = 119;
        private static int getSponsorBeneficiariesState = 0;
        private static int coroutineBoundary = 1;
        private static long ArtificialStackFrames = -3780477796495014671L;
        private static int getShareableDataState = 1386857713;
        private static char toString = 440;

        private static String $$g(byte b2, int i, byte b3) {
            byte[] bArr = $$c;
            int i2 = 99 - b2;
            int i3 = b3 + 4;
            int i4 = i * 3;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i2 += -i3;
                i3 = i3;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i3 + 1;
                i2 += -bArr[i8];
                i3 = i8;
                i6 = i7;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 103
                byte[] r0 = com.huawei.common.widget.dialog.TipsDialog.Builder.$$a
                int r8 = r8 * 8
                int r1 = 19 - r8
                int r7 = r7 * 18
                int r7 = 21 - r7
                byte[] r1 = new byte[r1]
                int r8 = 18 - r8
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r7
                r7 = r8
                r4 = r2
                goto L32
            L19:
                r3 = r2
            L1a:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L32:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + (-10)
                r7 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.TipsDialog.Builder.a(short, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 98
                int r8 = r8 * 3
                int r8 = r8 + 1
                int r7 = r7 * 9
                int r7 = r7 + 4
                byte[] r0 = com.huawei.common.widget.dialog.TipsDialog.Builder.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L29
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r7]
                r6 = r3
                r3 = r9
                r9 = r6
            L29:
                int r7 = r7 + 1
                int r9 = -r9
                int r3 = r3 + r9
                int r9 = r3 + (-27)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.TipsDialog.Builder.b(byte, byte, int, java.lang.Object[]):void");
        }

        public static Object copydefault(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i4;
            int i8 = ~(i7 | i3);
            int i9 = ~(i3 | i4);
            int i10 = i7 | (~i3);
            int i11 = i9 | (~(i10 | i));
            int i12 = (~i) | i10;
            int i13 = i3 + i4 + i5 + (1134938392 * i6) + ((-1730424158) * i2);
            int i14 = i13 * i13;
            int i15 = (1345404558 * i3) + 1061748736 + ((-382549644) * i4) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i5) + (1924136960 * i6) + (748945408 * i2) + (912850944 * i14);
            int i16 = (i3 * 1914917686) + 639827133 + (i4 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i5 * 1914918157) + (i6 * (-1451741640)) + (i2 * (-1338016710)) + (i14 * (-1605042176));
            return i15 + ((i16 * i16) * (-230752256)) != 1 ? ShareDataUIState(objArr) : component1(objArr);
        }

        private static void c(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i7 = $11 + 57;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 4038, 31 - TextUtils.getOffsetBefore("", 0), (char) (19181 - TextUtils.indexOf("", "", 0, 0)), 1912513118, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7567, KeyEvent.getDeadChar(0, 0) + 11, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 28, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 931716605, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        i2 = 2;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 7567, 11 - (KeyEvent.getMaxKeyCode() >> 16), (char) Color.red(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (ArtificialStackFrames ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) getShareableDataState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) toString) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    i3 = i2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        public Builder setContent(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = coroutineBoundary + 39;
            int i3 = i2 % 128;
            getSponsorBeneficiariesState = i3;
            int i4 = i2 % 2;
            this.copydefault = charSequence;
            if (i4 != 0) {
                int i5 = 64 / 0;
            }
            int i6 = i3 + 67;
            coroutineBoundary = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setLeftButtonText(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = coroutineBoundary + 105;
            int i3 = i2 % 128;
            getSponsorBeneficiariesState = i3;
            int i4 = i2 % 2;
            this.ShareDataUIState = charSequence;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 57;
            coroutineBoundary = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public Builder setRightButtonText(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = coroutineBoundary + 5;
            int i3 = i2 % 128;
            getSponsorBeneficiariesState = i3;
            int i4 = i2 % 2;
            this.equals = charSequence;
            int i5 = i3 + 111;
            coroutineBoundary = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setLeftButtonTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = getSponsorBeneficiariesState + 81;
            int i4 = i3 % 128;
            coroutineBoundary = i4;
            int i5 = i3 % 2;
            this.component3 = i;
            int i6 = i4 + 35;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 26 / 0;
            }
            return this;
        }

        public Builder setRightButtonTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = getSponsorBeneficiariesState;
            int i4 = i3 + 5;
            coroutineBoundary = i4 % 128;
            int i5 = i4 % 2;
            this.copy = i;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 25;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public Builder setLeftClickListener(View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 11;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            this.getAsAtTimestamp = onClickListener;
            int i5 = i2 + 55;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setRightClickListener(View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = getSponsorBeneficiariesState + 1;
            coroutineBoundary = i2 % 128;
            int i3 = i2 % 2;
            this.component4 = onClickListener;
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        public Builder setTitle(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 105;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            this.getRequestBeneficiariesState = charSequence;
            int i5 = i2 + 71;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setTitleTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = coroutineBoundary + 81;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            this.hashCode = i;
            if (i4 != 0) {
                int i5 = 78 / 0;
            }
            return this;
        }

        public Builder setContentTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = coroutineBoundary + 33;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            this.component2 = i;
            if (i4 == 0) {
                return this;
            }
            throw null;
        }

        public Builder setContentGravity(int i) {
            int i2 = 2 % 2;
            int i3 = coroutineBoundary;
            int i4 = i3 + 75;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            this.component1 = i;
            int i6 = i3 + 119;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 75 / 0;
            }
            return this;
        }

        @Deprecated
        public TipsDialog build() {
            int i = 2 % 2;
            TipsDialog tipsDialog = new TipsDialog(this);
            int i2 = coroutineBoundary + 83;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return tipsDialog;
        }

        static CharSequence copydefault(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 61;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = builder.copydefault;
            int i5 = i2 + 117;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        static int component2(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 71;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.component1;
            int i6 = i2 + 51;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static int component1(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary + 91;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = builder.component2;
            if (i3 == 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static CharSequence ShareDataUIState(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 73;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = builder.ShareDataUIState;
            int i5 = i2 + 7;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        static int component3(Builder builder) {
            int iShareDataUIState = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            int iShareDataUIState2 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            int iShareDataUIState3 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            return ((Integer) copydefault(iShareDataUIState, BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState(), -380767443, 380767444, new Object[]{builder}, iShareDataUIState2, iShareDataUIState3)).intValue();
        }

        static View.OnClickListener getRequestBeneficiariesState(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 7;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            View.OnClickListener onClickListener = builder.getAsAtTimestamp;
            int i5 = i2 + 25;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return onClickListener;
        }

        static CharSequence component4(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 5;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = builder.equals;
            int i5 = i2 + 93;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return charSequence;
        }

        static int equals(Builder builder) {
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 95;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.copy;
            int i6 = i2 + 43;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static View.OnClickListener copy(Builder builder) {
            int iShareDataUIState = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            int iShareDataUIState2 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            int iShareDataUIState3 = BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState();
            return (View.OnClickListener) copydefault(iShareDataUIState, BottomSheetHeaderKt$$ExternalSyntheticLambda2.ShareDataUIState(), -1905244360, 1905244360, new Object[]{builder}, iShareDataUIState2, iShareDataUIState3);
        }

        static CharSequence getAsAtTimestamp(Builder builder) {
            int i = 2 % 2;
            int i2 = getSponsorBeneficiariesState + 65;
            int i3 = i2 % 128;
            coroutineBoundary = i3;
            int i4 = i2 % 2;
            CharSequence charSequence = builder.getRequestBeneficiariesState;
            if (i4 == 0) {
                int i5 = 70 / 0;
            }
            int i6 = i3 + 5;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                return charSequence;
            }
            throw null;
        }

        static int toString(Builder builder) {
            int i = 2 % 2;
            int i2 = getSponsorBeneficiariesState;
            int i3 = i2 + 39;
            coroutineBoundary = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.hashCode;
            int i6 = i2 + 95;
            coroutineBoundary = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 95 / 0;
            }
            return i5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:142:0x09d1  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0500 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0724 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Throwable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component3(java.util.List r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2998
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.TipsDialog.Builder.component3(java.util.List):int");
        }

        private static Object ShareDataUIState(Object[] objArr) {
            Builder builder = (Builder) objArr[0];
            int i = 2 % 2;
            int i2 = coroutineBoundary + 97;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            View.OnClickListener onClickListener = builder.component4;
            if (i3 == 0) {
                return onClickListener;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static Object component1(Object[] objArr) {
            Builder builder = (Builder) objArr[0];
            int i = 2 % 2;
            int i2 = coroutineBoundary;
            int i3 = i2 + 107;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.component3;
            if (i4 != 0) {
                int i6 = 75 / 0;
            }
            int i7 = i2 + 67;
            getSponsorBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return Integer.valueOf(i5);
        }
    }

    private void ShareDataUIState(View view) {
        View.OnClickListener onClickListener = this.getRequestBeneficiariesState;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    private void component2(View view) {
        View.OnClickListener onClickListener = this.getSponsorBeneficiariesState;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    private void copydefault() {
        if (!TextUtils.isEmpty(this.ArtificialStackFrames)) {
            this.getShareableDataState.setVisibility(0);
            this.getShareableDataState.setText(this.ArtificialStackFrames);
        } else {
            this.getShareableDataState.setVisibility(8);
        }
        int i = this.toString;
        if (i != 0) {
            this.getShareableDataState.setTextColor(i);
        }
        if (!TextUtils.isEmpty(this.ShareDataUIState)) {
            this.hashCode.setVisibility(0);
            this.hashCode.setText(this.ShareDataUIState);
        } else {
            this.hashCode.setVisibility(8);
        }
        int i2 = this.copydefault;
        if (i2 != 0) {
            this.hashCode.setTextColor(i2);
        }
        if (!TextUtils.isEmpty(this.component3)) {
            this.component2.setVisibility(0);
            this.component2.setText(this.component3);
        } else {
            this.component2.setVisibility(8);
        }
        int i3 = this.component4;
        if (i3 != 0) {
            this.component2.setTextColor(i3);
        }
        if (!TextUtils.isEmpty(this.copy)) {
            this.getAsAtTimestamp.setText(this.copy);
        }
        int i4 = this.equals;
        if (i4 != 0) {
            this.getAsAtTimestamp.setTextColor(i4);
        }
    }

    public static void ShareDataUIState(TipsDialog tipsDialog, View view) {
        Callback.onClick_enter(view);
        try {
            tipsDialog.ShareDataUIState(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static void component1(TipsDialog tipsDialog, View view) {
        Callback.onClick_enter(view);
        try {
            tipsDialog.component2(view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
