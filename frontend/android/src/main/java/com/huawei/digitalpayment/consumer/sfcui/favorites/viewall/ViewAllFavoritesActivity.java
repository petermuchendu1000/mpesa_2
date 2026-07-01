package com.huawei.digitalpayment.consumer.sfcui.favorites.viewall;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.sharedui.compose.databinding.ActivityComposeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/viewall/ViewAllFavoritesActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "manageFavouriteViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "getManageFavouriteViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "manageFavouriteViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/safaricom/sharedui/compose/databinding/ActivityComposeBinding;", "favoriteCategory", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteClick", "favorite", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "onManageFavorites", "Companion", "ConsumerSfcUI_release", "favorites", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/viewall/ViewFavoritesState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ViewAllFavoritesActivity extends Hilt_ViewAllFavoritesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String FAVORITE_CATEGORY = "favoriteCategoryKey";
    public static final String SELECTED_FAVORITE = "selectedFavoriteKey";
    private static char ShareDataUIState;
    private static long component1;
    private static int component2;
    private static char[] component3;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private static char getRequestBeneficiariesState;
    private ActivityComposeBinding binding;
    private String favoriteCategory;

    private final Lazy manageFavouriteViewModel;
    private static final byte[] $$l = {81, 99, 107, 124};
    private static final int $$m = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {108, -1, -36, 99, -8, 63, -70, Ascii.VT, 2, -4, -19, 9, -15, Ascii.SI, -21, 72, -61, -7, -8, 13, -15, 2, Ascii.VT, -13, 60, -67, -3, 9, -15, Ascii.SI, -21, 3, -5, -3, 67, -58, -8, -5, -10, 20, -3, -12, 5, TarHeader.LF_DIR, -26, -40, -5, -10, 20, -3, -12, 5, Ascii.SI, -15, -12, 4, Ascii.FF, -19, -3, -5, 5, 63, -65, -14, -3, -11, 19, -3, -3, 3, -22, 7, -10, -14, 0, -5, -1, -1, 7, -11, -8, SignedBytes.MAX_POWER_OF_TWO, -14, 0, -5, -1, -1, 7, -11, -8, 63, -14, 0, Base64.padSymbol, -71, Ascii.DLE, -7, 3, -19, 7, 4, -14, 0, Base64.padSymbol, -53, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -56, -3, -16, 8, 0, -9, 62, -72, 13, -10, -5, 2, 9, -21, 13, -16, 67, -56, -16, 1, -3, 10, -13, -10, 7, 3, -7, -4, -7, -1, 68, -24, -48, 1, -3, 10, -13, -10, 7, 35, -39, -4, -7, -1, Ascii.US, -20, 0, -19, 9, -8, -1, 33, -43, 78, -49, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, 63, -19, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, TarHeader.LF_DIR, -53, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -59, -8, -8, 67, -55, -14, 0, -2, -4, -1, 62, -61, -7, -8, 13, -15, 2, Ascii.VT, -13, 60, -78, -2, 13, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13};
    private static final int $$k = 204;
    private static final byte[] $$d = {TarHeader.LF_BLK, -107, 59, -11, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 222;
    private static int component4 = 0;
    private static int equals = 1;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r6, int r7, int r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.$$l
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = 119 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.$$n(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r0 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.$$d
            int r6 = 100 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-8)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.g(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = 94 - r8
            int r6 = 224 - r6
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.$$j
            byte[] r0 = new byte[r0]
            int r8 = 93 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r7]
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-2)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.h(short, short, short, java.lang.Object[]):void");
    }

    public static final ManageFavouriteViewModel access$getManageFavouriteViewModel(ViewAllFavoritesActivity viewAllFavoritesActivity) {
        int i = 2 % 2;
        int i2 = equals + 61;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModel = viewAllFavoritesActivity.getManageFavouriteViewModel();
        int i4 = component4 + 107;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return manageFavouriteViewModel;
        }
        throw null;
    }

    public static final void access$onFavoriteClick(ViewAllFavoritesActivity viewAllFavoritesActivity, FavoriteFriendsBean favoriteFriendsBean) {
        int i = 2 % 2;
        int i2 = equals + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        viewAllFavoritesActivity.onFavoriteClick(favoriteFriendsBean);
        int i4 = component4 + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$onManageFavorites(ViewAllFavoritesActivity viewAllFavoritesActivity) {
        int i = 2 % 2;
        int i2 = equals + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        viewAllFavoritesActivity.onManageFavorites();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 75;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/viewall/ViewAllFavoritesActivity$Companion;", "", "<init>", "()V", "FAVORITE_CATEGORY", "", "SELECTED_FAVORITE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ViewAllFavoritesActivity() {
        final ViewAllFavoritesActivity viewAllFavoritesActivity = this;
        final Function0 function0 = null;
        this.manageFavouriteViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ManageFavouriteViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = component1 + 51;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    viewModelStore = viewAllFavoritesActivity.getViewModelStore();
                    int i3 = 37 / 0;
                } else {
                    viewModelStore = viewAllFavoritesActivity.getViewModelStore();
                }
                int i4 = component3 + 7;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 107;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 25;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 71;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = copydefault + 113;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = viewAllFavoritesActivity;
                if (i3 != 0) {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }
                componentActivity.getDefaultViewModelProviderFactory();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i2 = component1 + 21;
                    component3 = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = viewAllFavoritesActivity.getDefaultViewModelCreationExtras();
                int i3 = component3 + 33;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 95;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component3 + 27;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 61 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ManageFavouriteViewModel getManageFavouriteViewModel() {
        int i = 2 % 2;
        int i2 = equals + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ManageFavouriteViewModel manageFavouriteViewModel = (ManageFavouriteViewModel) this.manageFavouriteViewModel.getValue();
        int i4 = equals + 117;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return manageFavouriteViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component3;

        public static final List component1(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 95;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return ShareDataUIState(state);
            }
            ShareDataUIState(state);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final ViewFavoritesState copydefault(State state) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ViewFavoritesState viewFavoritesStateComponent2 = component2(state);
            if (i3 == 0) {
                int i4 = 96 / 0;
            }
            return viewFavoritesStateComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component2(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            component2(composer2, num2.intValue());
            Unit unit2 = Unit.INSTANCE;
            int i3 = component3 + 13;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return unit2;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r12.getSkipping() == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.ShareDataUIState + 87;
            com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.component3 = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            r12.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r12.getSkipping() == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component2(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L31
                int r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.component3
                int r13 = r13 + 15
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.ShareDataUIState = r1
                int r13 = r13 % r0
                if (r13 != 0) goto L1d
                boolean r13 = r12.getSkipping()
                r1 = 60
                int r1 = r1 / 0
                if (r13 != 0) goto L2d
                goto L23
            L1d:
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L2d
            L23:
                int r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.ShareDataUIState
                int r13 = r13 + 87
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.component3 = r1
                int r13 = r13 % r0
                goto L31
            L2d:
                r12.skipToGroupEnd()
                goto L78
            L31:
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.access$getManageFavouriteViewModel(r13)
                kotlinx.coroutines.flow.StateFlow r0 = r13.getFavoriteItems()
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = 8
                r6 = 7
                r4 = r12
                androidx.compose.runtime.State r13 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r0, r1, r2, r3, r4, r5, r6)
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity r0 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.access$getManageFavouriteViewModel(r0)
                kotlinx.coroutines.flow.StateFlow r1 = r0.getViewFavoritesState()
                r4 = 0
                r6 = 8
                r7 = 7
                r5 = r12
                androidx.compose.runtime.State r0 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r1, r2, r3, r4, r5, r6, r7)
                r1 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity$ShareDataUIState$2 r7 = new com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity$ShareDataUIState$2
                com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity r8 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.this
                r7.<init>()
                r13 = 54
                r0 = 319152469(0x1305e155, float:1.6898057E-27)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r0, r8, r7, r12, r13)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.ShareDataUIState.component2(androidx.compose.runtime.Composer, int):void");
        }

        private static final List<FavoriteFriendsBean> ShareDataUIState(State<? extends List<FavoriteFriendsBean>> state) {
            int i = 2 % 2;
            int i2 = component3 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            List<FavoriteFriendsBean> value = state.getValue();
            int i4 = component3 + 17;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final ViewFavoritesState component2(State<ViewFavoritesState> state) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ViewFavoritesState value = state.getValue();
            int i4 = component3 + 125;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
            }
            return value;
        }

        ShareDataUIState() {
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 9;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 63;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 7032, 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1389, 'B' - AndroidCharacter.getMirror('0'), (char) (51269 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), -1883291598, false, $$n(b2, b3, (byte) (b3 | Ascii.DLE)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void e(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 7;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 4037;
                    int iResolveSizeAndState = 31 - View.resolveSizeAndState(i4, i4, i4);
                    char c3 = (char) (19181 - (TypedValue.complexToFloat(i4) > 0.0f ? 1 : (TypedValue.complexToFloat(i4) == 0.0f ? 0 : -1)));
                    byte b2 = (byte) i4;
                    byte b3 = b2;
                    String str$$n = $$n(b2, b3, (byte) (b3 | 20));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iResolveSizeAndState, c3, 1912513118, false, str$$n, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - View.MeasureSpec.getMode(i4), (ViewConfiguration.getTouchSlop() >> 8) + 11, (char) (AndroidCharacter.getMirror('0') - '0'), 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i7);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i4;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.green(i4) + 28, (char) (ViewConfiguration.getScrollBarSize() >> 8), 931716605, false, $$n(b4, b5, (byte) (b5 | Ascii.NAK)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - KeyEvent.keyCodeFromString(""), 11 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i8 = $10 + 9;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 2;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void i(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr3 = component3;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 61;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i6 = $10 + 25;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16769794) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionType(j) + 15, (char) (64291 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 7422, 14 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.getOffsetBefore("", 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i8 = $11 + 83;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i10 = $10 + 53;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 >> b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 >> b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7117, View.MeasureSpec.getMode(0) + 14, (char) (44463 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - TextUtils.getTrimmedLength(""), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27638), 794909189, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr3[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr3[i11];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i12 = $10 + 51;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[i14];
                            cArr4[cancelall.component2 + 1] = cArr3[i15];
                            int i16 = $11 + 103;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                        } else {
                            int i18 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i19 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr3[i18];
                            cArr4[cancelall.component2 + 1] = cArr3[i19];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x17f4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x17f6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x21a1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x21a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0262  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onFavoriteClick(com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.equals
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.String r1 = r4.favoriteCategory
            r3 = 81
            int r3 = r3 / r2
            if (r1 == 0) goto L67
            goto L1b
        L17:
            java.lang.String r1 = r4.favoriteCategory
            if (r1 == 0) goto L67
        L1b:
            java.lang.String r3 = r5.getCategory()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r3 == 0) goto L42
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "selectedFavoriteKey"
            java.io.Serializable r5 = (java.io.Serializable) r5
            r1.putExtra(r2, r5)
            r5 = -1
            r4.setResult(r5, r1)
            r4.finish()
            int r5 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.equals
            int r5 = r5 + 89
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.component4 = r1
            int r5 = r5 % r0
            goto L67
        L42:
            com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteUtil r5 = com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteUtil.INSTANCE
            com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab r5 = r5.getFilterTabFromCategory(r1)
            int r5 = r5.getTitleRes()
            java.lang.String r5 = r4.getString(r5)
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            int r3 = com.huawei.digitalpayment.consumer.sfc.R.string.favorites_select_category
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r4.getString(r3, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.huawei.common.util.ToastUtils.showShort(r5, r1)
        L67:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.component4
            int r5 = r5 + 47
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.equals = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L73
            return
        L73:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.onFavoriteClick(com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean):void");
    }

    private final void onManageFavorites() {
        int i = 2 % 2;
        FavoriteFilterTab selectedTab = getManageFavouriteViewModel().getViewFavoritesState().getValue().getSelectedTab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("favoriteCategoryKey", selectedTab);
        RouteUtils.routeWithExecute(this, RoutePathConstant.MANAGE_FAVORITES, bundle);
        int i2 = component4 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.onStart():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2043062637
        	at java.base/java.util.ArrayList.<init>(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, new char[]{64597, 36310, 64061, 64564, 16152, 32623, 8183, 59375, 14182, 13196, 19283, 40151, 27276, 1065, 34347, 20491, 40448, 55646, 48523, 1512, 53587, 44536, 59735, 14996, 1229, 26141, 9269, 60972, 14364, 15181}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new char[]{39493, 11556, 24805, 29255, 1144, 46447, 16424, 36933, 63988, 21679, 23644, 10612, 9551, 36978, 57305, 58119, 40320, 46223}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).length() - 1, new char[]{59039, 8964, 1608, 38228}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) + 46454), new char[]{37363, 25912, 38457, 48309}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i2 = component4 + 39;
                equals = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 5;
                }
            }
        }
        if (baseContext != null) {
            int i4 = component4 + 115;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 6618, ((byte) KeyEvent.getModifierMetaStateMask()) + 43, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 56, (char) (ViewConfiguration.getScrollBarSize() >> 8), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x083a A[Catch: all -> 0x0427, TryCatch #6 {all -> 0x0427, blocks: (B:117:0x0834, B:119:0x083a, B:120:0x0861, B:227:0x0da8, B:229:0x0dae, B:230:0x0dd8, B:538:0x1d40, B:540:0x1d46, B:541:0x1d75, B:753:0x2ea1, B:755:0x2ea7, B:756:0x2ed1, B:787:0x31dd, B:789:0x31e3, B:790:0x3210, B:824:0x3541, B:826:0x3547, B:827:0x356c, B:804:0x3379, B:806:0x339c, B:807:0x33f1, B:617:0x271a, B:619:0x2720, B:620:0x2749, B:622:0x2783, B:623:0x27cc, B:588:0x2389, B:590:0x239e, B:591:0x23cb, B:593:0x23ff, B:594:0x247b, B:852:0x3655, B:854:0x365b, B:855:0x3683, B:857:0x36bd, B:858:0x3708, B:554:0x1f54, B:556:0x1f69, B:557:0x1f99, B:406:0x15f7, B:408:0x15fd, B:409:0x162a, B:273:0x0ffa, B:275:0x1000, B:276:0x1029, B:19:0x0182, B:21:0x0188, B:22:0x01b0, B:24:0x0398, B:26:0x03ca, B:27:0x0421), top: B:882:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09a1 A[Catch: all -> 0x0d3e, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0d3e, blocks: (B:124:0x08e7, B:130:0x0939, B:170:0x0be0, B:171:0x0be4, B:173:0x0bea, B:176:0x0c05, B:139:0x09a1, B:157:0x0abc, B:160:0x0b05, B:166:0x0b77, B:169:0x0bd8), top: B:905:0x08e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0bea A[Catch: all -> 0x0d3e, TryCatch #19 {all -> 0x0d3e, blocks: (B:124:0x08e7, B:130:0x0939, B:170:0x0be0, B:171:0x0be4, B:173:0x0bea, B:176:0x0c05, B:139:0x09a1, B:157:0x0abc, B:160:0x0b05, B:166:0x0b77, B:169:0x0bd8), top: B:905:0x08e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0dae A[Catch: all -> 0x0427, TryCatch #6 {all -> 0x0427, blocks: (B:117:0x0834, B:119:0x083a, B:120:0x0861, B:227:0x0da8, B:229:0x0dae, B:230:0x0dd8, B:538:0x1d40, B:540:0x1d46, B:541:0x1d75, B:753:0x2ea1, B:755:0x2ea7, B:756:0x2ed1, B:787:0x31dd, B:789:0x31e3, B:790:0x3210, B:824:0x3541, B:826:0x3547, B:827:0x356c, B:804:0x3379, B:806:0x339c, B:807:0x33f1, B:617:0x271a, B:619:0x2720, B:620:0x2749, B:622:0x2783, B:623:0x27cc, B:588:0x2389, B:590:0x239e, B:591:0x23cb, B:593:0x23ff, B:594:0x247b, B:852:0x3655, B:854:0x365b, B:855:0x3683, B:857:0x36bd, B:858:0x3708, B:554:0x1f54, B:556:0x1f69, B:557:0x1f99, B:406:0x15f7, B:408:0x15fd, B:409:0x162a, B:273:0x0ffa, B:275:0x1000, B:276:0x1029, B:19:0x0182, B:21:0x0188, B:22:0x01b0, B:24:0x0398, B:26:0x03ca, B:27:0x0421), top: B:882:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0e8f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ea6 A[Catch: all -> 0x0f6d, TryCatch #45 {all -> 0x0f6d, blocks: (B:248:0x0e91, B:250:0x0ea6, B:251:0x0ed6), top: B:954:0x0e91, outer: #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0ee9 A[Catch: all -> 0x0f63, TryCatch #38 {all -> 0x0f63, blocks: (B:252:0x0edc, B:254:0x0ee9, B:255:0x0f5b), top: B:942:0x0edc, outer: #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x110f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x116f A[Catch: all -> 0x1529, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x1529, blocks: (B:280:0x10ab, B:288:0x1102, B:297:0x116f), top: B:888:0x10ab }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x13c3 A[Catch: all -> 0x14fd, TryCatch #54 {all -> 0x14fd, blocks: (B:341:0x13b5, B:342:0x13b9, B:345:0x13c3, B:348:0x13df, B:336:0x1351, B:340:0x13ad), top: B:972:0x1351 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x15fd A[Catch: all -> 0x0427, TryCatch #6 {all -> 0x0427, blocks: (B:117:0x0834, B:119:0x083a, B:120:0x0861, B:227:0x0da8, B:229:0x0dae, B:230:0x0dd8, B:538:0x1d40, B:540:0x1d46, B:541:0x1d75, B:753:0x2ea1, B:755:0x2ea7, B:756:0x2ed1, B:787:0x31dd, B:789:0x31e3, B:790:0x3210, B:824:0x3541, B:826:0x3547, B:827:0x356c, B:804:0x3379, B:806:0x339c, B:807:0x33f1, B:617:0x271a, B:619:0x2720, B:620:0x2749, B:622:0x2783, B:623:0x27cc, B:588:0x2389, B:590:0x239e, B:591:0x23cb, B:593:0x23ff, B:594:0x247b, B:852:0x3655, B:854:0x365b, B:855:0x3683, B:857:0x36bd, B:858:0x3708, B:554:0x1f54, B:556:0x1f69, B:557:0x1f99, B:406:0x15f7, B:408:0x15fd, B:409:0x162a, B:273:0x0ffa, B:275:0x1000, B:276:0x1029, B:19:0x0182, B:21:0x0188, B:22:0x01b0, B:24:0x0398, B:26:0x03ca, B:27:0x0421), top: B:882:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x16b5  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1706 A[Catch: all -> 0x1c7e, PHI: r1 r33
  0x1706: PHI (r1v362 java.lang.Object) = (r1v361 java.lang.Object), (r1v402 java.lang.Object) binds: [B:414:0x16b3, B:416:0x16b6] A[DONT_GENERATE, DONT_INLINE]
  0x1706: PHI (r33v74 ??) = (r33v177 ??), (r33v178 ??) binds: [B:414:0x16b3, B:416:0x16b6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #57 {all -> 0x1c7e, blocks: (B:413:0x16af, B:420:0x1706, B:424:0x1777, B:444:0x1804), top: B:977:0x16af }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x172d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x178a  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x17e8  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1b26 A[Catch: all -> 0x1c57, TryCatch #34 {all -> 0x1c57, blocks: (B:477:0x1b15, B:478:0x1b19, B:481:0x1b26, B:484:0x1b42, B:446:0x1812, B:463:0x19e0, B:467:0x1a30, B:473:0x1aa7, B:476:0x1b0d), top: B:934:0x1812 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1d46 A[Catch: all -> 0x0427, TryCatch #6 {all -> 0x0427, blocks: (B:117:0x0834, B:119:0x083a, B:120:0x0861, B:227:0x0da8, B:229:0x0dae, B:230:0x0dd8, B:538:0x1d40, B:540:0x1d46, B:541:0x1d75, B:753:0x2ea1, B:755:0x2ea7, B:756:0x2ed1, B:787:0x31dd, B:789:0x31e3, B:790:0x3210, B:824:0x3541, B:826:0x3547, B:827:0x356c, B:804:0x3379, B:806:0x339c, B:807:0x33f1, B:617:0x271a, B:619:0x2720, B:620:0x2749, B:622:0x2783, B:623:0x27cc, B:588:0x2389, B:590:0x239e, B:591:0x23cb, B:593:0x23ff, B:594:0x247b, B:852:0x3655, B:854:0x365b, B:855:0x3683, B:857:0x36bd, B:858:0x3708, B:554:0x1f54, B:556:0x1f69, B:557:0x1f99, B:406:0x15f7, B:408:0x15fd, B:409:0x162a, B:273:0x0ffa, B:275:0x1000, B:276:0x1029, B:19:0x0182, B:21:0x0188, B:22:0x01b0, B:24:0x0398, B:26:0x03ca, B:27:0x0421), top: B:882:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x1dff  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x1e54  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x1f33  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x20de  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x295b  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x29b0 A[Catch: all -> 0x2ded, PHI: r7 r15 r33
  0x29b0: PHI (r7v253 java.lang.Object) = (r7v252 java.lang.Object), (r7v313 java.lang.Object) binds: [B:635:0x2959, B:637:0x295c] A[DONT_GENERATE, DONT_INLINE]
  0x29b0: PHI (r15v42 ??) = (r15v169 ??), (r15v170 ??) binds: [B:635:0x2959, B:637:0x295c] A[DONT_GENERATE, DONT_INLINE]
  0x29b0: PHI (r33v41 ??) = (r33v171 ??), (r33v172 ??) binds: [B:635:0x2959, B:637:0x295c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x2ded, blocks: (B:634:0x2942, B:641:0x29b0, B:664:0x2a4a), top: B:952:0x2942 }] */
    /* JADX WARN: Removed duplicated region for block: B:644:0x29c6  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2a1c  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x2c89 A[Catch: all -> 0x2dc8, TryCatch #26 {all -> 0x2dc8, blocks: (B:693:0x2c7f, B:694:0x2c83, B:696:0x2c89, B:699:0x2ca7, B:666:0x2a58, B:678:0x2b5c, B:682:0x2ba8, B:688:0x2c1d, B:692:0x2c77), top: B:919:0x2a58 }] */
    /* JADX WARN: Removed duplicated region for block: B:755:0x2ea7 A[Catch: all -> 0x0427, TryCatch #6 {all -> 0x0427, blocks: (B:117:0x0834, B:119:0x083a, B:120:0x0861, B:227:0x0da8, B:229:0x0dae, B:230:0x0dd8, B:538:0x1d40, B:540:0x1d46, B:541:0x1d75, B:753:0x2ea1, B:755:0x2ea7, B:756:0x2ed1, B:787:0x31dd, B:789:0x31e3, B:790:0x3210, B:824:0x3541, B:826:0x3547, B:827:0x356c, B:804:0x3379, B:806:0x339c, B:807:0x33f1, B:617:0x271a, B:619:0x2720, B:620:0x2749, B:622:0x2783, B:623:0x27cc, B:588:0x2389, B:590:0x239e, B:591:0x23cb, B:593:0x23ff, B:594:0x247b, B:852:0x3655, B:854:0x365b, B:855:0x3683, B:857:0x36bd, B:858:0x3708, B:554:0x1f54, B:556:0x1f69, B:557:0x1f99, B:406:0x15f7, B:408:0x15fd, B:409:0x162a, B:273:0x0ffa, B:275:0x1000, B:276:0x1029, B:19:0x0182, B:21:0x0188, B:22:0x01b0, B:24:0x0398, B:26:0x03ca, B:27:0x0421), top: B:882:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x360c  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x08ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:966:0x10b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v106 */
    /* JADX WARN: Type inference failed for: r11v107 */
    /* JADX WARN: Type inference failed for: r11v108 */
    /* JADX WARN: Type inference failed for: r11v109 */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v154 */
    /* JADX WARN: Type inference failed for: r11v155 */
    /* JADX WARN: Type inference failed for: r11v156 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v163 */
    /* JADX WARN: Type inference failed for: r11v164 */
    /* JADX WARN: Type inference failed for: r11v168 */
    /* JADX WARN: Type inference failed for: r11v173 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v183, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v216 */
    /* JADX WARN: Type inference failed for: r11v217 */
    /* JADX WARN: Type inference failed for: r11v218 */
    /* JADX WARN: Type inference failed for: r11v219 */
    /* JADX WARN: Type inference failed for: r11v220 */
    /* JADX WARN: Type inference failed for: r11v221 */
    /* JADX WARN: Type inference failed for: r11v222 */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v224 */
    /* JADX WARN: Type inference failed for: r11v225 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v229 */
    /* JADX WARN: Type inference failed for: r11v230 */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232 */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v234 */
    /* JADX WARN: Type inference failed for: r11v235 */
    /* JADX WARN: Type inference failed for: r11v236 */
    /* JADX WARN: Type inference failed for: r11v237 */
    /* JADX WARN: Type inference failed for: r11v238 */
    /* JADX WARN: Type inference failed for: r11v239 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v242 */
    /* JADX WARN: Type inference failed for: r11v243 */
    /* JADX WARN: Type inference failed for: r11v244 */
    /* JADX WARN: Type inference failed for: r11v245 */
    /* JADX WARN: Type inference failed for: r11v246 */
    /* JADX WARN: Type inference failed for: r11v248 */
    /* JADX WARN: Type inference failed for: r11v249 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v157 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v170 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v172 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v151 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v153 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v159 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v160 */
    /* JADX WARN: Type inference failed for: r15v161 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v164 */
    /* JADX WARN: Type inference failed for: r15v165 */
    /* JADX WARN: Type inference failed for: r15v166 */
    /* JADX WARN: Type inference failed for: r15v167 */
    /* JADX WARN: Type inference failed for: r15v168 */
    /* JADX WARN: Type inference failed for: r15v169 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v170 */
    /* JADX WARN: Type inference failed for: r15v171 */
    /* JADX WARN: Type inference failed for: r15v172 */
    /* JADX WARN: Type inference failed for: r15v173 */
    /* JADX WARN: Type inference failed for: r15v174 */
    /* JADX WARN: Type inference failed for: r15v175 */
    /* JADX WARN: Type inference failed for: r15v176 */
    /* JADX WARN: Type inference failed for: r15v177 */
    /* JADX WARN: Type inference failed for: r15v178 */
    /* JADX WARN: Type inference failed for: r15v179 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v180 */
    /* JADX WARN: Type inference failed for: r15v181 */
    /* JADX WARN: Type inference failed for: r15v182 */
    /* JADX WARN: Type inference failed for: r15v183 */
    /* JADX WARN: Type inference failed for: r15v184 */
    /* JADX WARN: Type inference failed for: r15v185 */
    /* JADX WARN: Type inference failed for: r15v186 */
    /* JADX WARN: Type inference failed for: r15v187 */
    /* JADX WARN: Type inference failed for: r15v188 */
    /* JADX WARN: Type inference failed for: r15v189 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v190 */
    /* JADX WARN: Type inference failed for: r15v191 */
    /* JADX WARN: Type inference failed for: r15v192 */
    /* JADX WARN: Type inference failed for: r15v193 */
    /* JADX WARN: Type inference failed for: r15v194 */
    /* JADX WARN: Type inference failed for: r15v195 */
    /* JADX WARN: Type inference failed for: r15v196 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v94, types: [byte, short] */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v263 */
    /* JADX WARN: Type inference failed for: r1v264 */
    /* JADX WARN: Type inference failed for: r1v265 */
    /* JADX WARN: Type inference failed for: r1v279 */
    /* JADX WARN: Type inference failed for: r1v280, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v599 */
    /* JADX WARN: Type inference failed for: r1v600 */
    /* JADX WARN: Type inference failed for: r1v601 */
    /* JADX WARN: Type inference failed for: r2v697, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v100 */
    /* JADX WARN: Type inference failed for: r33v107 */
    /* JADX WARN: Type inference failed for: r33v108 */
    /* JADX WARN: Type inference failed for: r33v109 */
    /* JADX WARN: Type inference failed for: r33v110 */
    /* JADX WARN: Type inference failed for: r33v111 */
    /* JADX WARN: Type inference failed for: r33v112 */
    /* JADX WARN: Type inference failed for: r33v113 */
    /* JADX WARN: Type inference failed for: r33v114 */
    /* JADX WARN: Type inference failed for: r33v117 */
    /* JADX WARN: Type inference failed for: r33v118 */
    /* JADX WARN: Type inference failed for: r33v119 */
    /* JADX WARN: Type inference failed for: r33v120 */
    /* JADX WARN: Type inference failed for: r33v121 */
    /* JADX WARN: Type inference failed for: r33v122 */
    /* JADX WARN: Type inference failed for: r33v124 */
    /* JADX WARN: Type inference failed for: r33v125 */
    /* JADX WARN: Type inference failed for: r33v126 */
    /* JADX WARN: Type inference failed for: r33v127 */
    /* JADX WARN: Type inference failed for: r33v128 */
    /* JADX WARN: Type inference failed for: r33v130 */
    /* JADX WARN: Type inference failed for: r33v131 */
    /* JADX WARN: Type inference failed for: r33v136 */
    /* JADX WARN: Type inference failed for: r33v139 */
    /* JADX WARN: Type inference failed for: r33v140 */
    /* JADX WARN: Type inference failed for: r33v141 */
    /* JADX WARN: Type inference failed for: r33v154 */
    /* JADX WARN: Type inference failed for: r33v155 */
    /* JADX WARN: Type inference failed for: r33v156 */
    /* JADX WARN: Type inference failed for: r33v157 */
    /* JADX WARN: Type inference failed for: r33v158 */
    /* JADX WARN: Type inference failed for: r33v159 */
    /* JADX WARN: Type inference failed for: r33v160 */
    /* JADX WARN: Type inference failed for: r33v161 */
    /* JADX WARN: Type inference failed for: r33v162 */
    /* JADX WARN: Type inference failed for: r33v163 */
    /* JADX WARN: Type inference failed for: r33v164 */
    /* JADX WARN: Type inference failed for: r33v167 */
    /* JADX WARN: Type inference failed for: r33v168 */
    /* JADX WARN: Type inference failed for: r33v169 */
    /* JADX WARN: Type inference failed for: r33v170 */
    /* JADX WARN: Type inference failed for: r33v171 */
    /* JADX WARN: Type inference failed for: r33v172 */
    /* JADX WARN: Type inference failed for: r33v173 */
    /* JADX WARN: Type inference failed for: r33v174 */
    /* JADX WARN: Type inference failed for: r33v175 */
    /* JADX WARN: Type inference failed for: r33v176 */
    /* JADX WARN: Type inference failed for: r33v177 */
    /* JADX WARN: Type inference failed for: r33v178 */
    /* JADX WARN: Type inference failed for: r33v179 */
    /* JADX WARN: Type inference failed for: r33v180 */
    /* JADX WARN: Type inference failed for: r33v181 */
    /* JADX WARN: Type inference failed for: r33v182 */
    /* JADX WARN: Type inference failed for: r33v183 */
    /* JADX WARN: Type inference failed for: r33v184 */
    /* JADX WARN: Type inference failed for: r33v185 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v25 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v27 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v37 */
    /* JADX WARN: Type inference failed for: r33v39 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v42 */
    /* JADX WARN: Type inference failed for: r33v43 */
    /* JADX WARN: Type inference failed for: r33v44 */
    /* JADX WARN: Type inference failed for: r33v45 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v51 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v53 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v60 */
    /* JADX WARN: Type inference failed for: r33v62 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v74 */
    /* JADX WARN: Type inference failed for: r33v75 */
    /* JADX WARN: Type inference failed for: r33v76 */
    /* JADX WARN: Type inference failed for: r33v77 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v80 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v83 */
    /* JADX WARN: Type inference failed for: r33v84 */
    /* JADX WARN: Type inference failed for: r33v89 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r33v90 */
    /* JADX WARN: Type inference failed for: r33v91 */
    /* JADX WARN: Type inference failed for: r33v92 */
    /* JADX WARN: Type inference failed for: r33v93 */
    /* JADX WARN: Type inference failed for: r33v94 */
    /* JADX WARN: Type inference failed for: r33v95 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r3v311 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v469, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v537 */
    /* JADX WARN: Type inference failed for: r3v538 */
    /* JADX WARN: Type inference failed for: r3v551 */
    /* JADX WARN: Type inference failed for: r3v572 */
    /* JADX WARN: Type inference failed for: r3v573 */
    /* JADX WARN: Type inference failed for: r3v574 */
    /* JADX WARN: Type inference failed for: r3v575 */
    /* JADX WARN: Type inference failed for: r3v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v15 */
    /* JADX WARN: Type inference failed for: r41v17 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23 */
    /* JADX WARN: Type inference failed for: r41v24 */
    /* JADX WARN: Type inference failed for: r41v25 */
    /* JADX WARN: Type inference failed for: r41v26 */
    /* JADX WARN: Type inference failed for: r41v27 */
    /* JADX WARN: Type inference failed for: r41v28 */
    /* JADX WARN: Type inference failed for: r41v29 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v30 */
    /* JADX WARN: Type inference failed for: r41v31 */
    /* JADX WARN: Type inference failed for: r41v32 */
    /* JADX WARN: Type inference failed for: r41v33 */
    /* JADX WARN: Type inference failed for: r41v34 */
    /* JADX WARN: Type inference failed for: r41v35 */
    /* JADX WARN: Type inference failed for: r41v36 */
    /* JADX WARN: Type inference failed for: r41v37 */
    /* JADX WARN: Type inference failed for: r41v38 */
    /* JADX WARN: Type inference failed for: r41v39 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v40 */
    /* JADX WARN: Type inference failed for: r41v41 */
    /* JADX WARN: Type inference failed for: r41v42 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v164, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v167 */
    /* JADX WARN: Type inference failed for: r4v168 */
    /* JADX WARN: Type inference failed for: r4v169 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v170 */
    /* JADX WARN: Type inference failed for: r4v188 */
    /* JADX WARN: Type inference failed for: r4v189 */
    /* JADX WARN: Type inference failed for: r4v245, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v246 */
    /* JADX WARN: Type inference failed for: r4v247 */
    /* JADX WARN: Type inference failed for: r4v248 */
    /* JADX WARN: Type inference failed for: r4v249 */
    /* JADX WARN: Type inference failed for: r4v264 */
    /* JADX WARN: Type inference failed for: r4v266, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v267 */
    /* JADX WARN: Type inference failed for: r4v268 */
    /* JADX WARN: Type inference failed for: r4v269 */
    /* JADX WARN: Type inference failed for: r4v270 */
    /* JADX WARN: Type inference failed for: r4v271 */
    /* JADX WARN: Type inference failed for: r4v293 */
    /* JADX WARN: Type inference failed for: r4v328 */
    /* JADX WARN: Type inference failed for: r4v352 */
    /* JADX WARN: Type inference failed for: r4v353 */
    /* JADX WARN: Type inference failed for: r4v354 */
    /* JADX WARN: Type inference failed for: r4v355 */
    /* JADX WARN: Type inference failed for: r4v356 */
    /* JADX WARN: Type inference failed for: r4v357 */
    /* JADX WARN: Type inference failed for: r4v358 */
    /* JADX WARN: Type inference failed for: r4v359 */
    /* JADX WARN: Type inference failed for: r4v360 */
    /* JADX WARN: Type inference failed for: r4v361 */
    /* JADX WARN: Type inference failed for: r4v362 */
    /* JADX WARN: Type inference failed for: r4v363 */
    /* JADX WARN: Type inference failed for: r4v364 */
    /* JADX WARN: Type inference failed for: r4v365 */
    /* JADX WARN: Type inference failed for: r4v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v442, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v443 */
    /* JADX WARN: Type inference failed for: r5v444 */
    /* JADX WARN: Type inference failed for: r5v445 */
    /* JADX WARN: Type inference failed for: r5v446 */
    /* JADX WARN: Type inference failed for: r5v462 */
    /* JADX WARN: Type inference failed for: r5v463 */
    /* JADX WARN: Type inference failed for: r5v688 */
    /* JADX WARN: Type inference failed for: r5v689 */
    /* JADX WARN: Type inference failed for: r8v138, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v113, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v307 */
    /* JADX WARN: Type inference failed for: r9v327 */
    /* JADX WARN: Type inference failed for: r9v328 */
    /* JADX WARN: Type inference failed for: r9v329 */
    /* JADX WARN: Type inference failed for: r9v330 */
    /* JADX WARN: Type inference failed for: r9v331 */
    /* JADX WARN: Type inference failed for: r9v332 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        ShareDataUIState();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = copy + 53;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 23;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            component3 = new char[]{2025, 2039, 2019, 2016, 1050, 1966, 2020, 2030, 2029, 1987, 1956, 1052, 2017, 2000, 2023, 2041, 1048, 1992, 2032, 2022, 2034, 1053, 1055, 2018, 2021, 2035, 1973, 1049, 1054, 2024, 1051, 2028, 2031, 2037, 1999, 2036};
            ShareDataUIState = (char) 12828;
            throw null;
        }
        component3 = new char[]{2025, 2039, 2019, 2016, 1050, 1966, 2020, 2030, 2029, 1987, 1956, 1052, 2017, 2000, 2023, 2041, 1048, 1992, 2032, 2022, 2034, 1053, 1055, 2018, 2021, 2035, 1973, 1049, 1054, 2024, 1051, 2028, 2031, 2037, 1999, 2036};
        ShareDataUIState = (char) 12828;
        int i4 = i2 + 21;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        copydefault = -5618797716282155450L;
        component1 = 6835634315430011502L;
        component2 = 1386857713;
        getRequestBeneficiariesState = (char) 50417;
    }
}
