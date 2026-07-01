package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.griver.lottie.value.LottieRelativeFloatValueCallback;
import com.alipay.mobile.common.rpc.RpcException;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.BuildConfig;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestReport;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestError;
import com.huawei.hms.scankit.p.i0;
import com.safaricom.mpesa.logging.L;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.internal.operators.observable.ObservableWindowTimed;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.setTintMode;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010'\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010(\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010+\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0018H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u00100\u001a\u00020$J\u0006\u00101\u001a\u00020$R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_dlval", "Landroidx/lifecycle/MutableLiveData;", "", "_compdl", "downloadvalue", "Landroidx/lifecycle/LiveData;", "getDownloadvalue", "()Landroidx/lifecycle/LiveData;", "completeddl", "getCompleteddl", "_ulval", "_compul", "_pingval", "pingvalue", "getPingvalue", "uploadvalue", "getUploadvalue", "completedul", "getCompletedul", "pingResult", "", "speedtesthosttt", "whatsapphosttt", "instahosttt", "googlehosttt", "twitterhosttt", "fbhosttt", "safhosttt", "microsofthosttt", "tiktokhosttt", "ythosttt", "dowloadTestFunc", "", "uploadTestFunc", "pingThis", "pingWhatsapp", "pingInsta", "pingGoogle", "pingTwitter", "pingFB", "pingSaf", "pingMicrosoft", "pingTiktok", "pingYt", "runSpeedTest", "runPingTest", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedTestViewModel extends ViewModel {
    public static final int $stable = 8;
    private static char CoroutineDebuggingKt;

    private static int f2758b;
    private static char coroutineBoundary;
    private static char coroutineCreation;
    private static char getARTIFICIAL_FRAME_PACKAGE_NAME;
    private String getAsAtTimestamp;
    private static final byte[] $$c = {13, 38, -109, 117};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {7, 75, -84, -52, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 54;
    private static final byte[] $$a = {73, 121, -48, -56, 19, -19, -2};
    private static final int $$b = 107;

    private static int f2760d = 0;

    private static int f2759c = 1;
    private static int invoke = 0;
    private final MutableLiveData<Double> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Double> component1 = new MutableLiveData<>();
    private final MutableLiveData<Double> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Double> component3 = new MutableLiveData<>();
    private final MutableLiveData<Double> component2 = new MutableLiveData<>();
    private String getShareableDataState = BuildConfig.MTANDAO_SPEEDTEST_URL;
    private String ArtificialStackFrames = BuildConfig.WHATSAPP_URL;
    private String getRequestBeneficiariesState = BuildConfig.INSTAGRAM_URL;
    private String copy = BuildConfig.GOOGLE_URL;
    private String getSponsorBeneficiariesState = BuildConfig.TWITTER_URL;
    private String equals = BuildConfig.FACEBOOK_URL;
    private String toString = BuildConfig.SAFARICOM_URL;
    private String component4 = BuildConfig.MICROSOFT_URL;
    private String hashCode = BuildConfig.TIKTOK_URL;
    private String accessartificialFrame = BuildConfig.YOUTUBE_URL;

    private static String $$g(byte b2, byte b3, int i) {
        int i2 = i + 4;
        byte[] bArr = $$c;
        int i3 = 111 - (b2 * 3);
        int i4 = b3 * 3;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            i2++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i2];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.$$a
            int r8 = r8 * 4
            int r8 = r8 + 101
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.a(byte, short, short, java.lang.Object[]):void");
    }

    public static Object component2(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = i9 | i10 | (~(i8 | i2));
        int i12 = i10 | i4;
        int i13 = ~i2;
        int i14 = (~(i4 | i13 | i6)) | (~(i7 | i13 | i8)) | (~(i8 | i6 | i2));
        int i15 = i6 + i2 + i5 + ((-1329026341) * i) + ((-1277752516) * i3);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i6) - 1912602624) + ((-659060787) * i2) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i5) + (494927872 * i) + (1577058304 * i3) + ((-1783103488) * i16);
        int i18 = (i6 * 595972471) + 129777640 + (i2 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i5 * 595972219) + (i * (-1341978823)) + (i3 * 731850196) + (i16 * 1869086720);
        return i17 + ((i18 * i18) * (-846725120)) != 1 ? component1(objArr) : ShareDataUIState(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 10 - r7
            int r8 = 100 - r8
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.$$d
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            int r6 = r6 + (-27)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.e(byte, byte, int, java.lang.Object[]):void");
    }

    public static final void access$dowloadTestFunc(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 123;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        speedTestViewModel.component1();
        if (i3 != 0) {
            throw null;
        }
        int i4 = f2760d + 39;
        f2759c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final String access$getSpeedtesthosttt$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 27;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        String str = speedTestViewModel.getShareableDataState;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$get_compdl$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 105;
        int i3 = i2 % 128;
        f2760d = i3;
        int i4 = i2 % 2;
        MutableLiveData<Double> mutableLiveData = speedTestViewModel.component1;
        int i5 = i3 + 25;
        f2759c = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$get_compul$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2760d + 77;
        int i3 = i2 % 128;
        f2759c = i3;
        int i4 = i2 % 2;
        MutableLiveData<Double> mutableLiveData = speedTestViewModel.component3;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 91;
        f2760d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return mutableLiveData;
    }

    public static final MutableLiveData access$get_dlval$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2760d + 3;
        int i3 = i2 % 128;
        f2759c = i3;
        int i4 = i2 % 2;
        MutableLiveData<Double> mutableLiveData = speedTestViewModel.ShareDataUIState;
        int i5 = i3 + 7;
        f2760d = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$get_pingval$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2760d + 29;
        int i3 = i2 % 128;
        f2759c = i3;
        int i4 = i2 % 2;
        MutableLiveData<Double> mutableLiveData = speedTestViewModel.component2;
        int i5 = i3 + 29;
        f2760d = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final MutableLiveData access$get_ulval$p(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2760d;
        int i3 = i2 + 63;
        f2759c = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Double> mutableLiveData = speedTestViewModel.copydefault;
        int i5 = i2 + 5;
        f2759c = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public static final String access$pingFB(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 109;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
        String strShareDataUIState = speedTestViewModel.ShareDataUIState();
        int i4 = f2760d + 5;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
        return strShareDataUIState;
    }

    public static final String access$pingGoogle(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 27;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
        String strComponent2 = speedTestViewModel.component2();
        int i4 = f2759c + 37;
        f2760d = i4 % 128;
        if (i4 % 2 == 0) {
            return strComponent2;
        }
        throw null;
    }

    public static final String access$pingInsta(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2759c + 69;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        String strCopydefault = speedTestViewModel.copydefault();
        int i4 = f2760d + 61;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
        return strCopydefault;
    }

    public static final String access$pingMicrosoft(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 21;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
        String strCopy = speedTestViewModel.copy();
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = f2760d + 121;
        f2759c = i5 % 128;
        int i6 = i5 % 2;
        return strCopy;
    }

    public static final String access$pingSaf(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2759c + 55;
        f2760d = i2 % 128;
        if (i2 % 2 != 0) {
            speedTestViewModel.equals();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strEquals = speedTestViewModel.equals();
        int i3 = f2760d + 91;
        f2759c = i3 % 128;
        int i4 = i3 % 2;
        return strEquals;
    }

    public static final String access$pingThis(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 27;
        f2759c = i2 % 128;
        if (i2 % 2 == 0) {
            speedTestViewModel.getAsAtTimestamp();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String asAtTimestamp = speedTestViewModel.getAsAtTimestamp();
        int i3 = f2760d + 5;
        f2759c = i3 % 128;
        int i4 = i3 % 2;
        return asAtTimestamp;
    }

    public static final String access$pingTiktok(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 109;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {speedTestViewModel};
        int iComponent1 = LottieRelativeFloatValueCallback.component1();
        int iComponent12 = LottieRelativeFloatValueCallback.component1();
        int iComponent13 = LottieRelativeFloatValueCallback.component1();
        int iComponent14 = LottieRelativeFloatValueCallback.component1();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) component2(objArr, iComponent13, 810424045, iComponent14, iComponent1, iComponent12, -810424045);
        int i4 = f2760d + 27;
        f2759c = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static final String access$pingTwitter(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 17;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
        String strComponent4 = speedTestViewModel.component4();
        int i4 = f2759c + 91;
        f2760d = i4 % 128;
        if (i4 % 2 == 0) {
            return strComponent4;
        }
        throw null;
    }

    public static final String access$pingWhatsapp(SpeedTestViewModel speedTestViewModel) throws Throwable {
        int i = 2 % 2;
        int i2 = f2760d + 75;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
        String strArtificialStackFrames = speedTestViewModel.ArtificialStackFrames();
        int i4 = f2760d + 43;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
        return strArtificialStackFrames;
    }

    public static final String access$pingYt(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 15;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) component2(new Object[]{speedTestViewModel}, LottieRelativeFloatValueCallback.component1(), -1715039685, LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), 1715039686);
        int i4 = f2760d + 21;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final void access$uploadTestFunc(SpeedTestViewModel speedTestViewModel) {
        int i = 2 % 2;
        int i2 = f2759c + 105;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
        speedTestViewModel.getSponsorBeneficiariesState();
        if (i3 != 0) {
            throw null;
        }
        int i4 = f2760d + 7;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public SpeedTestViewModel() {
    }

    public final LiveData<Double> getDownloadvalue() {
        int i = 2 % 2;
        int i2 = f2760d;
        int i3 = i2 + 99;
        f2759c = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Double> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 23;
        f2759c = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final LiveData<Double> getCompleteddl() {
        int i = 2 % 2;
        int i2 = f2760d;
        int i3 = i2 + 47;
        f2759c = i3 % 128;
        if (i3 % 2 == 0) {
            MutableLiveData<Double> mutableLiveData = this.component1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Double> mutableLiveData2 = this.component1;
        int i4 = i2 + 3;
        f2759c = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return mutableLiveData2;
    }

    public final LiveData<Double> getPingvalue() {
        int i = 2 % 2;
        int i2 = f2760d;
        int i3 = i2 + 35;
        f2759c = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Double> mutableLiveData = this.component2;
        int i5 = i2 + 69;
        f2759c = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final LiveData<Double> getUploadvalue() {
        int i = 2 % 2;
        int i2 = f2759c;
        int i3 = i2 + 87;
        f2760d = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Double> mutableLiveData = this.copydefault;
        int i5 = i2 + 25;
        f2760d = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final LiveData<Double> getCompletedul() {
        int i = 2 % 2;
        int i2 = f2759c + 33;
        int i3 = i2 % 128;
        f2760d = i3;
        int i4 = i2 % 2;
        MutableLiveData<Double> mutableLiveData = this.component3;
        int i5 = i3 + 3;
        f2759c = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$dowloadTestFunc$1", f = "SpeedTestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int copydefault;
        final SpeedTestSocket ShareDataUIState;
        int component1;
        final SpeedTestViewModel component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 21;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpeedTestSocket speedTestSocket = this.ShareDataUIState;
            final SpeedTestViewModel speedTestViewModel = this.component3;
            speedTestSocket.addSpeedTestListener(new ISpeedTestListener() {
                private static int component3 = 0;
                private static int copydefault = 1;

                @Override
                public void onCompletion(SpeedTestReport report) {
                    int i3 = 2 % 2;
                    int i4 = component3 + 119;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(report, "");
                    DeviceMetrics.INSTANCE.setUpload(0.0d);
                    DeviceMetrics.INSTANCE.setDownload(0.0d);
                    SpeedTestViewModel.access$get_dlval$p(speedTestViewModel).postValue(Double.valueOf(-2.0d));
                    SpeedTestViewModel.access$get_compdl$p(speedTestViewModel).postValue(Double.valueOf(report.getTransferRateBit().doubleValue()));
                    SpeedTestViewModel.access$uploadTestFunc(speedTestViewModel);
                    int i6 = copydefault + 13;
                    component3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 65 / 0;
                    }
                }

                @Override
                public void onError(SpeedTestError speedTestError, String errorMessage) {
                    int i3 = 2 % 2;
                    Intrinsics.checkNotNullParameter(speedTestError, "");
                    Intrinsics.checkNotNullParameter(errorMessage, "");
                    DeviceMetrics.INSTANCE.setAveragePing(0.0d);
                    DeviceMetrics.INSTANCE.setWhtasappPing(0.0d);
                    DeviceMetrics.INSTANCE.setInstaPing(0.0d);
                    DeviceMetrics.INSTANCE.setGooglePing(0.0d);
                    DeviceMetrics.INSTANCE.setTwitterPing(0.0d);
                    DeviceMetrics.INSTANCE.setFbPing(0.0d);
                    DeviceMetrics.INSTANCE.setSafPing(0.0d);
                    DeviceMetrics.INSTANCE.setMicroPing(0.0d);
                    DeviceMetrics.INSTANCE.setTiktokPing(0.0d);
                    DeviceMetrics.INSTANCE.setYtPing(0.0d);
                    SpeedTestViewModel.access$get_dlval$p(speedTestViewModel).postValue(Double.valueOf(-1.0d));
                    L.INSTANCE.d("SPEED:" + speedTestError + "\n" + errorMessage, new Object[0]);
                    int i4 = copydefault + 9;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                @Override
                public void onProgress(float percent, SpeedTestReport report) {
                    int i3 = 2 % 2;
                    int i4 = component3 + 7;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(report, "");
                    DeviceMetrics.INSTANCE.setDownload(report.getTransferRateBit().doubleValue());
                    SpeedTestViewModel.access$get_dlval$p(speedTestViewModel).postValue(Double.valueOf(DeviceMetrics.INSTANCE.getDownload()));
                    int i6 = copydefault + 21;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            this.ShareDataUIState.startFixedDownload("http://" + SpeedTestViewModel.access$getSpeedtesthosttt$p(this.component3) + "/HTTP_DL/500MB_2.zip", 22000);
            this.ShareDataUIState.setSocketTimeout(RpcException.ErrorCode.SERVER_UNKNOWERROR);
            Unit unit = Unit.INSTANCE;
            int i3 = component2 + 63;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(SpeedTestSocket speedTestSocket, SpeedTestViewModel speedTestViewModel, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.ShareDataUIState = speedTestSocket;
            this.component3 = speedTestViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = new ShareDataUIState(this.ShareDataUIState, this.component3, continuation);
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 119;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ShareDataUIState(new SpeedTestSocket(), this, null), 2, null);
        int i2 = f2760d + 89;
        f2759c = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$uploadTestFunc$1", f = "SpeedTestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        final SpeedTestViewModel ShareDataUIState;
        int component2;
        final SpeedTestSocket component3;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
        
            r0 = 34 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r4.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r4.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r5);
            r5 = r4.component3;
            r2 = r4.ShareDataUIState;
            r5.addSpeedTestListener(new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$uploadTestFunc$1$1(r2));
            r4.component3.setUploadStorageType(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType.RAM_STORAGE);
            r4.component3.startFixedUpload("http://" + com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$getSpeedtesthosttt$p(r4.ShareDataUIState) + "/upload/", 500000000, 33000);
            r4.component3.setSocketTimeout(com.alipay.mobile.common.rpc.RpcException.ErrorCode.SERVER_UNKNOWERROR);
            r5 = kotlin.Unit.INSTANCE;
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.copydefault + 9;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.component1 = r1 % 128;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.component1
                int r1 = r1 + 3
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.copydefault = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.component2
                r2 = 95
                int r2 = r2 / 0
                if (r1 != 0) goto L76
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.component2
                if (r1 != 0) goto L76
            L21:
                kotlin.ResultKt.throwOnFailure(r5)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket r5 = r4.component3
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$uploadTestFunc$1$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$uploadTestFunc$1$1
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel r2 = r4.ShareDataUIState
                r1.<init>()
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener r1 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.inter.ISpeedTestListener) r1
                r5.addSpeedTestListener(r1)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket r5 = r4.component3
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.UploadStorageType.RAM_STORAGE
                r5.setUploadStorageType(r1)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket r5 = r4.component3
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel r1 = r4.ShareDataUIState
                java.lang.String r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$getSpeedtesthosttt$p(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "http://"
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = "/upload/"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r2 = 500000000(0x1dcd6500, float:5.436748E-21)
                r3 = 33000(0x80e8, float:4.6243E-41)
                r5.startFixedUpload(r1, r2, r3)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.SpeedTestSocket r5 = r4.component3
                r1 = 5000(0x1388, float:7.006E-42)
                r5.setSocketTimeout(r1)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.copydefault
                int r1 = r1 + 9
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.component1 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L75
                r0 = 34
                int r0 = r0 / 0
            L75:
                return r5
            L76:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(SpeedTestSocket speedTestSocket, SpeedTestViewModel speedTestViewModel, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component3 = speedTestSocket;
            this.ShareDataUIState = speedTestViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = new component2(this.component3, this.ShareDataUIState, continuation);
            int i2 = component1 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component1 + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 83;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final void getSponsorBeneficiariesState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new component2(new SpeedTestSocket(), this, null), 2, null);
        int i2 = f2760d + 89;
        f2759c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $11 + 9;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 67;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) CoroutineDebuggingKt) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getARTIFICIAL_FRAME_PACKAGE_NAME);
                    objArr2[i2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 844, 32 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (23251 - TextUtils.getTrimmedLength("")), 592652048, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) coroutineBoundary) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(coroutineCreation)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - ExpandableListView.getPackedPositionType(0L), 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 23251), 592652048, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(466 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 50, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i2 = 2;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $10 + 9;
        $11 = i12 % 128;
        if (i12 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x06a1, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x06a2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0260, code lost:
    
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0267, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0269, code lost:
    
        r0 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 1343;
        r20 = android.view.View.MeasureSpec.getMode(0) + 33;
        r5 = (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6425);
        r8 = (byte) (-1);
        r7 = (byte) (r8 + 1);
        r13 = new java.lang.Object[1];
        e(r8, r7, (byte) (r7 + 1), r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r20, r5, 1443979249, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02a0, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r11);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02ad, code lost:
    
        if (r0 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02af, code lost:
    
        r0 = android.view.Gravity.getAbsoluteGravity(0, 0) + 1342;
        r20 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
        r5 = (char) (6425 - android.view.KeyEvent.getDeadChar(0, 0));
        r8 = (byte) (-1);
        r7 = (byte) (r8 + 1);
        r12 = new java.lang.Object[1];
        e(r8, r7, (byte) (r7 + 1), r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r20, r5, 1443979249, false, (java.lang.String) r12[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02ec, code lost:
    
        r7 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02ff, code lost:
    
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0301, code lost:
    
        r0 = android.text.TextUtils.lastIndexOf("", '0', 0) + 1343;
        r20 = 33 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        r5 = (char) (6424 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0));
        r8 = (byte) (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.$$d[0] + 1);
        r11 = (byte) (r8 - 5);
        r13 = new java.lang.Object[1];
        e(r8, r11, (byte) (r11 - 3), r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r20, r5, -181198845, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x034e, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r7)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x069a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x069b, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x069f, code lost:
    
        if (r2 != null) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getAsAtTimestamp() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.getAsAtTimestamp():java.lang.String");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$runSpeedTest$1", f = "SpeedTestViewModel.kt", i = {}, l = {334}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveDataAccess$get_pingval$p;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SpeedTestViewModel.access$get_pingval$p(SpeedTestViewModel.this).postValue(Boxing.boxDouble(0.0d));
                this.ShareDataUIState = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    int i3 = component3 + 109;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = component3 + 1;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            List<String> listSplit = new Regex("\\s").split(String.valueOf(SpeedTestViewModel.access$pingThis(SpeedTestViewModel.this)), 0);
            if (listSplit.size() == 1) {
                DeviceMetrics.INSTANCE.setAveragePing(0.0d);
                SpeedTestViewModel.access$get_pingval$p(SpeedTestViewModel.this).postValue(Boxing.boxDouble(-1.0d));
            } else if (listSplit.size() > 1) {
                List listSplit$default = StringsKt.split$default((CharSequence) listSplit.get(13), new String[]{"="}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 1) {
                    int i6 = component3 + 97;
                    copydefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        DeviceMetrics.INSTANCE.setAveragePing(0.0d);
                        mutableLiveDataAccess$get_pingval$p = SpeedTestViewModel.access$get_pingval$p(SpeedTestViewModel.this);
                    } else {
                        DeviceMetrics.INSTANCE.setAveragePing(0.0d);
                        mutableLiveDataAccess$get_pingval$p = SpeedTestViewModel.access$get_pingval$p(SpeedTestViewModel.this);
                    }
                    mutableLiveDataAccess$get_pingval$p.postValue(Boxing.boxDouble(-1.0d));
                } else if (listSplit$default.size() > 1) {
                    int i7 = copydefault + 43;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    DeviceMetrics.INSTANCE.setAveragePing(Double.parseDouble((String) listSplit$default.get(1)));
                    SpeedTestViewModel.access$get_pingval$p(SpeedTestViewModel.this).postValue(Boxing.boxDouble(DeviceMetrics.INSTANCE.getAveragePing()));
                    SpeedTestViewModel.access$dowloadTestFunc(SpeedTestViewModel.this);
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SpeedTestViewModel.this.new component3(continuation);
            int i2 = component3 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component3 + 1;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component3Var.invokeSuspend(Unit.INSTANCE);
            }
            component3Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel$runPingTest$1", f = "SpeedTestViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component2;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            if (r15.size() <= 13) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        
            if (r15.size() <= 1) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setAveragePing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingWhatsapp(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        
            if (r15.size() <= 13) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.copydefault + 99;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.component3 = r1 % 128;
            r1 = r1 % 2;
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
        
            if (r15.size() <= 1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.component3 + 31;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.copydefault = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
        
            if ((r1 % 2) == 0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion;
            r15 = r15.get(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion;
            r15 = r15.get(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
        
            r1.setWhtasappPing(java.lang.Double.parseDouble((java.lang.String) r15));
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingInsta(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e5, code lost:
        
            if (r15.size() <= 13) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
        
            if (r15.size() <= 1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setInstaPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingGoogle(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0128, code lost:
        
            if (r15.size() <= 13) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x012a, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.copydefault + 57;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.component3 = r1 % 128;
            r1 = r1 % 2;
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x014a, code lost:
        
            if (r15.size() <= 1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setGooglePing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x015b, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingTwitter(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0176, code lost:
        
            if (r15.size() <= 12) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0178, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(12), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x018f, code lost:
        
            if (r15.size() <= 1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0191, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setTwitterPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x01a0, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingFB(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01b9, code lost:
        
            if (r15.size() <= 13) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x01bb, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.copydefault + 95;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.component3 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01c4, code lost:
        
            if ((r1 % 2) != 0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01c6, code lost:
        
            r8 = r15.get(19);
            r9 = new java.lang.String[1];
            r9[1] = "=";
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r8, r9, true, 1, 120, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01e0, code lost:
        
            if (r15.size() <= 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01e3, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01fa, code lost:
        
            if (r15.size() <= 1) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01fc, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setFbPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x020b, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingSaf(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0224, code lost:
        
            if (r15.size() <= 12) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0226, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(12), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x023d, code lost:
        
            if (r15.size() <= 1) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x023f, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setSafPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x024e, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingMicrosoft(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0267, code lost:
        
            if (r15.size() <= 12) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0269, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(12), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0280, code lost:
        
            if (r15.size() <= 1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0282, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.component3 + 5;
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.copydefault = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x028b, code lost:
        
            if ((r1 % 2) == 0) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x028d, code lost:
        
            r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion;
            r15 = r15.get(0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r14.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0294, code lost:
        
            r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion;
            r15 = r15.get(1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x029a, code lost:
        
            r0.setMicroPing(java.lang.Double.parseDouble((java.lang.String) r15));
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02a3, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingTiktok(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x02bc, code lost:
        
            if (r15.size() <= 13) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02be, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x02d5, code lost:
        
            if (r15.size() <= 1) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02d7, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setTiktokPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x02e6, code lost:
        
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingYt(r14.component1)), 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x02ff, code lost:
        
            if (r15.size() <= 13) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0301, code lost:
        
            r15 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r15.get(13), new java.lang.String[]{"="}, false, 0, 6, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0318, code lost:
        
            if (r15.size() <= 1) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x031a, code lost:
        
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics.Companion.setYtPing(java.lang.Double.parseDouble((java.lang.String) r15.get(1)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x032b, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0333, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r14.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r15);
            r15 = new kotlin.text.Regex("\\s").split(java.lang.String.valueOf(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.access$pingThis(r14.component1)), 0);
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 820
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = SpeedTestViewModel.this.new copydefault(continuation);
            int i2 = copydefault + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = copydefault + 25;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            int i5 = copydefault + 41;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f6 A[Catch: all -> 0x0691, TryCatch #1 {all -> 0x0691, blocks: (B:38:0x02e1, B:40:0x02f6, B:41:0x033e, B:53:0x039f, B:55:0x03ac, B:56:0x03ed, B:58:0x040a, B:59:0x0456), top: B:109:0x02e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0549  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String ArtificialStackFrames() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.ArtificialStackFrames():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x075f A[Catch: IOException -> 0x077e, LOOP:1: B:102:0x075d->B:103:0x075f, LOOP_END, TryCatch #4 {IOException -> 0x077e, blocks: (B:101:0x072e, B:103:0x075f, B:104:0x0767), top: B:129:0x072e }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0778 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0636  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String copydefault() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copydefault():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0312 A[Catch: all -> 0x06b2, TryCatch #0 {all -> 0x06b2, blocks: (B:40:0x02fd, B:42:0x0312, B:43:0x035a, B:56:0x03bd, B:58:0x03ca, B:59:0x040d, B:61:0x042a, B:62:0x0471, B:82:0x059e, B:84:0x05a4, B:85:0x05c9, B:87:0x0603, B:89:0x064a), top: B:105:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x055d A[PHI: r0
  0x055d: PHI (r0v58 java.lang.reflect.Method) = (r0v57 java.lang.reflect.Method), (r0v60 java.lang.reflect.Method) binds: [B:76:0x055b, B:73:0x0556] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0562  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String component2() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.component2():java.lang.String");
    }

    private final String component4() throws Throwable {
        String line = "";
        int i = 2 % 2;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        ArrayList arrayList = new ArrayList();
        int iCopydefault = FlowableOnErrorReturn.component3.copydefault(arrayList);
        int i2 = iCopydefault ^ iIntValue;
        if (iCopydefault != 0) {
            int i3 = f2759c + 49;
            f2760d = i3 % 128;
            int i4 = i3 % 2;
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (iIntValue ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (j2 - ((j2 >> 63) << 32)) | (((long) 1) << 32);
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.combineMeasuredStates(0, 0), 42 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {-307786628, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 57, (char) (ViewConfiguration.getEdgeSlop() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Process processExec = Runtime.getRuntime().exec("/system/bin/ping -c 1 -s 64 " + this.getSponsorBeneficiariesState);
            Intrinsics.checkNotNullExpressionValue(processExec, "");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                line = bufferedReader.readLine();
                sb.append(line);
                int i5 = f2759c + 101;
                f2760d = i5 % 128;
                int i6 = i5 % 2;
            }
            String string = sb.toString();
            this.getAsAtTimestamp = string;
            int i7 = f2760d + 61;
            f2759c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 27 / 0;
            }
            return string;
        } catch (IOException e) {
            return e.toString();
        }
    }

    private final String ShareDataUIState() throws Throwable {
        Runtime runtime;
        String line;
        int i = 2 % 2;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        ArrayList arrayList = new ArrayList();
        int iComponent1 = ObservableWindowTimed.component3.component1.component1(arrayList);
        int i2 = iComponent1 ^ iIntValue;
        String str = "";
        if (iComponent1 != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (j2 - ((j2 >> 63) << 32)) | (((long) 1) << 32) | (((long) (iIntValue ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionType(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {1854839691, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 56, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(iIntValue));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            runtime = Runtime.getRuntime();
        } catch (IOException e) {
            e = e;
        }
        try {
            Process processExec = runtime.exec("/system/bin/ping -c 1 -s 64 " + this.equals);
            Intrinsics.checkNotNullExpressionValue(processExec, "");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (str != null) {
                int i3 = f2760d + 79;
                f2759c = i3 % 128;
                if (i3 % 2 == 0) {
                    line = bufferedReader.readLine();
                    sb.append(line);
                    int i4 = 80 / 0;
                } else {
                    line = bufferedReader.readLine();
                    sb.append(line);
                }
                str = line;
                int i5 = f2759c + 105;
                f2760d = i5 % 128;
                int i6 = i5 % 2;
            }
            String string = sb.toString();
            this.getAsAtTimestamp = string;
            return string;
        } catch (IOException e2) {
            e = e2;
            return e.toString();
        }
    }

    private final String equals() throws Throwable {
        String line = "";
        int i = 2 % 2;
        Object obj = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        ArrayList arrayList = new ArrayList();
        int iShareDataUIState = i0.ShareDataUIState(arrayList);
        int i2 = iShareDataUIState ^ iIntValue;
        if (iShareDataUIState != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (iIntValue ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6618, 43 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {1970672633, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, ExpandableListView.getPackedPositionGroup(0L) + 56, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(iIntValue));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Process processExec = Runtime.getRuntime().exec("/system/bin/ping -c 1 -s 64 " + this.toString);
            Intrinsics.checkNotNullExpressionValue(processExec, "");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                int i3 = f2760d + 7;
                f2759c = i3 % 128;
                if (i3 % 2 == 0) {
                    sb.append(bufferedReader.readLine());
                    obj.hashCode();
                    throw null;
                }
                line = bufferedReader.readLine();
                sb.append(line);
            }
            String string = sb.toString();
            this.getAsAtTimestamp = string;
            int i4 = f2760d + 37;
            f2759c = i4 % 128;
            int i5 = i4 % 2;
            return string;
        } catch (IOException e) {
            return e.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x06a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x022d, code lost:
    
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0234, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0236, code lost:
    
        r0 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1342;
        r19 = android.graphics.Color.argb(0, 0, 0, 0) + 33;
        r5 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 6424);
        r9 = (byte) (-1);
        r8 = (byte) (r9 + 1);
        r13 = new java.lang.Object[1];
        e(r9, r8, (byte) (r8 + 1), r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r19, r5, 1443979249, false, (java.lang.String) r13[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0272, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x027f, code lost:
    
        if (r0 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0281, code lost:
    
        r0 = 1342 - (android.view.ViewConfiguration.getTouchSlop() >> 8);
        r19 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
        r5 = (char) (6425 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
        r9 = (byte) (-1);
        r8 = (byte) (r9 + 1);
        r12 = new java.lang.Object[1];
        e(r9, r8, (byte) (r8 + 1), r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r19, r5, 1443979249, false, (java.lang.String) r12[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02c7, code lost:
    
        r8 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02da, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02dc, code lost:
    
        r0 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 1343;
        r19 = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33;
        r5 = (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6425);
        r9 = (byte) (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.$$d[0] + 1);
        r11 = (byte) (r9 - 5);
        r13 = new java.lang.Object[1];
        e(r9, r11, (byte) (r11 - 3), r13);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r19, r5, -181198845, false, (java.lang.String) r13[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0326, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r8)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x054f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String copy() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel.copy():java.lang.String");
    }

    private static Object component1(Object[] objArr) throws Throwable {
        SpeedTestViewModel speedTestViewModel = (SpeedTestViewModel) objArr[0];
        int i = 2 % 2;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, speedTestViewModel)).intValue();
        ArrayList arrayList = new ArrayList();
        int iShareDataUIState = setTintMode.copydefault.ShareDataUIState(arrayList);
        int i2 = iShareDataUIState ^ iIntValue;
        String line = "";
        if (iShareDataUIState == 0) {
            try {
                Process processExec = Runtime.getRuntime().exec("/system/bin/ping -c 1 -s 64 " + speedTestViewModel.hashCode);
                Intrinsics.checkNotNullExpressionValue(processExec, "");
                processExec.waitFor();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (line != null) {
                    int i3 = f2760d + 123;
                    f2759c = i3 % 128;
                    if (i3 % 2 == 0) {
                        sb.append(bufferedReader.readLine());
                        throw null;
                    }
                    line = bufferedReader.readLine();
                    sb.append(line);
                }
                String string = sb.toString();
                speedTestViewModel.getAsAtTimestamp = string;
                return string;
            } catch (IOException e) {
                return e.toString();
            }
        }
        int i4 = f2760d + 1;
        f2759c = i4 % 128;
        int i5 = i4 % 2;
        long j = -1;
        long j2 = ((long) (iIntValue ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        long j3 = 0;
        long j4 = j2 | (((long) 1) << 32) | (j3 - ((j3 >> 63) << 32));
        try {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 6618, Drawable.resolveOpacity(0, 0) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault).invoke(null, null);
            Object[] objArr2 = {-2133987535, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.combineMeasuredStates(0, 0), 56 - View.resolveSizeAndState(0, 0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault2).invoke(objInvoke, objArr2);
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static Object ShareDataUIState(Object[] objArr) throws Throwable {
        SpeedTestViewModel speedTestViewModel = (SpeedTestViewModel) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, speedTestViewModel)).intValue();
        ArrayList arrayList = new ArrayList();
        int iComponent1 = CompletableFromAction.component1(arrayList);
        int i2 = iComponent1 ^ iIntValue;
        String line = "";
        if (iComponent1 != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (iIntValue ^ i2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (j2 - ((j2 >> 63) << 32)) | (((long) 1) << 32);
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6618, 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr2 = {-1136077714, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), KeyEvent.keyCodeFromString("") + 56, (char) View.MeasureSpec.getMode(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr2);
                throw new RuntimeException(String.valueOf(iIntValue));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Process processExec = Runtime.getRuntime().exec("/system/bin/ping -c 1 -s 64 " + speedTestViewModel.accessartificialFrame);
            Intrinsics.checkNotNullExpressionValue(processExec, "");
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i3 = f2760d + 101;
            f2759c = i3 % 128;
            int i4 = i3 % 2;
            while (line != null) {
                int i5 = f2760d + 39;
                f2759c = i5 % 128;
                if (i5 % 2 == 0) {
                    sb.append(bufferedReader.readLine());
                    obj.hashCode();
                    throw null;
                }
                line = bufferedReader.readLine();
                sb.append(line);
            }
            String string = sb.toString();
            speedTestViewModel.getAsAtTimestamp = string;
            return string;
        } catch (IOException e) {
            return e.toString();
        }
    }

    public final void runSpeedTest() {
        int i = 2 % 2;
        DeviceMetrics.INSTANCE.setSpeedTestActive("Active");
        MutableLiveData<Double> mutableLiveData = this.ShareDataUIState;
        Double dValueOf = Double.valueOf(0.0d);
        mutableLiveData.postValue(dValueOf);
        this.copydefault.postValue(dValueOf);
        DeviceMetrics.INSTANCE.setUpload(0.0d);
        DeviceMetrics.INSTANCE.setDownload(0.0d);
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new component3(null), 2, null);
        int i2 = f2759c + 47;
        f2760d = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void runPingTest() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new copydefault(null), 2, null);
        int i2 = f2759c + 55;
        f2760d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
    }

    static {
        f2758b = 1;
        component3();
        int i = invoke + 49;
        f2758b = i % 128;
        int i2 = i % 2;
    }

    private final String getRequestBeneficiariesState() {
        return (String) component2(new Object[]{this}, LottieRelativeFloatValueCallback.component1(), 810424045, LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), -810424045);
    }

    private final String getShareableDataState() {
        return (String) component2(new Object[]{this}, LottieRelativeFloatValueCallback.component1(), -1715039685, LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), LottieRelativeFloatValueCallback.component1(), 1715039686);
    }

    static void component3() {
        coroutineBoundary = (char) 26782;
        coroutineCreation = (char) 40948;
        CoroutineDebuggingKt = (char) 39626;
        getARTIFICIAL_FRAME_PACKAGE_NAME = (char) 1611;
    }
}
