package com.huawei.digitalpayment.consumer.baselib.view;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;", "Ljava/io/Serializable;", CdpConstants.CONTENT_TEXT_COLOR, "", AUAttrsConstant.TV_TEXTSIZE, "", "text", "charSequence", "", "textStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/CharSequence;I)V", "getTextColor", "()Ljava/lang/String;", "getTextSize", "()I", "getText", "getCharSequence", "()Ljava/lang/CharSequence;", "getTextStyle", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RichText implements Serializable {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final CharSequence charSequence;
    private final String text;
    private final String textColor;
    private final int textSize;
    private final int textStyle;

    public RichText(String str, int i, String str2, CharSequence charSequence, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.textColor = str;
        this.textSize = i;
        this.text = str2;
        this.charSequence = charSequence;
        this.textStyle = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RichText(String str, int i, String str2, CharSequence charSequence, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            str = "#666666";
            int i4 = component3 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        String str3 = str;
        if ((i3 & 2) != 0) {
            int i7 = component3 + 61;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            i = 14;
        }
        int i9 = i;
        String str4 = (i3 & 4) != 0 ? "" : str2;
        if ((i3 & 8) != 0) {
            int i10 = component3 + 9;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        if ((i3 & 16) != 0) {
            int i12 = component3 + 47;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i2 = 0;
        }
        this(str3, i9, str4, charSequence2, i2);
    }

    public final String getTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.textColor;
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    public final int getTextSize() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.textSize;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String getText() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.text;
            int i4 = 82 / 0;
        } else {
            str = this.text;
        }
        int i5 = i2 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CharSequence getCharSequence() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        CharSequence charSequence = this.charSequence;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return charSequence;
    }

    public final int getTextStyle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.textStyle;
        int i6 = i2 + 125;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public RichText() {
        this(null, 0, null, null, 0, 31, null);
    }
}
