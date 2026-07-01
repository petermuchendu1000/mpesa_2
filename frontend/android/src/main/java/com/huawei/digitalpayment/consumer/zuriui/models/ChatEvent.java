package com.huawei.digitalpayment.consumer.zuriui.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "", "CopyResult", "Error", "OpenUrl", "ShowToast", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$CopyResult;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$Error;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$OpenUrl;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$ShowToast;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChatEvent {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$CopyResult;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "label", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CopyResult implements ChatEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component4 = 1;
        private static int copydefault;
        private final String component2;
        private final String component3;

        public CopyResult(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.component3 = str;
            this.component2 = str2;
        }

        public final String getLabel() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 57;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.component3;
            int i4 = i2 + 49;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return str;
        }

        public final String getText() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component2;
            }
            throw null;
        }

        static {
            int i = 1 + 57;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static CopyResult copy$default(CopyResult copyResult, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 27;
            int i4 = i3 % 128;
            component4 = i4;
            if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = copyResult.component3;
                int i5 = i4 + 95;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
            if ((i & 2) != 0) {
                str2 = copyResult.component2;
            }
            CopyResult copyResultCopy = copyResult.copy(str, str2);
            int i7 = copydefault + 105;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                return copyResultCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 3;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.component3;
            int i4 = i2 + 31;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 29 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component4 + 79;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 105;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final CopyResult copy(String label, String text) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(label, "");
            Intrinsics.checkNotNullParameter(text, "");
            CopyResult copyResult = new CopyResult(label, text);
            int i2 = component4 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return copyResult;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyResult)) {
                return false;
            }
            CopyResult copyResult = (CopyResult) other;
            if (Intrinsics.areEqual(this.component3, copyResult.component3)) {
                return Intrinsics.areEqual(this.component2, copyResult.component2);
            }
            int i3 = copydefault + 51;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component4 + 45;
            copydefault = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (this.component3.hashCode() >> 45) << this.component2.hashCode() : (this.component3.hashCode() * 31) + this.component2.hashCode();
            int i3 = copydefault + 17;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CopyResult(label=" + this.component3 + ", text=" + this.component2 + ')';
            int i2 = copydefault + 49;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$Error;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements ChatEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 15 % 128;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;
        private final String component3;

        public Error(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component1 + 27;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 15 % 2;
        }

        public static Error copy$default(Error error, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 97;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 23;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                str = error.component3;
            }
            return error.copy(str);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 115;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component3;
                int i4 = 70 / 0;
            } else {
                str = this.component3;
            }
            int i5 = i2 + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Error copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            Error error = new Error(message);
            int i2 = copydefault + 39;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 33 / 0;
            }
            return error;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 117;
            com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.component1 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, ((com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error) r6).component3) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            r6 = com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.component1 + 97;
            com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.copydefault = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.copydefault
                int r2 = r1 + 55
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.component1 = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L16
                r2 = 25
                int r2 = r2 / r4
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r3
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error
                if (r2 != 0) goto L28
                int r1 = r1 + 117
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.component1 = r6
                int r1 = r1 % r0
                if (r1 != 0) goto L27
                return r3
            L27:
                return r4
            L28:
                com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent$Error r6 = (com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error) r6
                java.lang.String r1 = r5.component3
                java.lang.String r6 = r6.component3
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 != 0) goto L3e
                int r6 = com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.component1
                int r6 = r6 + 97
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.copydefault = r1
                int r6 = r6 % r0
                return r4
            L3e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.models.ChatEvent.Error.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = copydefault + 85;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.component3.hashCode();
                int i3 = 18 / 0;
            } else {
                iHashCode = this.component3.hashCode();
            }
            int i4 = copydefault + 97;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(message=" + this.component3 + ')';
            int i2 = component1 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$OpenUrl;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OpenUrl implements ChatEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1 % 128;
        private final String component2;

        public OpenUrl(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getUrl() {
            int i = 2 % 2;
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            return str;
        }

        static {
            int i = 1 % 2;
        }

        public static OpenUrl copy$default(OpenUrl openUrl, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component1 + 3;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                str = openUrl.component2;
                int i6 = i4 + 23;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
            OpenUrl openUrlCopy = openUrl.copy(str);
            int i8 = component1 + 105;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 34 / 0;
            }
            return openUrlCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 113;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 107;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final OpenUrl copy(String url) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(url, "");
            OpenUrl openUrl = new OpenUrl(url);
            int i2 = component1 + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return openUrl;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenUrl)) {
                int i5 = i2 + 25;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.component2, ((OpenUrl) other).component2)) {
                return true;
            }
            int i7 = ShareDataUIState + 111;
            component1 = i7 % 128;
            return i7 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = ShareDataUIState + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OpenUrl(url=" + this.component2 + ')';
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent$ShowToast;", "Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowToast implements ChatEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        private final String component2;

        public ShowToast(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 113;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 81;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
            return str;
        }

        static {
            int i = 1 + 19;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static ShowToast copy$default(ShowToast showToast, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component1 + 49;
                int i4 = i3 % 128;
                component3 = i4;
                if (i3 % 2 != 0) {
                    String str2 = showToast.component2;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = showToast.component2;
                int i5 = i4 + 71;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
            return showToast.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            return str;
        }

        public final ShowToast copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            ShowToast showToast = new ShowToast(message);
            int i2 = component1 + 117;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return showToast;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 41;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 19;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (other instanceof ShowToast) {
                return Intrinsics.areEqual(this.component2, ((ShowToast) other).component2);
            }
            int i8 = i2 + 21;
            component1 = i8 % 128;
            return i8 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = component3 + 47;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowToast(message=" + this.component2 + ')';
            int i2 = component3 + 119;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }
}
