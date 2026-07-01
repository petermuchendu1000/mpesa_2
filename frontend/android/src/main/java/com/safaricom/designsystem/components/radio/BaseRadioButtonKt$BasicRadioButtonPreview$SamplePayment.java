package com.safaricom.designsystem.components.radio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/safaricom/designsystem/components/radio/BaseRadioButtonKt$BasicRadioButtonPreview$SamplePayment", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "name", "", "displayName", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseRadioButtonKt$BasicRadioButtonPreview$SamplePayment implements IRadioButton {
    private final String component2;
    private final boolean component3;
    private final String copydefault;

    public BaseRadioButtonKt$BasicRadioButtonPreview$SamplePayment(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.component2 = str2;
        this.component3 = z;
    }

    @Override
    public String getCopydefault() {
        return this.copydefault;
    }

    @Override
    public String getComponent2() {
        return this.component2;
    }

    @Override
    public boolean getComponent3() {
        return this.component3;
    }
}
