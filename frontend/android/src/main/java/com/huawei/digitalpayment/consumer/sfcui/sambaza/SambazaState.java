package com.huawei.digitalpayment.consumer.sfcui.sambaza;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.resp.Balances;
import com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaOptions;
import com.huawei.digitalpayment.consumer.sfcui.sambaza.model.SambazaResourceStatus;
import com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.FetchSambazaAccount;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u000e\u0012\b\b\u0002\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u000eHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u000eHÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0016HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010`\u001a\u00020\u001aHÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u000eHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\"0\u0005HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010i\u001a\u00020%HÆ\u0003J\t\u0010j\u001a\u00020'HÆ\u0003J\t\u0010k\u001a\u00020\u000eHÆ\u0003J\t\u0010l\u001a\u00020\u000eHÆ\u0003JË\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u000eHÇ\u0001J\u0013\u0010n\u001a\u00020\u000e2\b\u0010o\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010p\u001a\u00020qH×\u0001J\t\u0010r\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010/R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010-R\u0011\u0010\u001c\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010-R\u0011\u0010\u001f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bG\u00106R\u0013\u0010 \u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0013\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010(\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0011\u0010)\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u00106¨\u0006s"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaState;", "", "msisdn", "", "balances", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Balances;", "dataAccountBalances", "", "", "airtimeBalance", "creditLimitBalance", "airtimeNumber", "airtimeNumberHasError", "", "airtimeNumberErrorText", "Lcom/safaricom/consumer/commons/util/TextResource;", "airtimeAmount", "airtimeIsAmountEmpty", "airtimeAmountHasError", "airtimeAmountErrorText", "sambazaOptions", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "selectedSambazaOption", "creditLimitErrorMessage", "sambazaResourceStatus", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/model/SambazaResourceStatus;", "dataPhoneNumber", "dataPhoneNumberHasError", "dataPhoneNumberErrorText", "dataMbAmount", "dataMbAmountHasError", "dataMbAmountErrorText", "sambazaDataTypes", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "selectedDataType", "currentTab", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;", "selectedPaymentType", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "enableButton", "isManualRefresh", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;ZZLcom/safaricom/consumer/commons/util/TextResource;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/model/SambazaResourceStatus;Ljava/lang/String;ZLcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;ZLcom/safaricom/consumer/commons/util/TextResource;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;Lcom/safaricom/designsystem/components/payment/PaymentOption;ZZ)V", "getMsisdn", "()Ljava/lang/String;", "getBalances", "()Ljava/util/List;", "getDataAccountBalances", "()Ljava/util/Map;", "getAirtimeBalance", "getCreditLimitBalance", "getAirtimeNumber", "getAirtimeNumberHasError", "()Z", "getAirtimeNumberErrorText", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getAirtimeAmount", "getAirtimeIsAmountEmpty", "getAirtimeAmountHasError", "getAirtimeAmountErrorText", "getSambazaOptions", "getSelectedSambazaOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "getCreditLimitErrorMessage", "getSambazaResourceStatus", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/model/SambazaResourceStatus;", "getDataPhoneNumber", "getDataPhoneNumberHasError", "getDataPhoneNumberErrorText", "getDataMbAmount", "getDataMbAmountHasError", "getDataMbAmountErrorText", "getSambazaDataTypes", "getSelectedDataType", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "getCurrentTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;", "getSelectedPaymentType", "()Lcom/safaricom/designsystem/components/payment/PaymentOption;", "getEnableButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaState {
    public static final int $stable = 8;
    private static int[] invokeSuspend;
    private static int j;
    private final TextResource ArtificialStackFrames;
    private final boolean CoroutineDebuggingKt;
    private final TextResource ShareDataUIState;

    private final List<SambazaOptions> f2769a;
    private final boolean accessartificialFrame;

    private final String f2770b;

    private final SambazaResourceStatus f2771c;
    private final String component1;
    private final boolean component2;
    private final boolean component3;
    private final List<Balances> component4;
    private final String copy;
    private final String copydefault;
    private final TextResource coroutineBoundary;
    private final boolean coroutineCreation;

    private final List<FetchSambazaAccount> f2772d;
    private final SambazaOptions e;
    private final TextResource equals;
    private final FetchSambazaAccount f;
    private final PaymentOption g;
    private final String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final String getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;
    private final SambazaTabState getShareableDataState;
    private final TextResource getSponsorBeneficiariesState;
    private final String hashCode;
    private final boolean invoke;
    private final Map<String, Double> toString;
    private static final byte[] $$c = {Ascii.VT, -55, -20, -91};
    private static final int $$d = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, -35, 45, 111, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 122;
    private static int hExternalSyntheticLambda0 = 0;
    private static int l = 1;
    private static int h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r7 = 107 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.$$e(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.$$a
            int r5 = r5 * 4
            int r1 = 10 - r5
            int r6 = r6 * 3
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r5 = 9 - r5
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-26)
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.k(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SambazaState(String str, List<Balances> list, Map<String, Double> map, String str2, String str3, String str4, boolean z, TextResource textResource, String str5, boolean z2, boolean z3, TextResource textResource2, List<? extends SambazaOptions> list2, SambazaOptions sambazaOptions, TextResource textResource3, SambazaResourceStatus sambazaResourceStatus, String str6, boolean z4, TextResource textResource4, String str7, boolean z5, TextResource textResource5, List<FetchSambazaAccount> list3, FetchSambazaAccount fetchSambazaAccount, SambazaTabState sambazaTabState, PaymentOption paymentOption, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(sambazaOptions, "");
        Intrinsics.checkNotNullParameter(sambazaResourceStatus, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(sambazaTabState, "");
        Intrinsics.checkNotNullParameter(paymentOption, "");
        this.f2770b = str;
        this.component4 = list;
        this.toString = map;
        this.copydefault = str2;
        this.copy = str3;
        this.getAsAtTimestamp = str4;
        this.getRequestBeneficiariesState = z;
        this.equals = textResource;
        this.component1 = str5;
        this.component3 = z2;
        this.component2 = z3;
        this.ShareDataUIState = textResource2;
        this.f2769a = list2;
        this.e = sambazaOptions;
        this.getSponsorBeneficiariesState = textResource3;
        this.f2771c = sambazaResourceStatus;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = str6;
        this.CoroutineDebuggingKt = z4;
        this.coroutineBoundary = textResource4;
        this.hashCode = str7;
        this.coroutineCreation = z5;
        this.ArtificialStackFrames = textResource5;
        this.f2772d = list3;
        this.f = fetchSambazaAccount;
        this.getShareableDataState = sambazaTabState;
        this.g = paymentOption;
        this.accessartificialFrame = z6;
        this.invoke = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SambazaState(String str, List list, Map map, String str2, String str3, String str4, boolean z, TextResource textResource, String str5, boolean z2, boolean z3, TextResource textResource2, List list2, SambazaOptions sambazaOptions, TextResource textResource3, SambazaResourceStatus sambazaResourceStatus, String str6, boolean z4, TextResource textResource4, String str7, boolean z5, TextResource textResource5, List list3, FetchSambazaAccount fetchSambazaAccount, SambazaTabState sambazaTabState, PaymentOption paymentOption, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Map mapEmptyMap;
        boolean z8;
        String str8;
        List listListOf;
        TextResource textResource6;
        String str9;
        List list4;
        TextResource textResource7;
        TextResource textResource8;
        boolean z9;
        boolean z10;
        FetchSambazaAccount fetchSambazaAccount2;
        TextResource textResource9;
        SambazaTabState sambazaTabState2;
        FetchSambazaAccount fetchSambazaAccount3;
        TextResource textResource10;
        boolean z11;
        PaymentOption.AIRTIME airtime;
        PaymentOption paymentOption2;
        boolean z12;
        String str10 = (i & 1) != 0 ? "" : str;
        List listEmptyList = (i & 2) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 4) != 0) {
            int i2 = l + 119;
            hExternalSyntheticLambda0 = i2 % 128;
            if (i2 % 2 != 0) {
                mapEmptyMap = MapsKt.emptyMap();
                int i3 = 16 / 0;
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
        } else {
            mapEmptyMap = map;
        }
        String str11 = (i & 8) != 0 ? "0.0" : str2;
        String str12 = (i & 16) == 0 ? str3 : "0.0";
        String str13 = (i & 32) != 0 ? "" : str4;
        if ((i & 64) != 0) {
            int i4 = hExternalSyntheticLambda0 + 37;
            l = i4 % 128;
            int i5 = i4 % 2;
            z8 = false;
        } else {
            z8 = z;
        }
        TextResource textResource11 = (i & 128) != 0 ? null : textResource;
        String str14 = (i & 256) != 0 ? "" : str5;
        boolean z13 = (i & 512) != 0 ? true : z2;
        boolean z14 = (i & 1024) != 0 ? false : z3;
        TextResource textResource12 = (i & 2048) != 0 ? null : textResource2;
        if ((i & 4096) != 0) {
            int i6 = l + 27;
            str8 = "";
            hExternalSyntheticLambda0 = i6 % 128;
            int i7 = i6 % 2;
            listListOf = CollectionsKt.listOf((Object[]) new SambazaOptions[]{SambazaOptions.AirtimeBalance.INSTANCE, SambazaOptions.CreditLimit.INSTANCE});
        } else {
            str8 = "";
            listListOf = list2;
        }
        SambazaOptions sambazaOptions2 = (i & 8192) != 0 ? SambazaOptions.AirtimeBalance.INSTANCE : sambazaOptions;
        if ((i & 16384) != 0) {
            int i8 = 2 % 2;
            textResource6 = null;
        } else {
            textResource6 = textResource3;
        }
        SambazaResourceStatus sambazaResourceStatus2 = (i & 32768) != 0 ? new SambazaResourceStatus(0.0d, 0.0d, null, false, false, false, 63, null) : sambazaResourceStatus;
        if ((i & 65536) != 0) {
            int i9 = 2 % 2;
            str9 = str8;
        } else {
            str9 = str6;
        }
        boolean z15 = (i & 131072) != 0 ? false : z4;
        if ((i & 262144) != 0) {
            int i10 = l;
            int i11 = i10 + 103;
            textResource7 = textResource6;
            hExternalSyntheticLambda0 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 17;
            list4 = listListOf;
            hExternalSyntheticLambda0 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            textResource8 = null;
        } else {
            list4 = listListOf;
            textResource7 = textResource6;
            textResource8 = textResource4;
        }
        str8 = (524288 & i) == 0 ? str7 : str8;
        if ((1048576 & i) != 0) {
            int i16 = hExternalSyntheticLambda0 + 63;
            l = i16 % 128;
            int i17 = i16 % 2;
            z9 = false;
        } else {
            z9 = z5;
        }
        if ((2097152 & i) != 0) {
            int i18 = l + 69;
            z10 = z9;
            hExternalSyntheticLambda0 = i18 % 128;
            fetchSambazaAccount2 = null;
            if (i18 % 2 != 0) {
                throw null;
            }
            textResource9 = null;
        } else {
            z10 = z9;
            fetchSambazaAccount2 = null;
            textResource9 = textResource5;
        }
        List accounts = (i & 4194304) != 0 ? SambazaDataStatic.INSTANCE.getAccounts() : list3;
        fetchSambazaAccount2 = (i & 8388608) == 0 ? fetchSambazaAccount : fetchSambazaAccount2;
        if ((i & 16777216) != 0) {
            sambazaTabState2 = SambazaTabState.AIRTIME;
            int i19 = 2 % 2;
        } else {
            sambazaTabState2 = sambazaTabState;
        }
        if ((i & 33554432) != 0) {
            fetchSambazaAccount3 = fetchSambazaAccount2;
            int i20 = l + 73;
            textResource10 = textResource9;
            hExternalSyntheticLambda0 = i20 % 128;
            if (i20 % 2 != 0) {
                airtime = PaymentOption.AIRTIME.INSTANCE;
                z11 = false;
                int i21 = 27 / 0;
            } else {
                z11 = false;
                airtime = PaymentOption.AIRTIME.INSTANCE;
            }
        } else {
            fetchSambazaAccount3 = fetchSambazaAccount2;
            textResource10 = textResource9;
            z11 = false;
            airtime = paymentOption;
        }
        if ((67108864 & i) != 0) {
            int i22 = hExternalSyntheticLambda0 + 69;
            paymentOption2 = airtime;
            int i23 = i22 % 128;
            l = i23;
            int i24 = i22 % 2;
            int i25 = i23 + 109;
            hExternalSyntheticLambda0 = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 2 % 2;
            z12 = z11;
        } else {
            paymentOption2 = airtime;
            z12 = z6;
        }
        this(str10, listEmptyList, mapEmptyMap, str11, str12, str13, z8, textResource11, str14, z13, z14, textResource12, list4, sambazaOptions2, textResource7, sambazaResourceStatus2, str9, z15, textResource8, str8, z10, textResource10, accounts, fetchSambazaAccount3, sambazaTabState2, paymentOption2, z12, (i & 134217728) == 0 ? z7 : z11);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 49;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2770b;
        int i5 = i2 + 69;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Balances> getBalances() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 29;
        int i3 = i2 % 128;
        l = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<Balances> list = this.component4;
        int i4 = i3 + 53;
        hExternalSyntheticLambda0 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final Map<String, Double> getDataAccountBalances() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 65;
        l = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Double> map = this.toString;
        int i5 = i2 + 95;
        l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return map;
    }

    public final String getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 17;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCreditLimitBalance() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 125;
        l = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 39;
        l = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAirtimeNumber() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 107;
        l = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final boolean getAirtimeNumberHasError() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 77;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i3 + 5;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final TextResource getAirtimeNumberErrorText() {
        int i = 2 % 2;
        int i2 = l + 67;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        TextResource textResource = this.equals;
        int i4 = i3 + 21;
        l = i4 % 128;
        if (i4 % 2 != 0) {
            return textResource;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAirtimeAmount() {
        String str;
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 65;
        int i3 = i2 % 128;
        l = i3;
        if (i2 % 2 == 0) {
            str = this.component1;
            int i4 = 23 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 109;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean getAirtimeIsAmountEmpty() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 77;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 25;
        hExternalSyntheticLambda0 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean getAirtimeAmountHasError() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 93;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 107;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final TextResource getAirtimeAmountErrorText() {
        int i = 2 % 2;
        int i2 = l + 47;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        TextResource textResource = this.ShareDataUIState;
        int i5 = i3 + 93;
        l = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    public final List<SambazaOptions> getSambazaOptions() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 19;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        List<SambazaOptions> list = this.f2769a;
        int i5 = i2 + 71;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final SambazaOptions getSelectedSambazaOption() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 109;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return this.e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextResource getCreditLimitErrorMessage() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 41;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        TextResource textResource = this.getSponsorBeneficiariesState;
        int i5 = i3 + 13;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return textResource;
        }
        throw null;
    }

    public final SambazaResourceStatus getSambazaResourceStatus() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 101;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        SambazaResourceStatus sambazaResourceStatus = this.f2771c;
        int i5 = i2 + 109;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return sambazaResourceStatus;
    }

    public final String getDataPhoneNumber() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 75;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getDataPhoneNumberHasError() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 53;
        l = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.CoroutineDebuggingKt;
        int i5 = i2 + 13;
        l = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TextResource getDataPhoneNumberErrorText() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 17;
        l = i3 % 128;
        int i4 = i3 % 2;
        TextResource textResource = this.coroutineBoundary;
        int i5 = i2 + 29;
        l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return textResource;
    }

    public final String getDataMbAmount() {
        String str;
        int i = 2 % 2;
        int i2 = l + 53;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        if (i2 % 2 != 0) {
            str = this.hashCode;
            int i4 = 99 / 0;
        } else {
            str = this.hashCode;
        }
        int i5 = i3 + 113;
        l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getDataMbAmountHasError() {
        boolean z;
        int i = 2 % 2;
        int i2 = l + 19;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        if (i2 % 2 != 0) {
            z = this.coroutineCreation;
            int i4 = 89 / 0;
        } else {
            z = this.coroutineCreation;
        }
        int i5 = i3 + 11;
        l = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TextResource getDataMbAmountErrorText() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 87;
        l = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        TextResource textResource = this.ArtificialStackFrames;
        int i4 = i2 + 25;
        l = i4 % 128;
        int i5 = i4 % 2;
        return textResource;
    }

    public final List<FetchSambazaAccount> getSambazaDataTypes() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 87;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        List<FetchSambazaAccount> list = this.f2772d;
        int i5 = i3 + 29;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FetchSambazaAccount getSelectedDataType() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 65;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        FetchSambazaAccount fetchSambazaAccount = this.f;
        int i5 = i2 + 85;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return fetchSambazaAccount;
    }

    public final SambazaTabState getCurrentTab() {
        int i = 2 % 2;
        int i2 = l + 47;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SambazaTabState sambazaTabState = this.getShareableDataState;
        int i4 = i3 + 109;
        l = i4 % 128;
        if (i4 % 2 != 0) {
            return sambazaTabState;
        }
        throw null;
    }

    public final PaymentOption getSelectedPaymentType() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 87;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        PaymentOption paymentOption = this.g;
        int i5 = i2 + 41;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return paymentOption;
    }

    public final boolean getEnableButton() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 77;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.accessartificialFrame;
        int i4 = i2 + 89;
        hExternalSyntheticLambda0 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isManualRefresh() {
        int i = 2 % 2;
        int i2 = l + 83;
        hExternalSyntheticLambda0 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.invoke;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return z;
    }

    private static void i(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = invokeSuspend;
        long j2 = 0;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 4390, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), -309236339, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 4391, 37 - TextUtils.indexOf("", "", 0, 0), (char) Color.green(0), -309236339, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                }
                i7++;
                i2 = 2;
                j2 = 0;
                i4 = 684241640;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = invokeSuspend;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                int i10 = $11 + 63;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = new Object[i5];
                objArr4[i6] = Integer.valueOf(iArr5[i9]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) i6;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4390, 37 - (Process.myTid() >> 22), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -309236339, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i9++;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i6;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        getactivenotifications.component1 = i12;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i12] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i13];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getScrollBarSize() >> 8), Color.blue(0) + 16, (char) (49871 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 462826032, false, $$e(b8, b9, (byte) (b9 + 4)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i15 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i15;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i16 = getactivenotifications.ShareDataUIState;
            int i17 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 - 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - Color.blue(0), KeyEvent.getDeadChar(0, 0) + 24, (char) (27638 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1616366948, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final Map<String, Double> component3() throws Throwable {
        long j2;
        long j3;
        int i = 2 % 2;
        int i2 = l + 57;
        hExternalSyntheticLambda0 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 34, (char) ((-16757520) - Color.rgb(0, 0, 0)), 520092524, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        i(Color.rgb(0, 0, 0) + 16777238, new int[]{563439093, 872168182, 1158906718, -440347752, -646960131, -1971491430, -2101831845, -1563123631, -249996251, -1111893295, 1358237869, -842667623}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        i(14 - TextUtils.lastIndexOf("", '0'), new int[]{-171042833, -891905988, 1744304419, 611298122, 148223147, -1326314020, -1465550682, 774148087}, objArr2);
        long j4 = -397;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j5 = -1;
        long j6 = j5 ^ 4201750975408513785L;
        int i5 = i4;
        long jIdentityHashCode = System.identityHashCode(this);
        long j7 = jIdentityHashCode ^ j5;
        long j8 = (j6 | j7) ^ j5;
        long j9 = (j6 | 253972121197996540L) ^ j5;
        long j10 = (((long) 398) * 4201750975408513785L) + (((long) (-396)) * 253972121197996540L) + ((j8 | j9 | ((j7 | 253972121197996540L) ^ j5)) * j4) + (j4 * j9) + (((long) 397) * (jIdentityHashCode | j9 | (j5 ^ ((j5 ^ 253972121197996540L) | 4201750975408513785L))));
        int i6 = 0;
        while (true) {
            if (i6 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 846241313, false, "copydefault", null);
                }
                int i7 = ((Field) objCopydefault2).getInt(null);
                int i8 = 0;
                long j11 = jLongValue;
                while (true) {
                    int i9 = 0;
                    while (i9 != 8) {
                        int i10 = l + 63;
                        hExternalSyntheticLambda0 = i10 % 128;
                        if (i10 % 2 != 0) {
                            j3 = j10;
                            i7 += ((((int) (j11 << i9)) & 15419) % i7) * (i7 >>> 117);
                            i9 += 79;
                        } else {
                            j3 = j10;
                            i7 = (((((int) (j11 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                            i9++;
                        }
                        j10 = j3;
                    }
                    j2 = j10;
                    if (i8 != 0) {
                        break;
                    }
                    int i11 = l + 21;
                    hExternalSyntheticLambda0 = i11 % 128;
                    i8 = i11 % 2 != 0 ? i8 + 117 : i8 + 1;
                    j11 = j2;
                    j10 = j11;
                }
                int i12 = i5;
                if (i7 == i12) {
                    break;
                }
                int i13 = hExternalSyntheticLambda0 + 119;
                l = i13 % 128;
                if (i13 % 2 == 0) {
                    jLongValue -= 1024;
                    i6 += 42;
                } else {
                    jLongValue -= 1024;
                    i6++;
                }
                i5 = i12;
                j10 = j2;
            } else {
                Object[] objArr3 = new Object[1];
                i(16 - View.getDefaultSize(0, 0), new int[]{1682076069, -633955042, -263286775, 1245592854, 87073339, 1732540449, -2113713454, -187812319}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                i((-16777200) - Color.rgb(0, 0, 0), new int[]{-897374799, -1628817025, -1630807670, -1371026537, 261397318, -1220317236, -1863540824, 983120672}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1635736047};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 1663, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.getDeadChar(0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1054745724, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int i14 = 1454 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i15 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 21;
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        k(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i14, i15, c2, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1592 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 39 - View.resolveSize(0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i16 = ((int[]) objArr8[2])[0];
                    int i17 = ((int[]) objArr8[1])[0];
                    if (i17 != i16) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j12 = -1;
                        long j13 = 0;
                        long j14 = (((long) (i17 ^ i16)) & ((j12 - ((j12 >> 63) << 32)) | (((long) 0) << 32))) | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
                        try {
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault5 == null) {
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (char) Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                            Object[] objArr9 = {1635736047, Long.valueOf(j14), arrayList, null, false, false};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6561, 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                            throw new RuntimeException(String.valueOf(i17));
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return this.toString;
    }

    static {
        j = 1;
        copydefault();
        int i = h + 49;
        j = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public SambazaState() {
        this(null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, false, false, 268435455, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SambazaState copy$default(SambazaState sambazaState, String str, List list, Map map, String str2, String str3, String str4, boolean z, TextResource textResource, String str5, boolean z2, boolean z3, TextResource textResource2, List list2, SambazaOptions sambazaOptions, TextResource textResource3, SambazaResourceStatus sambazaResourceStatus, String str6, boolean z4, TextResource textResource4, String str7, boolean z5, TextResource textResource5, List list3, FetchSambazaAccount fetchSambazaAccount, SambazaTabState sambazaTabState, PaymentOption paymentOption, boolean z6, boolean z7, int i, Object obj) {
        String str8;
        String str9;
        boolean z8;
        List list4;
        TextResource textResource6;
        TextResource textResource7;
        SambazaResourceStatus sambazaResourceStatus2;
        SambazaResourceStatus sambazaResourceStatus3;
        List list5;
        FetchSambazaAccount fetchSambazaAccount2;
        FetchSambazaAccount fetchSambazaAccount3;
        SambazaTabState sambazaTabState2;
        PaymentOption paymentOption2;
        PaymentOption paymentOption3;
        boolean z9;
        boolean z10;
        int i2 = 2 % 2;
        int i3 = l + 119;
        int i4 = i3 % 128;
        hExternalSyntheticLambda0 = i4;
        int i5 = i3 % 2;
        String str10 = (i & 1) != 0 ? sambazaState.f2770b : str;
        List list6 = (i & 2) != 0 ? sambazaState.component4 : list;
        Map map2 = (i & 4) != 0 ? sambazaState.toString : map;
        String str11 = (i & 8) != 0 ? sambazaState.copydefault : str2;
        if ((i & 16) != 0) {
            int i6 = i4 + 65;
            l = i6 % 128;
            if (i6 % 2 == 0) {
                str8 = sambazaState.copy;
                int i7 = 52 / 0;
            } else {
                str8 = sambazaState.copy;
            }
        } else {
            str8 = str3;
        }
        if ((i & 32) != 0) {
            int i8 = l + 121;
            hExternalSyntheticLambda0 = i8 % 128;
            int i9 = i8 % 2;
            str9 = sambazaState.getAsAtTimestamp;
        } else {
            str9 = str4;
        }
        if ((i & 64) != 0) {
            int i10 = l + 23;
            hExternalSyntheticLambda0 = i10 % 128;
            int i11 = i10 % 2;
            z8 = sambazaState.getRequestBeneficiariesState;
        } else {
            z8 = z;
        }
        TextResource textResource8 = (i & 128) != 0 ? sambazaState.equals : textResource;
        String str12 = (i & 256) != 0 ? sambazaState.component1 : str5;
        boolean z11 = (i & 512) != 0 ? sambazaState.component3 : z2;
        boolean z12 = (i & 1024) != 0 ? sambazaState.component2 : z3;
        TextResource textResource9 = (i & 2048) != 0 ? sambazaState.ShareDataUIState : textResource2;
        List list7 = (i & 4096) != 0 ? sambazaState.f2769a : list2;
        SambazaOptions sambazaOptions2 = (i & 8192) != 0 ? sambazaState.e : sambazaOptions;
        if ((i & 16384) != 0) {
            int i12 = hExternalSyntheticLambda0 + 103;
            list4 = list7;
            l = i12 % 128;
            int i13 = i12 % 2;
            textResource6 = sambazaState.getSponsorBeneficiariesState;
        } else {
            list4 = list7;
            textResource6 = textResource3;
        }
        if ((32768 & i) != 0) {
            int i14 = hExternalSyntheticLambda0 + 115;
            textResource7 = textResource6;
            l = i14 % 128;
            int i15 = i14 % 2;
            sambazaResourceStatus2 = sambazaState.f2771c;
            if (i15 == 0) {
                int i16 = 33 / 0;
            }
        } else {
            textResource7 = textResource6;
            sambazaResourceStatus2 = sambazaResourceStatus;
        }
        String str13 = (65536 & i) != 0 ? sambazaState.getARTIFICIAL_FRAME_PACKAGE_NAME : str6;
        boolean z13 = (i & 131072) != 0 ? sambazaState.CoroutineDebuggingKt : z4;
        TextResource textResource10 = (i & 262144) != 0 ? sambazaState.coroutineBoundary : textResource4;
        String str14 = (i & 524288) != 0 ? sambazaState.hashCode : str7;
        boolean z14 = (i & 1048576) != 0 ? sambazaState.coroutineCreation : z5;
        TextResource textResource11 = (i & 2097152) != 0 ? sambazaState.ArtificialStackFrames : textResource5;
        List list8 = (i & 4194304) != 0 ? sambazaState.f2772d : list3;
        if ((i & 8388608) != 0) {
            list5 = list8;
            int i17 = l + 107;
            sambazaResourceStatus3 = sambazaResourceStatus2;
            hExternalSyntheticLambda0 = i17 % 128;
            if (i17 % 2 != 0) {
                FetchSambazaAccount fetchSambazaAccount4 = sambazaState.f;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            fetchSambazaAccount2 = sambazaState.f;
        } else {
            sambazaResourceStatus3 = sambazaResourceStatus2;
            list5 = list8;
            fetchSambazaAccount2 = fetchSambazaAccount;
        }
        SambazaTabState sambazaTabState3 = (16777216 & i) != 0 ? sambazaState.getShareableDataState : sambazaTabState;
        if ((i & 33554432) != 0) {
            sambazaTabState2 = sambazaTabState3;
            PaymentOption paymentOption4 = sambazaState.g;
            int i18 = hExternalSyntheticLambda0 + 41;
            fetchSambazaAccount3 = fetchSambazaAccount2;
            l = i18 % 128;
            int i19 = i18 % 2;
            paymentOption2 = paymentOption4;
        } else {
            fetchSambazaAccount3 = fetchSambazaAccount2;
            sambazaTabState2 = sambazaTabState3;
            paymentOption2 = paymentOption;
        }
        if ((67108864 & i) != 0) {
            boolean z15 = sambazaState.accessartificialFrame;
            int i20 = l + 109;
            paymentOption3 = paymentOption2;
            hExternalSyntheticLambda0 = i20 % 128;
            int i21 = i20 % 2;
            z9 = z15;
        } else {
            paymentOption3 = paymentOption2;
            z9 = z6;
        }
        if ((i & 134217728) != 0) {
            int i22 = l + 95;
            hExternalSyntheticLambda0 = i22 % 128;
            int i23 = i22 % 2;
            z10 = sambazaState.invoke;
        } else {
            z10 = z7;
        }
        return sambazaState.copy(str10, list6, map2, str11, str8, str9, z8, textResource8, str12, z11, z12, textResource9, list4, sambazaOptions2, textResource7, sambazaResourceStatus3, str13, z13, textResource10, str14, z14, textResource11, list5, fetchSambazaAccount3, sambazaTabState2, paymentOption3, z9, z10);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 53;
        int i3 = i2 % 128;
        l = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f2770b;
        int i4 = i3 + 25;
        hExternalSyntheticLambda0 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 95;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 73;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 61;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TextResource component12() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 29;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextResource textResource = this.ShareDataUIState;
        int i4 = i2 + 63;
        hExternalSyntheticLambda0 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return textResource;
    }

    public final List<SambazaOptions> component13() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 85;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        List<SambazaOptions> list = this.f2769a;
        int i5 = i2 + 13;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final SambazaOptions component14() {
        int i = 2 % 2;
        int i2 = l + 15;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        SambazaOptions sambazaOptions = this.e;
        int i5 = i3 + 61;
        l = i5 % 128;
        if (i5 % 2 != 0) {
            return sambazaOptions;
        }
        throw null;
    }

    public final TextResource component15() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 1;
        int i3 = i2 % 128;
        l = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextResource textResource = this.getSponsorBeneficiariesState;
        int i4 = i3 + 109;
        hExternalSyntheticLambda0 = i4 % 128;
        int i5 = i4 % 2;
        return textResource;
    }

    public final SambazaResourceStatus component16() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 105;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2771c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 89;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i4 = i2 + 95;
        hExternalSyntheticLambda0 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    public final boolean component18() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 123;
        l = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.CoroutineDebuggingKt;
        int i5 = i2 + 11;
        l = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final TextResource component19() {
        int i = 2 % 2;
        int i2 = l + 81;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        TextResource textResource = this.coroutineBoundary;
        int i5 = i3 + 19;
        l = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    public final List<Balances> component2() {
        int i = 2 % 2;
        int i2 = l + 81;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        List<Balances> list = this.component4;
        int i5 = i3 + 43;
        l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return list;
    }

    public final String component20() {
        String str;
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 79;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.hashCode;
            int i4 = 91 / 0;
        } else {
            str = this.hashCode;
        }
        int i5 = i2 + 13;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component21() {
        int i = 2 % 2;
        int i2 = l + 13;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        boolean z = this.coroutineCreation;
        int i5 = i3 + 15;
        l = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final TextResource component22() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 115;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        TextResource textResource = this.ArtificialStackFrames;
        int i5 = i2 + 111;
        hExternalSyntheticLambda0 = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    public final List<FetchSambazaAccount> component23() {
        int i = 2 % 2;
        int i2 = l + 77;
        int i3 = i2 % 128;
        hExternalSyntheticLambda0 = i3;
        int i4 = i2 % 2;
        List<FetchSambazaAccount> list = this.f2772d;
        int i5 = i3 + 19;
        l = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final FetchSambazaAccount component24() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 1;
        l = i3 % 128;
        int i4 = i3 % 2;
        FetchSambazaAccount fetchSambazaAccount = this.f;
        int i5 = i2 + 27;
        l = i5 % 128;
        if (i5 % 2 != 0) {
            return fetchSambazaAccount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SambazaTabState component25() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 33;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        SambazaTabState sambazaTabState = this.getShareableDataState;
        int i5 = i2 + 35;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return sambazaTabState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PaymentOption component26() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 57;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        PaymentOption paymentOption = this.g;
        int i5 = i3 + 55;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return paymentOption;
    }

    public final boolean component27() {
        int i = 2 % 2;
        int i2 = l + 15;
        hExternalSyntheticLambda0 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accessartificialFrame;
        }
        throw null;
    }

    public final boolean component28() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 75;
        l = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.invoke;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return z;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 71;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 101;
        hExternalSyntheticLambda0 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 79;
        l = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copy;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = l;
        int i3 = i2 + 11;
        hExternalSyntheticLambda0 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getAsAtTimestamp;
            int i4 = 66 / 0;
        } else {
            str = this.getAsAtTimestamp;
        }
        int i5 = i2 + 33;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0 + 95;
        int i3 = i2 % 128;
        l = i3;
        int i4 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i3 + 27;
        hExternalSyntheticLambda0 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextResource component8() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 35;
        l = i3 % 128;
        int i4 = i3 % 2;
        TextResource textResource = this.equals;
        int i5 = i2 + 81;
        l = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = hExternalSyntheticLambda0;
        int i3 = i2 + 123;
        l = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 83;
        l = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public final SambazaState copy(String msisdn, List<Balances> balances, Map<String, Double> dataAccountBalances, String airtimeBalance, String creditLimitBalance, String airtimeNumber, boolean airtimeNumberHasError, TextResource airtimeNumberErrorText, String airtimeAmount, boolean airtimeIsAmountEmpty, boolean airtimeAmountHasError, TextResource airtimeAmountErrorText, List<? extends SambazaOptions> sambazaOptions, SambazaOptions selectedSambazaOption, TextResource creditLimitErrorMessage, SambazaResourceStatus sambazaResourceStatus, String dataPhoneNumber, boolean dataPhoneNumberHasError, TextResource dataPhoneNumberErrorText, String dataMbAmount, boolean dataMbAmountHasError, TextResource dataMbAmountErrorText, List<FetchSambazaAccount> sambazaDataTypes, FetchSambazaAccount selectedDataType, SambazaTabState currentTab, PaymentOption selectedPaymentType, boolean enableButton, boolean isManualRefresh) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(balances, "");
        Intrinsics.checkNotNullParameter(dataAccountBalances, "");
        Intrinsics.checkNotNullParameter(airtimeBalance, "");
        Intrinsics.checkNotNullParameter(creditLimitBalance, "");
        Intrinsics.checkNotNullParameter(airtimeNumber, "");
        Intrinsics.checkNotNullParameter(airtimeAmount, "");
        Intrinsics.checkNotNullParameter(sambazaOptions, "");
        Intrinsics.checkNotNullParameter(selectedSambazaOption, "");
        Intrinsics.checkNotNullParameter(sambazaResourceStatus, "");
        Intrinsics.checkNotNullParameter(dataPhoneNumber, "");
        Intrinsics.checkNotNullParameter(dataMbAmount, "");
        Intrinsics.checkNotNullParameter(sambazaDataTypes, "");
        Intrinsics.checkNotNullParameter(currentTab, "");
        Intrinsics.checkNotNullParameter(selectedPaymentType, "");
        SambazaState sambazaState = new SambazaState(msisdn, balances, dataAccountBalances, airtimeBalance, creditLimitBalance, airtimeNumber, airtimeNumberHasError, airtimeNumberErrorText, airtimeAmount, airtimeIsAmountEmpty, airtimeAmountHasError, airtimeAmountErrorText, sambazaOptions, selectedSambazaOption, creditLimitErrorMessage, sambazaResourceStatus, dataPhoneNumber, dataPhoneNumberHasError, dataPhoneNumberErrorText, dataMbAmount, dataMbAmountHasError, dataMbAmountErrorText, sambazaDataTypes, selectedDataType, currentTab, selectedPaymentType, enableButton, isManualRefresh);
        int i2 = l + 17;
        hExternalSyntheticLambda0 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 36 / 0;
        }
        return sambazaState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0173, code lost:
    
        if (r5.accessartificialFrame == r6.accessartificialFrame) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0175, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x017a, code lost:
    
        if (r5.invoke == r6.invoke) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 103;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2770b, r6.f2770b) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component4, r6.component4) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.toString, r6.toString) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copy, r6.copy) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 + 121;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getAsAtTimestamp, r6.getAsAtTimestamp) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r5.getRequestBeneficiariesState == r6.getRequestBeneficiariesState) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.equals, r6.equals) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        if (r5.component3 == r6.component3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009d, code lost:
    
        if (r5.component2 == r6.component2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 + 19;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2769a, r6.f2769a) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.e, r6.e) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getSponsorBeneficiariesState, r6.getSponsorBeneficiariesState) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2771c, r6.f2771c) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 + 33;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getARTIFICIAL_FRAME_PACKAGE_NAME, r6.getARTIFICIAL_FRAME_PACKAGE_NAME) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        if (r5.CoroutineDebuggingKt == r6.CoroutineDebuggingKt) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.coroutineBoundary, r6.coroutineBoundary) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.hashCode, r6.hashCode) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l;
        r1 = r6 + 15;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 37;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (r5.coroutineCreation == r6.coroutineCreation) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ArtificialStackFrames, r6.ArtificialStackFrames) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0131, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 + 7;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
    
        if ((r6 % 2) != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2772d, r6.f2772d) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0151, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f, r6.f) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
    
        if (r5.getShareableDataState == r6.getShareableDataState) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.hExternalSyntheticLambda0 + 13;
        com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.l = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.g, r6.g) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = l + 53;
        hExternalSyntheticLambda0 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode3 = this.f2770b.hashCode();
        int iHashCode4 = this.component4.hashCode();
        int iHashCode5 = this.toString.hashCode();
        int iHashCode6 = this.copydefault.hashCode();
        int iHashCode7 = this.copy.hashCode();
        int iHashCode8 = this.getAsAtTimestamp.hashCode();
        int iHashCode9 = Boolean.hashCode(this.getRequestBeneficiariesState);
        TextResource textResource = this.equals;
        if (textResource == null) {
            iHashCode = 0;
        } else {
            iHashCode = textResource.hashCode();
            int i5 = l + 9;
            hExternalSyntheticLambda0 = i5 % 128;
            int i6 = i5 % 2;
        }
        int iHashCode10 = this.component1.hashCode();
        int iHashCode11 = Boolean.hashCode(this.component3);
        int iHashCode12 = Boolean.hashCode(this.component2);
        TextResource textResource2 = this.ShareDataUIState;
        int iHashCode13 = textResource2 == null ? 0 : textResource2.hashCode();
        int iHashCode14 = this.f2769a.hashCode();
        int iHashCode15 = this.e.hashCode();
        TextResource textResource3 = this.getSponsorBeneficiariesState;
        int iHashCode16 = textResource3 == null ? 0 : textResource3.hashCode();
        int iHashCode17 = this.f2771c.hashCode();
        int iHashCode18 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.hashCode();
        int iHashCode19 = Boolean.hashCode(this.CoroutineDebuggingKt);
        TextResource textResource4 = this.coroutineBoundary;
        int iHashCode20 = textResource4 == null ? 0 : textResource4.hashCode();
        int iHashCode21 = this.hashCode.hashCode();
        int iHashCode22 = Boolean.hashCode(this.coroutineCreation);
        TextResource textResource5 = this.ArtificialStackFrames;
        if (textResource5 == null) {
            int i7 = hExternalSyntheticLambda0 + 81;
            i = iHashCode15;
            l = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            i = iHashCode15;
            iHashCode2 = textResource5.hashCode();
        }
        int iHashCode23 = this.f2772d.hashCode();
        FetchSambazaAccount fetchSambazaAccount = this.f;
        int iHashCode24 = (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode2) * 31) + iHashCode23) * 31) + (fetchSambazaAccount == null ? 0 : fetchSambazaAccount.hashCode())) * 31) + this.getShareableDataState.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.accessartificialFrame)) * 31) + Boolean.hashCode(this.invoke);
        int i9 = l + 49;
        hExternalSyntheticLambda0 = i9 % 128;
        if (i9 % 2 == 0) {
            return iHashCode24;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaState(msisdn=" + this.f2770b + ", balances=" + this.component4 + ", dataAccountBalances=" + this.toString + ", airtimeBalance=" + this.copydefault + ", creditLimitBalance=" + this.copy + ", airtimeNumber=" + this.getAsAtTimestamp + ", airtimeNumberHasError=" + this.getRequestBeneficiariesState + ", airtimeNumberErrorText=" + this.equals + ", airtimeAmount=" + this.component1 + ", airtimeIsAmountEmpty=" + this.component3 + ", airtimeAmountHasError=" + this.component2 + ", airtimeAmountErrorText=" + this.ShareDataUIState + ", sambazaOptions=" + this.f2769a + ", selectedSambazaOption=" + this.e + ", creditLimitErrorMessage=" + this.getSponsorBeneficiariesState + ", sambazaResourceStatus=" + this.f2771c + ", dataPhoneNumber=" + this.getARTIFICIAL_FRAME_PACKAGE_NAME + ", dataPhoneNumberHasError=" + this.CoroutineDebuggingKt + ", dataPhoneNumberErrorText=" + this.coroutineBoundary + ", dataMbAmount=" + this.hashCode + ", dataMbAmountHasError=" + this.coroutineCreation + ", dataMbAmountErrorText=" + this.ArtificialStackFrames + ", sambazaDataTypes=" + this.f2772d + ", selectedDataType=" + this.f + ", currentTab=" + this.getShareableDataState + ", selectedPaymentType=" + this.g + ", enableButton=" + this.accessartificialFrame + ", isManualRefresh=" + this.invoke + ")";
        int i2 = hExternalSyntheticLambda0 + 37;
        l = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        invokeSuspend = new int[]{-889592286, -1778331446, 1756233488, 1154812562, -1337449227, 1174769341, 876520404, -1906050910, 486653502, 1956602615, 1731877311, 1931879699, -1036525078, 1859357554, 1666592408, -2121490815, 1573878127, -220422399};
    }
}
