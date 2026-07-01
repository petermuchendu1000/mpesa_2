package com.huawei.common.widget.keyboard;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.databinding.CommonPopCustomKeyBroadBinding;
import com.huawei.common.util.L;
import com.huawei.common.util.ShuffleArrayUtils;
import java.util.List;
import java.util.Map;

public class CustomKeyBroadPop extends PopupWindow {
    private static final double component1 = 0.56d;
    private OnKeyListener ArtificialStackFrames;
    private CustomKeyBroadType ShareDataUIState;
    protected CommonPopCustomKeyBroadBinding binding;
    private KeyBroadAdapter component2;
    private int component3;
    private boolean component4;
    private boolean copy;
    private FragmentActivity copydefault;
    private boolean equals;
    private boolean getAsAtTimestamp;
    private EditText getRequestBeneficiariesState;
    private LayoutInflater getShareableDataState;
    private OnPopShowListener getSponsorBeneficiariesState;
    private int hashCode;

    public interface OnPopShowListener {
        void onPopShowChanged(boolean z);
    }

    public int getPadding() {
        return 0;
    }

    public void setOnPopShowListener(OnPopShowListener onPopShowListener) {
        this.getSponsorBeneficiariesState = onPopShowListener;
    }

    public CustomKeyBroadPop(Context context, CustomKeyBroadType customKeyBroadType) {
        super(-1, -2);
        component1(context, customKeyBroadType);
    }

    public void setShuffleKeyboard(boolean z) {
        this.equals = z;
    }

    public void setShuffleKeyboardEveryTime(boolean z) {
        this.copy = z;
    }

    public void setKeyListener(OnKeyListener onKeyListener) {
        this.ArtificialStackFrames = onKeyListener;
    }

    public int getKeyBroadHeight() {
        return this.binding.getRoot().getHeight();
    }

    public void attachToEditText(FragmentActivity fragmentActivity, EditText editText) {
        attachToEditText(fragmentActivity, editText, true);
    }

    public void attachToEditText(FragmentActivity fragmentActivity, final EditText editText, boolean z) {
        this.copydefault = fragmentActivity;
        this.getRequestBeneficiariesState = editText;
        final View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        viewFindViewById.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.ShareDataUIState(viewFindViewById);
            }
        });
        KeyBroadUtils.disableInput(fragmentActivity, editText);
        KeyboardUtils.hideSoftInput(editText);
        editText.requestFocus();
        editText.setFocusableInTouchMode(true);
        if (z) {
            editText.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.show();
                }
            });
        }
        editText.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.component2(editText, view, motionEvent);
            }
        });
    }

    public void ShareDataUIState(View view) {
        this.component3 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public boolean component2(EditText editText, View view, MotionEvent motionEvent) {
        L.d("TAG", "attachToEditText: setOnTouchListener");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.getRequestBeneficiariesState = editText;
        KeyboardUtils.hideSoftInput(view);
        editText.requestFocus();
        editText.setFocusableInTouchMode(true);
        show();
        return false;
    }

    public void attach(FragmentActivity fragmentActivity, EditText editText) {
        this.copydefault = fragmentActivity;
        this.getRequestBeneficiariesState = editText;
        final View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        viewFindViewById.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.component1(viewFindViewById);
            }
        });
    }

    public void component1(View view) {
        this.component3 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public void setFinishEnable(boolean z) {
        this.component4 = z;
        KeyBroadAdapter keyBroadAdapter = this.component2;
        if (keyBroadAdapter != null) {
            keyBroadAdapter.setFinishEnable(z);
        }
    }

    public Map<Integer, Integer> getItemLayouts() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(0, Integer.valueOf(com.huawei.common.R.layout.common_keyboard_item_text));
        arrayMap.put(1, Integer.valueOf(com.huawei.common.R.layout.common_keyboard_item_image));
        arrayMap.put(2, Integer.valueOf(com.huawei.common.R.layout.common_keyboard_item_text));
        arrayMap.put(4, Integer.valueOf(com.huawei.common.R.layout.common_keyboard_item_empty));
        return arrayMap;
    }

    private void component1(Context context, CustomKeyBroadType customKeyBroadType) {
        int spanCount = customKeyBroadType.getSpanCount();
        setAnimationStyle(com.huawei.common.R.style.BottomAnimation);
        this.getShareableDataState = LayoutInflater.from(context);
        if (context instanceof Activity) {
            this.getShareableDataState = ((Activity) context).getLayoutInflater();
        }
        CommonPopCustomKeyBroadBinding commonPopCustomKeyBroadBindingInflate = CommonPopCustomKeyBroadBinding.inflate(this.getShareableDataState);
        this.binding = commonPopCustomKeyBroadBindingInflate;
        setContentView(commonPopCustomKeyBroadBindingInflate.getRoot());
        this.binding.ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CustomKeyBroadPop.ShareDataUIState(this.f$0, view);
            }
        });
        this.binding.rvRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(spanCount, 1));
        this.ShareDataUIState = customKeyBroadType;
    }

    private void component2(View view) {
        hide();
    }

    private void ShareDataUIState(List<KeyBroadItemEntry> list, int i) {
        KeyBroadItemEntry keyBroadItemEntry = list.get(i);
        int keyCode = keyBroadItemEntry.getKeyCode();
        if (keyCode != -1) {
            ShareDataUIState(keyBroadItemEntry, keyCode);
        }
    }

    private void ShareDataUIState(KeyBroadItemEntry keyBroadItemEntry, int i) {
        if (i == 66) {
            OnKeyListener onKeyListener = this.ArtificialStackFrames;
            if (onKeyListener != null) {
                onKeyListener.dispatchKeyEvent(new KeyEvent(0, 66));
                return;
            }
            return;
        }
        if (this.getRequestBeneficiariesState.isEnabled() && this.getRequestBeneficiariesState.hasFocus()) {
            Editable text = this.getRequestBeneficiariesState.getText();
            int selectionStart = this.getRequestBeneficiariesState.getSelectionStart();
            if (i == 67) {
                if (text == null || text.length() <= 0 || selectionStart <= 0) {
                    return;
                }
                text.delete(selectionStart - 1, selectionStart);
                return;
            }
            text.insert(selectionStart, keyBroadItemEntry.getValue());
        }
    }

    public void show() {
        show(this.copydefault);
    }

    public void show(FragmentActivity fragmentActivity) {
        if (isShowing()) {
            return;
        }
        if (this.equals && (!this.getAsAtTimestamp || this.copy)) {
            CustomKeyBroadType customKeyBroadType = this.ShareDataUIState;
            customKeyBroadType.setKeyBroadItemEntries(ShuffleArrayUtils.shuffleList(customKeyBroadType.getKeyBroadItemEntries()));
            this.getAsAtTimestamp = true;
        }
        final List<KeyBroadItemEntry> keyBroadItemEntries = this.ShareDataUIState.getKeyBroadItemEntries();
        KeyBroadAdapter keyBroadAdapter = new KeyBroadAdapter(this.ShareDataUIState.getSpanCount(), keyBroadItemEntries);
        this.component2 = keyBroadAdapter;
        keyBroadAdapter.setFinishEnable(this.component4);
        this.binding.rvRecyclerView.setAdapter(this.component2);
        this.component2.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.f$0.component3(keyBroadItemEntries, baseQuickAdapter, view, i);
            }
        });
        showAtLocation(fragmentActivity.findViewById(R.id.content), 80, 0, 0);
        OnPopShowListener onPopShowListener = this.getSponsorBeneficiariesState;
        if (onPopShowListener != null) {
            onPopShowListener.onPopShowChanged(true);
        }
        if (this.hashCode == 0) {
            this.binding.getRoot().post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.component3();
                }
            });
        } else {
            ShareDataUIState(true);
        }
    }

    public void component3(List list, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ShareDataUIState((List<KeyBroadItemEntry>) list, i);
    }

    public void component3() {
        this.hashCode = this.binding.getRoot().getHeight();
        ShareDataUIState(true);
    }

    public void hide() {
        dismiss();
    }

    private void ShareDataUIState(boolean z) {
        View viewFindViewById = this.copydefault.findViewById(R.id.content);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
        if (z) {
            marginLayoutParams.bottomMargin = this.component3 + this.hashCode;
        } else {
            marginLayoutParams.bottomMargin = this.component3;
        }
        viewFindViewById.setLayoutParams(marginLayoutParams);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        EditText editText = this.getRequestBeneficiariesState;
        if (editText != null) {
            editText.clearFocus();
        }
        ShareDataUIState(false);
        OnPopShowListener onPopShowListener = this.getSponsorBeneficiariesState;
        if (onPopShowListener != null) {
            onPopShowListener.onPopShowChanged(false);
        }
    }

    public class KeyBroadAdapter extends BaseMultiItemQuickAdapter<KeyBroadItemEntry, BaseViewHolder> {
        private int component1;
        private boolean component2;
        private int component3;
        private final int component4;
        private View copydefault;

        public KeyBroadAdapter(int i, List<KeyBroadItemEntry> list) {
            super(list);
            this.component4 = i;
            Map<Integer, Integer> itemLayouts = CustomKeyBroadPop.this.getItemLayouts();
            for (Map.Entry<Integer, Integer> entry : itemLayouts.entrySet()) {
                Integer num = itemLayouts.get(entry.getKey());
                if (num != null) {
                    addItemType(entry.getKey().intValue(), num.intValue());
                }
            }
        }

        @Override
        public BaseViewHolder createBaseViewHolder(ViewGroup viewGroup, int i) {
            return super.createBaseViewHolder(CustomKeyBroadPop.this.getShareableDataState.inflate(i, viewGroup, false));
        }

        @Override
        public void convert(BaseViewHolder baseViewHolder, KeyBroadItemEntry keyBroadItemEntry) {
            component1();
            CustomKeyBroadPop.setViewLayoutRatio(baseViewHolder.itemView, this.component1 * keyBroadItemEntry.getWidthWeight(), this.component3 * keyBroadItemEntry.getHeightWeight());
            baseViewHolder.setBackgroundColor(com.huawei.common.R.id.tv_content, keyBroadItemEntry.getBgColor());
            int itemType = keyBroadItemEntry.getItemType();
            if (itemType == 0) {
                baseViewHolder.setText(com.huawei.common.R.id.tv_content, keyBroadItemEntry.getValue());
                baseViewHolder.setTextColor(com.huawei.common.R.id.tv_content, keyBroadItemEntry.getTextColor());
                return;
            }
            if (itemType == 1) {
                baseViewHolder.setImageResource(com.huawei.common.R.id.tv_content, Integer.parseInt(keyBroadItemEntry.getValue()));
                return;
            }
            if (itemType != 2) {
                if (itemType != 4) {
                    return;
                }
                baseViewHolder.itemView.setVisibility(8);
            } else {
                baseViewHolder.setText(com.huawei.common.R.id.tv_content, keyBroadItemEntry.getValue());
                baseViewHolder.setTextColor(com.huawei.common.R.id.tv_content, keyBroadItemEntry.getTextColor());
                this.copydefault = baseViewHolder.itemView;
                setFinishEnable(this.component2);
            }
        }

        private void component1() {
            if (this.component1 <= 0 || this.component3 <= 0) {
                int screenWidth = (ScreenUtils.getScreenWidth() - CustomKeyBroadPop.this.getPadding()) / this.component4;
                this.component1 = screenWidth;
                this.component3 = (int) (((double) screenWidth) * CustomKeyBroadPop.component1);
            }
        }

        public void setFinishEnable(boolean z) {
            this.component2 = z;
            View view = this.copydefault;
            if (view != null) {
                if (z) {
                    view.setAlpha(1.0f);
                    this.copydefault.setEnabled(true);
                } else {
                    view.setAlpha(0.2f);
                    this.copydefault.setEnabled(false);
                }
            }
        }
    }

    public static void setViewLayoutRatio(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void ShareDataUIState(CustomKeyBroadPop customKeyBroadPop, View view) {
        Callback.onClick_enter(view);
        try {
            customKeyBroadPop.component2(view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
