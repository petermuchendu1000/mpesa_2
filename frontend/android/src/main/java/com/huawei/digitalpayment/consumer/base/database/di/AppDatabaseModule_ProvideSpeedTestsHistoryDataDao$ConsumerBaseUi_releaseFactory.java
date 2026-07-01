package com.huawei.digitalpayment.consumer.base.database.di;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory implements Factory<SpeedTestsHistoryDataDAO> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<AppDatabase> component2;

    @Override
    public Object get() throws Throwable {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component2 = provider;
    }

    @Override
    public SpeedTestsHistoryDataDAO get() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67, 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (19695 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getCapsMode("", 0, 0), 29 - Process.getGidForName(""), (char) Drawable.resolveOpacity(0, 0), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.US, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = -494;
        long j3 = -1;
        long j4 = (j2 * 1196148432110488531L) + (j2 * (-403444978466284107L)) + (((long) (-495)) * ((-360359515778048009L) ^ j3));
        long j5 = 495;
        long jNextInt = (((long) new Random().nextInt(986939109)) ^ j3) | 1196148432110488531L;
        long j6 = j4 + (j5 * jNextInt) + (j5 * ((j3 ^ jNextInt) | (((1196148432110488531L ^ j3) | (j3 ^ (-403444978466284107L))) ^ j3)));
        int i5 = 0;
        while (true) {
            int i6 = ShareDataUIState + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 != 8; i8++) {
                int i9 = ShareDataUIState + 113;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                i4 = (((((int) (j >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            int i11 = copydefault;
            int i12 = i11 + 107;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            i5++;
            int i14 = i11 + 15;
            ShareDataUIState = i14 % 128;
            int i15 = i14 % 2;
            j = j6;
        }
        if (i4 != i2) {
            int i16 = ShareDataUIState + 93;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 67, 33 - (KeyEvent.getMaxKeyCode() >> 16), (char) (19696 - (ViewConfiguration.getEdgeSlop() >> 16)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = -1;
            long j8 = ((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
            long j9 = 0;
            long j10 = (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32)) | j8;
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6618, TextUtils.indexOf("", "") + 42, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-526958899, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 55, (char) TextUtils.indexOf("", "", 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        SpeedTestsHistoryDataDAO speedTestsHistoryDataDAOProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_release = provideSpeedTestsHistoryDataDao$ConsumerBaseUi_release(this.component2.get());
        int i18 = copydefault + 87;
        ShareDataUIState = i18 % 128;
        if (i18 % 2 == 0) {
            return speedTestsHistoryDataDAOProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_release;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = ShareDataUIState + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideSpeedTestsHistoryDataDao$ConsumerBaseUi_releaseFactory;
    }

    public static SpeedTestsHistoryDataDAO provideSpeedTestsHistoryDataDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestsHistoryDataDAO speedTestsHistoryDataDAO = (SpeedTestsHistoryDataDAO) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideSpeedTestsHistoryDataDao$ConsumerBaseUi_release(appDatabase));
        if (i3 == 0) {
            return speedTestsHistoryDataDAO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
