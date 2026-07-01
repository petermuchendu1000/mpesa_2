package com.huawei.payment.lib.image.crop;

import com.huawei.payment.lib.image.crop.CropFragment;

public interface CropFragmentListener {
    void onCropFinish(CropFragment.UCropResult uCropResult);

    void onCropLoading(boolean z);
}
