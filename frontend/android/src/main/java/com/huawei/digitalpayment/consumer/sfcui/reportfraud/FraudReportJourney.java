package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "", "fraudType", "", "totalSteps", "", "stepScreens", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getFraudType", "()Ljava/lang/String;", "getTotalSteps", "()I", "getStepScreens", "()Ljava/util/List;", "getCurrentStep", "screenName", "isFirstStep", "", "isLastStep", "getPreviousScreen", "getNextScreen", "getProgress", "", "ReportConman", "ReportConnedOnline", "ReportSwappedLine", "Companion", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportConman;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportConnedOnline;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportSwappedLine;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FraudReportJourney {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static int component1;
    private static int component4;
    private final List<String> ShareDataUIState;
    private final int component2;
    private final String component3;
    private static final byte[] $$c = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT};
    private static final int $$d = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarHeader.LF_SYMLINK, -82, -81, 124, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 243;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, short r6, int r7) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.$$c
            int r6 = r6 * 4
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r5
            r6 = r7
            goto L2b
        L16:
            r4 = r7
            r7 = r6
            r6 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
        L2b:
            int r7 = r7 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.$$e(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 10
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.$$a
            int r7 = r7 * 3
            int r7 = r7 + 99
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-26)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.b(byte, byte, byte, java.lang.Object[]):void");
    }

    private FraudReportJourney(String str, int i, List<String> list) {
        this.component3 = str;
        this.component2 = i;
        this.ShareDataUIState = list;
    }

    public final String getFraudType() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 9;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getTotalSteps() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component2;
        if (i3 != 0) {
            int i5 = 90 / 0;
        }
        return i4;
    }

    public final List<String> getStepScreens() {
        int i = 2 % 2;
        int i2 = copy + 67;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportConman;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportConman extends FraudReportJourney {
        public static final int $stable = 0;
        public static final ReportConman INSTANCE = new ReportConman();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        private ReportConman() {
            String str = FraudType.REPORT_CONMAN;
            super(str, 5, CollectionsKt.listOf((Object[]) new String[]{ReportFraudScreens.REPORT_CONMAN_STEP_1, ReportFraudScreens.REPORT_CONMAN_STEP_2, ReportFraudScreens.REPORT_CONMAN_STEP_3, ReportFraudScreens.REPORT_CONMAN_STEP_4, ReportFraudScreens.REPORT_CONMAN_STEP_5}), null);
        }

        static {
            int i = component3 + 95;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 77;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof ReportConman) {
                int i4 = component1 + 103;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = component1 + 115;
            int i7 = i6 % 128;
            ShareDataUIState = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 93;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 76 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 29;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return -767724136;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 17;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                int i4 = 77 / 0;
            }
            int i5 = i3 + 29;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return "ReportConman";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportConnedOnline;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportConnedOnline extends FraudReportJourney {
        public static final int $stable = 0;
        public static final ReportConnedOnline INSTANCE = new ReportConnedOnline();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        private ReportConnedOnline() {
            String str = FraudType.CONNED_ONLINE;
            super(str, 5, CollectionsKt.listOf((Object[]) new String[]{ReportFraudScreens.REPORT_CONNED_ONLINE_STEP_1, ReportFraudScreens.REPORT_CONNED_ONLINE_STEP_2, ReportFraudScreens.REPORT_CONNED_ONLINE_STEP_3, ReportFraudScreens.REPORT_CONNED_ONLINE_STEP_4, ReportFraudScreens.REPORT_CONNED_ONLINE_STEP_5}), null);
        }

        static {
            int i = copydefault + 61;
            component3 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r1 = r1 + 35;
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline.component1 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r1 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline.ShareDataUIState
                int r2 = r1 + 77
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline.component1 = r3
                int r2 = r2 % r0
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L16
                r2 = 65
                int r2 = r2 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline
                if (r2 != 0) goto L28
                int r1 = r1 + 35
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline.component1 = r6
                int r1 = r1 % r0
                if (r1 == 0) goto L27
                r3 = r4
            L27:
                return r3
            L28:
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney$ReportConnedOnline r6 = (com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline) r6
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportConnedOnline.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 33;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return -1038133250;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 125;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return "ReportConnedOnline";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$ReportSwappedLine;", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportSwappedLine extends FraudReportJourney {
        public static final int $stable = 0;
        public static final ReportSwappedLine INSTANCE = new ReportSwappedLine();
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        /* JADX WARN: Illegal instructions before constructor call */
        private ReportSwappedLine() {
            String str = FraudType.SWAPPED_LINE;
            super(str, 4, CollectionsKt.listOf((Object[]) new String[]{ReportFraudScreens.REPORT_SWAPPED_LINE_STEP_1, ReportFraudScreens.REPORT_SWAPPED_LINE_STEP_2, ReportFraudScreens.REPORT_SWAPPED_LINE_STEP_3, ReportFraudScreens.REPORT_SWAPPED_LINE_STEP_4}), null);
        }

        static {
            int i = component1 + 53;
            component3 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine)) == true) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r2 = r2 + 25;
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine.component2 = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if ((r2 % 2) == 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine.component2
                int r1 = r1 + 23
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine.copydefault = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L16
                r1 = 71
                int r1 = r1 / r3
                if (r5 != r6) goto L23
                goto L18
            L16:
                if (r5 != r6) goto L23
            L18:
                int r2 = r2 + 25
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine.component2 = r6
                int r2 = r2 % r0
                if (r2 == 0) goto L22
                return r3
            L22:
                return r4
            L23:
                boolean r0 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine
                r0 = r0 ^ r4
                if (r0 == r4) goto L2b
                com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney$ReportSwappedLine r6 = (com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine) r6
                return r4
            L2b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.ReportSwappedLine.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return 1724649392;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "ReportSwappedLine";
        }
    }

    public final int getCurrentStep(String screenName) {
        int i = 2 % 2;
        int i2 = copy + 119;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(screenName, "");
            return this.ShareDataUIState.indexOf(screenName) >> 1;
        }
        Intrinsics.checkNotNullParameter(screenName, "");
        return this.ShareDataUIState.indexOf(screenName) + 1;
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $10 + 5;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3784, TextUtils.getOffsetAfter("", 0) + 38, (char) (26859 - TextUtils.indexOf((CharSequence) "", '0', 0)), 2015799920, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7406, 16 - View.getDefaultSize(0, 0), (char) (MotionEvent.axisFromString("") + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i8 = $11 + 33;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i10 = $11 + 65;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 7406, (Process.myTid() >> 22) + 16, (char) (KeyEvent.getMaxKeyCode() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isFirstStep(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto L1b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r5 = r4.getCurrentStep(r5)
            if (r5 != 0) goto L2e
            goto L24
        L1b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r5 = r4.getCurrentStep(r5)
            if (r5 != r2) goto L2e
        L24:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp
            int r5 = r5 + 121
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy = r1
            int r5 = r5 % r0
            goto L2f
        L2e:
            r2 = 0
        L2f:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp
            int r5 = r5 + 47
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy = r1
            int r5 = r5 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.isFirstStep(java.lang.String):boolean");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney$Companion;", "", "<init>", "()V", "fromScreen", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "screenName", "", "fromFraudType", "fraudType", "all", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component3;

        private Companion() {
        }

        public final FraudReportJourney fromScreen(String screenName) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(screenName, "");
            String str = screenName;
            if (StringsKt.contains((CharSequence) str, (CharSequence) "report_conman", true)) {
                int i2 = ShareDataUIState + 109;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return ReportConman.INSTANCE;
            }
            if (StringsKt.contains((CharSequence) str, (CharSequence) "report_conned_online", true)) {
                return ReportConnedOnline.INSTANCE;
            }
            Object obj = null;
            if (!StringsKt.contains((CharSequence) str, (CharSequence) "report_swapped_line", true)) {
                return null;
            }
            int i4 = component3 + 67;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return ReportSwappedLine.INSTANCE;
            }
            ReportSwappedLine reportSwappedLine = ReportSwappedLine.INSTANCE;
            obj.hashCode();
            throw null;
        }

        public final FraudReportJourney fromFraudType(String fraudType) {
            int i = 2 % 2;
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(fraudType, "");
            int iHashCode = fraudType.hashCode();
            Object obj = null;
            if (iHashCode == -312661417) {
                if (fraudType.equals(FraudType.CONNED_ONLINE)) {
                    return ReportConnedOnline.INSTANCE;
                }
                return null;
            }
            int i4 = component3;
            int i5 = i4 + 113;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (iHashCode == -304818464) {
                if (!fraudType.equals(FraudType.REPORT_CONMAN)) {
                    return null;
                }
                ReportConman reportConman = ReportConman.INSTANCE;
                int i6 = component3 + 85;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return reportConman;
                }
                int i7 = 3 / 4;
                return reportConman;
            }
            if (iHashCode != 412005180) {
                int i8 = i4 + 25;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                return null;
            }
            if (!fraudType.equals(FraudType.SWAPPED_LINE)) {
                return null;
            }
            ReportSwappedLine reportSwappedLine = ReportSwappedLine.INSTANCE;
            int i10 = ShareDataUIState + 25;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            return reportSwappedLine;
        }

        public final List<FraudReportJourney> all() {
            int i = 2 % 2;
            int i2 = component3 + 21;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return CollectionsKt.listOf((Object[]) new FraudReportJourney[]{ReportConman.INSTANCE, ReportConnedOnline.INSTANCE, ReportSwappedLine.INSTANCE});
            }
            FraudReportJourney[] fraudReportJourneyArr = new FraudReportJourney[5];
            fraudReportJourneyArr[1] = ReportConman.INSTANCE;
            fraudReportJourneyArr[1] = ReportConnedOnline.INSTANCE;
            fraudReportJourneyArr[4] = ReportSwappedLine.INSTANCE;
            return CollectionsKt.listOf((Object[]) fraudReportJourneyArr);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean isLastStep(String screenName) throws Throwable {
        CharSequence charSequence;
        boolean z;
        boolean z2;
        long j;
        long j2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - Process.getGidForName(""), 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (19696 - TextUtils.indexOf("", "")), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 4 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f'}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 210, true, objArr);
        int i3 = 0;
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 15, 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, CharUtils.CR}, 215 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j3 = -1;
        long j4 = j3 ^ 2083460738213141342L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j3;
        long j6 = 865;
        long j7 = (((long) 866) * 2372262358393368983L) + (((long) (-864)) * 2083460738213141342L) + (((long) (-865)) * (j4 | (((j3 ^ 2372262358393368983L) | j5) ^ j3))) + (((jIdentityHashCode | 2372262358393368983L) ^ j3) * j6) + (j6 * ((j3 ^ (j5 | 2372262358393368983L)) | ((j4 | j5) ^ j3)));
        int i4 = 0;
        while (true) {
            if (i4 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 30 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) Color.alpha(i3), 846241313, false, "copydefault", null);
                }
                int i5 = ((Field) objCopydefault2).getInt(null);
                int i6 = i3;
                long j8 = jLongValue;
                while (true) {
                    int i7 = i3;
                    while (i7 != 8) {
                        int i8 = copy + 95;
                        getAsAtTimestamp = i8 % 128;
                        if (i8 % 2 == 0) {
                            j2 = jLongValue;
                            i5 = (((((int) (j8 >>> i7)) & 16107) >> (i5 >> 38)) << (i5 << 77)) - i5;
                            i7 += 32;
                        } else {
                            j2 = jLongValue;
                            i5 = (((((int) (j8 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                            i7++;
                        }
                        jLongValue = j2;
                    }
                    j = jLongValue;
                    if (i6 != 0) {
                        break;
                    }
                    i6++;
                    j8 = j7;
                    jLongValue = j;
                    i3 = 0;
                }
                if (i5 == i2) {
                    break;
                }
                int i9 = getAsAtTimestamp + 77;
                copy = i9 % 128;
                if (i9 % 2 != 0) {
                    jLongValue = j - 1024;
                    i4 += 93;
                } else {
                    jLongValue = j - 1024;
                    i4++;
                }
                i3 = 0;
            } else {
                int length = screenName != null ? screenName.length() : 0;
                try {
                    Object[] objArr3 = {1083460912};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        charSequence = "";
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf(charSequence, '0', 0, 0) + 1664, 9 - TextUtils.lastIndexOf(charSequence, '0', 0), (char) TextUtils.indexOf(charSequence, charSequence, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    } else {
                        charSequence = "";
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, -870052831, ((Constructor) objCopydefault3).newInstance(objArr3), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int defaultSize = 1454 - View.getDefaultSize(0, 0);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, i10, windowTouchSlop, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getTrimmedLength(charSequence) + 39, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr4);
                    int i11 = ((int[]) objArr6[2])[0];
                    int i12 = ((int[]) objArr6[1])[0];
                    if (i12 == i11) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[3];
                    if (strArr != null) {
                        int i13 = copy + 111;
                        getAsAtTimestamp = i13 % 128;
                        int i14 = i13 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    long j9 = -1;
                    long j10 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
                    long j11 = 0;
                    long j12 = j10 | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault5 == null) {
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, 42 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                    Object[] objArr7 = {1083460912, Long.valueOf(j12), arrayList, null, false, false};
                    z = false;
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault6 == null) {
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, 55 - TextUtils.lastIndexOf(charSequence, '0', 0), (char) View.MeasureSpec.getSize(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault6).invoke(objInvoke, objArr7);
                    int[] iArr = new int[i12];
                    int i15 = i12 - 1;
                    z2 = true;
                    iArr[i15] = 1;
                    Toast.makeText((Context) null, iArr[((i12 * i15) % 2) - 1], 1).show();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        z2 = true;
        z = false;
        return getCurrentStep(screenName) == this.component2 ? z2 : z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r4
  0x002b: PHI (r4v2 int) = (r4v1 int), (r4v8 int) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getPreviousScreen(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.List<java.lang.String> r1 = r3.ShareDataUIState
            int r4 = r1.indexOf(r4)
            r1 = 90
            int r1 = r1 / 0
            if (r4 <= 0) goto L36
            goto L2b
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.List<java.lang.String> r1 = r3.ShareDataUIState
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L36
        L2b:
            java.util.List<java.lang.String> r1 = r3.ShareDataUIState
            int r4 = r4 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L37
        L36:
            r4 = 0
        L37:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L46
            r0 = 8
            int r0 = r0 / 0
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getPreviousScreen(java.lang.String):java.lang.String");
    }

    public final String getNextScreen(String screenName) {
        int i = 2 % 2;
        int i2 = copy + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        int iIndexOf = this.ShareDataUIState.indexOf(screenName);
        if (iIndexOf >= 0) {
            int i4 = getAsAtTimestamp + 35;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if (iIndexOf < this.ShareDataUIState.size() - 1) {
                return this.ShareDataUIState.get(iIndexOf + 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r4
  0x0027: PHI (r4v2 int) = (r4v1 int), (r4v9 int) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float getProgress(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int r4 = r3.getCurrentStep(r4)
            r1 = 93
            int r1 = r1 / 0
            if (r4 <= 0) goto L3e
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            int r4 = r3.getCurrentStep(r4)
            if (r4 <= 0) goto L3e
        L27:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L38
            float r4 = (float) r4
            int r1 = r3.component2
            float r1 = (float) r1
            float r4 = r4 * r1
            goto L3f
        L38:
            float r4 = (float) r4
            int r1 = r3.component2
            float r1 = (float) r1
            float r4 = r4 / r1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getAsAtTimestamp
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.copy = r2
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudReportJourney.getProgress(java.lang.String):float");
    }

    static {
        component4 = 1;
        copydefault();
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        $stable = 8;
        int i = copydefault + 51;
        component4 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public FraudReportJourney(String str, int i, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list);
    }

    static void copydefault() {
        component1 = -890926359;
    }
}
