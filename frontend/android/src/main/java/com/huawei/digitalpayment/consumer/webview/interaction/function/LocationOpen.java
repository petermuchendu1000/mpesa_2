package com.huawei.digitalpayment.consumer.webview.interaction.function;

import android.text.TextUtils;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.digitalpayment.consumer.webview.factory.LocationViewModelFactory;
import com.huawei.digitalpayment.consumer.webview.interaction.InteractionView;
import com.huawei.digitalpayment.consumer.webview.interaction.JavascriptFunction;
import com.huawei.digitalpayment.consumer.webview.viewmodel.LocationViewModel;
import org.json.JSONObject;

public class LocationOpen extends JavascriptFunction {
    private static int component1 = 0;
    private static int copydefault = 1;
    private LocationViewModel ShareDataUIState;

    @Override
    public void init(InteractionView interactionView) {
        int i = 2 % 2;
        super.init(interactionView);
        this.ShareDataUIState = (LocationViewModel) new ViewModelProvider(interactionView.getHostActivity(), new LocationViewModelFactory(interactionView)).get(LocationViewModel.class);
        int i2 = copydefault + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return WebViewConstants.JS_FUN_OPEN_LOCATION;
    }

    @Override
    public void execute(final JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.callbackFuncName)) {
            requestPermission(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, new JavascriptFunction.OnRequestPermissionResult() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public final void requestPermissionResult(boolean z) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 81;
                    component3 = i5 % 128;
                    Object obj = null;
                    if (i5 % 2 == 0) {
                        LocationOpen.$r8$lambda$L_u9NEvAacKes4oTfY1XH7mnH40(this.f$0, jSONObject, z);
                        obj.hashCode();
                        throw null;
                    }
                    LocationOpen.$r8$lambda$L_u9NEvAacKes4oTfY1XH7mnH40(this.f$0, jSONObject, z);
                    int i6 = component3 + 61;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            });
            return;
        }
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void copydefault(JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.ShareDataUIState.openLocation(this.callbackFuncName, jSONObject);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.ShareDataUIState.openLocation(this.callbackFuncName, jSONObject);
        int i3 = copydefault + 37;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.ShareDataUIState.destroy();
            int i3 = 70 / 0;
        } else {
            this.ShareDataUIState.destroy();
        }
        int i4 = component1 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$L_u9NEvAacKes4oTfY1XH7mnH40(LocationOpen locationOpen, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        locationOpen.copydefault(jSONObject, z);
        int i4 = component1 + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
