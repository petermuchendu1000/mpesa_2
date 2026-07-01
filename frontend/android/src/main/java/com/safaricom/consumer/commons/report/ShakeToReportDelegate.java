package com.safaricom.consumer.commons.report;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.webkit.internal.AssetHelper;
import com.safaricom.mpesa.logging.L;
import java.io.File;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001$\u0018\u0000 12\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0010\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%¨\u00062"}, d2 = {"Lcom/safaricom/consumer/commons/report/ShakeToReportDelegate;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;)V", "getContext", "()Landroid/content/Context;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "sensorManager", "Landroid/hardware/SensorManager;", "now", "", "timeDiff", "lastUpdate", "lastShake", "x", "", "y", "z", "lastX", "lastY", "lastZ", "force", "shakeEnabled", "", "fileProviderAuthority", "", "getFileProviderAuthority", "()Ljava/lang/String;", "fileProviderAuthority$delegate", "Lkotlin/Lazy;", "lifecycleObserver", "com/safaricom/consumer/commons/report/ShakeToReportDelegate$lifecycleObserver$1", "Lcom/safaricom/consumer/commons/report/ShakeToReportDelegate$lifecycleObserver$1;", "removeShakeListener", "", "resetValues", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShakeToReportDelegate implements SensorEventListener {
    private static final float ShareDataUIState = 20.0f;
    private static final int component3 = 200;
    private final Lifecycle ArtificialStackFrames;
    private float CoroutineDebuggingKt;
    private final Lazy component1;
    private final Context component2;
    private float component4;
    private float copy;
    private float copydefault;
    private float coroutineBoundary;
    private float coroutineCreation;
    private long equals;
    private long getARTIFICIAL_FRAME_PACKAGE_NAME;
    private float getAsAtTimestamp;
    private long getRequestBeneficiariesState;
    private final ShakeToReportDelegate$lifecycleObserver$1 getShareableDataState;
    private long getSponsorBeneficiariesState;
    private SensorManager hashCode;
    private final boolean toString;

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.safaricom.consumer.commons.report.ShakeToReportDelegate$lifecycleObserver$1] */
    public ShakeToReportDelegate(Context context, Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.component2 = context;
        this.ArtificialStackFrames = lifecycle;
        boolean zIsEnabled = L.INSTANCE.isEnabled();
        this.toString = zIsEnabled;
        this.component1 = LazyKt.lazy(new Function0() {
            @Override
            public final Object invoke() {
                return ShakeToReportDelegate.component2(this.f$0);
            }
        });
        ?? r2 = new DefaultLifecycleObserver() {
            @Override
            public void onResume(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "");
                SensorManager sensorManager = this.copydefault.hashCode;
                if (sensorManager != null) {
                    sensorManager.registerListener(this.copydefault, sensorManager.getDefaultSensor(1), 3);
                }
            }

            @Override
            public void onPause(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "");
                this.copydefault.component3();
            }
        };
        this.getShareableDataState = r2;
        if (zIsEnabled) {
            lifecycle.addObserver((LifecycleObserver) r2);
            Object systemService = context.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "");
            this.hashCode = (SensorManager) systemService;
        }
    }

    public final Context getComponent2() {
        return this.component2;
    }

    public final Lifecycle getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    private final String ShareDataUIState() {
        return (String) this.component1.getValue();
    }

    public static final String component2(ShakeToReportDelegate shakeToReportDelegate) {
        Intrinsics.checkNotNullParameter(shakeToReportDelegate, "");
        String string = shakeToReportDelegate.component2.getPackageManager().getApplicationInfo(shakeToReportDelegate.component2.getPackageName(), 128).metaData.getString("fileProvider.authority");
        Intrinsics.checkNotNull(string, "");
        return string;
    }

    public final void component3() {
        SensorManager sensorManager = this.hashCode;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        component2();
    }

    private final void component2() {
        this.getRequestBeneficiariesState = 0L;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "");
        this.getSponsorBeneficiariesState = event.timestamp;
        this.CoroutineDebuggingKt = event.values[0];
        this.coroutineCreation = event.values[1];
        float f = event.values[2];
        this.coroutineBoundary = f;
        long j = this.getRequestBeneficiariesState;
        if (j == 0) {
            long j2 = this.getSponsorBeneficiariesState;
            this.getRequestBeneficiariesState = j2;
            this.equals = j2;
            this.copy = this.CoroutineDebuggingKt;
            this.getAsAtTimestamp = this.coroutineCreation;
            this.component4 = f;
            return;
        }
        long j3 = this.getSponsorBeneficiariesState - j;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = j3;
        if (j3 > 0) {
            float fAbs = Math.abs(((((this.CoroutineDebuggingKt + this.coroutineCreation) + f) - this.copy) - this.getAsAtTimestamp) - this.component4);
            this.copydefault = fAbs;
            if (fAbs > 20.0f) {
                if (this.getSponsorBeneficiariesState - this.equals >= 200) {
                    component3();
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    File logsFile = L.INSTANCE.getLogsFile();
                    if (logsFile != null) {
                        arrayList.add(FileProvider.getUriForFile(this.component2, ShareDataUIState(), logsFile));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                    intent.setFlags(intent.getFlags() + 1);
                    intent.setFlags(intent.getFlags() + 2);
                    intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                    this.component2.startActivity(Intent.createChooser(intent, "Export Logs and database"));
                }
                this.equals = this.getSponsorBeneficiariesState;
            }
            this.copy = this.CoroutineDebuggingKt;
            this.getAsAtTimestamp = this.coroutineCreation;
            this.component4 = this.coroutineBoundary;
            this.getRequestBeneficiariesState = this.getSponsorBeneficiariesState;
        }
    }
}
