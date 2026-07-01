package com.huawei.common.module;

import android.content.Context;
import com.safaricom.mpesa.logging.L;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserLifecycleManager {
    private static final UserLifecycleManager ShareDataUIState = new UserLifecycleManager();
    private static final String component1 = "UserLifecycleManager";
    private final CopyOnWriteArrayList<UserLifecycle> component2 = new CopyOnWriteArrayList<>();

    private UserLifecycleManager() {
    }

    public static UserLifecycleManager get() {
        return ShareDataUIState;
    }

    public void loginSuccess(Context context, String str, boolean z) {
        L.INSTANCE.d(component1, "Overriden Login Success", new Object[0]);
        Iterator it = Collections.unmodifiableCollection(this.component2).iterator();
        while (it.hasNext()) {
            ((UserLifecycle) it.next()).onAfterLogin(context, str, z);
        }
    }

    public void loginFail(Context context, boolean z) {
        L.INSTANCE.d(component1, "Overriden Login Fail", new Object[0]);
        Iterator it = Collections.unmodifiableCollection(this.component2).iterator();
        while (it.hasNext()) {
            ((UserLifecycle) it.next()).loginFail(context, z);
        }
    }

    public void logout(Context context) {
        L.INSTANCE.d(component1, "Overriden Logout Success", new Object[0]);
        Iterator it = Collections.unmodifiableCollection(this.component2).iterator();
        while (it.hasNext()) {
            ((UserLifecycle) it.next()).onLogout(context);
        }
    }

    public void addUserLifecycleListener(UserLifecycle userLifecycle) {
        try {
            L.INSTANCE.d(component1, "Overriden Add User Entry", new Object[0]);
            if (!this.component2.contains(userLifecycle)) {
                this.component2.add(userLifecycle);
                L.INSTANCE.d(component1, "Overriden Add User", new Object[0]);
            }
            Collections.sort(this.component2);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                L.INSTANCE.d(component1, e.getMessage(), new Object[0]);
            }
        }
    }

    public void removeLifecycleListener(UserLifecycle userLifecycle) {
        L.INSTANCE.d(component1, "Overriden Remove Lifecycle Listener", new Object[0]);
        this.component2.remove(userLifecycle);
    }
}
