package com.huawei.digitalpayment.customer.dynamics.widget.signature;

public class ControlTimedPoints {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public TimedPoint c1;
    public TimedPoint c2;

    public ControlTimedPoints set(TimedPoint timedPoint, TimedPoint timedPoint2) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.c1 = timedPoint;
        this.c2 = timedPoint2;
        int i5 = i2 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return this;
    }
}
