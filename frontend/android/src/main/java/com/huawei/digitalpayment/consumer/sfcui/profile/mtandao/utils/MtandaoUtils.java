package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/MtandaoUtils;", "", "<init>", "()V", "getRNCIDorCIDp", "", "p_bytes", "", "p_which", "convertByteArrayp", "p_int", "ieee80211FreqKhztoChannel", "freq", "converts", "", "bits", "convertBits", "", "getMonthIndex", "timestamp", "formatDateTime", "dateTime", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MtandaoUtils {
    public static final int $stable = 0;
    public static final MtandaoUtils INSTANCE = new MtandaoUtils();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    private MtandaoUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getRNCIDorCIDp(byte[] r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.component1
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.ShareDataUIState = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r6 == r1) goto L30
            if (r6 == r0) goto L28
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.component1
            int r5 = r5 + 119
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.ShareDataUIState = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L24
            goto L3c
        L24:
            r3.hashCode()
            throw r3
        L28:
            r6 = r5[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r1 = 3
            r5 = r5[r1]
            goto L36
        L30:
            r6 = r5[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5[r1]
        L36:
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r2 = r6 + r5
        L3c:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.component1
            int r5 = r5 + 49
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.ShareDataUIState = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L48
            return r2
        L48:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils.getRNCIDorCIDp(byte[], int):int");
    }

    public final byte[] convertByteArrayp(int p_int) {
        byte[] bArr;
        int i = 2 % 2;
        int i2 = 1;
        int i3 = ShareDataUIState + 1;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            bArr = new byte[2];
        } else {
            bArr = new byte[4];
            i2 = 0;
        }
        while (i2 < 4) {
            int i4 = ShareDataUIState + 63;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                bArr[i2] = (byte) ((p_int >>> (i2 >> 99)) & 7838);
                i2 += 6;
            } else {
                bArr[i2] = (byte) ((p_int >> (i2 * 8)) & 255);
                i2++;
            }
        }
        return bArr;
    }

    public final int ieee80211FreqKhztoChannel(int freq) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (freq == 2484) {
            int i4 = ShareDataUIState + 33;
            component1 = i4 % 128;
            return i4 % 2 == 0 ? 64 : 14;
        }
        if (freq < 2484) {
            i2 = freq - 2407;
        } else if (4910 <= freq && freq < 4981) {
            int i5 = ShareDataUIState + 23;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = freq - 4000;
        } else if (freq < 5925) {
            i2 = freq - 5000;
        } else {
            if (freq == 5935) {
                return 2;
            }
            if (freq > 45000) {
                if (58320 <= freq) {
                    int i6 = ShareDataUIState;
                    int i7 = i6 + 37;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    if (freq < 70201) {
                        int i9 = i6 + 101;
                        int i10 = i9 % 128;
                        component1 = i10;
                        int i11 = i9 % 2;
                        i = (freq - 56160) / 2160;
                        int i12 = i10 + 51;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        return i;
                    }
                }
                return 0;
            }
            i2 = freq - 5950;
        }
        i = i2 / 5;
        int i14 = ShareDataUIState + 67;
        component1 = i14 % 128;
        int i15 = i14 % 2;
        return i;
    }

    public final double converts(double bits) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = String.format(Locale.getDefault(), "%.2f", Double.valueOf(bits / ((double) DurationKt.NANOS_IN_MILLIS)));
        Intrinsics.checkNotNullExpressionValue(str, "");
        double d2 = Double.parseDouble(str);
        int i4 = ShareDataUIState + 73;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String convertBits(double bits) {
        int i = 2 % 2;
        String str = String.format(Locale.getDefault(), "%.2f", Double.valueOf(bits));
        Intrinsics.checkNotNullExpressionValue(str, "");
        double d2 = Double.parseDouble(str);
        String str2 = d2 + " bps";
        if (d2 >= 1024.0d) {
            double d3 = 1024;
            String str3 = String.format(Locale.getDefault(), "%.2f", Double.valueOf(d2 / d3));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            double d4 = Double.parseDouble(str3);
            str2 = d4 + " Kbps";
            if (d4 >= 1024.0d) {
                String str4 = String.format(Locale.getDefault(), "%.2f", Double.valueOf(d4 / d3));
                Intrinsics.checkNotNullExpressionValue(str4, "");
                double d5 = Double.parseDouble(str4);
                str2 = d5 + " Mbps";
                if (d5 >= 1024.0d) {
                    String str5 = String.format(Locale.getDefault(), "%.2f", Double.valueOf(d5 / d3));
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    str2 = Double.parseDouble(str5) + " Gbps";
                    int i2 = ShareDataUIState + 33;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                }
            }
        }
        int i4 = component1 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return str2;
    }

    public final int getMonthIndex(String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(timestamp, "");
        try {
            Date date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.ENGLISH).parse(timestamp);
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNull(date);
            calendar.setTime(date);
            int i2 = calendar.get(2);
            int i3 = ShareDataUIState + 63;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return i2;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String formatDateTime(String dateTime) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dateTime, "");
        try {
            Date date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss", Locale.ENGLISH).parse(dateTime);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm", Locale.getDefault());
            Intrinsics.checkNotNull(date);
            str = simpleDateFormat.format(date);
        } catch (Exception unused) {
            str = "--:--";
        }
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = component2 + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
