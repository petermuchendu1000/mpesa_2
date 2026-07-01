package com.huawei.digitalpayment.consumer.service.iml;

import android.content.res.AssetFileDescriptor;
import android.media.SoundPool;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.push.constants.PushSPConstants;
import com.huawei.digitalpayment.consumer.service.IPushSoundService;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultPushSoundService;", "Lcom/huawei/digitalpayment/consumer/service/IPushSoundService;", "<init>", "()V", "soundPool", "Landroid/media/SoundPool;", "getSoundPool", "()Landroid/media/SoundPool;", "setSoundPool", "(Landroid/media/SoundPool;)V", "playSoundIfNeed", "", "sound", "", "soundText", "localSoundUrl", "playSoundBySoundUrl", PushSPConstants.KEY_SOUND_URL, "playSoundByTTS", "isAvailableSoundUrl", "", "playDefaultSound", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultPushSoundService implements IPushSoundService {
    private static int component1 = 1;
    private static int component2;
    private SoundPool ShareDataUIState = new SoundPool.Builder().setMaxStreams(1).build();

    protected final SoundPool getSoundPool() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        SoundPool soundPool = this.ShareDataUIState;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return soundPool;
    }

    protected final void setSoundPool(SoundPool soundPool) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = soundPool;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void playSoundIfNeed(String sound, String soundText, String localSoundUrl) {
        int i = 2 % 2;
        if (Intrinsics.areEqual(sound, "2")) {
            playSoundByTTS(soundText);
            return;
        }
        if (!Intrinsics.areEqual(sound, "3")) {
            if (isAvailableSoundUrl(sound)) {
                playSoundBySoundUrl(sound);
                return;
            }
            return;
        }
        int i2 = component2 + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            isAvailableSoundUrl(localSoundUrl);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!isAvailableSoundUrl(localSoundUrl)) {
            playDefaultSound();
            return;
        }
        playSoundBySoundUrl(localSoundUrl);
        int i3 = component2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public void playSoundBySoundUrl(String soundUrl) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        playDefaultSound();
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        int i5 = component1 + 11;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    protected void playSoundByTTS(String soundText) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        playDefaultSound();
        int i4 = component1 + 3;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean isAvailableSoundUrl(String soundUrl) {
        int i = 2 % 2;
        String str = soundUrl;
        if (str == null) {
            return false;
        }
        int i2 = component1 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() == 0) {
            int i4 = component1 + 11;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!StringsKt.endsWith(soundUrl, ".mp3", true)) {
            int i6 = component2 + 47;
            component1 = i6 % 128;
            if (i6 % 2 != 0 ? !StringsKt.endsWith(soundUrl, ".aac", true) : !StringsKt.endsWith(soundUrl, ".aac", true)) {
                if (!StringsKt.endsWith(soundUrl, ".wav", true)) {
                    int i7 = component2 + 81;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    if (!StringsKt.endsWith(soundUrl, ".ogg", true)) {
                        return false;
                    }
                }
            }
        }
        return StringsKt.startsWith$default(soundUrl, "http", false, 2, (Object) null) || StringsKt.startsWith$default(soundUrl, "h5://", false, 2, (Object) null);
    }

    private static final void component1(int[] iArr, SoundPool soundPool, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        int i6 = 2 % 2;
        int i7 = component1 + 51;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(soundPool, "");
            i3 = iArr[0];
            f = 0.0f;
            f2 = 1.0f;
            i4 = 0;
            i5 = 1;
            f3 = 2.0f;
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

    public void playDefaultSound() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                AssetFileDescriptor assetFileDescriptorOpenFd = Utils.getApp().getAssets().openFd("receive_alert.wav");
                Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "");
                SoundPool soundPool = this.ShareDataUIState;
                if (soundPool != null) {
                    int i3 = component1 + 103;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    final int[] iArr = {soundPool.load(assetFileDescriptorOpenFd, 1)};
                    SoundPool soundPool2 = this.ShareDataUIState;
                    if (soundPool2 != null) {
                        soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                            private static int ShareDataUIState = 0;
                            private static int component3 = 1;

                            @Override
                            public final void onLoadComplete(SoundPool soundPool3, int i5, int i6) {
                                int i7 = 2 % 2;
                                int i8 = ShareDataUIState + 13;
                                component3 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    DefaultPushSoundService.$r8$lambda$7Jyn0oTEy8yPmu1oXl55JPALJ2E(iArr, soundPool3, i5, i6);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                DefaultPushSoundService.$r8$lambda$7Jyn0oTEy8yPmu1oXl55JPALJ2E(iArr, soundPool3, i5, i6);
                                int i9 = ShareDataUIState + 95;
                                component3 = i9 % 128;
                                int i10 = i9 % 2;
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullExpressionValue(Utils.getApp().getAssets().openFd("receive_alert.wav"), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (IOException e) {
            L.d("DefaultPushSoundService", "playDefaultSound: " + e.getMessage());
        }
    }

    public static void $r8$lambda$7Jyn0oTEy8yPmu1oXl55JPALJ2E(int[] iArr, SoundPool soundPool, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        component1(iArr, soundPool, i, i2);
        if (i5 != 0) {
            throw null;
        }
    }
}
