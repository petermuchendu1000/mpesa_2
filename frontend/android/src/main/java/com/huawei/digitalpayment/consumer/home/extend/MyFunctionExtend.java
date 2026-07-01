package com.huawei.digitalpayment.consumer.home.extend;

import android.graphics.drawable.Drawable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.iap.ac.android.region.cdp.model.CdpContentInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend;", "", "type", "Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "getType", "()Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "text", "", "getText", "()Ljava/lang/String;", "image", "Landroid/graphics/drawable/Drawable;", "getImage", "()Landroid/graphics/drawable/Drawable;", "isShowRedPoint", "", "()Z", "ExtendType", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MyFunctionExtend {
    Drawable getImage();

    String getText();

    ExtendType getType();

    boolean isShowRedPoint();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/extend/MyFunctionExtend$ExtendType;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "TEXT", CdpContentInfo.CONTENT_TYPE_IMAGE, "RED_POINT", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExtendType {
        private static final EnumEntries $ENTRIES;
        private static final ExtendType[] $VALUES;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final ExtendType NONE = new ExtendType(NetworkUtils.NETWORK_TYPE_NONE, 0);
        public static final ExtendType TEXT = new ExtendType("TEXT", 1);
        public static final ExtendType IMAGE = new ExtendType(CdpContentInfo.CONTENT_TYPE_IMAGE, 2);
        public static final ExtendType RED_POINT = new ExtendType("RED_POINT", 3);

        private ExtendType(String str, int i) {
        }

        static {
            ExtendType[] extendTypeArr$values = $values();
            $VALUES = extendTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(extendTypeArr$values);
            int i = ShareDataUIState + 79;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static ExtendType valueOf(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ExtendType extendType = (ExtendType) Enum.valueOf(ExtendType.class, str);
            int i4 = copydefault + 59;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return extendType;
        }

        public static ExtendType[] values() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return (ExtendType[]) $VALUES.clone();
            }
            int i3 = 60 / 0;
            return (ExtendType[]) $VALUES.clone();
        }

        private static final ExtendType[] $values() {
            ExtendType[] extendTypeArr;
            int i = 2 % 2;
            int i2 = copydefault + 101;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 != 0) {
                ExtendType extendType = NONE;
                ExtendType extendType2 = TEXT;
                ExtendType extendType3 = IMAGE;
                ExtendType extendType4 = RED_POINT;
                extendTypeArr = new ExtendType[4];
                extendTypeArr[1] = extendType;
                extendTypeArr[1] = extendType2;
                extendTypeArr[3] = extendType3;
                extendTypeArr[4] = extendType4;
            } else {
                extendTypeArr = new ExtendType[]{NONE, TEXT, IMAGE, RED_POINT};
            }
            int i4 = i3 + 79;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return extendTypeArr;
            }
            throw null;
        }

        public static EnumEntries<ExtendType> getEntries() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 21;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<ExtendType> enumEntries = $ENTRIES;
            int i5 = i2 + 25;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return enumEntries;
        }
    }
}
