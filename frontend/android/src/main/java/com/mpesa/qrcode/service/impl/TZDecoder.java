package com.mpesa.qrcode.service.impl;

import com.google.gson.Gson;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.exception.UnrecognizedQRException;
import com.mpesa.qrcode.model.AdditionalParameters;
import com.mpesa.qrcode.model.ExistingQRFormat;
import com.mpesa.qrcode.model.QRPayload;
import java.math.BigDecimal;

class TZDecoder {
    private final Validator validator = new Validator();

    QRPayload decodeExistingTZDynamicFormat(String str) throws UnrecognizedQRException, FieldValidationException {
        QRPayload qRPayload = new QRPayload();
        AdditionalParameters additionalParameters = new AdditionalParameters();
        new ExistingQRFormat();
        Gson gson = new Gson();
        qRPayload.setAdditionalParameters(additionalParameters);
        try {
            ExistingQRFormat existingQRFormat = (ExistingQRFormat) gson.fromJson(str, ExistingQRFormat.class);
            if (existingQRFormat != null && this.validator.validateExistingTZQRFormat(existingQRFormat)) {
                if (existingQRFormat.getOpType() != null) {
                    if (existingQRFormat.getOpType().equals("1") || existingQRFormat.getOpType().equals("01")) {
                        qRPayload.setTrxCode("01");
                    } else if (existingQRFormat.getOpType().equals("2") || existingQRFormat.getOpType().equals("02")) {
                        qRPayload.setTrxCode("03");
                    } else {
                        throw new UnrecognizedQRException();
                    }
                }
                if (existingQRFormat.getShortCode() != null) {
                    qRPayload.setCreditPartyIdentifier(existingQRFormat.getShortCode());
                }
                if (existingQRFormat.getBillReference() != null) {
                    qRPayload.setRefNo(existingQRFormat.getBillReference());
                }
                if (existingQRFormat.getAmount() != null) {
                    try {
                        qRPayload.setAmount(new BigDecimal(existingQRFormat.getAmount()).setScale(2, 6));
                    } catch (Exception unused) {
                        throw new FieldValidationException("Invalid format for Amount");
                    }
                }
                if (existingQRFormat.getOrgName() != null) {
                    qRPayload.setCreditPartyName(existingQRFormat.getOrgName());
                } else {
                    qRPayload.setCreditPartyName("NA");
                }
                if (existingQRFormat.getTill() != null) {
                    qRPayload.setCreditPartyIdentifier(existingQRFormat.getTill());
                }
                if (existingQRFormat.getBillCcy() != null && !existingQRFormat.getBillCcy().isEmpty()) {
                    qRPayload.setCurrencyCode(existingQRFormat.getBillCcy());
                }
                if (existingQRFormat.getBillExprDt() != null && !existingQRFormat.getBillExprDt().isEmpty()) {
                    qRPayload.getAdditionalParameters().setExpiryDateTime(existingQRFormat.getBillExprDt());
                }
                if (existingQRFormat.getBillRsv01() != null && !existingQRFormat.getBillRsv01().isEmpty()) {
                    qRPayload.getAdditionalParameters().setPurpose(existingQRFormat.getBillRsv01());
                }
                qRPayload.setCountryCode("TZ");
            }
            return qRPayload;
        } catch (Exception unused2) {
            throw new UnrecognizedQRException();
        }
    }

    QRPayload decodeExistingTZStaticFormat(String str) throws FieldValidationException {
        QRPayload qRPayload = new QRPayload();
        if (!str.matches("^[0-9]\\d*(\\.\\d+)?$")) {
            throw new FieldValidationException("Invalid format for Till Number");
        }
        qRPayload.setQrType("01");
        if (str.length() == 5 || str.length() == 6) {
            qRPayload.setTrxCode("02");
        } else if (str.length() == 7) {
            qRPayload.setTrxCode("01");
        }
        qRPayload.setCreditPartyIdentifier(str);
        qRPayload.setCountryCode("TZ");
        qRPayload.setCreditPartyName("NA");
        return qRPayload;
    }
}
