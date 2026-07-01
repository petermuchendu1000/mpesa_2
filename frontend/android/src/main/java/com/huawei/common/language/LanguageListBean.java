package com.huawei.common.language;

import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public class LanguageListBean implements Serializable {
    private static final long serialVersionUID = 3620372832327942334L;
    private List<LanguageBean> languageBeanList;

    public List<LanguageBean> getLanguageBeanList() {
        return this.languageBeanList;
    }

    public void setLanguageBeanList(List<LanguageBean> list) {
        this.languageBeanList = list;
    }

    public static class LanguageBean implements Serializable {
        private String countryIcon;
        private boolean isChecked;
        private String language;
        private String languageCode;

        public LanguageBean() {
        }

        public LanguageBean(String str, boolean z) {
            this.language = str;
            this.isChecked = z;
        }

        public LanguageBean(String str, String str2, boolean z) {
            this.language = str;
            this.languageCode = str2;
            this.isChecked = z;
        }

        public String getLanguage() {
            return this.language;
        }

        public void setLanguage(String str) {
            this.language = str;
        }

        public String getLanguageCode() {
            return this.languageCode;
        }

        public void setLanguageCode(String str) {
            this.languageCode = str;
        }

        public boolean isChecked() {
            return this.isChecked;
        }

        public void setChecked(boolean z) {
            this.isChecked = z;
        }

        public String getCountryIcon() {
            return this.countryIcon;
        }

        public void setCountryIcon(String str) {
            this.countryIcon = str;
        }

        public String toString() {
            return "LanguageBean{language='" + this.language + "', languageCode='" + this.languageCode + "', isChecked=" + this.isChecked + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
