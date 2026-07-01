package com.huawei.digitalpayment.consumer.home.extend;

import android.graphics.drawable.Drawable;
import com.huawei.digitalpayment.consumer.home.extend.MyFunctionExtend;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/ChangeLanguageExtend;", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend;", "<init>", "()V", "type", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "getType", "()Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "text", "", "getText", "()Ljava/lang/String;", "image", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "isShowRedPoint", "", "()Z", "Companion", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeLanguageExtend implements MyFunctionExtend {
    public static final String FUNC_ID = "change_language";
    private static int component1 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final MyFunctionExtend.ExtendType ShareDataUIState = MyFunctionExtend.ExtendType.TEXT;
    private final String component2 = "";
    private final Drawable component3;
    private final boolean copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override
    public MyFunctionExtend.ExtendType getType() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 31;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MyFunctionExtend.ExtendType extendType = this.ShareDataUIState;
        int i5 = i2 + 83;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return extendType;
    }

    @Override
    public String getText() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 57;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public Drawable getImage() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        Drawable drawable = this.component3;
        int i5 = i3 + 99;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    @Override
    public boolean isShowRedPoint() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 67;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/ChangeLanguageExtend$Companion;", "", "<init>", "()V", "FUNC_ID", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = copy + 9;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }
}
