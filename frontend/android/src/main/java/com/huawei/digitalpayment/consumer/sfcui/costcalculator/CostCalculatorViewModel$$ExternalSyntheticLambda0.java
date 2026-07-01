package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Member;
import kotlin.ActivityViewModelLazyKtviewModels1;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;

public final class CostCalculatorViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static short[] component3;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$b = 72;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component2 = -556984361;
    private static int component1 = -238323871;
    private static int ShareDataUIState = 2005410840;
    private static byte[] copydefault = {36, -111, 46, 40, -36, Ascii.VT, -63, -38, 56, -48, 60, -54, 41, 6, -28, 33, -34, Base64.padSymbol, -46, 40, 8, 63, -21, 46, 40, -36, 43, Ascii.SYN, -20, Base64.padSymbol, -37, -45, -33, 59, -42, Ascii.GS, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};

    private static String $$c(short s, byte b2, int i) {
        int i2 = s * 4;
        int i3 = i + 112;
        int i4 = (b2 * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i4 + i5;
            i4++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i6 = i7;
            i3 = bArr[i4] + i8;
            i4++;
        }
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelState$r8$lambda$TtNkrshkCPM5hh1ZrBA8dMWViC0 = CostCalculatorViewModel.$r8$lambda$TtNkrshkCPM5hh1ZrBA8dMWViC0((CostCalculatorViewModelState) obj);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = component4 + 53;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorViewModelState$r8$lambda$TtNkrshkCPM5hh1ZrBA8dMWViC0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[PHI: r4
  0x009a: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v19 byte[]) binds: [B:19:0x0098, B:16:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, short r30, byte r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$$ExternalSyntheticLambda0.a(int, int, short, byte, int, java.lang.Object[]):void");
    }

    public static void component1() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 83;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Member[] memberArr = ActivityViewModelLazyKtviewModels1.copydefault;
        Object[] objArr = new Object[1];
        a((-788947199) - MotionEvent.axisFromString(""), AndroidCharacter.getMirror('0') - '1', (short) (ExpandableListView.getPackedPositionChild(0L) + 1), (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2042408242 + Color.argb(0, 0, 0, 0), objArr);
        memberArr[0] = Class.forName(((String) objArr[0]).intern()).getDeclaredField("component1");
        int i4 = getRequestBeneficiariesState + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }
}
