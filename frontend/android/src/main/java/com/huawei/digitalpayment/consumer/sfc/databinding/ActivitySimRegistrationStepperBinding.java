package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySimRegistrationStepperBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final CheckBox acceptTerms;
    public final Button btnBackDelete;
    public final Button btnBackUploadAction;
    public final Button btnFrontDelete;
    public final Button btnFrontUploadAction;
    public final Button btnStep1Next;
    public final Button btnStep2Next;
    public final Button btnStep3Finish;
    public final Button btnUpdateSimDetails;
    public final MaterialCardView cardStep1;
    public final MaterialCardView cardStep2;
    public final MaterialCardView cardStep3;
    public final MaterialCardView cardUploadBack;
    public final MaterialCardView cardUploadFront;
    public final ConstraintLayout clStep1Content;
    public final ConstraintLayout clStep2Content;
    public final ConstraintLayout clStep3Content;
    public final EditText etMsisdn;
    public final FrameLayout flBackIcon;
    public final FrameLayout flFrontIcon;
    public final GridLayout gridDocType;
    public final ImageView ivBackIconStatic;
    public final ImageView ivBackThumbnail;
    public final ImageView ivFrontIconStatic;
    public final ImageView ivFrontThumbnail;
    public final ImageView ivStep1Check;
    public final ImageView ivStep2Check;
    public final ImageView ivStep3Check;
    public final ConstraintLayout main;
    public final ProgressBar pbBack;
    public final ProgressBar pbFront;
    public final RadioButton rbAlienId;
    public final RadioButton rbMilitaryId;
    public final RadioButton rbNationalId;
    public final RadioButton rbPassport;
    public final RecyclerView rvPendingMsisdns;
    public final TextView step1;
    public final TextView step2;
    public final TextView step3;
    public final TextView subtitle2;
    public final TextView subtitle3;
    public final TextView title1;
    public final TextView title2;
    public final TextView title2Completed;
    public final TextView title3;
    public final TextView title3Completed;
    public final TextView titleCompleted;
    public final TextView tvBackEmptyPrompt;
    public final TextView tvBackPercentage;
    public final TextView tvBackSize;
    public final TextView tvBackTitle;
    public final TextView tvFrontEmptyPrompt;
    public final TextView tvFrontPercentage;
    public final TextView tvFrontSize;
    public final TextView tvFrontTitle;
    public final TextView tvUploadLabel;
    public final TextView updateAnotherMsisdn;

    protected ActivitySimRegistrationStepperBinding(Object obj, View view, int i, CheckBox checkBox, Button button, Button button2, Button button3, Button button4, Button button5, Button button6, Button button7, Button button8, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, EditText editText, FrameLayout frameLayout, FrameLayout frameLayout2, GridLayout gridLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ConstraintLayout constraintLayout4, ProgressBar progressBar, ProgressBar progressBar2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21) {
        super(obj, view, i);
        this.acceptTerms = checkBox;
        this.btnBackDelete = button;
        this.btnBackUploadAction = button2;
        this.btnFrontDelete = button3;
        this.btnFrontUploadAction = button4;
        this.btnStep1Next = button5;
        this.btnStep2Next = button6;
        this.btnStep3Finish = button7;
        this.btnUpdateSimDetails = button8;
        this.cardStep1 = materialCardView;
        this.cardStep2 = materialCardView2;
        this.cardStep3 = materialCardView3;
        this.cardUploadBack = materialCardView4;
        this.cardUploadFront = materialCardView5;
        this.clStep1Content = constraintLayout;
        this.clStep2Content = constraintLayout2;
        this.clStep3Content = constraintLayout3;
        this.etMsisdn = editText;
        this.flBackIcon = frameLayout;
        this.flFrontIcon = frameLayout2;
        this.gridDocType = gridLayout;
        this.ivBackIconStatic = imageView;
        this.ivBackThumbnail = imageView2;
        this.ivFrontIconStatic = imageView3;
        this.ivFrontThumbnail = imageView4;
        this.ivStep1Check = imageView5;
        this.ivStep2Check = imageView6;
        this.ivStep3Check = imageView7;
        this.main = constraintLayout4;
        this.pbBack = progressBar;
        this.pbFront = progressBar2;
        this.rbAlienId = radioButton;
        this.rbMilitaryId = radioButton2;
        this.rbNationalId = radioButton3;
        this.rbPassport = radioButton4;
        this.rvPendingMsisdns = recyclerView;
        this.step1 = textView;
        this.step2 = textView2;
        this.step3 = textView3;
        this.subtitle2 = textView4;
        this.subtitle3 = textView5;
        this.title1 = textView6;
        this.title2 = textView7;
        this.title2Completed = textView8;
        this.title3 = textView9;
        this.title3Completed = textView10;
        this.titleCompleted = textView11;
        this.tvBackEmptyPrompt = textView12;
        this.tvBackPercentage = textView13;
        this.tvBackSize = textView14;
        this.tvBackTitle = textView15;
        this.tvFrontEmptyPrompt = textView16;
        this.tvFrontPercentage = textView17;
        this.tvFrontSize = textView18;
        this.tvFrontTitle = textView19;
        this.tvUploadLabel = textView20;
        this.updateAnotherMsisdn = textView21;
    }

    public static ActivitySimRegistrationStepperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegistrationStepperBindingInflate;
    }

    @Deprecated
    public static ActivitySimRegistrationStepperBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBinding = (ActivitySimRegistrationStepperBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sim_registration_stepper, viewGroup, z, obj);
        int i3 = component3 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return activitySimRegistrationStepperBinding;
    }

    public static ActivitySimRegistrationStepperBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegistrationStepperBindingInflate;
    }

    @Deprecated
    public static ActivitySimRegistrationStepperBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBinding = (ActivitySimRegistrationStepperBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sim_registration_stepper, null, false, obj);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegistrationStepperBinding;
    }

    public static ActivitySimRegistrationStepperBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegistrationStepperBindingBind;
    }

    @Deprecated
    public static ActivitySimRegistrationStepperBinding bind(View view, Object obj) {
        ActivitySimRegistrationStepperBinding activitySimRegistrationStepperBinding;
        int i = 2 % 2;
        int i2 = component3 + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySimRegistrationStepperBinding = (ActivitySimRegistrationStepperBinding) bind(obj, view, R.layout.activity_sim_registration_stepper);
            int i3 = 11 / 0;
        } else {
            activitySimRegistrationStepperBinding = (ActivitySimRegistrationStepperBinding) bind(obj, view, R.layout.activity_sim_registration_stepper);
        }
        int i4 = component3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySimRegistrationStepperBinding;
    }
}
