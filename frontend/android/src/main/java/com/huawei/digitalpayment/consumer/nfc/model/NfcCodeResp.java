package com.huawei.digitalpayment.consumer.nfc.model;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/model/NfcCodeResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_EXECUTE, "", "params", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getExecute", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcCodeResp extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String execute;
    private final Map<String, String> params;

    public NfcCodeResp(String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.execute = str;
        this.params = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NfcCodeResp(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            int i4 = 2 % 2;
            str = "";
        }
        this(str, map);
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final Map<String, String> getParams() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.params;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
