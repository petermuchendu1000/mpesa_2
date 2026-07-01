package com.mpesa.qrcode.service;

import com.mpesa.qrcode.exception.ConfigurationException;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.exception.InvalidCRCException;
import com.mpesa.qrcode.exception.UnrecognizedQRException;
import com.mpesa.qrcode.model.QRPayload;
import com.mpesa.qrcode.model.api.request.StaticQRListPayload;
import com.mpesa.qrcode.service.impl.QRCodeCore;
import com.mpesa.qrcode.service.impl.callbacks.IBulkGenerationCallback;
import com.mpesa.qrcode.service.impl.callbacks.IDecodeQRCallback;
import com.mpesa.qrcode.service.impl.callbacks.IEncodeQRCallback;

public interface IQRCodeCore {
    QRPayload decodeQR(String str) throws ConfigurationException, UnrecognizedQRException, InvalidCRCException, FieldValidationException;

    void decodeQROnline(String str, String str2, IDecodeQRCallback iDecodeQRCallback) throws FieldValidationException;

    void getEncodedBase64QRList(StaticQRListPayload staticQRListPayload, IBulkGenerationCallback iBulkGenerationCallback) throws FieldValidationException;

    String getEncodedBase64String(QRPayload qRPayload) throws ConfigurationException, FieldValidationException;

    String getEncodedBase64String(QRPayload qRPayload, int i) throws ConfigurationException, FieldValidationException;

    void getEncodedBase64StringOnline(QRPayload qRPayload, String str, int i, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException;

    void getEncodedBase64StringOnline(QRPayload qRPayload, String str, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException;

    void getEncodedQRList(StaticQRListPayload staticQRListPayload, IBulkGenerationCallback iBulkGenerationCallback) throws FieldValidationException;

    String getEncodedQRString(QRPayload qRPayload) throws ConfigurationException, FieldValidationException;

    void getEncodedQRStringOnline(QRPayload qRPayload, String str, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException;

    QRCodeCore setAuthCredentials(String str, String str2, String str3);

    QRCodeCore setBaseEndpoints(String str, String str2);
}
