package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudFaq;", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudFaqItem;", "Ljava/util/ArrayList;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudFaq extends ArrayList<FraudFaqItem> {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    public boolean contains(FraudFaqItem fraudFaqItem) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return super.contains((Object) fraudFaqItem);
        }
        super.contains((Object) fraudFaqItem);
        throw null;
    }

    @Override
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (!(obj instanceof FraudFaqItem)) {
            return false;
        }
        boolean zContains = contains((FraudFaqItem) obj);
        int i4 = component1 + 61;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return zContains;
        }
        throw null;
    }

    public int getSize() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int size = super.size();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return size;
    }

    public int indexOf(FraudFaqItem fraudFaqItem) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf = super.indexOf((Object) fraudFaqItem);
        int i4 = component1 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iIndexOf;
    }

    @Override
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof FraudFaqItem;
            obj2.hashCode();
            throw null;
        }
        if (!(!(obj instanceof FraudFaqItem))) {
            return indexOf((FraudFaqItem) obj);
        }
        int i4 = i3 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return -1;
        }
        obj2.hashCode();
        throw null;
    }

    public int lastIndexOf(FraudFaqItem fraudFaqItem) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            super.lastIndexOf((Object) fraudFaqItem);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iLastIndexOf = super.lastIndexOf((Object) fraudFaqItem);
        int i3 = component1 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iLastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        if (!(!(obj instanceof FraudFaqItem))) {
            int iLastIndexOf = lastIndexOf((FraudFaqItem) obj);
            int i2 = component1 + 75;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return iLastIndexOf;
        }
        int i4 = component1 + 41;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return -1;
        }
        int i5 = 61 / 0;
        return -1;
    }

    @Override
    public final FraudFaqItem remove(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        FraudFaqItem fraudFaqItemRemoveAt = removeAt(i);
        int i5 = component2 + 43;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return fraudFaqItemRemoveAt;
    }

    public boolean remove(FraudFaqItem fraudFaqItem) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = super.remove((Object) fraudFaqItem);
        int i4 = component2 + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zRemove;
        }
        throw null;
    }

    @Override
    public final boolean remove(Object obj) {
        int i = 2 % 2;
        if (obj instanceof FraudFaqItem) {
            return remove((FraudFaqItem) obj);
        }
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public FraudFaqItem removeAt(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        FraudFaqItem fraudFaqItem = (FraudFaqItem) super.remove(i);
        int i5 = component1 + 79;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return fraudFaqItem;
        }
        throw null;
    }

    @Override
    public final int size() {
        int size;
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            size = getSize();
            int i3 = 54 / 0;
        } else {
            size = getSize();
        }
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    static {
        int i = 1 + 117;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
