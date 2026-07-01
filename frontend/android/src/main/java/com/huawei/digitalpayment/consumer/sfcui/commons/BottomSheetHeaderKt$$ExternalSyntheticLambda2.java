package com.huawei.digitalpayment.consumer.sfcui.commons;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.safaricom.designsystem.components.menu.MenuActionStyle;
import com.safaricom.designsystem.components.scaffold.LeftActionProperties;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class BottomSheetHeaderKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int ShareDataUIState = 0;
    public static int component1 = 0;
    public static int component2 = 0;
    private static int copydefault = 1;
    public final Modifier f$0;
    public final String f$1;
    public final long f$2;
    public final LeftActionProperties f$3;
    public final MenuActionStyle f$4;
    public final List f$5;
    public final Function0 f$6;
    public final int f$7;
    public final int f$8;

    public BottomSheetHeaderKt$$ExternalSyntheticLambda2(Modifier modifier, String str, long j, LeftActionProperties leftActionProperties, MenuActionStyle menuActionStyle, List list, Function0 function0, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = j;
        this.f$3 = leftActionProperties;
        this.f$4 = menuActionStyle;
        this.f$5 = list;
        this.f$6 = function0;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public static int ShareDataUIState() {
        int i = component2;
        int i2 = i % 9989630;
        component2 = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        component1 = iFreeMemory;
        return iFreeMemory;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$9HOcbIMV3tTmm5ZXaYv6thwJEeM = BottomSheetHeaderKt.$r8$lambda$9HOcbIMV3tTmm5ZXaYv6thwJEeM(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, ((Integer) obj2).intValue());
        int i4 = ShareDataUIState + 125;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit$r8$lambda$9HOcbIMV3tTmm5ZXaYv6thwJEeM;
        }
        throw null;
    }
}
