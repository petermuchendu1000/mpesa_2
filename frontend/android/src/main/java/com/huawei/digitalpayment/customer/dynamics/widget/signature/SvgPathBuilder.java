package com.huawei.digitalpayment.customer.dynamics.widget.signature;

import io.ktor.util.date.GMTDateParser;
import kotlin.RequiresApi;

public class SvgPathBuilder {
    private static int component2 = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private final StringBuilder ShareDataUIState;
    private RequiresApi component1;
    private final RequiresApi component3;
    private final Integer copydefault;
    public static final Character SVG_RELATIVE_CUBIC_BEZIER_CURVE = 'c';
    public static final Character SVG_MOVE = Character.valueOf(GMTDateParser.MONTH);

    static {
        int i = getAsAtTimestamp + 7;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SvgPathBuilder(RequiresApi requiresApi, Integer num) {
        this.copydefault = num;
        this.component3 = requiresApi;
        this.component1 = requiresApi;
        StringBuilder sb = new StringBuilder();
        this.ShareDataUIState = sb;
        sb.append(SVG_RELATIVE_CUBIC_BEZIER_CURVE);
    }

    public final Integer getStrokeWidth() {
        int i = 2 % 2;
        int i2 = equals + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.copydefault;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return num;
    }

    public final RequiresApi getLastPoint() {
        int i = 2 % 2;
        int i2 = equals + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        RequiresApi requiresApi = this.component1;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return requiresApi;
    }

    public SvgPathBuilder append(RequiresApi requiresApi, RequiresApi requiresApi2, RequiresApi requiresApi3) {
        int i = 2 % 2;
        int i2 = copy + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState.append(component2(requiresApi, requiresApi2, requiresApi3));
        this.component1 = requiresApi3;
        int i4 = copy + 25;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "<path stroke-width=\"" + this.copydefault + "\" d=\"" + SVG_MOVE + this.component3 + ((CharSequence) this.ShareDataUIState) + "\"/>";
        int i2 = equals + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private String component2(RequiresApi requiresApi, RequiresApi requiresApi2, RequiresApi requiresApi3) {
        int i = 2 % 2;
        String str = requiresApi.ShareDataUIState(this.component1) + " " + requiresApi2.ShareDataUIState(this.component1) + " " + requiresApi3.ShareDataUIState(this.component1) + " ";
        if (!"c0 0 0 0 0 0".equals(str)) {
            return str;
        }
        int i2 = equals + 19;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return "";
    }
}
