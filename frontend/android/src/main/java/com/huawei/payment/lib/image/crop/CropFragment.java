package com.huawei.payment.lib.image.crop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.common.util.L;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.Crop;
import com.huawei.payment.lib.image.crop.callback.BitmapCropCallback;
import com.huawei.payment.lib.image.crop.model.AspectRatio;
import com.huawei.payment.lib.image.crop.util.SelectedStateListDrawable;
import com.huawei.payment.lib.image.crop.util.StatusBarUtils;
import com.huawei.payment.lib.image.crop.view.CropView;
import com.huawei.payment.lib.image.crop.view.GestureCropImageView;
import com.huawei.payment.lib.image.crop.view.OverlayView;
import com.huawei.payment.lib.image.crop.view.TransformView;
import com.huawei.payment.lib.image.crop.view.widget.AspectTextView;
import com.huawei.payment.lib.image.crop.view.widget.HorizontalProgressView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class CropFragment extends BaseFragment {
    public static final int ALL = 3;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    public static final int SCALE = 1;
    private static final long ShareDataUIState = 50;
    public static final String TAG = "CropFragment";
    private static final int component2 = 15000;
    private static final int component3 = 42;
    private static final int copydefault = 3;
    private CropView ArtificialStackFrames;
    private ViewGroup CoroutineDebuggingKt;

    private int f3800a;
    private OverlayView accessartificialFrame;

    private boolean f3802c;
    private int component1;
    private View copy;
    private int coroutineBoundary;
    private int coroutineCreation;

    private TextView f3803d;
    private int e;
    private String f;
    private int g;
    private ViewGroup getARTIFICIAL_FRAME_PACKAGE_NAME;
    private GestureCropImageView getShareableDataState;
    private CropFragmentListener getSponsorBeneficiariesState;
    private Toolbar h;
    private ViewGroup hExternalSyntheticLambda0;
    private TextView invoke;
    private int invokeSuspend;
    private ViewGroup k;
    private ViewGroup l;
    private ViewGroup toString;
    private final List<ViewGroup> component4 = new ArrayList();
    private final TransformView.TransformImageListener hashCode = new TransformView.TransformImageListener() {
        @Override
        public void onRotate(float f) {
            CropFragment.this.component2(f);
        }

        @Override
        public void onScale(float f) {
            CropFragment.this.component3(f);
        }

        @Override
        public void onLoadComplete() {
            CropFragment.this.ArtificialStackFrames.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            CropFragment.this.copy.setClickable(false);
            CropFragment.this.getSponsorBeneficiariesState.onCropLoading(false);
        }

        @Override
        public void onLoadFailure(Exception exc) {
            CropFragment.this.getSponsorBeneficiariesState.onCropFinish(CropFragment.this.getError(exc));
        }
    };
    private Bitmap.CompressFormat equals = DEFAULT_COMPRESS_FORMAT;
    private int getAsAtTimestamp = 90;
    private int[] getRequestBeneficiariesState = {1, 2, 3};

    private final View.OnClickListener f3801b = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                if (!view.isSelected()) {
                    CropFragment.this.component4(view.getId());
                }
            } finally {
                Callback.onClick_exit();
            }
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public static CropFragment newInstance(Bundle bundle) {
        CropFragment cropFragment = new CropFragment();
        cropFragment.setArguments(bundle);
        return cropFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof CropFragmentListener) {
            this.getSponsorBeneficiariesState = (CropFragmentListener) getParentFragment();
        } else {
            if (context instanceof CropFragmentListener) {
                this.getSponsorBeneficiariesState = (CropFragmentListener) context;
                return;
            }
            throw new IllegalArgumentException(context + " must implement CropFragmentListener");
        }
    }

    public void setCropFragmentListener(CropFragmentListener cropFragmentListener) {
        this.getSponsorBeneficiariesState = cropFragmentListener;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = getLayoutInflater(layoutInflater).inflate(R.layout.ucrop_fragment_ucrop, viewGroup, false);
        Bundle arguments = getArguments();
        setupViews(viewInflate, arguments);
        component1(arguments);
        ShareDataUIState();
        copydefault(viewInflate);
        return viewInflate;
    }

    public void setupViews(View view, Bundle bundle) {
        MenuItem menuItemShareDataUIState = ShareDataUIState(view, bundle);
        Drawable icon = menuItemShareDataUIState.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.g, PorterDuff.Mode.SRC_ATOP);
                menuItemShareDataUIState.setIcon(icon);
            } catch (IllegalStateException e) {
                L.e(e.getMessage());
            }
            ((Animatable) menuItemShareDataUIState.getIcon()).start();
        }
        MenuItem menuItemFindItem = this.h.getMenu().findItem(R.id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), this.e);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.g, PorterDuff.Mode.SRC_ATOP);
            menuItemFindItem.setIcon(drawable);
        }
        component1(false);
        this.h.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (!CropFragment.this.isAdded() || menuItem.getItemId() != R.id.menu_crop) {
                    return false;
                }
                CropFragment.this.cropAndSaveImage();
                return true;
            }
        });
        copydefault(view, bundle);
        component2(view);
        this.getSponsorBeneficiariesState.onCropLoading(true);
        if (this.f3802c) {
            component2(view, bundle);
        } else {
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.ucrop_frame).getLayoutParams()).bottomMargin = 0;
            view.findViewById(R.id.ucrop_frame).requestLayout();
        }
    }

    private void copydefault(View view, Bundle bundle) {
        this.component1 = bundle.getInt(Crop.Options.EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_widget_active));
        this.coroutineCreation = bundle.getInt(Crop.Options.EXTRA_UCROP_LOGO_COLOR, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_default_logo));
        this.f3802c = !bundle.getBoolean(Crop.Options.EXTRA_HIDE_BOTTOM_CONTROLS, false);
        this.coroutineBoundary = bundle.getInt(Crop.Options.EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_crop_background));
    }

    private void component2(View view, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.controls_wrapper);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.ucrop_controls, viewGroup, true);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.state_aspect_ratio);
        this.hExternalSyntheticLambda0 = viewGroup2;
        viewGroup2.setOnClickListener(this.f3801b);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.state_rotate);
        this.l = viewGroup3;
        viewGroup3.setOnClickListener(this.f3801b);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.state_scale);
        this.k = viewGroup4;
        viewGroup4.setOnClickListener(this.f3801b);
        this.toString = (ViewGroup) view.findViewById(R.id.layout_aspect_ratio);
        this.CoroutineDebuggingKt = (ViewGroup) view.findViewById(R.id.layout_rotate_wheel);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = (ViewGroup) view.findViewById(R.id.layout_scale_wheel);
        ShareDataUIState(bundle, view);
        equals(view);
        copy(view);
        component4(view);
    }

    private MenuItem ShareDataUIState(View view, Bundle bundle) {
        StatusBarUtils.saveStatusBarStyle(getActivity());
        this.f3800a = bundle.getInt(Crop.Options.EXTRA_STATUS_BAR_COLOR, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_statusbar));
        StatusBarUtils.setStatusBarColor(getActivity(), this.f3800a);
        StatusBarUtils.setStatusBarLightMode((Activity) getActivity(), true);
        this.invokeSuspend = bundle.getInt(Crop.Options.EXTRA_TOOL_BAR_COLOR, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_toolbar));
        this.g = bundle.getInt(Crop.Options.EXTRA_UCROP_WIDGET_COLOR_TOOLBAR, ContextCompat.getColor(view.getContext(), R.color.ucrop_color_toolbar_widget));
        this.e = bundle.getInt(Crop.Options.EXTRA_UCROP_WIDGET_CROP_DRAWABLE, R.drawable.ucrop_ic_done);
        String string = bundle.getString(Crop.Options.EXTRA_UCROP_TITLE_TEXT_TOOLBAR);
        this.f = string;
        if (string == null) {
            string = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.f = string;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.h = toolbar;
        toolbar.setBackgroundColor(this.invokeSuspend);
        this.h.setTitle(this.f);
        this.h.setTitleTextColor(this.g);
        this.h.setNavigationIcon(R.drawable.ucrop_ic_cross);
        this.h.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Callback.onClick_enter(view2);
                try {
                    CropFragment.this.getSponsorBeneficiariesState.onCropFinish(CropFragment.this.getError(new Exception("cancel")));
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        this.h.inflateMenu(R.menu.ucrop_menu);
        return this.h.getMenu().findItem(R.id.menu_loader);
    }

    @Override
    public void onDestroyView() {
        StatusBarUtils.resetStatusBarStyle(getActivity());
        super.onDestroyView();
    }

    private void component1(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Uri uri = (Uri) bundle.getParcelable(Crop.EXTRA_INPUT_URI);
        Uri uri2 = (Uri) bundle.getParcelable(Crop.EXTRA_OUTPUT_URI);
        component3(bundle);
        if (uri != null && uri2 != null) {
            try {
                this.getShareableDataState.setImageUri(uri, uri2);
                return;
            } catch (Exception e) {
                this.getSponsorBeneficiariesState.onCropFinish(getError(e));
                return;
            }
        }
        this.getSponsorBeneficiariesState.onCropFinish(getError(new NullPointerException(getString(R.string.ucrop_error_input_data))));
    }

    private void component3(Bundle bundle) {
        String string = bundle.getString(Crop.Options.EXTRA_COMPRESSION_FORMAT_NAME);
        Bitmap.CompressFormat compressFormatValueOf = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (compressFormatValueOf == null) {
            compressFormatValueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.equals = compressFormatValueOf;
        this.getAsAtTimestamp = bundle.getInt(Crop.Options.EXTRA_COMPRESSION_QUALITY, 90);
        int[] intArray = bundle.getIntArray(Crop.Options.EXTRA_ALLOWED_GESTURES);
        if (intArray != null && intArray.length == 3) {
            this.getRequestBeneficiariesState = intArray;
        }
        copydefault(bundle);
        component2(bundle);
        int i = bundle.getInt(Crop.EXTRA_MAX_SIZE_X, 0);
        int i2 = bundle.getInt(Crop.EXTRA_MAX_SIZE_Y, 0);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.getShareableDataState.setMaxResultImageSizeX(i);
        this.getShareableDataState.setMaxResultImageSizeY(i2);
    }

    private void component2(Bundle bundle) {
        float f = bundle.getFloat(Crop.EXTRA_ASPECT_RATIO_X, -1.0f);
        float f2 = bundle.getFloat(Crop.EXTRA_ASPECT_RATIO_Y, -1.0f);
        int i = bundle.getInt(Crop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Crop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (f >= 0.0f && f2 > 0.0f) {
            ViewGroup viewGroup = this.hExternalSyntheticLambda0;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f3 = f / f2;
            this.getShareableDataState.setTargetAspectRatio(Float.isNaN(f3) ? 0.0f : f3);
            return;
        }
        if (parcelableArrayList != null && i < parcelableArrayList.size()) {
            float aspectRatioX = ((AspectRatio) parcelableArrayList.get(i)).getAspectRatioX() / ((AspectRatio) parcelableArrayList.get(i)).getAspectRatioY();
            this.getShareableDataState.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        } else {
            this.getShareableDataState.setTargetAspectRatio(0.0f);
        }
    }

    private void copydefault(Bundle bundle) {
        this.getShareableDataState.setMaxBitmapSize(bundle.getInt(Crop.Options.EXTRA_MAX_BITMAP_SIZE, 0));
        this.getShareableDataState.setMaxScaleMultiplier(bundle.getFloat(Crop.Options.EXTRA_MAX_SCALE_MULTIPLIER, 10.0f));
        this.getShareableDataState.setImageToWrapCropBoundsAnimDuration(bundle.getInt(Crop.Options.EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION, 500));
        this.accessartificialFrame.setFreestyleCropEnabled(bundle.getBoolean(Crop.Options.EXTRA_FREE_STYLE_CROP, false));
        this.accessartificialFrame.setDimmedColor(bundle.getInt(Crop.Options.EXTRA_DIMMED_LAYER_COLOR, getResources().getColor(R.color.ucrop_color_default_dimmed)));
        this.accessartificialFrame.setCircleDimmedLayer(bundle.getBoolean(Crop.Options.EXTRA_CIRCLE_DIMMED_LAYER, false));
        this.accessartificialFrame.setShowCropFrame(bundle.getBoolean(Crop.Options.EXTRA_SHOW_CROP_FRAME, true));
        this.accessartificialFrame.setCropFrameColor(bundle.getInt(Crop.Options.EXTRA_CROP_FRAME_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.accessartificialFrame.setCropFrameStrokeWidth(bundle.getInt(Crop.Options.EXTRA_CROP_FRAME_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.accessartificialFrame.setShowCropGrid(bundle.getBoolean(Crop.Options.EXTRA_SHOW_CROP_GRID, false));
        this.accessartificialFrame.setCropGridRowCount(bundle.getInt(Crop.Options.EXTRA_CROP_GRID_ROW_COUNT, 2));
        this.accessartificialFrame.setCropGridColumnCount(bundle.getInt(Crop.Options.EXTRA_CROP_GRID_COLUMN_COUNT, 2));
        this.accessartificialFrame.setCropGridColor(bundle.getInt(Crop.Options.EXTRA_CROP_GRID_COLOR, getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        this.accessartificialFrame.setCropGridStrokeWidth(bundle.getInt(Crop.Options.EXTRA_CROP_GRID_STROKE_WIDTH, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width)));
    }

    private void component2(View view) {
        CropView cropView = (CropView) view.findViewById(R.id.ucrop);
        this.ArtificialStackFrames = cropView;
        this.getShareableDataState = cropView.getCropImageView();
        this.accessartificialFrame = this.ArtificialStackFrames.getOverlayView();
        this.getShareableDataState.setTransformImageListener(this.hashCode);
        ((ImageView) view.findViewById(R.id.image_view_logo)).setColorFilter(this.coroutineCreation, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R.id.ucrop_frame).setBackgroundColor(this.coroutineBoundary);
    }

    private void component4(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.image_view_state_aspect_ratio);
        if (imageView != null) {
            imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.component1));
        }
        if (imageView2 != null) {
            imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.component1));
        }
        if (imageView3 != null) {
            imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.component1));
        }
    }

    private void ShareDataUIState(Bundle bundle, View view) {
        int i = bundle.getInt(Crop.Options.EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT, 0);
        ArrayList<AspectRatio> parcelableArrayList = bundle.getParcelableArrayList(Crop.Options.EXTRA_ASPECT_RATIO_OPTIONS);
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(Locale.ENGLISH), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio(null, 16.0f, 9.0f));
            i = 2;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        for (AspectRatio aspectRatio : parcelableArrayList) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectTextView aspectTextView = (AspectTextView) frameLayout.getChildAt(0);
            aspectTextView.setActiveColor(this.component1);
            aspectTextView.setAspectRatio(aspectRatio);
            if (linearLayout != null) {
                linearLayout.addView(frameLayout);
            }
            this.component4.add(frameLayout);
        }
        this.component4.get(i).setSelected(true);
        Iterator<ViewGroup> it = this.component4.iterator();
        while (it.hasNext()) {
            ShareDataUIState(it.next());
        }
    }

    private void ShareDataUIState(ViewGroup viewGroup) {
        viewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    CropFragment.this.component3(view);
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
    }

    public void component3(View view) {
        this.getShareableDataState.setTargetAspectRatio(((AspectTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
        this.getShareableDataState.setImageToWrapCropBound();
        if (view.isSelected()) {
            return;
        }
        Iterator<ViewGroup> it = this.component4.iterator();
        while (it.hasNext()) {
            ViewGroup next = it.next();
            next.setSelected(next == view);
        }
    }

    private void equals(View view) {
        this.invoke = (TextView) view.findViewById(R.id.text_view_rotate);
        ((HorizontalProgressView) view.findViewById(R.id.rotate_scroll_wheel)).setScrollingListener(new HorizontalProgressView.ScrollingListener() {
            @Override
            public void onScroll(float f, float f2) {
                CropFragment.this.getShareableDataState.postRotate(f / 42.0f);
            }

            @Override
            public void onScrollEnd() {
                CropFragment.this.getShareableDataState.setImageToWrapCropBound();
            }

            @Override
            public void onScrollStart() {
                CropFragment.this.getShareableDataState.cancelAllAnimations();
            }
        });
        ((HorizontalProgressView) view.findViewById(R.id.rotate_scroll_wheel)).setMiddleLineColor(this.component1);
        view.findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                CropFragment.component2(this.f$0, view2);
            }
        });
        view.findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                CropFragment.component1(this.f$0, view2);
            }
        });
        copydefault(this.component1);
    }

    private void component1(View view) {
        component2();
    }

    private void ShareDataUIState(View view) {
        ShareDataUIState(90);
    }

    private void copy(View view) {
        this.f3803d = (TextView) view.findViewById(R.id.text_view_scale);
        ((HorizontalProgressView) view.findViewById(R.id.scale_scroll_wheel)).setScrollingListener(new HorizontalProgressView.ScrollingListener() {
            @Override
            public void onScroll(float f, float f2) {
                if (f > 0.0f) {
                    CropFragment.this.getShareableDataState.zoomInImage(CropFragment.this.getShareableDataState.getCurrentScale() + (f * ((CropFragment.this.getShareableDataState.getMaxScale() - CropFragment.this.getShareableDataState.getMinScale()) / 15000.0f)));
                } else {
                    CropFragment.this.getShareableDataState.zoomOutImage(CropFragment.this.getShareableDataState.getCurrentScale() + (f * ((CropFragment.this.getShareableDataState.getMaxScale() - CropFragment.this.getShareableDataState.getMinScale()) / 15000.0f)));
                }
            }

            @Override
            public void onScrollEnd() {
                CropFragment.this.getShareableDataState.setImageToWrapCropBound();
            }

            @Override
            public void onScrollStart() {
                CropFragment.this.getShareableDataState.cancelAllAnimations();
            }
        });
        ((HorizontalProgressView) view.findViewById(R.id.scale_scroll_wheel)).setMiddleLineColor(this.component1);
        component2(this.component1);
    }

    public void component2(float f) {
        TextView textView = this.invoke;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f)));
        }
    }

    private void copydefault(int i) {
        TextView textView = this.invoke;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void component3(float f) {
        TextView textView = this.f3803d;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f * 100.0f))));
        }
    }

    private void component2(int i) {
        TextView textView = this.f3803d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private void component2() {
        GestureCropImageView gestureCropImageView = this.getShareableDataState;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.getShareableDataState.setImageToWrapCropBound();
    }

    private void ShareDataUIState(int i) {
        this.getShareableDataState.postRotate(i);
        this.getShareableDataState.setImageToWrapCropBound();
    }

    private void ShareDataUIState() {
        if (this.f3802c) {
            if (this.hExternalSyntheticLambda0.getVisibility() == 0) {
                component4(R.id.state_aspect_ratio);
                return;
            } else {
                component4(R.id.state_scale);
                return;
            }
        }
        component1(0);
    }

    public void component4(int i) {
        if (this.f3802c) {
            this.hExternalSyntheticLambda0.setSelected(i == R.id.state_aspect_ratio);
            this.l.setSelected(i == R.id.state_rotate);
            this.k.setSelected(i == R.id.state_scale);
            this.toString.setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
            this.CoroutineDebuggingKt.setVisibility(i == R.id.state_rotate ? 0 : 8);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(i == R.id.state_scale ? 0 : 8);
            component3(i);
            if (i == R.id.state_scale) {
                component1(0);
            } else if (i == R.id.state_rotate) {
                component1(1);
            } else {
                component1(2);
            }
        }
    }

    private void component3(int i) {
        this.k.findViewById(R.id.text_view_scale).setVisibility(i == R.id.state_scale ? 0 : 8);
        this.hExternalSyntheticLambda0.findViewById(R.id.text_view_crop).setVisibility(i == R.id.state_aspect_ratio ? 0 : 8);
        this.l.findViewById(R.id.text_view_rotate).setVisibility(i == R.id.state_rotate ? 0 : 8);
    }

    private void component1(int i) {
        GestureCropImageView gestureCropImageView = this.getShareableDataState;
        int i2 = this.getRequestBeneficiariesState[i];
        boolean z = true;
        gestureCropImageView.setScaleEnabled(i2 == 3 || i2 == 1);
        GestureCropImageView gestureCropImageView2 = this.getShareableDataState;
        int i3 = this.getRequestBeneficiariesState[i];
        if (i3 != 3 && i3 != 2) {
            z = false;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    private void copydefault(View view) {
        if (this.copy == null) {
            this.copy = new View(getContext());
            this.copy.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.copy.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R.id.ucrop_photobox)).addView(this.copy);
    }

    private void component1(boolean z) {
        this.h.getMenu().findItem(R.id.menu_loader).setVisible(z);
        this.h.getMenu().findItem(R.id.menu_crop).setVisible(!z);
    }

    public void cropAndSaveImage() {
        this.copy.setClickable(true);
        component1(true);
        this.getSponsorBeneficiariesState.onCropLoading(true);
        this.getShareableDataState.cropAndSaveImage(this.equals, this.getAsAtTimestamp, new BitmapCropCallback() {
            @Override
            public void onBitmapCropped(Uri uri, int i, int i2, int i3, int i4) {
                CropFragmentListener cropFragmentListener = CropFragment.this.getSponsorBeneficiariesState;
                CropFragment cropFragment = CropFragment.this;
                cropFragmentListener.onCropFinish(cropFragment.getResult(uri, cropFragment.getShareableDataState.getTargetAspectRatio(), i, i2, i3, i4));
                CropFragment.this.getSponsorBeneficiariesState.onCropLoading(false);
            }

            @Override
            public void onCropFailure(Throwable th) {
                CropFragment.this.getSponsorBeneficiariesState.onCropFinish(CropFragment.this.getError(th));
            }
        });
    }

    protected UCropResult getResult(Uri uri, float f, int i, int i2, int i3, int i4) {
        return new UCropResult(-1, new Intent().putExtra(Crop.EXTRA_OUTPUT_URI, uri).putExtra(Crop.EXTRA_OUTPUT_CROP_ASPECT_RATIO, f).putExtra(Crop.EXTRA_OUTPUT_IMAGE_WIDTH, i3).putExtra(Crop.EXTRA_OUTPUT_IMAGE_HEIGHT, i4).putExtra(Crop.EXTRA_OUTPUT_OFFSET_X, i).putExtra(Crop.EXTRA_OUTPUT_OFFSET_Y, i2));
    }

    protected UCropResult getError(Throwable th) {
        return new UCropResult(96, new Intent().putExtra(Crop.EXTRA_ERROR, th));
    }

    public static void component2(CropFragment cropFragment, View view) {
        Callback.onClick_enter(view);
        try {
            cropFragment.component1(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static void component1(CropFragment cropFragment, View view) {
        Callback.onClick_enter(view);
        try {
            cropFragment.ShareDataUIState(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static class UCropResult {
        public int resultCode;
        public Intent resultData;

        public UCropResult(int i, Intent intent) {
            this.resultCode = i;
            this.resultData = intent;
        }
    }
}
