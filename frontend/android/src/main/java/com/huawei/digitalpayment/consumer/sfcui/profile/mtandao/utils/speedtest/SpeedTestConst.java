package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpeedTestConst {
    public static final long DEFAULT_DOWNLOAD_SETUP_TIME = 0;
    public static final int DEFAULT_SCALE = 4;
    public static final int DEFAULT_SOCKET_TIMEOUT = 10000;
    public static final long DEFAULT_UPLOAD_SETUP_TIME = 0;
    public static final int DEFAULT_UPLOAD_SIZE = 65535;
    public static final String FTP_DEFAULT_PASSWORD = "";
    public static final int FTP_DEFAULT_PORT = 21;
    public static final String FTP_DEFAULT_USER = "anonymous";
    public static final int HTTP_DEFAULT_PORT = 80;
    public static final int HTTP_OK = 200;
    public static final String PARSING_ERROR = "Error occurred while parsing ";
    public static final int READ_BUFFER_SIZE = 65535;
    public static final String SOCKET_WRITE_ERROR = "Error occurred while writing to socket";
    private static int ShareDataUIState = 1;
    public static final int THREADPOOL_WAIT_COMPLETION_MS = 500;
    public static final int THREAD_POOL_REPORT_SIZE = 1;
    public static final int UPLOAD_FILE_WRITE_CHUNK = 64000;
    public static final String UPLOAD_TEMP_FILE_EXTENSION = ".tmp";
    public static final String UPLOAD_TEMP_FILE_NAME = "speed-test-random";
    private static int component1;
    public static final BigDecimal PERCENT_MAX = new BigDecimal("100");
    public static final BigDecimal NANO_DIVIDER = new BigDecimal("1000000000");
    public static final BigDecimal BIT_MULTIPLIER = new BigDecimal(PrepareException.ERROR_AUTH_FAIL);
    public static final RoundingMode DEFAULT_ROUNDING_MODE = RoundingMode.HALF_EVEN;

    static {
        int i = ShareDataUIState + 21;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
