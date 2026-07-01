package com.huawei.digitalpayment.consumer.loginModule.mpin.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ModifySecurityResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.ModifySecurityParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ResetPinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H&J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00112\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "getQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionResp;", "resetPin", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ReSetPinParams;", "Lcom/huawei/http/BaseResp;", "queryList", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/QuerySecurityQuestionParams;", "changeSecurityQuestions", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/ModifySecurityParams;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/ModifySecurityResp;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ISecurityQuestionModel extends BaseModel {
    void changeSecurityQuestions(ModifySecurityParams params, ApiCallback<ModifySecurityResp> callback);

    void getQuestions(BaseRequestParams params, ApiCallback<List<LocalQuestionItem>> callback);

    void queryList(QuerySecurityQuestionParams params, ApiCallback<List<LocalQuestionItem>> callback);

    void resetPin(ReSetPinParams params, ApiCallback<BaseResp> callback);

    void verifyQuestion(VerifySecurityQuestionParams params, ApiCallback<VerifySecurityQuestionResp> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static final byte[] $$c = {75, -35, 114, TarHeader.LF_CHR};
        private static final int $$d = 227;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {79, 7, -80, -125, 35, Ascii.NAK, Ascii.SUB, Ascii.SYN, Ascii.SYN, Ascii.SO, 32, Ascii.GS, -43, 35, Ascii.NAK, Ascii.SUB, Ascii.SYN, Ascii.SYN, Ascii.SO, 32, Ascii.GS, -44, 35, Ascii.CAN, 32, 2, Ascii.CAN, Ascii.CAN, Ascii.DC2, 43, Ascii.SO, Ascii.US, 35, Ascii.CAN, 32};
        private static final int $$b = 80;
        private static int component1 = 0;
        private static int ShareDataUIState = 1;
        private static long component2 = -3780477796495014671L;
        private static int component3 = 1386857713;
        private static char copydefault = 55752;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, short r7, short r8) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel.DefaultImpls.$$c
                int r8 = 99 - r8
                int r7 = r7 * 4
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
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
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel.DefaultImpls.$$e(short, short, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel.DefaultImpls.$$a
                int r7 = r7 + 1
                int r8 = r8 * 2
                int r8 = 99 - r8
                int r9 = r9 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r9
                r5 = r2
                goto L28
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L22:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L28:
                int r9 = r9 + r8
                int r8 = r3 + 1
                int r9 = r9 + (-23)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel.DefaultImpls.b(int, int, int, java.lang.Object[]):void");
        }

        public static void resetPin(ISecurityQuestionModel iSecurityQuestionModel, ReSetPinParams reSetPinParams, ApiCallback<BaseResp> apiCallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(reSetPinParams, "");
            Intrinsics.checkNotNullParameter(apiCallback, "");
            iSecurityQuestionModel.sendRequest(new ResetPinRepository(reSetPinParams), apiCallback);
            int i2 = ShareDataUIState + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }

        private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr3.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c2);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            iNotificationSideChannel.copydefault = 0;
            int i5 = $10 + 37;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i7 = $10 + 61;
                $11 = i7 % 128;
                int i8 = i7 % i3;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionChild(0L) + 32, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19181), 1912513118, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {iNotificationSideChannel};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 2459, View.resolveSizeAndState(0, 0, 0) + 28, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 931716605, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                                if (objCopydefault4 == null) {
                                    i2 = 2;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - Color.argb(0, 0, 0, 0), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                                } else {
                                    i2 = 2;
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                                iNotificationSideChannel.copydefault++;
                                i3 = i2;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v16 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v56 */
        /* JADX WARN: Type inference failed for: r15v57 */
        /* JADX WARN: Type inference failed for: r15v58 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v63 */
        /* JADX WARN: Type inference failed for: r15v64 */
        /* JADX WARN: Type inference failed for: r15v65 */
        /* JADX WARN: Type inference failed for: r15v66 */
        /* JADX WARN: Type inference failed for: r15v67 */
        /* JADX WARN: Type inference failed for: r15v68 */
        /* JADX WARN: Type inference failed for: r15v69 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v70 */
        /* JADX WARN: Type inference failed for: r15v71 */
        /* JADX WARN: Type inference failed for: r15v72 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] component3(android.content.Context r31, int r32, int r33, int r34) {
            /*
                Method dump skipped, instruction units count: 2270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel.DefaultImpls.component3(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }
}
