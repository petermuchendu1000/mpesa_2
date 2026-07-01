package com.huawei.digitalpayment.consumer.basicUi.util;

import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.basicUi.constants.BasicUiConstants;
import com.huawei.digitalpayment.consumer.basicUi.model.OpenPageConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/util/BasicUiModuleHelper;", "", "<init>", "()V", BasicUiConstants.KEY_OPEN_PAGE_CONFIG, "Lcom/huawei/digitalpayment/consumer/basicUi/model/OpenPageConfig;", "updateOpenPageConfig", "", "", "updateShareAppMSG", BasicUiConstants.KEY_SHARE_APP_MSG, "getOpenPageConfig", "refreshMutiLanguageConfig", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BasicUiModuleHelper {
    public static final BasicUiModuleHelper INSTANCE = new BasicUiModuleHelper();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static OpenPageConfig copydefault;

    private BasicUiModuleHelper() {
    }

    public final void updateOpenPageConfig(String openPageConfig) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = openPageConfig;
        if (str != null && str.length() != 0) {
            try {
                copydefault = (OpenPageConfig) SecureGsonUtils.fromJson(openPageConfig, OpenPageConfig.class);
            } catch (Exception unused) {
            }
        }
        int i3 = component2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void updateShareAppMSG(String shareAppMSG) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance(BasicUiConstants.SP_NAME).put(BasicUiConstants.KEY_SHARE_APP_MSG, shareAppMSG);
        int i4 = ShareDataUIState + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OpenPageConfig getOpenPageConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            OpenPageConfig openPageConfig = copydefault;
            if (openPageConfig != null) {
                Intrinsics.checkNotNull(openPageConfig);
                String imgUrl = openPageConfig.getImgUrl();
                if (imgUrl != null && imgUrl.length() != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    OpenPageConfig openPageConfig2 = copydefault;
                    Intrinsics.checkNotNull(openPageConfig2);
                    if (jCurrentTimeMillis < openPageConfig2.getExpireTime()) {
                        int i3 = ShareDataUIState + 59;
                        int i4 = i3 % 128;
                        component2 = i4;
                        int i5 = i3 % 2;
                        OpenPageConfig openPageConfig3 = copydefault;
                        int i6 = i4 + 41;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        return openPageConfig3;
                    }
                }
            }
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 73;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(message = "合并 basicConfig 请求，实现已为空")
    public final void refreshMutiLanguageConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }
}
