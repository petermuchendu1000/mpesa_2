package com.huawei.image.glide;

import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.nio.ByteBuffer;

public class Base64ModelLoader implements ModelLoader<Base64Mode, ByteBuffer> {
    @Override
    public ModelLoader.LoadData<ByteBuffer> buildLoadData(Base64Mode base64Mode, int i, int i2, Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(base64Mode), new Base64DataFetcher(base64Mode));
    }

    @Override
    public boolean handles(Base64Mode base64Mode) {
        return !TextUtils.isEmpty(base64Mode.getDocId());
    }
}
