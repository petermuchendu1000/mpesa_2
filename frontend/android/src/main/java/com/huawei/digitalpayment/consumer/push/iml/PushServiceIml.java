package com.huawei.digitalpayment.consumer.push.iml;

import android.app.ActivityOptions;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.Utils;
import com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.push.FirebaseInit;
import com.huawei.digitalpayment.consumer.push.R;
import com.huawei.digitalpayment.consumer.push.activity.NotificationFilterActivity;
import com.huawei.digitalpayment.consumer.push.constants.PushSPConstants;
import com.huawei.digitalpayment.consumer.push.model.NotificationMessageBean;
import com.huawei.digitalpayment.consumer.service.IHomeModule2Service;
import com.huawei.digitalpayment.consumer.service.IPushSoundService;
import java.util.List;
import java.util.Map;

public class PushServiceIml implements IPushService {
    protected static final String KEY_MESSAGE_PROMOTION = "Promotion News";
    protected static final String KEY_MESSAGE_SYSTEM = "System Information";
    protected static final String KEY_MESSAGE_TRANSACTION = "Transaction Message";
    private static int ShareDataUIState = 0;
    protected static final String TAG = "PushServiceIml";
    private static int component1 = 1;

    @Override
    public void onMessageReceived(Map<String, String> map) {
        NotificationMessageBean notificationMessageBeanConvertData;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (map == null || (notificationMessageBeanConvertData = convertData(map)) == null) {
            return;
        }
        if (!TextUtils.isEmpty(notificationMessageBeanConvertData.getIdentityId())) {
            int i3 = ShareDataUIState + 115;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (!isSelf(notificationMessageBeanConvertData)) {
                return;
            }
        }
        sendNotification(notificationMessageBeanConvertData);
        SPUtils.getInstance().put(SPConstant.NOTIFICATION_TYPE + notificationMessageBeanConvertData.getCategory(), true);
        if (!"0".equals(notificationMessageBeanConvertData.getCategory()) && !"1".equals(notificationMessageBeanConvertData.getCategory())) {
            int i5 = ShareDataUIState + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            if (!"2".equals(notificationMessageBeanConvertData.getCategory())) {
                return;
            }
        }
        ((IHomeModule2Service) RouteUtils.getService(IHomeModule2Service.class)).refreshBalance();
    }

    protected void sendNotification(NotificationMessageBean notificationMessageBean) {
        int i;
        int i2 = 2 % 2;
        initChannel();
        Intent intentNewIntent = NotificationFilterActivity.newIntent(Utils.getApp(), notificationMessageBean.getSystemExecute());
        intentNewIntent.setFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        Bundle bundle = null;
        if (Build.VERSION.SDK_INT >= 31) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 29;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 13;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = 1140850688;
        } else {
            i = 134217728;
        }
        if (Build.VERSION.SDK_INT > 34) {
            bundle = zzc$$ExternalSyntheticApiModelOutline0.m(ActivityOptions.makeBasic(), 1).toBundle();
        } else if (Build.VERSION.SDK_INT == 34) {
            bundle = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
        } else {
            int i7 = component1 + 93;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(Utils.getApp(), notificationMessageBean.getCategory()).setSmallIcon(R.mipmap.icon_logo).setContentTitle(notificationMessageBean.getTitle()).setContentText(notificationMessageBean.getContent()).setPriority(1).setAutoCancel(true).setContentIntent(PendingIntent.getActivity(Utils.getApp(), 0, intentNewIntent, i, bundle));
        playSoundIfNeed(notificationMessageBean);
        if (ActivityCompat.checkSelfPermission(Utils.getApp(), "android.permission.POST_NOTIFICATIONS") != 0) {
            requestNotificationPermission(contentIntent);
        } else {
            showNotification(contentIntent);
        }
    }

    protected void showNotification(NotificationCompat.Builder builder) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            L.d(TAG, "showNotification: ");
            NotificationManagerCompat.from(Utils.getApp()).notify((int) System.currentTimeMillis(), builder.build());
            int i3 = ShareDataUIState + 15;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        L.d(TAG, "showNotification: ");
        NotificationManagerCompat.from(Utils.getApp()).notify((int) System.currentTimeMillis(), builder.build());
        throw null;
    }

    protected void requestNotificationPermission(final NotificationCompat.Builder builder) {
        int i = 2 % 2;
        L.d(TAG, "requestNotificationPermission: ");
        PermissionUtils.permission("android.permission.POST_NOTIFICATIONS").callback(new PermissionUtils.FullCallback() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onGranted(List<String> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 3;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    L.d(PushServiceIml.TAG, "requestNotificationPermission: onGranted");
                    PushServiceIml.this.showNotification(builder);
                    int i4 = component1 + 105;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                L.d(PushServiceIml.TAG, "requestNotificationPermission: onGranted");
                PushServiceIml.this.showNotification(builder);
                obj.hashCode();
                throw null;
            }

            @Override
            public void onDenied(List<String> list, List<String> list2) {
                int i2 = 2 % 2;
                int i3 = component1 + 73;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                L.e(PushServiceIml.TAG, "requestNotificationPermission: onDenied");
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = component1 + 3;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        }).request();
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean isSelf(com.huawei.digitalpayment.consumer.push.model.NotificationMessageBean r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.ShareDataUIState
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L21
            java.lang.Class<com.huawei.digitalpayment.consumer.service.IProfileService> r1 = com.huawei.digitalpayment.consumer.service.IProfileService.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
            com.huawei.digitalpayment.consumer.service.IProfileService r1 = (com.huawei.digitalpayment.consumer.service.IProfileService) r1
            java.lang.String r1 = r1.getUserProfile()
            r3 = 58
            int r3 = r3 / r2
            if (r6 == 0) goto L74
            goto L2f
        L21:
            java.lang.Class<com.huawei.digitalpayment.consumer.service.IProfileService> r1 = com.huawei.digitalpayment.consumer.service.IProfileService.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
            com.huawei.digitalpayment.consumer.service.IProfileService r1 = (com.huawei.digitalpayment.consumer.service.IProfileService) r1
            java.lang.String r1 = r1.getUserProfile()
            if (r6 == 0) goto L74
        L2f:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L74
            int r3 = com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.ShareDataUIState
            int r3 = r3 + 115
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.component1 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L68
            java.lang.String r3 = r6.getIdentityId()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L4b
            goto L74
        L4b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L74
            r3.<init>(r1)     // Catch: java.lang.Exception -> L74
            java.lang.String r1 = "identityId"
            java.lang.String r1 = r3.optString(r1)     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = r6.getIdentityId()     // Catch: java.lang.Exception -> L74
            boolean r6 = android.text.TextUtils.equals(r1, r6)     // Catch: java.lang.Exception -> L74
            int r1 = com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.component1
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.ShareDataUIState = r2
            int r1 = r1 % r0
            return r6
        L68:
            java.lang.String r6 = r6.getIdentityId()
            android.text.TextUtils.isEmpty(r6)
            r6 = 0
            r6.hashCode()
            throw r6
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.iml.PushServiceIml.isSelf(com.huawei.digitalpayment.consumer.push.model.NotificationMessageBean):boolean");
    }

    protected NotificationMessageBean convertData(Map<String, String> map) {
        NotificationMessageBean notificationMessageBean;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            notificationMessageBean = (NotificationMessageBean) GsonUtils.fromJson(GsonUtils.toJson(map, Map.class), NotificationMessageBean.class);
            int i3 = 84 / 0;
        } else {
            notificationMessageBean = (NotificationMessageBean) GsonUtils.fromJson(GsonUtils.toJson(map, Map.class), NotificationMessageBean.class);
        }
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return notificationMessageBean;
        }
        throw null;
    }

    protected void initChannel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        if (i2 % 2 != 0 ? Build.VERSION.SDK_INT >= 26 : Build.VERSION.SDK_INT >= 84) {
            createNotificationChannel("1", KEY_MESSAGE_TRANSACTION, 4);
            createNotificationChannel("0", KEY_MESSAGE_SYSTEM, 3);
            createNotificationChannel("2", KEY_MESSAGE_PROMOTION, 3);
        }
        int i3 = component1 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }

    protected void createNotificationChannel(String str, String str2, int i) {
        NotificationChannel notificationChannelM;
        NotificationManager notificationManager;
        int i2 = 2 % 2;
        int i3 = component1 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            notificationChannelM = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(str, str2, i);
            notificationManager = (NotificationManager) Utils.getApp().getSystemService("notification");
            int i4 = 11 / 0;
            if (notificationManager == null) {
                return;
            }
        } else {
            notificationChannelM = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(str, str2, i);
            notificationManager = (NotificationManager) Utils.getApp().getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
        }
        int i5 = ShareDataUIState + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        notificationManager.createNotificationChannel(notificationChannelM);
        if (i6 == 0) {
            int i7 = 57 / 0;
        }
    }

    protected void playSoundIfNeed(NotificationMessageBean notificationMessageBean) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            ((IPushSoundService) RouteUtils.getService(IPushSoundService.class)).playSoundIfNeed(notificationMessageBean.getSound(), notificationMessageBean.getSoundText(), SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).getString(PushSPConstants.KEY_SOUND_URL));
            int i3 = component1 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        ((IPushSoundService) RouteUtils.getService(IPushSoundService.class)).playSoundIfNeed(notificationMessageBean.getSound(), notificationMessageBean.getSoundText(), SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).getString(PushSPConstants.KEY_SOUND_URL));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getFirebaseToken() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            TokenHelper.INSTANCE.getFirebaseToken();
            throw null;
        }
        String firebaseToken = TokenHelper.INSTANCE.getFirebaseToken();
        int i3 = component1 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return firebaseToken;
    }

    @Override
    public void unsubscribeToTopic() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FirebaseInit.unsubscribeToTopic(LanguageUtils.getInstance().getCurrentLang());
        int i4 = ShareDataUIState + 73;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
