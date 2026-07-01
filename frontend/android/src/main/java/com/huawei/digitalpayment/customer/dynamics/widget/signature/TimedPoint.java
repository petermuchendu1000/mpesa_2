package com.huawei.digitalpayment.customer.dynamics.widget.signature;

public class TimedPoint {
    private static int component1 = 1;
    private static int copydefault;
    public float pointX;
    public float pointY;
    public long time;

    public TimedPoint set(float f, float f2) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.pointX = f;
        this.pointY = f2;
        this.time = System.currentTimeMillis();
        int i4 = component1 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public float velocityFrom(TimedPoint timedPoint) {
        int i = 2 % 2;
        long j = this.time - timedPoint.time;
        if (j <= 0) {
            int i2 = component1 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            j = 1;
        }
        float fDistanceTo = distanceTo(timedPoint) / j;
        if (!Float.isInfinite(fDistanceTo)) {
            int i4 = copydefault + 75;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            if (!Float.isNaN(fDistanceTo)) {
                return fDistanceTo;
            }
        }
        return 0.0f;
    }

    public float distanceTo(TimedPoint timedPoint) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        float fSqrt = (float) Math.sqrt(Math.pow(timedPoint.pointX - this.pointX, 2.0d) + Math.pow(timedPoint.pointY - this.pointY, 2.0d));
        int i4 = component1 + 55;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return fSqrt;
        }
        throw null;
    }
}
