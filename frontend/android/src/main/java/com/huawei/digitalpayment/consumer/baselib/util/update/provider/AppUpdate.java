package com.huawei.digitalpayment.consumer.baselib.util.update.provider;

import com.huawei.digitalpayment.consumer.baselib.R;
import java.io.Serializable;

public class AppUpdate implements Serializable {
    private static int component1 = 0;
    private static int component3 = 1;
    private static final long serialVersionUID = 2642156880186458973L;
    private int forceUpdate;
    private boolean needUpdate;
    private String newVersionCode;
    private int updateCancelText;
    private String updateInfo;
    private int updateResourceId;
    private int updateTitle;

    public int getForceUpdate() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.forceUpdate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setForceUpdate(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 81;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.forceUpdate = i;
        int i6 = i4 + 125;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 23 / 0;
        }
    }

    public String getNewVersionCode() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.newVersionCode;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public void setNewVersionCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.newVersionCode = str;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public int getUpdateTitle() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 75;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 != 0) {
            i = this.updateTitle;
            int i5 = 20 / 0;
        } else {
            i = this.updateTitle;
        }
        int i6 = i4 + 55;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public void setUpdateTitle(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 121;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.updateTitle = i;
        int i6 = i4 + 87;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getUpdateInfo() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updateInfo;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setUpdateInfo(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.updateInfo = str;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getUpdateCancelText() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.updateCancelText;
        }
        throw null;
    }

    public void setUpdateCancelText(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.updateCancelText = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public int getUpdateResourceId() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.updateResourceId;
        if (i3 != 0) {
            int i5 = 82 / 0;
        }
        return i4;
    }

    public void setUpdateResourceId(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 45;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.updateResourceId = i;
        int i6 = i4 + 89;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isNeedUpdate() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.needUpdate;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return z;
    }

    public void setNeedUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.needUpdate = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AppUpdate(Builder builder) {
        this.forceUpdate = Builder.component2(builder);
        this.updateInfo = Builder.copydefault(builder);
        this.newVersionCode = Builder.component3(builder);
        this.updateTitle = Builder.ShareDataUIState(builder);
        this.updateCancelText = Builder.component1(builder);
    }

    AppUpdate(Builder builder, AppUpdateIA appUpdateIA) {
        this(builder);
    }

    public static class Builder {
        private static int copy = 0;
        private static int getRequestBeneficiariesState = 1;
        private String ShareDataUIState;
        private String component2;
        private int component3;
        private int copydefault = 0;
        private int component1 = R.string.about_app_update_button1;

        public Builder forceUpdate(int i) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState + 55;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            this.copydefault = i;
            int i6 = i4 + 35;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public Builder newVersionCode(String str) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 101;
            copy = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            this.component2 = str;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 9;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public Builder updateTitle(int i) {
            int i2 = 2 % 2;
            int i3 = copy + 49;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            int i5 = i3 % 2;
            this.component3 = i;
            int i6 = i4 + 37;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder updateInfo(String str) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 69;
            copy = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = str;
            if (i3 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public AppUpdate build() {
            int i = 2 % 2;
            AppUpdate appUpdate = new AppUpdate(this, null);
            int i2 = copy + 39;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return appUpdate;
        }

        static int component2(Builder builder) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 43;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = builder.copydefault;
            if (i3 != 0) {
                int i5 = 90 / 0;
            }
            return i4;
        }

        static String component3(Builder builder) {
            int i = 2 % 2;
            int i2 = copy + 85;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = builder.component2;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 59;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return str;
        }

        static int component1(Builder builder) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 7;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.component1;
            int i6 = i2 + 19;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 99 / 0;
            }
            return i5;
        }

        static String copydefault(Builder builder) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 23;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            Object obj = null;
            String str = builder.ShareDataUIState;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 77;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static int ShareDataUIState(Builder builder) {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 53;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.component3;
            int i6 = i2 + 113;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
