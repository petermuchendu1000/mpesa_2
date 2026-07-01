package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySimRegistrationStepperBindingImpl extends ActivitySimRegistrationStepperBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault = 1;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.card_step_1, 1);
        sparseIntArray.put(R.id.title1, 2);
        sparseIntArray.put(R.id.title_completed, 3);
        sparseIntArray.put(R.id.cl_step_1_content, 4);
        sparseIntArray.put(R.id.et_msisdn, 5);
        sparseIntArray.put(R.id.update_another_msisdn, 6);
        sparseIntArray.put(R.id.accept_terms, 7);
        sparseIntArray.put(R.id.btn_step_1_next, 8);
        sparseIntArray.put(R.id.step_1, 9);
        sparseIntArray.put(R.id.iv_step_1_check, 10);
        sparseIntArray.put(R.id.card_step_2, 11);
        sparseIntArray.put(R.id.title2, 12);
        sparseIntArray.put(R.id.title2_completed, 13);
        sparseIntArray.put(R.id.subtitle2, 14);
        sparseIntArray.put(R.id.cl_step_2_content, 15);
        sparseIntArray.put(R.id.rv_pending_msisdns, 16);
        sparseIntArray.put(R.id.btn_step_2_next, 17);
        sparseIntArray.put(R.id.step_2, 18);
        sparseIntArray.put(R.id.iv_step_2_check, 19);
        sparseIntArray.put(R.id.card_step_3, 20);
        sparseIntArray.put(R.id.title3, 21);
        sparseIntArray.put(R.id.title3_completed, 22);
        sparseIntArray.put(R.id.subtitle3, 23);
        sparseIntArray.put(R.id.cl_step_3_content, 24);
        sparseIntArray.put(R.id.grid_doc_type, 25);
        sparseIntArray.put(R.id.rb_national_id, 26);
        sparseIntArray.put(R.id.rb_passport, 27);
        sparseIntArray.put(R.id.rb_alien_id, 28);
        sparseIntArray.put(R.id.rb_military_id, 29);
        sparseIntArray.put(R.id.tv_upload_label, 30);
        sparseIntArray.put(R.id.card_upload_front, 31);
        sparseIntArray.put(R.id.fl_front_icon, 32);
        sparseIntArray.put(R.id.iv_front_icon_static, 33);
        sparseIntArray.put(R.id.iv_front_thumbnail, 34);
        sparseIntArray.put(R.id.tv_front_empty_prompt, 35);
        sparseIntArray.put(R.id.btn_front_upload_action, 36);
        sparseIntArray.put(R.id.tv_front_title, 37);
        sparseIntArray.put(R.id.pb_front, 38);
        sparseIntArray.put(R.id.tv_front_percentage, 39);
        sparseIntArray.put(R.id.tv_front_size, 40);
        sparseIntArray.put(R.id.btn_front_delete, 41);
        sparseIntArray.put(R.id.card_upload_back, 42);
        sparseIntArray.put(R.id.fl_back_icon, 43);
        sparseIntArray.put(R.id.iv_back_icon_static, 44);
        sparseIntArray.put(R.id.iv_back_thumbnail, 45);
        sparseIntArray.put(R.id.tv_back_empty_prompt, 46);
        sparseIntArray.put(R.id.btn_back_upload_action, 47);
        sparseIntArray.put(R.id.tv_back_title, 48);
        sparseIntArray.put(R.id.pb_back, 49);
        sparseIntArray.put(R.id.tv_back_percentage, 50);
        sparseIntArray.put(R.id.tv_back_size, 51);
        sparseIntArray.put(R.id.btn_back_delete, 52);
        sparseIntArray.put(R.id.btn_step_3_finish, 53);
        sparseIntArray.put(R.id.step_3, 54);
        sparseIntArray.put(R.id.iv_step_3_check, 55);
        sparseIntArray.put(R.id.btn_update_sim_details, 56);
        int i = copydefault + 41;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ActivitySimRegistrationStepperBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 57, component2, component3));
    }

    private ActivitySimRegistrationStepperBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CheckBox) objArr[7], (Button) objArr[52], (Button) objArr[47], (Button) objArr[41], (Button) objArr[36], (Button) objArr[8], (Button) objArr[17], (Button) objArr[53], (Button) objArr[56], (MaterialCardView) objArr[1], (MaterialCardView) objArr[11], (MaterialCardView) objArr[20], (MaterialCardView) objArr[42], (MaterialCardView) objArr[31], (ConstraintLayout) objArr[4], (ConstraintLayout) objArr[15], (ConstraintLayout) objArr[24], (EditText) objArr[5], (FrameLayout) objArr[43], (FrameLayout) objArr[32], (GridLayout) objArr[25], (ImageView) objArr[44], (ImageView) objArr[45], (ImageView) objArr[33], (ImageView) objArr[34], (ImageView) objArr[10], (ImageView) objArr[19], (ImageView) objArr[55], (ConstraintLayout) objArr[0], (ProgressBar) objArr[49], (ProgressBar) objArr[38], (RadioButton) objArr[28], (RadioButton) objArr[29], (RadioButton) objArr[26], (RadioButton) objArr[27], (RecyclerView) objArr[16], (TextView) objArr[9], (TextView) objArr[18], (TextView) objArr[54], (TextView) objArr[14], (TextView) objArr[23], (TextView) objArr[2], (TextView) objArr[12], (TextView) objArr[13], (TextView) objArr[21], (TextView) objArr[22], (TextView) objArr[3], (TextView) objArr[46], (TextView) objArr[50], (TextView) objArr[51], (TextView) objArr[48], (TextView) objArr[35], (TextView) objArr[39], (TextView) objArr[40], (TextView) objArr[37], (TextView) objArr[30], (TextView) objArr[6]);
        this.component1 = -1L;
        this.main.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 71;
        copy = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 59;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 81;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
