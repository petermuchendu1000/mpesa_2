package com.huawei.digitalpayment.consumer.sfcadjust;

import android.content.Context;
import androidx.startup.Initializer;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnIsEnabledListener;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.safaricom.mpesa.logging.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0001\u0018\u00010\f0\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcadjust/AdjustInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "TAG", "", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "ConsumerSfcAdjust_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdjustInitializer implements Initializer<Object> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String ShareDataUIState;

    public AdjustInitializer() {
        String simpleName = Reflection.getOrCreateKotlinClass(AdjustInitializer.class).getSimpleName();
        if (simpleName == null) {
            int i = component1 + 75;
            component3 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            simpleName = "";
        }
        this.ShareDataUIState = simpleName;
        int i4 = component3 + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void component1(AdjustInitializer adjustInitializer, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(adjustInitializer, "");
        L.INSTANCE.d(adjustInitializer.ShareDataUIState, "Adjust SDK Status " + z, new Object[0]);
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
    }

    @Override
    public Object create(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getResources().getString(R.string.adjust_token);
        Intrinsics.checkNotNullExpressionValue(string, "");
        LogLevel logLevel = LogLevel.WARN;
        AdjustConfig adjustConfig = new AdjustConfig(context, string, AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setLogLevel(logLevel);
        L.INSTANCE.d(this.ShareDataUIState, "Adjust SDK Initialization Success", new Object[0]);
        Adjust.isEnabled(context, new OnIsEnabledListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onIsEnabledRead(boolean z) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                AdjustInitializer.m11081$r8$lambda$6lPe4fuKVemEcsAJUBnJKI18(this.f$0, z);
                int i5 = component3 + 69;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        Adjust.initSdk(adjustConfig);
        Unit unit = Unit.INSTANCE;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 19 / 0;
        }
        return unit;
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public static void m11081$r8$lambda$6lPe4fuKVemEcsAJUBnJKI18(AdjustInitializer adjustInitializer, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component1(adjustInitializer, z);
        int i4 = component1 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
