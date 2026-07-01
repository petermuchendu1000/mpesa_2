package com.huawei.common.widget.date;

import android.graphics.Typeface;
import com.huawei.common.widget.date.WheelPicker;
import java.util.List;

public interface IWheelPicker {
    int getCurtainColor();

    List getData();

    int getIndicatColor();

    int getIndicatorSize();

    int getItemAlign();

    int getItemCurrentPosition();

    int getItemSelectedPosition();

    int getItemSpace();

    int getItemTextColor();

    int getItemTextSize();

    int getItemVisibleCount();

    String getMaximumWidthText();

    int getMaximumWidthTextPosition();

    int getSelectedItemTextColor();

    Typeface getTypeface();

    boolean hasAtmospheric();

    boolean hasCurtain();

    boolean isCurved();

    boolean isCycle();

    boolean isIndicator();

    boolean isSameWidth();

    void setAtmospheric(boolean z);

    void setCurtain(boolean z);

    void setCurtainColor(int i);

    void setCurved(boolean z);

    void setCycle(boolean z);

    void setData(List list);

    void setIndicColor(int i);

    void setIndicator(boolean z);

    void setIndicatorSize(int i);

    void setItemAlign(int i);

    void setItemSelectedPosition(int i);

    void setItemSpace(int i);

    void setItemTextColor(int i);

    void setItemTextSize(int i);

    void setItemVisibleCount(int i);

    void setMaximumWidthText(String str);

    void setMaximumWidthTextPosition(int i);

    void setOnItemSelectedListener(WheelPicker.OnItemSelectedListener onItemSelectedListener);

    void setOnWheelChangeListener(WheelPicker.OnWheelChangeListener onWheelChangeListener);

    void setSameWidth(boolean z);

    void setSelectedItemTextColor(int i);

    void setTypeface(Typeface typeface);
}
