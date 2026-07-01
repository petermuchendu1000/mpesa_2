package com.safaricom.designsystem.components.scaffold;

import androidx.compose.runtime.Composer;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.safaricom.designsystem.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000bJ+\u0010\f\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/safaricom/designsystem/components/scaffold/LeftActionPropertiesDefaults;", "", "<init>", "()V", "default", "Lcom/safaricom/designsystem/components/scaffold/LeftActionProperties;", "iconResource", "", "enable", "", "isVisible", "(IZZLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/scaffold/LeftActionProperties;", DataflowMonitorModel.METHOD_NAME_CLOSE, "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LeftActionPropertiesDefaults {
    public static final int $stable = 0;
    public static final LeftActionPropertiesDefaults INSTANCE = new LeftActionPropertiesDefaults();

    private LeftActionPropertiesDefaults() {
    }

    public final LeftActionProperties m12655default(int i, boolean z, boolean z2, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-1366267077);
        if ((i3 & 1) != 0) {
            i = R.drawable.ic_one_app_action_back;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        LeftActionProperties leftActionProperties = new LeftActionProperties(i, z, z2);
        composer.endReplaceGroup();
        return leftActionProperties;
    }

    public final LeftActionProperties close(int i, boolean z, boolean z2, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-1297008654);
        if ((i3 & 1) != 0) {
            i = R.drawable.ic_one_app_close;
        }
        if ((i3 & 2) != 0) {
            z = true;
        }
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        LeftActionProperties leftActionProperties = new LeftActionProperties(i, z, z2);
        composer.endReplaceGroup();
        return leftActionProperties;
    }
}
