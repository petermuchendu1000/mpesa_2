package com.safaricom.aipay.scantopay.sdk.core.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0012HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019¨\u0006>"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails;", "", "transactionType", "Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "amount", "", "tillNumber", "paybillNumber", "accountNumber", "agentNumber", "merchantName", "recipientName", KeysConstants.KEY_STORE_NUMBER, "businessNumber", "mobileNumber", "<init>", "(Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTransactionType", "()Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "getAmount", "()Ljava/lang/String;", "getTillNumber", "getPaybillNumber", "getAccountNumber", "getAgentNumber", "getMerchantName", "getRecipientName", "getStoreNumber", "getBusinessNumber", "getMobileNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$scan_to_pay_core_release", "$serializer", "Companion", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class PaymentDetails {
    private static final KSerializer<Object>[] $childSerializers;

    public static final Companion INSTANCE;
    private static long ShareDataUIState;
    private static int component1;
    private final String accountNumber;
    private final String agentNumber;
    private final String amount;
    private final String businessNumber;
    private final String merchantName;
    private final String mobileNumber;
    private final String paybillNumber;
    private final String recipientName;
    private final String storeNumber;
    private final String tillNumber;
    private final TransactionType transactionType;
    private static final byte[] $$c = {115, 102, 60, 8};
    private static final int $$f = 125;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {19, TarHeader.LF_SYMLINK, -9, 119, 67, -69, 7, Ascii.SO, 5, -17, 17, Ascii.NAK, -17, -12, 6, -4, 5, 17, 0, -12, TarHeader.LF_SYMLINK, -42, 3, 10, -1, 4, -12, 5, 19, -17, 13, -4, 3, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 68};
    private static final int $$e = 131;
    private static final byte[] $$a = {89, 120, -98, -110, -2, Ascii.SI, -51, TarHeader.LF_SYMLINK, -50, TarHeader.LF_CHR, -32, Ascii.NAK, 4, -8, Ascii.SO, 1, -19, Ascii.FF, 3, -2, Ascii.SI, -34, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -50, 35, 9, -9, 1, 3, -6, 6, -8, 17, -9, -4, Ascii.SO, -32, 33, -19, 19, -15, Ascii.FF, 1, 9};
    private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static int component3 = 0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails;", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<PaymentDetails> serializer() {
            return PaymentDetails$$serializer.INSTANCE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.$$c
            int r6 = r6 * 3
            int r6 = 105 - r6
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.$$g(byte, int, byte):java.lang.String");
    }

    static {
        component1 = 1;
        ShareDataUIState();
        INSTANCE = new Companion(null);
        $childSerializers = new KSerializer[]{TransactionType.INSTANCE.serializer(), null, null, null, null, null, null, null, null, null, null};
        int i = component3 + 73;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    public PaymentDetails(int i, TransactionType transactionType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PaymentDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.transactionType = transactionType;
        this.amount = str;
        if ((i & 4) == 0) {
            this.tillNumber = null;
        } else {
            this.tillNumber = str2;
            int i2 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.paybillNumber = null;
            int i3 = 2 % 2;
        } else {
            this.paybillNumber = str3;
        }
        if ((i & 16) == 0) {
            this.accountNumber = null;
        } else {
            this.accountNumber = str4;
        }
        if ((i & 32) == 0) {
            this.agentNumber = null;
        } else {
            this.agentNumber = str5;
        }
        if ((i & 64) == 0) {
            this.merchantName = null;
        } else {
            this.merchantName = str6;
        }
        if ((i & 128) == 0) {
            this.recipientName = null;
            int i4 = copydefault + 111;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            this.recipientName = str7;
        }
        if ((i & 256) == 0) {
            int i7 = component2;
            int i8 = i7 + 23;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            this.storeNumber = null;
            int i10 = i7 + 25;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            this.storeNumber = str8;
        }
        if ((i & 512) == 0) {
            int i13 = component2 + 109;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            this.businessNumber = null;
        } else {
            this.businessNumber = str9;
        }
        if ((i & 1024) != 0) {
            this.mobileNumber = str10;
        } else {
            this.mobileNumber = null;
            int i15 = 2 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.$$a
            int r7 = r7 * 12
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 99
            int r8 = r8 * 3
            int r8 = 45 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r7
            r5 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2b:
            int r6 = r6 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static final KSerializer[] access$get$childSerializers$cp() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return kSerializerArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 20
            int r0 = 30 - r8
            int r7 = r7 * 12
            int r7 = 111 - r7
            byte[] r1 = com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.$$d
            byte[] r0 = new byte[r0]
            int r8 = 29 - r8
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
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r7 = r7 + 1
            r3 = r1[r7]
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$scan_to_pay_core_release(com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails r5, kotlinx.serialization.encoding.CompositeEncoder r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails.write$Self$scan_to_pay_core_release(com.safaricom.aipay.scantopay.sdk.core.data.PaymentDetails, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountNumber;
        }
        throw null;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.agentNumber;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $10 + 33;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            int i6 = notifyVar.copydefault;
            char c2 = cArr[notifyVar.copydefault];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i2] = notifyVar;
                objArr2[1] = notifyVar;
                objArr2[0] = Integer.valueOf(c2);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int iIndexOf = 3265 - TextUtils.indexOf((CharSequence) "", '0');
                    int i7 = 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char cKeyCodeFromString = (char) (60268 - KeyEvent.keyCodeFromString(""));
                    byte b2 = (byte) ($$f & 3);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i7, cKeyCodeFromString, -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - Color.alpha(0), 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-16716843) - Color.rgb(0, 0, 0)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $11 + 81;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 687, KeyEvent.normalizeMetaState(0) + 34, (char) (View.MeasureSpec.getMode(0) + 60373), -1969106284, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final String getAmount() throws Throwable {
        Object[] objArr;
        int i;
        PaymentDetails paymentDetails;
        int i2 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
        if (objCopydefault == null) {
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1116;
            int maximumDrawingCacheSize = 22 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            char cRed = (char) Color.red(0);
            byte b2 = $$a[15];
            Object[] objArr2 = new Object[1];
            a(b2, b2, r2[14], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, maximumDrawingCacheSize, cRed, -1308762862, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(View.combineMeasuredStates(0, 0) + 1949, new char[]{2106, 4008, 1797, 7934, 5696, 11811, 9617, 15678, 13532, 19629, 17495, 23479, 21374, 27345, 25273, 31245, 29158, 35189, 33085, 39059, 36988, 38865}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(52249 - Gravity.getAbsoluteGravity(0, 0), new char[]{2110, 50222, 36872, 27744, 14412, 62531, 49321, 40102, 26870, 9435, 61645, 52540, 39198, 21875, 8544}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
        if (objCopydefault2 == null) {
            Object[] objArr5 = new Object[1];
            a(r14[15], (byte) (-$$a[4]), r14[30], objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1116 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 22 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -206681338, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
            if (objCopydefault3 == null) {
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1116;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                byte b3 = (byte) ($$a[15] - 1);
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, keyRepeatDelay, cNormalizeMetaState, 44744436, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyTid = Process.myTid();
            int i3 = ~iMyTid;
            int i4 = (-1001645313) + (((~(i3 | 933014948)) | (~(739817460 | i3)) | (-1067237365)) * 464) + (((-327419905) | iMyTid) * (-464)) + (((~(iMyTid | 933014948)) | (-1067237365)) * 464) + 1476499471;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(43499 - KeyEvent.getDeadChar(0, 0), new char[]{2097, 41425, 23547, 62971, 45017, 22944, 62392, 44376, 18276, 61750, 43814, 17723, 65324, 43200, 17124, 64755}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(25741 - Gravity.getAbsoluteGravity(0, 0), new char[]{2098, 27826, 49444, 9618, 39451, 65267, 21345, 47097, 11387, 32975, 58794, 23100, 48772, 4893, 30601, 60541}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1476499471};
                byte[] bArr = $$d;
                byte b5 = bArr[24];
                byte b6 = bArr[18];
                Object[] objArr11 = new Object[1];
                c(b5, b6, b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = (byte) (-bArr[24]);
                Object[] objArr12 = new Object[1];
                c((byte) 28, b7, b7, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                if (objCopydefault4 == null) {
                    int iIndexOf = 1115 - TextUtils.indexOf("", "");
                    int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    byte b8 = (byte) ($$a[15] - 1);
                    byte b9 = b8;
                    Object[] objArr14 = new Object[1];
                    a(b8, b9, b9, objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i7, offsetBefore, 44744436, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    b(1948 - ImageFormat.getBitsPerPixel(0), new char[]{2106, 4008, 1797, 7934, 5696, 11811, 9617, 15678, 13532, 19629, 17495, 23479, 21374, 27345, 25273, 31245, 29158, 35189, 33085, 39059, 36988, 38865}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b(52249 - View.combineMeasuredStates(0, 0), new char[]{2110, 50222, 36872, 27744, 14412, 62531, 49321, 40102, 26870, 9435, 61645, 52540, 39198, 21875, 8544}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                    if (objCopydefault5 == null) {
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1116;
                        int i8 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Object[] objArr17 = new Object[1];
                        a(r14[15], (byte) (-$$a[4]), r14[30], objArr17);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, i8, keyRepeatDelay2, -206681338, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                    if (objCopydefault6 == null) {
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 1116;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22;
                        char cMyPid = (char) (Process.myPid() >> 22);
                        byte b10 = $$a[15];
                        Object[] objArr18 = new Object[1];
                        a(b10, b10, r10[14], objArr18);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf3, scrollDefaultDelay, cMyPid, -1308762862, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            int i11 = copydefault + 43;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i14 = i13 + (((((~((-91924704) | r2)) | (~((-101272785) | iFreeMemory))) | (~(r2 | 101272784))) * 959) - 244648386) + (((~(iFreeMemory | 101272784)) | (~((~iFreeMemory) | (-101272785))) | (~((-91924704) | iFreeMemory))) * 959);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr19[0])[0] = i16 ^ (i16 << 5);
            int i17 = ((int[]) objArr19[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr19[1])[0]}, new int[]{((int[]) objArr19[2])[0]}, (String[]) objArr19[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i18 = i17 + (((~((-159016959) | iMaxMemory)) | 158491214) * (-283)) + 2096538089 + ((~(iMaxMemory | (-525745))) * 283);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[0])[0] = i20 ^ (i20 << 5);
            paymentDetails = this;
            i = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i21 = copydefault + 123;
                component2 = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (j3 - ((j3 >> 63) << 32)) | (((long) 6) << 32) | (((long) (i9 ^ i10)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr21 = {-191807632, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 6562, 56 - Color.green(0), (char) Color.blue(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr21);
                int i23 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iNextInt = new Random().nextInt(340352974);
                int i24 = i23 + 761388479 + (((~((-293864977) | (~iNextInt))) | (~((-100667489) | iNextInt))) * (-272)) + (((~((-831893137) | iNextInt)) | 538028160) * (-272)) + (((~(iNextInt | 831893136)) | (-638695649)) * 272);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr22[0])[0] = i26 ^ (i26 << 5);
                Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                int i27 = ((int[]) objArr22[0])[0];
                Object[] objArr23 = {new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i28 = ~iIdentityHashCode;
                int i29 = i27 + 144586785 + (((~(182911191 | i28)) | (~((-376108680) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 519042775)) | (~(i28 | (-39977096)))) * 210);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr23[0])[0] = i31 ^ (i31 << 5);
                int i32 = component2 + 65;
                copydefault = i32 % 128;
                i = 2;
                int i33 = i32 % 2;
                paymentDetails = this;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        String str2 = paymentDetails.amount;
        int i34 = copydefault + 37;
        component2 = i34 % 128;
        int i35 = i34 % i;
        return str2;
    }

    public final String getBusinessNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.businessNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMerchantName() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.merchantName;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String getMobileNumber() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mobileNumber;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String getPaybillNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paybillNumber;
        }
        throw null;
    }

    public final String getRecipientName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.recipientName;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i3 + 103;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTillNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tillNumber;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionType getTransactionType() {
        TransactionType transactionType;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            transactionType = this.transactionType;
            int i4 = 90 / 0;
        } else {
            transactionType = this.transactionType;
        }
        int i5 = i2 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return transactionType;
    }

    public PaymentDetails(TransactionType transactionType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionType = transactionType;
        this.amount = str;
        this.tillNumber = str2;
        this.paybillNumber = str3;
        this.accountNumber = str4;
        this.agentNumber = str5;
        this.merchantName = str6;
        this.recipientName = str7;
        this.storeNumber = str8;
        this.businessNumber = str9;
        this.mobileNumber = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentDetails(TransactionType transactionType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i2 = copydefault + 51;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
            }
            str11 = null;
        } else {
            str11 = str3;
        }
        if ((i & 16) != 0) {
            int i4 = component2 + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str12 = null;
        } else {
            str12 = str4;
        }
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            str13 = null;
        } else {
            str13 = str5;
        }
        if ((i & 64) != 0) {
            int i8 = component2 + 47;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 60 / 0;
            }
            str14 = null;
        } else {
            str14 = str6;
        }
        String str18 = (i & 128) != 0 ? null : str7;
        if ((i & 256) != 0) {
            int i10 = component2 + 57;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 28 / 0;
            }
            int i12 = 2 % 2;
            str15 = null;
        } else {
            str15 = str8;
        }
        if ((i & 512) != 0) {
            int i13 = component2 + 75;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            str16 = null;
        } else {
            str16 = str9;
        }
        this(transactionType, str, str17, str11, str12, str13, str14, str18, str15, str16, (i & 1024) != 0 ? null : str10);
    }

    public static PaymentDetails copy$default(PaymentDetails paymentDetails, TransactionType transactionType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        TransactionType transactionType2 = (i & 1) != 0 ? paymentDetails.transactionType : transactionType;
        String str16 = (i & 2) != 0 ? paymentDetails.amount : str;
        if ((i & 4) != 0) {
            int i3 = component2 + 43;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str11 = paymentDetails.tillNumber;
        } else {
            str11 = str2;
        }
        if ((i & 8) != 0) {
            int i5 = component2;
            int i6 = i5 + 121;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str12 = paymentDetails.paybillNumber;
            int i8 = i5 + 57;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str12 = str3;
        }
        String str17 = (i & 16) != 0 ? paymentDetails.accountNumber : str4;
        if ((i & 32) != 0) {
            str13 = paymentDetails.agentNumber;
            int i10 = copydefault + 45;
            component2 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str13 = str5;
        }
        String str18 = (i & 64) != 0 ? paymentDetails.merchantName : str6;
        if ((i & 128) != 0) {
            str14 = paymentDetails.recipientName;
            int i12 = component2 + 37;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str14 = str7;
        }
        if ((i & 256) != 0) {
            int i14 = component2 + 27;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            str15 = paymentDetails.storeNumber;
        } else {
            str15 = str8;
        }
        return paymentDetails.copy(transactionType2, str16, str11, str12, str17, str13, str18, str14, str15, (i & 512) != 0 ? paymentDetails.businessNumber : str9, (i & 1024) != 0 ? paymentDetails.mobileNumber : str10);
    }

    public final TransactionType component1() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.transactionType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessNumber;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.mobileNumber;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 35;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.tillNumber;
            int i4 = 18 / 0;
        } else {
            str = this.tillNumber;
        }
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paybillNumber;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.agentNumber;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.merchantName;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.recipientName;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.storeNumber;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PaymentDetails copy(TransactionType transactionType, String amount, String tillNumber, String paybillNumber, String accountNumber, String agentNumber, String merchantName, String recipientName, String storeNumber, String businessNumber, String mobileNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        PaymentDetails paymentDetails = new PaymentDetails(transactionType, amount, tillNumber, paybillNumber, accountNumber, agentNumber, merchantName, recipientName, storeNumber, businessNumber, mobileNumber);
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return paymentDetails;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDetails)) {
            int i5 = i2 + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) other;
        if (this.transactionType != paymentDetails.transactionType || !Intrinsics.areEqual(this.amount, paymentDetails.amount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tillNumber, paymentDetails.tillNumber)) {
            int i7 = copydefault + 11;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 35 / 0;
            }
            return false;
        }
        if ((!Intrinsics.areEqual(this.paybillNumber, paymentDetails.paybillNumber)) || !Intrinsics.areEqual(this.accountNumber, paymentDetails.accountNumber) || !Intrinsics.areEqual(this.agentNumber, paymentDetails.agentNumber) || !Intrinsics.areEqual(this.merchantName, paymentDetails.merchantName) || !Intrinsics.areEqual(this.recipientName, paymentDetails.recipientName) || !Intrinsics.areEqual(this.storeNumber, paymentDetails.storeNumber)) {
            return false;
        }
        if (Intrinsics.areEqual(this.businessNumber, paymentDetails.businessNumber)) {
            return Intrinsics.areEqual(this.mobileNumber, paymentDetails.mobileNumber);
        }
        int i9 = component2 + 61;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode7 = this.transactionType.hashCode();
        int iHashCode8 = this.amount.hashCode();
        String str = this.tillNumber;
        if (str == null) {
            int i4 = copydefault + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.paybillNumber;
        if (str2 == null) {
            int i6 = component2 + 123;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.accountNumber;
        if (str3 == null) {
            int i8 = component2 + 93;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.agentNumber;
        if (str4 == null) {
            int i10 = copydefault + 45;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        String str5 = this.merchantName;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.recipientName;
        if (str6 == null) {
            int i12 = copydefault + 19;
            component2 = i12 % 128;
            iHashCode5 = i12 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode5 = str6.hashCode();
        }
        String str7 = this.storeNumber;
        if (str7 == null) {
            iHashCode6 = 0;
        } else {
            iHashCode6 = str7.hashCode();
            int i13 = component2 + 121;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
        }
        String str8 = this.businessNumber;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.mobileNumber;
        return ((((((((((((((((((iHashCode8 + (iHashCode7 * 31)) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode10) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaymentDetails(transactionType=" + this.transactionType + ", amount=" + this.amount + ", tillNumber=" + this.tillNumber + ", paybillNumber=" + this.paybillNumber + ", accountNumber=" + this.accountNumber + ", agentNumber=" + this.agentNumber + ", merchantName=" + this.merchantName + ", recipientName=" + this.recipientName + ", storeNumber=" + this.storeNumber + ", businessNumber=" + this.businessNumber + ", mobileNumber=" + this.mobileNumber + ")";
        int i2 = copydefault + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void ShareDataUIState() {
        ShareDataUIState = 7183072652225972337L;
    }
}
