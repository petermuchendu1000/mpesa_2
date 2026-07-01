package com.huawei.digitalpayment.consumer.base.database.entities;

import androidx.autofill.HintConstants;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jk\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/MessageEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "message", "type", "timestamp", TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_USERID, HintConstants.AUTOFILL_HINT_USERNAME, "userAvatar", "options", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/MessageEntity$ButtonOption;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getMessage", "getType", "getTimestamp", "getUserId", "getUsername", "getUserAvatar", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ButtonOption", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessageEntity {
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final List<ButtonOption> component1;
    private final String component2;
    private final String component3;
    private final String copy;
    private final String copydefault;
    private final String equals;
    private final String getAsAtTimestamp;

    public MessageEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ButtonOption> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.component2 = str;
        this.copydefault = str2;
        this.ShareDataUIState = str3;
        this.component3 = str4;
        this.equals = str5;
        this.getAsAtTimestamp = str6;
        this.copy = str7;
        this.component1 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        List list2;
        String str11 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = component4 + 105;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 16) != 0) {
            int i8 = component4 + 25;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i10 = getRequestBeneficiariesState + 41;
            component4 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 % 2;
            }
            str10 = null;
        } else {
            str10 = str6;
        }
        String str12 = (i & 64) != 0 ? null : str7;
        if ((i & 128) != 0) {
            int i12 = getRequestBeneficiariesState + 5;
            component4 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        this(str, str11, str8, str4, str9, str10, str12, list2);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 19;
        component4 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 79;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 23;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 23;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 27;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = component4 + 37;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 93;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getUserId() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final String getUsername() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 1;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUserAvatar() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 77;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 89;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/MessageEntity$ButtonOption;", "", "text", "", "type", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerBaseUi_release", "$serializer", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ButtonOption {

        public static final Companion INSTANCE = new Companion(null);
        private static int ShareDataUIState = 1;
        private static int copy = 1;
        private static int copydefault;
        private static int getAsAtTimestamp;
        private final String component1;
        private final String component2;
        private final String component3;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/MessageEntity$ButtonOption$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/MessageEntity$ButtonOption;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private static int component2 = 0;
            private static int component3 = 1;

            public final KSerializer<ButtonOption> serializer() {
                int i = 2 % 2;
                int i2 = component2 + 93;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                MessageEntity$ButtonOption$$serializer messageEntity$ButtonOption$$serializer = MessageEntity$ButtonOption$$serializer.INSTANCE;
                int i4 = component2 + 17;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return messageEntity$ButtonOption$$serializer;
            }

            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ButtonOption(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            SerialDescriptor descriptor;
            int i2 = 7;
            if (7 != (i & 7)) {
                int i3 = getAsAtTimestamp + 89;
                copy = i3 % 128;
                if (i3 % 2 == 0) {
                    descriptor = MessageEntity$ButtonOption$$serializer.INSTANCE.getDescriptor();
                    i2 = 36;
                } else {
                    descriptor = MessageEntity$ButtonOption$$serializer.INSTANCE.getDescriptor();
                }
                PluginExceptionsKt.throwMissingFieldException(i, i2, descriptor);
                int i4 = 2 % 2;
            }
            this.component2 = str;
            this.component3 = str2;
            this.component1 = str3;
        }

        @JvmStatic
        public static final void write$Self$ConsumerBaseUi_release(ButtonOption self, CompositeEncoder output, SerialDescriptor serialDesc) {
            int i = 2 % 2;
            int i2 = copy + 35;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            output.encodeStringElement(serialDesc, 0, self.component2);
            output.encodeStringElement(serialDesc, 1, self.component3);
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.component1);
            int i4 = getAsAtTimestamp + 5;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
        }

        public ButtonOption(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.component2 = str;
            this.component3 = str2;
            this.component1 = str3;
        }

        public final String getText() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 75;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 13;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 52 / 0;
            }
            return str;
        }

        public final String getType() {
            int i = 2 % 2;
            int i2 = copy + 99;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            throw null;
        }

        public final String getUrl() {
            int i = 2 % 2;
            int i2 = copy + 33;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component1;
            if (i3 != 0) {
                int i4 = 53 / 0;
            }
            return str;
        }

        static {
            int i = ShareDataUIState + 123;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 18 / 0;
            }
        }

        public static ButtonOption copy$default(ButtonOption buttonOption, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = buttonOption.component2;
            }
            if ((i & 2) != 0) {
                int i3 = copy + 113;
                getAsAtTimestamp = i3 % 128;
                if (i3 % 2 != 0) {
                    String str4 = buttonOption.component3;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = buttonOption.component3;
            }
            if ((i & 4) != 0) {
                str3 = buttonOption.component1;
                int i4 = getAsAtTimestamp + 49;
                copy = i4 % 128;
                int i5 = i4 % 2;
            }
            ButtonOption buttonOptionCopy = buttonOption.copy(str, str2, str3);
            int i6 = getAsAtTimestamp + 37;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return buttonOptionCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copy + 89;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 49;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 117;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 27;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 60 / 0;
            }
            return str;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 13;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 123;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ButtonOption copy(String text, String type, String url) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(text, "");
            Intrinsics.checkNotNullParameter(type, "");
            ButtonOption buttonOption = new ButtonOption(text, type, url);
            int i2 = copy + 113;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return buttonOption;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 23;
            copy = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 79;
                copy = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof ButtonOption)) {
                return false;
            }
            ButtonOption buttonOption = (ButtonOption) other;
            if (!Intrinsics.areEqual(this.component2, buttonOption.component2)) {
                int i7 = getAsAtTimestamp + 29;
                copy = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.component3, buttonOption.component3)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component1, buttonOption.component1)) {
                return true;
            }
            int i9 = getAsAtTimestamp + 71;
            copy = i9 % 128;
            return i9 % 2 == 0;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = getAsAtTimestamp + 55;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.component2.hashCode();
            int iHashCode2 = this.component3.hashCode();
            String str = this.component1;
            if (str == null) {
                int i5 = copy + 17;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                i = 0;
            } else {
                int iHashCode3 = str.hashCode();
                int i7 = copy + 25;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % 2;
                i = iHashCode3;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ButtonOption(text=" + this.component2 + ", type=" + this.component3 + ", url=" + this.component1 + ")";
            int i2 = getAsAtTimestamp + 55;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public final List<ButtonOption> getOptions() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MessageEntity copy$default(MessageEntity messageEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        String str8;
        String str9;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str8 = messageEntity.component2;
            int i3 = component4 + 43;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str8 = str;
        }
        String str10 = (i & 2) != 0 ? messageEntity.copydefault : str2;
        String str11 = (i & 4) != 0 ? messageEntity.ShareDataUIState : str3;
        String str12 = (i & 8) != 0 ? messageEntity.component3 : str4;
        if ((i & 16) != 0) {
            int i5 = component4;
            int i6 = i5 + 85;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            str9 = messageEntity.equals;
            int i8 = i5 + 93;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str9 = str5;
        }
        return messageEntity.copy(str8, str10, str11, str12, str9, (i & 32) != 0 ? messageEntity.getAsAtTimestamp : str6, (i & 64) != 0 ? messageEntity.copy : str7, (i & 128) != 0 ? messageEntity.component1 : list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 5;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 11 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 25;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 59;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 51;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 105;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 57;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 11;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 109;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<ButtonOption> component8() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<ButtonOption> list = this.component1;
        int i4 = i2 + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final MessageEntity copy(String id, String message, String type, String timestamp, String userId, String username, String userAvatar, List<ButtonOption> options) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(timestamp, "");
        MessageEntity messageEntity = new MessageEntity(id, message, type, timestamp, userId, username, userAvatar, options);
        int i2 = getRequestBeneficiariesState + 27;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return messageEntity;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.equals, r6.equals) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.getAsAtTimestamp, r6.getAsAtTimestamp)) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.component4 + 29;
        com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.getRequestBeneficiariesState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copy, r6.copy) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.component4
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 3
            int r1 = r1 / r3
            if (r5 != r6) goto L18
            goto L17
        L15:
            if (r5 != r6) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity
            if (r1 != 0) goto L1d
            return r3
        L1d:
            com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity r6 = (com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity) r6
            java.lang.String r1 = r5.component2
            java.lang.String r4 = r6.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2a
            return r3
        L2a:
            java.lang.String r1 = r5.copydefault
            java.lang.String r4 = r6.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L35
            return r3
        L35:
            java.lang.String r1 = r5.ShareDataUIState
            java.lang.String r4 = r6.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L40
            return r3
        L40:
            java.lang.String r1 = r5.component3
            java.lang.String r4 = r6.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L4b
            return r3
        L4b:
            java.lang.String r1 = r5.equals
            java.lang.String r4 = r6.equals
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L56
            return r3
        L56:
            java.lang.String r1 = r5.getAsAtTimestamp
            java.lang.String r4 = r6.getAsAtTimestamp
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto L6b
            int r6 = com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.component4
            int r6 = r6 + 29
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.getRequestBeneficiariesState = r1
            int r6 = r6 % r0
            return r3
        L6b:
            java.lang.String r0 = r5.copy
            java.lang.String r1 = r6.copy
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L76
            return r3
        L76:
            java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity$ButtonOption> r0 = r5.component1
            java.util.List<com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity$ButtonOption> r6 = r6.component1
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L81
            return r3
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.MessageEntity.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.component2.hashCode();
        String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.ShareDataUIState;
        int iHashCode5 = 1;
        if (str2 == null) {
            int i2 = getRequestBeneficiariesState + 109;
            component4 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iHashCode6 = this.component3.hashCode();
        String str3 = this.equals;
        if (str3 == null) {
            int i3 = getRequestBeneficiariesState + 59;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str3.hashCode();
        }
        String str4 = this.getAsAtTimestamp;
        if (str4 == null) {
            int i4 = component4 + 13;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.copy;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        List<ButtonOption> list = this.component1;
        return (((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MessageEntity(id=" + this.component2 + ", message=" + this.copydefault + ", type=" + this.ShareDataUIState + ", timestamp=" + this.component3 + ", userId=" + this.equals + ", username=" + this.getAsAtTimestamp + ", userAvatar=" + this.copy + ", options=" + this.component1 + ")";
        int i2 = getRequestBeneficiariesState + 67;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
