package com.huawei.digitalpayment.pwa.cache;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

public class IntentManager {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private Map<String, Intent> copydefault = new HashMap();

    public static IntentManager get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState.component2();
        }
        ShareDataUIState.component2();
        throw null;
    }

    public Map<String, Intent> getCacheIntent() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Map<String, Intent> map = this.copydefault;
        int i4 = i3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public void saveIntent(String str, Intent intent) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (this.copydefault == null) {
                this.copydefault = new HashMap();
            }
            if (this.copydefault.size() > 0) {
                int i3 = component2 + 89;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    this.copydefault.clear();
                } else {
                    this.copydefault.clear();
                    obj.hashCode();
                    throw null;
                }
            }
            this.copydefault.put(str, intent);
            return;
        }
        throw null;
    }

    public void deleteIntent(String str) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Map<String, Intent> map = this.copydefault;
        if (map != null) {
            int i5 = i3 + 117;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            map.remove(str);
        }
    }

    public void deleteAll() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Intent> map = this.copydefault;
        if (map != null) {
            map.clear();
            return;
        }
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
    }

    static class ShareDataUIState {
        private static int ShareDataUIState = 0;
        private static final IntentManager component1 = new IntentManager();
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        ShareDataUIState() {
        }

        static {
            int i = component2 + 43;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        static IntentManager component2() {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            IntentManager intentManager = component1;
            int i5 = i3 + 71;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return intentManager;
            }
            throw null;
        }
    }
}
