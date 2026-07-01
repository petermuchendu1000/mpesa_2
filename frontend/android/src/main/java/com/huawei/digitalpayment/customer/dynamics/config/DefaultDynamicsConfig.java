package com.huawei.digitalpayment.customer.dynamics.config;

import android.util.Size;
import com.huawei.digitalpayment.customer.dynamics.config.IDynamicsConfig;
import com.huawei.digitalpayment.customer.dynamics.util.checker.AlignmentChecker;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/config/DefaultDynamicsConfig;", "Lcom/huawei/digitalpayment/customer/dynamics/config/IDynamicsConfig;", "<init>", "()V", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultDynamicsConfig implements IDynamicsConfig {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public boolean enableScanID() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zEnableScanID = IDynamicsConfig.DefaultImpls.enableScanID(this);
        int i4 = component1 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zEnableScanID;
    }

    @Override
    public AlignmentChecker scanIDAlignmentChecker() {
        AlignmentChecker alignmentCheckerScanIDAlignmentChecker;
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            alignmentCheckerScanIDAlignmentChecker = IDynamicsConfig.DefaultImpls.scanIDAlignmentChecker(this);
            int i3 = 46 / 0;
        } else {
            alignmentCheckerScanIDAlignmentChecker = IDynamicsConfig.DefaultImpls.scanIDAlignmentChecker(this);
        }
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return alignmentCheckerScanIDAlignmentChecker;
    }

    @Override
    public int scanIDAreaBorderColor() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iScanIDAreaBorderColor = IDynamicsConfig.DefaultImpls.scanIDAreaBorderColor(this);
        int i4 = copydefault + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iScanIDAreaBorderColor;
    }

    @Override
    public int scanIDAreaBorderWidth() {
        int iScanIDAreaBorderWidth;
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            iScanIDAreaBorderWidth = IDynamicsConfig.DefaultImpls.scanIDAreaBorderWidth(this);
            int i3 = 85 / 0;
        } else {
            iScanIDAreaBorderWidth = IDynamicsConfig.DefaultImpls.scanIDAreaBorderWidth(this);
        }
        int i4 = component1 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iScanIDAreaBorderWidth;
    }

    @Override
    public int scanIDAreaRoundCorner() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iScanIDAreaRoundCorner = IDynamicsConfig.DefaultImpls.scanIDAreaRoundCorner(this);
        int i4 = copydefault + 49;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return iScanIDAreaRoundCorner;
    }

    @Override
    public Size scanIDAreaSize() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Size sizeScanIDAreaSize = IDynamicsConfig.DefaultImpls.scanIDAreaSize(this);
        int i4 = component1 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return sizeScanIDAreaSize;
        }
        throw null;
    }

    @Override
    public int scanIDAreaTolerance() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iScanIDAreaTolerance = IDynamicsConfig.DefaultImpls.scanIDAreaTolerance(this);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return iScanIDAreaTolerance;
    }

    @Override
    public int scanIDMarkBackground() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iScanIDMarkBackground = IDynamicsConfig.DefaultImpls.scanIDMarkBackground(this);
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iScanIDMarkBackground;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
