package com.mpesa.qrcode.exception;

public class UnrecognizedQRException extends Exception {
    public UnrecognizedQRException() {
        super("Unrecognized QR format");
    }
}
