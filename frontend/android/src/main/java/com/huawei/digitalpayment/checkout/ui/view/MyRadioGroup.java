package com.huawei.digitalpayment.checkout.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import kotlin.ComponentDialogExternalSyntheticLambda1;
import kotlin.enable;

public class MyRadioGroup extends LinearLayout {
    private static int ShareDataUIState = 1;
    private static int component2;
    private int checkedId;
    private OnCheckedChangeListener onCheckedChangeListener;
    private CompoundButton.OnCheckedChangeListener onChildOnCheckedChangeListener;
    private component3 passThroughListener;
    private boolean protectFromCheckedChange;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MyRadioGroup myRadioGroup, int i);
    }

    @Override
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams;
        int i = 2 % 2;
        int i2 = component2 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            int i3 = 8 / 0;
        } else {
            layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        }
        int i4 = ShareDataUIState + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Override
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return generateLayoutParams(attributeSet);
        }
        generateLayoutParams(attributeSet);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RgLayoutParams rgLayoutParamsGenerateLayoutParams = generateLayoutParams(attributeSet);
        int i4 = ShareDataUIState + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return rgLayoutParamsGenerateLayoutParams;
    }

    public MyRadioGroup(Context context) {
        super(context);
        this.checkedId = -1;
        this.protectFromCheckedChange = false;
        setOrientation(1);
        init();
    }

    public MyRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.checkedId = -1;
        this.protectFromCheckedChange = false;
        init();
    }

    private void init() {
        int i = 2 % 2;
        this.onChildOnCheckedChangeListener = new component2();
        component3 component3Var = new component3();
        this.passThroughListener = component3Var;
        super.setOnHierarchyChangeListener(component3Var);
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    class component2 implements CompoundButton.OnCheckedChangeListener {
        private static int component1 = 0;
        private static int copydefault = 1;

        private component2() {
        }

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (MyRadioGroup.m10139$$Nest$fgetprotectFromCheckedChange(MyRadioGroup.this)) {
                return;
            }
            MyRadioGroup.m10140$$Nest$fputprotectFromCheckedChange(MyRadioGroup.this, true);
            if (MyRadioGroup.m10137$$Nest$fgetcheckedId(MyRadioGroup.this) != -1) {
                MyRadioGroup myRadioGroup = MyRadioGroup.this;
                MyRadioGroup.m10142$$Nest$msetCheckedStateForView(myRadioGroup, MyRadioGroup.m10137$$Nest$fgetcheckedId(myRadioGroup), false);
                int i4 = copydefault + 81;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
            MyRadioGroup.m10140$$Nest$fputprotectFromCheckedChange(MyRadioGroup.this, false);
            MyRadioGroup.m10141$$Nest$msetCheckedId(MyRadioGroup.this, compoundButton.getId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
  0x0022: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:8:0x0020, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onFinishInflate() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.ShareDataUIState
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component2 = r2
            int r1 = r1 % r0
            r2 = -1
            r3 = 0
            if (r1 == 0) goto L1b
            super.onFinishInflate()
            int r1 = r5.checkedId
            r4 = 18
            int r4 = r4 / r3
            if (r1 == r2) goto L2f
            goto L22
        L1b:
            super.onFinishInflate()
            int r1 = r5.checkedId
            if (r1 == r2) goto L2f
        L22:
            r2 = 1
            r5.protectFromCheckedChange = r2
            r5.setCheckedStateForView(r1, r2)
            r5.protectFromCheckedChange = r3
            int r1 = r5.checkedId
            r5.setCheckedId(r1)
        L2f:
            int r1 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component2
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3d
            r0 = 11
            int r0 = r0 / r3
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.onFinishInflate():void");
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if (view instanceof RadioButton) {
            int i6 = i3 + 27;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                ((RadioButton) view).isChecked();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RadioButton radioButton = (RadioButton) view;
            if (radioButton.isChecked()) {
                this.protectFromCheckedChange = true;
                int i7 = this.checkedId;
                if (i7 != -1) {
                    setCheckedStateForView(i7, false);
                }
                this.protectFromCheckedChange = false;
                setCheckedId(radioButton.getId());
            }
        } else if (view instanceof ViewGroup) {
            RadioButton radioButtonFindButton = findButton((ViewGroup) view);
            if (radioButtonFindButton == null) {
                return;
            }
            if (radioButtonFindButton.isChecked()) {
                this.protectFromCheckedChange = true;
                int i8 = this.checkedId;
                if (i8 != -1) {
                    int i9 = component2 + 91;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                    setCheckedStateForView(i8, false);
                }
                this.protectFromCheckedChange = false;
                setCheckedId(radioButtonFindButton.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component3.copydefault(this.passThroughListener, onHierarchyChangeListener);
        int i4 = component2 + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RadioButton findButton(ViewGroup viewGroup) {
        int i = 2 % 2;
        int childCount = viewGroup.getChildCount();
        RadioButton radioButton = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            int i3 = component2 + 39;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (viewGroup.getChildAt(i2) instanceof RadioButton) {
                int i5 = ShareDataUIState + 49;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                radioButton = (RadioButton) viewGroup.getChildAt(i2);
            } else if (viewGroup.getChildAt(i2) instanceof ViewGroup) {
                int i7 = component2 + 15;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                findButton((ViewGroup) viewGroup.getChildAt(i2));
            }
        }
        return radioButton;
    }

    public void check(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 21;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (i != -1) {
            int i6 = i4 + 69;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            if (i == this.checkedId) {
                return;
            }
        }
        int i8 = this.checkedId;
        if (i8 != -1) {
            int i9 = i4 + 105;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            setCheckedStateForView(i8, false);
        }
        if (i != -1) {
            setCheckedStateForView(i, true);
            int i11 = component2 + 75;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
        }
        setCheckedId(i);
    }

    private void setCheckedId(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 47;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            this.checkedId = i;
            OnCheckedChangeListener onCheckedChangeListener = this.onCheckedChangeListener;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, i);
                int i4 = component2 + 29;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        this.checkedId = i;
        throw null;
    }

    private void setCheckedStateForView(int i, boolean z) {
        int i2 = 2 % 2;
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof RadioButton) {
            int i3 = ShareDataUIState + 123;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ((RadioButton) viewFindViewById).setChecked(z);
            int i5 = ShareDataUIState + 31;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.onCheckedChangeListener = onCheckedChangeListener;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public RgLayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i = 2 % 2;
        RgLayoutParams rgLayoutParams = new RgLayoutParams(getContext(), attributeSet);
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
        return rgLayoutParams;
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = layoutParams instanceof RgLayoutParams;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        int i = 2 % 2;
        RgLayoutParams rgLayoutParams = new RgLayoutParams(-2, -2);
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return rgLayoutParams;
        }
        throw null;
    }

    static int m10137$$Nest$fgetcheckedId(MyRadioGroup myRadioGroup) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = myRadioGroup.checkedId;
        int i6 = i3 + 11;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static CompoundButton.OnCheckedChangeListener m10138$$Nest$fgetonChildOnCheckedChangeListener(MyRadioGroup myRadioGroup) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = myRadioGroup.onChildOnCheckedChangeListener;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return onCheckedChangeListener;
        }
        throw null;
    }

    static boolean m10139$$Nest$fgetprotectFromCheckedChange(MyRadioGroup myRadioGroup) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = myRadioGroup.protectFromCheckedChange;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10140$$Nest$fputprotectFromCheckedChange(MyRadioGroup myRadioGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        myRadioGroup.protectFromCheckedChange = z;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public static class RgLayoutParams extends LinearLayout.LayoutParams {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        public RgLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RgLayoutParams(int i, int i2) {
            super(i, i2);
        }

        public RgLayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public RgLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public RgLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void setBaseAttributes(android.content.res.TypedArray r6, int r7, int r8) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.copydefault
                int r1 = r1 + 107
                int r2 = r1 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.ShareDataUIState = r2
                int r1 = r1 % r0
                r2 = -2
                r3 = 1
                if (r1 == 0) goto L1b
                boolean r1 = r6.hasValue(r7)
                r4 = 40
                int r4 = r4 / 0
                if (r1 == r3) goto L22
                goto L2b
            L1b:
                boolean r1 = r6.hasValue(r7)
                r1 = r1 ^ r3
                if (r1 == r3) goto L2b
            L22:
                java.lang.String r1 = "layout_width"
                int r7 = r6.getLayoutDimension(r7, r1)
                r5.width = r7
                goto L3a
            L2b:
                r5.width = r2
                int r7 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.copydefault
                int r7 = r7 + 101
                int r1 = r7 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.ShareDataUIState = r1
                int r7 = r7 % r0
                if (r7 == 0) goto L3a
                int r7 = r0 % 3
            L3a:
                boolean r7 = r6.hasValue(r8)
                if (r7 == 0) goto L52
                int r7 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.copydefault
                int r7 = r7 + 95
                int r1 = r7 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.ShareDataUIState = r1
                int r7 = r7 % r0
                java.lang.String r7 = "layout_height"
                int r6 = r6.getLayoutDimension(r8, r7)
                r5.height = r6
                goto L54
            L52:
                r5.height = r2
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.RgLayoutParams.setBaseAttributes(android.content.res.TypedArray, int, int):void");
        }
    }

    static void m10141$$Nest$msetCheckedId(MyRadioGroup myRadioGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        myRadioGroup.setCheckedId(i);
        if (i4 == 0) {
            int i5 = 37 / 0;
        }
    }

    static void m10142$$Nest$msetCheckedStateForView(MyRadioGroup myRadioGroup, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = component2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        myRadioGroup.setCheckedStateForView(i, z);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = ShareDataUIState + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public class component3 implements ViewGroup.OnHierarchyChangeListener {
        private static int component2 = 0;
        private static int component3 = 1;
        private ViewGroup.OnHierarchyChangeListener copydefault;

        private component3() {
        }

        @Override
        public void onChildViewAdded(View view, View view2) {
            int i = 2 % 2;
            MyRadioGroup myRadioGroup = MyRadioGroup.this;
            if (view == myRadioGroup && (view2 instanceof RadioButton)) {
                if (view2.getId() == -1) {
                    view2.setId(view2.hashCode());
                }
                ((RadioButton) view2).setOnCheckedChangeListener(MyRadioGroup.m10138$$Nest$fgetonChildOnCheckedChangeListener(MyRadioGroup.this));
            } else if (view == myRadioGroup && (view2 instanceof ViewGroup)) {
                RadioButton radioButtonFindButton = myRadioGroup.findButton((ViewGroup) view2);
                if (radioButtonFindButton.getId() == -1) {
                    int i2 = component3 + 89;
                    component2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        radioButtonFindButton.setId(radioButtonFindButton.hashCode());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    radioButtonFindButton.setId(radioButtonFindButton.hashCode());
                    int i3 = component2 + 47;
                    component3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 % 3;
                    }
                }
                radioButtonFindButton.setOnCheckedChangeListener(MyRadioGroup.m10138$$Nest$fgetonChildOnCheckedChangeListener(MyRadioGroup.this));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.copydefault;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
                int i5 = component3 + 85;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onChildViewRemoved(android.view.View r7, android.view.View r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component3
                int r2 = r1 + 103
                int r3 = r2 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component2 = r3
                int r2 = r2 % r0
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup r2 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.this
                r3 = 0
                if (r7 != r2) goto L2a
                int r4 = r1 + 23
                int r5 = r4 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component2 = r5
                int r4 = r4 % r0
                boolean r4 = r8 instanceof android.widget.RadioButton
                if (r4 == 0) goto L2a
                int r1 = r1 + 59
                int r2 = r1 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component2 = r2
                int r1 = r1 % r0
                r1 = r8
                android.widget.RadioButton r1 = (android.widget.RadioButton) r1
                r1.setOnCheckedChangeListener(r3)
                goto L43
            L2a:
                if (r7 != r2) goto L43
                boolean r1 = r8 instanceof android.view.ViewGroup
                if (r1 == 0) goto L43
                r1 = r8
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                android.widget.RadioButton r1 = r2.findButton(r1)
                r1.setOnCheckedChangeListener(r3)
                int r1 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component3
                int r1 = r1 + 65
                int r2 = r1 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component2 = r2
                int r1 = r1 % r0
            L43:
                android.view.ViewGroup$OnHierarchyChangeListener r1 = r6.copydefault
                if (r1 == 0) goto L53
                r1.onChildViewRemoved(r7, r8)
                int r7 = com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component3
                int r7 = r7 + 71
                int r8 = r7 % 128
                com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.component2 = r8
                int r7 = r7 % r0
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.MyRadioGroup.component3.onChildViewRemoved(android.view.View, android.view.View):void");
        }

        static void copydefault(component3 component3Var, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
            int i = 2 % 2;
            int i2 = component3 + 43;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            component3Var.copydefault = onHierarchyChangeListener;
            int i5 = i3 + 15;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        public static void component1() {
            enable.ShareDataUIState[0] = ComponentDialogExternalSyntheticLambda1.copydefault[0];
        }
    }
}
