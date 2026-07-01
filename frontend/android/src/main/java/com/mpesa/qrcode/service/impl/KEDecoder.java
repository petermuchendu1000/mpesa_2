package com.mpesa.qrcode.service.impl;

import com.mpesa.qrcode.exception.FieldValidationException;

class KEDecoder {
    KEDecoder() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.mpesa.qrcode.model.QRPayload decodePipelineFormat(java.lang.String r10) throws com.mpesa.qrcode.exception.UnrecognizedQRException, com.mpesa.qrcode.exception.FieldValidationException {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.KEDecoder.decodePipelineFormat(java.lang.String):com.mpesa.qrcode.model.QRPayload");
    }

    void validateAmount(String str) throws FieldValidationException {
        if (str.contains(".")) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 2 && strArrSplit[1].length() > 2) {
                throw new FieldValidationException("Invalid format for amount");
            }
        }
        if (str.length() > 13) {
            throw new FieldValidationException("Invalid length for amount");
        }
    }
}
