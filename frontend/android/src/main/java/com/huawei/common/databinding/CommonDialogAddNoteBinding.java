package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;

public final class CommonDialogAddNoteBinding implements ViewBinding {
    public final RoundTextView btnCancel;
    public final RoundTextView btnSure;
    private final RoundConstraintLayout component3;
    public final EditText etNote;
    public final RoundTextView line;
    public final TextView tvTitle;

    private CommonDialogAddNoteBinding(RoundConstraintLayout roundConstraintLayout, RoundTextView roundTextView, RoundTextView roundTextView2, EditText editText, RoundTextView roundTextView3, TextView textView) {
        this.component3 = roundConstraintLayout;
        this.btnCancel = roundTextView;
        this.btnSure = roundTextView2;
        this.etNote = editText;
        this.line = roundTextView3;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        return this.component3;
    }

    public static CommonDialogAddNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonDialogAddNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_dialog_add_note, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonDialogAddNoteBinding bind(View view) {
        int i = R.id.btn_cancel;
        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i);
        if (roundTextView != null) {
            i = R.id.btn_sure;
            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i);
            if (roundTextView2 != null) {
                i = R.id.etNote;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
                if (editText != null) {
                    i = R.id.line;
                    RoundTextView roundTextView3 = (RoundTextView) ViewBindings.findChildViewById(view, i);
                    if (roundTextView3 != null) {
                        i = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new CommonDialogAddNoteBinding((RoundConstraintLayout) view, roundTextView, roundTextView2, editText, roundTextView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
