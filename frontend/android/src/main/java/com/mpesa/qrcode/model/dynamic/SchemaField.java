package com.mpesa.qrcode.model.dynamic;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SchemaField {

    @SerializedName(alternate = {"Children"}, value = "children")
    List<SchemaField> children;

    @SerializedName(alternate = {"DefaultValue"}, value = "defaultValue")
    String defaultValue;

    @SerializedName(alternate = {"Id"}, value = GriverCacheDao.COLUMN_CACHE_ID)
    String id;

    @SerializedName(alternate = {"MapFieldId"}, value = "mapFieldId")
    String mapFieldId;

    @SerializedName(alternate = {"MapFieldName"}, value = "mapFieldName")
    String mapFieldName;

    @SerializedName("mpaChildFieldId")
    String mpaChildFieldId;

    @SerializedName(alternate = {"MpaFieldId"}, value = "mpaFieldId")
    String mpaFieldId;

    @SerializedName(alternate = {"MpaFieldName"}, value = "mpaFieldName")
    String mpaFieldName;

    @SerializedName(alternate = {"MpaKey"}, value = "mpaKey")
    String mpaKey;

    @SerializedName(alternate = {"MpaParentKey"}, value = "mpaParentKey")
    String mpaParentKey;

    @SerializedName(alternate = {"Order"}, value = "order")
    int order;

    @SerializedName(alternate = {"Rules"}, value = "rules")
    List<Rule> rules;

    @SerializedName(alternate = {"Validations"}, value = "validations")
    SchemaValidation validations;

    @SerializedName(alternate = {"ValueMap"}, value = "valueMap")
    List<ValueMap> valueMap;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int i) {
        this.order = i;
    }

    public String getMpaKey() {
        return this.mpaKey;
    }

    public void setMpaKey(String str) {
        this.mpaKey = str;
    }

    public String getMpaParentKey() {
        return this.mpaParentKey;
    }

    public void setMpaParentKey(String str) {
        this.mpaParentKey = str;
    }

    public String getMpaFieldId() {
        return this.mpaFieldId;
    }

    public void setMpaFieldId(String str) {
        this.mpaFieldId = str;
    }

    public String getMpaChildFieldId() {
        return this.mpaChildFieldId;
    }

    public void setMpaChildFieldId(String str) {
        this.mpaChildFieldId = str;
    }

    public String getMpaFieldName() {
        return this.mpaFieldName;
    }

    public void setMpaFieldName(String str) {
        this.mpaFieldName = str;
    }

    public String getMapFieldId() {
        return this.mapFieldId;
    }

    public void setMapFieldId(String str) {
        this.mapFieldId = str;
    }

    public SchemaValidation getValidations() {
        return this.validations;
    }

    public void setValidations(SchemaValidation schemaValidation) {
        this.validations = schemaValidation;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public List<ValueMap> getValueMap() {
        return this.valueMap;
    }

    public void setValueMap(List<ValueMap> list) {
        this.valueMap = list;
    }

    public List<SchemaField> getChildren() {
        return this.children;
    }

    public void setChildren(List<SchemaField> list) {
        this.children = list;
    }

    public String getMapFieldName() {
        return this.mapFieldName;
    }

    public void setMapFieldName(String str) {
        this.mapFieldName = str;
    }

    public List<Rule> getRules() {
        return this.rules;
    }

    public void setRules(List<Rule> list) {
        this.rules = list;
    }
}
