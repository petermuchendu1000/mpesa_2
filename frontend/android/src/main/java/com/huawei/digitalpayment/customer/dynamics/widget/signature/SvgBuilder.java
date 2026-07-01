package com.huawei.digitalpayment.customer.dynamics.widget.signature;

import kotlin.RequiresApi;

public class SvgBuilder {
    private static int component1 = 0;
    private static int component2 = 1;
    private final StringBuilder copydefault = new StringBuilder();
    private SvgPathBuilder ShareDataUIState = null;

    public void clear() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setLength(0);
        this.ShareDataUIState = null;
    }

    public String build(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            if (ShareDataUIState()) {
                component1();
                int i5 = component1 + 3;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
            return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.2\" baseProfile=\"tiny\" h=\"" + i2 + "\" width=\"" + i + "\" viewBox=\"0 0 " + i + " " + i2 + "\"><g stroke-linejoin=\"round\" stroke-linecap=\"round\" fill=\"none\" stroke=\"black\">" + ((CharSequence) this.copydefault) + "</g></svg>";
        }
        ShareDataUIState();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder append(com.huawei.digitalpayment.customer.dynamics.widget.signature.Bezier r8, float r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r9 = java.lang.Math.round(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            o.RequiresApi r1 = new o.RequiresApi
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r2 = r8.startPoint
            r1.<init>(r2)
            o.RequiresApi r2 = new o.RequiresApi
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r3 = r8.control1
            r2.<init>(r3)
            o.RequiresApi r3 = new o.RequiresApi
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r4 = r8.control2
            r3.<init>(r4)
            o.RequiresApi r4 = new o.RequiresApi
            com.huawei.digitalpayment.customer.dynamics.widget.signature.TimedPoint r8 = r8.endPoint
            r4.<init>(r8)
            boolean r8 = r7.ShareDataUIState()
            r5 = 0
            if (r8 != 0) goto L44
            int r8 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component2
            int r8 = r8 + 67
            int r6 = r8 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1 = r6
            int r8 = r8 % r0
            if (r8 != 0) goto L3d
            r7.component3(r9, r1)
            goto L44
        L3d:
            r7.component3(r9, r1)
            r5.hashCode()
            throw r5
        L44:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r8 = r7.ShareDataUIState
            o.RequiresApi r8 = r8.getLastPoint()
            boolean r8 = r1.equals(r8)
            r8 = r8 ^ 1
            if (r8 == 0) goto L53
            goto L6a
        L53:
            int r8 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component2
            int r8 = r8 + 107
            int r6 = r8 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1 = r6
            int r8 = r8 % r0
            if (r8 != 0) goto L7f
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r8 = r7.ShareDataUIState
            java.lang.Integer r8 = r8.getStrokeWidth()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L79
        L6a:
            r7.component1()
            r7.component3(r9, r1)
            int r8 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1
            int r8 = r8 + 11
            int r9 = r8 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component2 = r9
            int r8 = r8 % r0
        L79:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r8 = r7.ShareDataUIState
            r8.append(r2, r3, r4)
            return r7
        L7f:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r8 = r7.ShareDataUIState
            java.lang.Integer r8 = r8.getStrokeWidth()
            r9.equals(r8)
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.append(com.huawei.digitalpayment.customer.dynamics.widget.signature.Bezier, float):com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder");
    }

    private void component3(Integer num, RequiresApi requiresApi) {
        int i = 2 % 2;
        this.ShareDataUIState = new SvgPathBuilder(requiresApi, num);
        int i2 = component1 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void component1() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.append(this.ShareDataUIState);
        int i4 = component2 + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean ShareDataUIState() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component2
            int r2 = r1 + 63
            int r3 = r2 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L16
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r2 = r5.ShareDataUIState
            r4 = 2
            int r4 = r4 / r3
            if (r2 == 0) goto L25
            goto L1a
        L16:
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgPathBuilder r2 = r5.ShareDataUIState
            if (r2 == 0) goto L25
        L1a:
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            goto L25
        L24:
            r3 = 1
        L25:
            int r1 = com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component1
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            return r3
        L31:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.widget.signature.SvgBuilder.ShareDataUIState():boolean");
    }
}
