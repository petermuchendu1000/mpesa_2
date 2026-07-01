package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import com.blankj.utilcode.constant.PermissionConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleTypeImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", PermissionConstants.SMS, "VOICE", "getCategory", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IBundleTypeImpl implements IBundleType {
    private static final EnumEntries $ENTRIES;
    private static final IBundleTypeImpl[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    private final String value;
    public static final IBundleTypeImpl DATA = new IBundleTypeImpl("DATA", 0, ImtConstants.KEY_DATA);
    public static final IBundleTypeImpl SMS = new IBundleTypeImpl(PermissionConstants.SMS, 1, "Sms");
    public static final IBundleTypeImpl VOICE = new IBundleTypeImpl("VOICE", 2, "Voice");

    private IBundleTypeImpl(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    IBundleTypeImpl(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = copydefault + 29;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 89;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = ImtConstants.KEY_DATA;
        }
        this(str, i, str2);
    }

    @Override
    public String getValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        IBundleTypeImpl[] iBundleTypeImplArr$values = $values();
        $VALUES = iBundleTypeImplArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iBundleTypeImplArr$values);
        int i = component1 + 47;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String value = getValue();
        int i4 = copydefault + 5;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    public static IBundleTypeImpl valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        IBundleTypeImpl iBundleTypeImpl = (IBundleTypeImpl) Enum.valueOf(IBundleTypeImpl.class, str);
        int i3 = copydefault + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iBundleTypeImpl;
    }

    public static IBundleTypeImpl[] values() {
        IBundleTypeImpl[] iBundleTypeImplArr;
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            iBundleTypeImplArr = (IBundleTypeImpl[]) $VALUES.clone();
            int i3 = 41 / 0;
        } else {
            iBundleTypeImplArr = (IBundleTypeImpl[]) $VALUES.clone();
        }
        int i4 = ShareDataUIState + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iBundleTypeImplArr;
    }

    private static final IBundleTypeImpl[] $values() {
        IBundleTypeImpl[] iBundleTypeImplArr;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            IBundleTypeImpl iBundleTypeImpl = DATA;
            IBundleTypeImpl iBundleTypeImpl2 = SMS;
            IBundleTypeImpl iBundleTypeImpl3 = VOICE;
            iBundleTypeImplArr = new IBundleTypeImpl[5];
            iBundleTypeImplArr[1] = iBundleTypeImpl;
            iBundleTypeImplArr[1] = iBundleTypeImpl2;
            iBundleTypeImplArr[5] = iBundleTypeImpl3;
        } else {
            iBundleTypeImplArr = new IBundleTypeImpl[]{DATA, SMS, VOICE};
        }
        int i4 = i2 + 59;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iBundleTypeImplArr;
    }

    public static EnumEntries<IBundleTypeImpl> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<IBundleTypeImpl> enumEntries = $ENTRIES;
        int i4 = i2 + 125;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
