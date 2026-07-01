package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.CellSignalStrengthNr;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.PhoneData;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository;
import com.huawei.digitalpayment.consumer.base.http.HaProxyConstants;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0002cdB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u0018\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020(H\u0016J\u0010\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020%H\u0002J\u000e\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020@2\u0006\u0010I\u001a\u00020JJ(\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u0002022\u0006\u0010N\u001a\u0002022\u0006\u0010O\u001a\u0002022\u0006\u0010I\u001a\u00020JH\u0007J\u0010\u0010P\u001a\u00020@2\u0006\u0010I\u001a\u00020JH\u0003J\u0018\u0010Q\u001a\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010R\u001a\u00020(H\u0003J\u0010\u0010S\u001a\u00020@2\u0006\u0010T\u001a\u00020UH\u0003J\u0010\u0010V\u001a\u00020@2\u0006\u0010W\u001a\u00020XH\u0003J(\u0010Y\u001a\u00020@2\u0006\u0010Z\u001a\u00020[2\u0006\u0010I\u001a\u00020J2\u0006\u0010R\u001a\u00020(2\u0006\u0010\\\u001a\u000202H\u0003J\u0018\u0010]\u001a\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010R\u001a\u00020(H\u0002J\u0010\u0010^\u001a\u00020@2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010&R\u0012\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0004\n\u0002\u0010)R\u0012\u0010*\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0004\n\u0002\u0010)R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u00060<R\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/hardware/SensorEventListener;", "phoneDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;", "connectionLiveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "powerManager", "Landroid/os/PowerManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "subscriptionManager", "Landroid/telephony/SubscriptionManager;", "wifiInfo", "Landroid/net/wifi/WifiInfo;", "phoneData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/PhoneData;", "displayInfoListHold", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DisplayInfo;", "sensorManager", "Landroid/hardware/SensorManager;", "readSensors", "", "accelerometer", "Landroid/hardware/Sensor;", "magnetometer", "mGravity", "", "mGeomagnetic", "azimuthh", "", "Ljava/lang/Float;", "subId1", "", "Ljava/lang/Integer;", "subId2", "locationManager", "Landroid/location/LocationManager;", "callBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "batteryStatus", "Landroid/content/Intent;", "cellVoicenet", "", "cellDataNet", "addInfo", "cellId", "lacTac", "sigDbm", "mcc", "mnc", "addNetInfo", "telephonyListener", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics$TelephonyListener;", "locationListener", "Landroid/location/LocationListener;", "onSensorChanged", "", "event", "Landroid/hardware/SensorEvent;", "onAccuracyChanged", "p0", "p1", "azimuthToDegrees", "azimuth", "getGps", "context", "Landroid/content/Context;", "stopGps", "startGettingDeviceMetrics", "datasessionId", LogConstants.KEY_TIME_STAPM, "logType", "otherMetricsInit", "telephonyInit", "subb", "fiveGeeId", "cellIdentityNr", "Landroid/telephony/CellIdentityNr;", "fiveGeeRadio", "cellSignalStrengthNr", "Landroid/telephony/CellSignalStrengthNr;", "getCellInfo", "cellInfo", "Landroid/telephony/CellInfo;", "carrierName", "getVoiceAndDataNetwork", "getDeviceIpAddress", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "TelephonyListener", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceMetrics implements CoroutineScope, SensorEventListener {
    private static double ArtificialStackFrames = 0.0d;
    private static double CoroutineDebuggingKt = 0.0d;
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallback_Parcel = 1;
    private static double accessartificialFrame = 0.0d;
    private static int asInterface = 0;

    private static int f2750b = 0;

    private static double f2751c = 0.0d;
    private static double component2 = 0.0d;
    private static float component4 = 0.0f;
    private static double copydefault = 0.0d;
    private static double coroutineBoundary = 0.0d;
    private static double coroutineCreation = 0.0d;

    private static int f2752d = 0;
    private static double equals = 0.0d;
    private static int g = 0;
    private static double getARTIFICIAL_FRAME_PACKAGE_NAME = 0.0d;
    private static float getAsAtTimestamp = 0.0f;
    private static double getRequestBeneficiariesState = 0.0d;
    private static double getShareableDataState = 0.0d;
    private static double getSponsorBeneficiariesState = 0.0d;
    private static double hashCode = 0.0d;
    private static int invoke = 0;
    private static double invokeSuspend = 0.0d;
    private static int onWarmupCompleted = 1;
    private Sensor ClientTransaction;
    private String ICustomTabsCallback;
    private WifiManager ICustomTabsCallbackStub;
    private WifiInfo asBinder;
    private String dispose;
    private int extraCallback;
    private SensorManager extraCallbackWithResult;
    private Sensor f;
    private String getActivityToken;
    private BroadcastReceiver hExternalSyntheticLambda0;
    private String i;
    private String j;
    private Intent k;
    private Float l;
    private ConnectionLiveData m;
    private ConnectivityManager n;

    private float[] f2753o;
    private boolean onActivityLayout;
    private PhoneDataRepository onActivityResized;
    private PowerManager onMessageChannelReady;
    private Integer onMinimized;
    private TelephonyManager onNavigationEvent;
    private TelephonyListener onPostMessage;
    private SubscriptionManager onRelationshipValidationResult;
    private Integer onUnminimized;
    private LocationManager p;
    private List<DisplayInfo> q;
    private String r;
    private final LocationListener s;
    private float[] t;
    private PhoneData u;
    private String valueOf;
    private String values;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static String toString = "";
    private static String ShareDataUIState = "";
    private static List<DisplayInfo> copy = new ArrayList();
    private static String component3 = "";

    private static String f2749a = "";
    private static String h = "";
    private static String e = "";
    private static String component1 = "";

    @Inject
    public DeviceMetrics(PhoneDataRepository phoneDataRepository, ConnectionLiveData connectionLiveData) {
        Intrinsics.checkNotNullParameter(phoneDataRepository, "");
        Intrinsics.checkNotNullParameter(connectionLiveData, "");
        this.onActivityResized = phoneDataRepository;
        this.m = connectionLiveData;
        this.u = new PhoneData(0, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0.0d, 0, (String) null, 0, 0, 0, 0, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0.0d, 0.0d, (String) null, 0.0d, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, 0, 0, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, (String) null, (String) null, (String) null, -1, -1, -1, 134217727, (DefaultConstructorMarker) null);
        this.q = new ArrayList();
        this.hExternalSyntheticLambda0 = new CallBroadcastReceiver();
        this.dispose = "";
        this.valueOf = "";
        this.i = "";
        this.values = "";
        this.r = "";
        this.ICustomTabsCallback = "";
        this.getActivityToken = "";
        this.j = "";
        this.s = new LocationListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onLocationChanged(Location location) {
                int i = 2 % 2;
                int i2 = copydefault + 107;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(location, "");
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberLat(location.getLatitude());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberLong(location.getLongitude());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberAlt(location.getAltitude());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberAccu(location.getAccuracy());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberSpd(location.getSpeed());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberBearing(location.getBearing());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberBearingAccuracyDegrees(location.getBearingAccuracyDegrees());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberSpeedAccuracyMetersPerSecond(location.getSpeedAccuracyMetersPerSecond());
                DeviceMetrics.access$getPhoneData$p(this.component2).setSubscriberVerticalAccuracyMeters(location.getVerticalAccuracyMeters());
                DeviceMetrics.INSTANCE.setDevlat(location.getLatitude());
                DeviceMetrics.INSTANCE.setDevlong(location.getLongitude());
                DeviceMetrics.INSTANCE.setDevBearing(location.getBearing());
                DeviceMetrics.INSTANCE.setDevAlt(location.getAltitude());
                DeviceMetrics.INSTANCE.setDevSpd(location.getSpeed());
                int i4 = component1 + 87;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onProviderDisabled(String s) {
                int i = 2 % 2;
                int i2 = copydefault + 113;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(s, "");
                int i4 = copydefault + 55;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 46 / 0;
                }
            }

            @Override
            public void onProviderEnabled(String s) {
                int i = 2 % 2;
                int i2 = copydefault + 113;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(s, "");
                if (i3 != 0) {
                    int i4 = 55 / 0;
                }
            }

            @Override
            @Deprecated(message = "Deprecated in Java")
            public void onStatusChanged(String s, int i, Bundle bundle) {
                int i2 = 2 % 2;
                int i3 = copydefault + 5;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(s, "");
                Intrinsics.checkNotNullParameter(bundle, "");
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 121;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        };
    }

    public static final String access$getAddNetInfo$p(DeviceMetrics deviceMetrics) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 111;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = deviceMetrics.j;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public static final double access$getAveragePing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 29;
        ICustomTabsCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = copydefault;
        int i4 = i2 + 85;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public static final String access$getCellNettype$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 115;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = ShareDataUIState;
        int i5 = i3 + 83;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final String access$getDataConNetwork$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 103;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getDataConnTypee$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 99;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        String str = component3;
        int i5 = i2 + 75;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final double access$getDevAlt$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 73;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        double d2 = component2;
        int i5 = i2 + 73;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public static final float access$getDevBearing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 61;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float f = getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return f;
    }

    public static final float access$getDevSpd$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 43;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        float f = component4;
        int i5 = i2 + 113;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final double access$getDevlat$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 3;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        double d2 = getRequestBeneficiariesState;
        int i5 = i2 + 13;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public static final double access$getDevlong$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 3;
        ICustomTabsCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        double d2 = equals;
        int i4 = i2 + 17;
        ICustomTabsCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return d2;
    }

    public static final List access$getDisplayInfoList$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 35;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        List<DisplayInfo> list = copy;
        int i5 = i3 + 105;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static final double access$getDownload$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 43;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        double d2 = ArtificialStackFrames;
        if (i4 != 0) {
            int i5 = 65 / 0;
        }
        int i6 = i3 + 105;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final double access$getFbPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 11;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return getSponsorBeneficiariesState;
        }
        int i3 = 60 / 0;
        return getSponsorBeneficiariesState;
    }

    public static final double access$getGooglePing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 7;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        double d2 = getShareableDataState;
        int i5 = i2 + 97;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public static final double access$getInstaPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 97;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        double d2 = hashCode;
        int i5 = i3 + 25;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public static final double access$getMicroPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 123;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        double d2 = coroutineCreation;
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = i3 + 41;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return d2;
    }

    public static final PhoneData access$getPhoneData$p(DeviceMetrics deviceMetrics) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        PhoneData phoneData = deviceMetrics.u;
        int i5 = i3 + 93;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return phoneData;
    }

    public static final PhoneDataRepository access$getPhoneDataRepository$p(DeviceMetrics deviceMetrics) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 115;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        PhoneDataRepository phoneDataRepository = deviceMetrics.onActivityResized;
        int i5 = i3 + 67;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return phoneDataRepository;
        }
        throw null;
    }

    public static final double access$getSafPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 79;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return CoroutineDebuggingKt;
        }
        int i3 = 32 / 0;
        return CoroutineDebuggingKt;
    }

    public static final double access$getTiktokPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 1;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d2 = coroutineBoundary;
        int i4 = i3 + 87;
        ICustomTabsCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }

    public static final double access$getTwitterPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 25;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        double d2 = accessartificialFrame;
        int i5 = i3 + 97;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public static final double access$getUpload$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 59;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        double d2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i5 = i2 + 51;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public static final int access$getUploadPacketSize$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 73;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f2750b;
        int i6 = i2 + 15;
        ICustomTabsCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final double access$getWhtasappPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 43;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        double d2 = f2751c;
        int i5 = i3 + 7;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public static final String access$getWifiBandss$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 33;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return f2749a;
        }
        throw null;
    }

    public static final int access$getWifiChann$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return invoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int access$getWifiFreqq$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = f2752d;
        int i6 = i3 + 23;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final String access$getWifiSectypee$cp() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 95;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 != 0) {
            str = h;
            int i4 = 97 / 0;
        } else {
            str = h;
        }
        int i5 = i3 + 45;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public static final int access$getWifiSigDbmm$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 65;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = g;
        int i6 = i2 + 75;
        ICustomTabsCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final String access$getWifiStandardd$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = e;
        int i5 = i3 + 11;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final double access$getYtPing$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 51;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        double d2 = invokeSuspend;
        int i5 = i2 + 23;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 45 / 0;
        }
        return d2;
    }

    public static final String access$isSpeedTestActive$cp() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 65;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = toString;
        int i4 = i3 + 97;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return str;
    }

    public static final void access$setAddNetInfo$p(DeviceMetrics deviceMetrics, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 89;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        deviceMetrics.j = str;
        int i5 = i3 + 57;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setAveragePing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 113;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        copydefault = d2;
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }

    public static final void access$setCellNettype$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 51;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        ShareDataUIState = str;
        int i5 = i3 + 113;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setDataConNetwork$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 9;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        component1 = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final void access$setDataConnTypee$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 109;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        component3 = str;
        int i5 = i3 + 75;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
    }

    public static final void access$setDevAlt$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 65;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        component2 = d2;
        int i5 = i2 + 57;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setDevBearing$cp(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 55;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        getAsAtTimestamp = f;
        int i5 = i2 + 43;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setDevSpd$cp(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 7;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        component4 = f;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
    }

    public static final void access$setDevlat$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 125;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getRequestBeneficiariesState = d2;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 85;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setDevlong$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 79;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        equals = d2;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 83;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setDisplayInfoList$cp(List list) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 53;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        copy = list;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public static final void access$setDownload$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 1;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        ArtificialStackFrames = d2;
        int i5 = i2 + 15;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$setFbPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 83;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        getSponsorBeneficiariesState = d2;
        int i5 = i3 + 101;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setGooglePing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 83;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        getShareableDataState = d2;
        int i5 = i2 + 7;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setInstaPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 17;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        hashCode = d2;
        int i5 = i3 + 99;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setMicroPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 119;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        coroutineCreation = d2;
        int i5 = i3 + 119;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setSafPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 17;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        CoroutineDebuggingKt = d2;
        int i5 = i2 + 1;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setSpeedTestActive$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel;
        int i3 = i2 + 59;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        toString = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 51;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setTiktokPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 81;
        ICustomTabsCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        coroutineBoundary = d2;
        int i5 = i2 + 69;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void access$setTwitterPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 81;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        accessartificialFrame = d2;
        int i5 = i3 + 19;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setUpload$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 39;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        getARTIFICIAL_FRAME_PACKAGE_NAME = d2;
        int i5 = i3 + 23;
        ICustomTabsCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
    }

    public static final void access$setUploadPacketSize$cp(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackDefault;
        int i4 = i3 + 37;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        f2750b = i;
        int i6 = i3 + 1;
        ICustomTabsCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final void access$setWhtasappPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 77;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        f2751c = d2;
        int i5 = i3 + 23;
        ICustomTabsCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setWifiBandss$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 103;
        int i3 = i2 % 128;
        ICustomTabsCallback_Parcel = i3;
        int i4 = i2 % 2;
        f2749a = str;
        int i5 = i3 + 87;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$setWifiChann$cp(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 31;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        invoke = i;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
    }

    public static final void access$setWifiFreqq$cp(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 73;
        int i4 = i3 % 128;
        ICustomTabsCallbackDefault = i4;
        int i5 = i3 % 2;
        f2752d = i;
        if (i5 != 0) {
            int i6 = 5 / 0;
        }
        int i7 = i4 + 21;
        ICustomTabsCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final void access$setWifiSectypee$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 99;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        h = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setWifiSigDbmm$cp(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback_Parcel + 125;
        int i4 = i3 % 128;
        ICustomTabsCallbackDefault = i4;
        int i5 = i3 % 2;
        g = i;
        int i6 = i4 + 85;
        ICustomTabsCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setWifiStandardd$cp(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 71;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        e = str;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }

    public static final void access$setYtPing$cp(double d2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 45;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        invokeSuspend = d2;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR\u001a\u0010<\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR \u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001a\u0010U\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0006\"\u0004\bW\u0010\bR\u001a\u0010X\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0006\"\u0004\bZ\u0010\bR\u001a\u0010[\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R\u001a\u0010^\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00106\"\u0004\b`\u00108R\u001a\u0010a\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00106\"\u0004\bc\u00108R\u001a\u0010d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\b¨\u0006j"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics$Companion;", "", "<init>", "()V", "isSpeedTestActive", "", "()Ljava/lang/String;", "setSpeedTestActive", "(Ljava/lang/String;)V", "averagePing", "", "getAveragePing", "()D", "setAveragePing", "(D)V", "whtasappPing", "getWhtasappPing", "setWhtasappPing", "instaPing", "getInstaPing", "setInstaPing", "googlePing", "getGooglePing", "setGooglePing", "twitterPing", "getTwitterPing", "setTwitterPing", "fbPing", "getFbPing", "setFbPing", "safPing", "getSafPing", "setSafPing", "microPing", "getMicroPing", "setMicroPing", "tiktokPing", "getTiktokPing", "setTiktokPing", "ytPing", "getYtPing", "setYtPing", "cellNettype", "getCellNettype", "setCellNettype", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "getUpload", "setUpload", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_DOWNLOAD, "getDownload", "setDownload", "uploadPacketSize", "", "getUploadPacketSize", "()I", "setUploadPacketSize", "(I)V", "devlat", "getDevlat", "setDevlat", "devlong", "getDevlong", "setDevlong", "devAlt", "getDevAlt", "setDevAlt", "devSpd", "", "getDevSpd", "()F", "setDevSpd", "(F)V", "devBearing", "getDevBearing", "setDevBearing", "displayInfoList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DisplayInfo;", "getDisplayInfoList", "()Ljava/util/List;", "setDisplayInfoList", "(Ljava/util/List;)V", "dataConnTypee", "getDataConnTypee", "setDataConnTypee", "wifiBandss", "getWifiBandss", "setWifiBandss", "wifiSectypee", "getWifiSectypee", "setWifiSectypee", "wifiFreqq", "getWifiFreqq", "setWifiFreqq", "wifiChann", "getWifiChann", "setWifiChann", "wifiSigDbmm", "getWifiSigDbmm", "setWifiSigDbmm", "wifiStandardd", "getWifiStandardd", "setWifiStandardd", "dataConNetwork", "getDataConNetwork", "setDataConNetwork", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {120, 65, 99, 57};
        private static final int $$f = 50;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {Ascii.SI, 58, -59, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, TarHeader.LF_FIFO, 3, 3, -72, 60, -11, -7, Ascii.SI, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -21, 3, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5};
        private static final int $$e = 78;
        private static final byte[] $$a = {119, -27, 13, -93, 2, -15, TarHeader.LF_CHR, -50, TarHeader.LF_SYMLINK, -51, 32, -21, -4, 8, -14, -1, 19, -12, -3, 2, -15, 34, -19, -12, -4, Ascii.DLE, -14, -1, TarHeader.LF_SYMLINK, -35, -9, 9, -1, -3, 6, -6, 8, -17, 9, 4, -14, 32, -33, 19, -19, Ascii.SI, -12, -1, -9};
        private static final int $$b = 64;
        private static int ShareDataUIState = 0;
        private static int getAsAtTimestamp = 1;
        private static char component2 = 20838;
        private static char component1 = 3010;
        private static char copydefault = 5587;
        private static char component3 = 27363;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r7, short r8, int r9) {
            /*
                int r9 = r9 + 4
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.$$c
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r7 = r7 * 3
                int r7 = 111 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r7 = r9
                r5 = r2
                goto L2a
            L15:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L19:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L26:
                int r7 = r7 + 1
                r3 = r0[r7]
            L2a:
                int r3 = -r3
                int r9 = r9 + r3
                r3 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.$$g(byte, short, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.$$a
                int r6 = r6 * 12
                int r1 = 28 - r6
                int r8 = r8 * 4
                int r8 = 103 - r8
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r6 = 27 - r6
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r7
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.a(short, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(short r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.$$d
                int r7 = r7 * 37
                int r1 = r7 + 11
                int r5 = r5 * 47
                int r5 = 49 - r5
                int r6 = r6 * 4
                int r6 = r6 + 99
                byte[] r1 = new byte[r1]
                int r7 = r7 + 10
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                int r5 = r5 + 1
                r3 = r0[r5]
            L2c:
                int r6 = r6 + r3
                int r6 = r6 + 3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.c(short, byte, byte, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
            char[] cArr2 = new char[cArr.length];
            iNotificationSideChannelDefault.component3 = 0;
            char[] cArr3 = new char[2];
            while (iNotificationSideChannelDefault.component3 < cArr.length) {
                int i3 = $10 + 21;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                int i5 = $11 + 95;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 58224;
                for (int i8 = 0; i8 < 16; i8++) {
                    int i9 = $10 + 105;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i7) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component3)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 844, TextUtils.lastIndexOf("", '0', 0) + 33, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 23251), 592652048, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - View.combineMeasuredStates(0, 0), 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (23251 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 592652048, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
                cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
                Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 466, 49 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.green(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private Companion() {
        }

        public final String isSpeedTestActive() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            String strAccess$isSpeedTestActive$cp = DeviceMetrics.access$isSpeedTestActive$cp();
            int i4 = getAsAtTimestamp + 7;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return strAccess$isSpeedTestActive$cp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setSpeedTestActive(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                DeviceMetrics.access$setSpeedTestActive$cp(str);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                DeviceMetrics.access$setSpeedTestActive$cp(str);
                int i3 = 62 / 0;
            }
        }

        public final double getAveragePing() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getAveragePing$cp = DeviceMetrics.access$getAveragePing$cp();
            int i4 = ShareDataUIState + 59;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return dAccess$getAveragePing$cp;
            }
            throw null;
        }

        public final void setAveragePing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setAveragePing$cp(d2);
            int i4 = getAsAtTimestamp + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        public final double getWhtasappPing() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getWhtasappPing$cp = DeviceMetrics.access$getWhtasappPing$cp();
            int i4 = ShareDataUIState + 91;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return dAccess$getWhtasappPing$cp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setWhtasappPing(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 121;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setWhtasappPing$cp(d2);
            int i4 = ShareDataUIState + 67;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public final double getInstaPing() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return DeviceMetrics.access$getInstaPing$cp();
            }
            DeviceMetrics.access$getInstaPing$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setInstaPing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setInstaPing$cp(d2);
            if (i3 != 0) {
                throw null;
            }
        }

        public final double getGooglePing() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getGooglePing$cp = DeviceMetrics.access$getGooglePing$cp();
            int i4 = ShareDataUIState + 63;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return dAccess$getGooglePing$cp;
        }

        public final void setGooglePing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setGooglePing$cp(d2);
            int i4 = getAsAtTimestamp + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        public final double getTwitterPing() {
            double dAccess$getTwitterPing$cp;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 61;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                dAccess$getTwitterPing$cp = DeviceMetrics.access$getTwitterPing$cp();
                int i3 = 47 / 0;
            } else {
                dAccess$getTwitterPing$cp = DeviceMetrics.access$getTwitterPing$cp();
            }
            int i4 = ShareDataUIState + 109;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return dAccess$getTwitterPing$cp;
        }

        public final void setTwitterPing(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setTwitterPing$cp(d2);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final double getFbPing() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return DeviceMetrics.access$getFbPing$cp();
            }
            DeviceMetrics.access$getFbPing$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setFbPing(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 41;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setFbPing$cp(d2);
            int i4 = ShareDataUIState + 21;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }

        public final double getSafPing() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getSafPing$cp = DeviceMetrics.access$getSafPing$cp();
            int i4 = getAsAtTimestamp + 111;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return dAccess$getSafPing$cp;
            }
            throw null;
        }

        public final void setSafPing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setSafPing$cp(d2);
            if (i3 != 0) {
                throw null;
            }
        }

        public final double getMicroPing() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getMicroPing$cp = DeviceMetrics.access$getMicroPing$cp();
            int i4 = getAsAtTimestamp + 33;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return dAccess$getMicroPing$cp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setMicroPing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setMicroPing$cp(d2);
            if (i3 != 0) {
                int i4 = 8 / 0;
            }
            int i5 = getAsAtTimestamp + 15;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final double getTiktokPing() {
            double dAccess$getTiktokPing$cp;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                dAccess$getTiktokPing$cp = DeviceMetrics.access$getTiktokPing$cp();
                int i3 = 86 / 0;
            } else {
                dAccess$getTiktokPing$cp = DeviceMetrics.access$getTiktokPing$cp();
            }
            int i4 = getAsAtTimestamp + 91;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return dAccess$getTiktokPing$cp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setTiktokPing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setTiktokPing$cp(d2);
            int i4 = getAsAtTimestamp + 29;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
        }

        public final double getYtPing() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getYtPing$cp = DeviceMetrics.access$getYtPing$cp();
            int i4 = getAsAtTimestamp + 61;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return dAccess$getYtPing$cp;
        }

        public final void setYtPing(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setYtPing$cp(d2);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = ShareDataUIState + 57;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }

        public final String getCellNettype() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 31;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            String strAccess$getCellNettype$cp = DeviceMetrics.access$getCellNettype$cp();
            if (i3 == 0) {
                int i4 = 23 / 0;
            }
            return strAccess$getCellNettype$cp;
        }

        public final void setCellNettype(String str) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 7;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            DeviceMetrics.access$setCellNettype$cp(str);
            int i4 = ShareDataUIState + 77;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final double getUpload() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                DeviceMetrics.access$getUpload$cp();
                throw null;
            }
            double dAccess$getUpload$cp = DeviceMetrics.access$getUpload$cp();
            int i3 = ShareDataUIState + 47;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return dAccess$getUpload$cp;
        }

        public final void setUpload(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setUpload$cp(d2);
            int i4 = getAsAtTimestamp + 87;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public final double getDownload() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 115;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return DeviceMetrics.access$getDownload$cp();
            }
            DeviceMetrics.access$getDownload$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setDownload(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDownload$cp(d2);
            int i4 = getAsAtTimestamp + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getUploadPacketSize() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 21;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                DeviceMetrics.access$getUploadPacketSize$cp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iAccess$getUploadPacketSize$cp = DeviceMetrics.access$getUploadPacketSize$cp();
            int i3 = ShareDataUIState + 125;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return iAccess$getUploadPacketSize$cp;
        }

        public final void setUploadPacketSize(int i) {
            int i2 = 2 % 2;
            int i3 = getAsAtTimestamp + 33;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            DeviceMetrics.access$setUploadPacketSize$cp(i);
            if (i4 != 0) {
                int i5 = 17 / 0;
            }
        }

        public final double getDevlat() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return DeviceMetrics.access$getDevlat$cp();
            }
            int i3 = 77 / 0;
            return DeviceMetrics.access$getDevlat$cp();
        }

        public final void setDevlat(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDevlat$cp(d2);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = getAsAtTimestamp + 83;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        public final double getDevlong() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return DeviceMetrics.access$getDevlong$cp();
            }
            DeviceMetrics.access$getDevlong$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setDevlong(double d2) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDevlong$cp(d2);
            int i4 = ShareDataUIState + 125;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }

        public final double getDevAlt() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 105;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            double dAccess$getDevAlt$cp = DeviceMetrics.access$getDevAlt$cp();
            int i4 = getAsAtTimestamp + 87;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return dAccess$getDevAlt$cp;
        }

        public final void setDevAlt(double d2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDevAlt$cp(d2);
            if (i3 == 0) {
                throw null;
            }
        }

        public final float getDevSpd() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 87;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                DeviceMetrics.access$getDevSpd$cp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fAccess$getDevSpd$cp = DeviceMetrics.access$getDevSpd$cp();
            int i3 = getAsAtTimestamp + 107;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
            }
            return fAccess$getDevSpd$cp;
        }

        public final void setDevSpd(float f) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDevSpd$cp(f);
            int i4 = ShareDataUIState + 43;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getDevBearing() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
            if (objCopydefault == null) {
                int iBlue = 1115 - Color.blue(0);
                int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                byte b2 = (byte) (-$$a[15]);
                byte b3 = (byte) (b2 - 1);
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, scrollBarFadeDuration, c2, -1308762862, false, (String) objArr2[0], null);
            }
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b(22 - View.MeasureSpec.getSize(0), new char[]{819, 28889, 18115, 62642, 35419, 22940, 12473, 64625, 8874, 50055, 39049, 11737, 51103, 25703, 41488, 3004, 35771, 36577, 4090, 55455, 54968, 55618}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(15 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{33720, 59457, 50865, 59539, 61838, 39631, 51603, 54269, 41653, 8920, 34380, 22143, 45653, 32861, 35881, 28670}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
            if (objCopydefault2 == null) {
                int gidForName = Process.getGidForName("") + 1116;
                int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0');
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b4 = (byte) ($$a[15] + 1);
                byte b5 = (byte) (b4 + 5);
                Object[] objArr5 = new Object[1];
                a(b4, b5, (byte) (b5 - 5), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iIndexOf, keyRepeatTimeout, -206681338, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                if (objCopydefault3 == null) {
                    int offsetBefore = 1115 - TextUtils.getOffsetBefore("", 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr[4], (byte) (-bArr[14]), (byte) (-bArr[15]), objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iLastIndexOf, cResolveSizeAndState, 44744436, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i4 = ~System.identityHashCode(this);
                int i5 = ~(59675134 | i4);
                int i6 = (((676634431 + ((i5 | 133522353) * 764)) + (((~(i4 | 133522353)) | 692302) * (-1528))) + ((75231823 | i5) * 764)) - 709637369;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, new char[]{1058, 26811, 60074, 15413, 6517, 26365, 819, 28889, 2748, 7330, 58644, 40384, 20514, 57578, 21731, 44023}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b((Process.myPid() >> 22) + 16, new char[]{60234, 28958, 17616, 46870, 17170, 29391, 7590, 15107, 31122, 25591, 60551, 17559, 64007, 63412, 63839, 42352}, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i9 = getAsAtTimestamp + 79;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr10 = {Integer.valueOf(iIntValue), -709637369};
                    byte[] bArr2 = $$d;
                    byte b6 = bArr2[29];
                    byte b7 = (byte) (-b6);
                    Object[] objArr11 = new Object[1];
                    c(b7, (byte) (b7 - 1), (byte) (-b6), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b8 = (byte) (bArr2[29] + 1);
                    byte b9 = b8;
                    Object[] objArr12 = new Object[1];
                    c(b8, b9, b9, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                    if (objCopydefault4 == null) {
                        byte[] bArr3 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr3[4], (byte) (-bArr3[14]), (byte) (-bArr3[15]), objArr14);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 1115, 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 44744436, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(View.resolveSizeAndState(0, 0, 0) + 22, new char[]{819, 28889, 18115, 62642, 35419, 22940, 12473, 64625, 8874, 50055, 39049, 11737, 51103, 25703, 41488, 3004, 35771, 36577, 4090, 55455, 54968, 55618}, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, new char[]{33720, 59457, 50865, 59539, 61838, 39631, 51603, 54269, 41653, 8920, 34380, 22143, 45653, 32861, 35881, 28670}, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                        if (objCopydefault5 == null) {
                            int packedPositionGroup = 1115 - ExpandableListView.getPackedPositionGroup(0L);
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b10 = (byte) ($$a[15] + 1);
                            byte b11 = (byte) (b10 + 5);
                            Object[] objArr17 = new Object[1];
                            a(b10, b11, (byte) (b11 - 5), objArr17);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, maximumDrawingCacheSize, c3, -206681338, false, (String) objArr17[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                        if (objCopydefault6 == null) {
                            int i11 = 1116 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int iAlpha = 22 - Color.alpha(0);
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                            byte b12 = (byte) (-$$a[15]);
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr18 = new Object[1];
                            a(b12, b13, b13, objArr18);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i11, iAlpha, cLastIndexOf, -1308762862, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                        objArr = objArr13;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[2])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = i14 + 1281078024 + ((~((-16780369) | iIdentityHashCode)) * (-301)) + (((~(829078777 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 1022276265))) * (-301)) + (((~(iIdentityHashCode | (-1022276266))) | 829078777) * 301);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr19[0])[0] = i17 ^ (i17 << 5);
                int i18 = ((int[]) objArr19[0])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr19[1])[0]}, new int[]{((int[]) objArr19[2])[0]}, (String[]) objArr19[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i19 = i18 + 580594671 + (((~((-102363269) | iIdentityHashCode2)) | 67633152) * 576) + (((~((~iIdentityHashCode2) | (-34730117))) | 23201067) * 576) + 301989888;
                int i20 = (i19 << 13) ^ i19;
                int i21 = i20 ^ (i20 >>> 17);
                ((int[]) objArr20[0])[0] = i21 ^ (i21 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                long j2 = -1;
                long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr21 = {481019750, Long.valueOf(j5), arrayList, null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 57, (char) View.getDefaultSize(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                    int i22 = ((int[]) objArr[0])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i23 = ~((-121759142) | iIdentityHashCode3);
                    int i24 = ~iIdentityHashCode3;
                    int i25 = i22 + (-851396223) + ((i23 | (~(121894319 | i24))) * (-406)) + ((~((-50455974) | i24)) * (-406)) + (((~(iIdentityHashCode3 | (-71438347))) | (~(121759141 | i24))) * HaProxyConstants.VOUCHER_TOP_UP_SUCESS);
                    int i26 = (i25 << 13) ^ i25;
                    int i27 = i26 ^ (i26 >>> 17);
                    ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
                    int[] iArr = new int[i13];
                    int i28 = i13 - 1;
                    iArr[i28] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i28) % 2) - 1], 1).show();
                    int i29 = ((int[]) objArr22[0])[0];
                    Object[] objArr23 = {new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i30 = ~iFreeMemory;
                    int i31 = i29 + 297149810 + (((~(209282706 | i30)) | 402480194) * (-90)) + (((~(209282706 | iFreeMemory)) | 134226576) * (-45)) + (((~(iFreeMemory | (-402480195))) | 209282706 | (~(i30 | 402480194))) * 45);
                    int i32 = (i31 << 13) ^ i31;
                    int i33 = i32 ^ (i32 >>> 17);
                    ((int[]) objArr23[0])[0] = i33 ^ (i33 << 5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            float fAccess$getDevBearing$cp = DeviceMetrics.access$getDevBearing$cp();
            int i34 = ShareDataUIState + 45;
            getAsAtTimestamp = i34 % 128;
            int i35 = i34 % 2;
            return fAccess$getDevBearing$cp;
        }

        public final void setDevBearing(float f) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            DeviceMetrics.access$setDevBearing$cp(f);
            int i4 = getAsAtTimestamp + 51;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<DisplayInfo> getDisplayInfoList() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 79;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return DeviceMetrics.access$getDisplayInfoList$cp();
            }
            DeviceMetrics.access$getDisplayInfoList$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setDisplayInfoList(List<DisplayInfo> list) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 55;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                DeviceMetrics.access$setDisplayInfoList$cp(list);
            } else {
                Intrinsics.checkNotNullParameter(list, "");
                DeviceMetrics.access$setDisplayInfoList$cp(list);
                throw null;
            }
        }

        public final String getDataConnTypee() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 59;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                DeviceMetrics.access$getDataConnTypee$cp();
                throw null;
            }
            String strAccess$getDataConnTypee$cp = DeviceMetrics.access$getDataConnTypee$cp();
            int i3 = getAsAtTimestamp + 121;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return strAccess$getDataConnTypee$cp;
            }
            throw null;
        }

        public final void setDataConnTypee(String str) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            DeviceMetrics.access$setDataConnTypee$cp(str);
            int i4 = ShareDataUIState + 45;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }

        public final String getWifiBandss() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                DeviceMetrics.access$getWifiBandss$cp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String strAccess$getWifiBandss$cp = DeviceMetrics.access$getWifiBandss$cp();
            int i3 = ShareDataUIState + 9;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return strAccess$getWifiBandss$cp;
        }

        public final void setWifiBandss(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            DeviceMetrics.access$setWifiBandss$cp(str);
            int i4 = getAsAtTimestamp + 43;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public final String getWifiSectypee() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 57;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return DeviceMetrics.access$getWifiSectypee$cp();
            }
            DeviceMetrics.access$getWifiSectypee$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setWifiSectypee(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                DeviceMetrics.access$setWifiSectypee$cp(str);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                DeviceMetrics.access$setWifiSectypee$cp(str);
                int i3 = 93 / 0;
            }
        }

        public final int getWifiFreqq() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            int iAccess$getWifiFreqq$cp = DeviceMetrics.access$getWifiFreqq$cp();
            int i4 = ShareDataUIState + 123;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return iAccess$getWifiFreqq$cp;
        }

        public final void setWifiFreqq(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 23;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            DeviceMetrics.access$setWifiFreqq$cp(i);
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = getAsAtTimestamp + 113;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public final int getWifiChann() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iAccess$getWifiChann$cp = DeviceMetrics.access$getWifiChann$cp();
            if (i3 != 0) {
                int i4 = 20 / 0;
            }
            return iAccess$getWifiChann$cp;
        }

        public final void setWifiChann(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            DeviceMetrics.access$setWifiChann$cp(i);
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = ShareDataUIState + 45;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }

        public final int getWifiSigDbmm() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iAccess$getWifiSigDbmm$cp = DeviceMetrics.access$getWifiSigDbmm$cp();
            int i4 = getAsAtTimestamp + 21;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iAccess$getWifiSigDbmm$cp;
        }

        public final void setWifiSigDbmm(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 61;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            DeviceMetrics.access$setWifiSigDbmm$cp(i);
            int i5 = ShareDataUIState + 103;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getWifiStandardd() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return DeviceMetrics.access$getWifiStandardd$cp();
            }
            DeviceMetrics.access$getWifiStandardd$cp();
            throw null;
        }

        public final void setWifiStandardd(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 37;
            getAsAtTimestamp = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                DeviceMetrics.access$setWifiStandardd$cp(str);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            DeviceMetrics.access$setWifiStandardd$cp(str);
            int i3 = ShareDataUIState + 67;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public final String getDataConNetwork() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 69;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return DeviceMetrics.access$getDataConNetwork$cp();
            }
            DeviceMetrics.access$getDataConNetwork$cp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setDataConNetwork(String str) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            DeviceMetrics.access$setDataConNetwork$cp(str);
            int i4 = getAsAtTimestamp + 109;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics$TelephonyListener;", "Landroid/telephony/PhoneStateListener;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics;)V", "onDisplayInfoChanged", "", "telephonyDisplayInfo", "Landroid/telephony/TelephonyDisplayInfo;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TelephonyListener extends PhoneStateListener {
        private static int component1 = 0;
        private static int copydefault = 1;

        public TelephonyListener() {
        }

        @Override
        @Deprecated(message = "Deprecated in Java")
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int i = 2 % 2;
            int i2 = component1 + 39;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(telephonyDisplayInfo, "");
                if (Build.VERSION.SDK_INT < 70) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(telephonyDisplayInfo, "");
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
            }
            super.onDisplayInfoChanged(telephonyDisplayInfo);
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType == 1) {
                DeviceMetrics.access$setAddNetInfo$p(DeviceMetrics.this, "CA+");
                return;
            }
            if (overrideNetworkType == 2) {
                DeviceMetrics.access$setAddNetInfo$p(DeviceMetrics.this, "Adv+");
                return;
            }
            int i3 = copydefault + 35;
            component1 = i3 % 128;
            if (i3 % 2 == 0 ? overrideNetworkType != 3 : overrideNetworkType != 2) {
                DeviceMetrics.access$getAddNetInfo$p(DeviceMetrics.this);
                return;
            }
            DeviceMetrics.access$setAddNetInfo$p(DeviceMetrics.this, "5G-NSA+");
            int i4 = component1 + 1;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float[] fArr;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 55;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        if (this.onActivityLayout) {
            if (event.sensor.getType() == 1) {
                this.t = event.values;
            }
            if (event.sensor.getType() == 2) {
                this.f2753o = event.values;
            }
            float[] fArr2 = this.t;
            if (fArr2 == null || (fArr = this.f2753o) == null) {
                return;
            }
            int i4 = ICustomTabsCallbackDefault + 123;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            float[] fArr3 = new float[9];
            if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
                float[] fArr4 = new float[3];
                SensorManager.getOrientation(fArr3, fArr4);
                Float fValueOf = Float.valueOf(fArr4[0]);
                this.l = fValueOf;
                PhoneData phoneData = this.u;
                Intrinsics.checkNotNull(fValueOf);
                phoneData.setSubscriberDeg(ShareDataUIState(fValueOf.floatValue()));
            }
        }
    }

    private final float ShareDataUIState(float f) {
        double degrees;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 29;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            double d2 = 22562;
            degrees = (Math.toDegrees(f) + d2) / d2;
        } else {
            double degrees2 = Math.toDegrees(f);
            double d3 = AUScreenAdaptTool.WIDTH_BASE;
            degrees = (degrees2 + d3) % d3;
        }
        float f2 = (float) degrees;
        int i3 = ICustomTabsCallback_Parcel + 67;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getGps(android.content.Context r21) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.getGps(android.content.Context):void");
    }

    public final void stopGps(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object obj = null;
        try {
            LocationManager locationManager = this.p;
            if (locationManager != null) {
                int i2 = ICustomTabsCallback_Parcel + 73;
                ICustomTabsCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                locationManager.removeUpdates(this.s);
            }
            SensorManager sensorManager = this.extraCallbackWithResult;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this, this.f);
            }
            SensorManager sensorManager2 = this.extraCallbackWithResult;
            if (sensorManager2 != null) {
                int i4 = ICustomTabsCallback_Parcel + 41;
                ICustomTabsCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                sensorManager2.unregisterListener(this, this.ClientTransaction);
            }
            this.onActivityLayout = false;
            context.getApplicationContext().unregisterReceiver(this.hExternalSyntheticLambda0);
            if (Build.VERSION.SDK_INT >= 30 && ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                int i6 = ICustomTabsCallback_Parcel + 59;
                ICustomTabsCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
                TelephonyManager telephonyManager = this.onNavigationEvent;
                if (telephonyManager != null) {
                    TelephonyListener telephonyListener = this.onPostMessage;
                    if (telephonyListener == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        telephonyListener = null;
                    }
                    telephonyManager.listen(telephonyListener, 0);
                }
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        int i8 = ICustomTabsCallback_Parcel + 85;
        ICustomTabsCallbackDefault = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics$startGettingDeviceMetrics$2$1", f = "DeviceMetrics.kt", i = {}, l = {371}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int component3;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component2 + 75;
                component3 = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (DeviceMetrics.access$getPhoneDataRepository$p(DeviceMetrics.this).insert(DeviceMetrics.access$getPhoneData$p(DeviceMetrics.this), this) == coroutine_suspended) {
                    int i4 = component3 + 69;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 85 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = DeviceMetrics.this.new component3(continuation);
            int i2 = component3 + 1;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 125;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component3(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent3 = component3(coroutineScope2, continuation2);
            int i3 = component2 + 67;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 9;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startGettingDeviceMetrics(java.lang.String r27, java.lang.String r28, java.lang.String r29, android.content.Context r30) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.startGettingDeviceMetrics(java.lang.String, java.lang.String, java.lang.String, android.content.Context):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics$startGettingDeviceMetrics$2$2", f = "DeviceMetrics.kt", i = {}, l = {407}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int component3;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r1
  0x0040: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component1
                int r1 = r1 + 35
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component2 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component3
                r4 = 30
                int r4 = r4 / 0
                if (r3 == 0) goto L40
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component3
                if (r3 == 0) goto L40
            L24:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component1
                int r1 = r1 + 29
                int r4 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component2 = r4
                int r1 = r1 % r0
                if (r1 == 0) goto L32
                if (r3 != 0) goto L38
                goto L34
            L32:
                if (r3 != r2) goto L38
            L34:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L64
            L38:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L40:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.this
                com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.access$getPhoneDataRepository$p(r6)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics r3 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.this
                com.huawei.digitalpayment.consumer.base.database.entities.mtandao.PhoneData r3 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.access$getPhoneData$p(r3)
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.component3 = r2
                java.lang.Object r6 = r6.insert(r3, r4)
                if (r6 != r1) goto L64
                int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component2
                int r6 = r6 + 77
                int r2 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.component1 = r2
                int r6 = r6 % r0
                return r1
            L64:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = DeviceMetrics.this.new copydefault(continuation);
            int i2 = component2 + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 76 / 0;
            }
            int i5 = component1 + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                copydefaultVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(unit);
            int i4 = component2 + 49;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:453:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component3(android.content.Context r17) throws java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 2620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.component3(android.content.Context):void");
    }

    private final void component2(Context context, int i) {
        TelephonyManager telephonyManagerCreateForSubscriptionId;
        ServiceState serviceStateM;
        TelephonyManager telephonyManagerCreateForSubscriptionId2;
        ServiceState serviceStateM2;
        TelephonyManager telephonyManagerCreateForSubscriptionId3;
        ServiceState serviceStateM3;
        TelephonyManager telephonyManagerCreateForSubscriptionId4;
        ServiceState serviceStateM4;
        TelephonyManager telephonyManagerCreateForSubscriptionId5;
        ServiceState serviceStateM5;
        TelephonyManager telephonyManagerCreateForSubscriptionId6;
        TelephonyManager telephonyManagerCreateForSubscriptionId7;
        int i2 = 2 % 2;
        if (ActivityCompat.checkSelfPermission(context.getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0 && ActivityCompat.checkSelfPermission(context.getApplicationContext(), "android.permission.READ_PHONE_STATE") == 0) {
            int i3 = ICustomTabsCallback_Parcel + 73;
            ICustomTabsCallbackDefault = i3 % 128;
            Integer numValueOf = null;
            if (i3 % 2 != 0) {
                numValueOf.hashCode();
                throw null;
            }
            TelephonyManager telephonyManager = this.onNavigationEvent;
            Integer numValueOf2 = (telephonyManager == null || (telephonyManagerCreateForSubscriptionId7 = telephonyManager.createForSubscriptionId(i)) == null) ? null : Integer.valueOf(telephonyManagerCreateForSubscriptionId7.getDataState());
            if (numValueOf2 != null && numValueOf2.intValue() == 2) {
                int i4 = ICustomTabsCallback_Parcel + 101;
                ICustomTabsCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    this.u.setDataMode("CONNECTED");
                    int i5 = 96 / 0;
                } else {
                    this.u.setDataMode("CONNECTED");
                }
            } else if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                this.u.setDataMode("CONNECTING");
            } else if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                this.u.setDataMode("DISCONNECTED");
            } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                this.u.setDataMode("SUSPENDED");
            } else if (numValueOf2 != null && numValueOf2.intValue() == 4) {
                this.u.setDataMode("DISCONNECTING");
            }
            TelephonyManager telephonyManager2 = this.onNavigationEvent;
            Integer numValueOf3 = (telephonyManager2 == null || (telephonyManagerCreateForSubscriptionId6 = telephonyManager2.createForSubscriptionId(i)) == null) ? null : Integer.valueOf(telephonyManagerCreateForSubscriptionId6.getDataActivity());
            if (numValueOf3 != null && numValueOf3.intValue() == 4) {
                int i6 = ICustomTabsCallback_Parcel + 79;
                ICustomTabsCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    this.u.setDataState("DORMANT");
                    int i7 = 54 / 0;
                } else {
                    this.u.setDataState("DORMANT");
                }
            } else if (numValueOf3 != null && numValueOf3.intValue() == 1) {
                this.u.setDataState("DATA IN");
            } else if (numValueOf3 != null && numValueOf3.intValue() == 3) {
                this.u.setDataState("DATA INOUT");
            } else if (numValueOf3 != null && numValueOf3.intValue() == 2) {
                int i8 = ICustomTabsCallbackDefault + 13;
                ICustomTabsCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                this.u.setDataState("DATA OUT");
            } else if (numValueOf3 != null && numValueOf3.intValue() == 0) {
                this.u.setDataState(NetworkUtils.NETWORK_TYPE_NONE);
                int i10 = ICustomTabsCallback_Parcel + 53;
                ICustomTabsCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
            }
            TelephonyManager telephonyManager3 = this.onNavigationEvent;
            Integer numValueOf4 = (telephonyManager3 == null || (telephonyManagerCreateForSubscriptionId5 = telephonyManager3.createForSubscriptionId(i)) == null || (serviceStateM5 = zzc$$ExternalSyntheticApiModelOutline0.m(telephonyManagerCreateForSubscriptionId5)) == null) ? null : Integer.valueOf(serviceStateM5.getState());
            if (numValueOf4 != null && numValueOf4.intValue() == 0) {
                this.u.setDeviceState("IN SERVICE");
            } else if (numValueOf4 != null && numValueOf4.intValue() == 1) {
                this.u.setDeviceState("OUT OF SERVICE");
            } else if (numValueOf4 != null && numValueOf4.intValue() == 2) {
                this.u.setDeviceState("EMERGENCY ONLY");
            } else if (numValueOf4 != null && numValueOf4.intValue() == 3) {
                this.u.setDeviceState("RADIO OFF");
            }
            if (Build.VERSION.SDK_INT >= 30) {
                int i12 = ICustomTabsCallback_Parcel + 7;
                ICustomTabsCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                PhoneData phoneData = this.u;
                TelephonyManager telephonyManager4 = this.onNavigationEvent;
                phoneData.setNetStatus((telephonyManager4 == null || (telephonyManagerCreateForSubscriptionId4 = telephonyManager4.createForSubscriptionId(i)) == null || (serviceStateM4 = zzc$$ExternalSyntheticApiModelOutline0.m(telephonyManagerCreateForSubscriptionId4)) == null || !serviceStateM4.isSearching()) ? "REGISTERED" : "SEARCHING");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                TelephonyManager telephonyManager5 = this.onNavigationEvent;
                if (telephonyManager5 != null && (telephonyManagerCreateForSubscriptionId3 = telephonyManager5.createForSubscriptionId(i)) != null && (serviceStateM3 = zzc$$ExternalSyntheticApiModelOutline0.m(telephonyManagerCreateForSubscriptionId3)) != null) {
                    numValueOf = Integer.valueOf(serviceStateM3.getDuplexMode());
                }
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    this.u.setDuplexMode("FDD");
                } else if (numValueOf != null && numValueOf.intValue() == 2) {
                    int i14 = ICustomTabsCallback_Parcel + 95;
                    ICustomTabsCallbackDefault = i14 % 128;
                    int i15 = i14 % 2;
                    this.u.setDuplexMode("TDD");
                } else if (numValueOf != null && numValueOf.intValue() == 0) {
                    this.u.setDuplexMode("UNKNOWN");
                }
            }
            PhoneData phoneData2 = this.u;
            TelephonyManager telephonyManager6 = this.onNavigationEvent;
            phoneData2.setNetSearchMode((telephonyManager6 == null || (telephonyManagerCreateForSubscriptionId2 = telephonyManager6.createForSubscriptionId(i)) == null || (serviceStateM2 = zzc$$ExternalSyntheticApiModelOutline0.m(telephonyManagerCreateForSubscriptionId2)) == null || !serviceStateM2.getIsManualSelection()) ? "MANUAL" : "AUTO");
            PhoneData phoneData3 = this.u;
            TelephonyManager telephonyManager7 = this.onNavigationEvent;
            phoneData3.setRoaming((telephonyManager7 == null || (telephonyManagerCreateForSubscriptionId = telephonyManager7.createForSubscriptionId(i)) == null || (serviceStateM = zzc$$ExternalSyntheticApiModelOutline0.m(telephonyManagerCreateForSubscriptionId)) == null || !serviceStateM.getRoaming()) ? LogConstants.Cpm.CODE_SOURCE_LOCAL : "ROAMING");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[PHI: r8
  0x0062: PHI (r8v7 java.lang.Integer) = (r8v6 java.lang.Integer), (r8v13 java.lang.Integer) binds: [B:12:0x0060, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b_(android.telephony.CellIdentityNr r17) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.b_(android.telephony.CellIdentityNr):void");
    }

    private final void c_(CellSignalStrengthNr cellSignalStrengthNr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 85;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.u.setSigdBm(cellSignalStrengthNr.getDbm());
        this.u.setAsuLevel(cellSignalStrengthNr.getAsuLevel());
        this.u.setSignalLevel(cellSignalStrengthNr.getLevel());
        this.u.setCsirsrp(cellSignalStrengthNr.getCsiRsrp());
        this.u.setCsirsrq(cellSignalStrengthNr.getCsiRsrq());
        this.u.setCsisinr(cellSignalStrengthNr.getCsiSinr());
        this.u.setSsrsrp(zzc$$ExternalSyntheticApiModelOutline0.m(cellSignalStrengthNr));
        this.u.setSsrsrq(cellSignalStrengthNr.getSsRsrq());
        this.u.setSssinr(cellSignalStrengthNr.getSsSinr());
        int i4 = ICustomTabsCallbackDefault + 69;
        ICustomTabsCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0d62  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ShareDataUIState(android.telephony.CellInfo r31, android.content.Context r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 4220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.ShareDataUIState(android.telephony.CellInfo, android.content.Context, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void copydefault(android.content.Context r24, int r25) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.copydefault(android.content.Context, int):void");
    }

    private final void component2(ConnectivityManager connectivityManager) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 11;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
        if (linkProperties != null) {
            int i4 = ICustomTabsCallbackDefault + 71;
            ICustomTabsCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            while (it.hasNext()) {
                int i6 = ICustomTabsCallbackDefault + 23;
                ICustomTabsCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                InetAddress address = it.next().getAddress();
                if (address instanceof Inet4Address) {
                    int i8 = ICustomTabsCallbackDefault + 69;
                    ICustomTabsCallback_Parcel = i8 % 128;
                    int i9 = i8 % 2;
                    this.u.setPublicIp(((Inet4Address) address).getHostAddress());
                } else if (address instanceof Inet6Address) {
                    this.u.setPublicIp(((Inet6Address) address).getHostAddress());
                }
            }
        }
    }

    @Override
    public CoroutineContext getCoroutineContext() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback_Parcel + 67;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        if (i3 == 0) {
            return io2;
        }
        throw null;
    }

    static {
        int i = onWarmupCompleted + 55;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor p0, int p1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 27;
        ICustomTabsCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = ICustomTabsCallbackDefault + 25;
        ICustomTabsCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
