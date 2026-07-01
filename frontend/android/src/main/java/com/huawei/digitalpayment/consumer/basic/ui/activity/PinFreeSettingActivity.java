package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.widget.ExpandableListView;
import androidx.databinding.ViewDataBinding;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.SwitchView;
import com.huawei.common.widget.keyboard.CustomKeyBroadPop;
import com.huawei.common.widget.keyboard.CustomKeyBroadType;
import com.huawei.common.widget.keyboard.OnKeyListener;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.PinFreeViewModel;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.model.PinFreeInfo;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityServiceStub;

public class PinFreeSettingActivity extends Hilt_PinFreeSettingActivity<ActivityPinFreeSetBinding, PinFreeViewModel> {
    private static final int MIN_AMOUNT = 1;
    public static final int REQUEST_CODE_MANAGE_PIN_FREE = 1;
    private boolean enableFreePin = true;
    private String freePinAmount;
    private String maxFreePinAmount;
    private String maxFreePinAmountDisplay;
    private CustomKeyBroadPop popupWindow;
    private static final byte[] $$d = {90, 10, -103, 87};
    private static final int $$e = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private static long component2 = 2726449516658584279L;
    private static int component3 = -890926411;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, short r7, byte r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.$$d
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r7 = r7 * 38
            int r7 = r7 + 65
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.$$f(short, short, byte):java.lang.String");
    }

    static ViewDataBinding access$000(PinFreeSettingActivity pinFreeSettingActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = pinFreeSettingActivity.binding;
        int i4 = ShareDataUIState + 41;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return binding;
        }
        throw null;
    }

    static ViewDataBinding access$100(PinFreeSettingActivity pinFreeSettingActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = pinFreeSettingActivity.binding;
        int i4 = copydefault + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return binding;
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 55;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7032, 34 - TextUtils.indexOf("", "", 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 63441), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getLongPressTimeout() >> 16), Color.alpha(0) + 18, (char) (ExpandableListView.getPackedPositionType(0L) + 51269), -1883291598, false, $$f(b2, b3, (byte) (-b3)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 7;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.payment_pinfree_title1));
        int i4 = ShareDataUIState + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 43;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3783 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26860), 2015799920, false, $$f(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7406, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - Color.red(0), (-16777200) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0184  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.onCreate(android.os.Bundle):void");
    }

    private void initParams(PinFreeInfo pinFreeInfo) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.enableFreePin = pinFreeInfo.getEnableFreePin();
        ((ActivityPinFreeSetBinding) this.binding).cbPinFree.setSwitchesOn(pinFreeInfo.getEnableFreePin());
        if (this.enableFreePin) {
            this.freePinAmount = pinFreeInfo.getFreePinAmount();
        }
        this.maxFreePinAmount = pinFreeInfo.getMaxFreePinAmount();
        this.maxFreePinAmountDisplay = pinFreeInfo.getMaxFreePinAmountDisplay();
        int i4 = copydefault + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$initListener$0(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityPinFreeSetBinding) this.binding).llAmount.getEditText().requestFocus();
        this.popupWindow.show(this);
        int i4 = ShareDataUIState + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$initListener$1(KeyEvent keyEvent) {
        int i = 2 % 2;
        if (keyEvent.getKeyCode() == 66) {
            int i2 = copydefault + 55;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            confirm();
            if (i3 != 0) {
                int i4 = 1 / 0;
            }
        }
        int i5 = copydefault + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    private void lambda$initListener$2(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        confirm();
        if (i3 != 0) {
            throw null;
        }
    }

    private void initListener() {
        int i = 2 % 2;
        ((ActivityPinFreeSetBinding) this.binding).llAmount.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 91;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PinFreeSettingActivity.$r8$lambda$jjbbKQesDYxvD7gabw4mXmOnhJE(this.f$0, view);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.popupWindow.setFinishEnable(false);
        this.popupWindow.attachToEditText(this, ((ActivityPinFreeSetBinding) this.binding).llAmount.getEditText(), false);
        this.popupWindow.setKeyListener(new OnKeyListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void dispatchKeyEvent(KeyEvent keyEvent) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    PinFreeSettingActivity.$r8$lambda$hKY7BTIz_kNKPFu_TNHjNBqiRA4(this.f$0, keyEvent);
                    throw null;
                }
                PinFreeSettingActivity.$r8$lambda$hKY7BTIz_kNKPFu_TNHjNBqiRA4(this.f$0, keyEvent);
                int i4 = component2 + 87;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 16 / 0;
                }
            }
        });
        ((ActivityPinFreeSetBinding) this.binding).lbConfirm.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 13;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PinFreeSettingActivity.$r8$lambda$Y36g3kkOsF5rQfjNVak20rZdHTU(this.f$0, view);
                int i5 = ShareDataUIState + 85;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        ((ActivityPinFreeSetBinding) this.binding).cbPinFree.setOnSwitchesClickListener(new SwitchView.OnSwitchesClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSwitches(boolean z) {
                int i2 = 2 % 2;
                int i3 = component2 + 47;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    if (!(!PinFreeSettingActivity.m10279$$Nest$fgetenableFreePin(PinFreeSettingActivity.this))) {
                        PinFreeSettingActivity.m10281$$Nest$mgotoEnterPin(PinFreeSettingActivity.this, false);
                        return;
                    }
                    if (z) {
                        int i4 = component1 + 77;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            ((ActivityPinFreeSetBinding) PinFreeSettingActivity.access$000(PinFreeSettingActivity.this)).llAmount.getEditText().requestFocus();
                            PinFreeSettingActivity.m10280$$Nest$fgetpopupWindow(PinFreeSettingActivity.this).show(PinFreeSettingActivity.this);
                            int i5 = 74 / 0;
                        } else {
                            ((ActivityPinFreeSetBinding) PinFreeSettingActivity.access$000(PinFreeSettingActivity.this)).llAmount.getEditText().requestFocus();
                            PinFreeSettingActivity.m10280$$Nest$fgetpopupWindow(PinFreeSettingActivity.this).show(PinFreeSettingActivity.this);
                        }
                    } else {
                        PinFreeSettingActivity.m10280$$Nest$fgetpopupWindow(PinFreeSettingActivity.this).hide();
                        int i6 = component1 + 17;
                        component2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 3 / 4;
                        }
                    }
                    PinFreeSettingActivity.m10282$$Nest$minitStatusUi(PinFreeSettingActivity.this, z);
                    return;
                }
                PinFreeSettingActivity.m10279$$Nest$fgetenableFreePin(PinFreeSettingActivity.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((ActivityPinFreeSetBinding) this.binding).llAmount.getEditText().addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = component1 + 87;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.afterTextChanged(editable);
                ((ActivityPinFreeSetBinding) PinFreeSettingActivity.access$100(PinFreeSettingActivity.this)).lbConfirm.setEnabled(PinFreeSettingActivity.m10283$$Nest$misValidAmount(PinFreeSettingActivity.this, editable.toString()));
                PinFreeSettingActivity.m10280$$Nest$fgetpopupWindow(PinFreeSettingActivity.this).setFinishEnable(PinFreeSettingActivity.m10283$$Nest$misValidAmount(PinFreeSettingActivity.this, editable.toString()));
                int i5 = ShareDataUIState + 75;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 43 / 0;
                }
            }
        });
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    private void initView() {
        int i = 2 % 2;
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        ((ActivityPinFreeSetBinding) this.binding).textView.setBackgroundColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.2f, ColorUtils.getColor(R.color.colorWarningDisable)));
        this.popupWindow = new CustomKeyBroadPop(this, CustomKeyBroadType.getDIGITAL_OK_KEY_BROAD());
        if (!TextUtils.isEmpty(String.valueOf(this.freePinAmount)) || !TextUtils.isEmpty(String.valueOf(this.maxFreePinAmountDisplay))) {
            ((ActivityPinFreeSetBinding) this.binding).tvHint.setText(String.format(getString(R.string.payment_pinfree_tips2), this.maxFreePinAmountDisplay));
        } else {
            ((ActivityPinFreeSetBinding) this.binding).tvHint.setVisibility(4);
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!TextUtils.isEmpty(this.freePinAmount)) {
            int i4 = copydefault + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                ((ActivityPinFreeSetBinding) this.binding).llAmount.setText(this.freePinAmount);
            } else {
                ((ActivityPinFreeSetBinding) this.binding).llAmount.setText(this.freePinAmount);
                throw null;
            }
        }
        ((ActivityPinFreeSetBinding) this.binding).llAmount.getEndUnit().setText(AppConfigManager.getAppConfig().getCurrency());
        initStatusUi(this.enableFreePin);
        int i5 = copydefault + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.maxFreePinAmount) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault + 17;
        com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
        gotoEnterPin(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r4 = java.lang.Double.parseDouble(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r4 < 1.0d) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r4 <= java.lang.Double.parseDouble(r8.maxFreePinAmount)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        gotoEnterPin(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(getString(com.huawei.digitalpayment.consumer.basic.R.string.basic_illegal_amount, new java.lang.Object[]{"1", r8.maxFreePinAmount}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState + 75;
        com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        com.safaricom.mpesa.logging.L.INSTANCE.d(r0.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(getString(com.huawei.digitalpayment.consumer.basic.R.string.please_enter_amount));
        r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault + 99;
        com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void confirm() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            Binding extends androidx.databinding.ViewDataBinding r1 = r8.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r1 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r1
            com.huawei.common.widget.text.AmountInputView r1 = r1.llAmount
            java.lang.String r1 = r1.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 41
            int r5 = r5 / r2
            if (r4 == r3) goto L34
            goto L4b
        L24:
            Binding extends androidx.databinding.ViewDataBinding r1 = r8.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r1 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r1
            com.huawei.common.widget.text.AmountInputView r1 = r1.llAmount
            java.lang.String r1 = r1.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L4b
        L34:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.string.please_enter_amount
            java.lang.String r1 = r8.getString(r1)
            com.huawei.common.util.ToastUtils.showLong(r1)
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L49
            return
        L49:
            r0 = 0
            throw r0
        L4b:
            java.lang.String r4 = r8.maxFreePinAmount
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L60
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            r8.gotoEnterPin(r3)
            return
        L60:
            double r4 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L96
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L79
            java.lang.String r1 = r8.maxFreePinAmount     // Catch: java.lang.NumberFormatException -> L96
            double r6 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L96
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L75
            goto L79
        L75:
            r8.gotoEnterPin(r3)     // Catch: java.lang.NumberFormatException -> L96
            goto La2
        L79:
            int r1 = com.huawei.digitalpayment.consumer.basic.R.string.basic_illegal_amount     // Catch: java.lang.NumberFormatException -> L96
            java.lang.String r4 = r8.maxFreePinAmount     // Catch: java.lang.NumberFormatException -> L96
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.NumberFormatException -> L96
            java.lang.String r6 = "1"
            r5[r2] = r6     // Catch: java.lang.NumberFormatException -> L96
            r5[r3] = r4     // Catch: java.lang.NumberFormatException -> L96
            java.lang.String r1 = r8.getString(r1, r5)     // Catch: java.lang.NumberFormatException -> L96
            com.huawei.common.util.ToastUtils.showLong(r1)     // Catch: java.lang.NumberFormatException -> L96
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault = r2
            int r1 = r1 % r0
            return
        L96:
            r0 = move-exception
            com.safaricom.mpesa.logging.L r1 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.d(r0, r2)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.confirm():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initStatusUi(boolean r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lba
            r1 = 8
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L62
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            android.widget.TextView r7 = r7.tvHint
            r7.setVisibility(r3)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.SwitchView r7 = r7.cbPinFree
            r7.setSwitchesOn(r2)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.text.AmountInputView r7 = r7.llAmount
            r7.setVisibility(r3)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.LoadingButton r7 = r7.lbConfirm
            boolean r4 = r6.enableFreePin
            if (r4 != 0) goto L5d
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r4 = r4 + 77
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r5
            int r4 = r4 % r0
            Binding extends androidx.databinding.ViewDataBinding r4 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r4 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r4
            com.huawei.common.widget.text.AmountInputView r4 = r4.llAmount
            java.lang.String r4 = r4.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L5d
            int r4 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r4 = r4 + 115
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r5
            int r4 = r4 % r0
            r4 = r2
            goto L5e
        L5d:
            r4 = r3
        L5e:
            r7.setEnabled(r4)
            goto L8b
        L62:
            com.huawei.common.widget.keyboard.CustomKeyBroadPop r7 = r6.popupWindow
            r7.hide()
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.SwitchView r7 = r7.cbPinFree
            r7.setSwitchesOn(r3)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            android.widget.TextView r7 = r7.tvHint
            r7.setVisibility(r1)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.text.AmountInputView r7 = r7.llAmount
            r7.setVisibility(r1)
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.LoadingButton r7 = r7.lbConfirm
            r7.setEnabled(r3)
        L8b:
            boolean r7 = r6.enableFreePin
            r7 = r7 ^ r2
            if (r7 == r2) goto L91
            goto La6
        L91:
            int r7 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState
            int r7 = r7 + 21
            int r2 = r7 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault = r2
            int r7 = r7 % r0
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.SwitchView r7 = r7.cbPinFree
            boolean r7 = r7.isSwitceshOn()
            if (r7 == 0) goto Lb0
        La6:
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.LoadingButton r7 = r7.lbConfirm
            r7.setVisibility(r3)
            goto Lb9
        Lb0:
            Binding extends androidx.databinding.ViewDataBinding r7 = r6.binding
            com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding r7 = (com.huawei.digitalpayment.consumer.basic.databinding.ActivityPinFreeSetBinding) r7
            com.huawei.common.widget.LoadingButton r7 = r7.lbConfirm
            r7.setVisibility(r1)
        Lb9:
            return
        Lba:
            r7 = 0
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.initStatusUi(boolean):void");
    }

    private void gotoEnterPin(boolean z) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putBoolean(KeysConstants.KEY_PIN_FREE_STATUS, z);
        bundle.putString(KeysConstants.KEY_PIN_FREE_AMOUNT, ((ActivityPinFreeSetBinding) this.binding).llAmount.getText());
        RouteUtils.routeWithExecute(this, RoutePathConstants.MANAGE_PIN_FREE, bundle, null, null, 0, 1);
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            int i4 = copydefault + 91;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            if (intent != null) {
                managePinFreeResult(intent.getBooleanExtra(KeysConstants.KEY_PIN_FREE_STATUS, false));
                int i6 = ShareDataUIState + 83;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private void managePinFreeResult(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!z) {
            ((ActivityPinFreeSetBinding) this.binding).llAmount.setText("");
        }
        this.enableFreePin = z;
        this.popupWindow.hide();
        updateCustomer();
        initStatusUi(z);
        refreshUi();
        CommonToast.show(getString(R.string.payment_pinfree_tips4), R.mipmap.base_icon_complete);
        int i3 = copydefault + 55;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void refreshUi() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityPinFreeSetBinding) this.binding).llAmount.setText(((ActivityPinFreeSetBinding) this.binding).llAmount.getText());
        ((ActivityPinFreeSetBinding) this.binding).llAmount.getEditText().clearFocus();
        int i4 = ShareDataUIState + 115;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void updateCustomer() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.freePinAmount = ((ActivityPinFreeSetBinding) this.binding).llAmount.getText();
            ((PinFreeViewModel) this.viewModel).update(this.enableFreePin, this.freePinAmount);
            int i3 = copydefault + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.freePinAmount = ((ActivityPinFreeSetBinding) this.binding).llAmount.getText();
        ((PinFreeViewModel) this.viewModel).update(this.enableFreePin, this.freePinAmount);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_pin_free_set;
        int i5 = copydefault + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.popupWindow.isShowing())) {
            int i4 = ShareDataUIState + 7;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.popupWindow.hide();
                return;
            } else {
                this.popupWindow.hide();
                int i5 = 90 / 0;
                return;
            }
        }
        super.onBackPressed();
    }

    private boolean isValidAmount(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str) || !isInputAmountValid(str)) {
            return false;
        }
        if (!this.enableFreePin && ((ActivityPinFreeSetBinding) this.binding).cbPinFree.isSwitceshOn()) {
            int i4 = copydefault + 91;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        } else if (((ActivityPinFreeSetBinding) this.binding).llAmount.getVisibility() != 0 || TextUtils.equals(str, this.freePinAmount)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r2 > java.lang.Double.parseDouble(r7.maxFreePinAmount)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isInputAmountValid(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState = r2
            int r1 = r1 % r0
            r1 = 0
            double r2 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.NumberFormatException -> L36
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L2c
            java.lang.String r8 = r7.maxFreePinAmount     // Catch: java.lang.NumberFormatException -> L36
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.NumberFormatException -> L36
            r4 = 1
            if (r8 == r4) goto L2b
            java.lang.String r8 = r7.maxFreePinAmount     // Catch: java.lang.NumberFormatException -> L36
            double r5 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.NumberFormatException -> L36
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 <= 0) goto L2b
            goto L2c
        L2b:
            return r4
        L2c:
            int r8 = com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.ShareDataUIState
            int r8 = r8 + 111
            int r2 = r8 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.copydefault = r2
            int r8 = r8 % r0
            return r1
        L36:
            r8 = move-exception
            com.safaricom.mpesa.logging.L r0 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.e(r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PinFreeSettingActivity.isInputAmountValid(java.lang.String):boolean");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = ShareDataUIState + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{39244, 39213, 47235, 65195, 22958, 29100, 54598, 41740, 32827, 41372, 64622, 39528, 43805, 34477, 59234, 29824, 53829, 28486, 36366, 28639, 64858, 21604, 43318, 18151, 58464, 15741, 21464, 8579, 4029, 8729}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).length() - 1, new char[]{463, 428, 64013, 48190, 53914, 56296, 24164, 2376, 6322, 58126, 30538, 12355, 13199, 50232, 27722, 56963, 19172, 11729, 1338, 50587, 26048, 5878}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = copydefault + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6618, 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.getDefaultSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55, (char) (ViewConfiguration.getTapTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
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

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952717_res_0x7f13044d).substring(6, 7).codePointAt(0) - 32, new char[]{39244, 39213, 47235, 65195, 22958, 29100, 54598, 41740, 32827, 41372, 64622, 39528, 43805, 34477, 59234, 29824, 53829, 28486, 36366, 28639, 64858, 21604, 43318, 18151, 58464, 15741, 21464, 8579, 4029, 8729}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            d(KeyEvent.keyCodeFromString(""), new char[]{463, 428, 64013, 48190, 53914, 56296, 24164, 2376, 6322, 58126, 30538, 12355, 13199, 50232, 27722, 56963, 19172, 11729, 1338, 50587, 26048, 5878}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = ShareDataUIState + 89;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            int i5 = ShareDataUIState + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - ExpandableListView.getPackedPositionChild(0L), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0'), 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - Process.getGidForName("")), -960739708, false, "component3", new Class[]{Context.class});
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

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext = context;
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        d(ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{18067, 18162, 4593, 22489, 23426, 35654, 55146, 23014, 24548, 2286, 65090, 24706, 29900, 12252, 58640, 36372, 3497, 50744, 35893, 38201, 8832, 64780}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(new char[]{65517, 1, 65532, 5, 17}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 27, 148 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (applicationContext != null) {
                int i4 = ShareDataUIState + 43;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            if (applicationContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 6618, 42 - Color.alpha(0), (char) ((-1) - MotionEvent.axisFromString("")), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = new Object[1];
                    d(ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{30317, 30220, 57241, 39398, 50221, 7110, 18576, 51570, 28483, 50831, 25066, 61513, 17517, 57843, 31399, 7933, 15644, 2139, 5020, 1514, 4719, 13169, 13556, 11457, 2932, 23147, 52767, 19433, 57545, 17672, 59223, 29328, 55719, 27753, 63615, 39386, 48840, 38529, 37201, 32869, 38791, 45505, 43562, 44813, 36011, 55524, 17249, 54833, 25169, 50079, 25741, 64894}, objArr3);
                    String str = (String) objArr3[0];
                    Object[] objArr4 = new Object[1];
                    e(new char[]{65524, 65519, 65516, '\"', 65516, 30, 65524, 65516, 65519, 31, 31, 65522, 65525, 65520, 65517, '\"', 65518, 31, 31, 65520, 65516, 65517, 65519, ' ', 65518, 65525, 65522, 65525, 65519, 65524, 65525, 65519, 65522, 65524, '\"', 65524, 65523, 30, 29, 65518, ' ', 65517, 65521, 65521, '\"', 65517, 65525, 65524, 31, 31, 65517, ' ', '!', 30, 31, 65524, 65516, 30, 65522, 65524, 65522, 65519, ' ', 31}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 7, true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(0) + 63, objArr4);
                    String str2 = (String) objArr4[0];
                    Object[] objArr5 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(11) - 111, new char[]{11353, 11369, 32697, 14745, 48797, 55554, 12841, 2996, 13680, 26353, 6923, 13021, 7775, 16780, 'B', 56422, 26406, 43047, 27004, 51066, 18524, 37724, 20036, 60933, 20755, 64016, 46241, 35198, 47869, 58667, 40375, 45139, 33685, 52292, 33434, 23326, 58537, 13993, 60338, 17056, 52656, 4579, 53441, 28109, 54942, 30873, 14808, 5367, 14433, 25582, 7739, 16315, 328, 19144, 1874, 9929, 27216, 46551, 27753, 49258, 29544, 40042, 21881, 60178, 21511, 34563, 47708, 37467}, objArr5);
                    String str3 = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{42708, 42684, 38447, 53277, 33732, 37762, 3900, 16672, 49087, 36729, 9807, 30791, 38098, 43102, 15680, 38583, 60847, 16885, 21540, 36269, 49797, 31373, 29466, 42114, 56216, 5012, 35235, 50090, 12394, 3263, 41136, 64146, 2329, 9618, 49028, 4507, 28277, 57192, 55036, 2110, 18283, 63606, 60865, 10074, 23616, 37208, 1225, 24117, 45757, 35361, 9013, 30070, 35735, 41748, 14853, 27743, 57485, 23571, 20841, 35495, 63981, 30181, 26751, 41413, 57039, 28359, 34591, 55502, 14182, 2036, 40365, 63398, 3113, 8365, 46228, 61083}, objArr6);
                    String str4 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    d(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{48053, 48012, 30410, 12450, 5858, 52976, 39519, 7190, 41603, 28623}, objArr7);
                    String str5 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    d(Color.green(0), new char[]{29883, 29919, 11202, 28085, 36040, 19825, '%', 40853, 28055, 13016, 10510, 42669, 18086, 5619, 12868, 18507, 16323, 64534, 23336, 21342, 4334, 50981, 31753, 31266, 2551, 44603, 34478, 7446, 57885, 45318, 45024, 9334, 56107, 39023, 45253, 53053, 48154, 25223, 55731, 54995}, objArr8);
                    Object[] objArr9 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr8[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) View.resolveSize(0, 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr9);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    public static void $r8$lambda$Y36g3kkOsF5rQfjNVak20rZdHTU(PinFreeSettingActivity pinFreeSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        m10285instrumented$2$initListener$V(pinFreeSettingActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$hKY7BTIz_kNKPFu_TNHjNBqiRA4(PinFreeSettingActivity pinFreeSettingActivity, KeyEvent keyEvent) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        pinFreeSettingActivity.lambda$initListener$1(keyEvent);
        int i4 = copydefault + 77;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$jjbbKQesDYxvD7gabw4mXmOnhJE(PinFreeSettingActivity pinFreeSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        m10284instrumented$0$initListener$V(pinFreeSettingActivity, view);
        if (i3 == 0) {
            throw null;
        }
    }

    static boolean m10279$$Nest$fgetenableFreePin(PinFreeSettingActivity pinFreeSettingActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = pinFreeSettingActivity.enableFreePin;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static CustomKeyBroadPop m10280$$Nest$fgetpopupWindow(PinFreeSettingActivity pinFreeSettingActivity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        CustomKeyBroadPop customKeyBroadPop = pinFreeSettingActivity.popupWindow;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 47;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return customKeyBroadPop;
    }

    static void m10281$$Nest$mgotoEnterPin(PinFreeSettingActivity pinFreeSettingActivity, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        pinFreeSettingActivity.gotoEnterPin(z);
        int i4 = ShareDataUIState + 39;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10282$$Nest$minitStatusUi(PinFreeSettingActivity pinFreeSettingActivity, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        pinFreeSettingActivity.initStatusUi(z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean m10283$$Nest$misValidAmount(PinFreeSettingActivity pinFreeSettingActivity, String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsValidAmount = pinFreeSettingActivity.isValidAmount(str);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return zIsValidAmount;
    }

    private static void m10284instrumented$0$initListener$V(PinFreeSettingActivity pinFreeSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            pinFreeSettingActivity.lambda$initListener$0(view);
            Callback.onClick_exit();
            int i4 = copydefault + 51;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 83 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10285instrumented$2$initListener$V(PinFreeSettingActivity pinFreeSettingActivity, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                pinFreeSettingActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
                int i4 = 90 / 0;
            } else {
                pinFreeSettingActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
            }
            int i5 = copydefault + 27;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = ShareDataUIState + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
