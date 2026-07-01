package com.huawei.digitalpayment.consumer.sfcui.favorites.manage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.SizeUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab;
import com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import com.safaricom.sharedui.compose.databinding.ActivityComposeBinding;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/manage/ManageFavoritesActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "manageFavouriteViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "getManageFavouriteViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "manageFavouriteViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/safaricom/sharedui/compose/databinding/ActivityComposeBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeDeletion", "Companion", "ConsumerSfcUI_release", "favorites", "", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ManageFavoritesActivity extends Hilt_ManageFavoritesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String FAVORITE_CATEGORY = "favoriteCategoryKey";
    private static char ShareDataUIState;
    private static int component1;
    private static int[] component2;
    private static long component3;
    private static long copydefault;
    private static int getAsAtTimestamp;
    private ActivityComposeBinding binding;

    private final Lazy manageFavouriteViewModel;
    private static final byte[] $$l = {7, 80, 121, 38};
    private static final int $$m = Primes.SMALL_FACTOR_LIMIT;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_CHR, -39, 98, -44, Ascii.DC2, 4, -57, 58, Ascii.EM, -2, 9, 10, -9, 4, Ascii.VT, -52, 63, Ascii.VT, 3, 1, 7, -49, 65, Ascii.VT, Ascii.FF, -9, 8, 17, -11, Ascii.EM, -5, Ascii.FF, 5, -58, 59, Ascii.DC2, 4, 9, 5, 10, -8, -49, 40, 40, -7, 13, 9, -8, 9, -19, 47, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 79, -12, 3, Ascii.SUB, -7, 2, Ascii.CAN, -67, 65, Ascii.VT, Ascii.FF, -9, 19, -11, 8, Ascii.ETB, -5, Ascii.FF, 5, -58, 62, Ascii.NAK, -1, -5, Ascii.ETB, -5, Ascii.FF, 5, -58, 43, 39, -13, Ascii.ETB, 8, -30, Ascii.ETB, Ascii.RS, -79, Ascii.ETB, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60};
    private static final int $$k = 32;
    private static final byte[] $$d = {7, 75, -84, -52, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 121;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component2 = 1;
        private static int component3;
        private final Function1 component1;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) ? Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate()) : false;
            int i4 = component3 + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 37;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                Function1 function1 = this.component1;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1 function12 = this.component1;
            int i4 = i2 + 95;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return function12;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            if (i3 != 0) {
                int i4 = 50 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component1.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.$$l
            int r6 = r6 + 98
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.$$n(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.$$d
            int r1 = r5 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.g(int, byte, short, java.lang.Object[]):void");
    }

    private static void h(int i, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = 99 - (b2 * 2);
        int i3 = 142 - i;
        byte[] bArr2 = new byte[74 - s];
        int i4 = 73 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 6;
            i3 = i3;
        }
        while (true) {
            i5++;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + bArr[i6]) - 6;
                i3 = i6;
            }
        }
    }

    public static final ManageFavouriteViewModel access$getManageFavouriteViewModel(ManageFavoritesActivity manageFavoritesActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return manageFavoritesActivity.getManageFavouriteViewModel();
        }
        manageFavoritesActivity.getManageFavouriteViewModel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/manage/ManageFavoritesActivity$Companion;", "", "<init>", "()V", "FAVORITE_CATEGORY", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ManageFavoritesActivity() {
        final ManageFavoritesActivity manageFavoritesActivity = this;
        final Function0 function0 = null;
        this.manageFavouriteViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ManageFavouriteViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i = 2 % 2;
                int i2 = component2 + 43;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStore = manageFavoritesActivity.getViewModelStore();
                    int i3 = 53 / 0;
                } else {
                    viewModelStore = manageFavoritesActivity.getViewModelStore();
                }
                int i4 = component1 + 89;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 65 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 43;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 67;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 23;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 67;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = manageFavoritesActivity.getDefaultViewModelProviderFactory();
                int i4 = component1 + 91;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = component3 + 41;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = manageFavoritesActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = copydefault + 63;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 25;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ManageFavouriteViewModel getManageFavouriteViewModel() {
        int i = 2 % 2;
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.manageFavouriteViewModel.getValue();
        if (i3 == 0) {
            return (ManageFavouriteViewModel) value;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 1;
        private static int component3;
        final FavoriteFilterTab ShareDataUIState;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 59;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = component1 + 95;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component2;
            final List<FavoriteFriendsBean> component3;
            final ManageFavoritesActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 29;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 113;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = ShareDataUIState + 43;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        composer.getSkipping();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i4 = component2 + 93;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                    }
                }
                final List<FavoriteFriendsBean> list = this.component3;
                final ManageFavoritesActivity manageFavoritesActivity = this.copydefault;
                Function1 function1 = new Function1() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 103;
                        component2 = i7 % 128;
                        if (i7 % 2 != 0) {
                            ManageFavoritesActivity.component1.AnonymousClass3.component2(manageFavoritesActivity, list, (FavoritePositionChange) obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        Unit unitComponent2 = ManageFavoritesActivity.component1.AnonymousClass3.component2(manageFavoritesActivity, list, (FavoritePositionChange) obj2);
                        int i8 = component2 + 109;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        return unitComponent2;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(ManageFavoritesActivity.access$getManageFavouriteViewModel(this.copydefault));
                final ManageFavoritesActivity manageFavoritesActivity2 = this.copydefault;
                ManageFavoritesScreenKt.ManageFavoritesScreen(list, function1, anonymousClass2, new Function1() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = component1 + 5;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitComponent3 = ManageFavoritesActivity.component1.AnonymousClass3.component3(manageFavoritesActivity2, (FavoriteFriendsBean) obj2);
                        if (i8 != 0) {
                            int i9 = 30 / 0;
                        }
                        return unitComponent3;
                    }
                }, new C02753(this.copydefault), composer, 8, 0);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function1<FavoriteFriendsBean, Unit> {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                public final void component2(FavoriteFriendsBean favoriteFriendsBean) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 53;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(favoriteFriendsBean, "");
                        ((ManageFavouriteViewModel) this.receiver).updateFavorite(favoriteFriendsBean);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(favoriteFriendsBean, "");
                    ((ManageFavouriteViewModel) this.receiver).updateFavorite(favoriteFriendsBean);
                    int i3 = ShareDataUIState + 7;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                }

                @Override
                public Unit invoke(FavoriteFriendsBean favoriteFriendsBean) {
                    int i = 2 % 2;
                    int i2 = copydefault + 99;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component2(favoriteFriendsBean);
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 69;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass2(Object obj) {
                    super(1, obj, ManageFavouriteViewModel.class, "updateFavorite", "updateFavorite(Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;)V", 0);
                }
            }

            private static final Unit ShareDataUIState(ManageFavoritesActivity manageFavoritesActivity, List list, FavoritePositionChange favoritePositionChange) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component2 + 15;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(manageFavoritesActivity, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(favoritePositionChange, "");
                    ManageFavoritesActivity.access$getManageFavouriteViewModel(manageFavoritesActivity).reorderFavourites(list, favoritePositionChange);
                    unit = Unit.INSTANCE;
                    int i3 = 17 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(manageFavoritesActivity, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(favoritePositionChange, "");
                    ManageFavoritesActivity.access$getManageFavouriteViewModel(manageFavoritesActivity).reorderFavourites(list, favoritePositionChange);
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 33;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02753 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component1 = 1;
                private static int component2;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component2 + 107;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((ManageFavoritesActivity) this.receiver).finish();
                        int i3 = 81 / 0;
                    } else {
                        ((ManageFavoritesActivity) this.receiver).finish();
                    }
                    int i4 = component2 + 45;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component2 + 3;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 101;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 55 / 0;
                    }
                    return unit;
                }

                C02753(Object obj) {
                    super(0, obj, ManageFavoritesActivity.class, "finish", "finish()V", 0);
                }
            }

            private static final Unit copydefault(ManageFavoritesActivity manageFavoritesActivity, FavoriteFriendsBean favoriteFriendsBean) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component2 + 53;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(manageFavoritesActivity, "");
                    Intrinsics.checkNotNullParameter(favoriteFriendsBean, "");
                    ManageFavoritesActivity.access$getManageFavouriteViewModel(manageFavoritesActivity).removeFavorite(TradeTypeConstant.MPESA_TRANSACTION, favoriteFriendsBean.getCategory(), CollectionsKt.listOf(favoriteFriendsBean.getId()));
                    unit = Unit.INSTANCE;
                    int i3 = 25 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(manageFavoritesActivity, "");
                    Intrinsics.checkNotNullParameter(favoriteFriendsBean, "");
                    ManageFavoritesActivity.access$getManageFavouriteViewModel(manageFavoritesActivity).removeFavorite(TradeTypeConstant.MPESA_TRANSACTION, favoriteFriendsBean.getCategory(), CollectionsKt.listOf(favoriteFriendsBean.getId()));
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 71;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component3(ManageFavoritesActivity manageFavoritesActivity, FavoriteFriendsBean favoriteFriendsBean) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 121;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return copydefault(manageFavoritesActivity, favoriteFriendsBean);
                }
                copydefault(manageFavoritesActivity, favoriteFriendsBean);
                throw null;
            }

            public static Unit component2(ManageFavoritesActivity manageFavoritesActivity, List list, FavoritePositionChange favoritePositionChange) {
                int i = 2 % 2;
                int i2 = component2 + 87;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    ShareDataUIState(manageFavoritesActivity, list, favoritePositionChange);
                    throw null;
                }
                Unit unitShareDataUIState = ShareDataUIState(manageFavoritesActivity, list, favoritePositionChange);
                int i3 = component2 + 71;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitShareDataUIState;
                }
                obj.hashCode();
                throw null;
            }

            AnonymousClass3(List<FavoriteFriendsBean> list, ManageFavoritesActivity manageFavoritesActivity) {
                this.component3 = list;
                this.copydefault = manageFavoritesActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L1c
                int r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component1
                int r13 = r13 + 13
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component3 = r1
                int r13 = r13 % r0
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L17
                goto L1c
            L17:
                r12.skipToGroupEnd()
                goto L9f
            L1c:
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.this
                com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r13 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.access$getManageFavouriteViewModel(r13)
                kotlinx.coroutines.flow.StateFlow r1 = r13.getFavoriteItems()
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 8
                r7 = 7
                r5 = r12
                androidx.compose.runtime.State r13 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r1, r2, r3, r4, r5, r6, r7)
                com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteUtil r1 = com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteUtil.INSTANCE
                com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab r2 = r11.ShareDataUIState
                java.lang.String[] r1 = r1.getCategoriesForFilter(r2)
                java.util.List r13 = ShareDataUIState(r13)
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Collection r2 = (java.util.Collection) r2
                java.util.Iterator r13 = r13.iterator()
            L4a:
                boolean r3 = r13.hasNext()
                if (r3 == 0) goto L6e
                int r3 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component1
                int r3 = r3 + 63
                int r4 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component3 = r4
                int r3 = r3 % r0
                java.lang.Object r3 = r13.next()
                r4 = r3
                com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean r4 = (com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean) r4
                java.lang.String r4 = r4.getCategory()
                boolean r4 = kotlin.collections.ArraysKt.contains(r1, r4)
                if (r4 == 0) goto L4a
                r2.add(r3)
                goto L4a
            L6e:
                java.util.List r2 = (java.util.List) r2
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity$onCreate$1$invoke$$inlined$sortedBy$1 r13 = new com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity$onCreate$1$invoke$$inlined$sortedBy$1
                r13.<init>()
                java.util.Comparator r13 = (java.util.Comparator) r13
                java.util.List r13 = kotlin.collections.CollectionsKt.sortedWith(r2, r13)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity$component1$3 r7 = new com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity$component1$3
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity r8 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.this
                r7.<init>(r13, r8)
                r13 = 54
                r8 = -451052824(0xffffffffe51d7ae8, float:-4.6479922E22)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r7, r12, r13)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L9f:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component3
                int r12 = r12 + 45
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component1 = r13
                int r12 = r12 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.component1.component3(androidx.compose.runtime.Composer, int):void");
        }

        private static final List<FavoriteFriendsBean> ShareDataUIState(State<? extends List<FavoriteFriendsBean>> state) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            List<FavoriteFriendsBean> value = state.getValue();
            int i4 = component3 + 83;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component1(FavoriteFilterTab favoriteFilterTab) {
            this.ShareDataUIState = favoriteFilterTab;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 27;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - View.MeasureSpec.getMode(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 34, (char) (63488 - AndroidCharacter.getMirror('0')), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 5;
                    byte b3 = (byte) (b2 - 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 1390, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51268), -1883291598, false, $$n(b2, b3, b3), new Class[]{Object.class, Object.class});
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

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $11 + 75;
            $10 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 4037;
                    int iIndexOf = TextUtils.indexOf("", "", i5, i5) + 31;
                    char c3 = (char) (19181 - (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b2 = (byte) ($$m & 5);
                    byte b3 = (byte) (b2 - 1);
                    String str$$n = $$n(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, iIndexOf, c3, 1912513118, false, str$$n, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5) + 7567;
                    int bitsPerPixel = 10 - ImageFormat.getBitsPerPixel(i5);
                    char cArgb = (char) Color.argb(i5, i5, i5, i5);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, bitsPerPixel, cArgb, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i5] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - View.MeasureSpec.makeMeasureSpec(i5, i5), 28 - Color.green(i5), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 931716605, false, $$n(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 7567, 11 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (Process.myPid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i9 = $11 + 43;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i3 = i2;
                i5 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void i(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component2;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(iArr3[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i7;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 38, (char) KeyEvent.keyCodeFromString(""), -309236339, false, $$n((byte) ($$l[i7] + 1), b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 2;
                    i5 = 684241640;
                    i7 = 0;
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
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component2;
        if (iArr6 != null) {
            int i11 = $10 + 37;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                int i13 = $11 + 25;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    try {
                        Object[] objArr3 = new Object[i6];
                        objArr3[0] = Integer.valueOf(iArr6[i12]);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            i2 = length;
                            byte b3 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 38, (char) View.MeasureSpec.getMode(0), -309236339, false, $$n((byte) ($$l[0] + 1), b3, b3), new Class[]{Integer.TYPE});
                        } else {
                            i2 = length;
                        }
                        iArr2[i12] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i12 <<= 1;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    i2 = length;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i12])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4391 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0), -309236339, false, $$n((byte) ($$l[0] + 1), b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr2[i12] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                        i12++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i14 = $10 + 11;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                length = i2;
                i6 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        getactivenotifications.component1 = 0;
        int i16 = $10 + 71;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i18 = $11 + 25;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i20 = 0;
            for (int i21 = 16; i20 < i21; i21 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr5[i20];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2967, View.combineMeasuredStates(0, 0) + 16, (char) (49871 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 462826032, false, $$n((byte) ($$l[0] - 1), b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i20++;
            }
            int i22 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i22;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i23 = getactivenotifications.ShareDataUIState;
            int i24 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 2945, 24 - (KeyEvent.getMaxKeyCode() >> 16), (char) (27637 - KeyEvent.keyCodeFromString("")), -1616366948, false, $$n((byte) 9, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x247b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x247c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.onCreate(android.os.Bundle):void");
    }

    private final void observeDeletion() {
        int i = 2 % 2;
        getManageFavouriteViewModel().getRemoveData().observe(this, new component2(new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 1;
                component1 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    ManageFavoritesActivity.m11523$r8$lambda$VCyG1x0nFE6jo8yfZrdS5eD1Vw(this.f$0, (Resource) obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitM11523$r8$lambda$VCyG1x0nFE6jo8yfZrdS5eD1Vw = ManageFavoritesActivity.m11523$r8$lambda$VCyG1x0nFE6jo8yfZrdS5eD1Vw(this.f$0, (Resource) obj);
                int i4 = component3 + 115;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitM11523$r8$lambda$VCyG1x0nFE6jo8yfZrdS5eD1Vw;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = getRequestBeneficiariesState + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit observeDeletion$lambda$0(ManageFavoritesActivity manageFavoritesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(manageFavoritesActivity, "");
        Utils.showOrHideLoading(manageFavoritesActivity, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
        }
        if (!(!resource.success())) {
            int i4 = getRequestBeneficiariesState + 93;
            copy = i4 % 128;
            int i5 = i4 % 2;
            CommonToast.builder().setText(manageFavoritesActivity.getString(R.string.favorite_removed_successfully)).setIcon(R.drawable.ic_base_toast_success).setIconSize(SizeUtils.dp2px(12.0f), SizeUtils.dp2px(12.0f)).setSingleDisplay(true).setGravity(17, 0, 0).show();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = copy + 79;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = copy + 3;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 31, new char[]{40764, 40797, 57183, 1948, 63008, 27451, 15127, 15132, 21978, 41944, 3875, 4218, 55253, 34761, 52992, 54255, 29617, 58270, 27456, 30700, 3674, 19560, 46748, 7232, 43580, 43053, 53982, 41112, 18117, 62701}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new char[]{58722, 4935, 8479, 46385, 20274, 14767, 63748, 64816, 44157, 61120, 56947, 30300, 55697, 10055, 41033, 52605, 26351, 13610}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 32, new char[]{16362, 62686, 30900, 55491}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16156), new char[]{26556, 48850, 14634, 9535}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = getRequestBeneficiariesState + 95;
                copy = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = copy + 53;
            getRequestBeneficiariesState = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6618, 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 56, (char) ((-1) - Process.getGidForName("")), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 42, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) View.resolveSizeAndState(0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i7 = copy + 23;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x096f A[Catch: all -> 0x042c, TryCatch #6 {all -> 0x042c, blocks: (B:151:0x0969, B:153:0x096f, B:154:0x099d, B:432:0x17c9, B:434:0x17cf, B:435:0x17f9, B:532:0x1d5b, B:534:0x1d61, B:535:0x1d89, B:750:0x3115, B:752:0x311b, B:753:0x3146, B:787:0x346b, B:789:0x3471, B:790:0x349a, B:767:0x3293, B:769:0x32b6, B:770:0x3309, B:716:0x2dc7, B:718:0x2dcd, B:719:0x2dfb, B:810:0x357b, B:812:0x3581, B:813:0x35ad, B:815:0x35e7, B:816:0x3630, B:598:0x257b, B:600:0x2590, B:601:0x25c2, B:603:0x25f6, B:604:0x2670, B:575:0x2210, B:577:0x2216, B:578:0x2240, B:580:0x227a, B:581:0x22bd, B:548:0x1f66, B:550:0x1f7b, B:551:0x1fa9, B:282:0x10b6, B:284:0x10bc, B:285:0x10e7, B:196:0x0be5, B:198:0x0beb, B:199:0x0c12, B:17:0x01a5, B:19:0x01ab, B:20:0x01d3, B:22:0x039b, B:24:0x03cd, B:25:0x0426, B:159:0x0a2e, B:164:0x0a3e, B:182:0x0b25, B:184:0x0b2b, B:185:0x0b2c, B:187:0x0b2e, B:189:0x0b35, B:190:0x0b36, B:162:0x0a35, B:620:0x28ab, B:622:0x28b1, B:623:0x28fa, B:625:0x2921, B:626:0x296b, B:628:0x297e, B:630:0x2987, B:631:0x29c9, B:664:0x2c15, B:665:0x2c19, B:668:0x2c29, B:671:0x2c40, B:677:0x2c5b, B:679:0x2c5e, B:691:0x2d3d, B:693:0x2d43, B:694:0x2d44, B:696:0x2d46, B:698:0x2d4d, B:699:0x2d4e, B:634:0x29d8, B:636:0x29dc, B:640:0x29e8, B:642:0x29ee, B:654:0x2af6, B:656:0x2afc, B:657:0x2b41, B:659:0x2b6b, B:660:0x2bb5, B:662:0x2bcb, B:663:0x2c0f, B:701:0x2d50, B:703:0x2d57, B:704:0x2d58, B:706:0x2d5a, B:708:0x2d61, B:709:0x2d62), top: B:843:0x01a5, inners: #24, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0a60 A[Catch: all -> 0x0b2d, TryCatch #9 {all -> 0x0b2d, blocks: (B:171:0x0a4b, B:173:0x0a60, B:174:0x0a8e), top: B:848:0x0a4b, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0aa1 A[Catch: all -> 0x0b23, TryCatch #2 {all -> 0x0b23, blocks: (B:175:0x0a94, B:177:0x0aa1, B:178:0x0b18), top: B:835:0x0a94, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0d54 A[Catch: all -> 0x102d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x102d, blocks: (B:203:0x0c96, B:209:0x0cee, B:219:0x0d54, B:229:0x0de2, B:233:0x0e2f), top: B:846:0x0c96 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x10bc A[Catch: all -> 0x042c, TryCatch #6 {all -> 0x042c, blocks: (B:151:0x0969, B:153:0x096f, B:154:0x099d, B:432:0x17c9, B:434:0x17cf, B:435:0x17f9, B:532:0x1d5b, B:534:0x1d61, B:535:0x1d89, B:750:0x3115, B:752:0x311b, B:753:0x3146, B:787:0x346b, B:789:0x3471, B:790:0x349a, B:767:0x3293, B:769:0x32b6, B:770:0x3309, B:716:0x2dc7, B:718:0x2dcd, B:719:0x2dfb, B:810:0x357b, B:812:0x3581, B:813:0x35ad, B:815:0x35e7, B:816:0x3630, B:598:0x257b, B:600:0x2590, B:601:0x25c2, B:603:0x25f6, B:604:0x2670, B:575:0x2210, B:577:0x2216, B:578:0x2240, B:580:0x227a, B:581:0x22bd, B:548:0x1f66, B:550:0x1f7b, B:551:0x1fa9, B:282:0x10b6, B:284:0x10bc, B:285:0x10e7, B:196:0x0be5, B:198:0x0beb, B:199:0x0c12, B:17:0x01a5, B:19:0x01ab, B:20:0x01d3, B:22:0x039b, B:24:0x03cd, B:25:0x0426, B:159:0x0a2e, B:164:0x0a3e, B:182:0x0b25, B:184:0x0b2b, B:185:0x0b2c, B:187:0x0b2e, B:189:0x0b35, B:190:0x0b36, B:162:0x0a35, B:620:0x28ab, B:622:0x28b1, B:623:0x28fa, B:625:0x2921, B:626:0x296b, B:628:0x297e, B:630:0x2987, B:631:0x29c9, B:664:0x2c15, B:665:0x2c19, B:668:0x2c29, B:671:0x2c40, B:677:0x2c5b, B:679:0x2c5e, B:691:0x2d3d, B:693:0x2d43, B:694:0x2d44, B:696:0x2d46, B:698:0x2d4d, B:699:0x2d4e, B:634:0x29d8, B:636:0x29dc, B:640:0x29e8, B:642:0x29ee, B:654:0x2af6, B:656:0x2afc, B:657:0x2b41, B:659:0x2b6b, B:660:0x2bb5, B:662:0x2bcb, B:663:0x2c0f, B:701:0x2d50, B:703:0x2d57, B:704:0x2d58, B:706:0x2d5a, B:708:0x2d61, B:709:0x2d62), top: B:843:0x01a5, inners: #24, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x11cb A[Catch: all -> 0x174d, PHI: r2
  0x11cb: PHI (r2v172 java.lang.Object) = (r2v167 java.lang.Object), (r2v171 java.lang.Object) binds: [B:290:0x1175, B:291:0x1177] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x174d, blocks: (B:289:0x1171, B:295:0x11cb), top: B:886:0x1171 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0430 A[PHI: r15
  0x0430: PHI (r15v77 char) = (r15v15 char), (r15v79 char) binds: [B:15:0x0196, B:5:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x1244  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x125c  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x12c1  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x15cc A[Catch: all -> 0x1715, TryCatch #58 {all -> 0x1715, blocks: (B:364:0x15c2, B:365:0x15c6, B:367:0x15cc, B:370:0x15e9, B:355:0x14ef, B:360:0x1557, B:363:0x15ba), top: B:939:0x14ef }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x17cf A[Catch: all -> 0x042c, TryCatch #6 {all -> 0x042c, blocks: (B:151:0x0969, B:153:0x096f, B:154:0x099d, B:432:0x17c9, B:434:0x17cf, B:435:0x17f9, B:532:0x1d5b, B:534:0x1d61, B:535:0x1d89, B:750:0x3115, B:752:0x311b, B:753:0x3146, B:787:0x346b, B:789:0x3471, B:790:0x349a, B:767:0x3293, B:769:0x32b6, B:770:0x3309, B:716:0x2dc7, B:718:0x2dcd, B:719:0x2dfb, B:810:0x357b, B:812:0x3581, B:813:0x35ad, B:815:0x35e7, B:816:0x3630, B:598:0x257b, B:600:0x2590, B:601:0x25c2, B:603:0x25f6, B:604:0x2670, B:575:0x2210, B:577:0x2216, B:578:0x2240, B:580:0x227a, B:581:0x22bd, B:548:0x1f66, B:550:0x1f7b, B:551:0x1fa9, B:282:0x10b6, B:284:0x10bc, B:285:0x10e7, B:196:0x0be5, B:198:0x0beb, B:199:0x0c12, B:17:0x01a5, B:19:0x01ab, B:20:0x01d3, B:22:0x039b, B:24:0x03cd, B:25:0x0426, B:159:0x0a2e, B:164:0x0a3e, B:182:0x0b25, B:184:0x0b2b, B:185:0x0b2c, B:187:0x0b2e, B:189:0x0b35, B:190:0x0b36, B:162:0x0a35, B:620:0x28ab, B:622:0x28b1, B:623:0x28fa, B:625:0x2921, B:626:0x296b, B:628:0x297e, B:630:0x2987, B:631:0x29c9, B:664:0x2c15, B:665:0x2c19, B:668:0x2c29, B:671:0x2c40, B:677:0x2c5b, B:679:0x2c5e, B:691:0x2d3d, B:693:0x2d43, B:694:0x2d44, B:696:0x2d46, B:698:0x2d4d, B:699:0x2d4e, B:634:0x29d8, B:636:0x29dc, B:640:0x29e8, B:642:0x29ee, B:654:0x2af6, B:656:0x2afc, B:657:0x2b41, B:659:0x2b6b, B:660:0x2bb5, B:662:0x2bcb, B:663:0x2c0f, B:701:0x2d50, B:703:0x2d57, B:704:0x2d58, B:706:0x2d5a, B:708:0x2d61, B:709:0x2d62), top: B:843:0x01a5, inners: #24, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1883  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x18d8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1927 A[Catch: all -> 0x1c9d, TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1c9d, blocks: (B:439:0x187d, B:446:0x18cb, B:455:0x1927), top: B:948:0x187d }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1b66 A[Catch: all -> 0x1c9b, TryCatch #62 {all -> 0x1c9b, blocks: (B:479:0x1b5c, B:480:0x1b60, B:482:0x1b66, B:485:0x1b7d, B:488:0x1b8a, B:490:0x1b8d, B:502:0x1c71, B:504:0x1c77, B:505:0x1c78, B:507:0x1c7a, B:509:0x1c81, B:510:0x1c82, B:457:0x1935, B:469:0x1a3a, B:471:0x1a40, B:472:0x1a87, B:474:0x1ab1, B:475:0x1afc, B:477:0x1b12, B:478:0x1b56, B:513:0x1c88, B:515:0x1c8f, B:516:0x1c90, B:518:0x1c92, B:520:0x1c99, B:521:0x1c9a, B:498:0x1bf2, B:493:0x1bb9, B:495:0x1bbf, B:496:0x1bea, B:464:0x199c, B:466:0x19b8, B:467:0x1a2e, B:459:0x1949, B:461:0x195e, B:462:0x1995), top: B:947:0x1935, inners: #45, #47, #51, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1d61 A[Catch: all -> 0x042c, TryCatch #6 {all -> 0x042c, blocks: (B:151:0x0969, B:153:0x096f, B:154:0x099d, B:432:0x17c9, B:434:0x17cf, B:435:0x17f9, B:532:0x1d5b, B:534:0x1d61, B:535:0x1d89, B:750:0x3115, B:752:0x311b, B:753:0x3146, B:787:0x346b, B:789:0x3471, B:790:0x349a, B:767:0x3293, B:769:0x32b6, B:770:0x3309, B:716:0x2dc7, B:718:0x2dcd, B:719:0x2dfb, B:810:0x357b, B:812:0x3581, B:813:0x35ad, B:815:0x35e7, B:816:0x3630, B:598:0x257b, B:600:0x2590, B:601:0x25c2, B:603:0x25f6, B:604:0x2670, B:575:0x2210, B:577:0x2216, B:578:0x2240, B:580:0x227a, B:581:0x22bd, B:548:0x1f66, B:550:0x1f7b, B:551:0x1fa9, B:282:0x10b6, B:284:0x10bc, B:285:0x10e7, B:196:0x0be5, B:198:0x0beb, B:199:0x0c12, B:17:0x01a5, B:19:0x01ab, B:20:0x01d3, B:22:0x039b, B:24:0x03cd, B:25:0x0426, B:159:0x0a2e, B:164:0x0a3e, B:182:0x0b25, B:184:0x0b2b, B:185:0x0b2c, B:187:0x0b2e, B:189:0x0b35, B:190:0x0b36, B:162:0x0a35, B:620:0x28ab, B:622:0x28b1, B:623:0x28fa, B:625:0x2921, B:626:0x296b, B:628:0x297e, B:630:0x2987, B:631:0x29c9, B:664:0x2c15, B:665:0x2c19, B:668:0x2c29, B:671:0x2c40, B:677:0x2c5b, B:679:0x2c5e, B:691:0x2d3d, B:693:0x2d43, B:694:0x2d44, B:696:0x2d46, B:698:0x2d4d, B:699:0x2d4e, B:634:0x29d8, B:636:0x29dc, B:640:0x29e8, B:642:0x29ee, B:654:0x2af6, B:656:0x2afc, B:657:0x2b41, B:659:0x2b6b, B:660:0x2bb5, B:662:0x2bcb, B:663:0x2c0f, B:701:0x2d50, B:703:0x2d57, B:704:0x2d58, B:706:0x2d5a, B:708:0x2d61, B:709:0x2d62), top: B:843:0x01a5, inners: #24, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1e14  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1e65  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1f46  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0565 A[Catch: all -> 0x08e4, TRY_ENTER, TRY_LEAVE, TryCatch #41 {all -> 0x08e4, blocks: (B:31:0x0442, B:38:0x0494, B:54:0x0565), top: B:908:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x20f4  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x21ce  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x23db  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2444  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2489  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x24a0  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x255d  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x27af  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x017e A[PHI: r15
  0x017e: PHI (r15v15 char) = (r15v14 char), (r15v78 char) binds: [B:3:0x0177, B:5:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x2e88  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x2ed6  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x2f31  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x30f2  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x31d4  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3225  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x3275  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x344b  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x3542  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x11f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:871:0x1177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:877:0x0a2e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:910:0x0c9c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0794 A[Catch: all -> 0x08c3, TryCatch #20 {all -> 0x08c3, blocks: (B:90:0x078a, B:91:0x078e, B:93:0x0794, B:96:0x07ae, B:83:0x06c9, B:86:0x0727, B:89:0x0784), top: B:869:0x06c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:976:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v133 */
    /* JADX WARN: Type inference failed for: r10v134 */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v146 */
    /* JADX WARN: Type inference failed for: r10v147 */
    /* JADX WARN: Type inference failed for: r10v148 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v159 */
    /* JADX WARN: Type inference failed for: r10v160 */
    /* JADX WARN: Type inference failed for: r10v162 */
    /* JADX WARN: Type inference failed for: r10v163, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v169 */
    /* JADX WARN: Type inference failed for: r10v170 */
    /* JADX WARN: Type inference failed for: r10v171 */
    /* JADX WARN: Type inference failed for: r10v172 */
    /* JADX WARN: Type inference failed for: r10v269 */
    /* JADX WARN: Type inference failed for: r10v270 */
    /* JADX WARN: Type inference failed for: r10v271 */
    /* JADX WARN: Type inference failed for: r10v272 */
    /* JADX WARN: Type inference failed for: r10v273 */
    /* JADX WARN: Type inference failed for: r10v274 */
    /* JADX WARN: Type inference failed for: r10v275 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v266, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v270 */
    /* JADX WARN: Type inference failed for: r12v271 */
    /* JADX WARN: Type inference failed for: r12v272 */
    /* JADX WARN: Type inference failed for: r12v273 */
    /* JADX WARN: Type inference failed for: r12v274 */
    /* JADX WARN: Type inference failed for: r12v275 */
    /* JADX WARN: Type inference failed for: r12v276 */
    /* JADX WARN: Type inference failed for: r12v277 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v114 */
    /* JADX WARN: Type inference failed for: r26v115 */
    /* JADX WARN: Type inference failed for: r26v116 */
    /* JADX WARN: Type inference failed for: r26v117 */
    /* JADX WARN: Type inference failed for: r26v118 */
    /* JADX WARN: Type inference failed for: r26v119 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v120 */
    /* JADX WARN: Type inference failed for: r26v121 */
    /* JADX WARN: Type inference failed for: r26v122 */
    /* JADX WARN: Type inference failed for: r26v123 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v69 */
    /* JADX WARN: Type inference failed for: r26v70 */
    /* JADX WARN: Type inference failed for: r26v71 */
    /* JADX WARN: Type inference failed for: r26v72 */
    /* JADX WARN: Type inference failed for: r26v73 */
    /* JADX WARN: Type inference failed for: r26v81 */
    /* JADX WARN: Type inference failed for: r26v82 */
    /* JADX WARN: Type inference failed for: r26v83 */
    /* JADX WARN: Type inference failed for: r26v84 */
    /* JADX WARN: Type inference failed for: r26v85 */
    /* JADX WARN: Type inference failed for: r26v86 */
    /* JADX WARN: Type inference failed for: r26v87 */
    /* JADX WARN: Type inference failed for: r26v93 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v45 */
    /* JADX WARN: Type inference failed for: r27v56 */
    /* JADX WARN: Type inference failed for: r27v57 */
    /* JADX WARN: Type inference failed for: r27v58 */
    /* JADX WARN: Type inference failed for: r27v59 */
    /* JADX WARN: Type inference failed for: r27v60 */
    /* JADX WARN: Type inference failed for: r27v63 */
    /* JADX WARN: Type inference failed for: r27v80 */
    /* JADX WARN: Type inference failed for: r27v81 */
    /* JADX WARN: Type inference failed for: r27v82 */
    /* JADX WARN: Type inference failed for: r27v83 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v141, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r2v145 */
    /* JADX WARN: Type inference failed for: r2v147 */
    /* JADX WARN: Type inference failed for: r2v360, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v361 */
    /* JADX WARN: Type inference failed for: r2v362 */
    /* JADX WARN: Type inference failed for: r2v363 */
    /* JADX WARN: Type inference failed for: r2v364 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v395, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v396 */
    /* JADX WARN: Type inference failed for: r5v397 */
    /* JADX WARN: Type inference failed for: r5v398 */
    /* JADX WARN: Type inference failed for: r5v399 */
    /* JADX WARN: Type inference failed for: r5v416 */
    /* JADX WARN: Type inference failed for: r5v417 */
    /* JADX WARN: Type inference failed for: r5v519 */
    /* JADX WARN: Type inference failed for: r5v520 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v382 */
    /* JADX WARN: Type inference failed for: r7v384 */
    /* JADX WARN: Type inference failed for: r7v385 */
    /* JADX WARN: Type inference failed for: r7v388, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v389 */
    /* JADX WARN: Type inference failed for: r7v390 */
    /* JADX WARN: Type inference failed for: r7v391 */
    /* JADX WARN: Type inference failed for: r7v396 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v409 */
    /* JADX WARN: Type inference failed for: r7v416 */
    /* JADX WARN: Type inference failed for: r7v417 */
    /* JADX WARN: Type inference failed for: r7v418 */
    /* JADX WARN: Type inference failed for: r7v419 */
    /* JADX WARN: Type inference failed for: r7v420 */
    /* JADX WARN: Type inference failed for: r7v421 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v353 */
    /* JADX WARN: Type inference failed for: r8v354 */
    /* JADX WARN: Type inference failed for: r8v355 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v357 */
    /* JADX WARN: Type inference failed for: r8v363, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v366 */
    /* JADX WARN: Type inference failed for: r8v367 */
    /* JADX WARN: Type inference failed for: r8v370 */
    /* JADX WARN: Type inference failed for: r8v371 */
    /* JADX WARN: Type inference failed for: r8v380 */
    /* JADX WARN: Type inference failed for: r8v397 */
    /* JADX WARN: Type inference failed for: r8v402 */
    /* JADX WARN: Type inference failed for: r8v431 */
    /* JADX WARN: Type inference failed for: r8v437 */
    /* JADX WARN: Type inference failed for: r8v438 */
    /* JADX WARN: Type inference failed for: r8v441, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v445 */
    /* JADX WARN: Type inference failed for: r8v446 */
    /* JADX WARN: Type inference failed for: r8v452 */
    /* JADX WARN: Type inference failed for: r8v463 */
    /* JADX WARN: Type inference failed for: r8v464 */
    /* JADX WARN: Type inference failed for: r8v465 */
    /* JADX WARN: Type inference failed for: r8v466 */
    /* JADX WARN: Type inference failed for: r8v467 */
    /* JADX WARN: Type inference failed for: r8v468 */
    /* JADX WARN: Type inference failed for: r8v469 */
    /* JADX WARN: Type inference failed for: r8v470 */
    /* JADX WARN: Type inference failed for: r8v471 */
    /* JADX WARN: Type inference failed for: r8v472 */
    /* JADX WARN: Type inference failed for: r8v473 */
    /* JADX WARN: Type inference failed for: r8v474 */
    /* JADX WARN: Type inference failed for: r8v475 */
    /* JADX WARN: Type inference failed for: r8v476 */
    /* JADX WARN: Type inference failed for: r8v477 */
    /* JADX WARN: Type inference failed for: r8v478 */
    /* JADX WARN: Type inference failed for: r8v479 */
    /* JADX WARN: Type inference failed for: r8v480 */
    /* JADX WARN: Type inference failed for: r8v481 */
    /* JADX WARN: Type inference failed for: r8v482 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.favorites.manage.ManageFavoritesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11523$r8$lambda$VCyG1x0nFE6jo8yfZrdS5eD1Vw(ManageFavoritesActivity manageFavoritesActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            observeDeletion$lambda$0(manageFavoritesActivity, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitObserveDeletion$lambda$0 = observeDeletion$lambda$0(manageFavoritesActivity, resource);
        int i3 = copy + 55;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return unitObserveDeletion$lambda$0;
    }

    static {
        getAsAtTimestamp = 1;
        component2();
        component3();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = component4 + 125;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 71;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 89;
        copy = i3 % 128;
        int i4 = i3 % 2;
        component2 = new int[]{-1436654913, 2075404614, -1168641854, -1199780601, 1151620762, -1181920512, 1270682844, -816492651, 1150338123, 455645348, 191833309, -473987779, -870420369, 1655844251, 927856740, -1512618962, 849117141, -1078200061};
        int i5 = i2 + 75;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    static void component2() {
        component3 = 1390050762095590171L;
        component1 = 1386857713;
        ShareDataUIState = (char) 50417;
        copydefault = -2442205461680880256L;
    }
}
