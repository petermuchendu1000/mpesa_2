package com.huawei.image.glide;

import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.nio.ByteBuffer;

public class Base64ModelLoaderFactory implements ModelLoaderFactory<Base64Mode, ByteBuffer> {
    @Override
    public void teardown() {
    }

    @Override
    public ModelLoader<Base64Mode, ByteBuffer> build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new Base64ModelLoader();
    }
}
