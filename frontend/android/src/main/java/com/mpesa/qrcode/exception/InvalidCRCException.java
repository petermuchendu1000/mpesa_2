package com.mpesa.qrcode.exception;

public class InvalidCRCException extends Exception {
    public InvalidCRCException() {
        super("CRC validation failed");
    }
}
