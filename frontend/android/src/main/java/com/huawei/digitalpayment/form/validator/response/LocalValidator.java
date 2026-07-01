package com.huawei.digitalpayment.form.validator.response;

import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/response/LocalValidator;", "Lcom/huawei/http/BaseResp;", "version", "", "language", "categoryName", "validatorMap", "", "Lcom/huawei/digitalpayment/form/validator/response/LocalValidatorItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getVersion", "()Ljava/lang/String;", "getLanguage", "getCategoryName", "getValidatorMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalValidator extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String categoryName;
    private final String language;
    private final Map<String, LocalValidatorItem> validatorMap;
    private final String version;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalValidator(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i4 = component2;
            int i5 = i4 + 27;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 119;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str3 = "COMMON";
        }
        if ((i & 8) != 0) {
            int i9 = component2 + 37;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                MapsKt.emptyMap();
                throw null;
            }
            map = MapsKt.emptyMap();
            int i10 = 2 % 2;
        }
        this(str, str2, str3, map);
    }

    public final String getVersion() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.version;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLanguage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.language;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCategoryName() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.categoryName;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, LocalValidatorItem> getValidatorMap() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Map<String, LocalValidatorItem> map = this.validatorMap;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public LocalValidator(String str, String str2, String str3, Map<String, LocalValidatorItem> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.version = str;
        this.language = str2;
        this.categoryName = str3;
        this.validatorMap = map;
    }

    public LocalValidator() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalValidator copy$default(LocalValidator localValidator, String str, String str2, String str3, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 73;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = localValidator.version;
            int i5 = i4 + 7;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = localValidator.language;
        }
        if ((i & 4) != 0) {
            str3 = localValidator.categoryName;
        }
        if ((i & 8) != 0) {
            map = localValidator.validatorMap;
        }
        return localValidator.copy(str, str2, str3, map);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.version;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.language;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryName;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final Map<String, LocalValidatorItem> component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, LocalValidatorItem> map = this.validatorMap;
        int i4 = i2 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    public final LocalValidator copy(String version, String language, String categoryName, Map<String, LocalValidatorItem> validatorMap) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(version, "");
        Intrinsics.checkNotNullParameter(language, "");
        Intrinsics.checkNotNullParameter(categoryName, "");
        Intrinsics.checkNotNullParameter(validatorMap, "");
        LocalValidator localValidator = new LocalValidator(version, language, categoryName, validatorMap);
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return localValidator;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof LocalValidator)) {
                return false;
            }
            LocalValidator localValidator = (LocalValidator) other;
            return Intrinsics.areEqual(this.version, localValidator.version) && !(Intrinsics.areEqual(this.language, localValidator.language) ^ true) && Intrinsics.areEqual(this.categoryName, localValidator.categoryName) && Intrinsics.areEqual(this.validatorMap, localValidator.validatorMap);
        }
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((this.version.hashCode() >> 6) << this.language.hashCode()) % 30) % this.categoryName.hashCode()) + 78) << this.validatorMap.hashCode() : (((((this.version.hashCode() * 31) + this.language.hashCode()) * 31) + this.categoryName.hashCode()) * 31) + this.validatorMap.hashCode();
        int i3 = ShareDataUIState + 35;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalValidator(version=" + this.version + ", language=" + this.language + ", categoryName=" + this.categoryName + ", validatorMap=" + this.validatorMap + ")";
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return str;
    }
}
