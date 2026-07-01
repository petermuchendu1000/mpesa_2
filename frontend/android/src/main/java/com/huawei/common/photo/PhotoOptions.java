package com.huawei.common.photo;

public class PhotoOptions {
    public static final int CAMERA_TYPE_BACK = 0;
    public static final int CAMERA_TYPE_DEFAULT = -1;
    public static final int CAMERA_TYPE_FRONT = 0;
    private final boolean ShareDataUIState;
    private int component1;
    private int component2;
    private int component3;
    private final boolean component4;
    private final boolean copydefault;
    private int equals;
    private int getRequestBeneficiariesState;

    private PhotoOptions(Builder builder) {
        this.component3 = -1;
        this.ShareDataUIState = builder.ShareDataUIState;
        this.component2 = builder.component3;
        this.component1 = builder.component1;
        this.getRequestBeneficiariesState = builder.equals;
        this.equals = builder.getAsAtTimestamp;
        this.component4 = builder.component4;
        this.copydefault = builder.copydefault;
        this.component3 = builder.component2;
        int i = this.component2;
        if (i <= 0 || i <= 0) {
            this.component2 = 1;
            this.component1 = 1;
        }
        if (this.getRequestBeneficiariesState <= 0 || this.equals <= 0) {
            this.getRequestBeneficiariesState = 500;
            this.equals = 500;
        }
    }

    public boolean isCrop() {
        return this.ShareDataUIState;
    }

    public int getAspectX() {
        return this.component2;
    }

    public int getAspectY() {
        return this.component1;
    }

    public int getOutputX() {
        return this.getRequestBeneficiariesState;
    }

    public int getOutputY() {
        return this.equals;
    }

    public boolean isScale() {
        return this.component4;
    }

    public boolean isCircleDimmedLayer() {
        return this.copydefault;
    }

    public int getCameraType() {
        return this.component3;
    }

    public static class Builder {
        private boolean ShareDataUIState = true;
        private int component3 = 1;
        private int component1 = 1;
        private int equals = 500;
        private int getAsAtTimestamp = 500;
        private boolean component4 = true;
        private boolean copydefault = true;
        private int component2 = -1;

        public boolean isCrop() {
            return this.ShareDataUIState;
        }

        public Builder setCrop(boolean z) {
            this.ShareDataUIState = z;
            return this;
        }

        public int getAspectX() {
            return this.component3;
        }

        public Builder setAspectX(int i) {
            this.component3 = i;
            return this;
        }

        public int getAspectY() {
            return this.component1;
        }

        public Builder setAspectY(int i) {
            this.component1 = i;
            return this;
        }

        public int getOutputX() {
            return this.equals;
        }

        public Builder setOutputX(int i) {
            this.equals = i;
            return this;
        }

        public int getOutputY() {
            return this.getAsAtTimestamp;
        }

        public Builder setOutputY(int i) {
            this.getAsAtTimestamp = i;
            return this;
        }

        public boolean getScale() {
            return this.component4;
        }

        public Builder setScale(boolean z) {
            this.component4 = z;
            return this;
        }

        public boolean isCircleDimmedLayer() {
            return this.copydefault;
        }

        public Builder setCircleDimmedLayer(boolean z) {
            this.copydefault = z;
            return this;
        }

        public Builder setCameraType(int i) {
            this.component2 = i;
            return this;
        }

        public int getCameraType() {
            return this.component2;
        }

        public PhotoOptions build() {
            return new PhotoOptions(this);
        }
    }
}
