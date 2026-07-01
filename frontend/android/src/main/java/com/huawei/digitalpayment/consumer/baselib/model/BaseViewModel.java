package com.huawei.digitalpayment.consumer.baselib.model;

import androidx.lifecycle.ViewModel;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.PaymentBaseActivity;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseViewModel<T extends BaseModel> extends ViewModel {
    private static int component3 = 0;
    private static int copydefault = 1;
    protected T model;

    public BaseViewModel() {
        Class<?> superclass = getClass();
        while (superclass != null) {
            int i = copydefault + 1;
            int i2 = i % 128;
            component3 = i2;
            int i3 = i % 2;
            if (superclass == PaymentBaseActivity.class) {
                return;
            }
            int i4 = i2 + 45;
            copydefault = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                boolean z = superclass.getGenericSuperclass() instanceof ParameterizedType;
                obj.hashCode();
                throw null;
            }
            Type genericSuperclass = superclass.getGenericSuperclass();
            if (genericSuperclass instanceof ParameterizedType) {
                Class cls = (Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                if (cls == BaseModel.class) {
                    int i5 = component3 + 31;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                if (cls != null) {
                    this.model = (T) RouteUtils.getService(cls);
                    int i6 = component3 + 85;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    return;
                }
                return;
            }
            superclass = superclass.getSuperclass();
            int i9 = 2 % 2;
        }
    }

    public BaseViewModel(T t) {
        this.model = t;
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        T t = this.model;
        if (t != null) {
            int i5 = i2 + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            t.cancel();
            if (i6 != 0) {
                throw null;
            }
        }
    }
}
