package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem;", "", "<init>", "()V", "DateHeader", "TestItem", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem$DateHeader;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem$TestItem;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SpeedHistoryItem {
    public static final int $stable = 0;
    private static int component1 = 103 % 128;
    private static int component2;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem$DateHeader;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem;", "date", "", "<init>", "(Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DateHeader extends SpeedHistoryItem {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateHeader(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getDate() {
            int i = 2 % 2;
            int i2 = component1 + 89;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component2;
            }
            throw null;
        }

        static {
            int i = 1 + 111;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static DateHeader copy$default(DateHeader dateHeader, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 59;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i & 1;
            if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
                int i6 = i4 + 65;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    String str2 = dateHeader.component2;
                    throw null;
                }
                str = dateHeader.component2;
            }
            return dateHeader.copy(str);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 87;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.component2;
                int i4 = 82 / 0;
            } else {
                str = this.component2;
            }
            int i5 = i2 + 19;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final DateHeader copy(String date) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(date, "");
            DateHeader dateHeader = new DateHeader(date);
            int i2 = component1 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return dateHeader;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 53;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof DateHeader)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component2, ((DateHeader) other).component2)) {
                return true;
            }
            int i4 = copydefault;
            int i5 = i4 + 57;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 27;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            if (i3 == 0) {
                int i4 = 30 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DateHeader(date=" + this.component2 + ")";
            int i2 = component1 + 111;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    private SpeedHistoryItem() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem$TestItem;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem;", "entity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;)V", "getEntity", "()Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TestItem extends SpeedHistoryItem {
        public static final int $stable = 8;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        private final SpeedTestsHistoryData copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TestItem(SpeedTestsHistoryData speedTestsHistoryData) {
            super(null);
            Intrinsics.checkNotNullParameter(speedTestsHistoryData, "");
            this.copydefault = speedTestsHistoryData;
        }

        public final SpeedTestsHistoryData getEntity() {
            int i = 2 % 2;
            int i2 = component3 + 15;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            SpeedTestsHistoryData speedTestsHistoryData = this.copydefault;
            int i5 = i3 + 37;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return speedTestsHistoryData;
            }
            throw null;
        }

        static {
            int i = 1 + 45;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static TestItem copy$default(TestItem testItem, SpeedTestsHistoryData speedTestsHistoryData, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 35;
            component2 = i4 % 128;
            int i5 = i & 1;
            if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
                speedTestsHistoryData = testItem.copydefault;
                int i6 = i3 + 117;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 2;
                }
            }
            TestItem testItemCopy = testItem.copy(speedTestsHistoryData);
            int i8 = component3 + 23;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return testItemCopy;
        }

        public final SpeedTestsHistoryData component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 53;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            SpeedTestsHistoryData speedTestsHistoryData = this.copydefault;
            int i4 = i2 + 61;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return speedTestsHistoryData;
            }
            throw null;
        }

        public final TestItem copy(SpeedTestsHistoryData entity) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(entity, "");
            TestItem testItem = new TestItem(entity);
            int i2 = component3 + 87;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return testItem;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 107;
            int i3 = i2 % 128;
            component3 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                int i4 = i3 + 93;
                component2 = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(other instanceof TestItem)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((TestItem) other).copydefault)) {
                return true;
            }
            int i5 = component3 + 51;
            int i6 = i5 % 128;
            component2 = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 7;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SpeedTestsHistoryData speedTestsHistoryData = this.copydefault;
            if (i3 == 0) {
                return speedTestsHistoryData.hashCode();
            }
            speedTestsHistoryData.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TestItem(entity=" + this.copydefault + ")";
            int i2 = component2 + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 103 % 2;
    }

    public SpeedHistoryItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
