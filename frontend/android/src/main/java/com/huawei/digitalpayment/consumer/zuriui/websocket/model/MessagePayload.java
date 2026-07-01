package com.huawei.digitalpayment.consumer.zuriui.websocket.model;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.android.gms.common.Scopes;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0003\u001f !B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0007H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;", "", "body", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBody$annotations", "()V", "getBody", "()Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerSfcZuriUi_release", "MessageBody", "$serializer", "Companion", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class MessagePayload {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final MessageBody component3;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 1;
        private static int component3;

        public final KSerializer<MessagePayload> serializer() {
            int i = 2 % 2;
            int i2 = component3 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            MessagePayload$$serializer messagePayload$$serializer = MessagePayload$$serializer.INSTANCE;
            int i4 = component1 + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return messagePayload$$serializer;
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessagePayload(int i, MessageBody messageBody, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            int i2 = ShareDataUIState + 49;
            copydefault = i2 % 128;
            PluginExceptionsKt.throwMissingFieldException(i, 1, (i2 % 2 == 0 ? MessagePayload$$serializer.INSTANCE : MessagePayload$$serializer.INSTANCE).getCopydefault());
            int i3 = 2 % 2;
        }
        this.component3 = messageBody;
    }

    @JvmStatic
    public static final void write$Self$ConsumerSfcZuriUi_release(MessagePayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        output.encodeSerializableElement(serialDesc, 0, MessagePayload$MessageBody$$serializer.INSTANCE, self.component3);
        int i4 = ShareDataUIState + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020\u000bH×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;", "", "appName", "", "name", "phoneNumber", Scopes.PROFILE, "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAppName$annotations", "()V", "getAppName", "()Ljava/lang/String;", "getName$annotations", "getName", "getPhoneNumber$annotations", Constants.JS_API_GET_PHONE_NUMBER, "getProfile$annotations", "getProfile", "getText$annotations", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerSfcZuriUi_release", "$serializer", "Companion", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class MessageBody {
        public static final int $stable = 0;

        public static final Companion INSTANCE;
        private static int component4 = 1;
        private static int copy = 0;
        private static int equals = 1;
        private static int getRequestBeneficiariesState;
        private final String ShareDataUIState;
        private final String component1;
        private final String component2;
        private final String component3;
        private final String copydefault;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/zuriui/websocket/model/MessagePayload$MessageBody;", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private static int component2 = 1;
            private static int component3;

            public final KSerializer<MessageBody> serializer() {
                int i = 2 % 2;
                int i2 = component3 + 81;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                MessagePayload$MessageBody$$serializer messagePayload$MessageBody$$serializer = MessagePayload$MessageBody$$serializer.INSTANCE;
                if (i3 != 0) {
                    return messagePayload$MessageBody$$serializer;
                }
                throw null;
            }

            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public MessageBody(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                str = "ONEAPP";
                int i2 = 2 % 2;
            }
            this.component1 = str;
            if ((i & 2) == 0) {
                int i3 = copy;
                int i4 = i3 + 95;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                this.component3 = "";
                if (i5 == 0) {
                    throw null;
                }
                int i6 = i3 + 83;
                component4 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                this.component3 = str2;
            }
            int i8 = 2 % 2;
            if ((i & 4) == 0) {
                this.copydefault = "";
            } else {
                this.copydefault = str3;
            }
            if ((i & 8) == 0) {
                int i9 = component4 + 5;
                copy = i9 % 128;
                int i10 = i9 % 2;
                this.ShareDataUIState = "";
                int i11 = 2 % 2;
            } else {
                this.ShareDataUIState = str4;
            }
            if ((i & 16) == 0) {
                this.component2 = "";
            } else {
                this.component2 = str5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void write$Self$ConsumerSfcZuriUi_release(com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            /*
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody.component4
                r2 = 3
                int r1 = r1 + r2
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody.copy = r3
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L17
                boolean r1 = r7.shouldEncodeElementDefault(r8, r4)
                if (r1 == 0) goto L1e
                goto L28
            L17:
                boolean r1 = r7.shouldEncodeElementDefault(r8, r3)
                if (r1 == 0) goto L1e
                goto L28
            L1e:
                java.lang.String r1 = r6.component1
                java.lang.String r5 = "ONEAPP"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r1 != 0) goto L36
            L28:
                java.lang.String r1 = r6.component1
                r7.encodeStringElement(r8, r3, r1)
                int r1 = com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody.copy
                int r1 = r1 + 93
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody.component4 = r3
                int r1 = r1 % r0
            L36:
                boolean r1 = r7.shouldEncodeElementDefault(r8, r4)
                java.lang.String r3 = ""
                if (r1 == 0) goto L3f
                goto L47
            L3f:
                java.lang.String r1 = r6.component3
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L4c
            L47:
                java.lang.String r1 = r6.component3
                r7.encodeStringElement(r8, r4, r1)
            L4c:
                boolean r1 = r7.shouldEncodeElementDefault(r8, r0)
                if (r1 == 0) goto L53
                goto L5b
            L53:
                java.lang.String r1 = r6.copydefault
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L60
            L5b:
                java.lang.String r1 = r6.copydefault
                r7.encodeStringElement(r8, r0, r1)
            L60:
                boolean r0 = r7.shouldEncodeElementDefault(r8, r2)
                if (r0 == 0) goto L67
                goto L6f
            L67:
                java.lang.String r0 = r6.ShareDataUIState
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
                if (r0 != 0) goto L74
            L6f:
                java.lang.String r0 = r6.ShareDataUIState
                r7.encodeStringElement(r8, r2, r0)
            L74:
                r0 = 4
                boolean r1 = r7.shouldEncodeElementDefault(r8, r0)
                if (r1 == 0) goto L7c
                goto L86
            L7c:
                java.lang.String r1 = r6.component2
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                r1 = r1 ^ r4
                if (r1 == r4) goto L86
                goto L8b
            L86:
                java.lang.String r6 = r6.component2
                r7.encodeStringElement(r8, r0, r6)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload.MessageBody.write$Self$ConsumerSfcZuriUi_release(com.huawei.digitalpayment.consumer.zuriui.websocket.model.MessagePayload$MessageBody, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public MessageBody(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.component1 = str;
            this.component3 = str2;
            this.copydefault = str3;
            this.ShareDataUIState = str4;
            this.component2 = str5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public MessageBody(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            String str8;
            if ((i & 1) != 0) {
                int i2 = copy + 91;
                component4 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 29 / 0;
                }
                str6 = "ONEAPP";
            } else {
                str6 = str;
            }
            String str9 = (i & 2) != 0 ? "" : str2;
            String str10 = (i & 4) != 0 ? "" : str3;
            if ((i & 8) != 0) {
                int i4 = component4 + 7;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 0;
                }
                int i6 = 2 % 2;
                str7 = "";
            } else {
                str7 = str4;
            }
            if ((i & 16) != 0) {
                int i7 = component4 + 99;
                int i8 = i7 % 128;
                copy = i8;
                if (i7 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i9 = i8 + 125;
                component4 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 / 4;
                } else {
                    int i11 = 2 % 2;
                }
                str8 = "";
            } else {
                str8 = str5;
            }
            this(str6, str9, str10, str7, str8);
        }

        public final String getAppName() {
            int i = 2 % 2;
            int i2 = copy + 69;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = component4 + 107;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getPhoneNumber() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 33;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 115;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String getProfile() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 93;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.ShareDataUIState;
            int i4 = i2 + 115;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String getText() {
            int i = 2 % 2;
            int i2 = copy + 45;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            INSTANCE = new Companion(defaultConstructorMarker);
            int i = getRequestBeneficiariesState + 109;
            equals = i % 128;
            if (i % 2 != 0) {
                return;
            }
            defaultConstructorMarker.hashCode();
            throw null;
        }

        public MessageBody() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static MessageBody copy$default(MessageBody messageBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = messageBody.component1;
                int i3 = copy + 9;
                component4 = i3 % 128;
                int i4 = i3 % 2;
            }
            String str6 = str;
            if ((i & 2) != 0) {
                str2 = messageBody.component3;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                int i5 = copy + 53;
                component4 = i5 % 128;
                if (i5 % 2 == 0) {
                    String str8 = messageBody.copydefault;
                    throw null;
                }
                str3 = messageBody.copydefault;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                int i6 = copy + 113;
                component4 = i6 % 128;
                if (i6 % 2 == 0) {
                    String str10 = messageBody.ShareDataUIState;
                    throw null;
                }
                str4 = messageBody.ShareDataUIState;
            }
            String str11 = str4;
            if ((i & 16) != 0) {
                str5 = messageBody.component2;
                int i7 = component4 + 25;
                copy = i7 % 128;
                int i8 = i7 % 2;
            }
            return messageBody.copy(str6, str7, str9, str11, str5);
        }

        @SerialName("appName")
        public static void getAppName$annotations() {
            int i = 2 % 2;
            int i2 = component4 + 91;
            copy = i2 % 128;
            int i3 = i2 % 2;
        }

        @SerialName("name")
        public static void getName$annotations() {
            int i = 2 % 2;
            int i2 = component4 + 43;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
        }

        @SerialName("phoneNumber")
        public static void getPhoneNumber$annotations() {
            int i = 2 % 2;
            int i2 = copy + 111;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }

        @SerialName(Scopes.PROFILE)
        public static void getProfile$annotations() {
            int i = 2 % 2;
            int i2 = component4 + 63;
            copy = i2 % 128;
            int i3 = i2 % 2;
        }

        @SerialName("text")
        public static void getText$annotations() {
            int i = 2 % 2;
            int i2 = component4 + 59;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copy + 87;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 9;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copy + 47;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component3;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 97;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 31;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copy + 3;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.ShareDataUIState;
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return str;
        }

        public final String component5() {
            int i = 2 % 2;
            int i2 = component4 + 15;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 37;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final MessageBody copy(String appName, String name, String phoneNumber, String profile, String text) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(appName, "");
            Intrinsics.checkNotNullParameter(name, "");
            Intrinsics.checkNotNullParameter(phoneNumber, "");
            Intrinsics.checkNotNullParameter(profile, "");
            Intrinsics.checkNotNullParameter(text, "");
            MessageBody messageBody = new MessageBody(appName, name, phoneNumber, profile, text);
            int i2 = component4 + 25;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return messageBody;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copy + 7;
                component4 = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(other instanceof MessageBody)) {
                int i3 = component4 + 125;
                copy = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            MessageBody messageBody = (MessageBody) other;
            if (!Intrinsics.areEqual(this.component1, messageBody.component1)) {
                int i5 = copy + 13;
                component4 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.component3, messageBody.component3)) {
                int i7 = copy + 23;
                component4 = i7 % 128;
                return i7 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.copydefault, messageBody.copydefault)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, messageBody.ShareDataUIState)) {
                int i8 = copy + 79;
                component4 = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component2, messageBody.component2))) {
                return true;
            }
            int i10 = copy + 113;
            component4 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component4 + 87;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((this.component1.hashCode() * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component2.hashCode();
            int i4 = copy + 5;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MessageBody(appName=" + this.component1 + ", name=" + this.component3 + ", phoneNumber=" + this.copydefault + ", profile=" + this.ShareDataUIState + ", text=" + this.component2 + ')';
            int i2 = copy + 33;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return str;
        }
    }

    public MessagePayload(MessageBody messageBody) {
        Intrinsics.checkNotNullParameter(messageBody, "");
        this.component3 = messageBody;
    }

    public final MessageBody getBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MessageBody messageBody = this.component3;
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return messageBody;
    }

    static {
        int i = component2 + 105;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static MessagePayload copy$default(MessagePayload messagePayload, MessageBody messageBody, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 93;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 == 0) {
                MessageBody messageBody2 = messagePayload.component3;
                throw null;
            }
            messageBody = messagePayload.component3;
            int i5 = i4 + 75;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return messagePayload.copy(messageBody);
    }

    @SerialName("message")
    public static void getBody$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final MessageBody component1() {
        MessageBody messageBody;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            messageBody = this.component3;
            int i4 = 46 / 0;
        } else {
            messageBody = this.component3;
        }
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return messageBody;
    }

    public final MessagePayload copy(MessageBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(body, "");
        MessagePayload messagePayload = new MessagePayload(body);
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return messagePayload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this != other) {
            if (other instanceof MessagePayload) {
                return Intrinsics.areEqual(this.component3, ((MessagePayload) other).component3);
            }
            int i6 = i2 + 73;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 83;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i4 + 91;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        int i4 = copydefault + 33;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MessagePayload(body=" + this.component3 + ')';
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
