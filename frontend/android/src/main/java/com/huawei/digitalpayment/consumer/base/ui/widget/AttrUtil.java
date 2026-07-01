package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.util.TypedValue;
import com.safaricom.mpesa.logging.L;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u001a\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0015\u001a\u00020\u0014*\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/AttrUtil;", "", "<init>", "()V", "cachedIntegers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getCachedIntegers", "()Ljava/util/concurrent/ConcurrentHashMap;", "cachedIntegers$delegate", "Lkotlin/Lazy;", "TAG", "", "getAttributeId", "context", "Landroid/content/Context;", "getAttrId", "attrId", "retrieveAttributeId", "getAttributeTypedValue", "Landroid/util/TypedValue;", "resolveAttribute", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AttrUtil {
    private static int ShareDataUIState = 0;
    private static final String component1 = "AttributeManager";
    private static int component2 = 1;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    public static final AttrUtil INSTANCE = new AttrUtil();
    private static final Lazy component3 = LazyKt.lazy(new Function0() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ConcurrentHashMap concurrentHashMap$r8$lambda$Iq1BuHogQ9UgrYsgDEgcbCwi2Ms = AttrUtil.$r8$lambda$Iq1BuHogQ9UgrYsgDEgcbCwi2Ms();
            int i4 = component1 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return concurrentHashMap$r8$lambda$Iq1BuHogQ9UgrYsgDEgcbCwi2Ms;
        }
    });

    private AttrUtil() {
    }

    static {
        int i = ShareDataUIState + 83;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    private final ConcurrentHashMap<Integer, Integer> component1() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = (ConcurrentHashMap) component3.getValue();
        int i4 = component2 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return concurrentHashMap;
    }

    private static final ConcurrentHashMap component2() {
        int i = 2 % 2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return concurrentHashMap;
    }

    public final int getAttributeId(int i, Context context) {
        int i2 = 2 % 2;
        int i3 = component2 + 5;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return component3(i, context);
        }
        Intrinsics.checkNotNullParameter(context, "");
        component3(i, context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int component3(int i, Context context) {
        int iComponent1;
        int i2 = 2 % 2;
        int i3 = copydefault + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = component1().get(Integer.valueOf(i));
        if (num != null) {
            iComponent1 = num.intValue();
        } else {
            iComponent1 = component1(i, context);
            int i5 = component2 + 35;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
        }
        int i7 = component2 + 7;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return iComponent1;
        }
        throw null;
    }

    private final int component1(int i, Context context) {
        int i2 = 2 % 2;
        int i3 = copydefault + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ShareDataUIState(i, context).resourceId;
        ConcurrentHashMap<Integer, Integer> concurrentHashMapComponent1 = INSTANCE.component1();
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            concurrentHashMapComponent1.put(numValueOf, Integer.valueOf(i5));
            return i5;
        }
        concurrentHashMapComponent1.put(numValueOf, Integer.valueOf(i5));
        throw null;
    }

    private final TypedValue ShareDataUIState(int i, Context context) {
        int i2 = 2 % 2;
        TypedValue typedValueComponent1 = component1(new TypedValue(), i, context);
        int i3 = component2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return typedValueComponent1;
    }

    private final TypedValue component1(TypedValue typedValue, int i, Context context) {
        int i2 = 2 % 2;
        int i3 = copydefault + 25;
        component2 = i3 % 128;
        if (i3 % 2 != 0 ? !context.getTheme().resolveAttribute(i, typedValue, true) : !context.getTheme().resolveAttribute(i, typedValue, false)) {
            L.INSTANCE.e(component1, "Attribute not valid! Attr name=" + context.getResources().getResourceName(i), new Object[0]);
        }
        int i4 = copydefault + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return typedValue;
    }

    public static ConcurrentHashMap $r8$lambda$Iq1BuHogQ9UgrYsgDEgcbCwi2Ms() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConcurrentHashMap concurrentHashMapComponent2 = component2();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return concurrentHashMapComponent2;
    }
}
