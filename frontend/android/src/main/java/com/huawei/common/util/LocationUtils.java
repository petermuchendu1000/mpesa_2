package com.huawei.common.util;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationListenerCompat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LocationUtils {
    private static final long ShareDataUIState = 5000;
    private static final int component1 = 120000;
    private static final float component3 = 0.0f;
    private static volatile Location copydefault;
    private static volatile LocationManager getAsAtTimestamp;
    private static final List<LocationListener> copy = new CopyOnWriteArrayList();
    private static final LocationListener component2 = new LocationListenerCompat() {
        @Override
        public void onLocationChanged(Location location) {
            if (LocationUtils.copydefault == null) {
                LocationUtils.copydefault = location;
                LocationUtils.ShareDataUIState(location);
            } else if (LocationUtils.component2(location, LocationUtils.copydefault)) {
                LocationUtils.copydefault = location;
                LocationUtils.ShareDataUIState(location);
            }
        }

        @Override
        public void onProviderEnabled(String str) {
            Iterator it = LocationUtils.copy.iterator();
            while (it.hasNext()) {
                ((LocationListener) it.next()).onProviderEnabled(str);
            }
        }

        @Override
        public void onProviderDisabled(String str) {
            Iterator it = LocationUtils.copy.iterator();
            while (it.hasNext()) {
                ((LocationListener) it.next()).onProviderDisabled(str);
            }
        }
    };

    public static void close() {
        synchronized (LocationUtils.class) {
            if (getAsAtTimestamp != null) {
                copy.clear();
                getAsAtTimestamp.removeUpdates(component2);
                getAsAtTimestamp = null;
                copydefault = null;
            }
        }
    }

    public static int open(Context context, LocationListener locationListener) {
        synchronized (LocationUtils.class) {
            if (!component1(context)) {
                return 1;
            }
            if (getAsAtTimestamp == null) {
                getAsAtTimestamp = (LocationManager) context.getSystemService("location");
            }
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            String bestProvider = getAsAtTimestamp.getBestProvider(criteria, true);
            if (TextUtils.equals(bestProvider, "passive")) {
                bestProvider = "";
            }
            String str = bestProvider;
            if (TextUtils.isEmpty(str)) {
                return 2;
            }
            copy.add(locationListener);
            if (getAsAtTimestamp.isProviderEnabled(str)) {
                copydefault = getAsAtTimestamp.getLastKnownLocation(str);
                getAsAtTimestamp.requestLocationUpdates(str, 5000L, 0.0f, component2);
            } else {
                copydefault = component1();
            }
            if (copydefault == null) {
                copydefault = component1();
            }
            if (copydefault != null) {
                ShareDataUIState(copydefault);
            }
            return 0;
        }
    }

    public static void ShareDataUIState(Location location) {
        Iterator<LocationListener> it = copy.iterator();
        while (it.hasNext()) {
            it.next().onLocationChanged(location);
        }
    }

    public static boolean component2(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > 120000;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            return true;
        }
        if (z2) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        boolean zComponent3 = component3(location.getProvider(), location2.getProvider());
        if (z5) {
            return true;
        }
        if (!z3 || z4) {
            return z3 && !z6 && zComponent3;
        }
        return true;
    }

    private static boolean component3(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private static Location component1() {
        Iterator<String> it = getAsAtTimestamp.getAllProviders().iterator();
        while (it.hasNext()) {
            Location lastKnownLocation = getAsAtTimestamp.getLastKnownLocation(it.next());
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
        }
        return null;
    }

    private static boolean component1(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }
}
