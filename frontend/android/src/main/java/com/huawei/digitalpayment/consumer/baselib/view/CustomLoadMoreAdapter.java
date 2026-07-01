package com.huawei.digitalpayment.consumer.baselib.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.chad.library.adapter4.loadState.LoadState;
import com.chad.library.adapter4.loadState.trailing.TrailingLoadStateAdapter;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/view/CustomLoadMoreAdapter;", "Lcom/chad/library/adapter4/loadState/trailing/TrailingLoadStateAdapter;", "Lcom/huawei/digitalpayment/consumer/baselib/view/CustomLoadMoreAdapter$CustomLoadMoreVH;", "isLoadEndDisplay", "", "<init>", "(Z)V", "ANIMATOR_DURATION", "", "animationView", "Landroid/widget/ImageView;", "animator", "Landroid/animation/ObjectAnimator;", "loadingDrawable", "Landroid/graphics/drawable/Drawable;", "onBindViewHolder", "", "holder", "loadState", "Lcom/chad/library/adapter4/loadState/LoadState;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "getStateViewType", "setLoadingView", "loadingView", "Landroid/view/View;", "startAnimation", "endAnimation", "setLoadingDrawable", "drawable", "CustomLoadMoreVH", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CustomLoadMoreAdapter extends TrailingLoadStateAdapter<CustomLoadMoreVH> {
    private final int ShareDataUIState;
    private ObjectAnimator component1;
    private Drawable component2;
    private ImageView component3;
    private static final byte[] $$c = {63, 67, 46, -88};
    private static final int $$f = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {79, -25, -14, 102, -17, -3, 58, -56, -16, -2, 2, -4, -6, -4, 46, -62, -16, 4, -18, Ascii.FF, -18, 63, -64, -9, 7, -11, -3, TarHeader.LF_SYMLINK, -71, 3, -12, -10, 0, 60, -78, 9, 0, -8, -3, -20, 65, -39, -29, -12, -10, 0, 40, -53, -2, -13, -1, 9, 10, -24, -1, -23, 78, -20, -17, -3, -8, -4, -4, 4, -14, -11, 62};
    private static final int $$e = 213;
    private static final byte[] $$a = {81, 99, 107, 124, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
    private static final int $$b = 227;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int[] copydefault = {26471710, 1915683523, -1583378989, 921932216, -2054400729, -1754171326, 2078798260, -2045143599, 1542069187, 2012487235, -1645975203, -1996210675, -1535363906, 1848036227, -79987974, 642951532, 719159322, -1596098794};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r7, byte r8, byte r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 104
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.baselib.view.CustomLoadMoreAdapter.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.view.CustomLoadMoreAdapter.$$g(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 16 - r6
            int r8 = r8 + 4
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.baselib.view.CustomLoadMoreAdapter.$$a
            byte[] r0 = new byte[r0]
            int r6 = 15 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-16)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.view.CustomLoadMoreAdapter.a(byte, int, byte, java.lang.Object[]):void");
    }

    private static void c(byte b2, short s, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 99 - (s * 2);
        int i3 = 58 - (b2 * TarHeader.LF_FIFO);
        int i4 = i * 45;
        byte[] bArr2 = new byte[55 - i4];
        int i5 = 54 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = (i3 + (-i2)) - 5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3++;
                i2 = (i2 + (-bArr[i3])) - 5;
            }
        }
    }

    public CustomLoadMoreAdapter(boolean z) {
        super(z);
        this.ShareDataUIState = 2000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomLoadMoreAdapter(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4 + 17;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = true;
        }
        this(z);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, LoadState loadState) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        onBindViewHolder((CustomLoadMoreVH) viewHolder, loadState);
        if (i3 != 0) {
            throw null;
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, LoadState loadState) throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 119;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        CustomLoadMoreVH customLoadMoreVHM10243onCreateViewHolder = m10243onCreateViewHolder(viewGroup, loadState);
        if (i3 != 0) {
            return customLoadMoreVHM10243onCreateViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/view/CustomLoadMoreAdapter$CustomLoadMoreVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "loadCompleteView", "getLoadCompleteView", "()Landroid/view/View;", "loadingView", "getLoadingView", "loadFailView", "getLoadFailView", "loadEndView", "getLoadEndView", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomLoadMoreVH extends RecyclerView.ViewHolder {
        private static int component3 = 0;
        private static int getRequestBeneficiariesState = 1;
        private final View ShareDataUIState;
        private final View component1;
        private final View component2;
        private final View copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public CustomLoadMoreVH(ViewGroup viewGroup, View view, int i, DefaultConstructorMarker defaultConstructorMarker) {
            LayoutInflater layoutInflaterFrom;
            int i2;
            boolean z;
            if ((i & 2) != 0) {
                int i3 = component3 + 69;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 == 0) {
                    layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                    i2 = R.layout.view_load_more;
                    z = true;
                } else {
                    layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                    i2 = R.layout.view_load_more;
                    z = false;
                }
                view = layoutInflaterFrom.inflate(i2, viewGroup, z);
                int i4 = 2 % 2;
            }
            this(viewGroup, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomLoadMoreVH(ViewGroup viewGroup, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = this.itemView.findViewById(R.id.load_more_load_complete_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.component1 = viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.load_more_loading_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.load_more_load_fail_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.ShareDataUIState = viewFindViewById3;
            View viewFindViewById4 = this.itemView.findViewById(R.id.load_more_load_end_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.component2 = viewFindViewById4;
        }

        public final View getLoadCompleteView() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 63;
            getRequestBeneficiariesState = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            View view = this.component1;
            int i4 = i2 + 27;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return view;
            }
            obj.hashCode();
            throw null;
        }

        public final View getLoadingView() {
            int i = 2 % 2;
            int i2 = component3 + 103;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View view = this.copydefault;
            int i4 = i3 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return view;
        }

        public final View getLoadFailView() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 101;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            View view = this.ShareDataUIState;
            int i5 = i2 + 53;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 74 / 0;
            }
            return view;
        }

        public final View getLoadEndView() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 15;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            View view = this.component2;
            int i5 = i2 + 69;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return view;
            }
            throw null;
        }
    }

    public void onBindViewHolder(CustomLoadMoreVH holder, LoadState loadState) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(loadState, "");
        if (loadState instanceof LoadState.NotLoading) {
            int i4 = getAsAtTimestamp + 37;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            if (loadState.getEndOfPaginationReached()) {
                int i6 = component4 + 97;
                getAsAtTimestamp = i6 % 128;
                if (i6 % 2 == 0) {
                    holder.getLoadCompleteView().setVisibility(83);
                    holder.getLoadingView().setVisibility(56);
                    holder.getLoadFailView().setVisibility(35);
                } else {
                    holder.getLoadCompleteView().setVisibility(8);
                    holder.getLoadingView().setVisibility(8);
                    holder.getLoadFailView().setVisibility(8);
                }
                holder.getLoadEndView().setVisibility(0);
            } else {
                holder.getLoadCompleteView().setVisibility(0);
                holder.getLoadingView().setVisibility(8);
                holder.getLoadFailView().setVisibility(8);
                holder.getLoadEndView().setVisibility(8);
            }
        } else if (loadState instanceof LoadState.Loading) {
            int i7 = component4 + 97;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 == 0) {
                holder.getLoadCompleteView().setVisibility(16);
                holder.getLoadingView().setVisibility(1);
                holder.getLoadFailView().setVisibility(89);
                holder.getLoadEndView().setVisibility(21);
            } else {
                holder.getLoadCompleteView().setVisibility(8);
                holder.getLoadingView().setVisibility(0);
                holder.getLoadFailView().setVisibility(8);
                holder.getLoadEndView().setVisibility(8);
            }
            int i8 = getAsAtTimestamp + 85;
            component4 = i8 % 128;
            int i9 = i8 % 2;
        } else if (loadState instanceof LoadState.Error) {
            holder.getLoadCompleteView().setVisibility(8);
            holder.getLoadingView().setVisibility(8);
            holder.getLoadFailView().setVisibility(0);
            holder.getLoadEndView().setVisibility(8);
        } else {
            if (!(loadState instanceof LoadState.None)) {
                throw new NoWhenBranchMatchedException();
            }
            holder.getLoadCompleteView().setVisibility(8);
            holder.getLoadingView().setVisibility(8);
            holder.getLoadFailView().setVisibility(8);
            holder.getLoadEndView().setVisibility(8);
        }
        if (!Intrinsics.areEqual(loadState, LoadState.Loading.INSTANCE)) {
            component3();
        } else {
            ShareDataUIState(holder.getLoadingView());
            component2();
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = copydefault;
        int i4 = 684241640;
        long j = 0;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i7]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i2;
                        byte b3 = (byte) (b2 - 3);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFloat(i6) > 0.0f ? 1 : (TypedValue.complexToFloat(i6) == 0.0f ? 0 : -1)), 38 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)), (char) KeyEvent.getDeadChar(i6, i6), -309236339, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
                    i4 = 684241640;
                    j = 0;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = copydefault;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 39;
                $11 = i12 % 128;
                int i13 = i12 % i9;
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr6[i11]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 2;
                    byte b5 = (byte) (b4 - 3);
                    iArr2 = iArr6;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4390 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getFadingEdgeLength() >> 16) + 37, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), -309236339, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i11++;
                iArr6 = iArr2;
                i5 = 1;
                i9 = 2;
            }
            iArr6 = iArr7;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i14 = $11 + 49;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i16];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetAfter("", 0) + 16, (char) (49871 - TextUtils.getTrimmedLength("")), 462826032, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i18 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i18;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i19 = getactivenotifications.ShareDataUIState;
            int i20 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 3;
                byte b9 = (byte) (b8 - 4);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27637), -1616366948, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final void component2(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        customLoadMoreAdapter.invokeFailRetry();
        int i4 = component4 + 21;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomLoadMoreVH m10243onCreateViewHolder(ViewGroup parent, LoadState loadState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component4 + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(loadState, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
        if (objCopydefault == null) {
            int size = View.MeasureSpec.getSize(0) + 2984;
            int gidForName = Process.getGidForName("") + 49;
            char edgeSlop = (char) (54462 - (ViewConfiguration.getEdgeSlop() >> 16));
            byte b2 = $$a[18];
            Object[] objArr2 = new Object[1];
            a((byte) (b2 + 1), (byte) (-b2), b2, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(size, gidForName, edgeSlop, 1571866973, false, (String) objArr2[0], null);
        }
        View view = null;
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(22 - View.resolveSizeAndState(0, 0, 0), new int[]{171635341, 2079420562, 758228922, 1562891069, 819876369, -1132488552, 513803024, 169713385, 210231594, 1777441059, 949604067, 182158746}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, new int[]{45885735, -736231459, 1551440550, 1299697950, -629402744, -1967010759, -605809959, 2116757630}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
        if (objCopydefault2 == null) {
            int iBlue = Color.blue(0) + 2984;
            int threadPriority = 48 - ((Process.getThreadPriority(0) + 20) >> 6);
            char gidForName2 = (char) (Process.getGidForName("") + 54463);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) (bArr[31] + 1), (byte) (bArr[18] + 1), (byte) (-bArr[20]), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, threadPriority, gidForName2, -1592726660, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = getAsAtTimestamp + 101;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
            if (objCopydefault3 == null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2984;
                int size2 = 48 - View.MeasureSpec.getSize(0);
                char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 54462);
                byte b3 = $$a[31];
                byte b4 = (byte) (b3 - 5);
                Object[] objArr6 = new Object[1];
                a(b3, b4, (byte) (b4 | Ascii.ETB), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, size2, c2, -635740813, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, new int[1], (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ((1634561272 + (((~(iIdentityHashCode | 694271653)) | (-2104360704)) * 305)) + (((~((~iIdentityHashCode) | 694271653)) | (-1416446175)) * 305)) - 282194041;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(25 - TextUtils.lastIndexOf("", '0', 0, 0), new int[]{171635341, 2079420562, 758228922, 1562891069, 1357065251, 140307957, 1748662760, 595977166, 1341072885, 344209880, 1031011725, -163246186, 1193149682, -434323191}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(17 - TextUtils.lastIndexOf("", '0'), new int[]{-235700068, 551566081, -707907152, -343031184, 1995279804, -247005237, -1537377661, -2127840419, -745291680, 638702317}, objArr9);
            Method method = cls2.getMethod((String) objArr9[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new int[]{-1421228652, 43877527, 1860599679, 575078058, 505485884, -1933398098, 1284500216, -96407156}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(16 - (Process.myPid() >> 22), new int[]{-1410203361, -1452515763, -1244886836, -594432383, -1070716915, -1435702414, -630674026, 1973753831}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -282194041};
                byte[] bArr2 = $$d;
                byte b5 = (byte) (-bArr2[50]);
                byte b6 = bArr2[32];
                Object[] objArr13 = new Object[1];
                c(b5, b6, b6, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b7 = bArr2[32];
                Object[] objArr14 = new Object[1];
                c(b7, b7, (byte) (-bArr2[50]), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i9 = component4 + 67;
                    getAsAtTimestamp = i9 % 128;
                    int i10 = i9 % 2;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                    if (objCopydefault4 == null) {
                        int iIndexOf = 2983 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int packedPositionGroup = 48 - ExpandableListView.getPackedPositionGroup(0L);
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 54463);
                        byte b8 = $$a[31];
                        byte b9 = (byte) (b8 - 5);
                        Object[] objArr15 = new Object[1];
                        a(b8, b9, (byte) (b9 | Ascii.ETB), objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, packedPositionGroup, cIndexOf, -635740813, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(22 - ExpandableListView.getPackedPositionType(0L), new int[]{171635341, 2079420562, 758228922, 1562891069, 819876369, -1132488552, 513803024, 169713385, 210231594, 1777441059, 949604067, 182158746}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(Color.alpha(0) + 15, new int[]{45885735, -736231459, 1551440550, 1299697950, -629402744, -1967010759, -605809959, 2116757630}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                        if (objCopydefault5 == null) {
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2984;
                            int iRed = Color.red(0) + 48;
                            char cResolveSize = (char) (54462 - View.resolveSize(0, 0));
                            byte[] bArr3 = $$a;
                            Object[] objArr18 = new Object[1];
                            a((byte) (bArr3[31] + 1), (byte) (bArr3[18] + 1), (byte) (-bArr3[20]), objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iRed, cResolveSize, -1592726660, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                        if (objCopydefault6 == null) {
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2985;
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 48;
                            char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0, 0) + 54462);
                            byte b10 = $$a[18];
                            Object[] objArr19 = new Object[1];
                            a((byte) (b10 + 1), (byte) (-b10), b10, objArr19);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, keyRepeatDelay, cIndexOf2, 1571866973, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                        int i11 = getAsAtTimestamp + 19;
                        component4 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[1])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[2])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode2;
            int i17 = i15 + (-882891954) + (((~((-1043697944) | i16)) | (-1067019885)) * (-865)) + ((~(iIdentityHashCode2 | 1043697943)) * 865) + (((~((-1067019885) | i16)) | (~(i16 | 1043697943))) * 865);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr20[2])[0] = i19 ^ (i19 << 5);
            int i20 = ((int[]) objArr20[2])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr20[0])[0]}, new int[]{((int[]) objArr20[1])[0]}, new int[1], (String[]) objArr20[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i21 = ~iIdentityHashCode3;
            int i22 = i20 + (-872906169) + (((-1820868954) | iIdentityHashCode3) * (-676)) + (((~(287555110 | i21)) | 1820868953) * 676) + (((~(iIdentityHashCode3 | 2108424063)) | (~(i21 | (-1823162718))) | 2293764) * 676);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[2])[0] = i24 ^ (i24 << 5);
            int i25 = ((int[]) objArr21[2])[0];
            int i26 = ((i25 * i25) - (~(-(1685907555 * i25)))) - 1;
            int i27 = -(i25 * (-253515173));
            int i28 = ((i26 & i27) + (i27 | i26)) - (-598167873);
            int i29 = i28 >> 18;
            int i30 = (((i29 | (-32767)) << 1) - (i29 ^ (-32767))) / 16384;
            int i31 = (i30 & 1) + (i30 | 1);
            int i32 = ((i28 | i31) << 1) - (i31 ^ i28);
            int i33 = i28 >> 16;
            int i34 = -(i32 ^ ((((i33 ^ (-131071)) + ((i33 & (-131071)) << 1)) / 65536) + 1));
            int i35 = (i34 ^ 1) + ((i34 & 1) << 1);
            int i36 = ((i35 >> 26) + ComposerKt.defaultsKey) / 64;
            int i37 = (i36 & 1) + (i36 | 1);
            CustomLoadMoreVH customLoadMoreVH = new CustomLoadMoreVH(parent, view, 1138 / (((-(((i37 | 1) << 1) - (1 ^ i37))) & i35) * 569), null == true ? 1 : 0);
            customLoadMoreVH.getLoadFailView().setOnClickListener(new View.OnClickListener() {
                private static int component1 = 0;
                private static int component2 = 1;

                @Override
                public final void onClick(View view2) {
                    int i38 = 2 % 2;
                    int i39 = component2 + 53;
                    component1 = i39 % 128;
                    if (i39 % 2 != 0) {
                        CustomLoadMoreAdapter.$r8$lambda$clkwkohPJk7QBdeAp7Td8G60qwY(this.f$0, view2);
                        int i40 = 75 / 0;
                    } else {
                        CustomLoadMoreAdapter.$r8$lambda$clkwkohPJk7QBdeAp7Td8G60qwY(this.f$0, view2);
                    }
                    int i41 = component2 + 109;
                    component1 = i41 % 128;
                    if (i41 % 2 != 0) {
                        throw null;
                    }
                }
            });
            customLoadMoreVH.getLoadCompleteView().setOnClickListener(new View.OnClickListener() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public final void onClick(View view2) {
                    int i38 = 2 % 2;
                    int i39 = component2 + 113;
                    component1 = i39 % 128;
                    if (i39 % 2 == 0) {
                        CustomLoadMoreAdapter.$r8$lambda$XCODVOTM01U1HORqagwiZTKVtRw(this.f$0, view2);
                        throw null;
                    }
                    CustomLoadMoreAdapter.$r8$lambda$XCODVOTM01U1HORqagwiZTKVtRw(this.f$0, view2);
                    int i40 = component1 + 61;
                    component2 = i40 % 128;
                    int i41 = i40 % 2;
                }
            });
            return customLoadMoreVH;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            for (String str : strArr) {
                int i38 = component4 + 123;
                getAsAtTimestamp = i38 % 128;
                int i39 = i38 % 2;
                arrayList.add(str);
            }
        }
        long j2 = -1;
        long j3 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 3) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), 42 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr22 = {-1766940710, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getWindowTouchSlop() >> 8), 56 - Drawable.resolveOpacity(0, 0), (char) ExpandableListView.getPackedPositionType(0L), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr22);
            int i40 = ((int[]) objArr[2])[0];
            Object[] objArr23 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i41 = i40 + (-289293253) + (((~((-1300227328) | startElapsedRealtime)) | 810490500) * (-366)) + (((~(startElapsedRealtime | (-1295049852))) | 805313024) * 366);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr23[2])[0] = i43 ^ (i43 << 5);
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    private static final void component1(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        customLoadMoreAdapter.invokeLoadMore();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component4 + 41;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getStateViewType(LoadState loadState) {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loadState, "");
        int i4 = R.layout.view_load_more;
        int i5 = component4 + 89;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private final void ShareDataUIState(View view) {
        int i = 2 % 2;
        int i2 = component4 + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_loading);
        Drawable drawable = this.component2;
        Object obj = null;
        if (drawable != null) {
            int i4 = component4 + 97;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                imageView.setImageDrawable(drawable);
                this.component2 = null;
            } else {
                imageView.setImageDrawable(drawable);
                this.component2 = null;
                obj.hashCode();
                throw null;
            }
        }
        if (this.component1 != null || imageView == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
        this.component1 = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(this.ShareDataUIState);
        }
        ObjectAnimator objectAnimator = this.component1;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        ObjectAnimator objectAnimator2 = this.component1;
        if (objectAnimator2 != null) {
            int i5 = getAsAtTimestamp + 93;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                objectAnimator2.setRepeatCount(-1);
                obj.hashCode();
                throw null;
            }
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.component1;
        if (objectAnimator3 != null) {
            objectAnimator3.setRepeatMode(1);
        }
        this.component3 = imageView;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ObjectAnimator objectAnimator = this.component1;
        if (objectAnimator != null) {
            objectAnimator.start();
            int i3 = component4 + 47;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void component3() {
        int i = 2 % 2;
        ObjectAnimator objectAnimator = this.component1;
        if (objectAnimator != null) {
            Intrinsics.checkNotNull(objectAnimator);
            if (objectAnimator.isRunning()) {
                int i2 = getAsAtTimestamp + 115;
                int i3 = i2 % 128;
                component4 = i3;
                int i4 = i2 % 2;
                ObjectAnimator objectAnimator2 = this.component1;
                if (objectAnimator2 != null) {
                    int i5 = i3 + 71;
                    getAsAtTimestamp = i5 % 128;
                    if (i5 % 2 == 0) {
                        objectAnimator2.cancel();
                        throw null;
                    }
                    objectAnimator2.cancel();
                }
                ImageView imageView = this.component3;
                if (imageView != null) {
                    int i6 = getAsAtTimestamp + 47;
                    component4 = i6 % 128;
                    int i7 = i6 % 2;
                    imageView.setRotation(0.0f);
                }
            }
        }
    }

    public final void setLoadingDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = drawable;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
    }

    public static void $r8$lambda$XCODVOTM01U1HORqagwiZTKVtRw(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        copydefault(customLoadMoreAdapter, view);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
    }

    public static void $r8$lambda$clkwkohPJk7QBdeAp7Td8G60qwY(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = component4 + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(customLoadMoreAdapter, view);
        if (i3 == 0) {
            throw null;
        }
    }

    public CustomLoadMoreAdapter() {
        this(false, 1, null);
    }

    private static void ShareDataUIState(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component2(customLoadMoreAdapter, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 63;
            component4 = i4 % 128;
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

    private static void copydefault(CustomLoadMoreAdapter customLoadMoreAdapter, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                component1(customLoadMoreAdapter, view);
            } else {
                component1(customLoadMoreAdapter, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }
}
