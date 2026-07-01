package com.huawei.common;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.databinding.BannerViewLayoutBindingImpl;
import com.huawei.common.databinding.BasicCommonCheckboxBindingImpl;
import com.huawei.common.databinding.BasicHorizontalCardviewBindingImpl;
import com.huawei.common.databinding.BasicInputEditTextBindingArImpl;
import com.huawei.common.databinding.BasicInputEditTextBindingImpl;
import com.huawei.common.databinding.BasicSearchViewBindingImpl;
import com.huawei.common.databinding.BasicSingleRadiobuttonBindingImpl;
import com.huawei.common.databinding.BasicSwitchesviewBindingImpl;
import com.huawei.common.databinding.CommonDialogDatePickerBindingImpl;
import com.huawei.common.databinding.CommonItemCardviewBindingImpl;
import com.huawei.common.databinding.CommonItemDisplayBindingImpl;
import com.huawei.common.databinding.CommonLoadingButtonBindingImpl;
import com.huawei.common.databinding.CommonMarqueeViewBindingImpl;
import com.huawei.common.databinding.MenuViewBindingImpl;
import com.huawei.common.databinding.MultiLineInputViewBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final int ArtificialStackFrames = 12;
    private static final int ShareDataUIState = 3;
    private static final int component1 = 2;
    private static final SparseIntArray component2;
    private static final int component3 = 1;
    private static final int component4 = 8;
    private static final int copy = 9;
    private static final int copydefault = 4;
    private static final int equals = 7;
    private static final int getAsAtTimestamp = 5;
    private static final int getRequestBeneficiariesState = 6;
    private static final int getShareableDataState = 14;
    private static final int getSponsorBeneficiariesState = 10;
    private static final int hashCode = 13;
    private static final int toString = 11;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(14);
        component2 = sparseIntArray;
        sparseIntArray.put(R.layout.banner_view_layout, 1);
        sparseIntArray.put(R.layout.basic_common_checkbox, 2);
        sparseIntArray.put(R.layout.basic_horizontal_cardview, 3);
        sparseIntArray.put(R.layout.basic_input_edit_text, 4);
        sparseIntArray.put(R.layout.basic_search_view, 5);
        sparseIntArray.put(R.layout.basic_single_radiobutton, 6);
        sparseIntArray.put(R.layout.basic_switchesview, 7);
        sparseIntArray.put(R.layout.common_dialog_date_picker, 8);
        sparseIntArray.put(R.layout.common_item_cardview, 9);
        sparseIntArray.put(R.layout.common_item_display, 10);
        sparseIntArray.put(R.layout.common_loading_button, 11);
        sparseIntArray.put(R.layout.common_marquee_view, 12);
        sparseIntArray.put(R.layout.menu_view, 13);
        sparseIntArray.put(R.layout.multi_line_input_view, 14);
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = component2.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i2) {
            case 1:
                if ("layout/banner_view_layout_0".equals(tag)) {
                    return new BannerViewLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for banner_view_layout is invalid. Received: " + tag);
            case 2:
                if ("layout/basic_common_checkbox_0".equals(tag)) {
                    return new BasicCommonCheckboxBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for basic_common_checkbox is invalid. Received: " + tag);
            case 3:
                if ("layout/basic_horizontal_cardview_0".equals(tag)) {
                    return new BasicHorizontalCardviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for basic_horizontal_cardview is invalid. Received: " + tag);
            case 4:
                if ("layout-ar/basic_input_edit_text_0".equals(tag)) {
                    return new BasicInputEditTextBindingArImpl(dataBindingComponent, new View[]{view});
                }
                if ("layout/basic_input_edit_text_0".equals(tag)) {
                    return new BasicInputEditTextBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for basic_input_edit_text is invalid. Received: " + tag);
            case 5:
                if ("layout/basic_search_view_0".equals(tag)) {
                    return new BasicSearchViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for basic_search_view is invalid. Received: " + tag);
            case 6:
                if ("layout/basic_single_radiobutton_0".equals(tag)) {
                    return new BasicSingleRadiobuttonBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for basic_single_radiobutton is invalid. Received: " + tag);
            case 7:
                if ("layout/basic_switchesview_0".equals(tag)) {
                    return new BasicSwitchesviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for basic_switchesview is invalid. Received: " + tag);
            case 8:
                if ("layout/common_dialog_date_picker_0".equals(tag)) {
                    return new CommonDialogDatePickerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for common_dialog_date_picker is invalid. Received: " + tag);
            case 9:
                if ("layout/common_item_cardview_0".equals(tag)) {
                    return new CommonItemCardviewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for common_item_cardview is invalid. Received: " + tag);
            case 10:
                if ("layout/common_item_display_0".equals(tag)) {
                    return new CommonItemDisplayBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for common_item_display is invalid. Received: " + tag);
            case 11:
                if ("layout/common_loading_button_0".equals(tag)) {
                    return new CommonLoadingButtonBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for common_loading_button is invalid. Received: " + tag);
            case 12:
                if ("layout/common_marquee_view_0".equals(tag)) {
                    return new CommonMarqueeViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for common_marquee_view is invalid. Received: " + tag);
            case 13:
                if ("layout/menu_view_0".equals(tag)) {
                    return new MenuViewBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for menu_view is invalid. Received: " + tag);
            case 14:
                if ("layout/multi_line_input_view_0".equals(tag)) {
                    return new MultiLineInputViewBindingImpl(dataBindingComponent, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for multi_line_input_view is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr == null || viewArr.length == 0 || (i2 = component2.get(i)) <= 0) {
            return null;
        }
        Object tag = viewArr[0].getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 4) {
            if ("layout-ar/basic_input_edit_text_0".equals(tag)) {
                return new BasicInputEditTextBindingArImpl(dataBindingComponent, viewArr);
            }
            if ("layout/basic_input_edit_text_0".equals(tag)) {
                return new BasicInputEditTextBindingImpl(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for basic_input_edit_text is invalid. Received: " + tag);
        }
        if (i2 == 11) {
            if ("layout/common_loading_button_0".equals(tag)) {
                return new CommonLoadingButtonBindingImpl(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for common_loading_button is invalid. Received: " + tag);
        }
        if (i2 == 13) {
            if ("layout/menu_view_0".equals(tag)) {
                return new MenuViewBindingImpl(dataBindingComponent, viewArr);
            }
            throw new IllegalArgumentException("The tag for menu_view is invalid. Received: " + tag);
        }
        if (i2 != 14) {
            return null;
        }
        if ("layout/multi_line_input_view_0".equals(tag)) {
            return new MultiLineInputViewBindingImpl(dataBindingComponent, viewArr);
        }
        throw new IllegalArgumentException("The tag for multi_line_input_view is invalid. Received: " + tag);
    }

    @Override
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = component1.component3.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override
    public String convertBrIdToString(int i) {
        return ShareDataUIState.component1.get(i);
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    static class ShareDataUIState {
        static final SparseArray<String> component1;

        private ShareDataUIState() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            component1 = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    static class component1 {
        static final HashMap<String, Integer> component3;

        private component1() {
        }

        static {
            HashMap<String, Integer> map = new HashMap<>(15);
            component3 = map;
            map.put("layout/banner_view_layout_0", Integer.valueOf(R.layout.banner_view_layout));
            map.put("layout/basic_common_checkbox_0", Integer.valueOf(R.layout.basic_common_checkbox));
            map.put("layout/basic_horizontal_cardview_0", Integer.valueOf(R.layout.basic_horizontal_cardview));
            map.put("layout-ar/basic_input_edit_text_0", Integer.valueOf(R.layout.basic_input_edit_text));
            map.put("layout/basic_input_edit_text_0", Integer.valueOf(R.layout.basic_input_edit_text));
            map.put("layout/basic_search_view_0", Integer.valueOf(R.layout.basic_search_view));
            map.put("layout/basic_single_radiobutton_0", Integer.valueOf(R.layout.basic_single_radiobutton));
            map.put("layout/basic_switchesview_0", Integer.valueOf(R.layout.basic_switchesview));
            map.put("layout/common_dialog_date_picker_0", Integer.valueOf(R.layout.common_dialog_date_picker));
            map.put("layout/common_item_cardview_0", Integer.valueOf(R.layout.common_item_cardview));
            map.put("layout/common_item_display_0", Integer.valueOf(R.layout.common_item_display));
            map.put("layout/common_loading_button_0", Integer.valueOf(R.layout.common_loading_button));
            map.put("layout/common_marquee_view_0", Integer.valueOf(R.layout.common_marquee_view));
            map.put("layout/menu_view_0", Integer.valueOf(R.layout.menu_view));
            map.put("layout/multi_line_input_view_0", Integer.valueOf(R.layout.multi_line_input_view));
        }
    }
}
