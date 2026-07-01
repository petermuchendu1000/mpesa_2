package com.huawei.digitalpayment.consumer.remoteconfig.service;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.notify;

public abstract class Hilt_FirebaseNotificationService extends FirebaseMessagingService implements GeneratedComponentManagerHolder {
    private volatile ServiceComponentManager componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private static final byte[] $$z = {84, -122, 19, 43};
    private static final int $$A = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$v = {107, -21, -54, -113, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, Ascii.VT, -3, -64, 56, 1, 10, -13, Ascii.FF, -20, -53, TarHeader.LF_CHR, -2, Ascii.DLE, 1, -16, 5, 7, -17, -54, 65, -13, 1, Ascii.SI, -14, -5, 17, -19, Ascii.FF, -69, 70, -2, -12, 2, -63, 33, Ascii.DLE, 5, -3, -19, Ascii.NAK, Ascii.DLE, -22, -35, Ascii.GS, 10, -10, 17, -10, -12, Ascii.DC2, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67};
    private static final int $$w = 139;
    private static final byte[] $$j = {102, -86, -98, TarHeader.LF_DIR, -20, -6, -11, -7, -7, 1, -17, -14, 57, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 56, -20, -9, -17, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$k = 178;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static long copydefault = 4827747572444742214L;
    private static long component2 = -4481779119497307137L;

    private static String $$B(byte b2, short s, short s2) {
        int i = s * 4;
        int i2 = 4 - (b2 * 4);
        byte[] bArr = $$z;
        int i3 = s2 + 102;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 += -i4;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i2];
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void p(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.$$j
            int r7 = 99 - r7
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r0 = new byte[r0]
            int r8 = 27 - r8
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.p(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void q(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 43
            int r7 = 53 - r7
            int r9 = r9 * 2
            int r9 = 99 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.$$v
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.q(short, int, short, java.lang.Object[]):void");
    }

    @Override
    public GeneratedComponentManager componentManager() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ServiceComponentManager serviceComponentManagerComponentManager = componentManager();
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return serviceComponentManagerComponentManager;
    }

    @Override
    public void onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        inject();
        super.onCreate();
        int i4 = component3 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    protected ServiceComponentManager createComponentManager() {
        int i = 2 % 2;
        ServiceComponentManager serviceComponentManager = new ServiceComponentManager(this);
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return serviceComponentManager;
        }
        throw null;
    }

    @Override
    public final ServiceComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected void inject() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this.injected) {
            return;
        }
        int i5 = i2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        this.injected = true;
        ((FirebaseNotificationService_GeneratedInjector) generatedComponent()).injectFirebaseNotificationService((FirebaseNotificationService) UnsafeCasts.unsafeCast(this));
        int i7 = ShareDataUIState + 23;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 5;
        }
    }

    @Override
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = componentManager().generatedComponent();
        int i4 = component3 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    private static void n(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7031, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34, (char) (Color.argb(0, 0, 0, 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 1390, ExpandableListView.getPackedPositionChild(0L) + 19, (char) (51269 - TextUtils.getTrimmedLength("")), -1883291598, false, $$B(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 75;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    private static void o(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 113;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 3266, 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (60268 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), -834797019, false, $$B(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() / (copydefault / 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getSize(0) + 34, (char) (60373 - Color.green(0)), -1969106284, false, $$B(b4, b5, (byte) (b5 + 3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 3218, 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (60268 - View.resolveSize(0, 0)), -834797019, false, $$B(b6, b7, b7), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 34 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (KeyEvent.keyCodeFromString("") + 60373), -1969106284, false, $$B(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 688, 34 - Gravity.getAbsoluteGravity(0, 0), (char) (View.resolveSize(0, 0) + 60373), -1969106284, false, $$B(b10, b11, (byte) (b11 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i6 = $11 + 93;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|741|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|781|31|(2:780|33)|37|38|742|(5:40|41|(1:43)|44|45)(21:46|47|763|48|(2:791|50)|54|55|743|56|(2:801|58)|62|63|64|(1:66)|67|68|69|(1:71)|72|(1:74)|75)|76|(4:79|(3:819|81|822)(12:817|82|(3:84|(3:87|88|85)|823)|89|805|90|(1:92)|93|94|799|95|821)|820|77)|818|136|(9:798|137|(1:139)|140|(3:142|(1:144)|145)(19:146|147|789|148|(1:150)|151|152|774|153|(1:155)|156|157|158|(1:160)|161|(1:163)|164|(1:166)|167)|168|(4:172|(3:826|174|829)(12:825|175|(3:177|(3:180|181|178)|830)|182|761|183|(1:185)|186|187|745|188|828)|827|169)|824|171)|223|794|224|(1:226)|227|(1:229)|230|(20:(3:232|(1:234)|235)(7:236|(2:238|(1:244)(1:243))(1:245)|(18:247|783|248|(1:250)|251|252|767|253|(1:255)|256|257|258|(1:260)|261|(1:263)(1:264)|265|(1:267)|268)(36:328|795|329|(1:331)|332|333|(4:335|336|(1:338)|339)(14:341|342|785|343|(1:345)|346|347|348|(1:350)|351|(1:353)|354|(1:356)|357)|340|358|(9:361|770|362|(1:364)|365|366|367|759|368)|369|(18:793|400|(2:402|(3:404|(2:406|411)|410)(3:407|(2:409|411)|410))(1:411)|448|(1:450)|451|(1:453)|454|(3:456|(1:458)|459)(16:461|462|(1:464)|465|(1:467)|468|469|(1:471)|472|765|473|474|(1:476)|477|(1:479)|480)|460|481|(1:483)(9:484|(3:486|(2:489|487)|843)|490|491|(1:493)|494|(1:496)|497|498)|499|(1:501)|502|(3:504|(1:506)|507)(14:508|509|(1:511)|512|513|(1:515)|516|755|517|518|(1:520)|521|(1:523)|524)|525|(26:527|769|528|(1:530)|531|(1:533)|534|(3:536|(1:538)|539)(17:540|(2:542|(1:548)(1:547))|(19:550|551|751|552|(1:554)|555|556|813|557|(1:559)|560|561|562|(1:564)|565|(1:567)|568|(1:570)|571)|627|(1:629)|630|(3:632|(1:634)|635)(13:637|778|638|639|(1:641)|642|757|643|644|(1:646)|647|(1:649)|650)|636|651|(6:654|655|(1:657)|658|659|660)|661|(1:663)|664|(3:666|(1:668)|669)(14:671|672|(1:674)|675|676|(1:678)|679|739|680|681|(1:683)|684|(1:686)|687)|670|688|(1:844)(7:691|692|(1:694)|695|696|697|698))|572|(4:576|(3:837|578|840)(12:835|579|(3:581|(3:584|585|582)|841)|586|803|587|(1:589)|590|591|796|592|839)|838|573)|836|575|627|(0)|630|(0)(0)|636|651|(0)|661|(0)|664|(0)(0)|670|688|(0)(0))(10:708|(3:710|(2:713|711)|842)|714|715|(1:717)|718|(1:720)|721|722|723))(1:415)|416|747|417|(1:419)|420|811|421|(1:423)|424|448|(0)|451|(0)|454|(0)(0)|460|481|(0)(0)|499|(0)|502|(0)(0)|525|(0)(0))|27|28|733|(1:735)(1:736))|811|421|(0)|424|448|(0)|451|(0)|454|(0)(0)|460|481|(0)(0)|499|(0)|502|(0)(0)|525|(0)(0))|269|(4:272|(13:274|(3:276|279|833)|280|(3:282|(3:285|286|283)|834)|287|753|288|(1:290)|291|292|815|293|832)(2:277|(2:279|833)(11:280|(0)|287|753|288|(0)|291|292|815|293|832))|294|270)|831|328|795|329|(0)|332|333|(0)(0)|340|358|(0)|369|(0)(0)|416|747|417|(0)|420|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x1306, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x1307, code lost:
    
        r5 = new java.lang.Object[1];
        o((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 62188, new char[]{16991, 45237, 42885, 39582, 35297, 64762, 62417, 58927, 54583, 51215, 16150}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x1324, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x133b, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x133f, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r13 = 0;
        r3 = (((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)))) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x136f, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x1373, code lost:
    
        if (r1 == null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x1375, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) android.view.KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x139f, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x13a7, code lost:
    
        r7 = new java.lang.Object[]{-1471861596, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 6563, 56 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0));
        r3 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.$$v[17];
        r4 = (byte) (-r3);
        r8 = new java.lang.Object[1];
        q(r3, r4, (byte) (r4 + 1), r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x1789, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x178a, code lost:
    
        r5 = new java.lang.Object[1];
        n(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).length() - 1, new char[]{39138, 39123, 59805, 43970, 24260, 48263, 17763, 50479, 52186, 35213, 40641, 39674, 9123, 11298, 61271}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x17d0, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x17e7, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x17eb, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r13 = 0;
        r3 = (((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)))) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x181b, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x181f, code lost:
    
        if (r1 == null) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x1821, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6617 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), 42 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x184b, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x1853, code lost:
    
        r7 = new java.lang.Object[]{-1471861596, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.KeyEvent.normalizeMetaState(0) + 6562, 56 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
        r3 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.$$v[17];
        r4 = (byte) (-r3);
        r8 = new java.lang.Object[1];
        q(r3, r4, (byte) (r4 + 1), r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x18c7, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.component3 + 9;
        com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07d6 A[Catch: all -> 0x0321, TryCatch #2 {all -> 0x0321, blocks: (B:655:0x2dcf, B:657:0x2dd5, B:658:0x2dfe, B:692:0x3101, B:694:0x3107, B:695:0x3129, B:672:0x2f4d, B:674:0x2f70, B:675:0x2fbc, B:621:0x2a95, B:623:0x2a9b, B:624:0x2ac3, B:715:0x3206, B:717:0x320c, B:718:0x3231, B:720:0x326b, B:721:0x32af, B:509:0x2314, B:511:0x2329, B:512:0x2355, B:491:0x2010, B:493:0x2016, B:494:0x2042, B:496:0x207c, B:497:0x20c7, B:462:0x1cab, B:464:0x1cc0, B:465:0x1cee, B:467:0x1d22, B:468:0x1d93, B:442:0x1a50, B:444:0x1a56, B:445:0x1a7e, B:392:0x181b, B:394:0x1821, B:395:0x184b, B:322:0x136f, B:324:0x1375, B:325:0x139f, B:217:0x0cf4, B:219:0x0cfa, B:220:0x0d21, B:130:0x07d0, B:132:0x07d6, B:133:0x0803, B:17:0x014b, B:19:0x0151, B:20:0x017d, B:22:0x0292, B:24:0x02c3, B:25:0x031b, B:528:0x2579, B:530:0x257f, B:531:0x25c5, B:533:0x25ec, B:534:0x2630, B:536:0x2646, B:538:0x264f, B:539:0x2694, B:572:0x28eb, B:573:0x28ef, B:576:0x28f9, B:579:0x2911, B:582:0x2927, B:584:0x292a, B:596:0x2a0c, B:598:0x2a12, B:599:0x2a13, B:601:0x2a15, B:603:0x2a1c, B:604:0x2a1d, B:542:0x26a3, B:544:0x26a7, B:548:0x26b3, B:550:0x26b9, B:562:0x27c9, B:564:0x27cf, B:565:0x2815, B:567:0x283f, B:568:0x2886, B:570:0x289c, B:571:0x28e5, B:606:0x2a1f, B:608:0x2a26, B:609:0x2a27, B:611:0x2a29, B:613:0x2a30, B:614:0x2a31, B:400:0x18d5, B:404:0x18e6, B:428:0x19de, B:430:0x19e4, B:431:0x19e5, B:433:0x19e7, B:435:0x19ee, B:436:0x19ef, B:407:0x18f4, B:411:0x1900, B:224:0x0da9, B:226:0x0daf, B:227:0x0df5, B:229:0x0e1c, B:230:0x0e69, B:232:0x0e7f, B:234:0x0e88, B:235:0x0ecc, B:269:0x119f, B:270:0x11a3, B:274:0x11b5, B:280:0x11e8, B:283:0x11f4, B:285:0x11f7, B:297:0x12e0, B:299:0x12e6, B:300:0x12e7, B:302:0x12e9, B:304:0x12f0, B:305:0x12f1, B:277:0x11ce, B:238:0x0edf, B:240:0x0ee3, B:247:0x0ef7, B:258:0x1071, B:260:0x1077, B:261:0x10be, B:263:0x10e8, B:265:0x113e, B:267:0x1155, B:268:0x1199, B:307:0x12f3, B:309:0x12fa, B:310:0x12fb, B:312:0x12fd, B:314:0x1304, B:315:0x1305, B:244:0x0eef, B:329:0x141d, B:331:0x1423, B:332:0x1466, B:336:0x1480, B:338:0x1486, B:339:0x14cb, B:358:0x1676, B:366:0x16e5, B:372:0x176d, B:374:0x1773, B:375:0x1774, B:377:0x1776, B:379:0x177d, B:380:0x177e, B:341:0x14d7, B:348:0x155f, B:350:0x1565, B:351:0x15a8, B:353:0x15d2, B:354:0x1612, B:356:0x1628, B:357:0x166e, B:382:0x1780, B:384:0x1787, B:385:0x1788, B:137:0x087f, B:139:0x0885, B:140:0x08c7, B:142:0x08d4, B:144:0x08dd, B:145:0x0924, B:168:0x0b4a, B:169:0x0b4e, B:172:0x0b58, B:175:0x0b6f, B:178:0x0b7c, B:180:0x0b7f, B:192:0x0c66, B:194:0x0c6c, B:195:0x0c6d, B:197:0x0c6f, B:199:0x0c76, B:200:0x0c77, B:146:0x092f, B:158:0x0a31, B:160:0x0a37, B:161:0x0a7b, B:163:0x0aa5, B:164:0x0ae9, B:166:0x0aff, B:167:0x0b44, B:202:0x0c79, B:204:0x0c80, B:205:0x0c81, B:207:0x0c83, B:209:0x0c8a, B:210:0x0c8b), top: B:741:0x014b, inners: #17, #30, #31, #32, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0daf A[Catch: all -> 0x1306, TryCatch #31 {all -> 0x1306, blocks: (B:224:0x0da9, B:226:0x0daf, B:227:0x0df5, B:229:0x0e1c, B:230:0x0e69, B:232:0x0e7f, B:234:0x0e88, B:235:0x0ecc, B:269:0x119f, B:270:0x11a3, B:274:0x11b5, B:280:0x11e8, B:283:0x11f4, B:285:0x11f7, B:297:0x12e0, B:299:0x12e6, B:300:0x12e7, B:302:0x12e9, B:304:0x12f0, B:305:0x12f1, B:277:0x11ce, B:238:0x0edf, B:240:0x0ee3, B:247:0x0ef7, B:258:0x1071, B:260:0x1077, B:261:0x10be, B:263:0x10e8, B:265:0x113e, B:267:0x1155, B:268:0x1199, B:307:0x12f3, B:309:0x12fa, B:310:0x12fb, B:312:0x12fd, B:314:0x1304, B:315:0x1305, B:244:0x0eef, B:288:0x1225, B:290:0x122b, B:291:0x1251, B:253:0x0fc8, B:255:0x0fec, B:256:0x1065, B:248:0x0f7d, B:250:0x0f91, B:251:0x0fc1, B:293:0x1263), top: B:794:0x0da9, outer: #2, inners: #9, #16, #25, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0e1c A[Catch: all -> 0x1306, TryCatch #31 {all -> 0x1306, blocks: (B:224:0x0da9, B:226:0x0daf, B:227:0x0df5, B:229:0x0e1c, B:230:0x0e69, B:232:0x0e7f, B:234:0x0e88, B:235:0x0ecc, B:269:0x119f, B:270:0x11a3, B:274:0x11b5, B:280:0x11e8, B:283:0x11f4, B:285:0x11f7, B:297:0x12e0, B:299:0x12e6, B:300:0x12e7, B:302:0x12e9, B:304:0x12f0, B:305:0x12f1, B:277:0x11ce, B:238:0x0edf, B:240:0x0ee3, B:247:0x0ef7, B:258:0x1071, B:260:0x1077, B:261:0x10be, B:263:0x10e8, B:265:0x113e, B:267:0x1155, B:268:0x1199, B:307:0x12f3, B:309:0x12fa, B:310:0x12fb, B:312:0x12fd, B:314:0x1304, B:315:0x1305, B:244:0x0eef, B:288:0x1225, B:290:0x122b, B:291:0x1251, B:253:0x0fc8, B:255:0x0fec, B:256:0x1065, B:248:0x0f7d, B:250:0x0f91, B:251:0x0fc1, B:293:0x1263), top: B:794:0x0da9, outer: #2, inners: #9, #16, #25, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0e7f A[Catch: all -> 0x1306, TryCatch #31 {all -> 0x1306, blocks: (B:224:0x0da9, B:226:0x0daf, B:227:0x0df5, B:229:0x0e1c, B:230:0x0e69, B:232:0x0e7f, B:234:0x0e88, B:235:0x0ecc, B:269:0x119f, B:270:0x11a3, B:274:0x11b5, B:280:0x11e8, B:283:0x11f4, B:285:0x11f7, B:297:0x12e0, B:299:0x12e6, B:300:0x12e7, B:302:0x12e9, B:304:0x12f0, B:305:0x12f1, B:277:0x11ce, B:238:0x0edf, B:240:0x0ee3, B:247:0x0ef7, B:258:0x1071, B:260:0x1077, B:261:0x10be, B:263:0x10e8, B:265:0x113e, B:267:0x1155, B:268:0x1199, B:307:0x12f3, B:309:0x12fa, B:310:0x12fb, B:312:0x12fd, B:314:0x1304, B:315:0x1305, B:244:0x0eef, B:288:0x1225, B:290:0x122b, B:291:0x1251, B:253:0x0fc8, B:255:0x0fec, B:256:0x1065, B:248:0x0f7d, B:250:0x0f91, B:251:0x0fc1, B:293:0x1263), top: B:794:0x0da9, outer: #2, inners: #9, #16, #25, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0edb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x11f3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x122b A[Catch: all -> 0x12e8, TryCatch #9 {all -> 0x12e8, blocks: (B:288:0x1225, B:290:0x122b, B:291:0x1251), top: B:753:0x1225, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1423 A[Catch: all -> 0x1789, TryCatch #32 {all -> 0x1789, blocks: (B:329:0x141d, B:331:0x1423, B:332:0x1466, B:336:0x1480, B:338:0x1486, B:339:0x14cb, B:358:0x1676, B:366:0x16e5, B:372:0x176d, B:374:0x1773, B:375:0x1774, B:377:0x1776, B:379:0x177d, B:380:0x177e, B:341:0x14d7, B:348:0x155f, B:350:0x1565, B:351:0x15a8, B:353:0x15d2, B:354:0x1612, B:356:0x1628, B:357:0x166e, B:382:0x1780, B:384:0x1787, B:385:0x1788, B:368:0x16eb, B:362:0x16aa, B:364:0x16b0, B:365:0x16de, B:343:0x14f7, B:345:0x1509, B:346:0x1553), top: B:795:0x141d, outer: #2, inners: #12, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1473  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x14d7 A[Catch: all -> 0x1789, TRY_LEAVE, TryCatch #32 {all -> 0x1789, blocks: (B:329:0x141d, B:331:0x1423, B:332:0x1466, B:336:0x1480, B:338:0x1486, B:339:0x14cb, B:358:0x1676, B:366:0x16e5, B:372:0x176d, B:374:0x1773, B:375:0x1774, B:377:0x1776, B:379:0x177d, B:380:0x177e, B:341:0x14d7, B:348:0x155f, B:350:0x1565, B:351:0x15a8, B:353:0x15d2, B:354:0x1612, B:356:0x1628, B:357:0x166e, B:382:0x1780, B:384:0x1787, B:385:0x1788, B:368:0x16eb, B:362:0x16aa, B:364:0x16b0, B:365:0x16de, B:343:0x14f7, B:345:0x1509, B:346:0x1553), top: B:795:0x141d, outer: #2, inners: #12, #18, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1688  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x190a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1921 A[Catch: all -> 0x19e6, TryCatch #6 {all -> 0x19e6, blocks: (B:417:0x190c, B:419:0x1921, B:420:0x194f), top: B:747:0x190c, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1962 A[Catch: all -> 0x19dc, TryCatch #41 {all -> 0x19dc, blocks: (B:421:0x1955, B:423:0x1962, B:424:0x19d4), top: B:811:0x1955, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1b05  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1b6b  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1bc6  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1c8d  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1eca  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1fd0  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x21e1  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x222b  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x22f4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x248d  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x2b49  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x2b9b  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2bf5  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2dac  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x2e87  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x2ed7  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x2f2f  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x30e3  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x31c5  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x3346  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x3347  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x18d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:844:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v33 */
    /* JADX WARN: Type inference failed for: r28v34 */
    /* JADX WARN: Type inference failed for: r28v66 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v265 */
    /* JADX WARN: Type inference failed for: r7v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v84, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.service.Hilt_FirebaseNotificationService.attachBaseContext(android.content.Context):void");
    }
}
