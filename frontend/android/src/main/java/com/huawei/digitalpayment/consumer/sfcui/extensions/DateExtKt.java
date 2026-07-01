package com.huawei.digitalpayment.consumer.sfcui.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, d2 = {"formatExpiryToRelativeDate", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatExpiryDate", "parseDate", "Ljava/util/Date;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateExtKt {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static final String formatExpiryToRelativeDate(String str, Composer composer, int i) {
        long time;
        String strStringResource;
        int i2 = 2 % 2;
        composer.startReplaceGroup(-908621850);
        Date dateComponent3 = component3(str);
        Date date = new Date();
        if (dateComponent3 != null) {
            int i3 = component1 + 41;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                time = dateComponent3.getTime();
                int i4 = 11 / 0;
            } else {
                time = dateComponent3.getTime();
            }
        } else {
            time = date.getTime();
        }
        long time2 = time - date.getTime();
        if (time2 <= 0) {
            composer.startReplaceGroup(1547413317);
            strStringResource = StringResources_androidKt.stringResource(R.string.expired, composer, 0);
            composer.endReplaceGroup();
        } else {
            Duration.Companion companion = Duration.INSTANCE;
            if (time2 < Duration.m13264getInWholeMillisecondsimpl(DurationKt.toDuration(5, DurationUnit.DAYS))) {
                int i5 = component1 + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                composer.startReplaceGroup(1547581771);
                strStringResource = StringResources_androidKt.stringResource(R.string.expires_in_days, new Object[]{Integer.valueOf((int) (time2 / 86400000))}, composer, 64);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1547824222);
                composer.endReplaceGroup();
                Calendar calendar = Calendar.getInstance();
                if (dateComponent3 != null) {
                    int i7 = component1 + 85;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    calendar.setTime(dateComponent3);
                }
                strStringResource = calendar.get(5) + " " + calendar.getDisplayName(2, 1, Locale.getDefault()) + " " + calendar.get(1);
            }
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public static final String formatExpiryDate(String str, Composer composer, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 115;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            composer.startReplaceGroup(-294771169);
            component3(str);
            obj.hashCode();
            throw null;
        }
        composer.startReplaceGroup(-294771169);
        Date dateComponent3 = component3(str);
        if (dateComponent3 == null) {
            composer.endReplaceGroup();
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateComponent3);
        String str2 = calendar.get(5) + "-" + calendar.get(2) + "-" + calendar.get(1);
        composer.endReplaceGroup();
        int i4 = component1 + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Date component3(String str) {
        Date date;
        int i = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.ISO_DATE_FORMAT, Locale.getDefault());
        if (str != null) {
            int i2 = ShareDataUIState + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            try {
                date = simpleDateFormat.parse(str);
            } catch (ParseException unused) {
                date = null;
            }
        } else {
            date = null;
        }
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return date;
    }
}
