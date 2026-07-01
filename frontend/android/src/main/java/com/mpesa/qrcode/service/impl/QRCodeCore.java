package com.mpesa.qrcode.service.impl;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.mpesa.qrcode.BuildConfig;
import com.mpesa.qrcode.constants.ErrorStore;
import com.mpesa.qrcode.constants.QRFormat;
import com.mpesa.qrcode.exception.ConfigNotFoundException;
import com.mpesa.qrcode.exception.ConfigurationException;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.exception.InvalidCRCException;
import com.mpesa.qrcode.exception.UnrecognizedQRException;
import com.mpesa.qrcode.model.AdditionalParameters;
import com.mpesa.qrcode.model.LanguageTemplate;
import com.mpesa.qrcode.model.QRPayload;
import com.mpesa.qrcode.model.api.request.StaticQRListPayload;
import com.mpesa.qrcode.model.dynamic.JsonSchema;
import com.mpesa.qrcode.model.dynamic.SchemaField;
import com.mpesa.qrcode.service.IQRCodeCore;
import com.mpesa.qrcode.service.impl.callbacks.IBulkGenerationCallback;
import com.mpesa.qrcode.service.impl.callbacks.IDecodeQRCallback;
import com.mpesa.qrcode.service.impl.callbacks.IEncodeQRCallback;
import com.mpesa.qrcode.service.impl.callbacks.ISkipDecodeFieldCallback;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class QRCodeCore implements IQRCodeCore {
    private AdditionalParameters decodedAdditionalParameters;
    private LanguageTemplate decodedLanguageTemplate;
    private QRPayload decodedQRPayload;
    private final Validator validator = new Validator();
    private final LegacyQRDecoder legacyQRDecoder = new LegacyQRDecoder();
    private final DynamicDecodeHelper dynamicDecodeHelper = new DynamicDecodeHelper();

    @Override
    public QRCodeCore setAuthCredentials(String str, String str2, String str3) {
        SupportInterceptor.getInstance().setClientID(str);
        SupportInterceptor.getInstance().setClientSecret(str2);
        SupportInterceptor.getInstance().setScope(str3);
        return this;
    }

    @Override
    public QRCodeCore setBaseEndpoints(String str, String str2) {
        AuthClient.setAuthUrl(str);
        APIClient.setBaseUrl(str2);
        return this;
    }

    @Override
    public String getEncodedQRString(QRPayload qRPayload) throws ConfigurationException, FieldValidationException {
        if (!this.validator.validateMPAQRFormat(qRPayload)) {
            return null;
        }
        try {
            return buildDynamicQRString(qRPayload);
        } catch (ConfigNotFoundException unused) {
            if (qRPayload.getChannelID().isEmpty()) {
                qRPayload.setChannelID("00000");
            }
            if (qRPayload.getNetworkID().isEmpty()) {
                qRPayload.setNetworkID("00000");
            }
            return getQRPayloadString(qRPayload);
        } catch (NullPointerException unused2) {
            throw new ConfigurationException("Invalid configuration file GE");
        }
    }

    @Override
    public String getEncodedBase64String(QRPayload qRPayload, int i) throws ConfigurationException, FieldValidationException {
        String qRPayloadString;
        if (!this.validator.validateMPAQRFormat(qRPayload)) {
            return null;
        }
        try {
            qRPayloadString = buildDynamicQRString(qRPayload);
        } catch (ConfigNotFoundException unused) {
            if (qRPayload.getChannelID().isEmpty()) {
                qRPayload.setChannelID("00000");
            }
            if (qRPayload.getNetworkID().isEmpty()) {
                qRPayload.setNetworkID("00000");
            }
            qRPayloadString = getQRPayloadString(qRPayload);
        } catch (NullPointerException unused2) {
            throw new ConfigurationException("Invalid configuration file GE64");
        }
        String str = qRPayloadString;
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        try {
            Bitmap bitmapEncodeBitmap = barcodeEncoder.encodeBitmap(str, BarcodeFormat.QR_CODE, i, i, enumMap);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapEncodeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getEncodedBase64String(QRPayload qRPayload) throws ConfigurationException, FieldValidationException {
        String qRPayloadString;
        if (!this.validator.validateMPAQRFormat(qRPayload)) {
            return null;
        }
        try {
            qRPayloadString = buildDynamicQRString(qRPayload);
        } catch (ConfigNotFoundException unused) {
            if (qRPayload.getChannelID().isEmpty()) {
                qRPayload.setChannelID("00000");
            }
            if (qRPayload.getNetworkID().isEmpty()) {
                qRPayload.setNetworkID("00000");
            }
            qRPayloadString = getQRPayloadString(qRPayload);
        } catch (NullPointerException unused2) {
            throw new ConfigurationException(ErrorStore.INVALID_CONFIG_FILE);
        }
        try {
            Bitmap bitmapEncodeBitmap = new BarcodeEncoder().encodeBitmap(qRPayloadString, BarcodeFormat.QR_CODE, 300, 300);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapEncodeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void getEncodedQRStringOnline(QRPayload qRPayload, String str, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException {
        qRPayload.setQrFormat("02");
        encodeQROnline(qRPayload, str, 300, iEncodeQRCallback);
    }

    @Override
    public void getEncodedBase64StringOnline(QRPayload qRPayload, String str, int i, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException {
        qRPayload.setQrFormat("01");
        encodeQROnline(qRPayload, str, i, iEncodeQRCallback);
    }

    @Override
    public void getEncodedBase64StringOnline(QRPayload qRPayload, String str, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException {
        qRPayload.setQrFormat("01");
        encodeQROnline(qRPayload, str, 300, iEncodeQRCallback);
    }

    @Override
    public void getEncodedQRList(StaticQRListPayload staticQRListPayload, IBulkGenerationCallback iBulkGenerationCallback) throws FieldValidationException {
        if (staticQRListPayload.getChannelID().isEmpty()) {
            staticQRListPayload.setChannelID("00000");
        }
        if (staticQRListPayload.getNetworkID().isEmpty()) {
            staticQRListPayload.setNetworkID("00000");
        }
        if (this.validator.validateQRListPayload(staticQRListPayload)) {
            staticQRListPayload.setFormat(2);
            NetworkService.getInstance().generateBulk(staticQRListPayload, iBulkGenerationCallback);
        }
    }

    @Override
    public void getEncodedBase64QRList(StaticQRListPayload staticQRListPayload, IBulkGenerationCallback iBulkGenerationCallback) throws FieldValidationException {
        if (staticQRListPayload.getChannelID().isEmpty()) {
            staticQRListPayload.setChannelID("00000");
        }
        if (staticQRListPayload.getNetworkID().isEmpty()) {
            staticQRListPayload.setNetworkID("00000");
        }
        if (this.validator.validateQRListPayload(staticQRListPayload)) {
            staticQRListPayload.setFormat(1);
            NetworkService.getInstance().generateBulk(staticQRListPayload, iBulkGenerationCallback);
        }
    }

    @Override
    public QRPayload decodeQR(String str) throws ConfigurationException, UnrecognizedQRException, InvalidCRCException, FieldValidationException {
        JsonSchema jsonSchema;
        List<JsonSchema> list;
        String strExtractQRPayloadFromDeepLinkIfPresent = extractQRPayloadFromDeepLinkIfPresent(str.trim());
        boolean zIsJSONValid = this.validator.isJSONValid(strExtractQRPayloadFromDeepLinkIfPresent);
        Type type = new TypeToken<List<JsonSchema>>() {
        }.getType();
        Configs configs = new Configs();
        ArrayList arrayList = new ArrayList();
        ArrayList<JsonSchema> arrayList2 = new ArrayList();
        Gson gson = new Gson();
        List<JsonSchema> list2 = null;
        try {
            jsonSchema = (JsonSchema) gson.fromJson(configs.getMainConfig(), JsonSchema.class);
        } catch (JsonSyntaxException unused) {
            Log.e("MainConfig", "JSON exception");
            jsonSchema = null;
        }
        try {
            list = (List) gson.fromJson(configs.getInteroperabilityConfig(), type);
        } catch (JsonSyntaxException unused2) {
            Log.e("InterOpConfig", "JSON exception");
            list = null;
        }
        try {
            list2 = (List) gson.fromJson(configs.getBackwardConfig(), type);
        } catch (JsonSyntaxException unused3) {
            Log.e("BackwardConfig", "JSON exception");
        }
        if (list2 != null && list2.size() != 0) {
            for (JsonSchema jsonSchema2 : list2) {
                if (jsonSchema2.getQrFormatType().equals(QRFormat.JSON)) {
                    arrayList.add(jsonSchema2);
                } else {
                    arrayList2.add(jsonSchema2);
                }
            }
        }
        if (zIsJSONValid) {
            return this.legacyQRDecoder.decodeJSONFormat(arrayList, strExtractQRPayloadFromDeepLinkIfPresent);
        }
        if (arrayList2.size() != 0) {
            for (JsonSchema jsonSchema3 : arrayList2) {
                if (this.validator.validateWithRegex(jsonSchema3.getRegex(), strExtractQRPayloadFromDeepLinkIfPresent)) {
                    return this.legacyQRDecoder.decodeNonJsonFormat(jsonSchema3, strExtractQRPayloadFromDeepLinkIfPresent);
                }
            }
        }
        return chooseDecodeMethod(jsonSchema, list, strExtractQRPayloadFromDeepLinkIfPresent);
    }

    @Override
    public void decodeQROnline(String str, String str2, IDecodeQRCallback iDecodeQRCallback) throws FieldValidationException {
        if (str2.trim().isEmpty()) {
            throw new FieldValidationException(ErrorStore.EMPTY_MARKET);
        }
        NetworkService.getInstance().decodeQR(str, str2, iDecodeQRCallback);
    }

    private void encodeQROnline(QRPayload qRPayload, String str, int i, IEncodeQRCallback iEncodeQRCallback) throws FieldValidationException {
        qRPayload.setSize(i);
        if (str.trim().isEmpty()) {
            throw new FieldValidationException(ErrorStore.EMPTY_MARKET);
        }
        if (qRPayload.getAdditionalParameters() != null) {
            if (qRPayload.getAdditionalParameters().getGeneratedDateTime() == null || qRPayload.getAdditionalParameters().getGeneratedDateTime().isEmpty()) {
                qRPayload.getAdditionalParameters().setGeneratedDateTime(getDateTime());
            }
        } else {
            AdditionalParameters additionalParameters = new AdditionalParameters();
            additionalParameters.setGeneratedDateTime(getDateTime());
            qRPayload.setAdditionalParameters(additionalParameters);
        }
        if (this.validator.validateMPAQRFormat(qRPayload)) {
            NetworkService.getInstance().encodeQR(qRPayload, str, iEncodeQRCallback);
        }
    }

    private QRPayload decodeQRString(String str) throws UnrecognizedQRException, FieldValidationException {
        int i;
        try {
            this.decodedQRPayload = new QRPayload();
            this.decodedAdditionalParameters = new AdditionalParameters();
            this.decodedLanguageTemplate = new LanguageTemplate();
            int i2 = 0;
            for (int i3 = 0; i3 < str.length() && (i = i2 + 2) <= str.length(); i3++) {
                String strSubstring = str.substring(i2, i);
                int i4 = i2 + 4;
                if (strSubstring.equals("14")) {
                    i4 = i2 + 5;
                }
                String strSubstring2 = str.substring(i, i4);
                getQRData(str, strSubstring, i4, Integer.parseInt(strSubstring2) + i4);
                i2 = Integer.parseInt(strSubstring2) + i4;
            }
            int length = str.length() - 5;
            if (str.substring(str.length() - 9, length).equals("1505")) {
                this.decodedQRPayload.setCrc(str.substring(length));
            }
            AdditionalParameters additionalParameters = this.decodedAdditionalParameters;
            if (additionalParameters != null) {
                this.decodedQRPayload.setAdditionalParameters(additionalParameters);
            }
            LanguageTemplate languageTemplate = this.decodedLanguageTemplate;
            if (languageTemplate != null) {
                this.decodedQRPayload.setLanguageTemplate(languageTemplate);
            }
            this.validator.validateMPAQRFormat(this.decodedQRPayload);
            return this.decodedQRPayload;
        } catch (IndexOutOfBoundsException | NullPointerException | NumberFormatException unused) {
            throw new UnrecognizedQRException();
        }
    }

    private QRPayload chooseDecodeMethod(JsonSchema jsonSchema, List<JsonSchema> list, String str) throws ConfigurationException, UnrecognizedQRException, InvalidCRCException, FieldValidationException {
        if (jsonSchema != null && Boolean.TRUE.equals(jsonSchema.getIsDeepLink()) && str.contains("://")) {
            str = extractQRStringFromDeepLink(str, jsonSchema);
        }
        if (jsonSchema != null) {
            if (this.validator.validateWithRegex(jsonSchema.getRegex(), str)) {
                return decodeDynamicQRString(str, jsonSchema);
            }
            if (list != null) {
                for (JsonSchema jsonSchema2 : list) {
                    if (this.validator.validateWithRegex(jsonSchema2.getRegex(), str)) {
                        return decodeDynamicQRString(str, jsonSchema2);
                    }
                }
            } else {
                return decodeMPAFormat(str);
            }
        } else if (list != null) {
            for (JsonSchema jsonSchema3 : list) {
                if (this.validator.validateWithRegex(jsonSchema3.getRegex(), str)) {
                    return decodeDynamicQRString(str, jsonSchema3);
                }
            }
        }
        return decodeMPAFormat(str);
    }

    private String extractQRPayloadFromDeepLinkIfPresent(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return str;
        }
        int iIndexOf = str.indexOf("?=");
        if (iIndexOf != -1 && (i = iIndexOf + 2) < str.length()) {
            return normalizeExtractedPayload(str.substring(i), str);
        }
        int iIndexOf2 = str.indexOf("0002");
        return iIndexOf2 > 0 ? normalizeExtractedPayload(str.substring(iIndexOf2), str) : str;
    }

    private static String percentDecodeRfc3986(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return str == null ? "" : str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '%' && (i = i2 + 2) < str.length()) {
                int iDigit = Character.digit(str.charAt(i2 + 1), 16);
                int iDigit2 = Character.digit(str.charAt(i), 16);
                if (iDigit >= 0 && iDigit2 >= 0) {
                    byteArrayOutputStream.write((iDigit << 4) | iDigit2);
                    i2 += 3;
                }
            }
            byteArrayOutputStream.write((byte) (cCharAt & 255));
            i2++;
        }
        return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
    }

    private static String percentEncodeRfc3986(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name()).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private String normalizeExtractedPayload(String str, String str2) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (str2 != null && ((str2.contains("://") || str2.contains("%")) && strTrim.contains("%"))) {
            try {
                strTrim = percentDecodeRfc3986(strTrim);
            } catch (Exception unused) {
            }
        }
        return strTrim.trim();
    }

    private String extractQRStringFromDeepLink(String str, JsonSchema jsonSchema) {
        int i;
        if (str == null || str.isEmpty()) {
            return "";
        }
        String deepLinkURI = jsonSchema != null ? jsonSchema.getDeepLinkURI() : null;
        if (deepLinkURI != null && str.startsWith(deepLinkURI)) {
            str = str.substring(deepLinkURI.length());
        }
        int iIndexOf = str.indexOf("?=");
        if (iIndexOf != -1 && (i = iIndexOf + 2) < str.length()) {
            return str.substring(i);
        }
        int iIndexOf2 = str.indexOf("0002");
        return iIndexOf2 != -1 ? str.substring(iIndexOf2) : str;
    }

    private QRPayload decodeMPAFormat(String str) throws UnrecognizedQRException, InvalidCRCException, FieldValidationException {
        if (str.length() < 50) {
            throw new UnrecognizedQRException();
        }
        int length = str.length() - 5;
        if (str.substring(length).equalsIgnoreCase(CRCService.generateMCRF4XXCrc(str.substring(0, length).getBytes(StandardCharsets.UTF_8), 5))) {
            return decodeQRString(str);
        }
        throw new InvalidCRCException();
    }

    private Map<String, String> convertObjToHashMap(Object obj) {
        HashMap map = new HashMap();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), null);
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private QRPayload decodeDynamicQRString(String str, JsonSchema jsonSchema) throws ConfigurationException, UnrecognizedQRException, InvalidCRCException, FieldValidationException {
        String strGenerateCRC;
        int i;
        boolean[] zArr;
        String str2;
        int i2;
        String str3;
        int i3;
        int i4;
        int i5;
        String str4;
        String str5;
        int i6;
        this.decodedQRPayload = new QRPayload();
        this.decodedAdditionalParameters = new AdditionalParameters();
        this.decodedLanguageTemplate = new LanguageTemplate();
        try {
            Gson gson = new Gson();
            List<SchemaField> listSortByOrder = this.dynamicDecodeHelper.sortByOrder(jsonSchema.getFields());
            Map<String, String> mapConvertObjToHashMap = convertObjToHashMap(new QRPayload());
            Map<String, String> mapConvertObjToHashMap2 = convertObjToHashMap(new AdditionalParameters());
            Map<String, String> mapConvertObjToHashMap3 = convertObjToHashMap(new LanguageTemplate());
            int i7 = 0;
            for (int i8 = 0; i8 < str.length() && (i = i7 + 2) <= str.length(); i8++) {
                String strSubstring = str.substring(i7, i);
                int i9 = i7 + 4;
                String strSubstring2 = str.substring(i, i9);
                String strSubstring3 = str.substring(i9, Integer.parseInt(strSubstring2) + i9);
                for (SchemaField schemaField : listSortByOrder) {
                    int i10 = 1;
                    final boolean[] zArr2 = new boolean[1];
                    if (schemaField.getChildren().size() == 0) {
                        if (schemaField.getMapFieldId().equals(strSubstring)) {
                            zArr = zArr2;
                            str2 = strSubstring3;
                            i2 = i9;
                            str3 = strSubstring;
                            this.dynamicDecodeHelper.checkParentKeyAndAppend(strSubstring3, schemaField, mapConvertObjToHashMap2, mapConvertObjToHashMap3, mapConvertObjToHashMap, new ISkipDecodeFieldCallback() {
                                @Override
                                public final void onSkipDecodeRulePerformed(boolean z, boolean z2) {
                                    QRCodeCore.lambda$decodeDynamicQRString$0(zArr2, z, z2);
                                }
                            });
                            str5 = str2;
                        } else {
                            zArr = zArr2;
                            i2 = i9;
                            str3 = strSubstring;
                            str5 = strSubstring3;
                        }
                    } else {
                        zArr = zArr2;
                        str2 = strSubstring3;
                        i2 = i9;
                        str3 = strSubstring;
                        if (schemaField.getMpaKey() == null && schemaField.getChildren().size() != 0 && schemaField.getMapFieldId().equals(str3)) {
                            int i11 = 0;
                            int i12 = 0;
                            while (i12 < str2.length() && (i3 = i11 + 2) <= str2.length()) {
                                String str6 = str2;
                                String strSubstring4 = str6.substring(i11, i3);
                                int i13 = i11 + 4;
                                String strSubstring5 = str6.substring(i3, i13);
                                String strSubstring6 = str6.substring(i13, Integer.parseInt(strSubstring5) + i13);
                                int i14 = Integer.parseInt(strSubstring5);
                                for (SchemaField schemaField2 : schemaField.getChildren()) {
                                    if (schemaField2.getMapFieldId().equals(strSubstring4)) {
                                        final boolean[] zArr3 = new boolean[i10];
                                        i6 = i12;
                                        i4 = i13;
                                        i5 = i10;
                                        str4 = strSubstring4;
                                        str5 = str6;
                                        this.dynamicDecodeHelper.checkParentKeyAndAppend(strSubstring6, schemaField2, mapConvertObjToHashMap2, mapConvertObjToHashMap3, mapConvertObjToHashMap, new ISkipDecodeFieldCallback() {
                                            @Override
                                            public final void onSkipDecodeRulePerformed(boolean z, boolean z2) {
                                                QRCodeCore.lambda$decodeDynamicQRString$1(zArr3, z, z2);
                                            }
                                        });
                                        if (zArr3[0]) {
                                            break;
                                        }
                                    } else {
                                        i4 = i13;
                                        i5 = i10;
                                        str4 = strSubstring4;
                                        str5 = str6;
                                        i6 = i12;
                                    }
                                    i10 = i5;
                                    i12 = i6;
                                    i13 = i4;
                                    strSubstring4 = str4;
                                    str6 = str5;
                                }
                                i12++;
                                i11 = i14 + i13;
                                str2 = str6;
                            }
                            str5 = str2;
                        } else {
                            str5 = str2;
                        }
                    }
                    boolean z = zArr[0];
                    strSubstring = str3;
                    i9 = i2;
                    strSubstring3 = str5;
                }
                i7 = Integer.parseInt(strSubstring2) + i9;
            }
            setRequiredDefaultValues(listSortByOrder, mapConvertObjToHashMap, mapConvertObjToHashMap2, mapConvertObjToHashMap3);
            this.decodedAdditionalParameters = (AdditionalParameters) gson.fromJson(gson.toJson(mapConvertObjToHashMap2), AdditionalParameters.class);
            this.decodedLanguageTemplate = (LanguageTemplate) gson.fromJson(gson.toJson(mapConvertObjToHashMap3), LanguageTemplate.class);
            QRPayload qRPayload = (QRPayload) gson.fromJson(gson.toJson(mapConvertObjToHashMap), QRPayload.class);
            this.decodedQRPayload = qRPayload;
            qRPayload.setAdditionalParameters(this.decodedAdditionalParameters);
            this.decodedQRPayload.setLanguageTemplate(this.decodedLanguageTemplate);
            this.validator.validateMPAQRFormat(this.decodedQRPayload);
            if (this.decodedQRPayload.getCrc() == null) {
                throw new InvalidCRCException();
            }
            if (this.decodedQRPayload.getCrc().length() == 4) {
                strGenerateCRC = CRCService.generateCRC(str.substring(0, str.length() - 4).getBytes(StandardCharsets.UTF_8), 4, jsonSchema.getCrcFormat());
            } else {
                strGenerateCRC = CRCService.generateCRC(str.substring(0, str.length() - 5).getBytes(StandardCharsets.UTF_8), 5, jsonSchema.getCrcFormat());
            }
            if (this.decodedQRPayload.getCrc().equalsIgnoreCase(strGenerateCRC)) {
                return this.decodedQRPayload;
            }
            throw new InvalidCRCException();
        } catch (IndexOutOfBoundsException | NullPointerException | NumberFormatException unused) {
            throw new UnrecognizedQRException();
        }
    }

    static void lambda$decodeDynamicQRString$0(boolean[] zArr, boolean z, boolean z2) {
        if (z) {
            zArr[0] = true;
        }
    }

    static void lambda$decodeDynamicQRString$1(boolean[] zArr, boolean z, boolean z2) {
        if (z2) {
            zArr[0] = true;
        }
    }

    private void setRequiredDefaultValues(List<SchemaField> list, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        for (SchemaField schemaField : list) {
            if (schemaField.getChildren().size() == 0) {
                if (map.containsKey(schemaField.getMpaKey()) && map.get(schemaField.getMpaKey()) == null && !isNullOrEmpty(schemaField.getDefaultValue())) {
                    map.put(schemaField.getMpaKey(), schemaField.getDefaultValue());
                } else if (map2.containsKey(schemaField.getMpaKey()) && map2.get(schemaField.getMpaKey()) == null && !isNullOrEmpty(schemaField.getDefaultValue())) {
                    map2.put(schemaField.getMpaKey(), schemaField.getDefaultValue());
                } else if (map3.containsKey(schemaField.getMpaKey()) && map3.get(schemaField.getMpaKey()) == null && !isNullOrEmpty(schemaField.getDefaultValue())) {
                    map3.put(schemaField.getMpaKey(), schemaField.getDefaultValue());
                }
            } else if (schemaField.getChildren().size() > 0) {
                for (SchemaField schemaField2 : schemaField.getChildren()) {
                    if (map.containsKey(schemaField2.getMpaKey()) && map.get(schemaField2.getMpaKey()) == null && !isNullOrEmpty(schemaField2.getDefaultValue())) {
                        map.put(schemaField2.getMpaKey(), schemaField2.getDefaultValue());
                    } else if (map2.containsKey(schemaField2.getMpaKey()) && map2.get(schemaField2.getMpaKey()) == null && !isNullOrEmpty(schemaField2.getDefaultValue())) {
                        map2.put(schemaField2.getMpaKey(), schemaField2.getDefaultValue());
                    } else if (map3.containsKey(schemaField2.getMpaKey()) && map3.get(schemaField2.getMpaKey()) == null && !isNullOrEmpty(schemaField2.getDefaultValue())) {
                        map3.put(schemaField2.getMpaKey(), schemaField2.getDefaultValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getQRData(java.lang.String r2, java.lang.String r3, int r4, int r5) throws com.mpesa.qrcode.exception.UnrecognizedQRException {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.QRCodeCore.getQRData(java.lang.String, java.lang.String, int, int):void");
    }

    private void decodeAdditionalParams(String str) throws UnrecognizedQRException {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length() && (i = i2 + 2) <= str.length(); i3++) {
            try {
                String strSubstring = str.substring(i2, i);
                int i4 = i2 + 4;
                String strSubstring2 = str.substring(i, i4);
                getAdditionalParams(str, strSubstring, i4, Integer.parseInt(strSubstring2) + i4);
                i2 = i4 + Integer.parseInt(strSubstring2);
            } catch (Exception unused) {
                throw new UnrecognizedQRException();
            }
        }
    }

    private void processLanguagePreferences(String str) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length() && (i = i2 + 2) <= str.length(); i3++) {
            try {
                String strSubstring = str.substring(i2, i);
                int i4 = i2 + 4;
                String strSubstring2 = str.substring(i, i4);
                decodeLanguagePreferences(str, strSubstring, i4, Integer.parseInt(strSubstring2) + i4);
                i2 = i4 + Integer.parseInt(strSubstring2);
            } catch (Exception e) {
                Log.e("decodeAdditionalParams", e.getMessage());
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getAdditionalParams(java.lang.String r2, java.lang.String r3, int r4, int r5) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.QRCodeCore.getAdditionalParams(java.lang.String, java.lang.String, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void decodeLanguagePreferences(java.lang.String r2, java.lang.String r3, int r4, int r5) {
        /*
            r1 = this;
            java.lang.String r2 = r2.substring(r4, r5)
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = 2
            r0 = 1
            switch(r4) {
                case 1537: goto L27;
                case 1538: goto L1c;
                case 1539: goto L11;
                default: goto L10;
            }
        L10:
            goto L32
        L11:
            java.lang.String r4 = "03"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1a
            goto L32
        L1a:
            r3 = r5
            goto L33
        L1c:
            java.lang.String r4 = "02"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L25
            goto L32
        L25:
            r3 = r0
            goto L33
        L27:
            java.lang.String r4 = "01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L30
            goto L32
        L30:
            r3 = 0
            goto L33
        L32:
            r3 = -1
        L33:
            if (r3 == 0) goto L46
            if (r3 == r0) goto L40
            if (r3 == r5) goto L3a
            return
        L3a:
            com.mpesa.qrcode.model.LanguageTemplate r3 = r1.decodedLanguageTemplate
            r3.setMerchantCityAlternateLanguage(r2)
            return
        L40:
            com.mpesa.qrcode.model.LanguageTemplate r3 = r1.decodedLanguageTemplate
            r3.setMerchantNameAlternateLanguage(r2)
            return
        L46:
            com.mpesa.qrcode.model.LanguageTemplate r3 = r1.decodedLanguageTemplate
            r3.setLanguagePreference(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.QRCodeCore.decodeLanguagePreferences(java.lang.String, java.lang.String, int, int):void");
    }

    private String getQRPayloadString(QRPayload qRPayload) {
        StringBuilder sb = new StringBuilder();
        checkNullAndAppend(sb, "00", qRPayload.getQrVersion(), true);
        checkNullAndAppend(sb, "01", qRPayload.getQrType(), true);
        checkNullAndAppend(sb, "02", qRPayload.getTrxCode(), true);
        checkNullAndAppend(sb, "03", qRPayload.getCreditPartyIdentifier(), true);
        checkNullAndAppend(sb, "04", qRPayload.getCreditPartyName(), true);
        checkNullAndAppend(sb, "05", qRPayload.getMerchantCCode(), true);
        checkNullAndAppendBigDecimal(sb, "06", qRPayload.getAmount());
        checkNullAndAppend(sb, "07", qRPayload.getCurrencyCode(), true);
        checkNullAndAppend(sb, "08", qRPayload.getRefNo(), true);
        checkNullAndAppend(sb, "09", qRPayload.getMerchantLoc(), true);
        checkNullAndAppend(sb, "10", qRPayload.getPostalCode(), true);
        checkNullAndAppend(sb, "11", qRPayload.getCountryCode(), true);
        checkNullAndAppend(sb, "12", qRPayload.getChannelID(), true);
        checkNullAndAppend(sb, "13", qRPayload.getNetworkID(), true);
        if (qRPayload.getAdditionalParameters() != null) {
            if (qRPayload.getAdditionalParameters().getGeneratedDateTime() == null || qRPayload.getAdditionalParameters().getGeneratedDateTime().isEmpty()) {
                qRPayload.getAdditionalParameters().setGeneratedDateTime(getDateTime());
            }
            checkNullAndAppendAdditionalParamObject(sb, getAdditionalParams(qRPayload.getAdditionalParameters()));
        }
        if (qRPayload.getLanguageTemplate() != null) {
            checkNullAndAppend(sb, "15", getLanguagePreferences(qRPayload.getLanguageTemplate()), true);
        }
        sb.append("1605");
        sb.append(CRCService.generateMCRF4XXCrc(sb.toString().getBytes(StandardCharsets.UTF_8), 5));
        return sb.toString();
    }

    private String getAdditionalParams(AdditionalParameters additionalParameters) {
        StringBuilder sb = new StringBuilder();
        checkNullAndAppend(sb, "01", additionalParameters.getTerminalID(), false);
        checkNullAndAppend(sb, "02", additionalParameters.getCashierID(), false);
        checkNullAndAppend(sb, "03", additionalParameters.getStoreID(), false);
        checkNullAndAppend(sb, "04", additionalParameters.getMobileNumber(), false);
        checkNullAndAppend(sb, "05", additionalParameters.getPurpose(), false);
        checkNullAndAppend(sb, "06", additionalParameters.getLoyaltyNo(), false);
        checkNullAndAppend(sb, "07", additionalParameters.getTipConvenienceFeeIndicator(), false);
        checkNullAndAppendBigDecimal(sb, "08", additionalParameters.getValueOfConvenienceFeeFixed());
        checkNullAndAppend(sb, "09", additionalParameters.getValueOfConvenienceFeePercentage(), false);
        checkNullAndAppend(sb, "10", additionalParameters.getDiscountIndicator(), false);
        checkNullAndAppendBigDecimal(sb, "11", additionalParameters.getDiscount());
        checkNullAndAppend(sb, "12", additionalParameters.getGeneratedDateTime(), false);
        checkNullAndAppend(sb, "13", additionalParameters.getExpiryDateTime(), false);
        checkNullAndAppend(sb, "14", additionalParameters.getEmail(), false);
        checkNullAndAppend(sb, "15", additionalParameters.getStatus(), false);
        checkNullAndAppendBigDecimal(sb, "16", additionalParameters.getTax());
        checkNullAndAppend(sb, "17", additionalParameters.getOrgShortCode(), false);
        checkNullAndAppend(sb, "18", additionalParameters.getConsumerLabel(), false);
        checkNullAndAppend(sb, "19", additionalParameters.getAdditionalConsumerDataRequest(), false);
        return sb.toString();
    }

    private String getLanguagePreferences(LanguageTemplate languageTemplate) {
        StringBuilder sb = new StringBuilder();
        checkNullAndAppend(sb, "01", languageTemplate.getLanguagePreference(), false);
        checkNullAndAppend(sb, "02", languageTemplate.getMerchantNameAlternateLanguage(), false);
        checkNullAndAppend(sb, "03", languageTemplate.getMerchantCityAlternateLanguage(), false);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String buildDynamicQRString(com.mpesa.qrcode.model.QRPayload r24) throws com.mpesa.qrcode.exception.ConfigurationException, com.mpesa.qrcode.exception.FieldValidationException, com.mpesa.qrcode.exception.ConfigNotFoundException {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.QRCodeCore.buildDynamicQRString(com.mpesa.qrcode.model.QRPayload):java.lang.String");
    }

    static JsonElement lambda$buildDynamicQRString$2(BigDecimal bigDecimal, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(bigDecimal.toString());
    }

    private void validateAndAppend(StringBuilder sb, Object obj, SchemaField schemaField) throws ConfigurationException, FieldValidationException {
        if ((obj == null || obj.toString().isEmpty()) && !isNullOrEmpty(schemaField.getDefaultValue())) {
            obj = schemaField.getDefaultValue();
        }
        if (!this.validator.validateDynamicFormat(obj, schemaField) || obj == null) {
            return;
        }
        String string = obj.toString();
        if (string.isEmpty()) {
            return;
        }
        sb.append(schemaField.getMapFieldId());
        sb.append(appendZeroToLength(string.length()));
        sb.append(string);
    }

    private void checkNullAndAppendAdditionalParamObject(StringBuilder sb, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String str2 = String.format(Locale.US, "%03d", Integer.valueOf(str.length()));
        sb.append("14");
        sb.append(str2);
        sb.append(str);
    }

    private void checkNullAndAppend(StringBuilder sb, String str, String str2, boolean z) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        String strAppendZeroToValue = appendZeroToValue(str2, str, z);
        String strAppendZeroToLength = appendZeroToLength(strAppendZeroToValue.length());
        sb.append(str);
        sb.append(strAppendZeroToLength);
        sb.append(strAppendZeroToValue);
    }

    private void checkNullAndAppendBigDecimal(StringBuilder sb, String str, BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            BigDecimal scale = bigDecimal.setScale(2, 6);
            String strAppendZeroToLength = appendZeroToLength(scale.toString().length());
            sb.append(str);
            sb.append(strAppendZeroToLength);
            sb.append(scale);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String appendZeroToValue(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            if (r10 != 0) goto L3
            return r8
        L3:
            r9.hashCode()
            int r10 = r9.hashCode()
            r0 = 1541(0x605, float:2.16E-42)
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "00"
            if (r10 == r0) goto L56
            r0 = 1569(0x621, float:2.199E-42)
            if (r10 == r0) goto L4b
            r0 = 1570(0x622, float:2.2E-42)
            if (r10 == r0) goto L40
            switch(r10) {
                case 1536: goto L37;
                case 1537: goto L2c;
                case 1538: goto L21;
                default: goto L20;
            }
        L20:
            goto L5e
        L21:
            java.lang.String r10 = "02"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L2a
            goto L5e
        L2a:
            r9 = r4
            goto L61
        L2c:
            java.lang.String r10 = "01"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L35
            goto L5e
        L35:
            r9 = r5
            goto L61
        L37:
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L3e
            goto L5e
        L3e:
            r9 = 0
            goto L61
        L40:
            java.lang.String r10 = "13"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L49
            goto L5e
        L49:
            r9 = r1
            goto L61
        L4b:
            java.lang.String r10 = "12"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L54
            goto L5e
        L54:
            r9 = r2
            goto L61
        L56:
            java.lang.String r10 = "05"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L60
        L5e:
            r9 = -1
            goto L61
        L60:
            r9 = r3
        L61:
            if (r9 == 0) goto L9c
            if (r9 == r5) goto L9c
            if (r9 == r4) goto L9c
            if (r9 == r3) goto L85
            if (r9 == r2) goto L6e
            if (r9 == r1) goto L6e
            return r8
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "00000"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r8 = r8.length()
            java.lang.String r8 = r9.substring(r8)
            return r8
        L85:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "0000"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r8 = r8.length()
            java.lang.String r8 = r9.substring(r8)
            return r8
        L9c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            int r8 = r8.length()
            java.lang.String r8 = r9.substring(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.QRCodeCore.appendZeroToValue(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private String appendZeroToLength(int i) {
        if (i < 10) {
            return String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
        }
        return Integer.toString(i);
    }

    private String getDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BuildConfig.DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
