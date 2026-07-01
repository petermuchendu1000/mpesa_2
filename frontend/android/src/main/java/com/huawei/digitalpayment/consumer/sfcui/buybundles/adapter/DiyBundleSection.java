package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import com.chad.library.adapter.base.entity.SectionEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/DiyBundleSection;", "Lcom/chad/library/adapter/base/entity/SectionEntity;", "isHeader", "", "headerTitle", "", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "<init>", "(ZLjava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;)V", "()Z", "getHeaderTitle", "()Ljava/lang/String;", "getBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiyBundleSection implements SectionEntity {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final boolean ShareDataUIState;
    private final DIYBundle component3;
    private final String copydefault;

    public DiyBundleSection(boolean z, String str, DIYBundle dIYBundle) {
        this.ShareDataUIState = z;
        this.copydefault = str;
        this.component3 = dIYBundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DiyBundleSection(boolean z, String str, DIYBundle dIYBundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 121;
            equals = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            equals = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        if ((i & 4) != 0) {
            int i8 = equals + 97;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            dIYBundle = null;
        }
        this(z, str, dIYBundle);
    }

    @Override
    public boolean isHeader() {
        int i = 2 % 2;
        int i2 = equals + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getHeaderTitle() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final DIYBundle getBundle() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 25;
        equals = i3 % 128;
        int i4 = i3 % 2;
        DIYBundle dIYBundle = this.component3;
        int i5 = i2 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return dIYBundle;
    }

    static {
        int i = 1 + 61;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
