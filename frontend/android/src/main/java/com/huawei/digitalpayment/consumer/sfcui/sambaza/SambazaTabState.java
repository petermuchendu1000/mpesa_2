package com.huawei.digitalpayment.consumer.sfcui.sambaza;

import com.huawei.digitalpayment.consumer.sfc.R;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;", "", "title", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Ljava/lang/String;ILcom/safaricom/consumer/commons/util/TextResource;)V", "getTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "AIRTIME", "DATA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaTabState {
    private static final EnumEntries $ENTRIES;
    private static final SambazaTabState[] $VALUES;
    public static final SambazaTabState AIRTIME = new SambazaTabState("AIRTIME", 0, TextResource.Companion.invoke$default(TextResource.INSTANCE, R.string.gsm_title_sambaza_airtime, false, 2, (Object) null));
    public static final SambazaTabState DATA = new SambazaTabState("DATA", 1, TextResource.Companion.invoke$default(TextResource.INSTANCE, R.string.gsm_title_sambaza_data, false, 2, (Object) null));
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    private final TextResource title;

    private SambazaTabState(String str, int i, TextResource textResource) {
        this.title = textResource;
    }

    public final TextResource getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        TextResource textResource = this.title;
        int i5 = i3 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    static {
        SambazaTabState[] sambazaTabStateArr$values = $values();
        $VALUES = sambazaTabStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sambazaTabStateArr$values);
        int i = component1 + 67;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static SambazaTabState valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SambazaTabState sambazaTabState = (SambazaTabState) Enum.valueOf(SambazaTabState.class, str);
        int i4 = ShareDataUIState + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return sambazaTabState;
    }

    public static SambazaTabState[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SambazaTabState[] sambazaTabStateArr = (SambazaTabState[]) $VALUES.clone();
        int i4 = ShareDataUIState + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return sambazaTabStateArr;
        }
        throw null;
    }

    private static final SambazaTabState[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        SambazaTabState[] sambazaTabStateArr = {AIRTIME, DATA};
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return sambazaTabStateArr;
    }

    public static EnumEntries<SambazaTabState> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
