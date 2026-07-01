package com.safaricom.consumer.commons.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0004\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\f\u0010\f\u001a\u00020\t*\u00020\tH\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/safaricom/consumer/commons/util/TextResource;", "Landroid/os/Parcelable;", "<init>", "()V", "toLowerCase", "", "getToLowerCase", "()Z", "getValue", "", "context", "Landroid/content/Context;", "checkIfApplyLowerCase", "Companion", "Contextual", "Complete", "Formatted", "Lcom/safaricom/consumer/commons/util/TextResource$Complete;", "Lcom/safaricom/consumer/commons/util/TextResource$Contextual;", "Lcom/safaricom/consumer/commons/util/TextResource$Formatted;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TextResource implements Parcelable {

    public static final Companion INSTANCE;
    private static final TextResource empty;
    private final boolean toLowerCase;

    public abstract String getValue(Context context);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u001d\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086\u0002J6\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0010\"\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086\u0002¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/consumer/commons/util/TextResource$Companion;", "", "<init>", "()V", "empty", "Lcom/safaricom/consumer/commons/util/TextResource;", "getEmpty", "()Lcom/safaricom/consumer/commons/util/TextResource;", BridgeDSL.INVOKE, "text", "", "toLowerCase", "", GriverCacheDao.COLUMN_CACHE_ID, "", "formatArgs", "", "(I[Lcom/safaricom/consumer/commons/util/TextResource;Z)Lcom/safaricom/consumer/commons/util/TextResource;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final TextResource getEmpty() {
            return TextResource.empty;
        }

        public static TextResource invoke$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(str, z);
        }

        public final TextResource invoke(String text, boolean toLowerCase) {
            Intrinsics.checkNotNullParameter(text, "");
            return new Complete(text, toLowerCase);
        }

        public static TextResource invoke$default(Companion companion, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return companion.invoke(i, z);
        }

        public final TextResource invoke(int id, boolean toLowerCase) {
            return new Contextual(id, toLowerCase);
        }

        public static TextResource invoke$default(Companion companion, int i, TextResource[] textResourceArr, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = false;
            }
            return companion.invoke(i, textResourceArr, z);
        }

        public final TextResource invoke(int id, TextResource[] formatArgs, boolean toLowerCase) {
            Intrinsics.checkNotNullParameter(formatArgs, "");
            return new Formatted(id, (TextResource[]) Arrays.copyOf(formatArgs, formatArgs.length), toLowerCase);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TextResource() {
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        empty = new Complete("", false, 2, defaultConstructorMarker);
    }

    protected boolean getToLowerCase() {
        return this.toLowerCase;
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÄ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/safaricom/consumer/commons/util/TextResource$Contextual;", "Lcom/safaricom/consumer/commons/util/TextResource;", GriverCacheDao.COLUMN_CACHE_ID, "", "toLowerCase", "", "<init>", "(IZ)V", "getId", "()I", "getToLowerCase", "()Z", "getValue", "", "context", "Landroid/content/Context;", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Contextual extends TextResource {
        public static final Parcelable.Creator<Contextual> CREATOR = new Creator();
        private final int id;
        private final boolean toLowerCase;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Contextual> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Contextual createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Contextual(parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Contextual[] newArray(int i) {
                return new Contextual[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public Contextual(int i, boolean z) {
            super(null);
            this.id = i;
            this.toLowerCase = z;
        }

        public Contextual(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z);
        }

        public final int getId() {
            return this.id;
        }

        @Override
        protected boolean getToLowerCase() {
            return this.toLowerCase;
        }

        @Override
        public String getValue(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            String string = context.getString(this.id);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return checkIfApplyLowerCase(string);
        }

        public static Contextual copy$default(Contextual contextual, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = contextual.id;
            }
            if ((i2 & 2) != 0) {
                z = contextual.toLowerCase;
            }
            return contextual.copy(i, z);
        }

        public final int getId() {
            return this.id;
        }

        protected final boolean getToLowerCase() {
            return this.toLowerCase;
        }

        public final Contextual copy(int id, boolean toLowerCase) {
            return new Contextual(id, toLowerCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contextual)) {
                return false;
            }
            Contextual contextual = (Contextual) other;
            return this.id == contextual.id && this.toLowerCase == contextual.toLowerCase;
        }

        public int hashCode() {
            return (Integer.hashCode(this.id) * 31) + Boolean.hashCode(this.toLowerCase);
        }

        public String toString() {
            return "Contextual(id=" + this.id + ", toLowerCase=" + this.toLowerCase + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(this.id);
            dest.writeInt(this.toLowerCase ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÄ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/safaricom/consumer/commons/util/TextResource$Complete;", "Lcom/safaricom/consumer/commons/util/TextResource;", "text", "", "toLowerCase", "", "<init>", "(Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getToLowerCase", "()Z", "getValue", "context", "Landroid/content/Context;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Complete extends TextResource {
        public static final Parcelable.Creator<Complete> CREATOR = new Creator();
        private final String text;
        private final boolean toLowerCase;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Complete> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Complete createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Complete(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Complete[] newArray(int i) {
                return new Complete[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
            this.toLowerCase = z;
        }

        public Complete(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String getText() {
            return this.text;
        }

        @Override
        protected boolean getToLowerCase() {
            return this.toLowerCase;
        }

        @Override
        public String getValue(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return checkIfApplyLowerCase(this.text);
        }

        public static Complete copy$default(Complete complete, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = complete.text;
            }
            if ((i & 2) != 0) {
                z = complete.toLowerCase;
            }
            return complete.copy(str, z);
        }

        public final String getText() {
            return this.text;
        }

        protected final boolean getToLowerCase() {
            return this.toLowerCase;
        }

        public final Complete copy(String text, boolean toLowerCase) {
            Intrinsics.checkNotNullParameter(text, "");
            return new Complete(text, toLowerCase);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return Intrinsics.areEqual(this.text, complete.text) && this.toLowerCase == complete.toLowerCase;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + Boolean.hashCode(this.toLowerCase);
        }

        public String toString() {
            return "Complete(text=" + this.text + ", toLowerCase=" + this.toLowerCase + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.text);
            dest.writeInt(this.toLowerCase ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0007HÄ\u0003J2\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0012HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/safaricom/consumer/commons/util/TextResource$Formatted;", "Lcom/safaricom/consumer/commons/util/TextResource;", GriverCacheDao.COLUMN_CACHE_ID, "", "formatArgs", "", "toLowerCase", "", "<init>", "(I[Lcom/safaricom/consumer/commons/util/TextResource;Z)V", "getId", "()I", "getFormatArgs", "()[Lcom/safaricom/consumer/commons/util/TextResource;", "[Lcom/safaricom/consumer/commons/util/TextResource;", "getToLowerCase", "()Z", "getValue", "", "context", "Landroid/content/Context;", "equals", "other", "", "component1", "component2", "component3", "copy", "(I[Lcom/safaricom/consumer/commons/util/TextResource;Z)Lcom/safaricom/consumer/commons/util/TextResource$Formatted;", "describeContents", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Formatted extends TextResource {
        public static final Parcelable.Creator<Formatted> CREATOR = new Creator();
        private final TextResource[] formatArgs;
        private final int id;
        private final boolean toLowerCase;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Formatted> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final Formatted createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                TextResource[] textResourceArr = new TextResource[i2];
                for (int i3 = 0; i3 != i2; i3++) {
                    textResourceArr[i3] = parcel.readParcelable(Formatted.class.getClassLoader());
                }
                return new Formatted(i, textResourceArr, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Formatted[] newArray(int i) {
                return new Formatted[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Formatted(int i, TextResource[] textResourceArr, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(textResourceArr, "");
            this.id = i;
            this.formatArgs = textResourceArr;
            this.toLowerCase = z;
        }

        public Formatted(int i, TextResource[] textResourceArr, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, textResourceArr, (i2 & 4) != 0 ? false : z);
        }

        public final TextResource[] getFormatArgs() {
            return this.formatArgs;
        }

        public final int getId() {
            return this.id;
        }

        @Override
        protected boolean getToLowerCase() {
            return this.toLowerCase;
        }

        @Override
        public String getValue(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            TextResource[] textResourceArr = this.formatArgs;
            ArrayList arrayList = new ArrayList(textResourceArr.length);
            for (TextResource textResource : textResourceArr) {
                arrayList.add(textResource.getValue(context));
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String string = context.getString(this.id, Arrays.copyOf(strArr, strArr.length));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return checkIfApplyLowerCase(string);
        }

        public boolean equals(Object other) {
            if (!(other instanceof Formatted)) {
                return super.equals(other);
            }
            Formatted formatted = (Formatted) other;
            return this.id == formatted.id && Arrays.equals(this.formatArgs, formatted.formatArgs);
        }

        public static Formatted copy$default(Formatted formatted, int i, TextResource[] textResourceArr, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = formatted.id;
            }
            if ((i2 & 2) != 0) {
                textResourceArr = formatted.formatArgs;
            }
            if ((i2 & 4) != 0) {
                z = formatted.toLowerCase;
            }
            return formatted.copy(i, textResourceArr, z);
        }

        public final int getId() {
            return this.id;
        }

        public final TextResource[] getFormatArgs() {
            return this.formatArgs;
        }

        protected final boolean getToLowerCase() {
            return this.toLowerCase;
        }

        public final Formatted copy(int id, TextResource[] formatArgs, boolean toLowerCase) {
            Intrinsics.checkNotNullParameter(formatArgs, "");
            return new Formatted(id, formatArgs, toLowerCase);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.id) * 31) + Arrays.hashCode(this.formatArgs)) * 31) + Boolean.hashCode(this.toLowerCase);
        }

        public String toString() {
            return "Formatted(id=" + this.id + ", formatArgs=" + Arrays.toString(this.formatArgs) + ", toLowerCase=" + this.toLowerCase + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(this.id);
            TextResource[] textResourceArr = this.formatArgs;
            int length = textResourceArr.length;
            dest.writeInt(length);
            for (int i = 0; i != length; i++) {
                dest.writeParcelable(textResourceArr[i], flags);
            }
            dest.writeInt(this.toLowerCase ? 1 : 0);
        }
    }

    protected final String checkIfApplyLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!getToLowerCase()) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public TextResource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
