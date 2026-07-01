package com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.view.OrientationEventListener;
import androidx.lifecycle.LiveData;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\n\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/utils/OrientationLiveData;", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "<init>", "(Landroid/content/Context;Landroid/hardware/camera2/CameraCharacteristics;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/huawei/digitalpayment/consumer/sfcqrcode/ui/utils/OrientationLiveData$listener$1", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/utils/OrientationLiveData$listener$1;", "onActive", "", "onInactive", "Companion", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OrientationLiveData extends LiveData<Integer> {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    private final OrientationLiveData$listener$1 component3;

    public static final void access$postValue(OrientationLiveData orientationLiveData, Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        orientationLiveData.postValue(num);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = component2 + 111;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1] */
    public OrientationLiveData(Context context, final CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "");
        final Context applicationContext = context.getApplicationContext();
        this.component3 = new OrientationEventListener(applicationContext) {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onOrientationChanged(int r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r1 = 45
                    if (r4 > r1) goto L8
                    goto L30
                L8:
                    r1 = 135(0x87, float:1.89E-43)
                    if (r4 > r1) goto Le
                    r4 = 1
                    goto L31
                Le:
                    r1 = 225(0xe1, float:3.15E-43)
                    if (r4 > r1) goto L1d
                    int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.ShareDataUIState
                    int r4 = r4 + 13
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.component2 = r1
                    int r4 = r4 % r0
                    r4 = r0
                    goto L31
                L1d:
                    r1 = 315(0x13b, float:4.41E-43)
                    if (r4 > r1) goto L30
                    int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.ShareDataUIState
                    int r4 = r4 + 73
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.component2 = r1
                    int r4 = r4 % r0
                    if (r4 == 0) goto L2e
                    r4 = 4
                    goto L31
                L2e:
                    r4 = 3
                    goto L31
                L30:
                    r4 = 0
                L31:
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$Companion r1 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData.INSTANCE
                    android.hardware.camera2.CameraCharacteristics r2 = r1
                    int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData.Companion.access$computeRelativeRotation(r1, r2, r4)
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData r1 = r2
                    java.lang.Object r1 = r1.getValue()
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    if (r1 != 0) goto L4d
                    int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.ShareDataUIState
                    int r1 = r1 + 71
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.component2 = r2
                    int r1 = r1 % r0
                    goto L53
                L4d:
                    int r0 = r1.intValue()
                    if (r4 == r0) goto L5c
                L53:
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData r0 = r2
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData.access$postValue(r0, r4)
                L5c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils.OrientationLiveData$listener$1.onOrientationChanged(int):void");
            }
        };
    }

    @Override
    public void onActive() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onActive();
            enable();
            int i3 = component2 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onActive();
        enable();
        throw null;
    }

    @Override
    public void onInactive() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onInactive();
            disable();
            int i3 = component1 + 91;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 32 / 0;
                return;
            }
            return;
        }
        super.onInactive();
        disable();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 23;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 52 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0003¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/utils/OrientationLiveData$Companion;", "", "<init>", "()V", "computeRelativeRotation", "", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "surfaceRotation", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        public static final int access$computeRelativeRotation(Companion companion, CameraCharacteristics cameraCharacteristics, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int iComponent3 = companion.component3(cameraCharacteristics, i);
            int i5 = copydefault + 125;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return iComponent3;
        }

        @JvmStatic
        private final int component3(CameraCharacteristics cameraCharacteristics, int i) {
            int i2;
            int i3 = 2 % 2;
            Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Intrinsics.checkNotNull(obj);
            int iIntValue = ((Number) obj).intValue();
            int i4 = 1;
            if (i == 0) {
                i2 = 0;
            } else if (i != 1) {
                int i5 = copydefault;
                int i6 = i5 + 59;
                component3 = i6 % 128;
                if (i6 % 2 != 0 ? i == 2 : i == 4) {
                    i2 = 180;
                } else if (i != 3) {
                    int i7 = i5 + 63;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    i2 = 0;
                } else {
                    i2 = 270;
                }
            } else {
                i2 = 90;
            }
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 0) {
                int i9 = component3 + 87;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i4 = -1;
            }
            return ((iIntValue - (i2 * i4)) + AUScreenAdaptTool.WIDTH_BASE) % AUScreenAdaptTool.WIDTH_BASE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    private static final int component3(CameraCharacteristics cameraCharacteristics, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int iAccess$computeRelativeRotation = Companion.access$computeRelativeRotation(INSTANCE, cameraCharacteristics, i);
        int i5 = component2 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return iAccess$computeRelativeRotation;
    }
}
