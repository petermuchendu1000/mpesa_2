package com.huawei.image.glide;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.kernel.RVParams;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.huawei.image.appserver.DefaultBase64Repository;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class Base64DataFetcher implements DataFetcher<ByteBuffer> {
    private static final Map<Base64Mode, String> base64ContentCacheMap = new HashMap(1);
    private final Base64Mode base64Mode;
    private DefaultBase64Repository base64Repository;

    @Override
    public void cleanup() {
    }

    Base64DataFetcher(Base64Mode base64Mode) {
        this.base64Mode = base64Mode;
    }

    public String getBase64SectionOfModel(Base64Mode base64Mode) {
        Map<Base64Mode, String> map = base64ContentCacheMap;
        String str = map.get(base64Mode);
        if (!TextUtils.isEmpty(str)) {
            map.remove(base64Mode);
            return getString(str);
        }
        HashMap map2 = new HashMap();
        map2.put(RVParams.LONG_BIZ_TYPE, base64Mode.getBizType());
        map2.put("docId", base64Mode.getDocId());
        DefaultBase64Repository defaultBase64Repository = new DefaultBase64Repository(map2);
        this.base64Repository = defaultBase64Repository;
        try {
            return getString(defaultBase64Repository.sendSyncRequest().getFileContent());
        } catch (Exception unused) {
            return "";
        }
    }

    private String getString(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(44)) != -1) {
            return str.substring(iIndexOf + 1);
        }
        return "";
    }

    @Override
    public void loadData(Priority priority, DataFetcher.DataCallback<? super ByteBuffer> dataCallback) {
        String base64SectionOfModel = getBase64SectionOfModel(this.base64Mode);
        if (TextUtils.isEmpty(base64SectionOfModel)) {
            dataCallback.onLoadFailed(new Exception(this.base64Mode.getDocId() + "pic load failed"));
            return;
        }
        dataCallback.onDataReady(ByteBuffer.wrap(Base64.decode(base64SectionOfModel, 2)));
    }

    @Override
    public void cancel() {
        DefaultBase64Repository defaultBase64Repository = this.base64Repository;
        if (defaultBase64Repository != null) {
            defaultBase64Repository.cancel();
        }
    }

    public static void addBase64ContentCache(Base64Mode base64Mode, String str) {
        Map<Base64Mode, String> map = base64ContentCacheMap;
        map.clear();
        map.put(base64Mode, str);
    }

    @Override
    public Class<ByteBuffer> getDataClass() {
        return ByteBuffer.class;
    }

    @Override
    public DataSource getDataSource() {
        return DataSource.REMOTE;
    }
}
