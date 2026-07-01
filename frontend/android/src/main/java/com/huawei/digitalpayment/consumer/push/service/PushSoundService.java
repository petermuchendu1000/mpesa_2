package com.huawei.digitalpayment.consumer.push.service;

import android.media.SoundPool;
import android.speech.tts.TextToSpeech;
import com.blankj.utilcode.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.language.OnLanguageChangeListener;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.push.constants.PushSPConstants;
import com.huawei.digitalpayment.consumer.service.iml.DefaultPushSoundService;
import com.huawei.http.BaseRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010$\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0007H\u0014J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020,H\u0014J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0007H\u0002R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00064"}, d2 = {"Lcom/huawei/digitalpayment/consumer/push/service/PushSoundService;", "Lcom/huawei/digitalpayment/consumer/service/iml/DefaultPushSoundService;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "<init>", "()V", "downloadingSound", "", "", "Lcom/huawei/http/BaseRequest;", "getDownloadingSound", "()Ljava/util/Map;", "tts", "Landroid/speech/tts/TextToSpeech;", "getTts", "()Landroid/speech/tts/TextToSpeech;", "setTts", "(Landroid/speech/tts/TextToSpeech;)V", "isTTSInitSucceed", "", "()Z", "setTTSInitSucceed", "(Z)V", "cachedSoundText", "getCachedSoundText", "()Ljava/lang/String;", "setCachedSoundText", "(Ljava/lang/String;)V", "speakTimes", "", "getSpeakTimes", "()I", "setSpeakTimes", "(I)V", "playSoundByTTS", "", "soundText", "playSoundText", "onInit", "status", "playSoundBySoundUrl", PushSPConstants.KEY_SOUND_URL, "downloadSound", "url", "getLocalSoundFile", "Ljava/io/File;", "name", "playLocalSound", "file", "getLanguageLocale", "Ljava/util/Locale;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Companion", "CustomerPushModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PushSoundService extends DefaultPushSoundService implements TextToSpeech.OnInitListener {

    public static final Companion INSTANCE;
    public static final String PATH_SOUND_FILE = "sound/%s";
    public static final String TAG = "PushSoundService";
    private static int component4 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private String ShareDataUIState;
    private int component1;
    private TextToSpeech component2;
    private final Map<String, BaseRequest<?>> component3 = new LinkedHashMap();
    private boolean copydefault;

    public static final Locale access$getLanguageLocale(PushSoundService pushSoundService, String str) {
        int i = 2 % 2;
        int i2 = component4 + 35;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return pushSoundService.copydefault(str);
        }
        pushSoundService.copydefault(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$playDefaultSound(PushSoundService pushSoundService) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        pushSoundService.playDefaultSound();
        int i4 = getRequestBeneficiariesState + 69;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final Map<String, BaseRequest<?>> getDownloadingSound() {
        int i = 2 % 2;
        int i2 = component4 + 67;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Map<String, BaseRequest<?>> map = this.component3;
        int i5 = i3 + 97;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final TextToSpeech getTts() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        TextToSpeech textToSpeech = this.component2;
        int i5 = i2 + 17;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return textToSpeech;
        }
        throw null;
    }

    protected final void setTts(TextToSpeech textToSpeech) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.component2 = textToSpeech;
        int i5 = i3 + 31;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final boolean isTTSInitSucceed() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setTTSInitSucceed(boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = z;
        if (i3 == 0) {
            throw null;
        }
    }

    protected final String getCachedSoundText() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        int i3 = i2 % 128;
        component4 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 29;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    protected final void setCachedSoundText(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = str;
        int i5 = i3 + 27;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
    }

    protected final int getSpeakTimes() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 121;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    protected final void setSpeakTimes(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 89;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        this.component1 = i;
        if (i5 == 0) {
            int i6 = 20 / 0;
        }
        int i7 = i4 + 5;
        component4 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void playSoundByTTS(String soundText) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (this.component2 == null) {
            this.ShareDataUIState = soundText;
            this.component2 = new TextToSpeech(Utils.getApp(), this);
            LanguageUtils.getInstance().addCallBack(new OnLanguageChangeListener() {
                private static int ShareDataUIState = 1;
                private static int component1;

                @Override
                public void onLanguageChange(String oldLanguage, String newLanguage) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 123;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(newLanguage, "");
                        PushSoundService.this.getTts();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(newLanguage, "");
                    TextToSpeech tts = PushSoundService.this.getTts();
                    if (tts != null) {
                        tts.setLanguage(PushSoundService.access$getLanguageLocale(PushSoundService.this, newLanguage));
                        int i6 = component1 + 101;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            });
            return;
        }
        playSoundText(soundText);
        int i4 = component4 + 125;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void playSoundText(String soundText) {
        int i = 2 % 2;
        String str = soundText;
        if (str == null || StringsKt.isBlank(str) || !this.copydefault) {
            playDefaultSound();
            int i2 = component4 + 87;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = this.component1 + 1;
        this.component1 = i4;
        TextToSpeech textToSpeech = this.component2;
        if (textToSpeech != null) {
            int i5 = getRequestBeneficiariesState + 69;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                textToSpeech.speak(str, 1, null, String.valueOf(i4));
            } else {
                textToSpeech.speak(str, 1, null, String.valueOf(i4));
            }
        }
    }

    @Override
    public void onInit(int status) {
        int i = 2 % 2;
        L.d(TAG, "onInit status: " + status);
        if (status == 0) {
            TextToSpeech textToSpeech = this.component2;
            if (textToSpeech != null) {
                textToSpeech.setLanguage(copydefault(LanguageUtils.getInstance().getCurrentLang()));
            }
            this.copydefault = true;
            playSoundText(this.ShareDataUIState);
            return;
        }
        int i2 = getRequestBeneficiariesState + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        playDefaultSound();
        int i4 = getRequestBeneficiariesState + 107;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void playSoundBySoundUrl(String soundUrl) throws Throwable {
        int i = 2 % 2;
        String url = UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), soundUrl);
        String str = url;
        if (str == null || str.length() == 0) {
            super.playSoundBySoundUrl(soundUrl);
            return;
        }
        File localSoundFile = getLocalSoundFile(SPUtils.getInstance(PushSPConstants.SP_NAME_PUSH).getString(url));
        if (localSoundFile != null) {
            int i2 = component4 + 111;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                playLocalSound(localSoundFile);
                return;
            } else {
                playLocalSound(localSoundFile);
                int i3 = 83 / 0;
                return;
            }
        }
        if (this.component3.containsKey(url)) {
            int i4 = component4 + 13;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        downloadSound(url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.push.service.PushSoundService.component4 + 25;
        com.huawei.digitalpayment.consumer.push.service.PushSoundService.getRequestBeneficiariesState = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        com.huawei.common.util.L.d(com.huawei.digitalpayment.consumer.push.service.PushSoundService.TAG, "downloadSound fileName: " + r3);
        r0 = com.blankj.utilcode.util.Utils.getApp().getFilesDir();
        r2 = java.lang.String.format(com.huawei.digitalpayment.consumer.push.service.PushSoundService.PATH_SOUND_FILE, java.util.Arrays.copyOf(new java.lang.Object[]{r3}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r0 = new java.io.File(r0, r2).getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r6.component3.put(r7, new com.huawei.http.FileRequest(r0, false, false).method(com.huawei.http.BaseRequest.Method.GET).setUrl(r7).sendRequest(new com.huawei.digitalpayment.consumer.push.service.PushSoundService$downloadSound$request$1(r6, r7, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void downloadSound(final java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "PushSoundService"
            java.lang.String r1 = ""
            r2 = 2
            int r3 = r2 % r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "downloadSound url: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.huawei.common.util.L.d(r0, r3)
            android.net.Uri r3 = com.huawei.common.safe.SafeUri.parse(r7)
            if (r3 == 0) goto L9d
            int r4 = com.huawei.digitalpayment.consumer.push.service.PushSoundService.getRequestBeneficiariesState
            int r4 = r4 + 101
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.push.service.PushSoundService.component4 = r5
            int r4 = r4 % r2
            r5 = 0
            if (r4 == 0) goto L37
            java.lang.String r3 = r3.getLastPathSegment()
            r4 = 81
            int r4 = r4 / r5
            if (r3 != 0) goto L47
            goto L3d
        L37:
            java.lang.String r3 = r3.getLastPathSegment()
            if (r3 != 0) goto L47
        L3d:
            int r7 = com.huawei.digitalpayment.consumer.push.service.PushSoundService.component4
            int r7 = r7 + 25
            int r0 = r7 % 128
            com.huawei.digitalpayment.consumer.push.service.PushSoundService.getRequestBeneficiariesState = r0
            int r7 = r7 % r2
            goto L9d
        L47:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "downloadSound fileName: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.common.util.L.d(r0, r2)
            android.app.Application r0 = com.blankj.utilcode.util.Utils.getApp()
            java.io.File r0 = r0.getFilesDir()
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            r4 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r4 = "sound/%s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            java.io.File r4 = new java.io.File
            r4.<init>(r0, r2)
            java.lang.String r0 = r4.getAbsolutePath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.huawei.http.FileRequest r1 = new com.huawei.http.FileRequest
            r1.<init>(r0, r5, r5)
            com.huawei.http.BaseRequest$Method r0 = com.huawei.http.BaseRequest.Method.GET
            com.huawei.http.BaseRequest r0 = r1.method(r0)
            com.huawei.http.BaseRequest r0 = r0.setUrl(r7)
            com.huawei.digitalpayment.consumer.push.service.PushSoundService$downloadSound$request$1 r1 = new com.huawei.digitalpayment.consumer.push.service.PushSoundService$downloadSound$request$1
            r1.<init>()
            com.huawei.common.listener.ApiCallback r1 = (com.huawei.common.listener.ApiCallback) r1
            com.huawei.http.BaseRequest r0 = r0.sendRequest(r1)
            java.util.Map<java.lang.String, com.huawei.http.BaseRequest<?>> r1 = r6.component3
            r1.put(r7, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push.service.PushSoundService.downloadSound(java.lang.String):void");
    }

    protected File getLocalSoundFile(String name) {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            str = name;
            int i3 = 70 / 0;
            if (str == null) {
                return null;
            }
        } else {
            str = name;
            if (str == null) {
                return null;
            }
        }
        if (str.length() == 0) {
            return null;
        }
        File filesDir = Utils.getApp().getFilesDir();
        String str2 = String.format(PATH_SOUND_FILE, Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        File file = new File(filesDir, str2);
        if (!file.exists()) {
            return null;
        }
        int i4 = getRequestBeneficiariesState + 5;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    private static final void ShareDataUIState(int[] iArr, SoundPool soundPool, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        int i6 = 2 % 2;
        int i7 = getRequestBeneficiariesState + 41;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(soundPool, "");
            i3 = iArr[1];
            f = 2.0f;
            f2 = 2.0f;
            i4 = 0;
            i5 = 0;
            f3 = 0.0f;
        } else {
            Intrinsics.checkNotNullParameter(soundPool, "");
            i3 = iArr[0];
            f = 1.0f;
            f2 = 1.0f;
            i4 = 1;
            i5 = 0;
            f3 = 1.0f;
        }
        soundPool.play(i3, f, f2, i4, i5, f3);
    }

    protected void playLocalSound(File file) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        L.d(TAG, "playLocalSound: " + file);
        try {
            SoundPool soundPool = getSoundPool();
            if (soundPool == null) {
                int i2 = getRequestBeneficiariesState + 53;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = getRequestBeneficiariesState + 53;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            final int[] iArr = {soundPool.load(file.getAbsolutePath(), 2)};
            SoundPool soundPool2 = getSoundPool();
            if (soundPool2 != null) {
                soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    private static int component1 = 1;
                    private static int component2;

                    @Override
                    public final void onLoadComplete(SoundPool soundPool3, int i6, int i7) {
                        int i8 = 2 % 2;
                        int i9 = component1 + 103;
                        component2 = i9 % 128;
                        if (i9 % 2 != 0) {
                            PushSoundService.$r8$lambda$PpX04eELXBTZ1dpiSK0QR3W0crc(iArr, soundPool3, i6, i7);
                            int i10 = 13 / 0;
                        } else {
                            PushSoundService.$r8$lambda$PpX04eELXBTZ1dpiSK0QR3W0crc(iArr, soundPool3, i6, i7);
                        }
                        int i11 = component2 + 1;
                        component1 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                });
            }
        } catch (IOException e) {
            L.d(TAG, "playLocalSound: " + e.getMessage());
        }
    }

    private final Locale copydefault(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 65;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str2 = str;
        if (str2 != null) {
            int i5 = i2 + 97;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                if (str2.length() != 0) {
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "_", false, 2, (Object) null)) {
                        List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{"_"}, false, 0, 6, (Object) null);
                        return new Locale((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    }
                    return new Locale(str);
                }
            } else {
                str2.length();
                throw null;
            }
        }
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return locale;
    }

    public static void $r8$lambda$PpX04eELXBTZ1dpiSK0QR3W0crc(int[] iArr, SoundPool soundPool, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 3;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        ShareDataUIState(iArr, soundPool, i, i2);
        int i6 = getRequestBeneficiariesState + 57;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = copy + 41;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/push/service/PushSoundService$Companion;", "", "<init>", "()V", "TAG", "", "PATH_SOUND_FILE", "CustomerPushModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
