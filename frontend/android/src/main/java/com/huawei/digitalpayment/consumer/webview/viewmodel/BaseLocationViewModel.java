package com.huawei.digitalpayment.consumer.webview.viewmodel;

import android.content.DialogInterface;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModel;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils;
import com.huawei.digitalpayment.consumer.webview.R;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import java.util.Iterator;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseLocationViewModel<Model extends InteractionView> extends ViewModel implements LocationListener {
    private static final float ShareDataUIState = 0.0f;
    private static int accessartificialFrame = 0;
    private static final String component1 = "OpenFail";
    private static final String component2 = "GPSDisable";
    private static final String component3 = "CloseLocation";
    private static final String component4 = "UpdateLocation";
    private static final String copy = "OpenSuccess";
    private static final String copydefault = "OpenSetting";
    private static int coroutineCreation = 1;
    private static final long equals = 5000;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 69 % 128;
    private static final int getAsAtTimestamp = 120000;
    private static final String getRequestBeneficiariesState = "LocationListener";
    private static int getSponsorBeneficiariesState;
    private Location ArtificialStackFrames;
    private LocationManager getShareableDataState;
    private String hashCode;
    protected final Model interactionView;
    private boolean toString = true;

    static {
        int i = 69 % 2;
    }

    public BaseLocationViewModel(Model model) {
        this.interactionView = model;
    }

    @Override
    public void onLocationChanged(Location location) {
        int i = 2 % 2;
        Location location2 = this.ArtificialStackFrames;
        if (location2 != null) {
            if (isBetterLocation(location, location2)) {
                int i2 = coroutineCreation + 111;
                getSponsorBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                this.ArtificialStackFrames = location;
                ShareDataUIState(component4);
                return;
            }
            return;
        }
        int i4 = coroutineCreation + 119;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            this.ArtificialStackFrames = location;
            ShareDataUIState(component4);
        } else {
            this.ArtificialStackFrames = location;
            ShareDataUIState(component4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public void onProviderEnabled(String str) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 43;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(copy);
        int i4 = getSponsorBeneficiariesState + 63;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onProviderDisabled(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 119;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(component3);
        int i4 = coroutineCreation + 25;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void openLocation(String str, JSONObject jSONObject) {
        String string;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 119;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
            if (jSONObject == null) {
                return;
            }
        } else if (jSONObject == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
        } catch (JSONException e) {
            L.d(getRequestBeneficiariesState, e.toString());
        }
        if (jSONObject.has("showOpenDialog")) {
            string = jSONObject.getString("showOpenDialog");
            int i4 = getSponsorBeneficiariesState + 119;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
        } else {
            string = null;
        }
        this.toString = !TextUtils.equals(string, BooleanUtils.FALSE);
        this.hashCode = str;
        if (ContextCompat.checkSelfPermission(this.interactionView.getHostActivity(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            int i6 = coroutineCreation + 107;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            ActivityCompat.requestPermissions(this.interactionView.getHostActivity(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 66);
            return;
        }
        copydefault();
    }

    public void closeLocation() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 75;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        component2();
        int i4 = getSponsorBeneficiariesState + 93;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void ShareDataUIState(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            android.location.Location r1 = r7.ArtificialStackFrames
            java.lang.String r2 = ""
            if (r1 == 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.location.Location r3 = r7.ArtificialStackFrames
            double r3 = r3.getLatitude()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.location.Location r4 = r7.ArtificialStackFrames
            double r4 = r4.getLongitude()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            goto L36
        L34:
            r1 = r2
            r3 = r1
        L36:
            android.location.Location r4 = r7.ArtificialStackFrames
            if (r4 == 0) goto L5b
            int r5 = com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel.getSponsorBeneficiariesState
            int r5 = r5 + 107
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel.coroutineCreation = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L56
            boolean r4 = r4.isFromMockProvider()
            if (r4 == 0) goto L5b
            int r1 = com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel.coroutineCreation
            int r1 = r1 + 21
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel.getSponsorBeneficiariesState = r3
            int r1 = r1 % r0
            r3 = r2
            goto L5c
        L56:
            r4.isFromMockProvider()
            r8 = 0
            throw r8
        L5b:
            r2 = r1
        L5c:
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r2, r3}
            java.lang.String r0 = "{\"resultType\":\"%s\",\"lat\":\"%s\",\"lng\":\"%s\"}"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            Model extends com.huawei.digitalpayment.consumer.webview.interaction.InteractionView r0 = r7.interactionView
            androidx.fragment.app.FragmentActivity r0 = r0.getHostActivity()
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L73
            return
        L73:
            java.lang.String r0 = r7.hashCode
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}
            java.lang.String r0 = "javascript:%s('%s');"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            Model extends com.huawei.digitalpayment.consumer.webview.interaction.InteractionView r0 = r7.interactionView
            com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel$$ExternalSyntheticLambda2 r1 = new com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel$$ExternalSyntheticLambda2
            r1.<init>()
            r0.evaluateJavascript(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.webview.viewmodel.BaseLocationViewModel.ShareDataUIState(java.lang.String):void");
    }

    private void copydefault() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 55;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (ContextCompat.checkSelfPermission(this.interactionView.getHostActivity(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        if (this.getShareableDataState == null) {
            this.getShareableDataState = (LocationManager) this.interactionView.getHostActivity().getSystemService("location");
        }
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        String bestProvider = this.getShareableDataState.getBestProvider(criteria, true);
        if (TextUtils.equals(bestProvider, "passive")) {
            bestProvider = "";
        }
        String str = bestProvider;
        if (!TextUtils.isEmpty(str)) {
            if (this.getShareableDataState.isProviderEnabled(str)) {
                this.ArtificialStackFrames = this.getShareableDataState.getLastKnownLocation(str);
                this.getShareableDataState.requestLocationUpdates(str, 5000L, 0.0f, this);
            } else {
                this.ArtificialStackFrames = component3();
            }
            if (this.ArtificialStackFrames == null) {
                this.ArtificialStackFrames = component3();
            }
            ShareDataUIState(copy);
            return;
        }
        int i4 = getSponsorBeneficiariesState;
        int i5 = i4 + 51;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        if (true ^ this.toString) {
            ShareDataUIState(component2);
            return;
        }
        int i7 = i4 + 3;
        coroutineCreation = i7 % 128;
        int i8 = i7 % 2;
        component1();
    }

    private void component2(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 93;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState(copydefault);
        PermissionSettingUtils.goSystemPermissionPage(this.interactionView.getHostActivity());
        int i5 = coroutineCreation + 41;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void ShareDataUIState(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 23;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState(component1);
        int i5 = getSponsorBeneficiariesState + 1;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
    }

    private void component1() {
        int i = 2 % 2;
        new AlertDialog.Builder(this.interactionView.getHostActivity()).setMessage("\"Please turn on the Location service to continue the process\"").setCancelable(false).setPositiveButton(R.string.setting, new DialogInterface.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 2 % 2;
                int i4 = component3 + 121;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                BaseLocationViewModel.$r8$lambda$361fHsAGFhDbe9YTrQyhVOPKzGE(this.f$0, dialogInterface, i2);
                int i6 = copydefault + 29;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                BaseLocationViewModel.$r8$lambda$lqtNfg3q1Hq5abnflZ8w0aLj4qI(this.f$0, dialogInterface, i2);
                int i6 = component2 + 15;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        }).create().show();
        int i2 = coroutineCreation + 103;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    private Location component3() {
        Location lastKnownLocation;
        int i = 2 % 2;
        int i2 = coroutineCreation + 27;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Iterator<String> it = this.getShareableDataState.getAllProviders().iterator();
        int i4 = getSponsorBeneficiariesState + 25;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = coroutineCreation + 13;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                lastKnownLocation = this.getShareableDataState.getLastKnownLocation(it.next());
                int i7 = 67 / 0;
                if (lastKnownLocation != null) {
                    return lastKnownLocation;
                }
            } else {
                lastKnownLocation = this.getShareableDataState.getLastKnownLocation(it.next());
                if (lastKnownLocation != null) {
                    return lastKnownLocation;
                }
            }
        }
        return null;
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 33;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        LocationManager locationManager = this.getShareableDataState;
        if (locationManager != null) {
            int i5 = i3 + 111;
            getSponsorBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                locationManager.removeUpdates(this);
                ShareDataUIState(component3);
                int i6 = 11 / 0;
            } else {
                locationManager.removeUpdates(this);
                ShareDataUIState(component3);
            }
        }
        int i7 = getSponsorBeneficiariesState + 107;
        coroutineCreation = i7 % 128;
        int i8 = i7 % 2;
    }

    public void destroy() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component2();
        int i4 = getSponsorBeneficiariesState + 97;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    protected boolean isBetterLocation(Location location, Location location2) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z3 = time > 120000;
        boolean z4 = time < -120000;
        if (time > 0) {
            int i2 = getSponsorBeneficiariesState + 51;
            coroutineCreation = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (z3) {
            int i4 = coroutineCreation + 37;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (z4) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0;
        boolean z6 = accuracy < 0;
        if (accuracy > 200) {
            int i6 = coroutineCreation + 87;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zCopydefault = copydefault(location.getProvider(), location2.getProvider());
        if (z6) {
            return true;
        }
        if (!z || z5) {
            return z && !z2 && zCopydefault;
        }
        int i8 = coroutineCreation + 57;
        getSponsorBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private boolean copydefault(String str, String str2) {
        int i = 2 % 2;
        if (str != null) {
            return str.equals(str2);
        }
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 11;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 != null) {
            return false;
        }
        int i4 = i2 + 11;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i2 + 123;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static void $r8$lambda$361fHsAGFhDbe9YTrQyhVOPKzGE(BaseLocationViewModel baseLocationViewModel, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 57;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        baseLocationViewModel.component2(dialogInterface, i);
        int i5 = coroutineCreation + 25;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    public static void $r8$lambda$lqtNfg3q1Hq5abnflZ8w0aLj4qI(BaseLocationViewModel baseLocationViewModel, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 83;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        baseLocationViewModel.ShareDataUIState(dialogInterface, i);
        if (i4 != 0) {
            throw null;
        }
    }

    static void copydefault(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 107;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStatusChanged(String str, int i, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 31;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }
}
