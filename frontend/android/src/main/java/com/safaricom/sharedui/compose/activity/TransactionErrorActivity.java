package com.safaricom.sharedui.compose.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.alibaba.ariver.kernel.api.monitor.PerfId;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaDatePickerActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.sharedui.compose.R;
import com.safaricom.sharedui.compose.activity.TransactionErrorActivity;
import com.safaricom.sharedui.compose.completion.TransactionCompletionData;
import com.safaricom.sharedui.compose.completion.TransactionCompletionScreenKt;
import com.safaricom.sharedui.compose.helper.PinCheckoutType;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/safaricom/sharedui/compose/activity/TransactionErrorActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class TransactionErrorActivity extends Hilt_TransactionErrorActivity {
    public static final int $stable = 0;

    public static final Companion INSTANCE;
    private static final String EXTRA_ERROR_MESSAGE = "extra_error_message";
    private static final String EXTRA_ICON = "extra_icon";
    private static final String EXTRA_RETRY_ENABLED = "extra_retry_enabled";
    private static final String EXTRA_TITLE = "extra_title";
    private static char ShareDataUIState;
    private static char component1;
    private static long component2;
    private static char component3;
    private static int component4;
    private static int copy;
    private static char copydefault;
    private static char[] equals;
    private static char getRequestBeneficiariesState;
    private static final byte[] $$l = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT};
    private static final int $$m = 249;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {1, -9, -86, 35, Ascii.VT, -3, -64, 56, 1, 10, -13, Ascii.FF, -20, -53, TarHeader.LF_CHR, -2, Ascii.DLE, 1, -16, 5, 7, -17, -54, 65, -13, 1, Ascii.SI, -14, -5, 17, -19, Ascii.FF, -69, 70, -2, -12, 2, -63, 33, Ascii.DLE, 5, -3, -19, Ascii.NAK, Ascii.DLE, -22, -35, Ascii.GS, 10, -10, 17, -10, -12, Ascii.DC2, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, PSSSigner.TRAILER_IMPLICIT, Ascii.VT, -3, -64, TarHeader.LF_SYMLINK, 10, -4, -8, -2, 0, -2, -52, TarHeader.LF_SYMLINK, Ascii.DLE, -10, Ascii.FF, -18, Ascii.FF, -69, 67, -14, 13, -5, 5, -4, -16, 1, -56, 67, 2, -8, 5, -12, 3, -9, -56, 35, 34, -8, 5, -12, 3, -9, -16, Ascii.SO, Ascii.FF, 0, -11, 5, -2, -44, 36, -4, -3, 7, -7, Ascii.FF, Ascii.VT, 0, 8, -22, 0, 0, -6, 19, -10, 7};
    private static final int $$k = 118;
    private static final byte[] $$d = {44, 39, Base64.padSymbol, Ascii.GS, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 151;
    private static int getShareableDataState = 0;
    private static int getSponsorBeneficiariesState = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = com.safaricom.sharedui.compose.activity.TransactionErrorActivity.$$l
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 + 98
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
        L25:
            int r6 = r6 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.activity.TransactionErrorActivity.$$n(short, byte, byte):java.lang.String");
    }

    private static void g(byte b2, int i, int i2, Object[] objArr) {
        int i3 = 103 - (i2 * 2);
        byte[] bArr = $$d;
        int i4 = 100 - i;
        byte[] bArr2 = new byte[28 - b2];
        int i5 = 27 - b2;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i3)) - 8;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i3 = (i7 + (-bArr[i4])) - 8;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 99 - r8
            byte[] r0 = com.safaricom.sharedui.compose.activity.TransactionErrorActivity.$$j
            int r6 = 139 - r6
            int r1 = 57 - r7
            byte[] r1 = new byte[r1]
            int r7 = 56 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + 1
            int r8 = r8 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.activity.TransactionErrorActivity.h(short, int, byte, java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        final boolean ShareDataUIState;
        final TransactionErrorActivity component1;
        final int component2;
        final String component3;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            final boolean ShareDataUIState;
            final String component1;
            final String component2;
            final TransactionErrorActivity component3;
            final int copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                component3(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void component3(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    String strStringResource = this.component1;
                    composer.startReplaceGroup(279407925);
                    if (strStringResource == null) {
                        strStringResource = StringResources_androidKt.stringResource(R.string.failure_title, composer, 0);
                    }
                    String str = strStringResource;
                    composer.endReplaceGroup();
                    String strStringResource2 = this.component2;
                    composer.startReplaceGroup(279410018);
                    if (strStringResource2 == null) {
                        strStringResource2 = StringResources_androidKt.stringResource(R.string.failure_description, composer, 0);
                    }
                    composer.endReplaceGroup();
                    TransactionCompletionData transactionCompletionData = new TransactionCompletionData(false, strStringResource2, null, PinCheckoutType.STK, str, this.ShareDataUIState, 4, null);
                    composer.startReplaceGroup(279417048);
                    boolean zChanged = composer.changed(this.component3);
                    final TransactionErrorActivity transactionErrorActivity = this.component3;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() {
                            @Override
                            public final Object invoke() {
                                return TransactionErrorActivity.component1.AnonymousClass4.ShareDataUIState(transactionErrorActivity);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    int i2 = this.copydefault;
                    composer.startReplaceGroup(279414718);
                    boolean zChanged2 = composer.changed(this.component3);
                    final TransactionErrorActivity transactionErrorActivity2 = this.component3;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() {
                            @Override
                            public final Object invoke() {
                                return TransactionErrorActivity.component1.AnonymousClass4.component2(transactionErrorActivity2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    TransactionCompletionScreenKt.TransactionCompletionScreen(transactionCompletionData, null, null, function0, Integer.valueOf(i2), (Function0) objRememberedValue2, composer, 8, 6);
                    return;
                }
                composer.skipToGroupEnd();
            }

            public static final Unit component2(TransactionErrorActivity transactionErrorActivity) {
                Intrinsics.checkNotNullParameter(transactionErrorActivity, "");
                transactionErrorActivity.setResult(0);
                transactionErrorActivity.finish();
                return Unit.INSTANCE;
            }

            public static final Unit ShareDataUIState(TransactionErrorActivity transactionErrorActivity) {
                Intrinsics.checkNotNullParameter(transactionErrorActivity, "");
                transactionErrorActivity.setResult(-1);
                transactionErrorActivity.finish();
                return Unit.INSTANCE;
            }

            AnonymousClass4(String str, String str2, boolean z, TransactionErrorActivity transactionErrorActivity, int i) {
                this.component1 = str;
                this.component2 = str2;
                this.ShareDataUIState = z;
                this.component3 = transactionErrorActivity;
                this.copydefault = i;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            component1(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void component1(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1795883917, true, new AnonymousClass4(this.component3, this.copydefault, this.ShareDataUIState, this.component1, this.component2), composer, 54), composer, 1572864, 63);
            } else {
                composer.skipToGroupEnd();
            }
        }

        component1(String str, String str2, boolean z, TransactionErrorActivity transactionErrorActivity, int i) {
            this.component3 = str;
            this.copydefault = str2;
            this.ShareDataUIState = z;
            this.component1 = transactionErrorActivity;
            this.component2 = i;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013JA\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/safaricom/sharedui/compose/activity/TransactionErrorActivity$Companion;", "", "<init>", "()V", BongaDatePickerActivity.EXTRA_TITLE, "", "EXTRA_ERROR_MESSAGE", "EXTRA_RETRY_ENABLED", "EXTRA_ICON", PerfId.startActivity, "", "context", "Landroid/content/Context;", "title", "errorMessage", "retry", "", "icon", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "createIntent", "Landroid/content/Intent;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Landroid/content/Intent;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void startActivity$default(Companion companion, Context context, String str, String str2, boolean z, Integer num, int i, Object obj) {
            String str3 = (i & 2) != 0 ? null : str;
            String str4 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                z = false;
            }
            companion.startActivity(context, str3, str4, z, (i & 16) != 0 ? null : num);
        }

        public final void startActivity(Context context, String title, String errorMessage, boolean retry, Integer icon) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TransactionErrorActivity.class);
            intent.putExtra("extra_title", title);
            intent.putExtra(TransactionErrorActivity.EXTRA_ERROR_MESSAGE, errorMessage);
            intent.putExtra("extra_retry_enabled", retry);
            if (icon != null) {
                intent.putExtra(TransactionErrorActivity.EXTRA_ICON, icon.intValue());
            }
            context.startActivity(intent);
        }

        public static Intent createIntent$default(Companion companion, Context context, String str, String str2, boolean z, Integer num, int i, Object obj) {
            String str3 = (i & 2) != 0 ? null : str;
            String str4 = (i & 4) != 0 ? null : str2;
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.createIntent(context, str3, str4, z, (i & 16) != 0 ? null : num);
        }

        public final Intent createIntent(Context context, String title, String errorMessage, boolean retry, Integer icon) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) TransactionErrorActivity.class);
            intent.putExtra("extra_title", title);
            intent.putExtra(TransactionErrorActivity.EXTRA_ERROR_MESSAGE, errorMessage);
            intent.putExtra("extra_retry_enabled", retry);
            if (icon != null) {
                intent.putExtra(TransactionErrorActivity.EXTRA_ICON, icon.intValue());
            }
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i6 = $10 + 15;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i8 = $10 + 99;
            $11 = i8 % 128;
            int i9 = i8 % i3;
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i10 = 58224;
            int i11 = i5;
            while (i11 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i12 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component1);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 843;
                        int iResolveOpacity = Drawable.resolveOpacity(i5, i5) + 32;
                        char cIndexOf = (char) (TextUtils.indexOf("", "", i5, i5) + 23251);
                        byte b2 = (byte) i5;
                        String str$$n = $$n((byte) 13, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i14, iResolveOpacity, cIndexOf, 592652048, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - ((byte) KeyEvent.getModifierMetaStateMask()), 31 - TextUtils.indexOf((CharSequence) "", '0'), (char) (23251 - (ViewConfiguration.getPressedStateDuration() >> 16)), 592652048, false, $$n((byte) 13, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    int i15 = $11 + 41;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - Color.green(0), 49 - Color.argb(0, 0, 0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
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
            int i6 = $10 + 111;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int iRed = Color.red(i5) + 4037;
                    int iResolveSize = View.resolveSize(i5, i5) + 31;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i5) + 19182);
                    byte b2 = (byte) ($$m & 7);
                    byte b3 = (byte) (b2 - 1);
                    String str$$n = $$n(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRed, iResolveSize, cIndexOf, 1912513118, false, str$$n, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iGreen = 7567 - Color.green(i5);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.FF;
                    char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i5] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, modifierMetaStateMask, c3, 2006389106, false, "e", clsArr2);
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
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((Process.getThreadPriority(i5) + 20) >> 6), 931716605, false, $$n(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 12, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component4) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) getRequestBeneficiariesState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i9 = $11 + 63;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 / 4;
                }
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

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = equals;
        char c2 = '0';
        if (cArr2 != null) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, (char) (65117 - TextUtils.lastIndexOf("", c2, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i9++;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 27;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $10 + 9;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c3);
                    objArr3[0] = Integer.valueOf(c4);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 36, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27897), -1464227204, false, $$n((byte) (-$$l[2]), b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i14] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3579 - TextUtils.lastIndexOf("", '0', 0, 0), View.combineMeasuredStates(0, 0) + 28, (char) Color.argb(0, 0, 0, 0), 1180380354, false, $$n((byte) ($$m & 23), b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 1860, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 80302927, false, $$n((byte) ($$m & 20), b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i16, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 125;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i4];
                i = 1;
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                i = 1;
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - i];
                iTrustedWebActivityService_Parcel.copydefault += i;
                int i18 = $10 + 71;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 2 / 2;
                }
                i = 1;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
                int i20 = $10 + 65;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x019d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.activity.TransactionErrorActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.activity.TransactionErrorActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getShareableDataState + 65;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = getShareableDataState + 105;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f(new char[]{59135, 57556, 19043, 63057, 48902, 64300, 38586, 48418, 48667, 5324, 48713, 54115, 1082, 30831, 40992, 62574, 13616, 61864, 62203, 64588, 21540, 26818, 22674, 11638, 36566, 18506}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 49365), new char[]{54592, 30137, 54341, 12992}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new char[]{55804, 58565, 3675, 48581, 2075, 52248, 55487, 62291, 41308, 1451, 38581, 30249, 51380, 37526, 38423, 31860, 33065, 50916}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(0) - 49, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) + 47687), new char[]{18272, 43930, 44038, 186}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = getShareableDataState + 19;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i7 = getSponsorBeneficiariesState + 59;
                getShareableDataState = i7 % 128;
                int i8 = i7 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 6619, Color.blue(0) + 42, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 6562, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 55, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|790|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(5:795|32|(3:34|849|35)|39|40)|(5:869|(5:42|43|(1:45)|46|47)(19:49|50|791|51|52|872|53|(2:836|55)|59|60|61|(3:63|810|64)|68|69|70|(1:72)|73|(1:75)|76)|48|77|(9:80|861|81|(1:83)|84|85|86|859|87))|124|(8:848|125|(1:127)|128|(3:130|(1:132)|133)(19:134|135|840|136|(1:138)|139|140|838|141|(1:143)|144|145|146|(1:148)|149|(1:151)|152|(1:154)|155)|156|(4:159|(3:887|161|890)(12:885|162|(3:164|(3:167|168|165)|891)|169|832|170|(1:172)|173|174|826|175|889)|888|157)|886)|210|789|211|(1:213)|214|(3:216|(1:218)|219)(19:220|221|874|222|(1:224)|225|226|863|227|(1:229)|230|231|232|(1:234)|235|(1:237)|238|(1:240)|241)|242|(5:245|246|(3:894|248|897)(12:893|249|(3:251|(3:254|255|252)|898)|256|857|257|(1:259)|260|261|846|262|896)|895|243)|892|275|(3:876|300|(1:306)(1:305))(1:310)|311|(54:855|312|(1:314)|315|844|316|(1:318)|319|343|834|344|(12:824|346|350|(6:352|818|353|354|815|355)(1:360)|830|361|362|807|(5:364|365|(1:367)|368|369)(12:(4:373|374|375|(1:382)(2:378|(2:380|(0)(1:383))(5:384|385|853|386|387)))(1:390)|(20:392|822|393|(2:879|395)|399|400|808|401|(2:828|403)|407|408|409|(2:411|412)|413|414|415|(1:417)(1:418)|419|(1:421)|422)(1:470)|475|476|865|477|480|481|(1:483)|484|485|486)|423|(5:426|427|(2:429|901)(11:430|(3:432|(3:435|436|433)|902)|437|801|438|(1:440)|441|442|793|443|900)|444|424)|899)(10:350|(0)(0)|830|361|362|807|(0)(0)|423|(1:424)|899)|487|(1:489)|490|(3:492|(1:494)|495)(14:497|498|(1:500)|501|502|(1:504)|505|842|506|507|(1:509)|510|(1:512)|513)|496|514|(1:516)(9:517|(3:519|(2:522|520)|911)|523|524|(1:526)|527|(1:529)|530|531)|532|(1:534)|535|(1:537)|538|(3:540|(1:542)|543)(16:545|546|(1:548)|549|(1:551)|552|553|(1:555)|556|851|557|558|(1:560)|561|(1:563)|564)|544|565|(1:567)(9:568|(3:570|(2:573|571)|910)|574|575|(1:577)|578|(1:580)|581|582)|583|814|584|(1:586)|587|(1:589)|590|591|(2:593|(5:595|596|(1:598)|599|600)(3:601|(1:603)|604))(17:605|(2:607|(1:613)(1:612))|(19:615|616|803|617|(1:619)|620|621|797|622|(1:624)|625|626|627|(1:629)|630|(1:632)|633|(1:635)|636)|693|(1:695)|696|(3:698|(1:700)|701)(13:703|881|704|705|(1:707)|708|820|709|710|(1:712)|713|(1:715)|716)|702|717|(6:720|721|(1:723)|724|725|726)|727|(1:729)|730|(3:732|(1:734)|735)(14:737|738|(1:740)|741|742|(1:744)|745|816|746|747|(1:749)|750|(1:752)|753)|736|754|(1:912)(7:757|758|(1:760)|761|762|763|764))|637|(5:640|641|(3:905|643|908)(12:903|644|(3:646|(4:649|650|651|647)|909)|652|787|653|(1:655)|656|657|870|658|907)|906|638)|904|693|(0)|696|(0)(0)|702|717|(0)|727|(0)|730|(0)(0)|736|754|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x1122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x1123, code lost:
    
        r10 = new java.lang.Object[1];
        f(new char[]{45092, 63829, 2778, 50036, 31290, 16791, 59250, 63906, 21868, 15872}, android.view.View.combineMeasuredStates(0, 0), new char[]{0, 0, 0, 0}, (char) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).codePointAt(0) - 32), new char[]{26451, 32833, 37008, 12721}, r10);
        r4 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x117c, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x1193, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1197, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
        r13 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x11c5, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x11c9, code lost:
    
        if (r6 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x11cb, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.Color.blue(0), 41 - android.text.TextUtils.lastIndexOf("", '0', 0), (char) android.text.TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x11f2, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x11f9, code lost:
    
        r1 = com.safaricom.sharedui.compose.activity.TransactionErrorActivity.getShareableDataState + 101;
        com.safaricom.sharedui.compose.activity.TransactionErrorActivity.getSponsorBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x1204, code lost:
    
        r8 = new java.lang.Object[]{-1362313806, java.lang.Long.valueOf(r4), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 6562, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)));
        r9 = new java.lang.Object[1];
        h((short) 74, (byte) 47, com.safaricom.sharedui.compose.activity.TransactionErrorActivity.$$j[91], r9);
        r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0754 A[Catch: all -> 0x0323, TryCatch #2 {all -> 0x0323, blocks: (B:118:0x074e, B:120:0x0754, B:121:0x0778, B:721:0x3215, B:723:0x321b, B:724:0x3245, B:758:0x3562, B:760:0x3568, B:761:0x3590, B:738:0x3391, B:740:0x33b4, B:741:0x340b, B:687:0x2de0, B:689:0x2de6, B:690:0x2e10, B:575:0x2672, B:577:0x2678, B:578:0x26a4, B:580:0x26de, B:581:0x2724, B:546:0x231c, B:548:0x2331, B:549:0x235f, B:551:0x2393, B:552:0x240d, B:524:0x1f98, B:526:0x1f9e, B:527:0x1fc8, B:529:0x2002, B:530:0x204d, B:498:0x1ce4, B:500:0x1cf9, B:501:0x1d29, B:481:0x1ac3, B:483:0x1ac9, B:484:0x1af2, B:337:0x1452, B:339:0x1458, B:340:0x1483, B:292:0x11c5, B:294:0x11cb, B:295:0x11f2, B:204:0x0c70, B:206:0x0c76, B:207:0x0c9e, B:19:0x0174, B:21:0x017a, B:22:0x01a1, B:24:0x0297, B:26:0x02c9, B:27:0x031d, B:211:0x0d22, B:213:0x0d28, B:214:0x0d63, B:216:0x0d70, B:218:0x0d79, B:219:0x0db9, B:242:0x0fdc, B:243:0x0fe0, B:246:0x0ff0, B:249:0x1007, B:252:0x1014, B:254:0x1017, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:220:0x0dc4, B:232:0x0ecb, B:234:0x0ed1, B:235:0x0f0c, B:237:0x0f36, B:238:0x0f7c, B:240:0x0f92, B:241:0x0fd6, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x107b, B:257:0x1043, B:259:0x1049, B:260:0x1073, B:227:0x0e31, B:229:0x0e4d, B:230:0x0ebf, B:222:0x0de4, B:224:0x0df9, B:225:0x0e2a, B:584:0x2831, B:586:0x2837, B:587:0x2879, B:589:0x28a0, B:590:0x28e3, B:596:0x2908, B:598:0x290e, B:599:0x294f, B:600:0x295b, B:601:0x295c, B:603:0x2965, B:604:0x29a1, B:637:0x2bf1, B:638:0x2bf5, B:641:0x2c05, B:644:0x2c1c, B:647:0x2c29, B:650:0x2c36, B:662:0x2d18, B:664:0x2d1e, B:665:0x2d1f, B:667:0x2d21, B:669:0x2d28, B:670:0x2d29, B:607:0x29b0, B:609:0x29b4, B:613:0x29c0, B:615:0x29c6, B:627:0x2ad8, B:629:0x2ade, B:630:0x2b1f, B:632:0x2b49, B:633:0x2b92, B:635:0x2ba8, B:636:0x2beb, B:672:0x2d2b, B:674:0x2d32, B:675:0x2d33, B:677:0x2d35, B:679:0x2d3c, B:680:0x2d3d, B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:300:0x1284, B:302:0x1288, B:323:0x1372, B:325:0x1378, B:326:0x1379, B:328:0x137b, B:330:0x1382, B:331:0x1383, B:306:0x1294), top: B:790:0x0174, inners: #1, #15, #33, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0800 A[Catch: all -> 0x0bf6, TryCatch #33 {all -> 0x0bf6, blocks: (B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:175:0x0b50, B:170:0x0b12, B:172:0x0b18, B:173:0x0b48, B:141:0x090a, B:143:0x091f, B:144:0x0990, B:136:0x08bf, B:138:0x08d4, B:139:0x0903), top: B:848:0x07fa, outer: #2, inners: #22, #25, #28, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0851 A[Catch: all -> 0x0bf6, TryCatch #33 {all -> 0x0bf6, blocks: (B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:175:0x0b50, B:170:0x0b12, B:172:0x0b18, B:173:0x0b48, B:141:0x090a, B:143:0x091f, B:144:0x0990, B:136:0x08bf, B:138:0x08d4, B:139:0x0903), top: B:848:0x07fa, outer: #2, inners: #22, #25, #28, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x089f A[Catch: all -> 0x0bf6, TRY_LEAVE, TryCatch #33 {all -> 0x0bf6, blocks: (B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:175:0x0b50, B:170:0x0b12, B:172:0x0b18, B:173:0x0b48, B:141:0x090a, B:143:0x091f, B:144:0x0990, B:136:0x08bf, B:138:0x08d4, B:139:0x0903), top: B:848:0x07fa, outer: #2, inners: #22, #25, #28, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0abe A[Catch: all -> 0x0bf6, TryCatch #33 {all -> 0x0bf6, blocks: (B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:175:0x0b50, B:170:0x0b12, B:172:0x0b18, B:173:0x0b48, B:141:0x090a, B:143:0x091f, B:144:0x0990, B:136:0x08bf, B:138:0x08d4, B:139:0x0903), top: B:848:0x07fa, outer: #2, inners: #22, #25, #28, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d28 A[Catch: all -> 0x1122, TryCatch #1 {all -> 0x1122, blocks: (B:211:0x0d22, B:213:0x0d28, B:214:0x0d63, B:216:0x0d70, B:218:0x0d79, B:219:0x0db9, B:242:0x0fdc, B:243:0x0fe0, B:246:0x0ff0, B:249:0x1007, B:252:0x1014, B:254:0x1017, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:220:0x0dc4, B:232:0x0ecb, B:234:0x0ed1, B:235:0x0f0c, B:237:0x0f36, B:238:0x0f7c, B:240:0x0f92, B:241:0x0fd6, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x107b, B:257:0x1043, B:259:0x1049, B:260:0x1073, B:227:0x0e31, B:229:0x0e4d, B:230:0x0ebf, B:222:0x0de4, B:224:0x0df9, B:225:0x0e2a), top: B:789:0x0d22, outer: #2, inners: #32, #38, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0d70 A[Catch: all -> 0x1122, TryCatch #1 {all -> 0x1122, blocks: (B:211:0x0d22, B:213:0x0d28, B:214:0x0d63, B:216:0x0d70, B:218:0x0d79, B:219:0x0db9, B:242:0x0fdc, B:243:0x0fe0, B:246:0x0ff0, B:249:0x1007, B:252:0x1014, B:254:0x1017, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:220:0x0dc4, B:232:0x0ecb, B:234:0x0ed1, B:235:0x0f0c, B:237:0x0f36, B:238:0x0f7c, B:240:0x0f92, B:241:0x0fd6, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x107b, B:257:0x1043, B:259:0x1049, B:260:0x1073, B:227:0x0e31, B:229:0x0e4d, B:230:0x0ebf, B:222:0x0de4, B:224:0x0df9, B:225:0x0e2a), top: B:789:0x0d22, outer: #2, inners: #32, #38, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0dc4 A[Catch: all -> 0x1122, TRY_LEAVE, TryCatch #1 {all -> 0x1122, blocks: (B:211:0x0d22, B:213:0x0d28, B:214:0x0d63, B:216:0x0d70, B:218:0x0d79, B:219:0x0db9, B:242:0x0fdc, B:243:0x0fe0, B:246:0x0ff0, B:249:0x1007, B:252:0x1014, B:254:0x1017, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:220:0x0dc4, B:232:0x0ecb, B:234:0x0ed1, B:235:0x0f0c, B:237:0x0f36, B:238:0x0f7c, B:240:0x0f92, B:241:0x0fd6, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x107b, B:257:0x1043, B:259:0x1049, B:260:0x1073, B:227:0x0e31, B:229:0x0e4d, B:230:0x0ebf, B:222:0x0de4, B:224:0x0df9, B:225:0x0e2a), top: B:789:0x0d22, outer: #2, inners: #32, #38, #41, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x129d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x12b4 A[Catch: all -> 0x137a, TryCatch #37 {all -> 0x137a, blocks: (B:312:0x129f, B:314:0x12b4, B:315:0x12e4), top: B:855:0x129f, outer: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x12f7 A[Catch: all -> 0x1370, TryCatch #31 {all -> 0x1370, blocks: (B:316:0x12ea, B:318:0x12f7, B:319:0x1368), top: B:844:0x12ea, outer: #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1551 A[Catch: all -> 0x1a5c, PHI: r2
  0x1551: PHI (r2v536 java.lang.Object) = (r2v524 java.lang.Object), (r2v535 java.lang.Object) binds: [B:345:0x1506, B:346:0x1508] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x1a5c, blocks: (B:344:0x1502, B:350:0x1551), top: B:834:0x1502 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x1578  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x15cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x15e0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x1642  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x1666 A[Catch: all -> 0x1640, TryCatch #16 {all -> 0x1640, blocks: (B:355:0x15ac, B:365:0x15e3, B:367:0x15e9, B:368:0x1633, B:374:0x164e, B:380:0x165d, B:412:0x17eb, B:384:0x166d, B:382:0x1666), top: B:815:0x15ac }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1916  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1ac9 A[Catch: all -> 0x0323, TryCatch #2 {all -> 0x0323, blocks: (B:118:0x074e, B:120:0x0754, B:121:0x0778, B:721:0x3215, B:723:0x321b, B:724:0x3245, B:758:0x3562, B:760:0x3568, B:761:0x3590, B:738:0x3391, B:740:0x33b4, B:741:0x340b, B:687:0x2de0, B:689:0x2de6, B:690:0x2e10, B:575:0x2672, B:577:0x2678, B:578:0x26a4, B:580:0x26de, B:581:0x2724, B:546:0x231c, B:548:0x2331, B:549:0x235f, B:551:0x2393, B:552:0x240d, B:524:0x1f98, B:526:0x1f9e, B:527:0x1fc8, B:529:0x2002, B:530:0x204d, B:498:0x1ce4, B:500:0x1cf9, B:501:0x1d29, B:481:0x1ac3, B:483:0x1ac9, B:484:0x1af2, B:337:0x1452, B:339:0x1458, B:340:0x1483, B:292:0x11c5, B:294:0x11cb, B:295:0x11f2, B:204:0x0c70, B:206:0x0c76, B:207:0x0c9e, B:19:0x0174, B:21:0x017a, B:22:0x01a1, B:24:0x0297, B:26:0x02c9, B:27:0x031d, B:211:0x0d22, B:213:0x0d28, B:214:0x0d63, B:216:0x0d70, B:218:0x0d79, B:219:0x0db9, B:242:0x0fdc, B:243:0x0fe0, B:246:0x0ff0, B:249:0x1007, B:252:0x1014, B:254:0x1017, B:266:0x10f8, B:268:0x10fe, B:269:0x10ff, B:271:0x1101, B:273:0x1108, B:274:0x1109, B:220:0x0dc4, B:232:0x0ecb, B:234:0x0ed1, B:235:0x0f0c, B:237:0x0f36, B:238:0x0f7c, B:240:0x0f92, B:241:0x0fd6, B:277:0x110f, B:279:0x1116, B:280:0x1117, B:282:0x1119, B:284:0x1120, B:285:0x1121, B:262:0x107b, B:257:0x1043, B:259:0x1049, B:260:0x1073, B:227:0x0e31, B:229:0x0e4d, B:230:0x0ebf, B:222:0x0de4, B:224:0x0df9, B:225:0x0e2a, B:584:0x2831, B:586:0x2837, B:587:0x2879, B:589:0x28a0, B:590:0x28e3, B:596:0x2908, B:598:0x290e, B:599:0x294f, B:600:0x295b, B:601:0x295c, B:603:0x2965, B:604:0x29a1, B:637:0x2bf1, B:638:0x2bf5, B:641:0x2c05, B:644:0x2c1c, B:647:0x2c29, B:650:0x2c36, B:662:0x2d18, B:664:0x2d1e, B:665:0x2d1f, B:667:0x2d21, B:669:0x2d28, B:670:0x2d29, B:607:0x29b0, B:609:0x29b4, B:613:0x29c0, B:615:0x29c6, B:627:0x2ad8, B:629:0x2ade, B:630:0x2b1f, B:632:0x2b49, B:633:0x2b92, B:635:0x2ba8, B:636:0x2beb, B:672:0x2d2b, B:674:0x2d32, B:675:0x2d33, B:677:0x2d35, B:679:0x2d3c, B:680:0x2d3d, B:125:0x07fa, B:127:0x0800, B:128:0x0844, B:130:0x0851, B:132:0x085a, B:133:0x0894, B:156:0x0ab4, B:157:0x0ab8, B:159:0x0abe, B:162:0x0ad6, B:165:0x0ae3, B:167:0x0ae6, B:179:0x0bd0, B:181:0x0bd6, B:182:0x0bd7, B:184:0x0bd9, B:186:0x0be0, B:187:0x0be1, B:134:0x089f, B:146:0x099c, B:148:0x09a2, B:149:0x09e2, B:151:0x0a0c, B:152:0x0a51, B:154:0x0a67, B:155:0x0aae, B:189:0x0be3, B:191:0x0bea, B:192:0x0beb, B:194:0x0bed, B:196:0x0bf4, B:197:0x0bf5, B:300:0x1284, B:302:0x1288, B:323:0x1372, B:325:0x1378, B:326:0x1379, B:328:0x137b, B:330:0x1382, B:331:0x1383, B:306:0x1294), top: B:790:0x0174, inners: #1, #15, #33, #48 }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x1b7f  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x1bce  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1cc4  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1e63  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1f59  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x216a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x21d6  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x2234  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x22fe  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x254f  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x2635  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x2837 A[Catch: all -> 0x2d3e, TryCatch #15 {all -> 0x2d3e, blocks: (B:584:0x2831, B:586:0x2837, B:587:0x2879, B:589:0x28a0, B:590:0x28e3, B:596:0x2908, B:598:0x290e, B:599:0x294f, B:600:0x295b, B:601:0x295c, B:603:0x2965, B:604:0x29a1, B:637:0x2bf1, B:638:0x2bf5, B:641:0x2c05, B:644:0x2c1c, B:647:0x2c29, B:650:0x2c36, B:662:0x2d18, B:664:0x2d1e, B:665:0x2d1f, B:667:0x2d21, B:669:0x2d28, B:670:0x2d29, B:607:0x29b0, B:609:0x29b4, B:613:0x29c0, B:615:0x29c6, B:627:0x2ad8, B:629:0x2ade, B:630:0x2b1f, B:632:0x2b49, B:633:0x2b92, B:635:0x2ba8, B:636:0x2beb, B:672:0x2d2b, B:674:0x2d32, B:675:0x2d33, B:677:0x2d35, B:679:0x2d3c, B:680:0x2d3d, B:653:0x2c62, B:655:0x2c68, B:656:0x2c95, B:622:0x2a36, B:624:0x2a55, B:625:0x2acc, B:617:0x29e6, B:619:0x29fb, B:620:0x2a2f, B:658:0x2c9d), top: B:814:0x2831, outer: #2, inners: #0, #6, #9, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x28a0 A[Catch: all -> 0x2d3e, TryCatch #15 {all -> 0x2d3e, blocks: (B:584:0x2831, B:586:0x2837, B:587:0x2879, B:589:0x28a0, B:590:0x28e3, B:596:0x2908, B:598:0x290e, B:599:0x294f, B:600:0x295b, B:601:0x295c, B:603:0x2965, B:604:0x29a1, B:637:0x2bf1, B:638:0x2bf5, B:641:0x2c05, B:644:0x2c1c, B:647:0x2c29, B:650:0x2c36, B:662:0x2d18, B:664:0x2d1e, B:665:0x2d1f, B:667:0x2d21, B:669:0x2d28, B:670:0x2d29, B:607:0x29b0, B:609:0x29b4, B:613:0x29c0, B:615:0x29c6, B:627:0x2ad8, B:629:0x2ade, B:630:0x2b1f, B:632:0x2b49, B:633:0x2b92, B:635:0x2ba8, B:636:0x2beb, B:672:0x2d2b, B:674:0x2d32, B:675:0x2d33, B:677:0x2d35, B:679:0x2d3c, B:680:0x2d3d, B:653:0x2c62, B:655:0x2c68, B:656:0x2c95, B:622:0x2a36, B:624:0x2a55, B:625:0x2acc, B:617:0x29e6, B:619:0x29fb, B:620:0x2a2f, B:658:0x2c9d), top: B:814:0x2831, outer: #2, inners: #0, #6, #9, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x28f9  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x29ac  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2bfb  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x2e97  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x2ee9  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x2f3d  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x31f3  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x32ce  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x331e  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x3373  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x3542  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:876:0x1284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:912:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v121 */
    /* JADX WARN: Type inference failed for: r12v125 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v129 */
    /* JADX WARN: Type inference failed for: r12v133 */
    /* JADX WARN: Type inference failed for: r12v134 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v30 */
    /* JADX WARN: Type inference failed for: r43v31 */
    /* JADX WARN: Type inference failed for: r43v32 */
    /* JADX WARN: Type inference failed for: r43v36 */
    /* JADX WARN: Type inference failed for: r43v37 */
    /* JADX WARN: Type inference failed for: r43v38 */
    /* JADX WARN: Type inference failed for: r9v178 */
    /* JADX WARN: Type inference failed for: r9v179 */
    /* JADX WARN: Type inference failed for: r9v180 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v63, types: [long] */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.activity.TransactionErrorActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 1;
        component1();
        copydefault();
        INSTANCE = new Companion(null);
        int i = getAsAtTimestamp + 29;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 53;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 17;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        component3 = (char) 56551;
        copydefault = (char) 8525;
        ShareDataUIState = (char) 29447;
        component1 = (char) 59887;
        if (i3 != 0) {
            throw null;
        }
    }

    static void component1() {
        component2 = -3780477796495014671L;
        component4 = 1386857713;
        getRequestBeneficiariesState = (char) 61874;
        equals = new char[]{33374, 33738, 33790, 33737, 33739, 33476, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33470, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33428, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33408, 33398, 33359, 33362, 33400, 33376, 33399, 33356, 33357, 33361, 33400, 33399, 33401, 33376, 33400, 33361, 33363, 33361, 33400, 33400, 33358, 33356, 33356, 33357, 33358, 33355, 33357, 33359, 33356, 33396, 33396, 33356, 33399, 33378, 33402, 33400, 33401, 33360, 33358, 33398, 33400, 33358, 33355, 33398, 33376, 33401, 33401, 33311, 33376, 33377, 33398, 33359, 33402, 33399, 33356, 33356, 33359, 33400, 33376, 33398, 33358, 33362, 33400, 33400, 33519, 33469, 33460, 33461, 33468, 33460, 33458, 33457, 33422, 33431, 33469, 33426, 33514, 33516, 33517, 33515, 33516, 33516, 33515, 33426, 33427, 33514, 33512, 33513, 33514, 33517, 33520, 33515, 33417, 33454, 33453, 33451, 33457, 33458, 33452, 33454, 33462, 33458, 33458, 33429, 33519, 33419, 33421, 33422, 33452, 33459, 33465, 33461, 33460, 33427, 33427, 33459, 33463, 33431, 33425, 33457, 33462, 33431, 33430, 33460, 33462, 33460, 33452, 33453, 33460, 33460, 33462, 33460, 33457, 33429, 33422, 33452, 33468, 33307, 33306, 33305, 33308, 33304, 33510, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33465, 33464, 33467, 33462, 33414, 33418, 33420, 33395, 33393, 33391, 33386, 33390, 33396, 33361, 33356, 33385, 33354, 33370, 33396, 33380, 33383, 33390, 33393, 33346, 33347, 33389, 33393, 33395, 33475, 33511, 33516, 33519, 33429, 33468, 33467, 33424, 33425, 33429, 33430, 33469, 33470, 33427, 33426, 33428, 33427, 33468, 33428, 33515, 33517, 33429, 33426, 33514, 33426, 33425, 33428, 33469, 33468, 33427, 33516, 33515, 33513, 33426, 33468, 33429, 33427, 33427, 33514, 33425, 33425, 33513, 33513, 33512, 33514, 33513, 33425, 33427, 33517, 33428, 33467, 33429, 33430, 33429, 33426, 33424, 33424, 33467, 33429, 33427, 33467, 33425, 33425, 33468, 33475, 33426, 33429, 33517, 33516, 33514, 33513, 33514, 33515, 33427, 33467, 33467, 33426, 33513, 33512, 33515, 33429, 33467, 33426, 33428, 33429, 33429, 33468, 33425, 33511, 33512, 33426, 33468, 33427, 33514, 33516, 33427, 33465, 33428, 33429, 33469, 33427, 33512, 33425, 33468, 33427, 33426, 33428, 33515, 33515, 33515, 33426, 33428, 33517, 33518, 33515, 33513, 33514, 33511, 33511, 33514, 33513, 33514, 33517, 33428, 33428, 33519, 33430, 33430, 33478, 33516, 33516, 33515, 33512, 33511, 33514, 33514, 33514, 33515, 33512};
    }
}
