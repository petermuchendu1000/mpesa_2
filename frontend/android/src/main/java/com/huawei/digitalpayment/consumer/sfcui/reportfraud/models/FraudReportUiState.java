package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudTicket;
import com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudType;
import com.huawei.digitalpayment.consumer.sfcui.reportfraud.ReportFraudScreens;
import com.safaricom.sharedui.compose.completion.TransactionCompletionData;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u000bHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010-J¤\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\u000b2\b\u0010`\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010a\u001a\u00020\u0005H×\u0001J\t\u0010b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0015\u0010!\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010.\u001a\u0004\bC\u0010-¨\u0006c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudReportUiState;", "", "currentScreen", "", "currentStep", "", "totalSteps", "fraudType", "selectedFraudType", "userName", "didLoseFunds", "", "amountLost", "onlineAccountLink", "swappedLineNumber", "fraudulentChannel", "channelValue", "obNumber", "policeStation", "reportedToPolice", "additionalInfo", "raisedTickets", "", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudTicket;", "selectedTicket", "updatedAmountLost", GriverMonitorConstants.KEY_IS_LOADING, "errorMessage", "completionData", "Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;", ReportFraudScreens.FAQS, "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudFaqItem;", "numberCalledOrTexted", "hasAdditionalInfo", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudTicket;Ljava/lang/String;ZLjava/lang/String;Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCurrentScreen", "()Ljava/lang/String;", "getCurrentStep", "()I", "getTotalSteps", "getFraudType", "getSelectedFraudType", "getUserName", "getDidLoseFunds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAmountLost", "getOnlineAccountLink", "getSwappedLineNumber", "getFraudulentChannel", "getChannelValue", "getObNumber", "getPoliceStation", "getReportedToPolice", "getAdditionalInfo", "getRaisedTickets", "()Ljava/util/List;", "getSelectedTicket", "()Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudTicket;", "getUpdatedAmountLost", "()Z", "getErrorMessage", "getCompletionData", "()Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;", "getFaqs", "getNumberCalledOrTexted", "getHasAdditionalInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudTicket;Ljava/lang/String;ZLjava/lang/String;Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudReportUiState;", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudReportUiState {
    public static final int $stable = 8;
    private static int e = 99 % 128;
    private static int g = 1;
    private static int h;
    private static int invokeSuspend;
    private final String ArtificialStackFrames;
    private final String CoroutineDebuggingKt;
    private final String ShareDataUIState;

    private final String f2765a;
    private final String accessartificialFrame;

    private final String f2766b;

    private final String f2767c;
    private final String component1;
    private final String component2;
    private final String component3;
    private final List<FraudFaqItem> component4;
    private final String copy;
    private final TransactionCompletionData copydefault;
    private final Boolean coroutineBoundary;
    private final List<FraudTicket> coroutineCreation;

    private final FraudTicket f2768d;
    private final Boolean equals;
    private final String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final int getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final String getSponsorBeneficiariesState;
    private final boolean hashCode;
    private final int invoke;
    private final Boolean toString;

    public FraudReportUiState(String str, int i, int i2, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool2, String str12, List<FraudTicket> list, FraudTicket fraudTicket, String str13, boolean z, String str14, TransactionCompletionData transactionCompletionData, List<FraudFaqItem> list2, String str15, Boolean bool3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.ShareDataUIState = str;
        this.getAsAtTimestamp = i;
        this.invoke = i2;
        this.copy = str2;
        this.CoroutineDebuggingKt = str3;
        this.f2767c = str4;
        this.equals = bool;
        this.component3 = str5;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = str6;
        this.f2766b = str7;
        this.ArtificialStackFrames = str8;
        this.component1 = str9;
        this.getShareableDataState = str10;
        this.accessartificialFrame = str11;
        this.coroutineBoundary = bool2;
        this.component2 = str12;
        this.coroutineCreation = list;
        this.f2768d = fraudTicket;
        this.f2765a = str13;
        this.hashCode = z;
        this.getRequestBeneficiariesState = str14;
        this.copydefault = transactionCompletionData;
        this.component4 = list2;
        this.getSponsorBeneficiariesState = str15;
        this.toString = bool3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FraudReportUiState(String str, int i, int i2, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool2, String str12, List list, FraudTicket fraudTicket, String str13, boolean z, String str14, TransactionCompletionData transactionCompletionData, List list2, String str15, Boolean bool3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Boolean bool4;
        Boolean bool5;
        boolean z2;
        boolean z3;
        String str23;
        int i5;
        List listEmptyList;
        String str24;
        String str25 = (i3 & 1) != 0 ? ReportFraudScreens.ENTRY_POINT : str;
        int i6 = (i3 & 2) != 0 ? 0 : i;
        if ((i3 & 4) != 0) {
            int i7 = invokeSuspend + 117;
            g = i7 % 128;
            int i8 = i7 % 2;
            i4 = 4;
        } else {
            i4 = i2;
        }
        if ((i3 & 8) != 0) {
            int i9 = g + 35;
            invokeSuspend = i9 % 128;
            int i10 = i9 % 2;
            str16 = FraudType.REPORT_CONMAN;
        } else {
            str16 = str2;
        }
        String str26 = (i3 & 16) != 0 ? null : str3;
        if ((i3 & 32) != 0) {
            int i11 = 2 % 2;
            str17 = "John Doe";
        } else {
            str17 = str4;
        }
        Boolean bool6 = (i3 & 64) != 0 ? null : bool;
        String str27 = (i3 & 128) != 0 ? "" : str5;
        String str28 = (i3 & 256) != 0 ? "" : str6;
        String str29 = (i3 & 512) != 0 ? "" : str7;
        if ((i3 & 1024) != 0) {
            int i12 = invokeSuspend + 117;
            g = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            str18 = null;
        } else {
            str18 = str8;
        }
        String str30 = (i3 & 2048) != 0 ? "" : str9;
        if ((i3 & 4096) != 0) {
            int i13 = invokeSuspend + 109;
            str19 = "";
            g = i13 % 128;
            int i14 = i13 % 2;
            str20 = str19;
        } else {
            str19 = "";
            str20 = str10;
        }
        if ((i3 & 8192) != 0) {
            int i15 = invokeSuspend + 69;
            str21 = str20;
            g = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            str22 = str19;
        } else {
            str21 = str20;
            str22 = str11;
        }
        if ((i3 & 16384) != 0) {
            int i16 = 2 % 2;
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        String str31 = (i3 & 32768) != 0 ? str19 : str12;
        List listEmptyList2 = (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list;
        FraudTicket fraudTicket2 = (i3 & 131072) != 0 ? null : fraudTicket;
        String str32 = (i3 & 262144) != 0 ? str19 : str13;
        if ((i3 & 524288) != 0) {
            int i17 = invokeSuspend + 51;
            bool5 = bool4;
            g = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 2 % 2;
            z2 = false;
        } else {
            bool5 = bool4;
            z2 = z;
        }
        String str33 = (1048576 & i3) != 0 ? null : str14;
        TransactionCompletionData transactionCompletionData2 = (i3 & 2097152) != 0 ? null : transactionCompletionData;
        if ((i3 & 4194304) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            str23 = str33;
            int i20 = invokeSuspend + 115;
            z3 = z2;
            g = i20 % 128;
            i5 = 2;
            int i21 = i20 % 2;
            int i22 = 2 % 2;
        } else {
            z3 = z2;
            str23 = str33;
            i5 = 2;
            listEmptyList = list2;
        }
        if ((8388608 & i3) != 0) {
            int i23 = i5 % i5;
            str24 = str19;
        } else {
            str24 = str15;
        }
        this(str25, i6, i4, str16, str26, str17, bool6, str27, str28, str29, str18, str30, str21, str22, bool5, str31, listEmptyList2, fraudTicket2, str32, z3, str23, transactionCompletionData2, listEmptyList, str24, (i3 & 16777216) != 0 ? null : bool3);
    }

    public final String getCurrentScreen() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 123;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 119;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getCurrentStep() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 93;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getAsAtTimestamp;
        int i6 = i2 + 25;
        invokeSuspend = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getTotalSteps() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 15;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.invoke;
        int i6 = i2 + 35;
        invokeSuspend = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return i5;
    }

    public final String getFraudType() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 23;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSelectedFraudType() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 19;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.CoroutineDebuggingKt;
        int i4 = i3 + 21;
        invokeSuspend = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return str;
    }

    public final String getUserName() {
        int i = 2 % 2;
        int i2 = g + 105;
        invokeSuspend = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2767c;
        }
        throw null;
    }

    public final Boolean getDidLoseFunds() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 65;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmountLost() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 37;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOnlineAccountLink() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 79;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i4 = i2 + 125;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSwappedLineNumber() {
        int i = 2 % 2;
        int i2 = g + 49;
        invokeSuspend = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f2766b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFraudulentChannel() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 115;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i3 + 19;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getChannelValue() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 71;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 115;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getObNumber() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 105;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 117;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPoliceStation() {
        String str;
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 15;
        invokeSuspend = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.accessartificialFrame;
            int i4 = 46 / 0;
        } else {
            str = this.accessartificialFrame;
        }
        int i5 = i2 + 51;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean getReportedToPolice() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 21;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.coroutineBoundary;
        int i5 = i2 + 77;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final String getAdditionalInfo() {
        String str;
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 35;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component2;
            int i4 = 63 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 79;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<FraudTicket> getRaisedTickets() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 49;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        List<FraudTicket> list = this.coroutineCreation;
        int i5 = i3 + 73;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final FraudTicket getSelectedTicket() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 61;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        FraudTicket fraudTicket = this.f2768d;
        int i5 = i3 + 21;
        invokeSuspend = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return fraudTicket;
    }

    public final String getUpdatedAmountLost() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 51;
        g = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2765a;
        int i5 = i2 + 25;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = g + 25;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        int i4 = i2 % 2;
        boolean z = this.hashCode;
        int i5 = i3 + 101;
        g = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = g + 101;
        invokeSuspend = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionCompletionData getCompletionData() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 69;
        g = i3 % 128;
        int i4 = i3 % 2;
        TransactionCompletionData transactionCompletionData = this.copydefault;
        int i5 = i2 + 53;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return transactionCompletionData;
    }

    public final List<FraudFaqItem> getFaqs() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 1;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        List<FraudFaqItem> list = this.component4;
        int i5 = i2 + 75;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getNumberCalledOrTexted() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 83;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.getSponsorBeneficiariesState;
        int i5 = i3 + 55;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getHasAdditionalInfo() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 105;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        Boolean bool = this.toString;
        int i5 = i3 + 45;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public int hashCode() throws Throwable {
        int iHashCode;
        long j;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 35;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = this.ShareDataUIState.hashCode();
        int iHashCode3 = Integer.hashCode(this.getAsAtTimestamp);
        int iHashCode4 = Integer.hashCode(this.invoke);
        int iHashCode5 = this.copy.hashCode();
        String str = this.CoroutineDebuggingKt;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.f2767c.hashCode();
        Boolean bool = this.equals;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        int iHashCode9 = this.component3.hashCode();
        int iHashCode10 = this.getARTIFICIAL_FRAME_PACKAGE_NAME.hashCode();
        int iHashCode11 = this.f2766b.hashCode();
        String str2 = this.ArtificialStackFrames;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        int iHashCode13 = this.component1.hashCode();
        int iHashCode14 = this.getShareableDataState.hashCode();
        int iHashCode15 = this.accessartificialFrame.hashCode();
        Boolean bool2 = this.coroutineBoundary;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode17 = this.component2.hashCode();
        int iHashCode18 = this.coroutineCreation.hashCode();
        FraudTicket fraudTicket = this.f2768d;
        int iHashCode19 = fraudTicket == null ? 0 : fraudTicket.hashCode();
        int iHashCode20 = this.f2765a.hashCode();
        int iHashCode21 = Boolean.hashCode(this.hashCode);
        String str3 = this.getRequestBeneficiariesState;
        if (str3 == null) {
            int i5 = invokeSuspend + 43;
            g = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        TransactionCompletionData transactionCompletionData = this.copydefault;
        int iHashCode22 = transactionCompletionData == null ? 0 : transactionCompletionData.hashCode();
        int iHashCode23 = this.component4.hashCode();
        int iHashCode24 = this.getSponsorBeneficiariesState.hashCode();
        Boolean bool3 = this.toString;
        int iHashCode25 = bool3 == null ? 0 : bool3.hashCode();
        int i6 = ((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 67, 33 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (19696 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i7 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 30, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 55511118, false, "component2", null);
        }
        int i8 = ((Field) objCopydefault2).getInt(null);
        long j2 = i8;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            j = j2;
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.normalizeMetaState(0), 29 - Process.getGidForName(""), (char) KeyEvent.getDeadChar(0, 0), 58536393, false, "component3", null);
        } else {
            j = j2;
        }
        int i9 = ((Field) objCopydefault3).getInt(null);
        int i10 = iHashCode;
        int i11 = i9;
        long j3 = 672;
        long jIdentityHashCode = System.identityHashCode(this);
        int i12 = iHashCode25;
        int i13 = iHashCode12;
        long j4 = -1;
        long j5 = jIdentityHashCode ^ j4;
        long j6 = (((long) 673) * 3615369257327196316L) + (((long) (-1343)) * (-2822665803682991892L)) + ((((jIdentityHashCode | 3615369257327196316L) ^ j4) | (-2822665803682991892L)) * j3) + (((long) (-672)) * ((((j4 ^ 3615369257327196316L) | j5) ^ j4) | ((jIdentityHashCode | (-2822665803682991892L)) ^ j4)));
        long j7 = j4 ^ (-2822665803682991892L);
        long j8 = j6 + (j3 * (((j7 | 3615369257327196316L) ^ j4) | ((j7 | j5) ^ j4)));
        long j9 = j;
        int i14 = 0;
        while (true) {
            i = i11;
            int i15 = 0;
            while (i15 != 8) {
                i = (((((int) (j9 >> i15)) & 255) + (i << 6)) + (i << 16)) - i;
                i15++;
                int i16 = g + 125;
                invokeSuspend = i16 % 128;
                int i17 = i16 % 2;
            }
            if (i14 != 0) {
                break;
            }
            i14++;
            j9 = j8;
            i11 = i;
        }
        if (i == i7) {
            return ((((((((((((((((((((((((((((((((((((i6 + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + i13) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + i10) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + i12;
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(66 - Process.getGidForName(""), TextUtils.lastIndexOf("", '0', 0) + 34, (char) (TextUtils.getCapsMode("", 0, 0) + 19696), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j10 = -1;
        long j11 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)));
        long j12 = 0;
        long j13 = j11 | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0'), 42 - Color.alpha(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {1385731179, Long.valueOf(j13), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6562, Color.red(0) + 56, (char) ((Process.getThreadPriority(0) + 20) >> 6), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault6).invoke(objInvoke, objArr);
            throw new RuntimeException(String.valueOf(i8));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        if (99 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FraudReportUiState() {
        this(null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 33554431, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FraudReportUiState copy$default(FraudReportUiState fraudReportUiState, String str, int i, int i2, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Boolean bool2, String str12, List list, FraudTicket fraudTicket, String str13, boolean z, String str14, TransactionCompletionData transactionCompletionData, List list2, String str15, Boolean bool3, int i3, Object obj) {
        int i4;
        String str16;
        String str17;
        Boolean bool4;
        String str18;
        String str19;
        String str20;
        List list3;
        FraudTicket fraudTicket2;
        FraudTicket fraudTicket3;
        boolean z2;
        String str21;
        String str22;
        TransactionCompletionData transactionCompletionData2;
        TransactionCompletionData transactionCompletionData3;
        List list4;
        int i5 = 2 % 2;
        int i6 = g;
        int i7 = i6 + 19;
        invokeSuspend = i7 % 128;
        int i8 = i7 % 2;
        String str23 = (i3 & 1) != 0 ? fraudReportUiState.ShareDataUIState : str;
        int i9 = (i3 & 2) != 0 ? fraudReportUiState.getAsAtTimestamp : i;
        if ((i3 & 4) != 0) {
            int i10 = i6 + 89;
            invokeSuspend = i10 % 128;
            int i11 = i10 % 2;
            i4 = fraudReportUiState.invoke;
        } else {
            i4 = i2;
        }
        if ((i3 & 8) != 0) {
            str16 = fraudReportUiState.copy;
            int i12 = invokeSuspend + 87;
            g = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str16 = str2;
        }
        if ((i3 & 16) != 0) {
            int i14 = invokeSuspend + 51;
            int i15 = i14 % 128;
            g = i15;
            int i16 = i14 % 2;
            str17 = fraudReportUiState.CoroutineDebuggingKt;
            int i17 = i15 + 21;
            invokeSuspend = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 % 5;
            }
        } else {
            str17 = str3;
        }
        String str24 = (i3 & 32) != 0 ? fraudReportUiState.f2767c : str4;
        Boolean bool5 = (i3 & 64) != 0 ? fraudReportUiState.equals : bool;
        String str25 = (i3 & 128) != 0 ? fraudReportUiState.component3 : str5;
        String str26 = (i3 & 256) != 0 ? fraudReportUiState.getARTIFICIAL_FRAME_PACKAGE_NAME : str6;
        String str27 = (i3 & 512) != 0 ? fraudReportUiState.f2766b : str7;
        String str28 = (i3 & 1024) != 0 ? fraudReportUiState.ArtificialStackFrames : str8;
        String str29 = (i3 & 2048) != 0 ? fraudReportUiState.component1 : str9;
        String str30 = (i3 & 4096) != 0 ? fraudReportUiState.getShareableDataState : str10;
        String str31 = (i3 & 8192) != 0 ? fraudReportUiState.accessartificialFrame : str11;
        Boolean bool6 = (i3 & 16384) != 0 ? fraudReportUiState.coroutineBoundary : bool2;
        if ((i3 & 32768) != 0) {
            bool4 = bool6;
            int i19 = g + 85;
            str18 = str30;
            invokeSuspend = i19 % 128;
            int i20 = i19 % 2;
            str19 = fraudReportUiState.component2;
        } else {
            bool4 = bool6;
            str18 = str30;
            str19 = str12;
        }
        List list5 = (65536 & i3) != 0 ? fraudReportUiState.coroutineCreation : list;
        if ((i3 & 131072) != 0) {
            list3 = list5;
            FraudTicket fraudTicket4 = fraudReportUiState.f2768d;
            int i21 = invokeSuspend + 1;
            str20 = str19;
            g = i21 % 128;
            int i22 = i21 % 2;
            fraudTicket2 = fraudTicket4;
        } else {
            str20 = str19;
            list3 = list5;
            fraudTicket2 = fraudTicket;
        }
        String str32 = (262144 & i3) != 0 ? fraudReportUiState.f2765a : str13;
        boolean z3 = (i3 & 524288) != 0 ? fraudReportUiState.hashCode : z;
        if ((i3 & 1048576) != 0) {
            z2 = z3;
            int i23 = invokeSuspend + 107;
            fraudTicket3 = fraudTicket2;
            g = i23 % 128;
            int i24 = i23 % 2;
            str21 = fraudReportUiState.getRequestBeneficiariesState;
        } else {
            fraudTicket3 = fraudTicket2;
            z2 = z3;
            str21 = str14;
        }
        Object obj2 = null;
        if ((2097152 & i3) != 0) {
            int i25 = invokeSuspend + 39;
            str22 = str21;
            g = i25 % 128;
            if (i25 % 2 == 0) {
                TransactionCompletionData transactionCompletionData4 = fraudReportUiState.copydefault;
                obj2.hashCode();
                throw null;
            }
            transactionCompletionData2 = fraudReportUiState.copydefault;
        } else {
            str22 = str21;
            transactionCompletionData2 = transactionCompletionData;
        }
        if ((4194304 & i3) != 0) {
            int i26 = invokeSuspend + 85;
            transactionCompletionData3 = transactionCompletionData2;
            g = i26 % 128;
            if (i26 % 2 == 0) {
                List<FraudFaqItem> list6 = fraudReportUiState.component4;
                obj2.hashCode();
                throw null;
            }
            list4 = fraudReportUiState.component4;
        } else {
            transactionCompletionData3 = transactionCompletionData2;
            list4 = list2;
        }
        return fraudReportUiState.copy(str23, i9, i4, str16, str17, str24, bool5, str25, str26, str27, str28, str29, str18, str31, bool4, str20, list3, fraudTicket3, str32, z2, str22, transactionCompletionData3, list4, (8388608 & i3) != 0 ? fraudReportUiState.getSponsorBeneficiariesState : str15, (i3 & 16777216) != 0 ? fraudReportUiState.toString : bool3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 7;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 19;
        invokeSuspend = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 81;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2766b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 55;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i3 + 7;
        invokeSuspend = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 115;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 5;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = g + 33;
        invokeSuspend = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getShareableDataState;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = g + 123;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        int i4 = i2 % 2;
        String str = this.accessartificialFrame;
        int i5 = i3 + 25;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component15() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 13;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.coroutineBoundary;
        int i5 = i2 + 11;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 95;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final List<FraudTicket> component17() {
        int i = 2 % 2;
        int i2 = g + 11;
        invokeSuspend = i2 % 128;
        int i3 = i2 % 2;
        List<FraudTicket> list = this.coroutineCreation;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return list;
    }

    public final FraudTicket component18() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 107;
        g = i3 % 128;
        int i4 = i3 % 2;
        FraudTicket fraudTicket = this.f2768d;
        int i5 = i2 + 117;
        g = i5 % 128;
        int i6 = i5 % 2;
        return fraudTicket;
    }

    public final String component19() {
        String str;
        int i = 2 % 2;
        int i2 = g + 1;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        if (i2 % 2 != 0) {
            str = this.f2765a;
            int i4 = 29 / 0;
        } else {
            str = this.f2765a;
        }
        int i5 = i3 + 5;
        g = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = g + 67;
        invokeSuspend = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component20() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 7;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.hashCode;
        int i4 = i2 + 91;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = g + 63;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i3 + 103;
        g = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final TransactionCompletionData component22() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 17;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        TransactionCompletionData transactionCompletionData = this.copydefault;
        int i5 = i2 + 109;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return transactionCompletionData;
    }

    public final List<FraudFaqItem> component23() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 57;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        throw null;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 107;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getSponsorBeneficiariesState;
        int i5 = i2 + 103;
        invokeSuspend = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final Boolean component25() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 81;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.toString;
        int i4 = i3 + 31;
        invokeSuspend = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = invokeSuspend;
        int i3 = i2 + 119;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.invoke;
        int i5 = i2 + 7;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = g + 49;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        if (i2 % 2 != 0) {
            str = this.copy;
            int i4 = 44 / 0;
        } else {
            str = this.copy;
        }
        int i5 = i3 + 1;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 23;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        String str = this.CoroutineDebuggingKt;
        int i5 = i2 + 103;
        invokeSuspend = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 81;
        invokeSuspend = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f2767c;
        int i5 = i2 + 91;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component7() {
        int i = 2 % 2;
        int i2 = g + 23;
        int i3 = i2 % 128;
        invokeSuspend = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.equals;
        int i4 = i3 + 105;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 49;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 97;
        invokeSuspend = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = invokeSuspend + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final FraudReportUiState copy(String currentScreen, int currentStep, int totalSteps, String fraudType, String selectedFraudType, String userName, Boolean didLoseFunds, String amountLost, String onlineAccountLink, String swappedLineNumber, String fraudulentChannel, String channelValue, String obNumber, String policeStation, Boolean reportedToPolice, String additionalInfo, List<FraudTicket> raisedTickets, FraudTicket selectedTicket, String updatedAmountLost, boolean isLoading, String errorMessage, TransactionCompletionData completionData, List<FraudFaqItem> faqs, String numberCalledOrTexted, Boolean hasAdditionalInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(currentScreen, "");
        Intrinsics.checkNotNullParameter(fraudType, "");
        Intrinsics.checkNotNullParameter(userName, "");
        Intrinsics.checkNotNullParameter(amountLost, "");
        Intrinsics.checkNotNullParameter(onlineAccountLink, "");
        Intrinsics.checkNotNullParameter(swappedLineNumber, "");
        Intrinsics.checkNotNullParameter(channelValue, "");
        Intrinsics.checkNotNullParameter(obNumber, "");
        Intrinsics.checkNotNullParameter(policeStation, "");
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        Intrinsics.checkNotNullParameter(raisedTickets, "");
        Intrinsics.checkNotNullParameter(updatedAmountLost, "");
        Intrinsics.checkNotNullParameter(faqs, "");
        Intrinsics.checkNotNullParameter(numberCalledOrTexted, "");
        FraudReportUiState fraudReportUiState = new FraudReportUiState(currentScreen, currentStep, totalSteps, fraudType, selectedFraudType, userName, didLoseFunds, amountLost, onlineAccountLink, swappedLineNumber, fraudulentChannel, channelValue, obNumber, policeStation, reportedToPolice, additionalInfo, raisedTickets, selectedTicket, updatedAmountLost, isLoading, errorMessage, completionData, faqs, numberCalledOrTexted, hasAdditionalInfo);
        int i2 = invokeSuspend + 119;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return fraudReportUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0178, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0179, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g + 45;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState)) == true) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState)) == true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r5.getAsAtTimestamp == r6.getAsAtTimestamp) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g + 41;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5.invoke == r6.invoke) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copy, r6.copy) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.CoroutineDebuggingKt, r6.CoroutineDebuggingKt) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2767c, r6.f2767c) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.equals, r6.equals) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend + 55;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) == true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getARTIFICIAL_FRAME_PACKAGE_NAME, r6.getARTIFICIAL_FRAME_PACKAGE_NAME) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2766b, r6.f2766b) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ArtificialStackFrames, r6.ArtificialStackFrames) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getShareableDataState, r6.getShareableDataState) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.accessartificialFrame, r6.accessartificialFrame) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.coroutineBoundary, r6.coroutineBoundary) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g + 87;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.coroutineCreation, r6.coroutineCreation) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g + 11;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2768d, r6.f2768d) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0108, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f2765a, r6.f2765a) == true) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r5.hashCode == r6.hashCode) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getRequestBeneficiariesState, r6.getRequestBeneficiariesState) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend + 53;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0125, code lost:
    
        if ((r6 % 2) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0127, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend + 39;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0146, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component4, r6.component4) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0151, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getSponsorBeneficiariesState, r6.getSponsorBeneficiariesState) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0153, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.toString, r6.toString) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015e, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g + 95;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0167, code lost:
    
        if ((r6 % 2) == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016c, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.invokeSuspend + 43;
        com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.g = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
    
        if ((r6 % 2) != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0177, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.models.FraudReportUiState.equals(java.lang.Object):boolean");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FraudReportUiState(currentScreen=" + this.ShareDataUIState + ", currentStep=" + this.getAsAtTimestamp + ", totalSteps=" + this.invoke + ", fraudType=" + this.copy + ", selectedFraudType=" + this.CoroutineDebuggingKt + ", userName=" + this.f2767c + ", didLoseFunds=" + this.equals + ", amountLost=" + this.component3 + ", onlineAccountLink=" + this.getARTIFICIAL_FRAME_PACKAGE_NAME + ", swappedLineNumber=" + this.f2766b + ", fraudulentChannel=" + this.ArtificialStackFrames + ", channelValue=" + this.component1 + ", obNumber=" + this.getShareableDataState + ", policeStation=" + this.accessartificialFrame + ", reportedToPolice=" + this.coroutineBoundary + ", additionalInfo=" + this.component2 + ", raisedTickets=" + this.coroutineCreation + ", selectedTicket=" + this.f2768d + ", updatedAmountLost=" + this.f2765a + ", isLoading=" + this.hashCode + ", errorMessage=" + this.getRequestBeneficiariesState + ", completionData=" + this.copydefault + ", faqs=" + this.component4 + ", numberCalledOrTexted=" + this.getSponsorBeneficiariesState + ", hasAdditionalInfo=" + this.toString + ")";
        int i2 = invokeSuspend + 47;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
