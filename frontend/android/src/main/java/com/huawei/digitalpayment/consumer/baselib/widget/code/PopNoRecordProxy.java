package com.huawei.digitalpayment.consumer.baselib.widget.code;

import android.os.Handler;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.huawei.common.util.L;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class PopNoRecordProxy implements InvocationHandler {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private Object component1;

    public static PopNoRecordProxy instance() {
        int i = 2 % 2;
        PopNoRecordProxy popNoRecordProxy = new PopNoRecordProxy();
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return popNoRecordProxy;
    }

    public void noScreenRecord(final PopupWindow popupWindow) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (popupWindow != null) {
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                private static int component1 = 1;
                private static int copydefault;

                @Override
                public Void run() {
                    int i4 = 2 % 2;
                    int i5 = component1 + 29;
                    copydefault = i5 % 128;
                    Object obj = null;
                    if (i5 % 2 != 0) {
                        ShareDataUIState();
                        throw null;
                    }
                    Void voidShareDataUIState = ShareDataUIState();
                    int i6 = component1 + 85;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        return voidShareDataUIState;
                    }
                    obj.hashCode();
                    throw null;
                }

                public Void ShareDataUIState() {
                    int i4 = 2 % 2;
                    int i5 = component1 + 51;
                    copydefault = i5 % 128;
                    Object obj = null;
                    if (i5 % 2 != 0) {
                        PopNoRecordProxy.component3(PopNoRecordProxy.this, popupWindow);
                        obj.hashCode();
                        throw null;
                    }
                    PopNoRecordProxy.component3(PopNoRecordProxy.this, popupWindow);
                    int i6 = copydefault + 101;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    return null;
                }
            });
            return;
        }
        int i4 = i2 + 29;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component2(PopupWindow popupWindow) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mWindowManager");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(popupWindow);
            this.component1 = obj;
            if (obj == null) {
                return;
            }
            declaredField.set(popupWindow, Proxy.newProxyInstance(Handler.class.getClassLoader(), new Class[]{WindowManager.class}, this));
            int i4 = ShareDataUIState + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            L.d("PopNoRecordProxy", "noScreenRecord: " + e.getMessage());
        }
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (method != null) {
            try {
                if (method.getName() != null && method.getName().equals("addView") && objArr != null) {
                    int i3 = copydefault + 85;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    if (objArr.length == 2) {
                        ShareDataUIState((WindowManager.LayoutParams) objArr[1]);
                    }
                }
            } catch (Exception e) {
                L.d("PopNoRecordProxy", "invoke: " + e.getMessage());
            }
        }
        if (method != null) {
            return method.invoke(this.component1, objArr);
        }
        return null;
    }

    private void ShareDataUIState(WindowManager.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            ShareDataUIState(layoutParams, 22640, 1131);
        } else {
            ShareDataUIState(layoutParams, 8192, 8192);
        }
    }

    public void setAllowScreenRecord(WindowManager.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = copydefault + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            i = 1;
            i2 = 17619;
        } else {
            i = 0;
            i2 = 8192;
        }
        ShareDataUIState(layoutParams, i, i2);
        int i5 = ShareDataUIState + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private void ShareDataUIState(WindowManager.LayoutParams layoutParams, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = copydefault + 59;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        int i6 = i4 % 2;
        if (layoutParams == null) {
            int i7 = i5 + 73;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 71 / 0;
                return;
            }
            return;
        }
        try {
            layoutParams.flags = (i & i2) | ((~i2) & layoutParams.flags);
            int i9 = ShareDataUIState + 89;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        } catch (Exception e) {
            L.d("PopNoRecordProxy", "setFlags: " + e.getMessage());
        }
    }

    static void component3(PopNoRecordProxy popNoRecordProxy, PopupWindow popupWindow) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        popNoRecordProxy.component2(popupWindow);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 9;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
    }
}
