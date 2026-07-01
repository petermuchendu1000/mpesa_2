package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants;

public class HttpConstants {
    public static final String BAD_REQUEST_ERROR = "HTTP/1.1 400 Bad Request\r\nContent-Length: 53\r\nContent-Type: text/html\r\n\r\n<h1>400 Bad Request</h1><p>Malformed HTTP request</p>";
    public static final String HEADER_DELEMITER = "\r\n";
    public static final String HEADER_TERMINATOR = "\r\n\r\n";
    public static final String HEADER_VALUE_DELIMITER = ": ";
    public static final String INTERNAL_SERVER_ERROR = "HTTP/1.1 500 Internal Server Error\r\nContent-Length: 34\r\nContent-Type: text/html\r\n\r\n<h1>500 Internal Server Error</h1>";
    public static final String NOT_FOUND = "HTTP/1.1 404 Not Found\r\nContent-Length: 22\r\nContent-Type: text/html\r\n\r\n<h1>404 Not Found</h1>";
    public static final String OK = "HTTP/1.1 200 OK\r\nContent-Length: 18\r\nContent-Type: text/html\r\n\r\n<h1>200 Found</h1>";
    public static final String REDIRECTION = "HTTP/1.1 301 Moved Permanently\r\nContent-Length: 22\r\nContent-Type: text/html\r\n\r\n<h1>301     Found</h1>";
}
