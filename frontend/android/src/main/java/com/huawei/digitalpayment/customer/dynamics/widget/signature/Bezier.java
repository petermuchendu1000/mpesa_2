package com.huawei.digitalpayment.customer.dynamics.widget.signature;

public class Bezier {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public TimedPoint control1;
    public TimedPoint control2;
    public TimedPoint endPoint;
    public TimedPoint startPoint;

    public Bezier set(TimedPoint timedPoint, TimedPoint timedPoint2, TimedPoint timedPoint3, TimedPoint timedPoint4) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            this.startPoint = timedPoint;
            this.control1 = timedPoint2;
            this.control2 = timedPoint3;
            this.endPoint = timedPoint4;
            int i4 = 15 / 0;
        } else {
            this.startPoint = timedPoint;
            this.control1 = timedPoint2;
            this.control2 = timedPoint3;
            this.endPoint = timedPoint4;
        }
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return this;
    }

    public float length() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        float f = 0.0f;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i7 = 0;
        while (i7 <= 10) {
            int i8 = ShareDataUIState + 35;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            float f2 = i7 / 10;
            double dPoint = point(f2, this.startPoint.pointX, this.control1.pointX, this.control2.pointX, this.endPoint.pointX);
            double dPoint2 = point(f2, this.startPoint.pointY, this.control1.pointY, this.control2.pointY, this.endPoint.pointY);
            if (i7 > 0) {
                int i10 = copydefault + 65;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
                double d4 = dPoint - d3;
                double d5 = dPoint2 - d2;
                float fSqrt = (float) (((double) f) + Math.sqrt((d4 * d4) + (d5 * d5)));
                int i12 = ShareDataUIState + 57;
                copydefault = i12 % 128;
                int i13 = i12 % 2;
                f = fSqrt;
            }
            i7++;
            d2 = dPoint2;
            d3 = dPoint;
        }
        return f;
    }

    public double point(float f, float f2, float f3, float f4, float f5) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = f;
        double d3 = 1.0d - d2;
        double d4 = (((double) f2) * d3 * d3 * d3) + (((double) f3) * 3.0d * d3 * d3 * d2) + (((double) f4) * 3.0d * d3 * d2 * d2) + ((double) (f5 * f * f * f));
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return d4;
    }
}
