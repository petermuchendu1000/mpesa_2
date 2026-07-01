package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "", "<init>", "()V", "AddSuccess", "AddError", "DeleteSuccess", "DeleteError", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$AddError;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$AddSuccess;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$DeleteError;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$DeleteSuccess;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FamilyShareEvent {
    public static final int $stable = 0;
    private static int component1 = 59 % 128;
    private static int component2;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$AddSuccess;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddSuccess extends FamilyShareEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 73 % 128;
        private static int component3;
        private static int copydefault;
        private final String component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddSuccess(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component3 + 39;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 19;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return str;
        }

        static {
            if (73 % 2 == 0) {
                throw null;
            }
        }

        public static AddSuccess copy$default(AddSuccess addSuccess, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 17;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = addSuccess.component1;
                    throw null;
                }
                str = addSuccess.component1;
                int i7 = i3 + 33;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
            return addSuccess.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 95;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return str;
        }

        public final AddSuccess copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            AddSuccess addSuccess = new AddSuccess(message);
            int i2 = component3 + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return addSuccess;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 101;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof AddSuccess)) {
                int i4 = ShareDataUIState + 41;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (!(!Intrinsics.areEqual(this.component1, ((AddSuccess) other).component1))) {
                return true;
            }
            int i5 = ShareDataUIState + 113;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = ShareDataUIState + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AddSuccess(message=" + this.component1 + ")";
            int i2 = ShareDataUIState + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    private FamilyShareEvent() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$AddError;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddError extends FamilyShareEvent {
        public static final int $stable = 0;
        private static int component1 = 65 % 128;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddError(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 69;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 87;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            if (65 % 2 == 0) {
                throw null;
            }
        }

        public static AddError copy$default(AddError addError, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 23;
            component3 = i3 % 128;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                str = addError.ShareDataUIState;
            }
            AddError addErrorCopy = addError.copy(str);
            int i4 = component3 + 105;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return addErrorCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 65;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 31;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AddError copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            AddError addError = new AddError(message);
            int i2 = component2 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return addError;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 65;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof AddError) {
                return !(Intrinsics.areEqual(this.ShareDataUIState, ((AddError) other).ShareDataUIState) ^ true);
            }
            int i4 = i2 + 97;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.ShareDataUIState;
            if (i3 == 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AddError(message=" + this.ShareDataUIState + ")";
            int i2 = component3 + 19;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 59 % 2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$DeleteSuccess;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteSuccess extends FamilyShareEvent {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteSuccess(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component3 + 57;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 77;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 29;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static DeleteSuccess copy$default(DeleteSuccess deleteSuccess, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3 + 23;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                str = deleteSuccess.ShareDataUIState;
            }
            DeleteSuccess deleteSuccessCopy = deleteSuccess.copy(str);
            int i5 = copydefault + 61;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return deleteSuccessCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 37;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 123;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final DeleteSuccess copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            DeleteSuccess deleteSuccess = new DeleteSuccess(message);
            int i2 = component3 + 9;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return deleteSuccess;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 17;
                int i3 = i2 % 128;
                component3 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 109;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof DeleteSuccess)) {
                int i7 = component3 + 97;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, ((DeleteSuccess) other).ShareDataUIState)) {
                return true;
            }
            int i9 = copydefault + 53;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            int i4 = component3 + 35;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DeleteSuccess(message=" + this.ShareDataUIState + ")";
            int i2 = component3 + 25;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public FamilyShareEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent$DeleteError;", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteError extends FamilyShareEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 73 % 128;
        private static int component3 = 1;
        private static int copydefault;
        private final String component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteError(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = copydefault + 51;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            throw null;
        }

        static {
            int i = 73 % 2;
        }

        public static DeleteError copy$default(DeleteError deleteError, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                str = deleteError.component1;
            }
            DeleteError deleteErrorCopy = deleteError.copy(str);
            int i5 = component3 + 13;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return deleteErrorCopy;
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 103;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component1;
                int i4 = 21 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i2 + 103;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final DeleteError copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            DeleteError deleteError = new DeleteError(message);
            int i2 = copydefault + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return deleteError;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 117;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof DeleteError))) {
                if (Intrinsics.areEqual(this.component1, ((DeleteError) other).component1)) {
                    return true;
                }
                int i4 = copydefault + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copydefault + 33;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 89;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = copydefault + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DeleteError(message=" + this.component1 + ")";
            int i2 = component3 + 45;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 45 / 0;
            }
            return str;
        }
    }
}
