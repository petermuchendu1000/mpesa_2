package com.huawei.digitalpayment.customer.dynamics.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.customer.dynamics.R;

public class PhotoSelectDialog {
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private Dialog ShareDataUIState;
    private ItemClick component1;
    private ItemClick component2;
    private View component3;
    private ItemClick copydefault;
    private Context equals;

    public interface ItemClick {
        void onItemClick();
    }

    public PhotoSelectDialog(Context context) {
        this.equals = context;
    }

    private void component2(DialogInterface dialogInterface) {
        ItemClick itemClick;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            itemClick = this.copydefault;
            int i3 = 44 / 0;
            if (itemClick == null) {
                return;
            }
        } else {
            itemClick = this.copydefault;
            if (itemClick == null) {
                return;
            }
        }
        itemClick.onItemClick();
        int i4 = getAsAtTimestamp + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void createDialog() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (this.ShareDataUIState == null) {
            this.ShareDataUIState = new Dialog(this.equals, R.style.BottomDialog);
            View viewInflate = LayoutInflater.from(this.equals).inflate(R.layout.layout_dialog_photo_select, (ViewGroup) null);
            this.component3 = viewInflate;
            component3(viewInflate);
            this.ShareDataUIState.setContentView(this.component3);
            ViewGroup.LayoutParams layoutParams = this.component3.getLayoutParams();
            layoutParams.width = this.equals.getResources().getDisplayMetrics().widthPixels;
            this.component3.setLayoutParams(layoutParams);
            this.ShareDataUIState.setCanceledOnTouchOutside(true);
            this.ShareDataUIState.setCancelable(true);
            this.ShareDataUIState.getWindow().setGravity(80);
            this.ShareDataUIState.getWindow().setWindowAnimations(R.style.BottomAnimation);
            this.ShareDataUIState.setOnCancelListener(new DialogInterface.OnCancelListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 67;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        PhotoSelectDialog.m12216$r8$lambda$yCoDjacFg_pH1k7emaFYFYQdDg(this.f$0, dialogInterface);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    PhotoSelectDialog.m12216$r8$lambda$yCoDjacFg_pH1k7emaFYFYQdDg(this.f$0, dialogInterface);
                    int i6 = ShareDataUIState + 115;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 86 / 0;
                    }
                }
            });
            int i4 = getAsAtTimestamp + 79;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
            }
        }
        this.ShareDataUIState.show();
        int i6 = getAsAtTimestamp + 27;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
    }

    private void component1(View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ItemClick itemClick = this.component1;
        if (itemClick != null) {
            int i5 = i3 + 99;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            itemClick.onItemClick();
            int i7 = getRequestBeneficiariesState + 75;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
        }
        ShareDataUIState();
    }

    private void component2(View view) {
        int i = 2 % 2;
        ItemClick itemClick = this.component2;
        if (itemClick != null) {
            int i2 = getRequestBeneficiariesState + 43;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                itemClick.onItemClick();
            } else {
                itemClick.onItemClick();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ShareDataUIState();
        int i3 = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 43 / 0;
        }
    }

    private void component3(View view) {
        int i = 2 % 2;
        ((TextView) view.findViewById(R.id.tv_camera)).setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PhotoSelectDialog.$r8$lambda$K_TOySmM1PUkgzKkutdZItz9HaQ(this.f$0, view2);
                int i5 = copydefault + 103;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((TextView) view.findViewById(R.id.tv_album)).setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PhotoSelectDialog.$r8$lambda$hKTkpE_d5uswEwGbYWuVyRF0hnA(this.f$0, view2);
                int i5 = ShareDataUIState + 41;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((TextView) view.findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    PhotoSelectDialog.m12215$r8$lambda$Cs0lNyXkK0bj1zJR2q9xCLQ7rU(this.f$0, view2);
                    throw null;
                }
                PhotoSelectDialog.m12215$r8$lambda$Cs0lNyXkK0bj1zJR2q9xCLQ7rU(this.f$0, view2);
                int i4 = ShareDataUIState + 87;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 125;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private void copydefault(View view) {
        int i = 2 % 2;
        ItemClick itemClick = this.copydefault;
        if (itemClick != null) {
            int i2 = getRequestBeneficiariesState + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            itemClick.onItemClick();
            int i4 = getRequestBeneficiariesState + 45;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        ShareDataUIState();
        int i6 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        Dialog dialog = this.ShareDataUIState;
        if (dialog != null) {
            int i2 = getAsAtTimestamp + 17;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            if (dialog.isShowing()) {
                int i4 = getRequestBeneficiariesState + 13;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                this.ShareDataUIState.dismiss();
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public void setOnAlbumClick(ItemClick itemClick) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 37;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = itemClick;
        int i5 = i2 + 19;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setOnCameraClick(ItemClick itemClick) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.component1 = itemClick;
        int i5 = i3 + 93;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setCancelClick(ItemClick itemClick) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 63;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = itemClick;
        int i5 = i2 + 95;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m12215$r8$lambda$Cs0lNyXkK0bj1zJR2q9xCLQ7rU(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        component3(photoSelectDialog, view);
        int i4 = getRequestBeneficiariesState + 125;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$K_TOySmM1PUkgzKkutdZItz9HaQ(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(photoSelectDialog, view);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = getRequestBeneficiariesState + 61;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$hKTkpE_d5uswEwGbYWuVyRF0hnA(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        copydefault(photoSelectDialog, view);
        int i4 = getRequestBeneficiariesState + 65;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m12216$r8$lambda$yCoDjacFg_pH1k7emaFYFYQdDg(PhotoSelectDialog photoSelectDialog, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        photoSelectDialog.component2(dialogInterface);
        int i4 = getAsAtTimestamp + 99;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void ShareDataUIState(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            photoSelectDialog.component1(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 13;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void copydefault(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                photoSelectDialog.component2(view);
                Callback.onClick_exit();
            } else {
                photoSelectDialog.component2(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void component3(PhotoSelectDialog photoSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            photoSelectDialog.copydefault(view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
