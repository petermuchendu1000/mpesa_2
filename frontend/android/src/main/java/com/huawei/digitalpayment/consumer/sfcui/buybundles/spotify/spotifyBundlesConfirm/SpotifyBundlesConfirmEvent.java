package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent;", "", "ShowToast", "NavigateToStatusScreen", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent$NavigateToStatusScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent$ShowToast;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SpotifyBundlesConfirmEvent {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent$ShowToast;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowToast implements SpotifyBundlesConfirmEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String component2;

        public ShowToast(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 73;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 39;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 97;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static ShowToast copy$default(ShowToast showToast, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 67;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 1;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = showToast.component2;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = showToast.component2;
            }
            ShowToast showToastCopy = showToast.copy(str);
            int i7 = component3 + 45;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 35 / 0;
            }
            return showToastCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 97;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.component2;
            int i4 = i2 + 5;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final ShowToast copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            ShowToast showToast = new ShowToast(message);
            int i2 = copydefault + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return showToast;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r2 = r2 + 65;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.component3 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, ((com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast) r6).component2) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r2 = r2 + 117;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.component3 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.component3
                int r1 = r1 + 59
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.copydefault = r2
                int r1 = r1 % r0
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L16
                r1 = 58
                int r1 = r1 / r4
                if (r5 != r6) goto L20
                goto L18
            L16:
                if (r5 != r6) goto L20
            L18:
                int r2 = r2 + 117
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.component3 = r6
                int r2 = r2 % r0
                return r3
            L20:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast
                if (r1 != 0) goto L2c
                int r2 = r2 + 65
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.component3 = r6
                int r2 = r2 % r0
                return r4
            L2c:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent$ShowToast r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast) r6
                java.lang.String r0 = r5.component2
                java.lang.String r6 = r6.component2
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
                if (r6 != 0) goto L39
                return r4
            L39:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm.SpotifyBundlesConfirmEvent.ShowToast.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = component3 + 43;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowToast(message=" + this.component2 + ")";
            int i2 = copydefault + 5;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent$NavigateToStatusScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/spotifyBundlesConfirm/SpotifyBundlesConfirmEvent;", "bundleTitle", "", "<init>", "(Ljava/lang/String;)V", "getBundleTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToStatusScreen implements SpotifyBundlesConfirmEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 71 % 128;
        private static int copydefault;
        private final String component1;

        public NavigateToStatusScreen(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getBundleTitle() {
            int i = 2 % 2;
            int i2 = component2 + 91;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component1;
            }
            throw null;
        }

        static {
            int i = 71 % 2;
        }

        public static NavigateToStatusScreen copy$default(NavigateToStatusScreen navigateToStatusScreen, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = ShareDataUIState + 5;
                int i4 = i3 % 128;
                component2 = i4;
                if (i3 % 2 == 0) {
                    String str2 = navigateToStatusScreen.component1;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = navigateToStatusScreen.component1;
                int i5 = i4 + 37;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
            return navigateToStatusScreen.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 23;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.component1;
            int i4 = i2 + 15;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final NavigateToStatusScreen copy(String bundleTitle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bundleTitle, "");
            NavigateToStatusScreen navigateToStatusScreen = new NavigateToStatusScreen(bundleTitle);
            int i2 = component2 + 15;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return navigateToStatusScreen;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this != other) {
                return (other instanceof NavigateToStatusScreen) && Intrinsics.areEqual(this.component1, ((NavigateToStatusScreen) other).component1);
            }
            int i5 = i2 + 109;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = ShareDataUIState + 29;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NavigateToStatusScreen(bundleTitle=" + this.component1 + ")";
            int i2 = component2 + 75;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
