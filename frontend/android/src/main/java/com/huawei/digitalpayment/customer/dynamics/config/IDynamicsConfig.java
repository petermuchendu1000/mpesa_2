package com.huawei.digitalpayment.customer.dynamics.config;

import android.util.Size;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.customer.dynamics.R;
import com.huawei.digitalpayment.customer.dynamics.util.checker.AlignmentChecker;
import com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/config/IDynamicsConfig;", "", KeysConstants.KEY_ENABLE_SCAN_ID, "", "scanIDAreaSize", "Landroid/util/Size;", "scanIDAreaRoundCorner", "", "scanIDAreaBorderWidth", "scanIDAreaBorderColor", "scanIDMarkBackground", "scanIDAreaTolerance", "scanIDAlignmentChecker", "Lcom/huawei/digitalpayment/customer/dynamics/util/checker/AlignmentChecker;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IDynamicsConfig {
    boolean enableScanID();

    AlignmentChecker scanIDAlignmentChecker();

    int scanIDAreaBorderColor();

    int scanIDAreaBorderWidth();

    int scanIDAreaRoundCorner();

    Size scanIDAreaSize();

    int scanIDAreaTolerance();

    int scanIDMarkBackground();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static boolean enableScanID(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            try {
                boolean zOptBoolean = new JSONObject(SPUtils.getInstance(AppConfigManager.SP_APP).getString(SPConstant.KEY_SWITCH_PARAMETER_CONFIG)).optBoolean(KeysConstants.KEY_ENABLE_SCAN_ID, true);
                int i2 = component2 + 49;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 72 / 0;
                }
                return zOptBoolean;
            } catch (JSONException unused) {
                return true;
            }
        }

        public static Size scanIDAreaSize(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            Size size = new Size(SizeUtils.dp2px(312.0f), SizeUtils.dp2px(200.0f));
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 0 / 0;
            }
            return size;
        }

        public static int scanIDAreaRoundCorner(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iDp2px = SizeUtils.dp2px(8.0f);
            int i4 = copydefault + 49;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return iDp2px;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int scanIDAreaBorderWidth(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            int i2 = component2 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iDp2px = SizeUtils.dp2px(2.0f);
            int i4 = component2 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return iDp2px;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int scanIDAreaBorderColor(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int color = ColorUtils.getColor(R.color.common_colorWhite);
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return color;
        }

        public static int scanIDMarkBackground(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            int i2 = component2 + 71;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return ColorUtils.setAlphaComponent(ColorUtils.getColor(R.color.common_colorBlack), 0.5f);
            }
            ColorUtils.setAlphaComponent(ColorUtils.getColor(R.color.common_colorBlack), 0.5f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static AlignmentChecker scanIDAlignmentChecker(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            EdgeAlignmentChecker edgeAlignmentChecker = new EdgeAlignmentChecker(100, 0.2f, 0.4f, 200, 3);
            int i2 = component2 + 53;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return edgeAlignmentChecker;
            }
            throw null;
        }

        public static int scanIDAreaTolerance(IDynamicsConfig iDynamicsConfig) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 121;
            copydefault = i3 % 128;
            int i4 = i3 % 2 == 0 ? 56 : 60;
            int i5 = i2 + 103;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }
    }
}
