package com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes;

import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService;", "", "name", "", "description", "icon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getDescription", "getIcon", "()I", "EasyTalkBundles", "DaimaService", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService$DaimaService;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService$EasyTalkBundles;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CallsAndMinutesService {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component4 = 1;
    private static int equals;
    private final int component1;
    private final String component3;
    private final String copydefault;

    private CallsAndMinutesService(String str, String str2, int i) {
        this.component3 = str;
        this.copydefault = str2;
        this.component1 = i;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = equals + 55;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 61;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getIcon() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 123;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 95;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static {
        int i = 1 + 11;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CallsAndMinutesService(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService$EasyTalkBundles;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EasyTalkBundles extends CallsAndMinutesService {
        public static final int $stable = 0;
        public static final EasyTalkBundles INSTANCE = new EasyTalkBundles();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        private EasyTalkBundles() {
            String str = "Easy-Talk Bundles";
            super(str, "Save more on every call with minutes and SMS in one bundle.", R.drawable.ic_gsm_easy_talk, null);
        }

        static {
            int i = component1 + 53;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 47;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i5 = i2 + 75;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (other instanceof EasyTalkBundles) {
                return true;
            }
            int i7 = i4 + 121;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 113;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return -1403411931;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return "EasyTalkBundles";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService$DaimaService;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/callsAndMinutes/CallsAndMinutesService;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DaimaService extends CallsAndMinutesService {
        public static final int $stable = 0;
        public static final DaimaService INSTANCE = new DaimaService();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        private DaimaService() {
            String str = "Daima Service";
            super(str, "Keep your line active", R.drawable.ic_daima, null);
        }

        static {
            int i = ShareDataUIState + 89;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 82 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService)) == true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        
            r2 = r2 + 45;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService.component1 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            return false;
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService.component1
                int r1 = r1 + 119
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService.copydefault = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L16
                r1 = 11
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService
                r1 = r1 ^ r4
                if (r1 == r4) goto L21
                com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService$DaimaService r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService) r6
                return r4
            L21:
                int r2 = r2 + 45
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService.component1 = r6
                int r2 = r2 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.callsAndMinutes.CallsAndMinutesService.DaimaService.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 3;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 1790633491;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 29;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return "DaimaService";
            }
            throw null;
        }
    }
}
