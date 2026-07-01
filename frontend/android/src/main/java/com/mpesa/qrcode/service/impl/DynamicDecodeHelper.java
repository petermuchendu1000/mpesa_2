package com.mpesa.qrcode.service.impl;

import com.mpesa.qrcode.constants.ErrorStore;
import com.mpesa.qrcode.exception.ConfigurationException;
import com.mpesa.qrcode.exception.FieldValidationException;
import com.mpesa.qrcode.model.dynamic.SchemaField;
import com.mpesa.qrcode.model.dynamic.ValueMap;
import com.mpesa.qrcode.service.impl.callbacks.ISkipDecodeFieldCallback;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class DynamicDecodeHelper {
    private final Validator validator = new Validator();

    DynamicDecodeHelper() {
    }

    void checkParentKeyAndAppend(String str, SchemaField schemaField, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, ISkipDecodeFieldCallback iSkipDecodeFieldCallback) throws ConfigurationException, FieldValidationException {
        if (this.validator.validateDynamicFormat(getValue(schemaField, str), schemaField)) {
            if (schemaField.getMpaParentKey() != null) {
                if (schemaField.getMpaParentKey().equals("additionalParameters")) {
                    checkValueMapAndAppend(schemaField, map, str, iSkipDecodeFieldCallback);
                    return;
                } else {
                    if (schemaField.getMpaParentKey().equals("languageTemplate")) {
                        checkValueMapAndAppend(schemaField, map2, str, iSkipDecodeFieldCallback);
                        return;
                    }
                    return;
                }
            }
            checkValueMapAndAppend(schemaField, map3, str, iSkipDecodeFieldCallback);
        }
    }

    private void checkValueMapAndAppend(SchemaField schemaField, Map<String, String> map, String str, ISkipDecodeFieldCallback iSkipDecodeFieldCallback) throws ConfigurationException, FieldValidationException {
        List<ValueMap> valueMap = schemaField.getValueMap();
        if (valueMap != null) {
            boolean z = false;
            for (ValueMap valueMap2 : valueMap) {
                if (str.equals(valueMap2.getMapValue())) {
                    map.put(schemaField.getMpaKey(), valueMap2.getMpaValue());
                    z = true;
                }
            }
            if (!z) {
                throw new FieldValidationException(ErrorStore.INVALID_VALUE + schemaField.getMpaFieldName());
            }
        } else {
            map.put(schemaField.getMpaKey(), str);
        }
        checkRulesAndAppend(schemaField, map, str, iSkipDecodeFieldCallback);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkRulesAndAppend(com.mpesa.qrcode.model.dynamic.SchemaField r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, com.mpesa.qrcode.service.impl.callbacks.ISkipDecodeFieldCallback r15) throws com.mpesa.qrcode.exception.ConfigurationException {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.DynamicDecodeHelper.checkRulesAndAppend(com.mpesa.qrcode.model.dynamic.SchemaField, java.util.Map, java.lang.String, com.mpesa.qrcode.service.impl.callbacks.ISkipDecodeFieldCallback):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String checkRulesAndGetValue(com.mpesa.qrcode.model.dynamic.SchemaField r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mpesa.qrcode.service.impl.DynamicDecodeHelper.checkRulesAndGetValue(com.mpesa.qrcode.model.dynamic.SchemaField, java.lang.String):java.lang.String");
    }

    private String getValue(SchemaField schemaField, String str) throws FieldValidationException {
        String strCheckRulesAndGetValue;
        List<ValueMap> valueMap = schemaField.getValueMap();
        if (schemaField.getRules() != null && schemaField.getRules().size() != 0) {
            strCheckRulesAndGetValue = checkRulesAndGetValue(schemaField, str);
        } else {
            strCheckRulesAndGetValue = "";
        }
        if (!strCheckRulesAndGetValue.isEmpty()) {
            str = strCheckRulesAndGetValue;
        }
        if (valueMap == null) {
            return str;
        }
        for (ValueMap valueMap2 : valueMap) {
            if (str.equals(valueMap2.getMapValue())) {
                return valueMap2.getMpaValue();
            }
        }
        throw new FieldValidationException(ErrorStore.INVALID_VALUE + schemaField.getMpaFieldName());
    }

    void checkDefaultValue(List<SchemaField> list, Map<String, String> map) {
        for (SchemaField schemaField : list) {
            String mpaKey = schemaField.getMpaKey();
            if (schemaField.getDefaultValue() != null && !map.containsKey(mpaKey)) {
                map.put(mpaKey, schemaField.getDefaultValue());
            }
        }
    }

    List<SchemaField> sortByOrder(List<SchemaField> list) {
        Collections.sort(list, new Comparator<SchemaField>() {
            @Override
            public int compare(SchemaField schemaField, SchemaField schemaField2) {
                return schemaField.getOrder() - schemaField2.getOrder();
            }
        });
        return list;
    }
}
