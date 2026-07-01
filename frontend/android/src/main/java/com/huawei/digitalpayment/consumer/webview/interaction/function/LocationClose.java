package com.huawei.digitalpayment.consumer.webview.interaction.function;

import androidx.lifecycle.ViewModelProvider;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.factory.LocationViewModelFactory;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import com.huawei.digitalpayment.consumer.webview.viewmodel.LocationViewModel;
import org.json.JSONObject;

public class LocationClose extends JavascriptFunction {
    private static int component3 = 1;
    private static int copydefault;
    private LocationViewModel ShareDataUIState;

    @Override
    public void init(InteractionView interactionView) {
        int i = 2 % 2;
        super.init(interactionView);
        this.ShareDataUIState = (LocationViewModel) new ViewModelProvider(interactionView.getHostActivity(), new LocationViewModelFactory(interactionView)).get(LocationViewModel.class);
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return WebViewConstants.JS_FUN_CLOSE_LOCATION;
        }
        throw null;
    }

    @Override
    public void execute(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.ShareDataUIState.closeLocation();
            int i3 = 57 / 0;
        } else {
            this.ShareDataUIState.closeLocation();
        }
        int i4 = copydefault + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
