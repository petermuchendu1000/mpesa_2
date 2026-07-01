package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share;

import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction;", "", "ShareDataNavigationAction", "RequestDataNavigationAction", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DataSharingNavigationAction {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction;", "<init>", "()V", "Add", "Update", "Delete", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Add;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Update;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ShareDataNavigationAction implements DataSharingNavigationAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Add;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Add extends ShareDataNavigationAction {
            public static final int $stable = 0;
            public static final Add INSTANCE = new Add();
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            private static int component3 = 0;
            private static int copydefault = 1;

            private Add() {
                super(null);
            }

            static {
                int i = ShareDataUIState + 61;
                copydefault = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = component3 + 53;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 69 / 0;
                    }
                    return true;
                }
                if (other instanceof Add) {
                    return true;
                }
                int i4 = component3 + 17;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component3 + 13;
                int i3 = i2 % 128;
                component1 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 111;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return -1835671171;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = component3 + 115;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return "Add";
                }
                int i3 = 57 / 0;
                return "Add";
            }
        }

        private ShareDataNavigationAction() {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Update;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction;", "beneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;)V", "getBeneficiary", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Update extends ShareDataNavigationAction {
            public static final int $stable = 0;
            private static int component1 = 0;
            private static int component2 = 1;
            private static int component3 = 0;
            private static int copydefault = 1;
            private final ShareDataBeneficiary ShareDataUIState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(ShareDataBeneficiary shareDataBeneficiary) {
                super(null);
                Intrinsics.checkNotNullParameter(shareDataBeneficiary, "");
                this.ShareDataUIState = shareDataBeneficiary;
            }

            public final ShareDataBeneficiary getBeneficiary() {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 53;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataBeneficiary shareDataBeneficiary = this.ShareDataUIState;
                int i5 = i2 + 103;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return shareDataBeneficiary;
            }

            static {
                int i = 1 + 123;
                component3 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 94 / 0;
                }
            }

            public static Update copy$default(Update update, ShareDataBeneficiary shareDataBeneficiary, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 107;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if ((i & 1) != 0) {
                    shareDataBeneficiary = update.ShareDataUIState;
                }
                Update updateCopy = update.copy(shareDataBeneficiary);
                int i5 = component2 + 105;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return updateCopy;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final ShareDataBeneficiary component1() {
                ShareDataBeneficiary shareDataBeneficiary;
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 93;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    shareDataBeneficiary = this.ShareDataUIState;
                    int i4 = 69 / 0;
                } else {
                    shareDataBeneficiary = this.ShareDataUIState;
                }
                int i5 = i2 + 61;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return shareDataBeneficiary;
            }

            public final Update copy(ShareDataBeneficiary beneficiary) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(beneficiary, "");
                Update update = new Update(beneficiary);
                int i2 = component1 + 79;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return update;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = component2 + 95;
                    component1 = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!(other instanceof Update)) {
                    int i3 = component1 + 45;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.ShareDataUIState, ((Update) other).ShareDataUIState)) {
                    return true;
                }
                int i5 = component1 + 1;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component1 + 3;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.ShareDataUIState.hashCode();
                int i4 = component1 + 115;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Update(beneficiary=" + this.ShareDataUIState + ")";
                int i2 = component2 + 87;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        }

        static {
            int i = 1 + 23;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$ShareDataNavigationAction;", "beneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;)V", "getBeneficiary", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Delete extends ShareDataNavigationAction {
            public static final int $stable = 0;
            private static int component1 = 1;
            private static int component2 = 0;
            private static int component3 = 0;
            private static int copydefault = 121 % 128;
            private final ShareDataBeneficiary ShareDataUIState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Delete(ShareDataBeneficiary shareDataBeneficiary) {
                super(null);
                Intrinsics.checkNotNullParameter(shareDataBeneficiary, "");
                this.ShareDataUIState = shareDataBeneficiary;
            }

            public final ShareDataBeneficiary getBeneficiary() {
                int i = 2 % 2;
                int i2 = component1 + 9;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                ShareDataBeneficiary shareDataBeneficiary = this.ShareDataUIState;
                int i5 = i3 + 65;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return shareDataBeneficiary;
            }

            static {
                if (121 % 2 == 0) {
                    throw null;
                }
            }

            public static Delete copy$default(Delete delete, ShareDataBeneficiary shareDataBeneficiary, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 23;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                if ((i & 1) != 0) {
                    int i6 = i4 + 37;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    shareDataBeneficiary = delete.ShareDataUIState;
                }
                return delete.copy(shareDataBeneficiary);
            }

            public final ShareDataBeneficiary component1() {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 55;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ShareDataBeneficiary shareDataBeneficiary = this.ShareDataUIState;
                int i4 = i2 + 29;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 47 / 0;
                }
                return shareDataBeneficiary;
            }

            public final Delete copy(ShareDataBeneficiary beneficiary) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(beneficiary, "");
                Delete delete = new Delete(beneficiary);
                int i2 = component2 + 111;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return delete;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Delete)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.ShareDataUIState, ((Delete) other).ShareDataUIState)) {
                    int i2 = component1 + 63;
                    component2 = i2 % 128;
                    return i2 % 2 != 0;
                }
                int i3 = component2 + 37;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 92 / 0;
                }
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component2 + 123;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.ShareDataUIState.hashCode();
                int i4 = component1 + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 46 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Delete(beneficiary=" + this.ShareDataUIState + ")";
                int i2 = component2 + 29;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public ShareDataNavigationAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction;", "<init>", "()V", "Request", "Delete", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction$Request;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RequestDataNavigationAction implements DataSharingNavigationAction {
        public static final int $stable = 0;
        private static int component1 = 89 % 128;
        private static int copydefault;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction$Request;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Request extends RequestDataNavigationAction {
            public static final int $stable = 0;
            public static final Request INSTANCE = new Request();
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            private static int component3 = 0;
            private static int copydefault = 1;

            private Request() {
                super(null);
            }

            static {
                int i = ShareDataUIState + 57;
                component2 = i % 128;
                int i2 = i % 2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                if ((r7 instanceof com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
            
                r3 = r3 + 43;
                com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.copydefault = r3 % 128;
                r3 = r3 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
            
                r7 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request) r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
            
                if (r6 == r7) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            
                r1 = r1 + 47;
                r7 = r1 % 128;
                com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.component3 = r7;
                r1 = r1 % 2;
                r7 = r7 + 111;
                com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.copydefault = r7 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                if ((r7 % 2) == 0) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean equals(java.lang.Object r7) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.copydefault
                    int r2 = r1 + 41
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.component3 = r3
                    int r2 = r2 % r0
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L16
                    r2 = 92
                    int r2 = r2 / r5
                    if (r6 != r7) goto L2b
                    goto L18
                L16:
                    if (r6 != r7) goto L2b
                L18:
                    int r1 = r1 + 47
                    int r7 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.component3 = r7
                    int r1 = r1 % r0
                    int r7 = r7 + 111
                    int r1 = r7 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.copydefault = r1
                    int r7 = r7 % r0
                    if (r7 == 0) goto L29
                    return r4
                L29:
                    r7 = 0
                    throw r7
                L2b:
                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request
                    if (r1 != 0) goto L37
                    int r3 = r3 + 43
                    int r7 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.copydefault = r7
                    int r3 = r3 % r0
                    return r5
                L37:
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction$RequestDataNavigationAction$Request r7 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request) r7
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.share.DataSharingNavigationAction.RequestDataNavigationAction.Request.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = copydefault + 81;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return 1087608411;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = copydefault + 83;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return "Request";
                }
                throw null;
            }
        }

        private RequestDataNavigationAction() {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/share/DataSharingNavigationAction$RequestDataNavigationAction;", "beneficiary", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;)V", "getBeneficiary", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/ShareDataBeneficiary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Delete extends RequestDataNavigationAction {
            public static final int $stable = 0;
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            private static int component2 = 0;
            private static int component3 = 107 % 128;
            private final ShareDataBeneficiary copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Delete(ShareDataBeneficiary shareDataBeneficiary) {
                super(null);
                Intrinsics.checkNotNullParameter(shareDataBeneficiary, "");
                this.copydefault = shareDataBeneficiary;
            }

            public final ShareDataBeneficiary getBeneficiary() {
                int i = 2 % 2;
                int i2 = component2 + 43;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.copydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                if (107 % 2 == 0) {
                    int i = 74 / 0;
                }
            }

            public static Delete copy$default(Delete delete, ShareDataBeneficiary shareDataBeneficiary, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 67;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                if ((i & 1) != 0) {
                    int i6 = i4 + 125;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        ShareDataBeneficiary shareDataBeneficiary2 = delete.copydefault;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    shareDataBeneficiary = delete.copydefault;
                }
                Delete deleteCopy = delete.copy(shareDataBeneficiary);
                int i7 = component2 + 103;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                return deleteCopy;
            }

            public final ShareDataBeneficiary component1() {
                int i = 2 % 2;
                int i2 = component1 + 97;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.copydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Delete copy(ShareDataBeneficiary beneficiary) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(beneficiary, "");
                Delete delete = new Delete(beneficiary);
                int i2 = component2 + 15;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return delete;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 107;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (this == other) {
                    return true;
                }
                if (other instanceof Delete) {
                    return Intrinsics.areEqual(this.copydefault, ((Delete) other).copydefault);
                }
                int i4 = i2 + 3;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component2 + 81;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.copydefault.hashCode();
                int i4 = component2 + 71;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Delete(beneficiary=" + this.copydefault + ")";
                int i2 = component2 + 77;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
        }

        static {
            int i = 89 % 2;
        }

        public RequestDataNavigationAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
