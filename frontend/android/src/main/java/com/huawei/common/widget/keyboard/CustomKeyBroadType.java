package com.huawei.common.widget.keyboard;

import androidx.core.content.ContextCompat;
import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;
import java.util.ArrayList;
import java.util.List;

public class CustomKeyBroadType {
    private List<KeyBroadItemEntry> ShareDataUIState;
    private final int copydefault;

    public CustomKeyBroadType(int i, List<KeyBroadItemEntry> list) {
        this.copydefault = i;
        this.ShareDataUIState = list;
    }

    public void setKeyBroadItemEntries(List<KeyBroadItemEntry> list) {
        this.ShareDataUIState = list;
    }

    public static CustomKeyBroadType getDIGITAL_OK_KEY_BROAD() {
        return new CustomKeyBroadType(4, getDigitalKeyboardConfig(Utils.getApp().getString(R.string.common_ok)));
    }

    public static CustomKeyBroadType getDIGITAL_PAY_KEY_BROAD() {
        return new CustomKeyBroadType(4, getDigitalKeyboardConfig(Utils.getApp().getString(R.string.pay)));
    }

    public static CustomKeyBroadType getDIGITAL_TRANSFER_KEY_BROAD() {
        return new CustomKeyBroadType(4, getDigitalKeyboardConfig(Utils.getApp().getString(R.string.transfer)));
    }

    public static CustomKeyBroadType getDIGITAL_FINISH_KEY_BROAD() {
        return new CustomKeyBroadType(4, getDigitalKeyboardConfig(Utils.getApp().getString(R.string.finish)));
    }

    public static CustomKeyBroadType getPIN_KEY_BROAD() {
        return new CustomKeyBroadType(3, component2());
    }

    public List<KeyBroadItemEntry> getKeyBroadItemEntries() {
        return this.ShareDataUIState;
    }

    public int getSpanCount() {
        return this.copydefault;
    }

    public static List<KeyBroadItemEntry> getDigitalKeyboardConfig(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyBroadItemEntry(0, "1", 8));
        arrayList.add(new KeyBroadItemEntry(0, "2", 9));
        arrayList.add(new KeyBroadItemEntry(0, "3", 10));
        arrayList.add(new KeyBroadItemEntry(1, String.valueOf(R.mipmap.common_keyboard_icon_delete), 67));
        arrayList.add(new KeyBroadItemEntry(0, "4", 11));
        arrayList.add(new KeyBroadItemEntry(0, "5", 12));
        arrayList.add(new KeyBroadItemEntry(0, "6", 13));
        arrayList.add(new KeyBroadItemEntry(2, str, 66, 1, 3, ContextCompat.getColor(Utils.getApp(), R.color.common_colorPrimary), ColorUtils.getColor(R.color.colorSecondLevelBorder)));
        arrayList.add(new KeyBroadItemEntry(0, "7", 14));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_AUTH_FAIL, 15));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_OFFLINE_APP, 16));
        arrayList.add(new KeyBroadItemEntry(0, "0", 7, 2, 1));
        arrayList.add(new KeyBroadItemEntry(4, " ", 0));
        arrayList.add(new KeyBroadItemEntry(0, ".", 158));
        return arrayList;
    }

    private static List<KeyBroadItemEntry> component2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyBroadItemEntry(0, "1", 8));
        arrayList.add(new KeyBroadItemEntry(0, "2", 9));
        arrayList.add(new KeyBroadItemEntry(0, "3", 10));
        arrayList.add(new KeyBroadItemEntry(0, "4", 11));
        arrayList.add(new KeyBroadItemEntry(0, "5", 12));
        arrayList.add(new KeyBroadItemEntry(0, "6", 13));
        arrayList.add(new KeyBroadItemEntry(0, "7", 14));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_AUTH_FAIL, 15));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_OFFLINE_APP, 16));
        arrayList.add(new KeyBroadItemEntry(4, " ", 0));
        arrayList.add(new KeyBroadItemEntry(0, "0", 7));
        arrayList.add(new KeyBroadItemEntry(1, String.valueOf(R.mipmap.common_keyboard_icon_delete), 67));
        return arrayList;
    }

    public static CustomKeyBroadPop getNoPointDigitalKeyboardPop(String str) {
        return new CustomKeyBroadPop(Utils.getApp(), new CustomKeyBroadType(4, getNoPointDigitalKeyboardConfig(str)));
    }

    public static List<KeyBroadItemEntry> getNoPointDigitalKeyboardConfig(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyBroadItemEntry(0, "1", 8));
        arrayList.add(new KeyBroadItemEntry(0, "2", 9));
        arrayList.add(new KeyBroadItemEntry(0, "3", 10));
        arrayList.add(new KeyBroadItemEntry(1, String.valueOf(R.mipmap.common_keyboard_icon_delete), 67));
        arrayList.add(new KeyBroadItemEntry(0, "4", 11));
        arrayList.add(new KeyBroadItemEntry(0, "5", 12));
        arrayList.add(new KeyBroadItemEntry(0, "6", 13));
        arrayList.add(new KeyBroadItemEntry(2, str, 66, 1, 3, ContextCompat.getColor(Utils.getApp(), R.color.common_colorPrimary), ColorUtils.getColor(R.color.colorSecondLevelBorder)));
        arrayList.add(new KeyBroadItemEntry(0, "7", 14));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_AUTH_FAIL, 15));
        arrayList.add(new KeyBroadItemEntry(0, PrepareException.ERROR_OFFLINE_APP, 16));
        arrayList.add(new KeyBroadItemEntry(0, "0", 7, 3, 1));
        arrayList.add(new KeyBroadItemEntry(4, " ", 0));
        return arrayList;
    }
}
