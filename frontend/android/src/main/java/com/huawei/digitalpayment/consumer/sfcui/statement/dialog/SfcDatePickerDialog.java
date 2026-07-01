package com.huawei.digitalpayment.consumer.sfcui.statement.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.dialog.date.DatePickerDialog;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\bB/\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0002\u0010\u000bB7\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0002\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/dialog/SfcDatePickerDialog;", "Lcom/huawei/common/widget/dialog/date/DatePickerDialog;", "<init>", "()V", "startCalendar", "Ljava/util/Calendar;", "endCalendar", "currentCalendar", "(Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;)V", "title", "", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;)V", "btnText", "(Ljava/lang/String;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/util/Calendar;Ljava/lang/String;)V", "monthAbbreviations", "", "[Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getFormatMonth", "month", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcDatePickerDialog extends DatePickerDialog {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private String component2;
    private final String[] copydefault;

    public SfcDatePickerDialog() {
        this.copydefault = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcDatePickerDialog(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(calendar, calendar2, calendar3);
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        Intrinsics.checkNotNullParameter(calendar3, "");
        this.copydefault = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcDatePickerDialog(String str, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(str, calendar, calendar2, calendar3);
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcDatePickerDialog(String str, Calendar calendar, Calendar calendar2, Calendar calendar3, String str2) {
        super(str, calendar, calendar2, calendar3);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        this.component2 = str2;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        LoadingButton loadingButton = (LoadingButton) view.findViewById(R.id.btn_confirm);
        if (!TextUtils.isEmpty(this.component2)) {
            int i4 = ShareDataUIState + 7;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            loadingButton.getTextView().setText(this.component2);
            int i6 = ShareDataUIState + 95;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        ((ImageView) view.findViewById(R.id.iv_back)).setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view2) {
                int i8 = 2 % 2;
                int i9 = component2 + 119;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                SfcDatePickerDialog.$r8$lambda$s06bThSIp9BQhmD7FhtZtnuNW_4(this.f$0, view2);
                if (i10 != 0) {
                    int i11 = 9 / 0;
                }
            }
        });
        int i8 = ShareDataUIState + 1;
        component3 = i8 % 128;
        int i9 = i8 % 2;
    }

    private static final void ShareDataUIState(SfcDatePickerDialog sfcDatePickerDialog, View view) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcDatePickerDialog, "");
        sfcDatePickerDialog.dismiss();
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.dialog_sfc_date_picker;
        int i5 = ShareDataUIState + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getFormatMonth(int month) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (1 <= month) {
            int i5 = i3 + 37;
            component3 = i5 % 128;
            if (i5 % 2 == 0 ? month < 13 : month < 8) {
                return this.copydefault[month - 1];
            }
        }
        return "";
    }

    public static void $r8$lambda$s06bThSIp9BQhmD7FhtZtnuNW_4(SfcDatePickerDialog sfcDatePickerDialog, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        copydefault(sfcDatePickerDialog, view);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 59;
        component1 = i % 128;
        int i2 = i % 2;
    }

    private static void copydefault(SfcDatePickerDialog sfcDatePickerDialog, View view) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                ShareDataUIState(sfcDatePickerDialog, view);
                return;
            }
            ShareDataUIState(sfcDatePickerDialog, view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }
}
