package com.huawei.digitalpayment.consumer.push;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.language.OnLanguageChangeListener;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.ILoginService;
import com.huawei.digitalpayment.consumer.push.constants.PushSPConstants;
import com.huawei.digitalpayment.consumer.push.model.TopicResp;
import java.util.Iterator;
import java.util.List;

public class FirebaseInit {
    private static int ShareDataUIState = 0;
    public static final String TOPIC_ALL = "all";
    public static final String TOPIC_LOGIN_ALL = "loginAll";
    private static int component1 = 1;
    private static final FirebaseInit component2 = new FirebaseInit();
    private static int component4 = 1;
    private static final String copydefault = "FirebaseInit";
    private static int getRequestBeneficiariesState;
    private String component3;

    static {
        int i = ShareDataUIState + 61;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FirebaseInit getInstance() {
        FirebaseInit firebaseInit;
        int i = 2 % 2;
        int i2 = component4 + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            firebaseInit = component2;
            int i4 = 12 / 0;
        } else {
            firebaseInit = component2;
        }
        int i5 = i3 + 29;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return firebaseInit;
    }

    static void component3(String str, String str2) {
        int i = 2 % 2;
        L.d(copydefault, "onLanguageChange: " + str + " -> " + str2);
        reSubscribeToTopic(str, str2);
        int i2 = getRequestBeneficiariesState + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void init() {
        int i = 2 % 2;
        LanguageUtils.getInstance().addCallBack(new OnLanguageChangeListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onLanguageChange(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                FirebaseInit.component3(str, str2);
                if (i4 == 0) {
                    int i5 = 63 / 0;
                }
            }
        });
        this.component3 = getFirebaseToken();
        TokenHelper.INSTANCE.saveFirebaseTokenToSp(this.component3);
        int i2 = getRequestBeneficiariesState + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void reSubscribeToTopic(String str, String str2) {
        int i = 2 % 2;
        int i2 = component4 + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        unsubscribeToTopic("all", str);
        subscribeToTopic("all", str2);
        if (((ILoginService) RouteUtils.getService(ILoginService.class)).isLogin()) {
            unsubscribeToTopic(str);
            subscribeToTopic(str2);
        } else {
            int i4 = getRequestBeneficiariesState + 1;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static String getFirebaseToken() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        L.d(copydefault, "Firebase getToken");
        String string = SPUtils.getInstance().getString(SPConstant.FIREBASE_TOKEN, "");
        if (!(!TextUtils.isEmpty(string))) {
            copydefault();
        } else {
            subscribeToTopic("all", LanguageUtils.getInstance().getCurrentLang());
            int i4 = component4 + 17;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        String str = string != null ? string : "";
        int i6 = getRequestBeneficiariesState + 119;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void copydefault() {
        int i = 2 % 2;
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onComplete(Task task) {
                int i2 = 2 % 2;
                int i3 = component2 + 75;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                FirebaseInit.component3(task);
                int i5 = component3 + 27;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = getRequestBeneficiariesState + 39;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    static void component3(Task task) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!task.isSuccessful()) {
                L.d(copydefault, "Firebase getToken error " + task.getException());
                return;
            }
            String str = (String) task.getResult();
            L.d(copydefault, "Firebase getToken success token " + str);
            subscribeToTopic("all", LanguageUtils.getInstance().getCurrentLang());
            SPUtils.getInstance().put(SPConstant.FIREBASE_TOKEN, str);
            int i3 = getRequestBeneficiariesState + 31;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        task.isSuccessful();
        throw null;
    }

    public static void subscribeToTopic(String str) {
        int i = 2 % 2;
        L.d(copydefault, "subscribeToTopic: " + str);
        String string = SPUtils.getInstance().getString(SPConstant.FIREBASE_TOKEN, "");
        L.d(copydefault, "firebaseToken: " + string);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        subscribeToTopic(TOPIC_LOGIN_ALL, str);
        try {
            TopicResp topicResp = (TopicResp) GsonUtils.fromJson(SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).getString(PushSPConstants.KEY_TOPICS), TopicResp.class);
            if (topicResp == null) {
                return;
            }
            List<String> topics = topicResp.getTopics();
            if (CollectionUtils.isEmpty(topics)) {
                return;
            }
            Iterator<String> it = topics.iterator();
            while (it.hasNext()) {
                int i2 = component4 + 79;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    subscribeToTopic(it.next(), str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                subscribeToTopic(it.next(), str);
            }
        } catch (Exception e) {
            L.e(copydefault, "unsubscribeToTopic: " + e.getMessage());
        }
        int i3 = component4 + 89;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void subscribeToTopic(String str, String str2) {
        int i = 2 % 2;
        L.d(copydefault, "subscribeToTopic: topic " + str + " ,language " + str2);
        String string = SPUtils.getInstance().getString(SPConstant.FIREBASE_TOKEN, "");
        if (!TextUtils.isEmpty(str)) {
            int i2 = getRequestBeneficiariesState + 53;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(string)) {
                int i4 = component4 + 23;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
            } else {
                final String str3 = str + "_" + str2;
                FirebaseMessaging.getInstance().subscribeToTopic(str3).addOnCompleteListener(new OnCompleteListener() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Override
                    public final void onComplete(Task task) {
                        int i6 = 2 % 2;
                        int i7 = component1 + 37;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        FirebaseInit.component2(str3, task);
                        int i9 = component1 + 103;
                        ShareDataUIState = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 87 / 0;
                        }
                    }
                });
            }
        }
    }

    static void component2(String str, Task task) {
        int i = 2 % 2;
        String str2 = str + " Subscribed";
        if (!task.isSuccessful()) {
            str2 = str + " Subscribe failed";
        }
        L.d(copydefault, str2);
        int i2 = getRequestBeneficiariesState + 53;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void unsubscribeToTopic(String str) {
        TopicResp topicResp;
        int i = 2 % 2;
        L.d(copydefault, "unsubscribeToTopic: " + str);
        unsubscribeToTopic(TOPIC_LOGIN_ALL, str);
        try {
            try {
                topicResp = (TopicResp) GsonUtils.fromJson(SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).getString(PushSPConstants.KEY_TOPICS), TopicResp.class);
            } catch (Exception e) {
                L.e(copydefault, "unsubscribeToTopic: " + e.getMessage());
            }
            if (topicResp != null) {
                List<String> topics = topicResp.getTopics();
                if (CollectionUtils.isEmpty(topics)) {
                    int i2 = component4 + 73;
                    getRequestBeneficiariesState = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 % 3;
                    }
                } else {
                    Iterator<String> it = topics.iterator();
                    while (it.hasNext()) {
                        int i4 = component4 + 61;
                        getRequestBeneficiariesState = i4 % 128;
                        if (i4 % 2 != 0) {
                            unsubscribeToTopic(it.next(), str);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        unsubscribeToTopic(it.next(), str);
                    }
                }
                return;
            }
            SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).clear();
            int i5 = getRequestBeneficiariesState + 7;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 8 / 0;
            }
        } finally {
            SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).clear();
        }
    }

    public static void unsubscribeToTopic(String str, String str2) {
        int i = 2 % 2;
        L.d(copydefault, "unsubscribeToTopic: topic " + str + " ,language " + str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final String str3 = str + "_" + str2;
        FirebaseMessaging.getInstance().unsubscribeFromTopic(str3).addOnCompleteListener(new OnCompleteListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onComplete(Task task) {
                int i2 = 2 % 2;
                int i3 = component3 + 115;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                FirebaseInit.component1(str3, task);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component4 + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static void component1(String str, Task task) {
        int i = 2 % 2;
        String str2 = str + " UnSubscribed";
        if (!task.isSuccessful()) {
            str2 = str + " UnSubscribe failed";
            int i2 = component4 + 63;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
        }
        L.d(copydefault, str2);
    }
}
