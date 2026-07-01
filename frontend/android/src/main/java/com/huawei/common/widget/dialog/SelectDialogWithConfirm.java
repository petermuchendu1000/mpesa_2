package com.huawei.common.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.R;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.recyclerview.RecycleViewDivider;
import java.util.List;

public class SelectDialogWithConfirm<T> extends BaseDialog {
    private final List<T> ShareDataUIState;
    private final String component1;
    private int component3 = -1;
    private final String copydefault;
    protected final OnItemSelectedListener<T> onItemSelectedListener;

    public interface OnItemSelectedListener<T> {
        void onItemSelected(int i, T t);
    }

    public void convert(BaseViewHolder baseViewHolder, T t) {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.dialog_select_with_confirm;
    }

    protected int getItemLayoutId() {
        return R.layout.item_dialog_select;
    }

    public SelectDialogWithConfirm(String str, String str2, List<T> list, OnItemSelectedListener<T> onItemSelectedListener) {
        this.copydefault = str;
        this.component1 = str2;
        this.ShareDataUIState = list;
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public void setPosition(int i) {
        this.component3 = i;
    }

    protected boolean isSelected(T t) {
        int iIndexOf = this.ShareDataUIState.indexOf(t);
        int i = this.component3;
        return i != -1 && i == iIndexOf;
    }

    @Override
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setGravity(80);
        window.setLayout(-1, -2);
        window.setWindowAnimations(R.style.BottomAnimation);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        LoadingButton loadingButton = (LoadingButton) view.findViewById(R.id.btnSelect);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_list);
        recyclerView.addItemDecoration(ShareDataUIState(view.getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        final component2 component2Var = new component2(getItemLayoutId(), this.ShareDataUIState);
        component2Var.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                this.f$0.copydefault(component2Var, baseQuickAdapter, view2, i);
            }
        });
        recyclerView.setAdapter(component2Var);
        if (textView != null) {
            textView.setText(this.copydefault);
        }
        loadingButton.setText(this.component1);
        loadingButton.setOnClickListener(new FilterFastClickListener() {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override
            public void onFilterClick(View view2) {
                if (SelectDialogWithConfirm.this.component3 != -1 && SelectDialogWithConfirm.this.onItemSelectedListener != null) {
                    SelectDialogWithConfirm.this.onItemSelectedListener.onItemSelected(SelectDialogWithConfirm.this.component3, SelectDialogWithConfirm.this.ShareDataUIState.get(SelectDialogWithConfirm.this.component3));
                }
                SelectDialogWithConfirm.this.dismiss();
            }
        });
        view.findViewById(R.id.ivClose).setOnClickListener(new FilterFastClickListener() {
            public static void component2() {
            }

            @Override
            public void onFilterClick(View view2) {
                SelectDialogWithConfirm.this.dismiss();
            }
        });
    }

    public void copydefault(component2 component2Var, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        this.component3 = i;
        component2Var.notifyDataSetChanged();
    }

    private RecycleViewDivider ShareDataUIState(Context context) {
        RecycleViewDivider recycleViewDivider = new RecycleViewDivider(ColorUtils.getColor(R.color.colorGround), ConvertUtils.dp2px(1.0f));
        recycleViewDivider.setPadding(ConvertUtils.dp2px(16.0f), 0, 0, 0);
        return recycleViewDivider;
    }

    class component2 extends BaseQuickAdapter<T, BaseViewHolder> {
        public component2(int i, List<T> list) {
            super(i, list);
        }

        @Override
        public void convert(BaseViewHolder baseViewHolder, T t) {
            SelectDialogWithConfirm.this.convert(baseViewHolder, t);
        }
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.isShowing = false;
    }
}
