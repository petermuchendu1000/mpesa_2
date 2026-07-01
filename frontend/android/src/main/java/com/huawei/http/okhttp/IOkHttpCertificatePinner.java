package com.huawei.http.okhttp;

import okhttp3.CertificatePinner;

public interface IOkHttpCertificatePinner {
    default CertificatePinner getCertificatePinner() {
        return null;
    }
}
