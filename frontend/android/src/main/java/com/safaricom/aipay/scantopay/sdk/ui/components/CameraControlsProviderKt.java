package com.safaricom.aipay.scantopay.sdk.ui.components;

import a.c;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/c;", "Landroidx/compose/ui/graphics/painter/Painter;", "toPainter", "(La/c;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "scan-to-pay-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CameraControlsProviderKt {
    public static final Painter toPainter(c cVar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(cVar, "");
        composer.startReplaceGroup(926084853);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(cVar.a(), composer, 0);
        composer.endReplaceGroup();
        return painterPainterResource;
    }
}
