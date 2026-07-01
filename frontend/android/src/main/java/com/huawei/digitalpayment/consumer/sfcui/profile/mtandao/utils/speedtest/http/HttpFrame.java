package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.inter.IHttpFrame;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.states.HttpStates;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils.IByteList;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils.ListOfBytes;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.socket.DataBufferConst;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.util.HashMap;

public class HttpFrame implements IHttpFrame {
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private String ArtificialStackFrames;
    private HashMap<String, String> ShareDataUIState;
    private IByteList component1;
    private String component2;
    private HttpVersion component3;
    private boolean component4;
    private String copy;
    private boolean copydefault;
    private boolean equals;
    private HttpReader getAsAtTimestamp;
    private String getRequestBeneficiariesState;
    private String getShareableDataState;
    private int hashCode;

    public HttpFrame() {
        this.component3 = new HttpVersion(1, 1);
        this.equals = false;
        this.component4 = false;
        this.copydefault = false;
        this.getAsAtTimestamp = new HttpReader();
        this.component2 = "";
        this.ShareDataUIState = new HashMap<>();
        this.copy = "";
        this.getShareableDataState = "";
        this.getRequestBeneficiariesState = "";
        this.component1 = new ListOfBytes();
        this.hashCode = -1;
        this.ArtificialStackFrames = "";
        this.getAsAtTimestamp = new HttpReader();
    }

    public HttpFrame(String str, HttpVersion httpVersion, HashMap<String, String> map, String str2, IByteList iByteList) {
        this.component3 = new HttpVersion(1, 1);
        this.equals = false;
        this.component4 = false;
        this.copydefault = false;
        this.getAsAtTimestamp = new HttpReader();
        this.component2 = "";
        this.ShareDataUIState = new HashMap<>();
        this.copy = "";
        this.getShareableDataState = "";
        this.getRequestBeneficiariesState = "";
        this.component1 = new ListOfBytes();
        this.hashCode = -1;
        this.ArtificialStackFrames = "";
        this.component3 = new HttpVersion(1, 1);
        this.ShareDataUIState = map;
        this.copy = str;
        this.getShareableDataState = str2;
        this.component1 = iByteList;
    }

    public String toString() {
        String str;
        int i = 2 % 2;
        int i2 = toString + 21;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (this.copy.equals("")) {
            str = this.getShareableDataState + " " + this.component3.toString() + "\r\n";
            int i4 = getSponsorBeneficiariesState + 1;
            toString = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.copy + " " + this.getShareableDataState + " " + this.component3.toString() + "\r\n";
            int i6 = toString + 87;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
        }
        if ((!this.ShareDataUIState.containsKey("Content-Length")) && this.component1.getSize() > 0) {
            this.ShareDataUIState.put("Content-Length", String.valueOf(new String(this.component1.getBytes()).length()));
        }
        for (String str2 : this.ShareDataUIState.keySet()) {
            str = str + str2.toString() + ":  " + this.ShareDataUIState.get(str2).toString() + "\r\n";
        }
        String str3 = str + "\r\n";
        try {
            str3 = str3 + new String(this.component1.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str3 + "\r\n";
    }

    private void component1() {
        int i = 2 % 2;
        this.component3 = new HttpVersion(1, 1);
        this.ShareDataUIState = new HashMap<>();
        this.copy = "";
        this.getShareableDataState = "";
        this.component1 = new ListOfBytes();
        this.hashCode = -1;
        this.ArtificialStackFrames = "";
        this.component4 = false;
        this.equals = false;
        int i2 = toString + 61;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public HttpStates parseHttp(InputStream inputStream) throws InterruptedException, IOException {
        boolean z;
        try {
            HttpStates httpStates = HttpStates.HTTP_STATE_NONE;
            component1();
            synchronized (inputStream) {
                HttpStates httpStatesDecodeFrame = decodeFrame(inputStream);
                if (httpStatesDecodeFrame != HttpStates.HTTP_FRAME_OK) {
                    return httpStatesDecodeFrame;
                }
                HttpStates header = parseHeader(inputStream);
                if (header == HttpStates.HTTP_FRAME_OK && getHeaders().containsKey("Transfer-Encoding".toLowerCase()) && getHeaders().get("Transfer-Encoding".toLowerCase()).toString().equals("chunked")) {
                    copydefault(true);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String str = "";
                    boolean z2 = false;
                    int length = 0;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z2 || length == 0) {
                            try {
                                length = (int) Long.parseLong(line.toUpperCase(), 16);
                                if (length == 0) {
                                    break;
                                }
                                if (!z2) {
                                    z2 = true;
                                }
                                z = false;
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                            if (line.trim().equals("0")) {
                                length = 0;
                            } else {
                                str = str + line;
                                length -= line.length();
                            }
                        }
                    }
                    bufferedReader.close();
                    this.component1 = new ListOfBytes(str);
                } else if (header == HttpStates.HTTP_FRAME_OK) {
                    copydefault(false);
                    return parseBody(inputStream);
                }
                return header;
            }
        } catch (SocketTimeoutException unused2) {
            return HttpStates.SOCKET_ERROR;
        }
    }

    private void copydefault(boolean z) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 45;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.copydefault = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 67;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isChunked() {
        int i = 2 % 2;
        int i2 = toString + 17;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 55;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.states.HttpStates decodeFrame(java.io.InputStream r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.HttpFrame.decodeFrame(java.io.InputStream):com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.states.HttpStates");
    }

    public HttpStates parseHeader(InputStream inputStream) throws IOException {
        String strTrim;
        int i;
        int i2 = 2 % 2;
        while (true) {
            String line = this.getAsAtTimestamp.readLine(inputStream);
            if (line == null) {
                break;
            }
            int i3 = getSponsorBeneficiariesState + 31;
            toString = i3 % 128;
            int i4 = i3 % 2;
            if (line.length() == 0) {
                break;
            }
            int iIndexOf = line.indexOf(":");
            if (iIndexOf > 0) {
                int i5 = getSponsorBeneficiariesState + 57;
                toString = i5 % 128;
                if (i5 % 2 == 0) {
                    strTrim = line.substring(0, iIndexOf).trim();
                    i = iIndexOf - 1;
                } else {
                    strTrim = line.substring(0, iIndexOf).trim();
                    i = iIndexOf + 1;
                }
                this.ShareDataUIState.put(strTrim.toLowerCase(), line.substring(i).trim());
                int i6 = getSponsorBeneficiariesState + 57;
                toString = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
        }
        if (this.ShareDataUIState.containsKey("Host".toLowerCase())) {
            int i8 = getSponsorBeneficiariesState + 85;
            toString = i8 % 128;
            if (i8 % 2 == 0) {
                this.component2 = this.ShareDataUIState.get("Host".toLowerCase()).toString();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.component2 = this.ShareDataUIState.get("Host".toLowerCase()).toString();
        }
        return HttpStates.HTTP_FRAME_OK;
    }

    public HttpStates parseBody(InputStream inputStream) throws IOException {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4 = 2 % 2;
        int contentLength = getContentLength();
        if (contentLength > 0) {
            int i5 = contentLength % DataBufferConst.DATA_BLOCK_SIZE_LIMIT;
            if (i5 == 0) {
                int i6 = getSponsorBeneficiariesState + 57;
                toString = i6 % 128;
                i = i6 % 2 == 0 ? contentLength * 28524 : contentLength / DataBufferConst.DATA_BLOCK_SIZE_LIMIT;
            } else {
                i = (contentLength / DataBufferConst.DATA_BLOCK_SIZE_LIMIT) + 1;
            }
            ListOfBytes listOfBytes = new ListOfBytes();
            int i7 = getSponsorBeneficiariesState + 111;
            toString = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 5;
            }
            for (int i9 = 0; i9 < i; i9++) {
                if (i5 == 0 || i9 != i - 1) {
                    byte[] bArr2 = new byte[DataBufferConst.DATA_BLOCK_SIZE_LIMIT];
                    for (int i10 = 0; i10 < 4089; i10++) {
                        int i11 = toString + 123;
                        getSponsorBeneficiariesState = i11 % 128;
                        int i12 = i11 % 2;
                        bArr2[i10] = (byte) inputStream.read();
                    }
                    listOfBytes.add(bArr2);
                } else {
                    int i13 = toString + 83;
                    getSponsorBeneficiariesState = i13 % 128;
                    if (i13 % 2 != 0) {
                        i2 = contentLength << (i9 >> 5138);
                        bArr = new byte[i2];
                        i3 = 1;
                    } else {
                        i2 = contentLength - (i9 * DataBufferConst.DATA_BLOCK_SIZE_LIMIT);
                        bArr = new byte[i2];
                        i3 = 0;
                    }
                    while (i3 < i2) {
                        int i14 = toString + 77;
                        getSponsorBeneficiariesState = i14 % 128;
                        int i15 = i14 % 2;
                        bArr[i3] = (byte) inputStream.read();
                        i3++;
                    }
                    listOfBytes.add(bArr);
                }
            }
            if (inputStream.available() > 0) {
                if (inputStream.read() != 13) {
                    return HttpStates.HTTP_BODY_PARSE_ERROR;
                }
                if (inputStream.read() != 10) {
                    return HttpStates.HTTP_BODY_PARSE_ERROR;
                }
            }
            this.component1 = listOfBytes;
        } else {
            this.component1 = new ListOfBytes();
        }
        return HttpStates.HTTP_FRAME_OK;
    }

    public int getContentLength() {
        int i = 2 % 2;
        int i2 = toString + 15;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (this.ShareDataUIState.containsKey("Content-Length".toLowerCase())) {
            try {
                return Integer.parseInt(this.ShareDataUIState.get("Content-Length".toLowerCase()));
            } catch (NumberFormatException unused) {
            }
        }
        int i4 = getSponsorBeneficiariesState + 67;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    @Override
    public HttpVersion getHttpVersion() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 73;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public HttpReader getReader() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 7;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        HttpReader httpReader = this.getAsAtTimestamp;
        int i5 = i3 + 67;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return httpReader;
    }

    @Override
    public String getHost() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 87;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    @Override
    public HashMap<String, String> getHeaders() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 37;
        toString = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, String> map = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return map;
    }

    public void setHeaders(HashMap<String, String> map) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 57;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = map;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getMethod() {
        int i = 2 % 2;
        int i2 = toString + 125;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 45;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getUri() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 87;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getShareableDataState;
        int i4 = i2 + 23;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public String getQueryString() {
        String str;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 109;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.getRequestBeneficiariesState;
            int i4 = 48 / 0;
        } else {
            str = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 99;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public IByteList getBody() {
        int i = 2 % 2;
        int i2 = toString + 1;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        IByteList iByteList = this.component1;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return iByteList;
    }

    @Override
    public String getReasonPhrase() {
        String str;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 35;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            str = this.ArtificialStackFrames;
            int i4 = 38 / 0;
        } else {
            str = this.ArtificialStackFrames;
        }
        int i5 = i3 + 45;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public int getStatusCode() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 93;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isHttpRequestFrame() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 105;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component4;
        int i5 = i2 + 27;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean isHttpResponseFrame() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 91;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.equals;
        int i5 = i2 + 63;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
