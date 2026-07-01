package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.util.CollectionUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.digitalpayment.consumer.base.resp.FavoriteFriendsBean;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\tH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/AddFavouriteFriendActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityAddFavouriteFriendBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/ManageFavouriteViewModel;", "<init>", "()V", FixedDataNavKeys.EXTRA_CONTACT_RESP, "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;", "businessType", "", "favoriteFriendsBeanList", "Ljava/util/ArrayList;", "Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteFriendsBean;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "needSoftFix", "", "initObserver", "initListener", "checkConfirmAble", "getAlreadyAddTips", "hasAddFavorite", "initView", "updateView", "initToolbar", "title", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class AddFavouriteFriendActivity extends Hilt_AddFavouriteFriendActivity<ActivityAddFavouriteFriendBinding, ManageFavouriteViewModel> {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static int component2;
    private static boolean component3;
    private static int component4;
    private static char copy;
    private static char[] copydefault;
    private static long getRequestBeneficiariesState;
    private SfcContact contactResp;
    private static final byte[] $$c = {66, 42, 112, 97};
    private static final int $$f = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {120, -62, 63, 57, Ascii.FF, -2, 3, -1, -1, -9, 9, 6, -65, Ascii.FF, -2, -63, 57, 8, 0, -8, 5, -7, -55, 56, 3, 9, -13, -3, -1, Ascii.DC2, -14, -55, 69, -14, Ascii.SO, 0, -10, 6, -1, 5, -69, TarHeader.LF_FIFO, -3, 6, 0, -2, 13, PSSSigner.TRAILER_IMPLICIT, 59, 5, 6, -15, 13, -4, -13, Ascii.VT, -62, 34, 34, -13, -2, Ascii.FF, -1, -10, 5, Ascii.VT, -11, 6, -1, 5, Ascii.NAK, -7, 17, -13, -33, Ascii.GS, 19, -19, -12, -12, 10, 33, -19, 19, -15};
    private static final int $$h = 240;
    private static final byte[] $$a = {93, -40, 95, -94, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 208;
    private static int toString = 1;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private String businessType = "";
    private ArrayList<FavoriteFriendsBean> favoriteFriendsBeanList = new ArrayList<>();
    private final ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 1;
        private static int component2;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            AddFavouriteFriendActivity.$r8$lambda$fEwAg9AuXiV15M_FL4cGrTyAMQg(this.f$0, (ActivityResult) obj);
            if (i3 != 0) {
                throw null;
            }
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Observer, FunctionAdapter {
        private static int component1 = 1;
        private static int component2;
        private final Function1 copydefault;

        copydefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                int i2 = component2 + 61;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            } else {
                zAreEqual = false;
            }
            int i4 = component2 + 13;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return zAreEqual;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 69;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                Function1 function1 = this.copydefault;
                obj.hashCode();
                throw null;
            }
            Function1 function12 = this.copydefault;
            int i4 = i3 + 89;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return function12;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 75;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component1 + 17;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 55;
            component1 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                this.copydefault.invoke(obj);
                throw null;
            }
            this.copydefault.invoke(obj);
            int i3 = component1 + 105;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r8 = 119 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.$$c
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.$$a
            int r1 = r7 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.d(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r7 = r7 * 6
            int r7 = r7 + 10
            int r5 = r5 * 3
            int r5 = 69 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.$$g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r4 = r0[r5]
        L2b:
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.f(int, int, byte, java.lang.Object[]):void");
    }

    public static final void access$checkConfirmAble(AddFavouriteFriendActivity addFavouriteFriendActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        equals = i2 % 128;
        int i3 = i2 % 2;
        addFavouriteFriendActivity.checkConfirmAble();
        int i4 = equals + 53;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    private static final void launcher$lambda$0(AddFavouriteFriendActivity addFavouriteFriendActivity, ActivityResult activityResult) {
        Intent data;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
        Intrinsics.checkNotNull(activityResult);
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        int i2 = getAsAtTimestamp + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        addFavouriteFriendActivity.contactResp = (SfcContact) data.getSerializableExtra(FixedDataNavKeys.EXTRA_CONTACT_RESP);
        EditText editText = ((ActivityAddFavouriteFriendBinding) addFavouriteFriendActivity.binding).inputPhoneNumber.getEditText();
        SfcContact sfcContact = addFavouriteFriendActivity.contactResp;
        editText.setText(sfcContact != null ? sfcContact.getRealPhoneNumber() : null);
        if (ArraysKt.contains(new String[]{"P2PTransfer", "PochiTransfer", "TransferPochi", TradeTypeConstant.AIRTIME_MPESA, TradeTypeConstant.AIRTIME_SCRATCH_CARD}, addFavouriteFriendActivity.businessType)) {
            int i4 = getAsAtTimestamp + 101;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityAddFavouriteFriendBinding) addFavouriteFriendActivity.binding).inputName.getEditText();
                SfcContact sfcContact2 = addFavouriteFriendActivity.contactResp;
                throw null;
            }
            EditText editText2 = ((ActivityAddFavouriteFriendBinding) addFavouriteFriendActivity.binding).inputName.getEditText();
            SfcContact sfcContact3 = addFavouriteFriendActivity.contactResp;
            editText2.setText(sfcContact3 != null ? sfcContact3.getName() : null);
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_add_favourite_friend;
        int i5 = equals + 51;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r29, char[] r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.c(int, char[], java.lang.Object[]):void");
    }

    private static void e(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = ShareDataUIState;
        char c2 = '0';
        int i4 = -1;
        int i5 = 0;
        if (cArr3 != null) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(cArr3[i2]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", i5, i5) + 3760, Color.green(i5) + 24, (char) ((-1) - TextUtils.indexOf("", c2, i5, i5)), -1670574543, false, $$i(b2, b3, (byte) (b3 | TarHeader.LF_CHR)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i2++;
                    c2 = '0';
                    i4 = -1;
                    i5 = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(component2)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7141, 13 - Color.alpha(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            long j = 0;
            if (component3) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2747 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 19, (char) (TextUtils.getTrimmedLength("") + 7644), -327556343, false, $$i(b4, b5, (byte) (b5 | 46)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                String str = new String(cArr4);
                int i7 = $11 + 37;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                objArr[0] = str;
                return;
            }
            if (component1) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i9 = $11 + 87;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr5[cancelVar.component3] = (char) (cArr3[cArr[cancelVar.component1 * cancelVar.component3] >> i] % iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 2748, ((Process.getThreadPriority(0) + 20) >> 6) + 19, (char) (7645 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), -327556343, false, $$i(b6, b7, (byte) (b7 | 46)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } else {
                        cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                        Object[] objArr6 = {cancelVar, cancelVar};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault5 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (b8 + 1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.argb(0, 0, 0, 0), 19 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (7644 - Color.blue(0)), -327556343, false, $$i(b8, b9, (byte) (b9 | 46)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault5).invoke(null, objArr6);
                        j = 0;
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i10;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i10 = cancelVar.component3 + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static void b(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        Object obj2 = null;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> i4) + 15, (char) (64291 - Gravity.getAbsoluteGravity(0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(copy)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - KeyEvent.keyCodeFromString(""), 15 - TextUtils.getOffsetBefore("", 0), (char) (MotionEvent.axisFromString("") + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            int i6 = $10 + 91;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cancelall.component2 = 1;
            } else {
                cancelall.component2 = 0;
            }
            while (cancelall.component2 < i2) {
                int i7 = $10 + 47;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, (char) (44463 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i9 = $10 + 63;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) (-1);
                                byte b4 = (byte) (b3 + 1);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, (char) (27638 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 794909189, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i11];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i12];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                        } else {
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e3  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        ((ManageFavouriteViewModel) this.viewModel).getCreateData().observe(this, new copydefault(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 7;
                component1 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    AddFavouriteFriendActivity.$r8$lambda$l06b90NR1HwW_vWmTftLtaeA8bI(this.f$0, (Resource) obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unit$r8$lambda$l06b90NR1HwW_vWmTftLtaeA8bI = AddFavouriteFriendActivity.$r8$lambda$l06b90NR1HwW_vWmTftLtaeA8bI(this.f$0, (Resource) obj);
                int i4 = component2 + 3;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit$r8$lambda$l06b90NR1HwW_vWmTftLtaeA8bI;
                }
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = equals + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$1(AddFavouriteFriendActivity addFavouriteFriendActivity, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
        Utils.showOrHideLoading(addFavouriteFriendActivity, resource);
        if (resource.error()) {
            int i2 = equals + 89;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                ToastUtils.showLong(resource.getMessage(), new Object[0]);
                return Unit.INSTANCE;
            }
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
            return Unit.INSTANCE;
        }
        if (resource.success()) {
            FavoriteFriendsBean favoriteFriendsBean = new FavoriteFriendsBean(0, ((ActivityAddFavouriteFriendBinding) addFavouriteFriendActivity.binding).inputName.getText(), null, ((ActivityAddFavouriteFriendBinding) addFavouriteFriendActivity.binding).inputPhoneNumber.getText(), null, null, null, 0L, 0, 501, null);
            Intent intent = new Intent();
            intent.putExtra("favoriteFriendsBean", favoriteFriendsBean);
            addFavouriteFriendActivity.setResult(-1, intent);
            addFavouriteFriendActivity.finish();
        }
        Unit unit = Unit.INSTANCE;
        int i3 = equals + 19;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void initListener$lambda$2(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
            addFavouriteFriendActivity.finish();
        } else {
            Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
            addFavouriteFriendActivity.finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void initListener$lambda$3(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
            RouteUtils.routeWithExecute(addFavouriteFriendActivity.activity, RoutePathConstant.SELECT_CONTACT, null, addFavouriteFriendActivity.launcher);
        } else {
            Intrinsics.checkNotNullParameter(addFavouriteFriendActivity, "");
            RouteUtils.routeWithExecute(addFavouriteFriendActivity.activity, RoutePathConstant.SELECT_CONTACT, null, addFavouriteFriendActivity.launcher);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void initListener$lambda$4(com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity r8, android.view.View r9) {
        /*
            r9 = 2
            int r0 = r9 % r9
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            Binding extends androidx.databinding.ViewDataBinding r1 = r8.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding r1 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding) r1
            com.huawei.common.widget.input.CommonInputView r1 = r1.inputPhoneNumber
            java.lang.String r1 = r1.getText()
            Binding extends androidx.databinding.ViewDataBinding r2 = r8.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding r2 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding) r2
            com.huawei.common.widget.input.CommonInputView r2 = r2.inputName
            java.lang.String r2 = r2.getText()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.CharSequence r2 = kotlin.text.StringsKt.trim(r2)
            java.lang.String r2 = r2.toString()
            Binding extends androidx.databinding.ViewDataBinding r3 = r8.binding
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding r3 = (com.huawei.digitalpayment.consumer.sfc.databinding.ActivityAddFavouriteFriendBinding) r3
            com.huawei.common.widget.input.CommonInputView r3 = r3.inputAccountNumber
            java.lang.String r3 = r3.getText()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "idNumber"
            r5.put(r6, r1)
            java.lang.String r1 = "favouriteName"
            r5.put(r1, r2)
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r2 = com.blankj.utilcode.util.GsonUtils.toJson(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "AddFavouriteFriendActivity"
            r1.d(r7, r2, r6)
            java.lang.String r1 = "PayBill"
            java.lang.String r2 = r8.businessType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L7d
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp = r2
            int r1 = r1 % r9
            java.lang.String r2 = "PochiPayBill"
            if (r1 != 0) goto L73
            java.lang.String r1 = r8.businessType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r1 == 0) goto L82
            goto L7d
        L73:
            java.lang.String r8 = r8.businessType
            kotlin.jvm.internal.Intrinsics.areEqual(r2, r8)
            r8 = 0
            r8.hashCode()
            throw r8
        L7d:
            java.lang.String r1 = "accountNum"
            r5.put(r1, r3)
        L82:
            VM extends androidx.lifecycle.ViewModel r1 = r8.viewModel
            com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel r1 = (com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.ManageFavouriteViewModel) r1
            java.lang.String r8 = r8.businessType
            java.lang.String r2 = com.blankj.utilcode.util.GsonUtils.toJson(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r0 = "MPESATransaction"
            r1.addFavourite(r0, r8, r2)
            int r8 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals
            int r8 = r8 + 109
            int r0 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp = r0
            int r8 = r8 % r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.initListener$lambda$4(com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity, android.view.View):void");
    }

    private final void initListener() {
        int i = 2 % 2;
        ((ActivityAddFavouriteFriendBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 87;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                AddFavouriteFriendActivity.$r8$lambda$JX00shtTFmBXFtU0EI3Fr8LKe1k(this.f$0, view);
                int i5 = component2 + 3;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ImageView endIcon = ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEndIcon();
        if (endIcon != null) {
            endIcon.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 7;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    AddFavouriteFriendActivity.$r8$lambda$NUhGomNfHkLjV6ZEAtfai2BNnbE(this.f$0, view);
                    int i5 = ShareDataUIState + 27;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            int i2 = getAsAtTimestamp + 3;
            equals = i2 % 128;
            int i3 = i2 % 2;
        }
        ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable s) {
                int i4 = 2 % 2;
                int i5 = copydefault + 45;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                AddFavouriteFriendActivity.access$checkConfirmAble(AddFavouriteFriendActivity.this);
                int i7 = component2 + 15;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        ((ActivityAddFavouriteFriendBinding) this.binding).inputName.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 53;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                AddFavouriteFriendActivity.access$checkConfirmAble(AddFavouriteFriendActivity.this);
                int i7 = ShareDataUIState + 13;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void afterTextChanged(Editable s) {
                int i4 = 2 % 2;
                int i5 = component3 + 39;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                AddFavouriteFriendActivity.access$checkConfirmAble(AddFavouriteFriendActivity.this);
                if (i6 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityAddFavouriteFriendBinding) this.binding).btnConfirm.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = component3 + 19;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    AddFavouriteFriendActivity.$r8$lambda$6H1nYVO1O7OfGFsLaDaKLr6oT6o(this.f$0, view);
                    throw null;
                }
                AddFavouriteFriendActivity.$r8$lambda$6H1nYVO1O7OfGFsLaDaKLr6oT6o(this.f$0, view);
                int i6 = copydefault + 49;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        checkConfirmAble();
        int i4 = equals + 81;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkConfirmAble() {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.checkConfirmAble():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r1.equals("PayBill") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r1 = getString(com.huawei.digitalpayment.consumer.sfc.R.string.paybill_number_is_a_favorite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r2 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals + 17;
        com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if ((r2 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r0 = 2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1.equals("P2PTransfer") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1.equals("PochiTransfer") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r1 = getString(com.huawei.digitalpayment.consumer.sfc.R.string.phone_number_is_a_favourite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1.equals("PochiPayBill") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r1.equals("PochiBuyGoods") == false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getAlreadyAddTips() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals = r2
            int r1 = r1 % r0
            java.lang.String r1 = r4.businessType
            int r2 = r1.hashCode()
            java.lang.String r3 = ""
            switch(r2) {
                case -941772656: goto L67;
                case -779848400: goto L54;
                case -479870791: goto L4b;
                case 876694703: goto L2b;
                case 1227819445: goto L22;
                case 2055060202: goto L19;
                default: goto L17;
            }
        L17:
            goto L83
        L19:
            java.lang.String r2 = "PochiPayBill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L83
        L22:
            java.lang.String r0 = "PochiBuyGoods"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L79
            goto L83
        L2b:
            java.lang.String r2 = "PayBill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            goto L83
        L34:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.string.paybill_number_is_a_favorite
            java.lang.String r1 = r4.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            int r2 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals
            int r2 = r2 + 17
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L8c
            int r0 = r0 % 5
            goto L8c
        L4b:
            java.lang.String r0 = "P2PTransfer"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5d
            goto L83
        L54:
            java.lang.String r0 = "PochiTransfer"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5d
            goto L83
        L5d:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.string.phone_number_is_a_favourite
            java.lang.String r1 = r4.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            goto L8c
        L67:
            java.lang.String r2 = "BuyGoods"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L79
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAsAtTimestamp
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.equals = r2
            int r1 = r1 % r0
            goto L83
        L79:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.string.till_number_is_a_favorite
            java.lang.String r1 = r4.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            goto L8c
        L83:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.string.number_is_a_favorite
            java.lang.String r1 = r4.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.getAlreadyAddTips():java.lang.String");
    }

    private final boolean hasAddFavorite() {
        int i = 2 % 2;
        if (!(!CollectionUtils.isEmpty(this.favoriteFriendsBeanList))) {
            return false;
        }
        Iterator<FavoriteFriendsBean> it = this.favoriteFriendsBeanList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            int i2 = getAsAtTimestamp + 73;
            equals = i2 % 128;
            int i3 = i2 % 2;
            FavoriteFriendsBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            FavoriteFriendsBean favoriteFriendsBean = next;
            if (Intrinsics.areEqual("P2PTransfer", this.businessType) || Intrinsics.areEqual("PochiTransfer", this.businessType)) {
                if (!(!Intrinsics.areEqual(SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(favoriteFriendsBean.getPhoneNumber()), SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getText())))) {
                    int i4 = getAsAtTimestamp + 93;
                    equals = i4 % 128;
                    if (i4 % 2 != 0) {
                        return true;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                if (Intrinsics.areEqual(favoriteFriendsBean.getPhoneNumber(), ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getText())) {
                    if (!TextUtils.isEmpty(favoriteFriendsBean.getAccountNumber())) {
                        int i5 = equals + 79;
                        getAsAtTimestamp = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 52 / 0;
                            if (!Intrinsics.areEqual(favoriteFriendsBean.getAccountNumber(), ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.getText())) {
                            }
                        } else if (!Intrinsics.areEqual(favoriteFriendsBean.getAccountNumber(), ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.getText())) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initView() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.initView():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void updateView(String businessType) {
        int i = 2 % 2;
        switch (businessType.hashCode()) {
            case -941772656:
                if (!businessType.equals("BuyGoods")) {
                    int i2 = getAsAtTimestamp + 41;
                    equals = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 3 / 4;
                    }
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(8);
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.setTitle(getString(R.string.till_number));
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEditText().setHint(R.string.pesa_enter_till_number);
                break;
            case -779848400:
                if (!businessType.equals("PochiTransfer")) {
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(8);
                break;
            case -479870791:
                if (!businessType.equals("P2PTransfer")) {
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(8);
                break;
            case 876694703:
                if (!businessType.equals("PayBill")) {
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(0);
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.setTitle(getString(R.string.pay_bill_number));
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEditText().setHint(R.string.enter_pay_bill_number);
                break;
            case 1227819445:
                if (!businessType.equals("PochiBuyGoods")) {
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(8);
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.setTitle(getString(R.string.till_number));
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEditText().setHint(R.string.pesa_enter_till_number);
                break;
            case 2055060202:
                if (!businessType.equals("PochiPayBill")) {
                    int i4 = getAsAtTimestamp + 43;
                    equals = i4 % 128;
                    int i5 = i4 % 2;
                }
                ((ActivityAddFavouriteFriendBinding) this.binding).inputAccountNumber.setVisibility(0);
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.setTitle(getString(R.string.pay_bill_number));
                ((ActivityAddFavouriteFriendBinding) this.binding).inputPhoneNumber.getEditText().setHint(R.string.enter_pay_bill_number);
                break;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getAsAtTimestamp + 37;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(new char[]{22, ')', 4, 2, '-', '!', 6, '-', 23, ')', ')', AbstractJsonLexerKt.COMMA, '(', 0, 3, ' ', '\n', 28, 2, '.', '\t', 19, 2, 3, 24, 6}, (byte) (86 - TextUtils.indexOf("", "")), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{1, '/', 13823, 13823, 1, '%', 0, '\'', 13825, 13825, 3, 28, 6, JSONLexer.EOI, 3, ' ', '+', '('}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 9), 18 - View.resolveSizeAndState(0, 0, 0), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = equals + 39;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 5;
            }
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = equals + 9;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6619, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getLongPressTimeout() >> 16), 56 - View.resolveSizeAndState(0, 0, 0), (char) ExpandableListView.getPackedPositionType(0L), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(47:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|802|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|(11:887|32|(3:34|879|35)|39|40|870|(5:42|43|(1:45)|46|47)(25:48|49|872|50|51|865|52|(3:54|824|55)|59|60|856|61|(2:859|63)|67|68|69|(2:808|71)|75|76|846|77|(3:79|840|80)|81|(1:83)|84)|85|(4:88|(2:90|921)(11:91|(3:93|(3:96|97|94)|922)|100|820|101|(1:103)|104|105|814|106|920)|107|86)|919|119)|120|(33:155|858|156|(2:158|(3:160|(2:162|167)|166)(3:163|(2:165|167)|166))(1:167)|204|844|205|(13:207|895|208|212|(6:214|883|215|216|876|217)(1:222)|838|223|224|805|(4:226|227|(1:229)|230)(12:(2:234|(3:236|237|(2:239|241)(1:240))(1:241))(1:243)|(20:245|816|246|(2:794|248)|252|253|806|254|(2:830|256)|260|261|262|(1:264)|265|266|267|(1:269)(1:270)|271|(1:273)|274)(1:321)|326|327|848|328|331|332|(1:334)|335|336|337)|275|(4:278|(3:914|280|917)(12:913|281|(3:283|(3:286|287|284)|918)|288|798|289|(1:291)|292|293|796|294|916)|915|276)|912)(10:212|(0)(0)|838|223|224|805|(0)(0)|275|(1:276)|912)|338|869|339|(1:341)|342|(3:344|(1:346)|347)(19:348|349|861|350|(1:352)|353|354|850|355|(1:357)|358|359|360|(1:362)|363|(1:365)(1:366)|367|(1:369)|370)|371|(4:375|(2:377|901)(11:378|(3:380|(4:383|384|385|381)|902)|386|834|387|(1:389)|390|391|818|392|900)|393|372)|899|374|427|793|428|(1:430)|431|(3:433|(1:435)|436)(14:438|439|897|440|(1:442)|443|444|445|(1:447)|448|(1:450)|451|(1:453)|454)|437|455|(9:458|893|459|(1:461)|462|463|464|885|465)|495|(1:497)|498|(3:500|(1:502)|503)(14:504|505|(1:507)|508|509|(1:511)|512|889|513|514|(1:516)|517|(1:519)|520)|521|(37:523|(1:525)|526|(1:528)|529|(3:531|(1:533)|534)(16:536|537|(1:539)|540|(1:542)|543|544|(1:546)|547|800|548|549|(1:551)|552|(1:554)|555)|535|556|(1:558)(9:559|(3:561|(2:564|562)|910)|565|566|(1:568)|569|(1:571)|572|573)|574|877|575|(2:874|577)|581|582|871|583|(1:585)|586|(3:588|(1:590)|591)(17:592|(2:594|(1:600)(1:599))|(19:602|603|867|604|(1:606)|607|608|863|609|(1:611)|612|613|614|(1:616)|617|(1:619)|620|(1:622)|623)|683|(1:685)|686|(3:688|(1:690)|691)(13:693|842|694|695|(1:697)|698|881|699|700|(1:702)|703|(1:705)|706)|692|707|(6:710|711|(1:713)|714|715|716)|717|(1:719)|720|(3:722|(1:724)|725)(14:727|728|(1:730)|731|732|(1:734)|735|891|736|737|(1:739)|740|(1:742)|743)|726|744|(1:923)(7:747|748|(1:750)|751|752|753|754))|624|(4:627|(3:905|629|908)(12:904|630|(3:632|(4:635|636|637|633)|909)|638|854|639|(1:641)|642|643|836|644|907)|906|625)|903|683|(0)|686|(0)(0)|692|707|(0)|717|(0)|720|(0)(0)|726|744|(0)(0))(10:766|(3:768|(2:771|769)|911)|772|773|(1:775)|776|(1:778)|779|780|781))(1:171)|172|812|173|(1:175)|176|803|177|(1:179)|180|181|204|844|205|(0)(0)|338|869|339|(0)|342|(0)(0)|371|(1:372)|899|374|427|793|428|(0)|431|(0)(0)|437|455|(0)|495|(0)|498|(0)(0)|521|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x115d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x115e, code lost:
    
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x16f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x16f7, code lost:
    
        r6 = new java.lang.Object[1];
        c(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) + 57853, new char[]{844, 57697, 50967, 42445, 35821, 27033, 20045, 11367, 4633, 61645, 55014}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x173b, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x1752, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x1756, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r12 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)));
        r12 = 0;
        r1 = ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x1787, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x178b, code lost:
    
        if (r4 == null) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x178d, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.Process.myTid() >> 22) + 42, (char) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x17bc, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x17c4, code lost:
    
        r8 = new java.lang.Object[]{542358485, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), 56 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0));
        r2 = com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.$$g;
        r10 = new java.lang.Object[1];
        f((byte) (r2[70] + 1), (byte) (-r2[7]), r2[18], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x087c A[Catch: all -> 0x03b5, TryCatch #5 {all -> 0x03b5, blocks: (B:147:0x0876, B:149:0x087c, B:150:0x08a4, B:332:0x1214, B:334:0x121a, B:335:0x1245, B:711:0x3052, B:713:0x3058, B:714:0x3085, B:748:0x3399, B:750:0x339f, B:751:0x33c3, B:728:0x31d9, B:730:0x31fc, B:731:0x3251, B:677:0x2d05, B:679:0x2d0b, B:680:0x2d39, B:566:0x2614, B:568:0x261a, B:569:0x2641, B:571:0x267b, B:572:0x26c2, B:537:0x2294, B:539:0x22a9, B:540:0x22d9, B:542:0x230d, B:543:0x238c, B:773:0x34ad, B:775:0x34b3, B:776:0x34e3, B:778:0x351d, B:779:0x3558, B:505:0x1e07, B:507:0x1e1c, B:508:0x1e4c, B:489:0x1c17, B:491:0x1c1d, B:492:0x1c4a, B:421:0x1787, B:423:0x178d, B:424:0x17bc, B:198:0x0b06, B:200:0x0b0c, B:201:0x0b36, B:19:0x01b4, B:21:0x01ba, B:22:0x01e0, B:24:0x0326, B:26:0x0357, B:27:0x03af, B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974, B:156:0x0937, B:160:0x0944, B:184:0x0a3c, B:186:0x0a42, B:187:0x0a43, B:189:0x0a45, B:191:0x0a4c, B:192:0x0a4d, B:163:0x0952, B:167:0x095e, B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5), top: B:802:0x01b4, inners: #0, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x097e A[Catch: all -> 0x0a44, TryCatch #11 {all -> 0x0a44, blocks: (B:173:0x0969, B:175:0x097e, B:176:0x09aa), top: B:812:0x0969, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09bd A[Catch: all -> 0x0a3a, TryCatch #6 {all -> 0x0a3a, blocks: (B:177:0x09b0, B:179:0x09bd, B:180:0x0a31), top: B:803:0x09b0, outer: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0bcb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0c18 A[Catch: all -> 0x115d, PHI: r2
  0x0c18: PHI (r2v584 java.lang.Object) = (r2v583 java.lang.Object), (r2v643 java.lang.Object) binds: [B:206:0x0bc9, B:208:0x0bce] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x115d, blocks: (B:205:0x0bc5, B:212:0x0c18), top: B:844:0x0bc5 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x101a A[Catch: all -> 0x113b, TryCatch #7 {all -> 0x113b, blocks: (B:275:0x1010, B:276:0x1014, B:278:0x101a, B:281:0x1032, B:284:0x103e, B:286:0x1041, B:298:0x1129, B:300:0x112f, B:301:0x1130, B:303:0x1132, B:305:0x1139, B:306:0x113a, B:267:0x0f43, B:269:0x0f60, B:271:0x0fad, B:273:0x0fc3, B:274:0x1008, B:311:0x1141, B:313:0x1147, B:314:0x1148, B:317:0x114d, B:319:0x1153, B:320:0x1154, B:294:0x10a8, B:289:0x106e, B:291:0x1074, B:292:0x10a0), top: B:805:0x0ca5, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x121a A[Catch: all -> 0x03b5, TryCatch #5 {all -> 0x03b5, blocks: (B:147:0x0876, B:149:0x087c, B:150:0x08a4, B:332:0x1214, B:334:0x121a, B:335:0x1245, B:711:0x3052, B:713:0x3058, B:714:0x3085, B:748:0x3399, B:750:0x339f, B:751:0x33c3, B:728:0x31d9, B:730:0x31fc, B:731:0x3251, B:677:0x2d05, B:679:0x2d0b, B:680:0x2d39, B:566:0x2614, B:568:0x261a, B:569:0x2641, B:571:0x267b, B:572:0x26c2, B:537:0x2294, B:539:0x22a9, B:540:0x22d9, B:542:0x230d, B:543:0x238c, B:773:0x34ad, B:775:0x34b3, B:776:0x34e3, B:778:0x351d, B:779:0x3558, B:505:0x1e07, B:507:0x1e1c, B:508:0x1e4c, B:489:0x1c17, B:491:0x1c1d, B:492:0x1c4a, B:421:0x1787, B:423:0x178d, B:424:0x17bc, B:198:0x0b06, B:200:0x0b0c, B:201:0x0b36, B:19:0x01b4, B:21:0x01ba, B:22:0x01e0, B:24:0x0326, B:26:0x0357, B:27:0x03af, B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974, B:156:0x0937, B:160:0x0944, B:184:0x0a3c, B:186:0x0a42, B:187:0x0a43, B:189:0x0a45, B:191:0x0a4c, B:192:0x0a4d, B:163:0x0952, B:167:0x095e, B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5), top: B:802:0x01b4, inners: #0, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x12d2 A[Catch: all -> 0x16f6, TryCatch #40 {all -> 0x16f6, blocks: (B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5, B:392:0x164f, B:387:0x1614, B:389:0x161a, B:390:0x1647, B:355:0x13f0, B:357:0x1405, B:358:0x1473, B:350:0x13a8, B:352:0x13bd, B:353:0x13e9), top: B:869:0x12cc, outer: #5, inners: #14, #22, #30, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x132a A[Catch: all -> 0x16f6, TryCatch #40 {all -> 0x16f6, blocks: (B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5, B:392:0x164f, B:387:0x1614, B:389:0x161a, B:390:0x1647, B:355:0x13f0, B:357:0x1405, B:358:0x1473, B:350:0x13a8, B:352:0x13bd, B:353:0x13e9), top: B:869:0x12cc, outer: #5, inners: #14, #22, #30, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1388 A[Catch: all -> 0x16f6, TRY_LEAVE, TryCatch #40 {all -> 0x16f6, blocks: (B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5, B:392:0x164f, B:387:0x1614, B:389:0x161a, B:390:0x1647, B:355:0x13f0, B:357:0x1405, B:358:0x1473, B:350:0x13a8, B:352:0x13bd, B:353:0x13e9), top: B:869:0x12cc, outer: #5, inners: #14, #22, #30, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x15b2 A[Catch: all -> 0x16f6, TryCatch #40 {all -> 0x16f6, blocks: (B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5, B:392:0x164f, B:387:0x1614, B:389:0x161a, B:390:0x1647, B:355:0x13f0, B:357:0x1405, B:358:0x1473, B:350:0x13a8, B:352:0x13bd, B:353:0x13e9), top: B:869:0x12cc, outer: #5, inners: #14, #22, #30, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x184b A[Catch: all -> 0x1ba5, TryCatch #0 {all -> 0x1ba5, blocks: (B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974), top: B:793:0x1845, outer: #5, inners: #50, #54, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x189c A[Catch: all -> 0x1ba5, TryCatch #0 {all -> 0x1ba5, blocks: (B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974), top: B:793:0x1845, outer: #5, inners: #50, #54, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x18f9 A[Catch: all -> 0x1ba5, TRY_LEAVE, TryCatch #0 {all -> 0x1ba5, blocks: (B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974), top: B:793:0x1845, outer: #5, inners: #50, #54, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1ab2  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1cd6  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1d29  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1de7  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x1f86  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2d0b A[Catch: all -> 0x03b5, TryCatch #5 {all -> 0x03b5, blocks: (B:147:0x0876, B:149:0x087c, B:150:0x08a4, B:332:0x1214, B:334:0x121a, B:335:0x1245, B:711:0x3052, B:713:0x3058, B:714:0x3085, B:748:0x3399, B:750:0x339f, B:751:0x33c3, B:728:0x31d9, B:730:0x31fc, B:731:0x3251, B:677:0x2d05, B:679:0x2d0b, B:680:0x2d39, B:566:0x2614, B:568:0x261a, B:569:0x2641, B:571:0x267b, B:572:0x26c2, B:537:0x2294, B:539:0x22a9, B:540:0x22d9, B:542:0x230d, B:543:0x238c, B:773:0x34ad, B:775:0x34b3, B:776:0x34e3, B:778:0x351d, B:779:0x3558, B:505:0x1e07, B:507:0x1e1c, B:508:0x1e4c, B:489:0x1c17, B:491:0x1c1d, B:492:0x1c4a, B:421:0x1787, B:423:0x178d, B:424:0x17bc, B:198:0x0b06, B:200:0x0b0c, B:201:0x0b36, B:19:0x01b4, B:21:0x01ba, B:22:0x01e0, B:24:0x0326, B:26:0x0357, B:27:0x03af, B:428:0x1845, B:430:0x184b, B:431:0x188f, B:433:0x189c, B:435:0x18a5, B:436:0x18ed, B:455:0x1aa0, B:463:0x1b04, B:469:0x1b89, B:471:0x1b8f, B:472:0x1b90, B:474:0x1b92, B:476:0x1b99, B:477:0x1b9a, B:438:0x18f9, B:445:0x1980, B:447:0x1986, B:448:0x19cd, B:450:0x19f7, B:451:0x1a3c, B:453:0x1a52, B:454:0x1a98, B:479:0x1b9c, B:481:0x1ba3, B:482:0x1ba4, B:465:0x1b0a, B:459:0x1ad0, B:461:0x1ad6, B:462:0x1afd, B:440:0x1919, B:442:0x192b, B:443:0x1974, B:156:0x0937, B:160:0x0944, B:184:0x0a3c, B:186:0x0a42, B:187:0x0a43, B:189:0x0a45, B:191:0x0a4c, B:192:0x0a4d, B:163:0x0952, B:167:0x095e, B:339:0x12cc, B:341:0x12d2, B:342:0x131d, B:344:0x132a, B:346:0x1333, B:347:0x137d, B:371:0x15a4, B:372:0x15a8, B:375:0x15b2, B:378:0x15cc, B:381:0x15d9, B:384:0x15e6, B:396:0x16d0, B:398:0x16d6, B:399:0x16d7, B:401:0x16d9, B:403:0x16e0, B:404:0x16e1, B:348:0x1388, B:360:0x147f, B:362:0x1485, B:363:0x14cb, B:365:0x14f5, B:367:0x1541, B:369:0x1557, B:370:0x159c, B:406:0x16e3, B:408:0x16ea, B:409:0x16eb, B:411:0x16ed, B:413:0x16f4, B:414:0x16f5), top: B:802:0x01b4, inners: #0, #34, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x2dc7  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x2e17  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x2e75  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x3034  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x3117  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x316b  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x31bb  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x3379  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x346c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x018f A[PHI: r15
  0x018f: PHI (r15v71 char) = (r15v15 char), (r15v72 char) binds: [B:17:0x01af, B:5:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0197 A[PHI: r15
  0x0197: PHI (r15v15 char) = (r15v14 char), (r15v73 char) binds: [B:3:0x0187, B:5:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:923:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v286 */
    /* JADX WARN: Type inference failed for: r10v287 */
    /* JADX WARN: Type inference failed for: r10v288 */
    /* JADX WARN: Type inference failed for: r10v289 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v294 */
    /* JADX WARN: Type inference failed for: r10v297, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v304 */
    /* JADX WARN: Type inference failed for: r10v305 */
    /* JADX WARN: Type inference failed for: r10v306 */
    /* JADX WARN: Type inference failed for: r10v307 */
    /* JADX WARN: Type inference failed for: r10v310 */
    /* JADX WARN: Type inference failed for: r10v316 */
    /* JADX WARN: Type inference failed for: r10v317 */
    /* JADX WARN: Type inference failed for: r10v318 */
    /* JADX WARN: Type inference failed for: r10v319 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v321 */
    /* JADX WARN: Type inference failed for: r10v322 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v619 */
    /* JADX WARN: Type inference failed for: r3v620 */
    /* JADX WARN: Type inference failed for: r3v621 */
    /* JADX WARN: Type inference failed for: r3v635 */
    /* JADX WARN: Type inference failed for: r3v636 */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v155 */
    /* JADX WARN: Type inference failed for: r7v156 */
    /* JADX WARN: Type inference failed for: r7v157 */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v95 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.activity.AddFavouriteFriendActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$6H1nYVO1O7OfGFsLaDaKLr6oT6o(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m12032instrumented$2$initListener$V(addFavouriteFriendActivity, view);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
    }

    public static void $r8$lambda$JX00shtTFmBXFtU0EI3Fr8LKe1k(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 29;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m12030instrumented$0$initListener$V(addFavouriteFriendActivity, view);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
    }

    public static void $r8$lambda$NUhGomNfHkLjV6ZEAtfai2BNnbE(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m12031instrumented$1$initListener$V(addFavouriteFriendActivity, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 23;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$fEwAg9AuXiV15M_FL4cGrTyAMQg(AddFavouriteFriendActivity addFavouriteFriendActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$0(addFavouriteFriendActivity, activityResult);
        if (i3 != 0) {
            throw null;
        }
    }

    public static Unit $r8$lambda$l06b90NR1HwW_vWmTftLtaeA8bI(AddFavouriteFriendActivity addFavouriteFriendActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$1 = initObserver$lambda$1(addFavouriteFriendActivity, resource);
        int i4 = equals + 51;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return unitInitObserver$lambda$1;
        }
        throw null;
    }

    static {
        component4 = 0;
        ShareDataUIState();
        copydefault();
        int i = toString + 69;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m12030instrumented$0$initListener$V(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initListener$lambda$2(addFavouriteFriendActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            initListener$lambda$2(addFavouriteFriendActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 3;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12031instrumented$1$initListener$V(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$3(addFavouriteFriendActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 75;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12032instrumented$2$initListener$V(AddFavouriteFriendActivity addFavouriteFriendActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initListener$lambda$4(addFavouriteFriendActivity, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 99;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = equals + 79;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean needSoftFix() {
        int i = 2 % 2;
        int i2 = equals + 25;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 1;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = equals + 31;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        ShareDataUIState = new char[]{30638, 30626, 30624, 30307, 30629, 30616, 30636, 30618, 30632, 30628, 30633, 30634, 30617, 30625, 30621, 30612, 30627, 30622, 30623, 30635, 30639, 30283, 30286, 30287, 30654, 30278, 30313, 30653, 30619, 30300, 30280, 30613, 30273, 30303};
        component2 = 321287693;
        component1 = true;
        component3 = true;
        int i5 = i3 + 5;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState() {
        copydefault = new char[]{2028, 2034, 2021, 2020, 2036, 2019, 1971, 2038, 2022, 2026, 2033, 2000, 2004, 2035, 1049, 1965, 2024, 2023, 1969, 1972, 1054, 1975, 1973, 1968, 1970, 1967, 1987, 2017, 2029, 1050, 1051, 2025, 2027, 1977, 1974, 1985, 2030, 2032, 2005, 1976, 2003, 1048, 2018, 2037, 2041, 1978, 2016, 2031, 1966};
        copy = (char) 12829;
        getRequestBeneficiariesState = -6512871561976708270L;
    }
}
