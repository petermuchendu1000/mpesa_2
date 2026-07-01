package com.huawei.digitalpayment.consumer.baselib.widget.code;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Vibrator;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.util.ShuffleArrayUtils;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VirtualKeyboardView extends RelativeLayout implements KeyBoardAdapter.OnVirtualKeyboardKeyPress {
    private static final int VIBRATE_TIME = 30;
    private static int component1 = 0;
    private static int copydefault = 1;
    Context context;
    private GridView gridView;
    private boolean isShuffleKeyboard;
    private EditText mEditText;
    private TextView mTextFinish;
    private OnVirtualKeyboardFinish onVirtualKeyboardFinish;
    private boolean showFinish;
    private ArrayList<Map<String, String>> valueList;

    public interface OnVirtualKeyboardFinish {
        void onFinish();
    }

    public VirtualKeyboardView(Context context) {
        this(context, null);
    }

    public VirtualKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.VirtualKeyboardView);
        this.showFinish = typedArrayObtainStyledAttributes.getBoolean(R.styleable.VirtualKeyboardView_show_finish, true);
        this.isShuffleKeyboard = typedArrayObtainStyledAttributes.getBoolean(R.styleable.VirtualKeyboardView_isShuffleKeyboard, true);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, R.layout.layout_key_board, null);
        this.valueList = new ArrayList<>();
        this.gridView = (GridView) viewInflate.findViewById(R.id.gv_keybord);
        this.mTextFinish = (TextView) viewInflate.findViewById(R.id.tv_finish);
        this.mTextFinish.setText(context.getString(R.string.finish));
        this.mTextFinish.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i = 2 % 2;
                int i2 = component3 + 61;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    VirtualKeyboardView.m10248$r8$lambda$WBHeK0ckXLOQVcEqryqnRmMwZM(this.f$0, view);
                    throw null;
                }
                VirtualKeyboardView.m10248$r8$lambda$WBHeK0ckXLOQVcEqryqnRmMwZM(this.f$0, view);
                int i3 = component3 + 61;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 69 / 0;
                }
            }
        });
        initValueList();
        setupView();
        addView(viewInflate);
    }

    private void lambda$new$0(View view) {
        int i = 2 % 2;
        OnVirtualKeyboardFinish onVirtualKeyboardFinish = this.onVirtualKeyboardFinish;
        if (onVirtualKeyboardFinish != null) {
            int i2 = copydefault + 61;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                onVirtualKeyboardFinish.onFinish();
                return;
            } else {
                onVirtualKeyboardFinish.onFinish();
                throw null;
            }
        }
        setVisibility(8);
        int i3 = component1 + 81;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 / 5;
        }
    }

    public void setOnVirtualKeyboardFinish(OnVirtualKeyboardFinish onVirtualKeyboardFinish) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onVirtualKeyboardFinish = onVirtualKeyboardFinish;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public ArrayList<Map<String, String>> getValueList() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ArrayList<Map<String, String>> arrayList = this.valueList;
        int i4 = i2 + 123;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    private void initValueList() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 1; i4 < 13; i4++) {
            HashMap map = new HashMap();
            if (i4 < 10) {
                int i5 = component1 + 3;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                map.put("name", String.valueOf(i4));
            } else if (i4 == 10) {
                int i7 = copydefault + 113;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                map.put("name", "");
            } else if (i4 == 11) {
                map.put("name", String.valueOf(0));
            } else {
                map.put("name", "back");
                int i9 = component1 + 71;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            }
            this.valueList.add(map);
        }
    }

    public GridView getGridView() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        GridView gridView = this.gridView;
        int i4 = i2 + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return gridView;
    }

    private void setupView() {
        KeyBoardAdapter keyBoardAdapter;
        int i;
        int i2 = 2 % 2;
        if (this.isShuffleKeyboard) {
            keyBoardAdapter = new KeyBoardAdapter(this.context, ShuffleArrayUtils.myShuffle(this.valueList));
        } else {
            keyBoardAdapter = new KeyBoardAdapter(this.context, this.valueList);
        }
        keyBoardAdapter.setOnVirtualKeyboardKeyPress(this);
        this.gridView.setAdapter((ListAdapter) keyBoardAdapter);
        TextView textView = this.mTextFinish;
        if (!(!this.showFinish)) {
            int i3 = component1 + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        int i5 = component1 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEditText(EditText editText) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.mEditText = editText;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setEditText(Activity activity, EditText editText) {
        int i = 2 % 2;
        this.mEditText = editText;
        KeyboardUtils.hideSoftInput(activity);
        this.mEditText.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 113;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    VirtualKeyboardView.$r8$lambda$5BKSCkJRDp_O9AxxPBfBfgltUlI(this.f$0, view);
                    throw null;
                }
                VirtualKeyboardView.$r8$lambda$5BKSCkJRDp_O9AxxPBfBfgltUlI(this.f$0, view);
                int i4 = component1 + 57;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$setEditText$1(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0 ? getVisibility() == 8 : getVisibility() == 0) {
            setVisibility(0);
        }
        int i3 = component1 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public void isShuffleKeyboard(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.isShuffleKeyboard = z;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[PHI: r1 r4
  0x0044: PHI (r1v8 int) = (r1v7 int), (r1v12 int) binds: [B:10:0x0042, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r4v2 android.text.Editable) = (r4v1 android.text.Editable), (r4v5 android.text.Editable) binds: [B:10:0x0042, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[PHI: r1 r4
  0x005a: PHI (r1v9 int) = (r1v7 int), (r1v12 int) binds: [B:10:0x0042, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r4v3 android.text.Editable) = (r4v1 android.text.Editable), (r4v5 android.text.Editable) binds: [B:10:0x0042, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onKeyPress(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            android.widget.EditText r1 = r6.mEditText
            r2 = 0
            if (r1 == 0) goto L66
            int r1 = com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.copydefault
            int r1 = r1 + 105
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.component1 = r3
            int r1 = r1 % r0
            java.lang.String r3 = "BACK_COMMAND"
            if (r1 == 0) goto L2f
            r6.vibrator()
            android.widget.EditText r1 = r6.mEditText
            int r1 = r1.getSelectionEnd()
            android.widget.EditText r4 = r6.mEditText
            android.text.Editable r4 = r4.getText()
            boolean r3 = r3.equals(r7)
            r5 = 72
            int r5 = r5 / 0
            if (r3 == 0) goto L5a
            goto L44
        L2f:
            r6.vibrator()
            android.widget.EditText r1 = r6.mEditText
            int r1 = r1.getSelectionEnd()
            android.widget.EditText r4 = r6.mEditText
            android.text.Editable r4 = r4.getText()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L5a
        L44:
            int r7 = com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.component1
            int r7 = r7 + 47
            int r3 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.copydefault = r3
            int r7 = r7 % r0
            if (r7 == 0) goto L59
            if (r1 <= 0) goto L66
            int r7 = r1 + (-1)
            java.lang.String r3 = ""
            r4.replace(r7, r1, r3)
            goto L66
        L59:
            throw r2
        L5a:
            r4.insert(r1, r7)
            int r7 = com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.copydefault
            int r7 = r7 + 17
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.component1 = r1
            int r7 = r7 % r0
        L66:
            int r7 = com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.copydefault
            int r7 = r7 + 7
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.component1 = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L72
            return
        L72:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView.onKeyPress(java.lang.String):void");
    }

    @Override
    public void onKeyLongPress(String str) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = component1 + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        EditText editText = this.mEditText;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            Editable text = this.mEditText.getText();
            if (!(!KeyBoardAdapter.BACK_COMMAND.equals(str))) {
                forDelete();
                i = component1 + 95;
                i2 = i % 128;
            } else {
                text.insert(selectionEnd, str);
                i = component1 + 121;
                i2 = i % 128;
            }
            copydefault = i2;
            int i5 = i % 2;
        }
    }

    private void forDelete() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int selectionEnd = this.mEditText.getSelectionEnd();
        Editable text = this.mEditText.getText();
        vibrator();
        int i4 = copydefault + 97;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 5;
        }
        while (selectionEnd > 0) {
            text.replace(selectionEnd - 1, selectionEnd, "");
            selectionEnd = this.mEditText.getSelectionEnd();
            text = this.mEditText.getText();
        }
    }

    private void vibrator() {
        int i = 2 % 2;
        Vibrator vibrator = (Vibrator) this.context.getSystemService("vibrator");
        if (vibrator != null) {
            int i2 = copydefault + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            vibrator.vibrate(30L);
            int i4 = copydefault + 109;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = component1 + 25;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void $r8$lambda$5BKSCkJRDp_O9AxxPBfBfgltUlI(VirtualKeyboardView virtualKeyboardView, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        m10250xce3926e8(virtualKeyboardView, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = copydefault + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10248$r8$lambda$WBHeK0ckXLOQVcEqryqnRmMwZM(VirtualKeyboardView virtualKeyboardView, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        m10249xc8b4abaa(virtualKeyboardView, view);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = component1 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void m10249xc8b4abaa(VirtualKeyboardView virtualKeyboardView, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            virtualKeyboardView.lambda$new$0(view);
            Callback.onClick_exit();
            int i4 = copydefault + 91;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10250xce3926e8(VirtualKeyboardView virtualKeyboardView, View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            virtualKeyboardView.lambda$setEditText$1(view);
            Callback.onClick_exit();
            int i4 = component1 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
