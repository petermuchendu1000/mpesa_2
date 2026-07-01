package com.huawei.digitalpayment.consumer.webview.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import com.huawei.digitalpayment.consumer.webview.viewmodel.LocationViewModel;

public class LocationViewModelFactory implements ViewModelProvider.Factory {
    private static int ShareDataUIState = 1;
    private static int component3;
    private InteractionView component1;

    public LocationViewModelFactory(InteractionView interactionView) {
        this.component1 = interactionView;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> cls) {
        int i = 2 % 2;
        LocationViewModel locationViewModel = new LocationViewModel(this.component1);
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return locationViewModel;
        }
        throw null;
    }
}
