package com.mpesa.qrcode.service.impl;

import android.util.Log;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.reportfraud.FraudChannelNames;
import com.mpesa.qrcode.constants.ErrorStore;
import com.mpesa.qrcode.constants.Format;
import com.mpesa.qrcode.constants.FormatsEnum;
import com.mpesa.qrcode.exception.ConfigurationException;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.exception.UnrecognizedQRException;
import com.mpesa.qrcode.model.AdditionalParameters;
import com.mpesa.qrcode.model.ExistingQRFormat;
import com.mpesa.qrcode.model.LanguageTemplate;
import com.mpesa.qrcode.model.QRPayload;
import com.mpesa.qrcode.model.api.request.QRListItem;
import com.mpesa.qrcode.model.api.request.StaticQRListPayload;
import com.mpesa.qrcode.model.dynamic.SchemaField;
import com.mpesa.qrcode.model.dynamic.SchemaValidation;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class Validator {
    Validator() {
    }

    boolean isJSONValid(String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                new JSONArray(str);
                return true;
            }
        } catch (JSONException unused2) {
            return false;
        }
    }

    boolean isKEFormat(String str) {
        return Pattern.compile("^.{2}[\\|].{0,25}.[\\|]?").matcher(str).find();
    }

    boolean validateWithRegex(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return Pattern.compile(str).matcher(str2).find();
    }

    boolean isValidANS(String str) {
        return validateWithRegex("^[a-zA-Z0-9!\"#$%&'()*+ ,-^_.\\/?>=<;:@`\\{\\}|~\\s]+$", str);
    }

    boolean hasTwoClosePipes(String str) {
        return Pattern.compile("[\\|][\\|]").matcher(str).find();
    }

    boolean isValidDecimal(String str) {
        return Pattern.compile("^\\$?(([1-9]\\d{0,10}(,\\d{3})*)|0)?\\.\\d{0,2}$").matcher(str).find();
    }

    boolean validateDynamicFormat(Object obj, SchemaField schemaField) throws ConfigurationException, FieldValidationException {
        SchemaValidation validations = schemaField.getValidations();
        validateMPA(validations.getLengthMax(), obj == null ? null : obj.toString(), (schemaField.getMpaFieldName() == null || schemaField.getMpaFieldName().contains("No Mapping")) ? schemaField.getMapFieldName() : schemaField.getMpaFieldName(), validations.getIsRequired().booleanValue(), getFormat(validations.getLengthType(), validations.getFormat()));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    com.mpesa.qrcode.constants.FormatsEnum getFormat(java.lang.String r6, java.lang.String r7) throws com.mpesa.qrcode.exception.ConfigurationException {
        /*
            r5 = this;
            r7.hashCode()
            int r0 = r7.hashCode()
            r1 = 78
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L3d
            r1 = 83
            if (r0 == r1) goto L32
            r1 = 2093(0x82d, float:2.933E-42)
            if (r0 == r1) goto L27
            r1 = 64966(0xfdc6, float:9.1037E-41)
            if (r0 == r1) goto L1c
            goto L45
        L1c:
            java.lang.String r0 = "ANS"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L25
            goto L45
        L25:
            r7 = r2
            goto L48
        L27:
            java.lang.String r0 = "AN"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L30
            goto L45
        L30:
            r7 = r3
            goto L48
        L32:
            java.lang.String r0 = "S"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3b
            goto L45
        L3b:
            r7 = r4
            goto L48
        L3d:
            java.lang.String r0 = "N"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L47
        L45:
            r7 = -1
            goto L48
        L47:
            r7 = 0
        L48:
            java.lang.String r0 = "fixed"
            java.lang.String r1 = "ranged"
            if (r7 == 0) goto L93
            if (r7 == r4) goto L7e
            if (r7 == r3) goto L69
            if (r7 != r2) goto La5
            r6.hashCode()
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L66
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto La5
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.ANS_StaticLength
            return r6
        L66:
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.ANS
            return r6
        L69:
            r6.hashCode()
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L7b
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto La5
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.AN_StaticLength
            return r6
        L7b:
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.AN
            return r6
        L7e:
            r6.hashCode()
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto L90
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto La5
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.ANS_StaticLength
            return r6
        L90:
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.ANS
            return r6
        L93:
            r6.hashCode()
            boolean r7 = r6.equals(r1)
            if (r7 != 0) goto Lad
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto La5
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.N_StaticLength
            return r6
        La5:
            com.mpesa.qrcode.exception.ConfigurationException r6 = new com.mpesa.qrcode.exception.ConfigurationException
            java.lang.String r7 = "Invalid validation configuration"
            r6.<init>(r7)
            throw r6
        Lad:
            com.mpesa.qrcode.constants.FormatsEnum r6 = com.mpesa.qrcode.constants.FormatsEnum.N
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.Validator.getFormat(java.lang.String, java.lang.String):com.mpesa.qrcode.constants.FormatsEnum");
    }

    boolean validateMPAQRFormat(QRPayload qRPayload) throws FieldValidationException {
        Log.d("VALIDATOR", qRPayload.getCreditPartyIdentifier());
        validateMPA(2, qRPayload.getQrVersion(), "Qr Version", true, Format.QR_VERSION);
        validateMPA(2, qRPayload.getQrType(), "Qr Type", true, Format.QR_TYPE);
        validateMPA(2, qRPayload.getTrxCode(), "Trx Code", true, Format.TRX_CODE);
        validateMPA(25, qRPayload.getCreditPartyIdentifier(), "Credit Party Identifier", true, Format.CPI);
        validateMPA(99, qRPayload.getCreditPartyName(), "Credit Party Name", true, Format.CREDIT_PARTY_NAME);
        validateMPA(4, qRPayload.getMerchantCCode(), "Merchant Category Code", false, Format.MERCHANT_C_CODE);
        validateBigDecimal(13, qRPayload.getAmount(), "Amount", false);
        validateMPA(3, qRPayload.getCurrencyCode(), "Currency Code", false, Format.CURRENCY_CODE);
        validateMPA(25, qRPayload.getRefNo(), "Ref No", false, Format.REF_NO);
        validateMPA(15, qRPayload.getMerchantLoc(), "Merchant Location", false, Format.MERCHANT_LOCATION);
        validateMPA(10, qRPayload.getPostalCode(), "Postal Code", false, Format.POSTAL_CODE);
        validateMPA(2, qRPayload.getCountryCode(), "Country Code", true, Format.COUNTRY_CODE);
        validateMPA(5, qRPayload.getChannelID(), "Channel ID", false, Format.CHANNEL_ID);
        validateMPA(5, qRPayload.getNetworkID(), "Network ID", false, Format.NETWORK_ID);
        if (qRPayload.getAdditionalParameters() != null) {
            AdditionalParameters additionalParameters = qRPayload.getAdditionalParameters();
            validateMPA(25, additionalParameters.getTerminalID(), "Terminal ID", false, Format.TERMINAL_ID);
            validateMPA(25, additionalParameters.getCashierID(), "Cashier ID", false, Format.CASHIER_ID);
            validateMPA(25, additionalParameters.getStoreID(), "Store ID", false, Format.STORE_ID);
            validateMPA(25, additionalParameters.getMobileNumber(), FraudChannelNames.PHONE_NUMBER, false, Format.MOBILE_NUMBER);
            validateMPA(99, additionalParameters.getPurpose(), HttpHeaders.PURPOSE, false, Format.PURPOSE);
            validateMPA(25, additionalParameters.getLoyaltyNo(), "Loyalty No", false, Format.LOYALTY_NO);
            validateMPA(2, additionalParameters.getTipConvenienceFeeIndicator(), "Tip Convenience Fee Indicator", false, Format.TIP_CONVENIENCE_FEE_INDICATOR);
            validateBigDecimal(13, additionalParameters.getValueOfConvenienceFeeFixed(), "Value of Convenience Fee Fixed", false);
            validateMPA(5, additionalParameters.getValueOfConvenienceFeePercentage(), "Value of Convenience Fee Percentage", false, Format.VALUE_OF_CONVENIENCE_FEE_PERCENTAGE);
            validateMPA(2, additionalParameters.getDiscountIndicator(), "Discount Indicator", false, Format.DISCOUNT_INDICATOR);
            validateBigDecimal(13, additionalParameters.getDiscount(), "Discount", false);
            validateMPA(25, additionalParameters.getGeneratedDateTime(), "Generated Date", false, Format.GENERATED_DATE);
            validateMPA(25, additionalParameters.getExpiryDateTime(), "Expiry Date", false, Format.EXPIRY_DATE);
            validateMPA(99, additionalParameters.getEmail(), "Email", false, Format.EMAIL);
            validateMPA(25, additionalParameters.getStatus(), "Status", false, Format.STATUS);
            validateBigDecimal(13, additionalParameters.getTax(), "Tax", false);
            validateMPA(25, additionalParameters.getOrgShortCode(), "Org Short Code", false, Format.ORG_SHORT_CODE);
            validateMPA(25, additionalParameters.getConsumerLabel(), "Consumer Label", false, Format.CONSUMER_LABEL);
            validateMPA(3, additionalParameters.getAdditionalConsumerDataRequest(), "Additional Consumer Data Request", false, Format.ADDITIONAL_CONSUMER_DATA_REQUEST);
        }
        if (qRPayload.getLanguageTemplate() == null) {
            return true;
        }
        LanguageTemplate languageTemplate = qRPayload.getLanguageTemplate();
        validateMPA(2, languageTemplate.getLanguagePreference(), "Language Preference", false, Format.LANGUAGE_TEMPLATE);
        validateMPA(25, languageTemplate.getMerchantNameAlternateLanguage(), "Merchant Name", false, Format.MERCHANT_NAME);
        validateMPA(15, languageTemplate.getMerchantCityAlternateLanguage(), "Merchant City", false, Format.MERCHANT_CITY);
        return true;
    }

    boolean validateExistingTZQRFormat(ExistingQRFormat existingQRFormat) throws UnrecognizedQRException, FieldValidationException {
        validateExistingTZ(2, existingQRFormat.getOpType(), "opType", true, FormatsEnum.N);
        if (existingQRFormat.getOpType().equals("1") || existingQRFormat.getOpType().equals("01")) {
            validateExistingTZ(25, existingQRFormat.getTill(), "till", true, Format.CPI);
        } else {
            validateExistingTZ(25, existingQRFormat.getShortCode(), KeysConstants.SHORT_CODE, true, Format.CPI);
            validateExistingTZ(25, existingQRFormat.getBillReference(), "billReference", true, Format.REF_NO);
        }
        boolean z = existingQRFormat.getBillCcy() == null;
        if (existingQRFormat.getBillExprDt() != null) {
            z = false;
        }
        if (existingQRFormat.getBillPayOpt() != null) {
            z = false;
        }
        boolean z2 = existingQRFormat.getBillRsv01() == null ? z : false;
        if (existingQRFormat.getShortCode() == null && z2) {
            validateExistingTZ(99, existingQRFormat.getOrgName(), "orgName", true, Format.CREDIT_PARTY_NAME);
        }
        if (existingQRFormat.getAmount() != null) {
            if (existingQRFormat.getAmount().isEmpty()) {
                throw new FieldValidationException("Requires value for amount but found empty");
            }
            try {
                validateBigDecimal(13, new BigDecimal(existingQRFormat.getAmount()).setScale(2, 6), "Amount", true);
                if (existingQRFormat.getBillCcy() != null) {
                    validateExistingTZ(3, existingQRFormat.getBillCcy(), "billCcy", false, Format.CURRENCY_CODE);
                }
                if (existingQRFormat.getBillExprDt() != null) {
                    validateExistingTZ(25, existingQRFormat.getBillExprDt(), "billExprDt", false, Format.EXPIRY_DATE);
                }
                if (existingQRFormat.getBillRsv01() != null) {
                    validateExistingTZ(99, existingQRFormat.getBillRsv01(), "billRsv01", false, Format.PURPOSE);
                }
                return true;
            } catch (NumberFormatException unused) {
                throw new FieldValidationException("Invalid format for amount");
            }
        }
        throw new UnrecognizedQRException();
    }

    private void validateMPA(int i, String str, String str2, boolean z, FormatsEnum formatsEnum) throws FieldValidationException {
        if (z && (str == null || str.isEmpty())) {
            throw new FieldValidationException(ErrorStore.REQUIRES_VALUE_FOR + str2 + " but found empty");
        }
        if (str != null) {
            if (formatsEnum.equals(FormatsEnum.AN_StaticLength) || formatsEnum.equals(FormatsEnum.N_StaticLength) || formatsEnum.equals(FormatsEnum.ANS_StaticLength)) {
                if (str.length() != 0 && str.length() != i) {
                    throw new FieldValidationException("Invalid length for " + str2);
                }
            } else if (str.length() > i) {
                throw new FieldValidationException("Invalid length for " + str2);
            }
        }
        if (formatsEnum.equals(FormatsEnum.ANS) && str != null) {
            if ((str2.toLowerCase(Locale.ROOT).equals("amount") || str2.toLowerCase(Locale.ROOT).equals(FirebaseAnalytics.Param.DISCOUNT) || str2.toLowerCase(Locale.ROOT).equals(FirebaseAnalytics.Param.TAX) || str2.toLowerCase(Locale.ROOT).equals("valueofconveniencefeefixed")) && !str.matches("^[0-9]\\d*(\\.\\d+)?$")) {
                throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
            }
            if (!str.isEmpty() && !isValidANS(str)) {
                throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
            }
        }
        if ((formatsEnum.equals(FormatsEnum.N) || formatsEnum.equals(FormatsEnum.N_StaticLength)) && str != null && !str.isEmpty() && !str.matches("^[0-9]\\d*(\\.\\d+)?$")) {
            throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
        }
        if ((!formatsEnum.equals(FormatsEnum.AN) && !formatsEnum.equals(FormatsEnum.AN_StaticLength)) || str == null || str.isEmpty() || str.matches("^[a-zA-Z0-9]*$")) {
            return;
        }
        throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
    }

    private void validateExistingTZ(int i, String str, String str2, boolean z, FormatsEnum formatsEnum) throws UnrecognizedQRException, FieldValidationException {
        if (z) {
            if (str == null) {
                throw new UnrecognizedQRException();
            }
            if (str.isEmpty()) {
                throw new FieldValidationException(ErrorStore.REQUIRES_VALUE_FOR + str2 + " but found empty");
            }
        }
        if (str != null) {
            if (formatsEnum.equals(FormatsEnum.AN_StaticLength) || formatsEnum.equals(FormatsEnum.N_StaticLength)) {
                if (str.length() != 0 && str.length() != i) {
                    throw new FieldValidationException("Invalid length for " + str2);
                }
            } else if (str.length() > i) {
                throw new FieldValidationException("Invalid length for " + str2);
            }
        }
        if ((formatsEnum.equals(FormatsEnum.N) || formatsEnum.equals(FormatsEnum.N_StaticLength)) && str != null && !str.matches("^[0-9]\\d*(\\.\\d+)?$")) {
            throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
        }
        if (!formatsEnum.equals(FormatsEnum.AN) || str == null || str.isEmpty() || str.matches("^[a-zA-Z0-9]*$")) {
            return;
        }
        throw new FieldValidationException(ErrorStore.INVALID_FORMAT + str2);
    }

    boolean validateQRListPayload(StaticQRListPayload staticQRListPayload) throws FieldValidationException {
        validateMPA(5, staticQRListPayload.getChannelID(), "Channel ID", false, Format.CHANNEL_ID);
        validateMPA(5, staticQRListPayload.getNetworkID(), "Network ID", false, Format.NETWORK_ID);
        if (staticQRListPayload.getCountryCode() != null) {
            if (staticQRListPayload.getCountryCode().isEmpty()) {
                throw new FieldValidationException("Requires value for Country Code but found empty");
            }
            if (staticQRListPayload.getQrList() == null || staticQRListPayload.getQrList().isEmpty()) {
                throw new FieldValidationException("Requires value for QR List but found empty");
            }
            int i = 0;
            while (i < staticQRListPayload.getQrList().size()) {
                QRListItem qRListItem = staticQRListPayload.getQrList().get(i);
                String trxCode = qRListItem.getTrxCode();
                StringBuilder sb = new StringBuilder("Trx Code in list:");
                i++;
                sb.append(i);
                validateMPA(2, trxCode, sb.toString(), true, Format.TRX_CODE);
                validateMPA(25, qRListItem.getCreditPartyIdentifier(), "Credit Party Identifier in list:" + i, true, Format.CPI);
                validateMPA(99, qRListItem.getCreditPartyName(), "Credit Party Name in list:" + i, true, Format.CREDIT_PARTY_NAME);
            }
            return true;
        }
        throw new FieldValidationException("Requires value for Country Code but found empty");
    }

    private void validateBigDecimal(int i, BigDecimal bigDecimal, String str, boolean z) throws FieldValidationException {
        if (z && bigDecimal == null) {
            throw new FieldValidationException(ErrorStore.REQUIRES_VALUE_FOR + str + " but found empty");
        }
        if (bigDecimal == null || bigDecimal.setScale(2, 6).toString().length() <= i) {
            return;
        }
        throw new FieldValidationException("Invalid length for " + str);
    }
}
