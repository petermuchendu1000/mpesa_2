package com.huawei.digitalpayment.consumer.baselib.widget.code;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.util.List;
import java.util.Map;

public class KeyBoardAdapter extends BaseAdapter {
    public static final String BACK_COMMAND = "BACK_COMMAND";
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private Context component1;
    private List<Map<String, String>> component2;
    private OnVirtualKeyboardKeyPress copydefault;

    public interface OnVirtualKeyboardKeyPress {
        void onKeyLongPress(String str);

        void onKeyPress(String str);
    }

    public KeyBoardAdapter(Context context, List<Map<String, String>> list) {
        this.component1 = context;
        this.component2 = list;
    }

    @Override
    public int getCount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component2.size();
        int i4 = component3 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Object getItem(int i) {
        Map<String, String> map;
        int i2 = 2 % 2;
        int i3 = component3 + 83;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            map = this.component2.get(i);
            int i4 = 16 / 0;
        } else {
            map = this.component2.get(i);
        }
        int i5 = ShareDataUIState + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private void component2(String str, View view) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        OnVirtualKeyboardKeyPress onVirtualKeyboardKeyPress = this.copydefault;
        if (onVirtualKeyboardKeyPress != null) {
            int i5 = i3 + 51;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            onVirtualKeyboardKeyPress.onKeyPress(str);
            if (i6 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void copydefault(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            OnVirtualKeyboardKeyPress onVirtualKeyboardKeyPress = this.copydefault;
            if (onVirtualKeyboardKeyPress != null) {
                int i4 = i3 + 13;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                onVirtualKeyboardKeyPress.onKeyPress(BACK_COMMAND);
                if (i5 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r0
  0x001b: PHI (r0v5 com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter$OnVirtualKeyboardKeyPress) = 
  (r0v4 com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter$OnVirtualKeyboardKeyPress)
  (r0v9 com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter$OnVirtualKeyboardKeyPress)
 binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean component2(android.view.View r4) {
        /*
            r3 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter.component3
            int r0 = r0 + 65
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter.ShareDataUIState = r1
            int r0 = r0 % r4
            r1 = 0
            if (r0 == 0) goto L17
            com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter$OnVirtualKeyboardKeyPress r0 = r3.copydefault
            r2 = 36
            int r2 = r2 / r1
            if (r0 == 0) goto L20
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter$OnVirtualKeyboardKeyPress r0 = r3.copydefault
            if (r0 == 0) goto L20
        L1b:
            java.lang.String r2 = "BACK_COMMAND"
            r0.onKeyLongPress(r2)
        L20:
            int r0 = com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter.ShareDataUIState
            int r0 = r0 + 7
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter.component3 = r2
            int r0 = r0 % r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.widget.code.KeyBoardAdapter.component2(android.view.View):boolean");
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        if (view == null) {
            int i3 = component3 + 7;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                view = View.inflate(this.component1, getLayoutId(), null);
                int i4 = 10 / 0;
            } else {
                view = View.inflate(this.component1, getLayoutId(), null);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_key);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_blank);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_delete);
        final String str = this.component2.get(i).get("name");
        textView.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = component3 + 45;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                KeyBoardAdapter.m10244$r8$lambda$UFhhgB_4jecd0rOpOtKVZasUxQ(this.f$0, str, view2);
                int i8 = component3 + 121;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view2) {
                int i5 = 2 % 2;
                int i6 = component1 + 39;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                KeyBoardAdapter.$r8$lambda$5HJ2k7V8Q4UhNMCdd3JTFM6QXPY(this.f$0, view2);
                if (i7 == 0) {
                    int i8 = 22 / 0;
                }
            }
        });
        relativeLayout.setOnLongClickListener(new View.OnLongClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final boolean onLongClick(View view2) {
                int i5 = 2 % 2;
                int i6 = component3 + 13;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                boolean z$r8$lambda$FK_Qvra8yZ7PwD1zdFUqX2H6WD4 = KeyBoardAdapter.$r8$lambda$FK_Qvra8yZ7PwD1zdFUqX2H6WD4(this.f$0, view2);
                int i8 = ShareDataUIState + 5;
                component3 = i8 % 128;
                if (i8 % 2 == 0) {
                    return z$r8$lambda$FK_Qvra8yZ7PwD1zdFUqX2H6WD4;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        if (i == 9) {
            textView.setVisibility(8);
            relativeLayout.setVisibility(8);
        } else if (i != 11) {
            textView.setText(this.component2.get(i).get("name"));
            relativeLayout.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            int i5 = ShareDataUIState + 111;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                textView.setVisibility(91);
                textView2.setVisibility(78);
            } else {
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        }
        return view;
    }

    protected int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 93;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.grid_item_virtual_keyboard_key;
            int i4 = 18 / 0;
        } else {
            i = R.layout.grid_item_virtual_keyboard_key;
        }
        int i5 = ShareDataUIState + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnVirtualKeyboardKeyPress(OnVirtualKeyboardKeyPress onVirtualKeyboardKeyPress) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = onVirtualKeyboardKeyPress;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    public static void $r8$lambda$5HJ2k7V8Q4UhNMCdd3JTFM6QXPY(KeyBoardAdapter keyBoardAdapter, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component1(keyBoardAdapter, view);
        int i4 = component3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static boolean $r8$lambda$FK_Qvra8yZ7PwD1zdFUqX2H6WD4(KeyBoardAdapter keyBoardAdapter, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            keyBoardAdapter.component2(view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zComponent2 = keyBoardAdapter.component2(view);
        int i3 = ShareDataUIState + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return zComponent2;
    }

    public static void m10244$r8$lambda$UFhhgB_4jecd0rOpOtKVZasUxQ(KeyBoardAdapter keyBoardAdapter, String str, View view) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(keyBoardAdapter, str, view);
        int i4 = ShareDataUIState + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void ShareDataUIState(KeyBoardAdapter keyBoardAdapter, String str, View view) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            keyBoardAdapter.component2(str, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 19;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 60 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void component1(KeyBoardAdapter keyBoardAdapter, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            keyBoardAdapter.copydefault(view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public long getItemId(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 35;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return i;
        }
        throw null;
    }
}
