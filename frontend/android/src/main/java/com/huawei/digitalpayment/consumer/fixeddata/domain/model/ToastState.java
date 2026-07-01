package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "", "Loading", "Success", "Info", "Error", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Error;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Info;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Loading;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Success;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ToastState {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Loading;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading implements ToastState {
        public static final int $stable = 0;
        private static int component1 = 71 % 128;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        private final String ShareDataUIState;

        public Loading(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component2 + 117;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            if (71 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Success;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "message", "", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success implements ToastState {
        public static final int $stable = 0;
        private static int ShareDataUIState = 11 % 128;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int copy = 1;
        private final String component3;
        private final String copydefault;

        public Success(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.component3 = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Success(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = component2 + 63;
                copy = i2 % 128;
                if (i2 % 2 == 0) {
                    str2 = UUID.randomUUID().toString();
                    int i3 = 10 / 0;
                } else {
                    str2 = UUID.randomUUID().toString();
                }
                int i4 = component2 + 75;
                copy = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(str, str2);
        }

        public final String getId() {
            int i = 2 % 2;
            int i2 = component2 + 89;
            copy = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component3;
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            return str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 83;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 7;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 11 % 2;
        }

        public static Success copy$default(Success success, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 21;
            int i4 = i3 % 128;
            copy = i4;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                str = success.copydefault;
                int i5 = i4 + 83;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 4;
                }
            }
            if ((i & 2) != 0) {
                str2 = success.component3;
                int i7 = i4 + 63;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
            return success.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 113;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 93;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 75 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copy + 45;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 51;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Success copy(String message, String id) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Intrinsics.checkNotNullParameter(id, "");
            Success success = new Success(message, id);
            int i2 = copy + 45;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return success;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copy + 69;
                component2 = i2 % 128;
                return !(i2 % 2 != 0);
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            if (!Intrinsics.areEqual(this.copydefault, success.copydefault)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component3, success.component3)) {
                return true;
            }
            int i3 = component2 + 113;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copy + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.copydefault.hashCode() * 31) + this.component3.hashCode();
            int i4 = copy + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(message=" + this.copydefault + ", id=" + this.component3 + ")";
            int i2 = component2 + 83;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Info;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "message", "", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Info implements ToastState {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int getRequestBeneficiariesState = 1;
        private final String component2;
        private final String copydefault;

        public Info(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.component2 = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Info(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getRequestBeneficiariesState + 121;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    str2 = UUID.randomUUID().toString();
                    int i3 = 67 / 0;
                } else {
                    str2 = UUID.randomUUID().toString();
                }
                int i4 = getRequestBeneficiariesState + 105;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            }
            this(str, str2);
        }

        public final String getId() {
            int i = 2 % 2;
            int i2 = component1 + 3;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 31;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 111;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 109;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static Info copy$default(Info info, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 99;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 43;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                str = info.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = info.component2;
            }
            return info.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1 + 47;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.copydefault;
            int i5 = i3 + 61;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component1 + 65;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return str;
        }

        public final Info copy(String message, String id) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Intrinsics.checkNotNullParameter(id, "");
            Info info = new Info(message, id);
            int i2 = getRequestBeneficiariesState + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return info;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                int i2 = component1 + 81;
                int i3 = i2 % 128;
                getRequestBeneficiariesState = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 101;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            Info info = (Info) other;
            if (!Intrinsics.areEqual(this.copydefault, info.copydefault)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component2, info.component2)) {
                return true;
            }
            int i6 = getRequestBeneficiariesState;
            int i7 = i6 + 43;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 115;
            component1 = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 25;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.copydefault.hashCode() * 31) + this.component2.hashCode();
            int i4 = component1 + 79;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Info(message=" + this.copydefault + ", id=" + this.component2 + ")";
            int i2 = getRequestBeneficiariesState + 91;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState$Error;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "message", "", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements ToastState {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component3 = 0;
        private static int component4 = 1;
        private static int copydefault = 71 % 128;
        private final String component1;
        private final String component2;

        public Error(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.component1 = str;
            this.component2 = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Error(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = component3 + 39;
                component4 = i2 % 128;
                if (i2 % 2 == 0) {
                    UUID.randomUUID().toString();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                str2 = UUID.randomUUID().toString();
                int i3 = 2 % 2;
            }
            this(str, str2);
        }

        public final String getId() {
            int i = 2 % 2;
            int i2 = component4 + 71;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 15;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 81;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component1;
            int i5 = i2 + 91;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 71 % 2;
        }

        public static Error copy$default(Error error, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component4;
            int i4 = i3 + 41;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str = error.component1;
            }
            if ((i & 2) != 0) {
                int i6 = i3 + 111;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                str2 = error.component2;
            }
            return error.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component4 + 113;
            int i3 = i2 % 128;
            component3 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.component1;
            int i4 = i3 + 103;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component4 + 19;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 117;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Error copy(String message, String id) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Intrinsics.checkNotNullParameter(id, "");
            Error error = new Error(message, id);
            int i2 = component4 + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return error;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 117;
                component3 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (other instanceof Error) {
                Error error = (Error) other;
                return Intrinsics.areEqual(this.component1, error.component1) && Intrinsics.areEqual(this.component2, error.component2);
            }
            int i6 = i2 + 83;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 77;
            component4 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 83 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component4 + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.component1.hashCode() * 31) + this.component2.hashCode();
            int i4 = component3 + 111;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(message=" + this.component1 + ", id=" + this.component2 + ")";
            int i2 = component3 + 59;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
