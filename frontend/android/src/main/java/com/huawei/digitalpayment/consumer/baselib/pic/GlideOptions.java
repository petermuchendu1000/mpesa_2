package com.huawei.digitalpayment.consumer.baselib.pic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class GlideOptions extends RequestOptions implements Cloneable {
    private static GlideOptions ShareDataUIState = null;
    private static GlideOptions component1 = null;
    private static GlideOptions component2 = null;
    private static GlideOptions component3 = null;
    private static GlideOptions copy = null;
    private static GlideOptions copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp;

    @Override
    public BaseRequestOptions apply(BaseRequestOptions baseRequestOptions) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsApply = apply((BaseRequestOptions<?>) baseRequestOptions);
        int i4 = equals + 21;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsApply;
    }

    @Override
    public BaseRequestOptions autoClone() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsAutoClone = autoClone();
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return glideOptionsAutoClone;
    }

    @Override
    public BaseRequestOptions centerCrop() {
        int i = 2 % 2;
        int i2 = equals + 83;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsCenterCrop = centerCrop();
        int i4 = equals + 75;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsCenterCrop;
    }

    @Override
    public BaseRequestOptions centerInside() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsCenterInside = centerInside();
        int i4 = equals + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsCenterInside;
    }

    @Override
    public BaseRequestOptions circleCrop() {
        int i = 2 % 2;
        int i2 = equals + 87;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return circleCrop();
        }
        circleCrop();
        throw null;
    }

    @Override
    public BaseRequestOptions mo9670clone() {
        int i = 2 % 2;
        int i2 = equals + 53;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return mo9670clone();
        }
        mo9670clone();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Object mo9670clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = equals + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsMo9670clone = mo9670clone();
        int i4 = getAsAtTimestamp + 55;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsMo9670clone;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions decode(Class cls) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsDecode = decode((Class<?>) cls);
        int i4 = equals + 67;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptionsDecode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions disallowHardwareConfig() {
        int i = 2 % 2;
        int i2 = equals + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsDisallowHardwareConfig = disallowHardwareConfig();
        int i4 = getAsAtTimestamp + 37;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsDisallowHardwareConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsDiskCacheStrategy = diskCacheStrategy(diskCacheStrategy);
        int i4 = equals + 97;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsDiskCacheStrategy;
    }

    @Override
    public BaseRequestOptions dontAnimate() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsDontAnimate = dontAnimate();
        int i4 = getAsAtTimestamp + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsDontAnimate;
    }

    @Override
    public BaseRequestOptions dontTransform() {
        int i = 2 % 2;
        int i2 = equals + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            dontTransform();
            throw null;
        }
        GlideOptions glideOptionsDontTransform = dontTransform();
        int i3 = equals + 109;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return glideOptionsDontTransform;
    }

    @Override
    public BaseRequestOptions downsample(DownsampleStrategy downsampleStrategy) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsDownsample = downsample(downsampleStrategy);
        int i4 = equals + 81;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptionsDownsample;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions encodeFormat(Bitmap.CompressFormat compressFormat) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsEncodeFormat = encodeFormat(compressFormat);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return glideOptionsEncodeFormat;
    }

    @Override
    public BaseRequestOptions encodeQuality(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 123;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptionsEncodeQuality = encodeQuality(i);
        int i5 = equals + 87;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return glideOptionsEncodeQuality;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions error(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 15;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            error(i);
            throw null;
        }
        GlideOptions glideOptionsError = error(i);
        int i4 = getAsAtTimestamp + 43;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsError;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions error(Drawable drawable) {
        int i = 2 % 2;
        int i2 = equals + 43;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsError = error(drawable);
        int i4 = getAsAtTimestamp + 3;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsError;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions fallback(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 35;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            fallback(i);
            throw null;
        }
        GlideOptions glideOptionsFallback = fallback(i);
        int i4 = equals + 51;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsFallback;
    }

    @Override
    public BaseRequestOptions fallback(Drawable drawable) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsFallback = fallback(drawable);
        int i4 = getAsAtTimestamp + 39;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return glideOptionsFallback;
    }

    @Override
    public BaseRequestOptions fitCenter() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            fitCenter();
            throw null;
        }
        GlideOptions glideOptionsFitCenter = fitCenter();
        int i3 = equals + 25;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return glideOptionsFitCenter;
    }

    @Override
    public BaseRequestOptions format(DecodeFormat decodeFormat) {
        int i = 2 % 2;
        int i2 = equals + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = format(decodeFormat);
        int i4 = getAsAtTimestamp + 5;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions frame(long j) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsFrame = frame(j);
        int i4 = equals + 71;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return glideOptionsFrame;
    }

    @Override
    public BaseRequestOptions lock() {
        int i = 2 % 2;
        int i2 = equals + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsLock = lock();
        int i4 = getAsAtTimestamp + 31;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsLock;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions onlyRetrieveFromCache(boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsOnlyRetrieveFromCache = onlyRetrieveFromCache(z);
        int i4 = equals + 49;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptionsOnlyRetrieveFromCache;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions optionalCenterCrop() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsOptionalCenterCrop = optionalCenterCrop();
        int i4 = getAsAtTimestamp + 17;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsOptionalCenterCrop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions optionalCenterInside() {
        GlideOptions glideOptionsOptionalCenterInside;
        int i = 2 % 2;
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            glideOptionsOptionalCenterInside = optionalCenterInside();
            int i3 = 89 / 0;
        } else {
            glideOptionsOptionalCenterInside = optionalCenterInside();
        }
        int i4 = equals + 71;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return glideOptionsOptionalCenterInside;
    }

    @Override
    public BaseRequestOptions optionalCircleCrop() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsOptionalCircleCrop = optionalCircleCrop();
        int i4 = equals + 85;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsOptionalCircleCrop;
    }

    @Override
    public BaseRequestOptions optionalFitCenter() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            optionalFitCenter();
            throw null;
        }
        GlideOptions glideOptionsOptionalFitCenter = optionalFitCenter();
        int i3 = getAsAtTimestamp + 123;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return glideOptionsOptionalFitCenter;
    }

    @Override
    public BaseRequestOptions optionalTransform(Transformation transformation) {
        int i = 2 % 2;
        int i2 = equals + 83;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsOptionalTransform = optionalTransform((Transformation<Bitmap>) transformation);
        int i4 = getAsAtTimestamp + 101;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptionsOptionalTransform;
    }

    @Override
    public BaseRequestOptions optionalTransform(Class cls, Transformation transformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsOptionalTransform = optionalTransform(cls, transformation);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = getAsAtTimestamp + 57;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return glideOptionsOptionalTransform;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions override(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 99;
        equals = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptionsOverride = override(i);
        int i5 = getAsAtTimestamp + 17;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return glideOptionsOverride;
    }

    @Override
    public BaseRequestOptions override(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        GlideOptions glideOptionsOverride = override(i, i2);
        int i6 = equals + 1;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return glideOptionsOverride;
    }

    @Override
    public BaseRequestOptions placeholder(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 29;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            placeholder(i);
            obj.hashCode();
            throw null;
        }
        GlideOptions glideOptionsPlaceholder = placeholder(i);
        int i4 = getAsAtTimestamp + 59;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsPlaceholder;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions placeholder(Drawable drawable) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return placeholder(drawable);
        }
        placeholder(drawable);
        throw null;
    }

    @Override
    public BaseRequestOptions priority(Priority priority) {
        int i = 2 % 2;
        int i2 = equals + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsPriority = priority(priority);
        int i4 = getAsAtTimestamp + 115;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsPriority;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions set(Option option, Object obj) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            set((Option<Object>) option, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        GlideOptions glideOptions = set((Option<Object>) option, obj);
        int i3 = getAsAtTimestamp + 1;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return glideOptions;
    }

    @Override
    public BaseRequestOptions signature(Key key) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsSignature = signature(key);
        int i4 = getAsAtTimestamp + 93;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return glideOptionsSignature;
    }

    @Override
    public BaseRequestOptions sizeMultiplier(float f) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsSizeMultiplier = sizeMultiplier(f);
        int i4 = getAsAtTimestamp + 13;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return glideOptionsSizeMultiplier;
    }

    @Override
    public BaseRequestOptions skipMemoryCache(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsSkipMemoryCache = skipMemoryCache(z);
        int i4 = getAsAtTimestamp + 21;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsSkipMemoryCache;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions theme(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = equals + 79;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsTheme = theme(theme);
        int i4 = equals + 119;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptionsTheme;
        }
        throw null;
    }

    @Override
    public BaseRequestOptions timeout(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 117;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return timeout(i);
        }
        timeout(i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions transform(Transformation transformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return transform((Transformation<Bitmap>) transformation);
        }
        transform((Transformation<Bitmap>) transformation);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions transform(Class cls, Transformation transformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            transform(cls, transformation);
            throw null;
        }
        GlideOptions glideOptionsTransform = transform(cls, transformation);
        int i3 = getAsAtTimestamp + 57;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return glideOptionsTransform;
    }

    @Override
    @SafeVarargs
    public BaseRequestOptions transform(Transformation[] transformationArr) {
        int i = 2 % 2;
        int i2 = equals + 49;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return transform((Transformation<Bitmap>[]) transformationArr);
        }
        transform((Transformation<Bitmap>[]) transformationArr);
        throw null;
    }

    @Override
    @SafeVarargs
    @Deprecated
    public BaseRequestOptions transforms(Transformation[] transformationArr) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsTransforms = transforms((Transformation<Bitmap>[]) transformationArr);
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return glideOptionsTransforms;
    }

    @Override
    public BaseRequestOptions useAnimationPool(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsUseAnimationPool = useAnimationPool(z);
        int i4 = getAsAtTimestamp + 107;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptionsUseAnimationPool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public BaseRequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptionsUseUnlimitedSourceGeneratorsPool = useUnlimitedSourceGeneratorsPool(z);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = equals + 93;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return glideOptionsUseUnlimitedSourceGeneratorsPool;
    }

    public static GlideOptions sizeMultiplierOf(float f) {
        int i = 2 % 2;
        GlideOptions glideOptionsSizeMultiplier = new GlideOptions().sizeMultiplier(f);
        int i2 = getAsAtTimestamp + 83;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return glideOptionsSizeMultiplier;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GlideOptions diskCacheStrategyOf(DiskCacheStrategy diskCacheStrategy) throws Throwable {
        int i = 2 % 2;
        GlideOptions glideOptionsDiskCacheStrategy = new GlideOptions().diskCacheStrategy(diskCacheStrategy);
        int i2 = getAsAtTimestamp + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsDiskCacheStrategy;
    }

    public static GlideOptions priorityOf(Priority priority) {
        int i = 2 % 2;
        GlideOptions glideOptionsPriority = new GlideOptions().priority(priority);
        int i2 = getAsAtTimestamp + 19;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return glideOptionsPriority;
        }
        throw null;
    }

    public static GlideOptions placeholderOf(Drawable drawable) {
        int i = 2 % 2;
        GlideOptions glideOptionsPlaceholder = new GlideOptions().placeholder(drawable);
        int i2 = getAsAtTimestamp + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsPlaceholder;
    }

    public static GlideOptions placeholderOf(int i) {
        int i2 = 2 % 2;
        GlideOptions glideOptionsPlaceholder = new GlideOptions().placeholder(i);
        int i3 = equals + 103;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return glideOptionsPlaceholder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GlideOptions errorOf(Drawable drawable) {
        int i = 2 % 2;
        GlideOptions glideOptionsError = new GlideOptions().error(drawable);
        int i2 = getAsAtTimestamp + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsError;
    }

    public static GlideOptions errorOf(int i) {
        int i2 = 2 % 2;
        GlideOptions glideOptionsError = new GlideOptions().error(i);
        int i3 = equals + 31;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return glideOptionsError;
    }

    public static GlideOptions skipMemoryCacheOf(boolean z) {
        int i = 2 % 2;
        GlideOptions glideOptionsSkipMemoryCache = new GlideOptions().skipMemoryCache(z);
        int i2 = equals + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return glideOptionsSkipMemoryCache;
        }
        throw null;
    }

    public static GlideOptions overrideOf(int i, int i2) {
        int i3 = 2 % 2;
        GlideOptions glideOptionsOverride = new GlideOptions().override(i, i2);
        int i4 = equals + 27;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptionsOverride;
        }
        throw null;
    }

    public static GlideOptions overrideOf(int i) {
        int i2 = 2 % 2;
        GlideOptions glideOptionsOverride = new GlideOptions().override(i);
        int i3 = equals + 35;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return glideOptionsOverride;
        }
        throw null;
    }

    public static GlideOptions signatureOf(Key key) {
        int i = 2 % 2;
        GlideOptions glideOptionsSignature = new GlideOptions().signature(key);
        int i2 = equals + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return glideOptionsSignature;
        }
        throw null;
    }

    public static GlideOptions fitCenterTransform() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (component3 == null) {
                component3 = new GlideOptions().fitCenter().autoClone();
            }
            GlideOptions glideOptions = component3;
            int i3 = equals + 87;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                return glideOptions;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    public static GlideOptions centerInsideTransform() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (copydefault == null) {
                copydefault = new GlideOptions().centerInside().autoClone();
            }
            GlideOptions glideOptions = copydefault;
            int i3 = equals + 63;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
            }
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GlideOptions centerCropTransform() {
        int i = 2 % 2;
        int i2 = equals + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (component2 == null) {
            component2 = new GlideOptions().centerCrop().autoClone();
        }
        GlideOptions glideOptions = component2;
        int i4 = equals + 57;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    public static GlideOptions circleCropTransform() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (component1 == null) {
                component1 = new GlideOptions().circleCrop().autoClone();
                int i3 = getAsAtTimestamp + 89;
                equals = i3 % 128;
                int i4 = i3 % 2;
            }
            return component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GlideOptions bitmapTransform(Transformation<Bitmap> transformation) {
        int i = 2 % 2;
        GlideOptions glideOptionsTransform = new GlideOptions().transform(transformation);
        int i2 = equals + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsTransform;
    }

    public static GlideOptions noTransformation() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (copy == null) {
                copy = new GlideOptions().dontTransform().autoClone();
            }
            GlideOptions glideOptions = copy;
            int i3 = equals + 19;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                return glideOptions;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public static <T> GlideOptions option(Option<T> option, T t) {
        int i = 2 % 2;
        GlideOptions glideOptions = new GlideOptions().set(option, t);
        int i2 = getAsAtTimestamp + 121;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return glideOptions;
    }

    public static GlideOptions decodeTypeOf(Class<?> cls) {
        int i = 2 % 2;
        GlideOptions glideOptionsDecode = new GlideOptions().decode(cls);
        int i2 = equals + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsDecode;
    }

    public static GlideOptions formatOf(DecodeFormat decodeFormat) {
        int i = 2 % 2;
        GlideOptions glideOptions = new GlideOptions().format(decodeFormat);
        int i2 = getAsAtTimestamp + 83;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    public static GlideOptions frameOf(long j) {
        int i = 2 % 2;
        GlideOptions glideOptionsFrame = new GlideOptions().frame(j);
        int i2 = equals + 69;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return glideOptionsFrame;
    }

    public static GlideOptions downsampleOf(DownsampleStrategy downsampleStrategy) {
        int i = 2 % 2;
        GlideOptions glideOptionsDownsample = new GlideOptions().downsample(downsampleStrategy);
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsDownsample;
    }

    public static GlideOptions timeoutOf(int i) {
        int i2 = 2 % 2;
        GlideOptions glideOptionsTimeout = new GlideOptions().timeout(i);
        int i3 = getAsAtTimestamp + 13;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 62 / 0;
        }
        return glideOptionsTimeout;
    }

    public static GlideOptions encodeQualityOf(int i) {
        int i2 = 2 % 2;
        GlideOptions glideOptionsEncodeQuality = new GlideOptions().encodeQuality(i);
        int i3 = equals + 77;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return glideOptionsEncodeQuality;
    }

    public static GlideOptions encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        int i = 2 % 2;
        GlideOptions glideOptionsEncodeFormat = new GlideOptions().encodeFormat(compressFormat);
        int i2 = getAsAtTimestamp + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return glideOptionsEncodeFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions noAnimation() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.getAsAtTimestamp
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r1 = com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.ShareDataUIState
            r2 = 87
            int r2 = r2 / 0
            if (r1 != 0) goto L33
            goto L1b
        L17:
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r1 = com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.ShareDataUIState
            if (r1 != 0) goto L33
        L1b:
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r1 = new com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions
            r1.<init>()
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r1 = r1.dontAnimate()
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r1 = r1.autoClone()
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.ShareDataUIState = r1
            int r1 = com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.getAsAtTimestamp
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.equals = r2
            int r1 = r1 % r0
        L33:
            com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions r0 = com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.ShareDataUIState
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions.noAnimation():com.huawei.digitalpayment.consumer.baselib.pic.GlideOptions");
    }

    @Override
    public GlideOptions sizeMultiplier(float f) {
        int i = 2 % 2;
        int i2 = equals + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.sizeMultiplier(f);
        int i4 = getAsAtTimestamp + 91;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z);
        if (i3 == 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions useAnimationPool(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 27;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.useAnimationPool(z);
        int i4 = getAsAtTimestamp + 107;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions onlyRetrieveFromCache(boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.onlyRetrieveFromCache(z);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = equals + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 68, 32 - Process.getGidForName(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19695), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, TextUtils.getTrimmedLength("") + 30, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, TextUtils.indexOf("", "") + 30, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 803637249790795283L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = (j3 | jIdentityHashCode) ^ j2;
        long j5 = 140;
        long j6 = j2 ^ (-10933796146590859L);
        long j7 = (((long) 141) * 803637249790795283L) + (((long) (-139)) * (-10933796146590859L)) + (((long) (-280)) * (((j3 | (-10933796146590859L)) ^ j2) | j4)) + ((j4 | ((j6 | jIdentityHashCode) ^ j2)) * j5);
        long j8 = ((j3 | j6) | jIdentityHashCode) ^ j2;
        long j9 = jIdentityHashCode ^ j2;
        long j10 = j7 + (j5 * (j8 | (((j3 | j9) | (-10933796146590859L)) ^ j2) | (j2 ^ ((j6 | j9) | 803637249790795283L))));
        int i7 = 0;
        int i8 = i6;
        while (true) {
            int i9 = 0;
            while (i9 != 8) {
                i8 = (((((int) (j >> i9)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                i9++;
                int i10 = getAsAtTimestamp + 15;
                equals = i10 % 128;
                int i11 = i10 % 2;
            }
            if (i7 != 0) {
                break;
            }
            int i12 = getAsAtTimestamp + 49;
            equals = i12 % 128;
            int i13 = i12 % 2;
            i7++;
            j = j10;
        }
        if (i8 != i4) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                str = "";
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 67, 32 - TextUtils.indexOf((CharSequence) str, '0', 0, 0), (char) (19696 - KeyEvent.keyCodeFromString(str)), 1457147715, false, "copydefault", null);
            } else {
                str = "";
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j11 = -1;
            long j12 = 0;
            long j13 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(str), View.resolveSize(0, 0) + 42, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-206612397, Long.valueOf(j13), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6562, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 56, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i5 / (((i5 - 1) * i5) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return (GlideOptions) super.diskCacheStrategy(diskCacheStrategy);
    }

    @Override
    public GlideOptions priority(Priority priority) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.priority(priority);
        int i4 = getAsAtTimestamp + 59;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions placeholder(Drawable drawable) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.placeholder(drawable);
        int i4 = getAsAtTimestamp + 33;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions placeholder(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 21;
        equals = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.placeholder(i);
        if (i4 == 0) {
            int i5 = 9 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions fallback(Drawable drawable) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.fallback(drawable);
        if (i3 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions fallback(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 29;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.fallback(i);
        if (i4 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions error(Drawable drawable) {
        int i = 2 % 2;
        int i2 = equals + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.error(drawable);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions error(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 93;
        equals = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.error(i);
        if (i4 == 0) {
            int i5 = 25 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions theme(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        GlideOptions glideOptions = (GlideOptions) super.theme(theme);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 15;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions skipMemoryCache(boolean z) {
        int i = 2 % 2;
        int i2 = equals + 49;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.skipMemoryCache(z);
        int i4 = getAsAtTimestamp + 21;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions override(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 15;
        equals = i4 % 128;
        int i5 = i4 % 2;
        GlideOptions glideOptions = (GlideOptions) super.override(i, i2);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = getAsAtTimestamp + 25;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions override(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 111;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.override(i);
        int i5 = equals + 71;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions signature(Key key) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.signature(key);
        int i4 = equals + 99;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions mo9670clone() {
        int i = 2 % 2;
        int i2 = equals + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.mo9670clone();
        int i4 = equals + 17;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public <Y> GlideOptions set(Option<Y> option, Y y) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.set((Option) option, (Object) y);
        if (i3 != 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions decode(Class<?> cls) {
        int i = 2 % 2;
        int i2 = equals + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.decode(cls);
        int i4 = equals + 121;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions encodeFormat(Bitmap.CompressFormat compressFormat) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        GlideOptions glideOptions = (GlideOptions) super.encodeFormat(compressFormat);
        if (i3 == 0) {
            throw null;
        }
        int i4 = equals + 119;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptions;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions encodeQuality(int i) {
        int i2 = 2 % 2;
        int i3 = equals + 53;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.encodeQuality(i);
        if (i4 == 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions frame(long j) {
        int i = 2 % 2;
        int i2 = equals + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.frame(j);
        if (i3 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions format(DecodeFormat decodeFormat) {
        int i = 2 % 2;
        int i2 = equals + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.format(decodeFormat);
        int i4 = getAsAtTimestamp + 85;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions disallowHardwareConfig() {
        GlideOptions glideOptions;
        int i = 2 % 2;
        int i2 = equals + 97;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            glideOptions = (GlideOptions) super.disallowHardwareConfig();
            int i3 = 91 / 0;
        } else {
            glideOptions = (GlideOptions) super.disallowHardwareConfig();
        }
        int i4 = equals + 39;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions downsample(DownsampleStrategy downsampleStrategy) {
        int i = 2 % 2;
        int i2 = equals + 25;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.downsample(downsampleStrategy);
        int i4 = equals + 19;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions timeout(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 23;
        equals = i3 % 128;
        int i4 = i3 % 2;
        GlideOptions glideOptions = (GlideOptions) super.timeout(i);
        int i5 = equals + 121;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public GlideOptions optionalCenterCrop() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.optionalCenterCrop();
        int i4 = equals + 95;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions centerCrop() {
        GlideOptions glideOptions;
        int i = 2 % 2;
        int i2 = equals + 23;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            glideOptions = (GlideOptions) super.centerCrop();
            int i3 = 20 / 0;
        } else {
            glideOptions = (GlideOptions) super.centerCrop();
        }
        int i4 = equals + 11;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions optionalFitCenter() {
        int i = 2 % 2;
        int i2 = equals + 101;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GlideOptions glideOptions = (GlideOptions) super.optionalFitCenter();
        int i3 = equals + 109;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions fitCenter() {
        int i = 2 % 2;
        int i2 = equals + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.fitCenter();
        int i4 = getAsAtTimestamp + 99;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions optionalCenterInside() {
        int i = 2 % 2;
        int i2 = equals + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.optionalCenterInside();
        int i4 = getAsAtTimestamp + 51;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions centerInside() {
        int i = 2 % 2;
        int i2 = equals + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.centerInside();
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return glideOptions;
    }

    @Override
    public GlideOptions optionalCircleCrop() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.optionalCircleCrop();
        int i4 = getAsAtTimestamp + 3;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions circleCrop() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.circleCrop();
        if (i3 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions transform(Transformation<Bitmap> transformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.transform(transformation);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 117;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    @SafeVarargs
    public final GlideOptions transform(Transformation<Bitmap>... transformationArr) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.transform(transformationArr);
        int i4 = getAsAtTimestamp + 75;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    @SafeVarargs
    @Deprecated
    public final GlideOptions transforms(Transformation<Bitmap>... transformationArr) {
        int i = 2 % 2;
        int i2 = equals + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.transforms(transformationArr);
        if (i3 == 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions optionalTransform(Transformation<Bitmap> transformation) {
        int i = 2 % 2;
        int i2 = equals + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.optionalTransform(transformation);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 113;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return glideOptions;
    }

    @Override
    public <Y> GlideOptions optionalTransform(Class<Y> cls, Transformation<Y> transformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.optionalTransform((Class) cls, (Transformation) transformation);
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        int i5 = getAsAtTimestamp + 113;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return glideOptions;
    }

    @Override
    public <Y> GlideOptions transform(Class<Y> cls, Transformation<Y> transformation) {
        int i = 2 % 2;
        int i2 = equals + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.transform((Class) cls, (Transformation) transformation);
        int i4 = getAsAtTimestamp + 27;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        throw null;
    }

    @Override
    public GlideOptions dontTransform() {
        int i = 2 % 2;
        int i2 = equals + 119;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GlideOptions glideOptions = (GlideOptions) super.dontTransform();
        int i3 = equals + 23;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions dontAnimate() {
        int i = 2 % 2;
        int i2 = equals + 95;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.dontAnimate();
        int i4 = equals + 11;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions apply(BaseRequestOptions<?> baseRequestOptions) {
        int i = 2 % 2;
        int i2 = equals + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.apply(baseRequestOptions);
        int i4 = equals + 33;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions lock() {
        int i = 2 % 2;
        int i2 = equals + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.lock();
        int i4 = getAsAtTimestamp + 37;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return glideOptions;
    }

    @Override
    public GlideOptions autoClone() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        GlideOptions glideOptions = (GlideOptions) super.autoClone();
        int i4 = getAsAtTimestamp + 79;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return glideOptions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
