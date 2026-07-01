package com.huawei.digitalpayment.consumer.base.util;

import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/SfcPhoneNumberUtil;", "", "<init>", "()V", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcPhoneNumberUtil {

    public static final Companion INSTANCE = new Companion(null);
    private static final String ShareDataUIState = "254";
    private static final String component1 = "^[0-9]{4,16}$";
    private static int component2 = 0;
    private static final String component3 = "^(?:254)?(?:(?:07|01)\\d{8}|[71]\\d{8})$";
    private static int component4 = 1;
    private static int copy = 0;
    private static final String copydefault = "^[0-9A-Za-z]{0,16}$";
    private static int getAsAtTimestamp = 1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/SfcPhoneNumberUtil$Companion;", "", "<init>", "()V", "PHONE_NUMBER_REGULAR", "", "countryCode", "getCountryCode", "()Ljava/lang/String;", "RECEIVER_TILL_REGULAR", "SHORTCODE_REGULAR", "formatPhoneNumber", "phoneNumber", "isMask", "", "maskPhoneNumber", "formatPhoneNumberWithMask", "formatterInputPhoneNumber", "content", "formatterPhoneNumberNoCountryCode", "formatterPhoneNumber", "formatterPhoneNumberNoCountryCodeNoZero", "isValidPhoneNumber", "formatterPhoneNumberNoCountryCodePlusZero", "isValidTillNumber", "till", "isValidShortCode", KeysConstants.SHORT_CODE, "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 1;
        private static int copydefault;

        private Companion() {
        }

        public final String getCountryCode() {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return SfcPhoneNumberUtil.access$getCountryCode$cp();
            }
            SfcPhoneNumberUtil.access$getCountryCode$cp();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            if (kotlin.text.StringsKt.startsWith$default(r8, getCountryCode(), false, 2, (java.lang.Object) null) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            r1 = r8.substring(getCountryCode().length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            r1 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            if (r1.length() == 9) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            r9 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault + 71;
            com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if ((r9 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            r4.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            r4 = r1.substring(0, 3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r9 == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        
            r8 = "***";
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            r8 = r1.substring(3, 6);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            r9 = r1.substring(6, 9);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
            r8 = getCountryCode() + " " + r4 + " " + r8 + " " + r9;
            r9 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault + 49;
            com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
        
            if ((r9 % 2) != 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        
            r6 = 9 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (r8.length() == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        
            if (r8.length() == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            return "";
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String formatPhoneNumber(java.lang.String r8, boolean r9) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1
                int r1 = r1 + 37
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                if (r1 == 0) goto L21
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                r4 = 31
                int r4 = r4 / r2
                if (r1 != 0) goto L2e
                goto L2d
            L21:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r1 = r1.length()
                if (r1 != 0) goto L2e
            L2d:
                return r3
            L2e:
                java.lang.String r1 = r7.getCountryCode()
                r4 = 0
                boolean r1 = kotlin.text.StringsKt.startsWith$default(r8, r1, r2, r0, r4)
                if (r1 == 0) goto L49
                java.lang.String r1 = r7.getCountryCode()
                int r1 = r1.length()
                java.lang.String r1 = r8.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                goto L4a
            L49:
                r1 = r8
            L4a:
                int r5 = r1.length()
                r6 = 9
                if (r5 == r6) goto L62
                int r9 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault
                int r9 = r9 + 71
                int r1 = r9 % 128
                com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r1
                int r9 = r9 % r0
                if (r9 == 0) goto L5e
                return r8
            L5e:
                r4.hashCode()
                throw r4
            L62:
                r8 = 3
                java.lang.String r4 = r1.substring(r2, r8)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                r5 = 6
                if (r9 == 0) goto L70
                java.lang.String r8 = "***"
                goto L77
            L70:
                java.lang.String r8 = r1.substring(r8, r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            L77:
                java.lang.String r9 = r1.substring(r5, r6)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
                java.lang.String r1 = r7.getCountryCode()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r1 = " "
                r3.append(r1)
                r3.append(r4)
                r3.append(r1)
                r3.append(r8)
                r3.append(r1)
                r3.append(r9)
                java.lang.String r8 = r3.toString()
                int r9 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault
                int r9 = r9 + 49
                int r1 = r9 % 128
                com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r1
                int r9 = r9 % r0
                if (r9 != 0) goto Lae
                int r6 = r6 / r2
            Lae:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.formatPhoneNumber(java.lang.String, boolean):java.lang.String");
        }

        public final String maskPhoneNumber(String phoneNumber) {
            String strSubstring;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(phoneNumber, "");
            if (phoneNumber.length() == 0) {
                int i2 = copydefault + 123;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return "";
            }
            if (StringsKt.startsWith$default(phoneNumber, getCountryCode(), false, 2, (Object) null)) {
                strSubstring = phoneNumber.substring(getCountryCode().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                int i4 = copydefault + 103;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                strSubstring = phoneNumber;
            }
            String str = "0" + strSubstring;
            if (str.length() < 7) {
                return phoneNumber;
            }
            String strSubstring2 = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strSubstring3 = str.substring(str.length() - 3, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            return " " + strSubstring2 + "***" + strSubstring3;
        }

        public final String formatPhoneNumberWithMask(String phoneNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(phoneNumber, "");
            if (phoneNumber.length() == 0) {
                int i2 = component1;
                int i3 = i2 + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 47;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 28 / 0;
                }
                return "";
            }
            if (phoneNumber.length() < 9) {
                return phoneNumber;
            }
            int length = phoneNumber.length();
            String strSubstring = phoneNumber.substring(0, length - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = phoneNumber.substring(length - 3, length);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return strSubstring + "***" + strSubstring2;
        }

        public final String formatterInputPhoneNumber(String content) {
            int i = 2 % 2;
            int i2 = component1 + 109;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            if (TextUtils.isEmpty(content)) {
                return content;
            }
            if (StringsKt.startsWith$default(content, getCountryCode(), false, 2, (Object) null)) {
                int i4 = component1 + 63;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                content = StringsKt.replaceFirst$default(content, getCountryCode(), "", false, 4, (Object) null);
            }
            if (StringsKt.startsWith$default(content, "07", false, 2, (Object) null) || StringsKt.startsWith$default(content, "01", false, 2, (Object) null)) {
                content = content.substring(1, content.length());
                Intrinsics.checkNotNullExpressionValue(content, "");
                int i6 = copydefault + 111;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
            return getCountryCode() + content;
        }

        public final String formatterPhoneNumberNoCountryCode(String content) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            if (TextUtils.isEmpty(content)) {
                return content;
            }
            int i2 = copydefault + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.startsWith$default(content, getCountryCode(), false, 2, (Object) null)) {
                int i4 = component1 + 35;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                String strReplaceFirst$default = StringsKt.replaceFirst$default(content, getCountryCode(), "", false, 4, (Object) null);
                int i6 = copydefault + 31;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return strReplaceFirst$default;
            }
            if (!StringsKt.startsWith$default(content, "+" + getCountryCode(), false, 2, (Object) null)) {
                return StringsKt.startsWith$default(content, "+", false, 2, (Object) null) ? StringsKt.replaceFirst$default(content, "+", "", false, 4, (Object) null) : content;
            }
            return StringsKt.replaceFirst$default(content, "+" + getCountryCode(), "", false, 4, (Object) null);
        }

        public final String formatterPhoneNumber(String content) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            String str = content;
            if (TextUtils.isEmpty(str)) {
                return content;
            }
            int i2 = copydefault + 103;
            component1 = i2 % 128;
            if (i2 % 2 != 0 ? StringsKt.startsWith$default(content, "+", false, 2, (Object) null) : StringsKt.startsWith$default(content, "+", true, 5, (Object) null)) {
                String strReplaceFirst$default = StringsKt.replaceFirst$default(content, "+", "", false, 4, (Object) null);
                int i3 = copydefault + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return strReplaceFirst$default;
            }
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null)) {
                return StringsKt.contains$default((CharSequence) str, (CharSequence) " ", false, 2, (Object) null) ? StringsKt.replace$default(content, " ", "", false, 4, (Object) null) : content;
            }
            String strReplace$default = StringsKt.replace$default(content, "-", "", false, 4, (Object) null);
            int i5 = component1 + 51;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return strReplace$default;
            }
            throw null;
        }

        public final String formatterPhoneNumberNoCountryCodeNoZero(String content) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            if (TextUtils.isEmpty(content)) {
                return content;
            }
            int i4 = copydefault + 63;
            component1 = i4 % 128;
            if (i4 % 2 != 0 ? !(!StringsKt.startsWith$default(content, getCountryCode(), false, 2, (Object) null)) : StringsKt.startsWith$default(content, getCountryCode(), false, 3, (Object) null)) {
                content = StringsKt.replaceFirst$default(content, getCountryCode(), "", false, 4, (Object) null);
            }
            if (!StringsKt.startsWith$default(content, "07", false, 2, (Object) null) && !StringsKt.startsWith$default(content, "01", false, 2, (Object) null)) {
                return content;
            }
            String strSubstring = content.substring(1, content.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
  0x003d: PHI (r1v6 java.lang.String) = (r1v5 java.lang.String), (r1v12 java.lang.String) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isValidPhoneNumber(java.lang.String r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault
                int r1 = r1 + 23
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                if (r1 != 0) goto L28
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
                java.lang.String r1 = r1.getPhoneNumberCode()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r4 = 3
                r5 = 1
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r1, r5, r4, r2)
                if (r2 == r5) goto L3d
                goto L51
            L28:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
                java.lang.String r1 = r1.getPhoneNumberCode()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r4 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r7, r1, r4, r0, r2)
                if (r2 == 0) goto L51
            L3d:
                int r1 = r1.length()
                java.lang.String r7 = r7.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
                int r1 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.copydefault
                int r1 = r1 + 85
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.component1 = r2
                int r1 = r1 % r0
            L51:
                java.lang.String r0 = "^(?:254)?(?:(?:07|01)\\d{8}|[71]\\d{8})$"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                java.util.regex.Matcher r7 = r0.matcher(r7)
                boolean r7 = r7.matches()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.Companion.isValidPhoneNumber(java.lang.String):boolean");
        }

        public final String formatterPhoneNumberNoCountryCodePlusZero(String content) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            String str = "0" + StringsKt.takeLast(StringsKt.replace$default(formatterPhoneNumberNoCountryCode(content), " ", "", false, 4, (Object) null), 9);
            int i2 = component1 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final boolean isValidTillNumber(String till) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(till, "");
                Pattern.compile(SfcPhoneNumberUtil.component1).matcher(till).matches();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(till, "");
            boolean zMatches = Pattern.compile(SfcPhoneNumberUtil.component1).matcher(till).matches();
            int i3 = component1 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return zMatches;
        }

        public final boolean isValidShortCode(String shortCode) {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(shortCode, "");
            boolean zMatches = Pattern.compile(SfcPhoneNumberUtil.copydefault).matcher(shortCode).matches();
            int i4 = component1 + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return zMatches;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private SfcPhoneNumberUtil() {
    }

    public static final String access$getCountryCode$cp() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 105;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = ShareDataUIState;
        int i4 = i2 + 21;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    static {
        int i = getAsAtTimestamp + 119;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }
}
