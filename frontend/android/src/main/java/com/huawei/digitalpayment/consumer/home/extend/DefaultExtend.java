package com.huawei.digitalpayment.consumer.home.extend;

import android.graphics.drawable.Drawable;
import com.huawei.digitalpayment.consumer.home.extend.MyFunctionExtend;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/DefaultExtend;", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend;", "<init>", "()V", "type", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "getType", "()Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "text", "", "getText", "()Ljava/lang/String;", "image", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "isShowRedPoint", "", "()Z", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultExtend implements MyFunctionExtend {
    public static final int $stable = 8;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int copy = 65 % 128;
    private static int getRequestBeneficiariesState = 1;
    private final boolean component1;
    private final Drawable component2;
    private final MyFunctionExtend.ExtendType copydefault = MyFunctionExtend.ExtendType.NONE;
    private final String ShareDataUIState = "";

    @Override
    public MyFunctionExtend.ExtendType getType() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 107;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MyFunctionExtend.ExtendType extendType = this.copydefault;
        int i4 = i2 + 37;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return extendType;
    }

    @Override
    public String getText() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    @Override
    public Drawable getImage() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Drawable drawable = this.component2;
        int i5 = i3 + 115;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return drawable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isShowRedPoint() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 65 % 2;
    }
}
